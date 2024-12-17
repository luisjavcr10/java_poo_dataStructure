package generic;

import java.io.Serializable;

/**
 *
 * @author PC-01
 */
public class Nodo<T> implements Serializable {
    private T info;
    private Nodo<T> sgte;
    
    
    public Nodo(T info) {
        this.info = info;
        this.sgte = null;
    }
    
    public Nodo(T info, Nodo<T> sgte) {
        this.info = info;
        this.sgte = sgte;
    }
    
    public T getInfo() {
        return info;
    }
    
    public void setInfo(T info) {
        this.info = info;
    }
    
    public Nodo<T> getSgte() {
        return sgte;
    }
    
    public void setSgte(Nodo<T> sgte) {
        this.sgte = sgte;
    }
}