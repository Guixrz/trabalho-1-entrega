public class PlanoAtividade {

    private int id;
    private String descricao;
    private int horasPrevistas;
    private String observacao;

    public PlanoAtividade(int id, String descricao, int horasPrevistas, String observacao) {
        this.id = id;
        this.descricao = descricao;
        this.horasPrevistas = horasPrevistas;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHorasPrevistas() {
        return horasPrevistas;
    }

    public void setHorasPrevistas(int horasPrevistas) {
        this.horasPrevistas = horasPrevistas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "PlanoAtividade{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", horasPrevistas=" + horasPrevistas +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
