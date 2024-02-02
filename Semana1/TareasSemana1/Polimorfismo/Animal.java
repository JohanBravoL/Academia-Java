package Semana1.TareasSemana1.Polimorfismo;

public class Animal {

    String SonidoCaracteristico();

    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }
}
