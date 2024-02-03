package Semana1.ProgramaRealizados.Constructores;

import Semana1.ProgramaRealizados.Equals.Pato;

public class Constructores 
{
public static void main(String[] args) 
    {
        Pato pato1 = new Pato("Lucas");
        System.out.println(pato1.name);
    }
}

pubclic class Pato extends Object
    {
        String name; //Inica con Null
        int edad; //Inica con 0 por ser primitivo
        //Bolean incia con false
        // super(); --> Manda a llamar al constructor de la clasepadre el cual no recibe parametros
        // No se puede poner super y this en el mismo constructor
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
