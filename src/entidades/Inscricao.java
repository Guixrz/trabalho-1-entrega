package entidades;

import entidades.enums.Status;

import java.time.LocalDate;

public class Inscricao {
    private Oportunidade oportunidade;
    private Discente discente;
    private Status status;
    private String motivacao;
    private LocalDate dataAprovacao;

    public Inscricao(Oportunidade o,Discente d){
        this.oportunidade = o;
        this.discente = d;
    }

    public Inscricao(Oportunidade oportunidade, Discente discente, Status status, String motivacao) {
        this.oportunidade = oportunidade;
        this.discente = discente;
        this.status = status;
        this.motivacao = motivacao;
    }

    public Oportunidade getOportunidade() {
        return oportunidade;
    }

    public Discente getDiscente() {
        return discente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMotivacao() {
        return motivacao;
    }

    public LocalDate getDataAprovacao() {
        return dataAprovacao;
    }

    public void aprovar(LocalDate data){
        this.status = Status.publicada;
        this.dataAprovacao = data;
    }

    public void rejeitar(){
        this.status = Status.cancelada;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "oportunidade=" + oportunidade +
                ", discente=" + discente +
                ", status=" + status +
                ", motivacao='" + motivacao + '\'' +
                ", dataAprovacao=" + dataAprovacao +
                '}';
    }
}
