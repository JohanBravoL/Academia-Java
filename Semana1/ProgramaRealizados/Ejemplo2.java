package Semana1.ProgramaRealizados;

public class Ejemplo2
 {
    public static void main(String[] args)
    {
        int i = 5;
        String s = "Juan";
        StringBuilder s2 = new StringBuilder("Pedro");

        s = modificador(i,s,s2);

        System.out.println(i);
        System.out.println(s);
        System.out.println(s2);

    }
    private static String modificador (int i, String s, StringBuilder s2)
    {
        i = 8;
        s = s.concat(" Flores");
        s2.append(" Perez");
        return s;
    }
}
