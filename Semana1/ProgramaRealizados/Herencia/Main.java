package Semana1.ProgramaRealizados.Herencia;

public class Main {
    public static void main(String[] args) {
        
        int r;
        suma op1 = new suma(8, 5);
        System.out.println(op1);
        r = op1.ejecucion();
        System.out.println("Resultado "+r);
    }
}
