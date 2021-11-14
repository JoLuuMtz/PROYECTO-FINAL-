/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


//ANALISIS Y DISEÑO DE UN PROGRAMA EN JAVA QUE PERMITA
//CALCULAR Y MOSTRAR EL RESULTADO DE LA OBTENCION DE DATOS
//DE CUALQUIER TIPO DE ENFERMEDAD
package co.edu.unisinu.taller.Interface;

import java.awt.Color;
import java.lang.NumberFormatException;
import javax.swing.*;


public class Ventana1 extends javax.swing.JFrame{
    
    
    public Ventana1() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        panelClaveConfir.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idIncorrecto = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        jtxID = new javax.swing.JTextField();
        jtxClave = new javax.swing.JTextField();
        claveIncorrecta = new javax.swing.JLabel();
        panelClaveConfir = new javax.swing.JPanel();
        jtxClaveconfir = new javax.swing.JTextField();
        claveconfirIncorrecta = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setTitle("Dase De Datos");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(906, 700));
        setMinimumSize(new java.awt.Dimension(906, 700));
        setPreferredSize(new java.awt.Dimension(906, 700));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idIncorrecto.setBackground(new java.awt.Color(255, 255, 255));
        idIncorrecto.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        idIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        idIncorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(idIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 207, 28));

        siguiente.setBackground(new java.awt.Color(255, 255, 255));
        siguiente.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        siguiente.setText("VERIFICAR");
        siguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 235, 45));

        jtxID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtxID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "INGRESE ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        getContentPane().add(jtxID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 368, 70));

        jtxClave.setFont(new java.awt.Font("Bookshelf Symbol 7", 1, 18)); // NOI18N
        jtxClave.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "CLAVE ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N
        getContentPane().add(jtxClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 368, 70));

        claveIncorrecta.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        claveIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        claveIncorrecta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(claveIncorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 728, 40));

        panelClaveConfir.setBackground(new java.awt.Color(255, 255, 255));

        jtxClaveconfir.setFont(new java.awt.Font("Bookshelf Symbol 7", 1, 18)); // NOI18N
        jtxClaveconfir.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "CONFIRME CLAVE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DialogInput", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        claveconfirIncorrecta.setFont(new java.awt.Font("DialogInput", 3, 12)); // NOI18N
        claveconfirIncorrecta.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelClaveConfirLayout = new javax.swing.GroupLayout(panelClaveConfir);
        panelClaveConfir.setLayout(panelClaveConfirLayout);
        panelClaveConfirLayout.setHorizontalGroup(
            panelClaveConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveConfirLayout.createSequentialGroup()
                .addGroup(panelClaveConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClaveConfirLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jtxClaveconfir, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClaveConfirLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(claveconfirIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        panelClaveConfirLayout.setVerticalGroup(
            panelClaveConfirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClaveConfirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxClaveconfir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(claveconfirIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(panelClaveConfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 520, 180));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unisinu/taller/Interface/imagenes/Portada.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 910, 700));

        setSize(new java.awt.Dimension(922, 705));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Enfermedades abp = new Enfermedades();
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        boolean error = false;
        try{
            idIncorrecto.setText("");
            abp.id = Float.parseFloat(jtxID.getText());
            error = true;
            while(error = true){
                break;
            }
        }
        catch(NumberFormatException ex){
           idIncorrecto.setText("ID invalido!");
        }
        //*****************************
        int errores = 0, letras = 0, letrasM = 0, numeros = 0, simbolos = 0, i = 0;
        char x;
        abp.clave = jtxClave.getText();
        claveIncorrecta.setText("");
        for (i = 0; i < abp.clave.length(); i++){
                x = abp.clave.charAt(i);
                if (x >= 'a' && x <= 'z'){
                        letras++;
                }
                if(x >= 'A' && x <= 'Z'){
                        letrasM++;
                }
                if(x >= '0' && x <= '9'){
                        numeros++;
                }
                if((x >= 33 && x <= 47) || (x >= 58 && x <= 64)){//tablas ACSII
                        simbolos++;
                }
        }
        String mensaje = "La contraseña debe tener:";
        if(i < 8){
            mensaje = mensaje + " Minino 8 caracteres,";
            errores++;
        }
        if(letrasM < 1){ 
            mensaje = mensaje + " 1 letra Mayuscula,";
            errores++;
        }
        if(numeros < 1){ 
            mensaje = mensaje + " 1 numero,";
            errores++;
        }
        if(simbolos < 1){ 
            mensaje = mensaje + " 1 caracter Diferente a numero o letra";
            errores++;
        }
        if(errores > 0){
            claveIncorrecta.setText(mensaje);
        }
        else{
            panelClaveConfir.setVisible(true);
            siguiente.setText("Ingresar");
        }
        abp.clave = abp.clave.trim();
       
        
        //**********************
        abp.claveConfir = jtxClaveconfir.getText();
        claveconfirIncorrecta.setText("");
        if(!(abp.claveConfir.equals(abp.clave))){
            claveconfirIncorrecta.setText("Las Claves No Coinciden");
        }
        
        //********************
        if(error == true && errores == 0 && abp.claveConfir.equals(abp.clave)){
            Ventana2 ventana = new Ventana2();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana1().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel claveIncorrecta;
    private javax.swing.JLabel claveconfirIncorrecta;
    private javax.swing.JLabel idIncorrecto;
    private javax.swing.JTextField jtxClave;
    private javax.swing.JTextField jtxClaveconfir;
    private javax.swing.JTextField jtxID;
    private javax.swing.JPanel panelClaveConfir;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables

    public void setLocationRelativeTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Enfermedades {
    public static float id;
    public static String clave;
    public static String claveConfir;
    public static String nombre;
    public static String NombreCientifico;
    public static int NivelGravedad;
    public static String sintomas;
    public static String medicamentos;
    public static String esContagiosa;
    public static String esCubiertaporPost;
    public static String requiereIncapacidad;
}

