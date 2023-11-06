
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Servidor {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running.");

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {

        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        //LISTA TODOS OS PACIENTES
        public void lista_pacientes(ObjectOutputStream oos) throws IOException {
            for (Paciente paciente : pacientes) {
                oos.writeObject("Sintomas: " + paciente.getSintomas() + " | Diagnóstico: " + paciente.getDiagnostico());
            }
            oos.writeObject(null);
            oos.flush();
        }

        //LISTA TODOS OS PACIENTES QUE TEM X DIAGNOSTICO
        public void lista_pacientes_por_diagnostico(ObjectOutputStream oos, String tipoDiagnostico) throws IOException {
            boolean pacientesEncontrados = false;

            for (Paciente paciente : pacientes) {
                if (paciente.getDiagnostico().equals(tipoDiagnostico)) {
                    oos.writeObject("Sintomas: " + paciente.getSintomas() + " | Diagnóstico: " + paciente.getDiagnostico());
                    pacientesEncontrados = true;
                }
            }

            if (!pacientesEncontrados) {
                System.out.println("Nenhum paciente encontrado com o diagnóstico: " + tipoDiagnostico);
                oos.writeObject("Nenhum paciente encontrado com o diagnóstico: " + tipoDiagnostico);
            }

            oos.writeObject(null);
            oos.flush();
        }

        //ALGORITMO WISARD
        private static String wisard_diagnostico(String[] sintomas) {
            List<String> conjuntoSintomas = Arrays.asList(sintomas);
            String diagnostico = "";
            
            if (conjuntoSintomas.size() == 10) {
                diagnostico = "Procure um medico urgentemente";
                return diagnostico;
            }

            //TREINAMENTO
            Map<List<String>, String> regrasDiagnostico = new HashMap<>();
            regrasDiagnostico.put(Arrays.asList("Tosse", "Febre"), "Gripe");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Febre"), "Resfriado Comum");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Náusea", "Diarreia"), "Envenenamento Alimentar");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Dor de garganta", "Vômito"), "Enxaqueca");
            regrasDiagnostico.put(Arrays.asList("Náusea", "Diarreia", "Fadiga"), "Gastroenterite");
            regrasDiagnostico.put(Arrays.asList("Febre", "Dor de garganta"), "Amigdalite");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça"), "Enxaqueca");
            regrasDiagnostico.put(Arrays.asList("Fadiga"), "Cansaço");
            regrasDiagnostico.put(Arrays.asList("Tosse", "Febre", "Fadiga"), "Gripe");
            regrasDiagnostico.put(Arrays.asList("Erupção cutânea", "Febre"), "Sarampo");
            regrasDiagnostico.put(Arrays.asList("Dor abdominal", "Náusea", "Diarreia"), "Gastroenterite");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Náusea"), "Enxaqueca");
            
            regrasDiagnostico.put(Arrays.asList("Tosse", "Febre"), "Gripe");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Febre"), "Resfriado Comum");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Náusea", "Diarreia"), "Envenenamento Alimentar");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Dor de garganta", "Vômito"), "Enxaqueca");
            regrasDiagnostico.put(Arrays.asList("Náusea", "Diarreia", "Fadiga"), "Gastroenterite");
            regrasDiagnostico.put(Arrays.asList("Febre", "Dor de garganta"), "Amigdalite");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça"), "Enxaqueca");
            regrasDiagnostico.put(Arrays.asList("Fadiga"), "Cansaço");
            regrasDiagnostico.put(Arrays.asList("Tosse", "Febre", "Fadiga"), "Gripe");
            regrasDiagnostico.put(Arrays.asList("Erupção cutânea", "Febre"), "Sarampo");
            regrasDiagnostico.put(Arrays.asList("Dor abdominal", "Náusea", "Diarreia"), "Gastroenterite");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Náusea"), "Enxaqueca");
            
            regrasDiagnostico.put(Arrays.asList("Tosse", "Febre"), "Gripe");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Febre"), "Resfriado Comum");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Náusea", "Diarreia"), "Envenenamento Alimentar");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Dor de garganta", "Vômito"), "Enxaqueca");
            regrasDiagnostico.put(Arrays.asList("Náusea", "Diarreia", "Fadiga"), "Gastroenterite");
            regrasDiagnostico.put(Arrays.asList("Febre", "Dor de garganta"), "Amigdalite");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça"), "Enxaqueca");
            regrasDiagnostico.put(Arrays.asList("Fadiga"), "Cansaço");
            regrasDiagnostico.put(Arrays.asList("Tosse", "Febre", "Fadiga"), "Gripe");
            regrasDiagnostico.put(Arrays.asList("Erupção cutânea", "Febre"), "Sarampo");
            regrasDiagnostico.put(Arrays.asList("Dor abdominal", "Náusea", "Diarreia"), "Gastroenterite");
            regrasDiagnostico.put(Arrays.asList("Dor de cabeça", "Náusea"), "Enxaqueca");

            int maxMatches = 0;
            for (Map.Entry<List<String>, String> entry : regrasDiagnostico.entrySet()) {
                List<String> regraSintomas = entry.getKey();
                int matches = 0;
                for (String sintoma : conjuntoSintomas) {
                    if (regraSintomas.contains(sintoma)) {
                        matches++;
                    }
                }
                if (matches > maxMatches) {
                    maxMatches = matches;
                    diagnostico = entry.getValue();
                }
            }

            if (maxMatches == 0) {
                diagnostico = "Indisponivel";
            }

            return diagnostico;
        }

        @Override
        public void run() {
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                while (true) {
                    Object inputObject = ois.readObject();
                    if (inputObject instanceof String) {
                        String command = (String) inputObject;
                        if (command.equals("listar")) { //LISTA TODOS
                            lista_pacientes(oos);
                            oos.flush();
                            break;
                        } else if (command.equals("pesquisar")) { //LISTA COM X DIAGNOSTICO
                            String tipoDiagnostico = (String) ois.readObject();
                            lista_pacientes_por_diagnostico(oos, tipoDiagnostico);
                            oos.flush();
                            break;
                        } else if (command.equals("decem")) { //GERA DIAGNOSTICO COM BASE NO WISARD
                            try {
                                String[] sintomas = (String[]) ois.readObject();
                                String diagnostico = wisard_diagnostico(sintomas);
                                oos.writeObject(diagnostico);
                                oos.flush();
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    } else if (inputObject instanceof Paciente) {
                        Paciente patient = (Paciente) inputObject;
                        pacientes.add(patient);

                        oos.writeObject("Data received and stored successfully.");
                        oos.flush();
                        break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }
}
