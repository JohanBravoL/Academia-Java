package Semana1.ProgramaRealizados;

public class Equals 
{
    public static void main(String[] args) 
    {
        String s1 = "Hola";
        String s2 = new String("Hola");
            //El equals busca que sea el mismo contenido dentro del objeto
        System.out.println(s1.equals(s2));
        Boolean z;
            //El == lo que busca es que sea el mismo objetono importando el contenido
        z = s1 == s2;
        System.out.println(z);
            //El @Override se refiere a una sobreescritura.
    }
    
}

public class Pato{

    String nombre;
        public pato (String nombre){
            this.nombre = nombre;
        }
}