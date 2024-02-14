package Semana3.ProgramasEnSesion.Composite;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

 public class TestComposite{
    @SuppressWarnings("deprecation")
    
    @Test
    public void testSuma()
    {
        double valor1 = 6.0;
        double valor2 = 8.0;
        Component c1 = new LeafConstante(valor1);
        Component c2 = new LeafConstante(valor2);
        Component c3 = new CompositeSuma(c1, c2);
        assertEquals(c3.getValor(),valor1+valor2, 0.0);
    }

    @Test
    public void testResta()
    {
        double valor1 = 6.0;
        double valor2 = 8.0;
        Component c1 = new LeafConstante(valor1);
        Component c2 = new LeafConstante(valor2);
        Component c3 = new CompositeResta(c1, c2);
        assertEquals(c3.getValor(),valor1-valor2, 0.0);
    }

    @Test
    public void testMulti()
    {
        double valor1 = 6.0;
        double valor2 = 8.0;
        Component c1 = new LeafConstante(valor1);
        Component c2 = new LeafConstante(valor2);
        Component c3 = new CompositeMultiplicacion(c1, c2);
        assertEquals(c3.getValor(),valor1*valor2, 0.0);
    }

    @Test
    public void testDiv()
    {
        double valor1 = 6.0;
        double valor2 = 8.0;
        Component c1 = new LeafConstante(valor1);
        Component c2 = new LeafConstante(valor2);
        Component c3 = new CompisiteDiv(c1, c2);
        assertEquals(c3.getValor(),valor1/valor2, 0.05);
    }
}
