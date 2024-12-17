package empleados;

import generic.NodoD;
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elva
 */
public class  ListaEmpleado<T> implements Serializable{
    protected NodoD<T> primero;
    private NodoD<T> ultimo;
    
    public ListaEmpleado(){
        primero = null;
        ultimo = null;
    }
    
    public NodoD<T> getPrimero(){
        return primero;
    }
    
    public void setPrimero(NodoD<T> primero){
        this.primero = primero;
    }
    
    public NodoD<T> getUltimo() {
        return ultimo;
    }
    
    public void setUltimo(NodoD<T> ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia(){
        return primero == null && ultimo == null;
    }
    
    public void agregar(T info){
        NodoD<T> nuevo = new NodoD<>(info);
        if(primero == null){
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        }else{
            nuevo.setSgte(null);
            nuevo.setAnt(ultimo);
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }
    
    public int contar(){
        int c = 0;
        NodoD p = primero;
        while(p != null){
            c++;
            p = p.getSgte();
        }
        return c;
    }
        
    public void mostrarHaciaAdelante(DefaultTableModel modelo){
        NodoD p = primero;
        Object datos[][] = new Object[contar()][5];
        String titulos[] = {"PUESTO", "NOMBRE", "DNI", "HORARIO", "SUELDO"};
        int i = 0;
        while(p != null){
            datos[i][0] = ((Empleado) p.getInfo()).getPuesto();
            datos[i][1] = ((Empleado) p.getInfo()).getNombre();
            datos[i][2] = ((Empleado) p.getInfo()).getDni();
            datos[i][3] = ((Empleado) p.getInfo()).getHorario();
            datos[i][4] = ((Empleado) p.getInfo()).getSueldo();
            p = p.getSgte();
            i++;
        }
        modelo.setDataVector(datos, titulos);
    }
    
    
    public NodoD buscar(int dato){
        NodoD<T> p = primero;
        while(p != null){
            if(((Empleado) p.getInfo()).getDni() == dato){
                return p;
            }
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean actualizarPorDNI(int dato, T nuevo){
        NodoD<T> p = primero;
        boolean encontrado = false;
        
        while(p != null && !encontrado){
            if(((Empleado) p.getInfo()).getDni() == dato){
                    ((Empleado) p.getInfo()).setPuesto(((Empleado) nuevo).getPuesto());
                    ((Empleado) p.getInfo()).setNombre(((Empleado) nuevo).getNombre());
                    ((Empleado) p.getInfo()).setDni(((Empleado) nuevo).getDni());
                    ((Empleado) p.getInfo()).setHorario(((Empleado) nuevo).getHorario());
                    ((Empleado) p.getInfo()).setSueldo(((Empleado) nuevo).getSueldo());
                    encontrado = true;
            }
            p = p.getSgte();
        }
        return encontrado;
    }
    
    public boolean eliminarPorDNI(int dato){
        if(((Empleado) primero.getInfo()).getDni() == dato){
            if(primero.getSgte() == null){
                primero = null;
                ultimo = null;
            }else
            {
                primero = primero.getSgte();
                primero.setAnt(null);
            }
            return true;
        }else{
            NodoD<T> p = primero.getSgte();
            while(p != null && ((Empleado) p.getInfo()).getDni() != dato)
                p = p.getSgte();
            if(p != null){
                if(p == ultimo){
                    ultimo = ultimo.getAnt();
                    ultimo.setSgte(null);
                }else{
                    p.getAnt().setSgte(p.getSgte());
                    p.getSgte().setAnt(p.getAnt());
                }
                return true;
            }else
                return false;
        }
    }
    
    public void ordenar(){
        NodoD<T> p,q;
        T aux;
        p = primero;
        while(p.getSgte() != null){
            q = p.getSgte();
            while(q!= null){
                if(((Empleado) p.getInfo()).getNombre().compareTo(((Empleado)q.getInfo()).getNombre())>0){
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
}
