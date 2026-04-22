package servicos;

import entidades.Docente;
import entidades.Grupo;
import entidades.enums.Responsavel_tipo;
import entidades.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class GrupoService {

    private List<Grupo> grupos = new ArrayList<>();

    public void cadastrar(String nome, String tipo, String email, String descricao,
                          Docente responsavel) {
        Grupo grupo = new  Grupo(nome, tipo, email, descricao, Status.rascunho, responsavel);
        grupos.add(grupo);
        System.out.println("grupo cadastro");
    }

    public void encerrar(Grupo grupo) {
        grupo.setStatus(Status.cancelada);
        System.out.println("grupo encerrado");
    }

    public void listarAtivos() {
        for(Grupo g : grupos){
            if(g.getStatus() == Status.publicada){
                System.out.println("- " + g.getNome()
                        + " | Resp.: " + g.getResponsavel().getNome()
                        + " | " + g.getTipo());
            }
        }
    }

    public void aprovarSolicitacao(Grupo grupo) {
        grupo.setStatus(Status.publicada);
        System.out.println("grupo aprovado");
    }

    public List<Grupo> listarTodos() { return grupos; }

}
