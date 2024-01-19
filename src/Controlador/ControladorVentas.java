/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Venta;
import Vista.Ventas.PanelConsultarVentas;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



//Clase que contiene todas las funciones de consulta, inserccion etc, para el modulo Ventas
public class ControladorVentas {
    
    ArrayList<Venta> listaVentas;
    Conexion conect;
    Statement st; 
    ResultSet rs;
    
    //Declaracion de variables necesarias para la conexion
    String nombreBD= "yoyis";
    String url = "jdbc:postgresql://localhost:5432/"+nombreBD;
    String usuario = "postgres";
    String contrasena= "1177";
    Connection con = null;   
    
    
    public ControladorVentas(){

        conect= new Conexion();
        try{
           // Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,contrasena);
            //JOptionPane.showMessageDialog(null, "Base de datos conectada con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion--"+e);
        }
    }
    
    
    
    
    
    public ArrayList<Venta> consultarTodas(){
        Venta registroVenta;
        listaVentas = new ArrayList<Venta>();
        //Realizar la conexion
       // con=conect.conectar();//Llamar al metodo conectar del objeto Conexion y guardar el resultado en "con"
        try {
            //Realizar la consulta 
            st=con.createStatement();
            String consulta = "select * from venta;";
           
           //Obtiene los resultados 
            rs=st.executeQuery(consulta);
            
            //Recorre los resultados del rs, y los almacena en objetos tipo Venta
            while(rs.next()){
                registroVenta= new Venta();
                registroVenta.setFolio_venta(rs.getInt("folio_venta"));
                registroVenta.setFecha(rs.getDate("fecha"));
                registroVenta.setTotal(rs.getDouble("total"));
                listaVentas.add(registroVenta); //Almacena ese objeto en la lista de objetos tipo Venta
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelConsultarVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaVentas; //Retorna los resultados de la consulta. 
        
    }
    
    
}
