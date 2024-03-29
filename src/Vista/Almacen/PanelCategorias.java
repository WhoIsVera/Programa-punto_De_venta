/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Almacen;

import Vista.Categoria.PanelConsultarCategoria;
import Vista.Categoria.PanelRegistrarCategoria;
import Vista.PanelAlmacen;

/**
 *
 * @author cesar
 */
public class PanelCategorias extends javax.swing.JPanel {

    //Declarar los mini paneles dinamicos
    PanelConsultarCategoria consulta;
    PanelRegistrarCategoria registro;
   
    public PanelCategorias() {
        initComponents();
      
        
    }
    
    PanelAlmacen b;
     public PanelCategorias(PanelAlmacen a) {
        initComponents();
        b=a;
        //Propiedades de panel CONSULTA CATEGORIA
        consulta = new PanelConsultarCategoria();
        consulta.setBounds(0,0,534,500);
        PanelDinamicoCategorias.add(consulta);
        consulta.setVisible(false);
     
        
        //Propiedades del panel REGISRA CATEGORIA
        registro = new PanelRegistrarCategoria();
        registro.setBounds(0,0,534,500);
        PanelDinamicoCategorias.add(registro);
        registro.setVisible(false);
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
        PanelDinamicoCategorias = new javax.swing.JPanel();
        Bnt_Eliminar = new javax.swing.JButton();
        Bnt_Consultar1 = new javax.swing.JButton();
        Bnt_AñadirNuevo1 = new javax.swing.JButton();
        Bnt_Modificar1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(920, 576));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Panel para CATEGORIAS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        Btn_Atras.setText("ATRAS");
        Btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AtrasActionPerformed(evt);
            }
        });
        add(Btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        PanelDinamicoCategorias.setBackground(new java.awt.Color(255, 255, 255));
        PanelDinamicoCategorias.setPreferredSize(new java.awt.Dimension(534, 500));
        PanelDinamicoCategorias.setLayout(null);
        add(PanelDinamicoCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Bnt_Eliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bnt_Eliminar.setText("ELIMINAR");
        Bnt_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_EliminarActionPerformed(evt);
            }
        });
        add(Bnt_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        Bnt_Consultar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bnt_Consultar1.setText("CONSULTAR");
        Bnt_Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_Consultar1ActionPerformed(evt);
            }
        });
        add(Bnt_Consultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        Bnt_AñadirNuevo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bnt_AñadirNuevo1.setText("AÑADIR NUEVO");
        Bnt_AñadirNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_AñadirNuevo1ActionPerformed(evt);
            }
        });
        add(Bnt_AñadirNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        Bnt_Modificar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bnt_Modificar1.setText("MODIFICAR");
        Bnt_Modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_Modificar1ActionPerformed(evt);
            }
        });
        add(Bnt_Modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AtrasActionPerformed
        // TODO add your handling code here:
        
        b.PrimeraVistaAlmacen();
    }//GEN-LAST:event_Btn_AtrasActionPerformed

    private void Bnt_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bnt_EliminarActionPerformed

    private void Bnt_Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_Consultar1ActionPerformed
        //Navegacion  a la mini-vista de consulta de categorias
        consulta.setVisible(true);
        registro.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_Bnt_Consultar1ActionPerformed

    private void Bnt_AñadirNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_AñadirNuevo1ActionPerformed
        // Navegacin a la mini-vista de registro de una nueva categoria
        consulta.setVisible(false);
        registro.setVisible(true);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_Bnt_AñadirNuevo1ActionPerformed

    private void Bnt_Modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_Modificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bnt_Modificar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bnt_AñadirNuevo1;
    private javax.swing.JButton Bnt_Consultar1;
    private javax.swing.JButton Bnt_Eliminar;
    private javax.swing.JButton Bnt_Modificar1;
    private javax.swing.JButton Btn_Atras;
    private javax.swing.JPanel PanelDinamicoCategorias;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
