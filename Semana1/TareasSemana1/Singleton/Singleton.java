package Semana1.TareasSemana1.Singleton;

public class Singleton {
    public static void main(String[] args) {
        
        carro cont1 = carro.getInstance();

        cliente venta1 = new cliente("Volkswagen",cont1);
        cliente venta2 = new cliente("Chevrolet",cont1);

        carro cont2 = carro.getInstance();
        cliente venta3 = new cliente("BMW", cont2);

        System.out.println(venta1.cont1 == venta3.cont1);
        System.out.println(carro.c1);
    }
}
