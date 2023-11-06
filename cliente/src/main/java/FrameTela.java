
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
        jPanel1 = new javax.swing.JPanel();
        panelDiagnostico = new javax.swing.JScrollPane();
        textDiagnostico = new javax.swing.JTextArea();
        labelDiagnostico = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        btnNovo = new javax.swing.JButton();
        btnGerar = new javax.swing.JButton();
        btnDecem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("Sistema de Diagnostico");

        labelInforme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelInforme.setText("Informe os sintomas do paciente:");

        textDiagnostico.setColumns(20);
        textDiagnostico.setRows(5);
        textDiagnostico.setEnabled(false);
        panelDiagnostico.setViewportView(textDiagnostico);

        labelDiagnostico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDiagnostico.setText("Diagnostico:");

        btnSave.setBackground(new java.awt.Color(61, 117, 229));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SALVAR");
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDiagnostico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDiagnostico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        btnLimpar.setBackground(new java.awt.Color(210, 48, 48));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("LIMPAR CAMPOS");
        btnLimpar.setBorderPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        radio0.setText("Dor de cabeça");

        radio1.setText("Febre");

        radio2.setText("Vômito");

        radio3.setText("Diarreia");
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rS3ActionPerformed(evt);
            }
        });

        radio4.setText("Erupção cutânea");
        radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rS4ActionPerformed(evt);
            }
        });

        radio5.setText("Dor de garganta");

        radio6.setText("Náusea");

        radio7.setText("Dor abdominal");
        radio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rS7ActionPerformed(evt);
            }
        });

        radio8.setText("Fadiga");
        radio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rS8ActionPerformed(evt);
            }
        });

        radio9.setText("Tosse");
        radio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rS9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio0)
                            .addComponent(radio5)
                            .addComponent(radio9))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio1)
                            .addComponent(radio6)
                            .addComponent(radio4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio2)
                            .addComponent(radio7)
                            .addComponent(radio8)))
                    .addComponent(radio3))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio0)
                    .addComponent(radio2)
                    .addComponent(radio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio5)
                    .addComponent(radio6)
                    .addComponent(radio7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio9)
                    .addComponent(radio4)
                    .addComponent(radio8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        btnNovo.setText("INICIAR NOVO DIAGNOSTICO");
        btnNovo.setEnabled(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnGerar.setBackground(new java.awt.Color(61, 117, 229));
        btnGerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGerar.setText("GERAR DIAGNOSTICO");
        btnGerar.setBorderPainted(false);
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnDecem.setBackground(new java.awt.Color(61, 117, 229));
        btnDecem.setForeground(new java.awt.Color(255, 255, 255));
        btnDecem.setText("DIAGNOSTICO DECEM");
        btnDecem.setBorderPainted(false);
        btnDecem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGerar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnDecem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo)
                            .addComponent(labelInforme)
                            .addComponent(labelTitulo))
                        .addContainerGap(748, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelInforme)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDecem)))
                        .addGap(18, 18, 18)
                        .addComponent(btnGerar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(btnNovo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void rS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rS4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rS4ActionPerformed

    private void rS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rS9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rS9ActionPerformed

    private void rS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rS3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rS3ActionPerformed

    private void rS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rS7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rS7ActionPerformed

    private void rS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rS8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rS8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnDecem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
