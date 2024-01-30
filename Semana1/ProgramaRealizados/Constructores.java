package Semana1.ProgramaRealizados;

public class Constructores 
{
public static void main(String[] args) 
    {
        Pato pato1 = new Pato("Lucas");
        System.out.println(pato1.name);
    }

pubclic class Pato extends Object
    {
        String name;
        int edad;
    
        public Pato(String name)
        {
            this.name = name;
        }
        public Pato(String edad)
        {
            this.edad = edad;
        }
        public Pato(String name, int edad)
        {
            this.name = name;
            this.edad = edad;
        }
    }
}

