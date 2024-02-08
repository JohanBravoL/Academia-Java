package Semana1.TareasSemana1.Singleton;

public class Singleton {
    public static void main(String[] args) {
        
        carro cont1 = carro.getInstance();

        cliente venta1 = new cliente("Volkswagen",cont1);
        //cliente venta2 = new cliente("Chevrolet",cont1);

        carro cont2 = carro.getInstance();
        cliente venta3 = new cliente("BMW", cont2);
            //Si ambos valores se comparan y quedan de la forma null == null la consola saldra con ture
        System.out.println(venta1.cont1 == venta3.cont1);
        System.out.println(carro.c1);

        carro cont999999 = carro.getInstance();
        cliente venta9999 = new cliente("KIA", cont999999);

            //Por lo que ahora si apesar de tener n numeros de carro y clientes el numero de objetos creado en el Singleton no aumentara
        System.out.println(venta1.cont1 == venta9999.cont1);
        System.out.println(carro.c1);
    }
}
