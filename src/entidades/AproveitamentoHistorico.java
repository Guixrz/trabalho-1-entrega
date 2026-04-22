import entidades.Enums.StatusAproveitamento;

public class AproveitamentoHistorico {
    private String dataAlteracao;
    private StatusAproveitamento statusAnterior;
    private StatusAproveitamento statusNovo;
    private String observacao;

    public AproveitamentoHistorico(String dataAlteracao, StatusAproveitamento statusAnterior, StatusAproveitamento statusNovo, String observacao) {
        this.dataAlteracao = dataAlteracao;
        this.statusAnterior = statusAnterior;
        this.statusNovo = statusNovo;
        this.observacao = observacao;
    }

    public String getDataAlteracao() { return dataAlteracao; }
    public StatusAproveitamento getStatusAnterior() { return statusAnterior; }
    public StatusAproveitamento getStatusNovo() { return statusNovo; }
    public String getObservacao() { return observacao; }
}