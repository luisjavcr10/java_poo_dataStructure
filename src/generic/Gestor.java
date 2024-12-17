package generic;

import Inventario.LEDProductos;
import Inventario.Product;
import atencionCliente.Customer;
import atencionCliente.ListaCustomer;
import java.io.*;
import generic.Nodo;
import empleados.Empleado;
import empleados.ListaEmpleado;

/**
 *
 * @author AbaquerizoALP
 */
public class Gestor implements Serializable
{
    
    public void GrabarArchivo(String FileName, ListaCustomer lista)
    {
        try {
            FileOutputStream fos = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if(out != null)
            {
                Nodo auxiliar = lista.getPrimero();
                while(auxiliar != null)
                {
                    out.writeObject(auxiliar.getInfo());
                    auxiliar = auxiliar.getSgte();
                }
                out.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void ArbrirArchivo(String FileName, ListaCustomer lista)
    {
        try {
            FileInputStream fis = new FileInputStream(FileName);
            ObjectInputStream in = new ObjectInputStream(fis);
            if(in != null)
            {
                Customer elemento;
                while((elemento = (Customer) in.readObject()) != null)
                {
                    lista.encolar(elemento);
                }
                in.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void GrabarArchivo(String FileName, LEDProductos lista)
    {
        try {
            FileOutputStream fos = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if(out != null)
            {
                Nodo auxiliar = lista.getPrimero();
                while(auxiliar != null)
                {
                    out.writeObject(auxiliar.getInfo());
                    auxiliar = auxiliar.getSgte();
                }
                out.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void ArbrirArchivo(String FileName, LEDProductos lista)
    {
        try {
            FileInputStream fis = new FileInputStream(FileName);
            ObjectInputStream in = new ObjectInputStream(fis);
            if(in != null)
            {
                Product elemento;
                while((elemento = (Product) in.readObject()) != null)
                {
                    lista.insertarAlFinal(elemento);
                }
                in.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void GrabarArchivoE(String FileName, ListaEmpleado lista)
    {
        try {
            FileOutputStream fos = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            if(out != null)
            {
                NodoD auxiliar = lista.getPrimero();
                while(auxiliar != null)
                {
                    out.writeObject(auxiliar.getInfo());
                    auxiliar = auxiliar.getSgte();
                }
                out.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void AbrirArchivoE(String FileName, ListaEmpleado lista)
    {
        try {
            FileInputStream fis = new FileInputStream(FileName);
            ObjectInputStream in = new ObjectInputStream(fis);
            if(in != null)
            {
                Empleado elemento;
                while((elemento = (Empleado) in.readObject()) != null)
                {
                    lista.agregar(elemento);
                }
                in.close();
            }
        } catch (Exception e) {
        }
    }
    
}
