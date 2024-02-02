package Semana1.TareasSemana1.Polimorfismo;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) 
    {
        ArrayList<Animal> coleccionables = new ArrayList<>();

        coleccionables.add(new Perro());
        coleccionables.add(new Gato());
        coleccionables.add(new Perico());
        coleccionables.add(new Cucaracha());

        mostrar(coleccionables);
    }

    //Dentro de esta funcion se implementa el polimorfismo
    public static void mostrar(ArrayList<Animal> coleccionables)
    {
        for (Animal animal : coleccionables) 
        {
            System.out.println("Animal: "+animal.toString()+animal.SonidoCaracteristico());
        } 
    }
}
