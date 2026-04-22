package servicos;

import entidades.Docente;
import entidades.Oportunidade;
import entidades.enums.Status;
import repositorios.OportunidadeRepositorio;

import java.util.ArrayList;
import java.util.List;

public class OportunidadeService {

    private OportunidadeRepositorio repositorio;

    public OportunidadeService(OportunidadeRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Oportunidade> listarAbertas() {
        List<Oportunidade> abertas = new ArrayList<>();

        for(Oportunidade o : repositorio.listarOportunidades()) {
            if(o.getStatus() == Status.em_progresso) {
                abertas.add(o);
            }
        }

        return abertas;
    }

    public void mostrarOportunidades() {
        List<Oportunidade> lista = listarAbertas();
        if (lista.isEmpty()) {
            System.out.println("nenhuma oportunidade disponivel");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            Oportunidade o = lista.get(i);
            System.out.println("[" + i + "] " + o.getTitulo()
                    + " | " + o.getTipo()
                    + " | Vagas: " + o.getVagas());
        }
    }

    public void aprovar(Oportunidade oportunidade, Docente docente) {
        if(oportunidade.getStatus() != Status.pendente) {
            System.out.println("oportunidade nao esta pendente");
        }

        oportunidade.publicar();
        System.out.println("oportunidade aprovada por " + docente.getNome());
    }

    public void rejeitar(Oportunidade oportunidade, Docente docente) {
        oportunidade.fecharInscricao();
        System.out.println("oportunidade rejeitada por " + docente.getNome());
    }

    public List<Oportunidade> listarPendentes() {
        List<Oportunidade> pendentes = new ArrayList<>();
        for (Oportunidade o : repositorio.listarOportunidades()) {
            if (o.getStatus() == Status.pendente) {
                pendentes.add(o);
            }
        }
        return pendentes;
    }

    public void mostrarPendentes() {
        List<Oportunidade> lista = listarPendentes();
        if (lista.isEmpty()) {
            System.out.println("nenhuma oportunidade pendente");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            Oportunidade o = lista.get(i);
            System.out.println(i + "-" + o.getTitulo() + " | submetida por: " + o.getAutor().getNome());
        }
    }

    public void mostrarTodasOportunidades() {
        List<Oportunidade> lista = repositorio.listarOportunidades();
        if (lista.isEmpty()) {
            System.out.println("nenhuma oportunidade encontrada.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            Oportunidade o = lista.get(i);
            System.out.println("[" + i + "] " + o.getTitulo()
                    + " | " + o.getTipo()
                    + " | Status: " + o.getStatus()
                    + " | Autor: " + o.getAutor().getNome());
        }
    }

    public void salvar(Oportunidade oportunidade) {
        repositorio.salvar(oportunidade);
    }
}
