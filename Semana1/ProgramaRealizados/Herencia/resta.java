package Semana1.ProgramaRealizados.Herencia;

public class resta {
    int x;
    int y;

    public resta(int x, int y);{
        this.x = x;
        this.y = y;
    }

    public int ejecucion(){
        return x-y;
    }
   
    @Override
    public String toString(){
        return "Resta de x= "+x+" y= "+y;
    }
}
