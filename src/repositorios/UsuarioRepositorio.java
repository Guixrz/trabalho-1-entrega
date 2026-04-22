package repositorios;

import entidades.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

    private List<Usuarios> usuarios = new ArrayList<>();

    public void salvar(Usuarios usuario) {
        usuarios.add(usuario);
    }

    public Usuarios buscarEmail(String email) {
        for(Usuarios usuario : usuarios) {
            if(usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuarios> listarUsuarios() {
        return usuarios;
    }

}
