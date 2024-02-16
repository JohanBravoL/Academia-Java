package Semana3.TareasSemana3.ProgramaVideoYT;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class UsuarioServicioTest {
    
    @DisplayName ("Test de que se creen los usuarios de forma adecuada")
    @Test
    public void Test1(){
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        UsuarioServicio usuarioServicio1 = new UsuarioServicio();
        final UsuarioDto resultado = 
            usuarioServicio1.crearusuario(1L, "Prueba");
        Assertions.assertEquals(esperado, resultado);
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre);
    }

    @Test
    public void Test2(){
        UsuarioDto esperado = new UsuarioDto(1L, "nombre");
        UsuarioServicio usuarioServicio2 = new UsuarioServicio();
        final UsuarioDto res = usuarioServicio2.crearusuario(1L, "Prueba");
        Assertions.assertNotEquals(esperado, res);
        Assertions.assertEquals(esperado.id, res.id);
        Assertions.assertNotEquals(esperado.nombre, res.nombre, "Los nombres no son iguales");
    }

    @Test
    public void Test3(){
        UsuarioDto esperado = new UsuarioDto(1L, "nombre");
        UsuarioServicio usuarioServicio2 = new UsuarioServicio();
        final UsuarioDto res = usuarioServicio2.obtenerUsuario(1L);
        Assertions.assertEquals(null, res);
    }

    @Test
    public void Test4(){
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        UsuarioServicio usuarioServicio2 = new UsuarioServicio();
        usuarioServicio2.crearusuario(1L, "Prueba");
        final UsuarioDto res = usuarioServicio2.obtenerUsuario(1L);
        Assertions.assertEquals(esperado, res);
    }
}
