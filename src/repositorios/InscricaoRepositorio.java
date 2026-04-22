package repositorios;

import entidades.Discente;
import entidades.Inscricao;
import entidades.Oportunidade;

import java.util.ArrayList;
import java.util.List;

public class InscricaoRepositorio {

    private List<Inscricao> inscricoes =  new ArrayList<>();

    public void salvar(Inscricao inscricao){
        inscricoes.add(inscricao);
    }

    public List<Inscricao> buscarDiscente(Discente discente){
        List<Inscricao> resultado = new ArrayList<>();

        for(Inscricao i : inscricoes){
            if(i.getDiscente().equals(discente)){
                resultado.add(i);
            }
        }
        return resultado;
    }

    public Inscricao buscarDiscenteOportunidade(Discente d, Oportunidade o) {
        for (Inscricao i : inscricoes) {
            if (i.getDiscente().equals(d) && i.getOportunidade().equals(o)) return i;
        }
        return null;
    }

}
