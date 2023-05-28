/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Unidad_1;

import Unidad_1.DatoEntradaCheckedEx;
import Unidad_1.DatosDefinidosEx;
import Unidad_1.Teoria_ondulatoria_de_la_luz;
import Ventanas.Vent_Unidad_1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Vent_Teoria_Ondulatoria extends javax.swing.JFrame {

    /**
     * Creates new form Vent_Teoria_Ondulatoria
     */
    public Vent_Teoria_Ondulatoria() {
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

        jLabel1 = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        Btn_LongOnda = new javax.swing.JButton();
        Btn_FreccRad = new javax.swing.JButton();
        Resultado = new javax.swing.JTextField();
        Btn_Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Teoria Ondulatoria de la Luz");

        Btn_LongOnda.setText("Longitud Onda");
        Btn_LongOnda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_LongOndaMouseClicked(evt);
            }
        });

        Btn_FreccRad.setText("Frecuencia de Radiación");
        Btn_FreccRad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_FreccRadMouseClicked(evt);
            }
        });

        Btn_Volver.setText("Volver");
        Btn_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_VolverMouseClicked(evt);
            }
        });
        Btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingresa Longitud de onda o Frecuencia de Radiación ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_LongOnda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_FreccRad)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_Volver)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_LongOnda)
                    .addComponent(Btn_FreccRad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Volver)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_LongOndaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LongOndaMouseClicked
        // TODO add your handling code here:
        
        String input=Input.getText();
        try {
            Teoria_ondulatoria_de_la_luz teoriaOnd=new Teoria_ondulatoria_de_la_luz(input);
        
            
            Resultado.setText(""+teoriaOnd.LongOnda()+" m");
        } catch (DatoEntradaCheckedEx e) {

            Resultado.setText(e.getMessage());
        } catch (DatosDefinidosEx ex) {
            Resultado.setText(ex.getMessage());
        }
        
        
    }//GEN-LAST:event_Btn_LongOndaMouseClicked

    private void Btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_VolverMouseClicked
        // TODO add your handling code here:

        Vent_Unidad_1 app=new Vent_Unidad_1();

        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_VolverMouseClicked

    private void Btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_VolverActionPerformed

    private void Btn_FreccRadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_FreccRadMouseClicked
        // TODO add your handling code here:
        
        String input=Input.getText();
        
        try {
            Teoria_ondulatoria_de_la_luz teoriaOnd=new Teoria_ondulatoria_de_la_luz(input);
        
            
            Resultado.setText(""+teoriaOnd.FrecuenciaRadiacion()+" Hz");
        } catch (DatoEntradaCheckedEx e) {

            Resultado.setText(e.getMessage());
        } catch (DatosDefinidosEx ex) {
            Resultado.setText(ex.getMessage());
        }
        
    }//GEN-LAST:event_Btn_FreccRadMouseClicked

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
            java.util.logging.Logger.getLogger(Vent_Teoria_Ondulatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vent_Teoria_Ondulatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vent_Teoria_Ondulatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vent_Teoria_Ondulatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vent_Teoria_Ondulatoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_FreccRad;
    private javax.swing.JButton Btn_LongOnda;
    private javax.swing.JButton Btn_Volver;
    private javax.swing.JTextField Input;
    private javax.swing.JTextField Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}