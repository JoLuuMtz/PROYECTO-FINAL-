/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unisinu.taller.Interface;

import java.awt.Color;

public class Ventana3 extends javax.swing.JFrame {

    public Ventana3() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboIncapacidad = new javax.swing.JComboBox<>();
        cboPost = new javax.swing.JComboBox<>();
        cboContagiosa = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        txtInvalido = new javax.swing.JLabel();
        txtInvalido2 = new javax.swing.JLabel();
        txtInvalido3 = new javax.swing.JLabel();
        txtMedicamentos = new javax.swing.JTextField();
        txtSintomas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(906, 700));
        setMinimumSize(new java.awt.Dimension(906, 700));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboIncapacidad.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        cboIncapacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION...", "SI", "NO" }));
        cboIncapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "¿Requiere Incapacidad?", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 18))); // NOI18N
        getContentPane().add(cboIncapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 330, 70));

        cboPost.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        cboPost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION...", "SI", "NO" }));
        cboPost.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "¿Es Cubierta Por Post?", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 18))); // NOI18N
        getContentPane().add(cboPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 330, 70));

        cboContagiosa.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        cboContagiosa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION...", "SI", "NO" }));
        cboContagiosa.setAlignmentX(3.0F);
        cboContagiosa.setAlignmentY(3.0F);
        cboContagiosa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "¿Es Contagiosa?", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 18))); // NOI18N
        getContentPane().add(cboContagiosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 330, 70));

        btnGuardar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 190, 40));

        txtInvalido.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        txtInvalido.setForeground(new java.awt.Color(255, 0, 0));
        txtInvalido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 260, 23));

        txtInvalido2.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        txtInvalido2.setForeground(new java.awt.Color(255, 0, 0));
        txtInvalido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtInvalido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 260, 23));

        txtInvalido3.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        txtInvalido3.setForeground(new java.awt.Color(255, 0, 0));
        txtInvalido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInvalido3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtInvalido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 330, 16));

        txtMedicamentos.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtMedicamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2), "Medicamentos:  ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 18))); // NOI18N
        txtMedicamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 260, 210));

        txtSintomas.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtSintomas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2), "Sintomas:  ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 18))); // NOI18N
        txtSintomas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 260, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unisinu/taller/Interface/imagenes/icon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Enfermedades abp = new Enfermedades();
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String mensaje = "";
        int invalido = 0;
        txtInvalido.setText(mensaje);
        txtInvalido3.setText(mensaje);
        txtInvalido2.setText(mensaje);
        
        abp.sintomas = txtSintomas.getText();
        abp.sintomas = abp.sintomas.trim();
        if(abp.sintomas.isEmpty() == true){
            txtInvalido.setText(mensaje + "Debe ingresar minimo un Sintoma");
            invalido++;
        }
        
        //*****************
        abp.medicamentos = txtMedicamentos.getText();
        abp.medicamentos = abp.medicamentos.trim();
        if(abp.medicamentos.isEmpty() == true){
            txtInvalido2.setText(mensaje + "Debe ingresar minimo un Medicamento");
            invalido++;
        }
        
        //****************
        abp.esContagiosa = cboContagiosa.getSelectedItem().toString();
        abp.requiereIncapacidad = cboIncapacidad.getSelectedItem().toString();
        abp.esCubiertaporPost = cboPost.getSelectedItem().toString();
        if(abp.esContagiosa.equals("SELECCIONE UNA OPCION...")||abp.requiereIncapacidad.equals("SELECCIONE UNA OPCION...")||abp.esCubiertaporPost.equals("SELECCIONE UNA OPCION...")){
            txtInvalido3.setText("Hay opciones sin Marcar!");
            invalido++;
        }
        if(invalido == 0){
            Resultado ventana = new Resultado();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboContagiosa;
    private javax.swing.JComboBox<String> cboIncapacidad;
    private javax.swing.JComboBox<String> cboPost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtInvalido;
    private javax.swing.JLabel txtInvalido2;
    private javax.swing.JLabel txtInvalido3;
    private javax.swing.JTextField txtMedicamentos;
    private javax.swing.JTextField txtSintomas;
    // End of variables declaration//GEN-END:variables
}
