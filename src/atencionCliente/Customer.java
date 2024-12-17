package atencionCliente;

import java.io.Serializable;

/**
 *
 * @author PC-01
 */
public class Customer implements Serializable{
    private String nombre;
    private int documento;
    private String metodoPago;
    private double cuentaFinal;
    
    public final void setRegistro(Object[] registro)
    {
        this.nombre = registro[0].toString();
        this.documento = Integer.parseInt(registro[1].toString());
        this.metodoPago = registro[2].toString();
        this.cuentaFinal = Double.parseDouble(registro[3].toString());
    }

    public Object[] getRegistro()
    {
        Object[] registro = {nombre, documento, metodoPago, cuentaFinal};
        return registro;
    }
    
    public Customer(Object[] registro)
    {
        this.setRegistro(registro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getCuentaFinal() {
        return cuentaFinal;
    }

    public void setCuentaFinal(double cuentaFinal) {
        this.cuentaFinal = cuentaFinal;
    }
    
    
}
