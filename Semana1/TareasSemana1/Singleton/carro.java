package Semana1.TareasSemana1.Singleton;
// En esta clase se aplicara el Singleton
public class carro {

    String bd;
    static int c1;
        //Primero se tiene que crear un objeto que es del mismo tipo de forma privada que sea estatica
    static private carro cont1;
        //Depues se tener metodo privado
    private carro(String bd){
        this.bd = bd;
        c1++;
    }
        //Se debe de crear un metodo Getinstance que regresara el Singleton de forma estatica
    static public carro getInstance(){
        return cont1;
    }
    
}
