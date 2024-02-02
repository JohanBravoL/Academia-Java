package Semana1.TareasSemana1.Polimorfismo;

public abstract class Animal {

    public abstract String SonidoCaracteristico();

    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }
}
