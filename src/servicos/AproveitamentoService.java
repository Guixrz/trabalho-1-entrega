package servicos;

import entidades.Aproveitamento;
import entidades.Discente;
import entidades.Usuarios;
import entidades.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class AproveitamentoService {

    private List<Aproveitamento> solicitacoes = new ArrayList<>();

    public void submeter(Discente discente,String descricao,String instituicao,int horas){
        Aproveitamento ap = new Aproveitamento(discente,descricao,instituicao,horas);

        ap.setStatus(Status.pendente);
        solicitacoes.add(ap);

        System.out.println("aproveitamento realizado com sucesso!");

    }

    public void listarPendentes() {
        for(Aproveitamento ap : solicitacoes){
            if(ap.getStatus()== Status.pendente) {
                System.out.println("- " + ap.getDiscente().getNome()
                        + " | " + ap.getDescricao()
                        + " | " + ap.getHoras() + "h");
            }
        }
    }

    public void aprovar(Aproveitamento ap, Usuarios avaliador) {
        ap.aprovar(avaliador);
        System.out.println("Aproveitamento aprovado para: "
                + ap.getDiscente().getNome());
    }

    public void rejeitar(Aproveitamento ap, Usuarios avaliador, String motivo) {
        ap.rejeitar(avaliador, motivo);
        System.out.println("Aproveitamento rejeitado. Motivo: " + motivo);
    }

}
