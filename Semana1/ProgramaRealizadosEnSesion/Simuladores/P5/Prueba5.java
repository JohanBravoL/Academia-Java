package Semana1.ProgramaRealizadosEnSesion.Simuladores.P5;

public class Prueba5 {
        public static void main(String[] args){
           One o = null;
           Two t = new Two();
        }

    class Super{
        static{ System.out.print("super "); }
      }
      class One{
        static {  System.out.print("one "); }
      }
      class Two extends Super{
        static {  System.out.print("two "); }
      }
     
    
}
