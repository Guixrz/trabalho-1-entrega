package servicos;

import entidades.Usuarios;
import entidades.enums.Papel;
import repositorios.UsuarioRepositorio;

public class PerfilService {

    private UsuarioRepositorio usuarioRepo;

    public PerfilService(UsuarioRepositorio usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public void listarUsuarios() {
        for (Usuarios u : usuarioRepo.listarUsuarios()) {
            System.out.println("- " + u.getNome()
                    + " | " + u.getPapel()
                    + " | Ativo: " + u.isAtivo());
        }
    }

    public void ativar(String email) {
        Usuarios u = usuarioRepo.buscarEmail(email);
        if (u == null) { System.out.println("usuario nao encontrado."); return; }
        u.setAtivo(true);
        System.out.println("usuario ativado: " + u.getNome());
    }

    public void desativar(String email) {
        Usuarios u = usuarioRepo.buscarEmail(email);
        if (u == null) { System.out.println("usuario não encontrado."); return; }
        u.setAtivo(false);
        System.out.println("usuario desativado: " + u.getNome());
    }

    public void alterarPapel(String email, Papel novoPapel) {
        Usuarios u = usuarioRepo.buscarEmail(email);
        if (u == null) { System.out.println("usuario não encontrado."); return; }
        u.setPapel(novoPapel);
        System.out.println("papel alterado para " + novoPapel
                + " — usuario: " + u.getNome());
    }

}
