/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

/**
 *
 * @author USER 17
 */
public class EJ03 extends javax.swing.JFrame {

    /**
     * Creates new form EJ03
     */
    public EJ03() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CALCULARBTN = new javax.swing.JButton();
        txtingresenumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtalquiler = new javax.swing.JLabel();
        txtpublicidad = new javax.swing.JLabel();
        txttrasporte = new javax.swing.JLabel();
        txtservicio = new javax.swing.JLabel();
        txtdecoracion = new javax.swing.JLabel();
        txtgatosvariados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CALCULARBTN.setBackground(new java.awt.Color(102, 255, 102));
        CALCULARBTN.setText("CALCULAR");
        CALCULARBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULARBTNActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Alquiler de espacio en la feria:");

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Publicidad:");

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Transporte:");

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Servicios feriales:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Decoración:");

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Gastos varios:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Distribución de Inversión en una Feria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(CALCULARBTN)
                            .addGap(48, 48, 48)
                            .addComponent(txtingresenumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(txtalquiler))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtpublicidad)
                                .addComponent(txttrasporte)
                                .addComponent(txtservicio)
                                .addComponent(txtdecoracion)
                                .addComponent(txtgatosvariados)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CALCULARBTN)
                    .addComponent(txtingresenumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtalquiler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpublicidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttrasporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtservicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdecoracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgatosvariados)
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CALCULARBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULARBTNActionPerformed
        final double ALQUILER = 0.23;
        final double PUBLICIDAD = 0.07;
        final double TRANSPORTE = 0.26;
        final double SERVICIOS = 0.12;
        final double DECORACION = 0.21;
        final double GASTOS_VARIOS = 0.11;
 
        // Solicitar al usuario que ingrese el monto total de dinero a invertir
        double montoTotal = Float.parseFloat(txtingresenumero.getText().trim());
 
        // Calcular el monto correspondiente a cada rubro
        double montoAlquiler = montoTotal * ALQUILER;
        double montoPublicidad = montoTotal * PUBLICIDAD;
        double montoTransporte = montoTotal * TRANSPORTE;
        double montoServicios = montoTotal * SERVICIOS;
        double montoDecoracion = montoTotal * DECORACION;
        double montoGastosVarios = montoTotal * GASTOS_VARIOS;
 
        txtalquiler.setText(String.valueOf(montoAlquiler));
        txtpublicidad.setText(String.valueOf(montoPublicidad));
        txttrasporte.setText(String.valueOf(montoTransporte));
        txtservicio.setText(String.valueOf(montoServicios));
        txtdecoracion.setText(String.valueOf(montoDecoracion));
        txtgatosvariados.setText(String.valueOf(montoGastosVarios));
    }//GEN-LAST:event_CALCULARBTNActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EJ03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EJ03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EJ03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EJ03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EJ03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULARBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel txtalquiler;
    private javax.swing.JLabel txtdecoracion;
    private javax.swing.JLabel txtgatosvariados;
    private javax.swing.JTextField txtingresenumero;
    private javax.swing.JLabel txtpublicidad;
    private javax.swing.JLabel txtservicio;
    private javax.swing.JLabel txttrasporte;
    // End of variables declaration//GEN-END:variables
}
