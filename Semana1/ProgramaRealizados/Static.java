package Semana1.ProgramaRealizados;

public class Static {

    public static int suma(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

    public static void main(String[] args) {
        int j;
        int resusm = suma(3, 5);
        System.out.println("La suma es "+resusm);
        for(j=0; j<21 ; j++)
            {
                System.out.println("Serie de num " + j);
            }
        int[] numeros = {10, 20, 30, 40, 50};
                // Iterar sobre cada elemento del array
        for (int i = 0; i < numeros.length; i++)
            {
                System.out.println("Serie de arreglo " + numeros[i]);
            }
    }
    
}
