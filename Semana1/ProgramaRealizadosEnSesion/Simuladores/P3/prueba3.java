package Semana1.ProgramaRealizadosEnSesion.Simuladores.P3;

public class prueba3 {

        public static void main(String[] args) {
            Integer val1 = 5;
            int val2 = 9;
            testInts(val1++, ++val2);
            System.out.println(val1 + " " + val2);
        }
    
        public static void testInts(Integer obj, int var) {
            obj++;
            var++;
        }
    }
