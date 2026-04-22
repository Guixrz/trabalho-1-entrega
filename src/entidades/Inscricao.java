package entidades;

import entidades.enums.Status;

public class Inscricao {
    private int id;
    private Oportunidade oportunidade;
    private String dataInscricao;
    private Status status;

    public Inscricao(int id, Oportunidade oportunidade, String dataInscricao, Status status) {
        this.id = id;
        this.oportunidade = oportunidade;
        this.dataInscricao = dataInscricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Oportunidade getOportunidade() {
        return oportunidade;
    }

    public void setOportunidade(Oportunidade oportunidade) {
        this.oportunidade = oportunidade;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void aprovar(){
        this.status = Status.APROVADA;
    }

    public void rejeitar(){
        this.status = Status.REJEITADA;
    }


    @Override
    public String toString() {
        return "entidades.Inscricao{" +
                "id=" + id +
                ", oportunidade=" + oportunidade +
                ", dataInscricao='" + dataInscricao + '\'' +
                ", status=" + status +
                '}';
    }
}
