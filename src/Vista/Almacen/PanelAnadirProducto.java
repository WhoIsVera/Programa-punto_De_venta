/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Almacen;

import Vista.PanelAlmacen;

/**
 *
 * @author cesar
 */
public class PanelAnadirProducto extends javax.swing.JPanel {

    /**
     * Creates new form PanelAnadirProducto
     */
    public PanelAnadirProducto() {
        initComponents();
    }
    
    PanelAlmacen b;
     public PanelAnadirProducto(PanelAlmacen a) {
        initComponents();
        b=a;
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
        Btn_Atras = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(920, 576));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Panel para AÑADIR PRODUCTO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        Btn_Atras.setText("ATRAS");
        Btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AtrasActionPerformed(evt);
            }
        });
        add(Btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AtrasActionPerformed
        // TODO add your handling code here:
        
        b.PrimeraVistaAlmacen();
    }//GEN-LAST:event_Btn_AtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Atras;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
