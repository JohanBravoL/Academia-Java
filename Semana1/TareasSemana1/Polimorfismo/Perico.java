package Semana1.TareasSemana1.Polimorfismo;

public class Perico extends Animal {

    public SonidoCaracteristico()
    {
        System.out.println("El perico Canta");
    }
    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }
}
