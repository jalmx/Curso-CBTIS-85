/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leydeohm;

import javax.swing.JOptionPane;

/**
 *
 * @author VAIO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        buttonGroup1.add(radioVoltaje);
        buttonGroup1.add(radioCorriente);
        buttonGroup1.add(radioResistencia);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioVoltaje = new javax.swing.JRadioButton();
        radioResistencia = new javax.swing.JRadioButton();
        radioCorriente = new javax.swing.JRadioButton();
        etiquetaValor1 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        etiquetaValor2 = new javax.swing.JLabel();
        campo2 = new javax.swing.JTextField();
        etiquetaUnidad1 = new javax.swing.JLabel();
        etiquetaUnidad2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        etiquetaResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Ley de Ohm");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LEY DE OHM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calcular"));

        radioVoltaje.setSelected(true);
        radioVoltaje.setText("Voltaje");
        radioVoltaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVoltajeActionPerformed(evt);
            }
        });

        radioResistencia.setText("Resistencia");
        radioResistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioResistenciaActionPerformed(evt);
            }
        });

        radioCorriente.setText("Corriente");
        radioCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCorrienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioVoltaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(radioCorriente)
                .addGap(61, 61, 61)
                .addComponent(radioResistencia)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioVoltaje)
                    .addComponent(radioCorriente)
                    .addComponent(radioResistencia)))
        );

        etiquetaValor1.setText("Corriente");

        etiquetaValor2.setText("Resistencia");

        etiquetaUnidad1.setText("Amps");

        etiquetaUnidad2.setText("Ohms");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etiquetaResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaResultado.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo2)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaUnidad1)
                            .addComponent(etiquetaUnidad2)))
                    .addComponent(etiquetaResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaValor1)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaUnidad1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaValor2)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaUnidad2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(etiquetaResultado)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (radioVoltaje.isSelected()) {
                String valor1 = campo1.getText();
                double corriente = Double.parseDouble(valor1);
                String valor2 = campo2.getText();
                double resistencia = Double.parseDouble(valor2);

                double voltaje = corriente * resistencia;

                etiquetaResultado.setText(String.format("%.2f V", voltaje));
            }

            if (radioCorriente.isSelected()) {
                String valor1 = campo1.getText();
                double voltaje = Double.parseDouble(valor1);
                String valor2 = campo2.getText();
                double resistencia = Double.parseDouble(valor2);

                double corriente = voltaje / resistencia;

                etiquetaResultado.setText(String.format("%.2f A", corriente));
            }
            if (radioResistencia.isSelected()) {
                String valor1 = campo1.getText();
                double voltaje = Double.parseDouble(valor1);
                String valor2 = campo2.getText();
                double corriente = Double.parseDouble(valor2);

                double resistencia = voltaje / corriente;

                etiquetaResultado.setText(String.format("%.2f Ohms", resistencia));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Valor invalido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioVoltajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVoltajeActionPerformed
        etiquetaValor1.setText("Corriente");
        etiquetaValor2.setText("Resistencia");

        etiquetaUnidad1.setText("Amp");
        etiquetaUnidad2.setText("Ohms");
    }//GEN-LAST:event_radioVoltajeActionPerformed

    private void radioCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCorrienteActionPerformed
        etiquetaValor1.setText("Voltaje");
        etiquetaValor2.setText("Resistencia");

        etiquetaUnidad1.setText("Volts");
        etiquetaUnidad2.setText("Ohms");
    }//GEN-LAST:event_radioCorrienteActionPerformed

    private void radioResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioResistenciaActionPerformed
        etiquetaValor1.setText("Voltaje");
        etiquetaValor2.setText("Corriente");

        etiquetaUnidad1.setText("Volts");
        etiquetaUnidad2.setText("Amps");
    }//GEN-LAST:event_radioResistenciaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaUnidad1;
    private javax.swing.JLabel etiquetaUnidad2;
    private javax.swing.JLabel etiquetaValor1;
    private javax.swing.JLabel etiquetaValor2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioCorriente;
    private javax.swing.JRadioButton radioResistencia;
    private javax.swing.JRadioButton radioVoltaje;
    // End of variables declaration//GEN-END:variables
}
