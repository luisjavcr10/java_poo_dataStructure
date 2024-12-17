package atencionCliente;

import generic.Nodo;
import java.io.Serializable;

/**
 *
 * @author AbaquerizoALP
 */
public class ListaCustomer implements Serializable{
    
    private Nodo<Customer> primero;
    private Nodo<Customer> ultimo;
    
    public ListaCustomer()
    {
        primero = ultimo = null;
    }

    public Nodo<Customer> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<Customer> primero) {
        this.primero = primero;
    }

    public Nodo<Customer> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<Customer> ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean isEmpty() {
        return primero == null;
    }
    
     public int contar(){
        int c=0;
        Nodo p=primero;
        while(p!=null){
            c++;
            p=p.getSgte();
        }
        return c;
    }
    
    public void encolar(Customer x){
        Nodo<Customer> nuevo = new Nodo(x, null);
        
        if(primero==null)
            primero=nuevo;
        else
            ultimo.setSgte(nuevo);
        ultimo=nuevo;
    }
    
    public Customer desencolar(){
        Customer x = primero.getInfo();
        primero = primero.getSgte();
        if(primero==null)
            ultimo=null;
        return x;
    }
    
    public Nodo<Customer> BuscarCodigo(int codigo)
    {
        Nodo<Customer> auxiliar = primero;
        while(auxiliar != null)
        {
            if(codigo==auxiliar.getInfo().getDocumento())
            {
                return auxiliar;
            }
            else
            {
                auxiliar = auxiliar.getSgte();
            }
        }
        return null;
    }
    
    public void eliminar(Nodo<Customer> auxiliar)
    {
        if(auxiliar == primero)
        {
            primero = primero.getSgte();
        }
        else
        {
            Nodo<Customer> actual = primero;
            while(actual.getSgte() != auxiliar)
            {
                actual = actual.getSgte();
            }
            if(auxiliar == ultimo)
            {
                actual.setSgte(null);
                ultimo = actual;
            }
            else
            {
                actual.setSgte(auxiliar.getSgte());
            }
        }
    }
    
    private double sumaRecursiva(Nodo<Customer> p){
        
        if(p.getSgte()==null)
            return p.getInfo().getCuentaFinal();
        else
            return p.getInfo().getCuentaFinal()+sumaRecursiva(p.getSgte());
        
    }
    
    public double sumaRecursiva(){
        return sumaRecursiva(primero);
    }
    
}
