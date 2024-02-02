package Semana1.TareasSemana1.Polimorfismo;

public class Cucaracha extends Animal{

    public SonidoCaracteristico()
    {
        System.out.println("La cucaracha Cuchichea");
    }
    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }
}
