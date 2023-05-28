/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Ventanas.Vent_Main;
import Ventanas_Unidad_1.Vent_Atomos_de_Hidrogeno;
import Ventanas_Unidad_1.Vent_Energia_Cuantizada;
import Ventanas_Unidad_1.Vent_Teoria_Ondulatoria;

/**
 *
 * @author dell
 */
public class Vent_Unidad_1 extends javax.swing.JFrame {

    /**
     * Creates new form Unidad_1
     */
    public Vent_Unidad_1() {
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
        Btn_Volver = new javax.swing.JButton();
        Btn_Teoria_Ondulatoria = new javax.swing.JButton();
        Btn_Energia_Cuantizada = new javax.swing.JButton();
        Btn_Atomos_de_Hidrogeno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Unidad 1");

        Btn_Volver.setText("Volver");
        Btn_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_VolverMouseClicked(evt);
            }
        });

        Btn_Teoria_Ondulatoria.setText("Teoria Ondulatoria de la Luz");
        Btn_Teoria_Ondulatoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Teoria_OndulatoriaMouseClicked(evt);
            }
        });
        Btn_Teoria_Ondulatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Teoria_OndulatoriaActionPerformed(evt);
            }
        });

        Btn_Energia_Cuantizada.setText("Energia Cuantizada");
        Btn_Energia_Cuantizada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Energia_CuantizadaMouseClicked(evt);
            }
        });
        Btn_Energia_Cuantizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Energia_CuantizadaActionPerformed(evt);
            }
        });

        Btn_Atomos_de_Hidrogeno.setText("Atomos de Hidrogeno");
        Btn_Atomos_de_Hidrogeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Atomos_de_HidrogenoMouseClicked(evt);
            }
        });
        Btn_Atomos_de_Hidrogeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Atomos_de_HidrogenoActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Que formulas quieres calcular?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_Volver)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(Btn_Teoria_Ondulatoria))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_Atomos_de_Hidrogeno)
                                .addComponent(Btn_Energia_Cuantizada)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Btn_Teoria_Ondulatoria)
                .addGap(29, 29, 29)
                .addComponent(Btn_Energia_Cuantizada)
                .addGap(31, 31, 31)
                .addComponent(Btn_Atomos_de_Hidrogeno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Btn_Volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_VolverMouseClicked
        // TODO add your handling code here:
        
        Vent_Main app=new Vent_Main();
        
        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_VolverMouseClicked

    private void Btn_Teoria_OndulatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Teoria_OndulatoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Teoria_OndulatoriaActionPerformed

    private void Btn_Teoria_OndulatoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Teoria_OndulatoriaMouseClicked
        // TODO add your handling code here:
        
        Vent_Teoria_Ondulatoria app=new Vent_Teoria_Ondulatoria();

        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_Teoria_OndulatoriaMouseClicked

    private void Btn_Energia_CuantizadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Energia_CuantizadaMouseClicked
        // TODO add your handling code here:
        Vent_Energia_Cuantizada app=new Vent_Energia_Cuantizada();
        

        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_Energia_CuantizadaMouseClicked

    private void Btn_Energia_CuantizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Energia_CuantizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Energia_CuantizadaActionPerformed

    private void Btn_Atomos_de_HidrogenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Atomos_de_HidrogenoMouseClicked
        // TODO add your handling code here:
        
        Vent_Atomos_de_Hidrogeno app=new Vent_Atomos_de_Hidrogeno();
        

        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_Atomos_de_HidrogenoMouseClicked

    private void Btn_Atomos_de_HidrogenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Atomos_de_HidrogenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Atomos_de_HidrogenoActionPerformed

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
            java.util.logging.Logger.getLogger(Vent_Unidad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vent_Unidad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vent_Unidad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vent_Unidad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vent_Unidad_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Atomos_de_Hidrogeno;
    private javax.swing.JButton Btn_Energia_Cuantizada;
    private javax.swing.JButton Btn_Teoria_Ondulatoria;
    private javax.swing.JButton Btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}