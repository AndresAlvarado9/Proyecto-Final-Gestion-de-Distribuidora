/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author HI andres
 */
public class Producto {
    
    /**
    * Atributos que se utilizaran en los diferentes metodos de gestion de
    * informacion.
    */
    private int Stock;
    private String descripcion;
    private String nombreDelProducto;
    private String codigoProducto;
    private double precio;
    private String fechaDeElaboracion;
    private String fechaDeCaducidad;
    private String marca;
    private String codigoBodega;
    
    //Constructor sin parametros

    public Producto() {
        
    }
    
    //Constructor con parametros

    public Producto(String codigoProducto,String descripcion, String nombreDelProducto, int Stock, double precio, String fechaDeElaboracion, String fechaDeCaducidad, String marca, String codigoBodega) {
        this.Stock = Stock;
        this.nombreDelProducto = nombreDelProducto;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.fechaDeElaboracion = fechaDeElaboracion;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.marca = marca;
        this.descripcion = descripcion;
        this.codigoBodega = codigoBodega;
        
    }
    
    //Getters and setters

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
         String cantidad = Integer.toString(Stock);
         cantidad = validarEspacios(cantidad, 10);
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = this.validarEspacios(nombreDelProducto, 25);
    }

    public String getCodigoDelProducto() {
        return codigoProducto;
    }

    public void setCodigoDelProducto(String codigoDelProducto) {
        this.codigoProducto = this.validarEspacios(codigoDelProducto, 5);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        String Precio = String.valueOf(precio);
        Precio = validarEspacios(Precio, 5);
    }

    public String getFechaDeElaboracion() {
        return fechaDeElaboracion;
    }

    public void setFechaDeElaboracion(String fechaDeElaboracion) {
        this.fechaDeElaboracion = this.validarEspacios(fechaDeElaboracion, 12);
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = this.validarEspacios(fechaDeCaducidad, 12);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = this.validarEspacios(marca, 10);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = this.validarEspacios(descripcion, 40);
    }


    public String getCodigoBodega() {
        return codigoBodega;
    }

    public void setCodigoBodega(String codigoBodega) {
        this.codigoBodega = this.validarEspacios(codigoBodega, 5);
    }
    
    
    
     public String validarEspacios(String cadena, int longitud) {
        if (cadena.length() == longitud) {
            return cadena;

        } else {
            if (cadena.length() < longitud) {
                return llenarEspacios(cadena, longitud);

            } else {
                return cortarEspacios(cadena, longitud);

            }
        }
    }

    public String llenarEspacios(String cadena, int longitud) {
        return String.format("%-" + longitud + "s", cadena);

    }

    public String cortarEspacios(String cadena, int longitud) {
        return cadena.substring(0, longitud);

    }
    
    //Hashcode y equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codigoProducto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.codigoProducto, other.codigoProducto)) {
            return false;
        }
        return true;
    }
    
    
}
