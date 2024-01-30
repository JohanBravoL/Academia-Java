package Semana1.ProgramaRealizados.Modificadores;

public class ModificadoresDeAcceso 
{
    public static void main(String[] args) {
        System.out.println("Modificadores de acceso ejemplos");
    }
    public class carro
    {
        public StringBuilder name; //todos tienen acceso
        int edad; //Solo la clase propia tiene acceso
        protected String Clase;
        private char Color; //Solo dentro de la clase tienen acceso
    }    
}
