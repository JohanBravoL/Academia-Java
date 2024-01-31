package Semana1.TareasSemana1.Singleton;

public class cliente {
    String nomb1;
    carro cont1;

    public cliente(String nomb1, carro cont1){
        this.nomb1 = nomb1;
        this.cont1 = cont1;
    }

    @Override
    public String toString(){
        return "Cliente: "+nomb1 + " Carro:"+cont1;
    }
}
