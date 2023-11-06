
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class FrameTela extends javax.swing.JFrame {

    private final Toolkit tk = Toolkit.getDefaultToolkit();
    private final Dimension screenSize = tk.getScreenSize();

    public FrameTela() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.setSize(screenSize);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setTitle("Decem - Medicine Registry");
        btnSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelInforme = new javax.swing.JLabel();
            radio0 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio5 = new javax.swing.JRadioButton();
        radio6 = new javax.swing.JRadioButton();
        radio7 = new javax.swing.JRadioButton();
        radio8 = new javax.swing.JRadioButton();
        radio9 = new javax.swing.JRadioButton();
        btnGerar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        panelDiagnostico = new javax.swing.JScrollPane();
        textDiagnostico = new javax.swing.JTextArea();
        labelDiagnostico = new javax.swing.JLabel();
        btnDecem = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("Sistema de Diagnostico");

        labelInforme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelInforme.setText("Informe os sintomas do paciente:");

        radio0.setText("Dor de cabeça");

        radio1.setText("Febre");

        radio2.setText("Vômito");

        radio3.setText("Diarreia");

        radio4.setText("Erupção cutânea");

        radio5.setText("Dor de garganta");

        radio6.setText("Náusea");

        radio7.setText("Dor abdominal");

        radio8.setText("Fadiga");

        radio9.setText("Tosse");

        btnGerar.setBackground(new java.awt.Color(61, 117, 229));
        btnGerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGerar.setText("GERAR DIAGNOSTICO");
        btnGerar.setBorderPainted(false);
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(210, 48, 48));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("LIMPAR CAMPOS");
        btnLimpar.setBorderPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        textDiagnostico.setColumns(20);
        textDiagnostico.setRows(5);
        textDiagnostico.setEnabled(false);
        panelDiagnostico.setViewportView(textDiagnostico);

        labelDiagnostico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDiagnostico.setText("Diagnostico:");

        btnDecem.setBackground(new java.awt.Color(61, 117, 229));
        btnDecem.setForeground(new java.awt.Color(255, 255, 255));
        btnDecem.setText("DIAGNOSTICO DECEM");
        btnDecem.setBorderPainted(false);
        btnDecem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecemActionPerformed(evt);
            }
        });

        btnNovo.setText("INICIAR NOVO DIAGNOSTICO");
        btnNovo.setEnabled(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(61, 117, 229));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SALVAR");
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnGerar)
                            .addGap(50, 50, 50)
                            .addComponent(btnDecem)
                            .addGap(50, 50, 50)
                            .addComponent(btnLimpar)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelInforme)
                                    .addGap(399, 399, 399))
                                .addComponent(labelTitulo))
                            .addGap(224, 224, 224)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDiagnostico)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDiagnostico)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio0)
                                            .addComponent(radio5))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio1)
                                            .addComponent(radio6))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio2)
                                            .addComponent(radio7))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio3)
                                            .addComponent(radio8))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radio9)
                                            .addComponent(radio4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNovo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSave)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelInforme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio0)
                            .addComponent(radio2)
                            .addComponent(radio3)
                            .addComponent(radio1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio5)
                            .addComponent(radio7)
                            .addComponent(radio8)
                            .addComponent(radio6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radio4)
                        .addGap(22, 22, 22)
                        .addComponent(radio9)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar)
                    .addComponent(btnLimpar)
                    .addComponent(btnDecem))
                .addGap(20, 20, 20)
                .addComponent(labelDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSave))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VERIFICA SE NAO HA RADIOS HABILITADOS
    private boolean esta_selecionado() {
        boolean selecionado = false;

        if (!(radio0.isSelected() | radio1.isSelected() | radio2.isSelected()
                | radio3.isSelected() | radio4.isSelected() | radio5.isSelected()
                | radio6.isSelected() | radio7.isSelected() | radio8.isSelected()
                | radio9.isSelected())) {
            selecionado = false;
            return false;
        }

        return true;
    }

    //LIMPA RADIOS
    private void limpa_sintomas() {
        radio0.setSelected(false);
        radio2.setSelected(false);
        radio3.setSelected(false);
        radio1.setSelected(false);
        radio4.setSelected(false);
        radio5.setSelected(false);
        radio7.setSelected(false);
        radio8.setSelected(false);
        radio6.setSelected(false);
        radio9.setSelected(false);
    }

    //DESABILITA RADIOS
    private void disable_sintomas() {
        radio0.setEnabled(false);
        radio2.setEnabled(false);
        radio3.setEnabled(false);
        radio1.setEnabled(false);
        radio4.setEnabled(false);
        radio5.setEnabled(false);
        radio7.setEnabled(false);
        radio8.setEnabled(false);
        radio6.setEnabled(false);
        radio9.setEnabled(false);
    }

    //HABILITA RADIOS
    private void enable_sintomas() {
        radio0.setEnabled(true);
        radio2.setEnabled(true);
        radio3.setEnabled(true);
        radio1.setEnabled(true);
        radio4.setEnabled(true);
        radio5.setEnabled(true);
        radio7.setEnabled(true);
        radio8.setEnabled(true);
        radio6.setEnabled(true);
        radio9.setEnabled(true);
    }

    //GERA O DIAGNOSTICO COM BASE NAS COMBINACOES DEFINIDAS
    private void diagnostico_manual() {
        if (radio0.isSelected() && radio1.isSelected() && radio2.isSelected()
                && radio3.isSelected() && radio4.isSelected() && radio5.isSelected()
                && radio6.isSelected() && radio7.isSelected() && radio8.isSelected()
                && radio9.isSelected()) {
            textDiagnostico.setText("Um médico deve ser consultado");
        } else if (radio0.isSelected() && radio5.isSelected() && radio2.isSelected()) {
            textDiagnostico.setText("Enxaqueca");
        } else if (radio6.isSelected() && radio3.isSelected() && radio8.isSelected()) {
            textDiagnostico.setText("Gastroenterite");
        } else if (radio9.isSelected() && radio5.isSelected() && radio2.isSelected()
                && radio6.isSelected() && radio3.isSelected()) {
            textDiagnostico.setText("Infecção Respiratória");
        } else if (radio0.isSelected() && radio1.isSelected()
                && radio5.isSelected() && radio6.isSelected()) {
            textDiagnostico.setText("Covid"); //D5
        } else if (radio1.isSelected() && radio9.isSelected() && radio5.isSelected()) {
            textDiagnostico.setText("Resfriado Comum");
        } else {
            textDiagnostico.setText("Nâo foi possível diagnosticar");
        }
    }

    //GERA UMA STRING COM OS SINTOMAS
    private String get_conjunto_sintomas() {
        String conjSintomas = "";

        if (radio0.isSelected()) {
            conjSintomas += radio0.getText() + ", ";
        }
        if (radio1.isSelected()) {
            conjSintomas += radio1.getText() + ", ";
        }
        if (radio2.isSelected()) {
            conjSintomas += radio2.getText() + ", ";
        }
        if (radio3.isSelected()) {
            conjSintomas += radio3.getText() + ", ";
        }
        if (radio4.isSelected()) {
            conjSintomas += radio4.getText() + ", ";
        }
        if (radio5.isSelected()) {
            conjSintomas += radio5.getText() + ", ";
        }
        if (radio6.isSelected()) {
            conjSintomas += radio6.getText() + ", ";
        }
        if (radio7.isSelected()) {
            conjSintomas += radio7.getText() + ", ";
        }
        if (radio8.isSelected()) {
            conjSintomas += radio8.getText() + ", ";
        }
        if (radio9.isSelected()) {
            conjSintomas += radio9.getText() + ", ";
        }

        return conjSintomas;
    }

    private String[] obterSintomasSelecionados() {
        ArrayList<String> sintomasSelecionados = new ArrayList<>();

        if (radio0.isSelected()) {
            sintomasSelecionados.add(radio0.getText());
        }
        if (radio1.isSelected()) {
            sintomasSelecionados.add(radio1.getText());
        }
        if (radio2.isSelected()) {
            sintomasSelecionados.add(radio2.getText());
        }
        if (radio3.isSelected()) {
            sintomasSelecionados.add(radio3.getText());
        }
        if (radio4.isSelected()) {
            sintomasSelecionados.add(radio4.getText());
        }
        if (radio5.isSelected()) {
            sintomasSelecionados.add(radio5.getText());
        }
        if (radio6.isSelected()) {
            sintomasSelecionados.add(radio6.getText());
        }
        if (radio7.isSelected()) {
            sintomasSelecionados.add(radio7.getText());
        }
        if (radio8.isSelected()) {
            sintomasSelecionados.add(radio8.getText());
        }
        if (radio9.isSelected()) {
            sintomasSelecionados.add(radio9.getText());
        }

        return sintomasSelecionados.toArray(new String[0]);
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpa_sintomas();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        boolean info = esta_selecionado();

        if (info) {
            labelInforme.setForeground(Color.black);
            btnNovo.setEnabled(true);
            disable_sintomas();
            diagnostico_manual();
            btnLimpar.setEnabled(false);
            btnGerar.setEnabled(false);
            btnSave.setEnabled(true);
            btnDecem.setEnabled(false);
        } else {
            labelInforme.setForeground(Color.cyan);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpa_sintomas();
        enable_sintomas();
        textDiagnostico.setText("");
        btnLimpar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnGerar.setEnabled(true);
        btnSave.setEnabled(false);
        btnDecem.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String sintomas = get_conjunto_sintomas();

        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            if (oos != null && ois != null) {
                String diagnostico = textDiagnostico.getText();
                Paciente patient = new Paciente(sintomas, diagnostico);
                oos.writeObject(patient);

                String response = (String) ois.readObject();
                System.out.println(response);
            } else {
                System.out.println("Erro ao estabelecer conexão com o servidor.");
            }

            ois.close();
            oos.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDecemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecemActionPerformed
        try {
            String[] sintomasSelecionados = obterSintomasSelecionados();

            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            oos.writeObject("decem");
            oos.writeObject(sintomasSelecionados);

            String response = (String) ois.readObject();
            textDiagnostico.setText(response);

            oos.close();
            ois.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        btnDecem.setEnabled(false);
        btnGerar.setEnabled(false);
        btnLimpar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnDecemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnDecem;
    private javax.swing.JLabel labelDiagnostico;
    private javax.swing.JLabel labelInforme;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JScrollPane panelDiagnostico;
    private javax.swing.JRadioButton radio0;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio5;
    private javax.swing.JRadioButton radio6;
    private javax.swing.JRadioButton radio7;
    private javax.swing.JRadioButton radio8;
    private javax.swing.JRadioButton radio9;
    private javax.swing.JTextArea textDiagnostico;
    // End of variables declaration//GEN-END:variables
}
