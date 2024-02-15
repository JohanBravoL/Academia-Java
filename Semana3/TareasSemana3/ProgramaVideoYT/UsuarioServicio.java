package Semana3.TareasSemana3.ProgramaVideoYT;
import java.util.HashMap;

public class UsuarioServicio {
    private final HashMap<Long, UsuarioDto> usuarios = new HashMap<>();

    public UsuarioDto crearusuario(Long id, String nombre){
            usuarios.put(id, new UsuarioDto(id, nombre));
            return usuarios.get(id);
    }

    public UsuarioDto obtenerUsuario(Long id){
        return usuarios.get(id);
    }

    public UsuarioDto actualizarusuario(Long id, String nombre){
        return usuarios.put(id, new UsuarioDto(id, nombre));
    }


}
