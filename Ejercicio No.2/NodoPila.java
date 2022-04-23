package SegundoEjercicio;

public class NodoPilaSegundoEjercicio {
    char dato;
    NodoPilaSegundoEjercicio siguiente;

    public NodoPilaSegundoEjercicio(char dato) {
        this.dato = dato;
        siguiente = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }
    
}