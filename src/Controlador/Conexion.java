
package Controlador;
import java.sql.*;
import javax.swing.JOptionPane;
//Clase que crea el metodo Conectar, el cual devuelve lo necesario para realizar una jquery
public class Conexion {
    
    //Declaracion de variables necesarias para la conexion
    String nombreBD= "yoyis";
    String url = "jdbc:postgresql://localhost:5432/"+nombreBD;
    String usuario = "postgres";
    String contrasena= "1177";
    Connection con = null;   
    public Conexion(){
        
    }
    
    //Metodo que realiza la conexion y devuelve el objeto "con", el cual servirá para crear consultas(Objetos Statements) en donde sea
    //que se mande a llamar dicho metodo
     public Connection conectar(){
        try{
           // Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,contrasena);
            JOptionPane.showMessageDialog(null, "Base de datos conectada con exito");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion--"+e);
        }
        return con;
    }
    
 
    
}
