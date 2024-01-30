package Semana1.ProgramaRealizados;

public class HolaMundo 
{
    public static void main(String[] args) 
    {
        String x = "Hola";
        String y = " Mundo";
        String z = y;
       
        y = null;
       
        System.out.println("z: " + z);
        System.out.println("y: " + y);
       
        x = x.concat(z);
       
        System.out.println("x: " + x);
    }
    
}
