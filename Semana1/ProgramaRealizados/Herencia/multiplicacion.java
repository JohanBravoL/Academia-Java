package Semana1.ProgramaRealizados.Herencia;

public class multiplicacion {
    int x;
    int y;

    public multiplicacion(int x, int y);{
        this.x = x;
        this.y = y;
    }

    public int ejecucion(){
        return x*y;
    }
   
    @Override
    public String toString(){
        return "Multiplicacion de x= "+x+" y= "+y;
    }
}
