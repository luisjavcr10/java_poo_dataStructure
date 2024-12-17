package generic;

import java.io.Serializable;

/**
 *
 * @author Elva
 */
public class NodoD<T> implements Serializable{
    private T info;
    private NodoD sgte;
    private NodoD ant;

    public NodoD(T info){
        this.info = info;
        this.sgte = null;
        this.ant = null;
    }
    
    public NodoD(T info, NodoD sgte, NodoD ant) {
        this.info = info;
        this.sgte = sgte;
        this.ant = ant;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoD getSgte() {
        return sgte;
    }

    public void setSgte(NodoD sgte) {
        this.sgte = sgte;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }
}
