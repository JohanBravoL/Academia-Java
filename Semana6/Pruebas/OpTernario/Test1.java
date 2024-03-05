package Semana6.Pruebas.OpTernario;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        
        String Mensaje;
        double promedio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cual es el promedio final?");
        promedio = teclado.nextDouble();

        Mensaje = promedio >=6 ? "Aprobatorio" : "Reprobatorio";
        System.out.println("EL promedio final es: "+ Mensaje);
    }
    
}
