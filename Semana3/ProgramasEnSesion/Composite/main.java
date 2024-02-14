package Semana3.ProgramasEnSesion.Composite;

public class main {
    public static void main(String[] args) {
		
		double r;

		Component c1 = new LeafConstante(2.0);
		Component c2 = new LeafConstante(3.0);
		Component c3 = new LeafConstante(4.0);
		Component c4 = new LeafConstante(5.0);
        
        Component c5 = new CompositeResta(c1,c2);
        r = c5.getValor();
        System.out.println(r);

        Component c6 = new CompositeMultiplicacion(c3, c4);
        r = c6.getValor();
        System.out.println(r);

        Component c7 = new CompositeSuma(c5, c6);
        r = c7.getValor();
        System.out.println(r);
	}

}

