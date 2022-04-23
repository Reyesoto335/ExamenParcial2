package PrimerEjercicio;

public class PilaPrimerEjercicio {
    NodoPilaPrimerEjercicio cima;
    int tamaño;

    public PilaPrimerEjercicio() {
        cima = null;
        tamaño = 0;
    }
    
    public void push(char dato){
        NodoPilaPrimerEjercicio nuevo = new NodoPilaPrimerEjercicio(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
    
    public char pop(){
        char aux = cima.dato;
        cima = cima.siguiente;
        tamaño--;
        return aux;
    }
    
    public char cima(){
        return cima.dato;
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean estaVacia(){
     return cima==null;   
    }
    
    public void limpiar(){
        while(!estaVacia()){
            pop();
        }
    }

}