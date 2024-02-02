package Semana1.TareasSemana1.Polimorfismo;

public abstract class Animal {

    //Animal es la clase "Padre"
    //Se declaro como abstracta ya que no se puede determinar a un solo tipo como animal si no que hay muchas variantes
    //De igual forma se declaro como abstracta el metodo ya que no se pueden declarar metodos vacios
    public abstract String SonidoCaracteristico();

    //Este override se utilizara para conocer de que tipo es cada uno de los animales de las clases herdadas
    @Override
    public String toString()
    {
        return getClass().getSimpleName();
    }
}
