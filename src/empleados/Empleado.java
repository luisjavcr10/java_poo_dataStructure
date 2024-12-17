package empleados;

import java.io.Serializable;

/**
 *
 * @author PC-01
 */
public class Empleado implements Serializable {
    private String puesto;
    private String nombre;
    private int dni;
    private String horario;
    private double sueldo;

    public final void setRegistro(Object[] registro)
    {
        this.puesto = registro[0].toString();
        this.nombre = (registro[1].toString());
        this.dni = Integer.parseInt(registro[2].toString());
        this.horario = (registro[3].toString());
        this.sueldo = Double.parseDouble(registro[4].toString());
    }

    public Object[] getRegistro()
    {
        Object[] registro = {puesto,nombre, dni, horario, sueldo};
        return registro;
    }
    
    public Empleado(Object[] registro)
    {
        this.setRegistro(registro);
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
