package TercerEjercicio;

import java.util.Scanner;

public class EjecutorTercerEjercicio {

    static Scanner sc = new Scanner(System.in);
    static String expresiones;
    static Duplicado duplicado = new Duplicado();
    public static void main(String[] args) {
        boolean salir=false;
        while(salir!=true){
        System.out.println("Escriba la expresión");
        expresiones = sc.next();
        
        if(duplicado.Duplicado(expresiones)){
            System.out.println("Hay parentesis repetidos");
        }else{
            System.out.println("No hay parentesis repetidos");
        }
            System.out.println("¿Desea salir?\n1.Sí\n2.No");
            int eleccion=sc.nextInt();
            switch(eleccion){
                case 1: salir = true;
                break;
                case 2: salir = false;
                break;
                default: System.out.println("Se repetirá a falta de elección concisa");
                break;
            }
        }
    }
    
}