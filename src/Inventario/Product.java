package Inventario;

import java.io.Serializable;

/**
 *
 * @author PC-01
 */
public class Product implements Serializable{
     private String tipo;
     private int codigo;
     private String nombre;
     private double precio;
     private int stock;
     
    public final void setRegistro(Object[] registro)
    {
        this.tipo = registro[0].toString();
        this.codigo = Integer.parseInt(registro[1].toString());
        this.nombre = registro[2].toString();
        this.precio = Double.parseDouble(registro[3].toString());
        this.stock = Integer.parseInt(registro[4].toString());
    } 
     
    public Object[] getRegistro()
    {
        Object[] registro = {tipo, codigo, nombre, precio, stock};
        return registro;
    }
    
    public Product(Object[] registro)
    {
        this.setRegistro(registro);
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
     
     
}
