package entidades;

import entidades.Discente;
import entidades.Usuarios;
import entidades.enums.Status;

public class Aproveitamento {

    private Discente discente;
    private String descricao;
    private String instituicao;
    private int horas;
    private Status status;
    private String certificado_path;
    private Usuarios avaliador;
    private String motivo_rejeicao;

    public Aproveitamento(Discente discente,String descricao,String instituicao,
                          int horas) {
        this.discente = discente;
        this.descricao = descricao;
        this.instituicao = instituicao;
        this.horas = horas;
    }

    public Aproveitamento(Discente discente,String descricao,String instituicao,
                          int horas,Status status,String certificado_path,
                          Usuarios avaliador,String motivo_rejeicao) {
        this.discente = discente;
        this.descricao = descricao;
        this.instituicao = instituicao;
        this.horas = horas;
        this.status = status;
        this.certificado_path = certificado_path;
        this.avaliador = avaliador;
        this.motivo_rejeicao = motivo_rejeicao;
    }


    public Discente getDiscente() {
        return discente;
    }

    public void setDiscente(Discente discente) {
        this.discente = discente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCertificado_path() {
        return certificado_path;
    }

    public Usuarios getAvaliador() {
        return avaliador;
    }

    public String getMotivo_rejeicao() {
        return motivo_rejeicao;
    }

    public boolean uploadCertificado(String filePath){
        this.certificado_path = filePath;
        return true;
    }

    public void rejeitar(Usuarios avaliador, String motivo_rejeicao) {
        this.avaliador = avaliador;
        this.motivo_rejeicao = motivo_rejeicao;
        this.status = Status.cancelada;
    }

    public void aprovar(Usuarios avaliador ){
        this.avaliador = avaliador;
        this.status = Status.publicada;
    }

}