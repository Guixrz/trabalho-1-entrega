package servicos;

import entidades.Discente;
import entidades.Inscricao;
import entidades.Oportunidade;
import entidades.enums.Status;
import repositorios.InscricaoRepositorio;
import repositorios.OportunidadeRepositorio;

import java.util.List;

public class InscricaoService {

    private InscricaoRepositorio inscricaoRepo;
    private OportunidadeRepositorio oportunidadeRepo;

    public InscricaoService(InscricaoRepositorio inscricaoRepo,
                            OportunidadeRepositorio oportunidadeRepo) {
        this.inscricaoRepo = inscricaoRepo;
        this.oportunidadeRepo = oportunidadeRepo;
    }

    public int inscrever(Discente d, Oportunidade o){

        Inscricao i = inscricaoRepo.buscarDiscenteOportunidade(d,o);
        if(i!=null){
            return -1;
        }

        if (o.getStatus() != Status.publicada && o.getStatus() != Status.em_progresso) { return -1; }

        Inscricao inscricao = new Inscricao(o,d);
        inscricaoRepo.salvar(inscricao);
        return 1;
    }

    public int abandonar(Discente d, Oportunidade o){

        Inscricao i =  inscricaoRepo.buscarDiscenteOportunidade(d,o);

        if(i==null) {
            return -1;
        }

        i.rejeitar();
        return 1;
    }

    public void listarInscricoes(Discente d) {

        List<Inscricao> lista = inscricaoRepo.buscarDiscente(d);

        if(lista.isEmpty()){
            System.out.println("nenhum inscricao encontrada");
            return;
        }

        for(Inscricao i : lista){
            System.out.println("- " + i.getOportunidade().getTitulo()
                    + " | Status: " + i.getStatus());
        }

    }

    public void mostrarInscricoes(Discente d) {
        List<Inscricao> lista = inscricaoRepo.buscarDiscente(d);

        if(lista.isEmpty()){
            System.out.println("nenhuma inscricao encontrada");
            return;
        }

        for(int i = 0; i < lista.size(); i++){
            Inscricao insc = lista.get(i);
            System.out.println(i + "-" + insc.getOportunidade().getTitulo()
                    + " | Status: " + insc.getStatus());
        }
    }

    public List<Inscricao> getInscricoes(Discente d) {
        return inscricaoRepo.buscarDiscente(d);
    }
}
