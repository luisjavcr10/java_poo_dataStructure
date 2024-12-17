package Inventario;

import generic.Nodo;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class LEDProductos implements Serializable {
    private Nodo<Product> primero;
    private Nodo<Product> ultimo;
    
    
    public LEDProductos(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public Nodo<Product> getPrimero(){
        return primero;
    }
    
    public void setPrimero(Nodo<Product> primero) {
        this.primero = primero;
    }
    
    public Nodo<Product> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<Product> ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia() {
        return primero == null && ultimo == null;
    }
    
    public int contar() {
        int c = 0;
        Nodo<Product> p = primero;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }
    
    public void insertarAlFinal(Product x){
        Nodo<Product> nuevo = new Nodo(x);
        if(primero == null){
            primero=nuevo;
        }else{
            Nodo<Product> p = primero;
            while(p.getSgte()!=null)
                p=p.getSgte();
            p.setSgte(nuevo);
        }
    }
    
    //busqueda
    public Nodo<Product> BuscarCodigo(int codigo)
    {
        Nodo<Product> auxiliar = primero;
        while(auxiliar != null)
        {
            if(codigo==auxiliar.getInfo().getCodigo())
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
    
    public void ordenarPorNombre() {
        Nodo<Product> p, q;
        Product aux;
        p = primero;

        while (p.getSgte() != null) {
            q = p.getSgte();

            while (q != null) {
                // Utilizando el método getNombre() para obtener el nombre del producto
                String nombreP = ((Product) p.getInfo()).getNombre();
                String nombreQ = ((Product) q.getInfo()).getNombre();

                // Comparando los nombres en orden alfabético
                if (nombreP.compareToIgnoreCase(nombreQ) > 0) {
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
    
   
    public void eliminar(Nodo<Product> auxiliar)
    {
        if(auxiliar == primero)
        {
            primero = primero.getSgte();
        }
        else
        {
            Nodo<Product> actual = primero;
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
}
