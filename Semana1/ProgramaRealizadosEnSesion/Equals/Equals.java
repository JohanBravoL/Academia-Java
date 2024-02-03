package Semana1.ProgramaRealizados.Equals;

public class Equals 
{
    public static void main(String[] args) 
    {
        String s1 = "Hola";
        String s2 = new String("Hola");
            //El equals busca que sea el mismo contenido dentro del objeto
        System.out.println(s1.equals(s2));
        Boolean z;
            //El == lo que busca es que sea el mismo objeto no importando el contenido
        z = s1 == s2;
        System.out.println(z);
            //El @Override se refiere a una sobreescritura.
    }
    
}

public class Pato
{
    String nombre;
        public pato (String nombre)
        {
            this.nombre = nombre;
        }
            //@Override SobreEscritura Ejemplo
        public boolean equals(Object obj){
            Pato otroPato = (Pato)onj;
            return otroPato.nombre.equals(this.nombre);

            //Overloading SobreCarga
        public boolean equals(Pato obj){
            return obj.nombre.equals(this.nombre);
        }
        }
}