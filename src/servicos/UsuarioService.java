package servicos;

import entidades.Certificados;
import entidades.Usuarios;
import repositorios.CertificadosRepositorio;
import repositorios.UsuarioRepositorio;

import java.util.List;

import static entidades.enums.Status_assinatura.Assinado;
import static entidades.enums.Status_assinatura.Pendente;

public class UsuarioService {

    private UsuarioRepositorio usuariosRepo;
    private CertificadosRepositorio certificadosRepo;

    public UsuarioService(UsuarioRepositorio usuariosRepo, CertificadosRepositorio certificadosRepo) {
        this.usuariosRepo = usuariosRepo;
        this.certificadosRepo = certificadosRepo;
    }

    public Usuarios login(String email, String senha) {
        Usuarios usuario = usuariosRepo.buscarEmail(email);

        if(usuario==null) {
            System.out.println("usuarios nao encontrado");
            return null;
        }

        if(!usuario.getSenha().equals(senha)) {
            System.out.println("senha incorreta");
            return null;
        }

        if(!usuario.isAtivo()) {
            System.out.println("usuario inativo");
            return null;
        }

        System.out.println("login feito com sucesso! Bem vindo "+ usuario.getNome());
        return usuario;
    }

    public int validarCertificado(String codigo_hash) {
        Certificados certificado = certificadosRepo.buscarHash(codigo_hash);

        if (certificado == null) {
            System.out.println("certificado não encontrado.");
            return 0;   // nao existe
        }

        if (certificado.getAssinatura() == Assinado) {
            System.out.println("certificado válido e assinado.");
            return 1;   // valido
        }

        System.out.println("certificado pendente de assinatura.");
        return -1;      // existe mas ainda nao foi assinado
    }

    public void listarUsuarios() {
        List<Usuarios> lista = usuariosRepo.listarUsuarios();
        if (lista.isEmpty()) {
            System.out.println("nenhum usuário encontrado.");
            return;
        }
        for (Usuarios u : lista) {
            System.out.println("- " + u.getNome() + " | " + u.getEmail() + " | Papel: " + u.getPapel());
        }
    }
}
