import java.io.*;
import java.net.Socket;
import javax.swing.UIManager;

public class Cliente {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            
            // MUDAR LOOK AND FEEL
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    // System.out.println( info.getName() );
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
            
            //ABRIR JANELA
            FrameTela frame = new FrameTela();
            frame.setVisible(true);

            oos.close();
            ois.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}