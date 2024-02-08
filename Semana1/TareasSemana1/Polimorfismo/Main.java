package Semana1.TareasSemana1.Polimorfismo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) 
    {

        //Se crea un arregelo dinamico con el cual se podran añadir n cantidad de objeotos
        //Se tomraran de tipo "Animal" que es la clase "Padre"
        ArrayList<Animal> coleccionables = new ArrayList<>();

        //Se declaran los nuevos objetos dentro del arreglo dinamico
        //Indicando que "Tipo" de "Animal" es cada uno
        coleccionables.add(new Perro());
        coleccionables.add(new Gato());
        coleccionables.add(new Perico());
        coleccionables.add(new Cucaracha());

        //Se manda a llamar a la funcion que contiene el ciclo que nos mostrara los datos de cada obj
        mostrar(coleccionables);
    }

    //Dentro de esta funcion se implementa el polimorfismo
    //La funcion servira para todos los elementos de tipo Animal que se agreguen en el arreglo previamente declarado
    public static void mostrar(ArrayList<Animal> coleccionables)
    {
        //El ciclo pasara por cada uno de los elementos dentro del arreglo
        for (Animal animal : coleccionables) 
        {
            System.out.println("Animal: "+animal.toString()+animal.SonidoCaracteristico());
        } 
    }
}
