/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Devoluciones.PanelConsultarDevolucion;
import Vista.Devoluciones.PanelRegistrarDevolucion;

/**
 *
 * @author cesar
 */
public class PanelDevoluciones extends javax.swing.JPanel {

    //Crear los paneles a utilizar
    PanelConsultarDevolucion consulta;
    PanelRegistrarDevolucion registro;
    public PanelDevoluciones() {
        initComponents();
        
        //Se inicializan sus propiedades
        //Propiedades del panel CONSULTA DEV
        consulta = new PanelConsultarDevolucion();
        consulta.setBounds(0,0,698,464);
        PanelDinamicoDevoluciones.add(consulta);
        consulta.setVisible(false);
        
        //Propiedades del panel REGISTRA DEV.
        registro = new PanelRegistrarDevolucion();
        registro.setBounds(0,0,698,464);
        PanelDinamicoDevoluciones.add(registro);
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
        PanelDinamicoDevoluciones = new javax.swing.JPanel();
        Btn_ConsultarDev = new javax.swing.JButton();
        Btn_RegistrarDev = new javax.swing.JButton();
        Btn_EliminarDev = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(952, 608));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Hola Estoy en el panel DEVOLUCIONES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 24, -1, -1));

        PanelDinamicoDevoluciones.setBackground(new java.awt.Color(255, 255, 255));
        PanelDinamicoDevoluciones.setPreferredSize(new java.awt.Dimension(698, 464));

        javax.swing.GroupLayout PanelDinamicoDevolucionesLayout = new javax.swing.GroupLayout(PanelDinamicoDevoluciones);
        PanelDinamicoDevoluciones.setLayout(PanelDinamicoDevolucionesLayout);
        PanelDinamicoDevolucionesLayout.setHorizontalGroup(
            PanelDinamicoDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        PanelDinamicoDevolucionesLayout.setVerticalGroup(
            PanelDinamicoDevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        add(PanelDinamicoDevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 70, -1, -1));

        Btn_ConsultarDev.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_ConsultarDev.setText("CONSULTAR");
        Btn_ConsultarDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarDevActionPerformed(evt);
            }
        });
        add(Btn_ConsultarDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        Btn_RegistrarDev.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_RegistrarDev.setText("REGISTRAR ");
        Btn_RegistrarDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarDevActionPerformed(evt);
            }
        });
        add(Btn_RegistrarDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        Btn_EliminarDev.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btn_EliminarDev.setText("ELIMINAR");
        Btn_EliminarDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarDevActionPerformed(evt);
            }
        });
        add(Btn_EliminarDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ConsultarDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultarDevActionPerformed
        // Navega por la minivista de consulta
        consulta.setVisible(true);
        registro.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_Btn_ConsultarDevActionPerformed

    private void Btn_RegistrarDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarDevActionPerformed
        //Codigo en donde se realiza la navegacion entre vistas de Registrar devolucion   
        consulta.setVisible(false);
        registro.setVisible(true);
        revalidate();
        repaint();
       ///---
          
    }//GEN-LAST:event_Btn_RegistrarDevActionPerformed

    private void Btn_EliminarDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarDevActionPerformed
        /* Se debe realizar la logica de extraer el registro seleccionado y enviar el "delete" con el respectivo id
        de registro a la base de datos*/
    }//GEN-LAST:event_Btn_EliminarDevActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ConsultarDev;
    private javax.swing.JButton Btn_EliminarDev;
    private javax.swing.JButton Btn_RegistrarDev;
    private javax.swing.JPanel PanelDinamicoDevoluciones;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
