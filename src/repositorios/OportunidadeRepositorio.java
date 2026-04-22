package repositorios;

import entidades.Oportunidade;

import java.util.ArrayList;
import java.util.List;

public class OportunidadeRepositorio {

    private List<Oportunidade> oportunidades = new ArrayList<>();

    public void salvar(Oportunidade oportunidade) {
        oportunidades.add(oportunidade);
    }

    public Oportunidade buscarTitulo(String titulo) {
        for(Oportunidade oportunidade : oportunidades) {
            if(oportunidade.getTitulo().equals(titulo)) {
                return oportunidade;
            }
        }
        return null;
    }

    public List<Oportunidade> listarOportunidades() {
        return oportunidades;
    }

}
