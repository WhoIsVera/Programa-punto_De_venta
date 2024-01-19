
package Modelo;

import java.sql.Date;

/**
 *
 * @author cesar
 */
//Clase optional para hacer la recopilacion de datos de consultas pero orientada a objetos. 
//Esta clase actua como una tabla en la base de datos, por lo que tiene los mismos "campos"
public class Venta {
    //Atributos de la clase, relacionados con los campos de la base de datos de su respectiva tabla
    private int folio_venta;
    private Date  fecha;
    private double total;

    public int getFolio_venta() {
        return folio_venta;
    }

    public void setFolio_venta(int folio_venta) {
        this.folio_venta = folio_venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
    
}
