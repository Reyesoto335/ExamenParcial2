package SegundoEjercicio;

import java.util.Scanner;

public class EjecutorSegundoEjercicio {

    static Scanner sc = new Scanner(System.in);
    static PilaSegundoEjercicio pila = new PilaSegundoEjercicio();
    static String variable, palabra;
    public static void main(String[] args) {
        EjecutorSegundoEjercicio pilaExamen = new EjecutorSegundoEjercicio();
        
        pilaExamen.datos();
        pilaExamen.palabra();
        pilaExamen.verificar();
    }
    
    public void datos(){
        System.out.println("Ingrese el dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            pila.push(c);
        }
    }
    
 
    
    public void verificar(){
      if (variable.equals(palabra)){
          System.out.println("Es palindromo");
      }else{
          System.out.println("No es");
      }
    }
       public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
    }
}