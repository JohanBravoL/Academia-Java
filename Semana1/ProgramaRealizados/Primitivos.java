package Semana1.ProgramaRealizados;

public class Primitivos 
{
    public static void main(String[] args)
    {

        Boolean res;

        int i1 = 127;
        int i2 = 127;

        res = i1 == i2; // Mis variables tienen el mismo valor?

      //  System.out.println(res);
                  // Se toma como nun objeto diferente
        Integer integer1 = new Integer(127);
        Integer integer2 = new Integer(127);
                // Por lo que al comparar ambos la respuesta siempre sera falso
        res = integer1 == integer2;

      //System.out.println(res);
                // Por el cotrario se toma toma como el mimso objeto
        Integer integer3 = Integer.valueOf(127);
        Integer integer4 = Integer.valueOf(127);
                 // Con la comparacion si se tiene el mismo valor se toma como el mismo objeto
        res = integer3 == integer4;

        // System.out.println(res);

        int i3 = 129;

       res = integer4 == i3;

      //  System.out.println(res);

                 // Se realiza un unboxing, pasa los valores a primitivos y compara solo el valor del numero
        Integer integer5 = Integer.valueOf(129);

        res = integer5 == i3;

       // System.out.println(res);
                //Numeros Primitivos con binario,excadecimal
        int entero1 = 1;
        int entero2 = 010;

        System.out.println(entero1+entero2);

        int entero3 = 0xf01; //Exadecimal
        int entero4 = 0b101;

        System.out.println(entero4);

        long long1 = 1000000000000L; //Para valores long hay que identificarlo con una L al final

        System.out.println(long1);

        short sh1 = 10;
        short sh2 = 20;

        //int sh3 = sh1 + sh2; // La suma de numeros short es un entero ( int)
        short sh3 = (short)(sh1+sh2); //<-- Esta seria la forma de regresarlo a un short
        System.out.println(sh3); // Mientras se mantenga en el rango de bits no se pierde informacion


    }
    
}
