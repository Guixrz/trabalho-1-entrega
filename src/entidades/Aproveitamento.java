public class Aproveitamento {
    private Certificado certificado;
    private StatusAproveitamento status;
    private String dataSolicitacao;
    
    public Aproveitamento(Certificado certificado, String dataSolicitacao) {
        this.certificado = certificado;
        this.dataSolicitacao = dataSolicitacao;
        this.status = StatusAproveitamento.PENDENTE; // Status inicial obrigatório
    }

    public Certificado getCertificado() { return certificado; }
    public void setCertificado(Certificado certificado) { this.certificado = certificado; }

    public StatusAproveitamento getStatus() { return status; }
    public void setStatus(StatusAproveitamento status) { this.status = status; }

    public String getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(String dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }
}