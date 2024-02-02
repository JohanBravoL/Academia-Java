package Semana1.TareasSemana1.Polimorfismo;

import java.rmi.StubNotFoundException;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Gato();
        System.out.println("Animal: "+a1.toString()+a1.SonidoCaracteristico());

        Animal a2 = new Perico();
        System.out.println("Animal: "+a2.toString()+a2.SonidoCaracteristico());

        Animal a3 = new Cucaracha();
        System.out.println("Animal: "+a3.toString()+a3.SonidoCaracteristico());
    }
    
}
