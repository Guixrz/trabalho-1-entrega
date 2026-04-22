package entidades;

import entidades.enums.Status_assinatura;

import java.time.LocalDate;

public class Certificados {

    private String uuid_hash;
    private Discente discente;
    private Oportunidade oportunidade;
    private LocalDate data_emissao;
    private int horas;
    private String certificado_path;
    private Status_assinatura assinatura;

    private String atividade;
    private String instituicaoEmissora;
    private String assinaturaResponsavel;

    public Certificados(String atividade, int horas, String instituicaoEmissora, String assinaturaResponsavel) {
        this.atividade = atividade;
        this.horas = horas;
        this.instituicaoEmissora = instituicaoEmissora;
        this.assinaturaResponsavel = assinaturaResponsavel;
    }

    public Certificados(String uuid_hash,Discente discente,
                        Oportunidade oportunidade,LocalDate data_emissao,
                        int horas,String certificado_path) {
        this.uuid_hash = uuid_hash;
        this.discente = discente;
        this.oportunidade = oportunidade;
        this.data_emissao = data_emissao;
        this.horas = horas;
        this.certificado_path = certificado_path;
    }

    public Certificados(String uuid_hash, Discente discente,
                        Oportunidade oportunidade, LocalDate data_emissao,
                        int horas, Status_assinatura assinatura) {
        this.uuid_hash = uuid_hash;
        this.discente = discente;
        this.oportunidade = oportunidade;
        this.data_emissao = data_emissao;
        this.horas = horas;
        this.assinatura = assinatura;
    }


    public String getUuid_hash() {
        return uuid_hash;
    }

    public Discente getDiscente() {
        return discente;
    }

    public void setDiscente(Discente discente) {
        this.discente = discente;
    }

    public Oportunidade getOportunidade() {
        return oportunidade;
    }

    public void setOportunidade(Oportunidade oportunidade) {
        this.oportunidade = oportunidade;
    }

    public LocalDate getData_emissao() {
        return data_emissao;
    }

    public String getCertificado_path() {
        return certificado_path;
    }

    public Status_assinatura getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(Status_assinatura assinatura) {
        this.assinatura = assinatura;
    }

    //public image gerarQRCode(){}

    public boolean verificarAutenticidade(String hash) {
        return this.uuid_hash.equals(hash);
    }

    public String getAtividade() { return atividade; }
    public void setAtividade(String atividade) { this.atividade = atividade; }

    public int getCargaHoraria() { return horas; }
    public void setCargaHoraria(int horas) { this.horas = horas; }

    public String getInstituicaoEmissora() { return instituicaoEmissora; }
    public void setInstituicaoEmissora(String instituicaoEmissora) { this.instituicaoEmissora = instituicaoEmissora; }

    public String getAssinaturaResponsavel() { return assinaturaResponsavel; }
    public void setAssinaturaResponsavel(String assinaturaResponsavel) { this.assinaturaResponsavel = assinaturaResponsavel; }
}