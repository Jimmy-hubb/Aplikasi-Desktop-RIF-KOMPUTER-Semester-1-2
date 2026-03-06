/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inventory.view;

import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.AbstractBarcodeStrategy;
import net.sourceforge.jbarcodebean.model.Code128;
import javax.swing.*;

public class BARCODE extends javax.swing.JFrame {

    private BufferedImage image = null;
   
    public BARCODE(String id) {
        initComponents();
        generatebarcode(id);
    }

    private AbstractBarcodeStrategy getCodeType(String codeType) {
        AbstractBarcodeStrategy mCodeType = null;
        switch (codeType) {
            case"Code128":
                mCodeType = new Code128();
                break;
            default:
                mCodeType = null;
                break;
        }
        return mCodeType;
    }

    void generatebarcode(String idbarang) {
        String id = idbarang;
        JBarcodeBean barcodeBean = new JBarcodeBean();
        barcodeBean.setCodeType(new Code128());
        barcodeBean.setCode(id);

        int barcodeWidth = 200;
        int barcodeHeight = 100;
        image = barcodeBean.draw(new BufferedImage(barcodeWidth, barcodeHeight, BufferedImage.TYPE_INT_BGR));

        ImageIcon iconBarcode = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(lb_barcode.getWidth(), lb_barcode.getHeight(), 0));
        lb_barcode.setIcon(iconBarcode);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_barcode = new javax.swing.JPanel();
        lb_barcode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_barcode.setText("jLabel1");

        javax.swing.GroupLayout p_barcodeLayout = new javax.swing.GroupLayout(p_barcode);
        p_barcode.setLayout(p_barcodeLayout);
        p_barcodeLayout.setHorizontalGroup(
            p_barcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barcodeLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lb_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        p_barcodeLayout.setVerticalGroup(
            p_barcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_barcodeLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(lb_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_barcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_barcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BARCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BARCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BARCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BARCODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BARCODE(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_barcode;
    private javax.swing.JPanel p_barcode;
    // End of variables declaration//GEN-END:variables
}
