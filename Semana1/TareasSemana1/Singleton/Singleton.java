package Semana1.TareasSemana1.Singleton;

public class Singleton {
    public static void main(String[] args) {
        
        carro cont1 = new carro("Sedan");

        cliente venta1 = new cliente("Volkswagen",cont1);
        cliente venta2 = new cliente("Chevrolet",cont1);

        System.out.println(venta1.cont1 == venta2.cont1);

    }
}
