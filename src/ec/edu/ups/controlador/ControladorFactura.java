/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.idao.IFacturaDAO;
import ec.edu.ups.modelo.Factura;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author HI andres
 */
public class ControladorFactura {
    //Objeto Telefono
    private Factura facturas;
    //Objetos DAO
    private IFacturaDAO facturasDAO ;

    //Constructor sin parametros
    public ControladorFactura() {
        
    }

    //Constructor con parametros
    public ControladorFactura(IFacturaDAO facturasDAO) {
        this.facturasDAO = facturasDAO;
    }

    //Crea un Telefono atraves de la vista y lo agrega al archivo creado en el DAO
    public Factura crear(Factura factura) {
        facturasDAO.create(factura);
        return factura;
    }
    
    //Llama al DAO para obtener Telefono y lo muestra en pantalla atraves de la vista
    
    
    //Llama al DAO para actualizar un Telefono
    public void actualizar(Factura factura) {
        facturasDAO.update(factura);
    }
    
    //Llama al DAO para eliminar un Telefono
    public void eliminar(Factura factura) {
        facturasDAO.delete(factura);
    }
}
