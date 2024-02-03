package Semana1.ProgramaRealizados.Herencia;

public class suma {
    int x;
    int y;

    public suma(int x, int y);{
        this.x = x;
        this.y = y;
    }

    public int ejecucion(){
        return x+y;
    }
   
    @Override
    public String toString(){
        return "Suma de x= "+x+" y= "+y;
    }
        //Cuando se herda se puede poner un metodo en el"Padre" para el hijo se debe de poner el mismo o uno mas permisivo en la jerarquia
        //        MAS PERMISIVO -> MENOS PERMISIVO
        // Jerarquia public -> protected -> default -> private

}
