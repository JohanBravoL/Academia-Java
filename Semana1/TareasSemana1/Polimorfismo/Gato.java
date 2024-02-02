package Semana1.TareasSemana1.Polimorfismo;

public class Gato extends Animal{

    public SonidoCaracteristico()
    {
        System.out.println("EL gato hace miau");
    }
    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }
}
