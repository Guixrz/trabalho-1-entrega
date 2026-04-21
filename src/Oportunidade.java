import enums.Modalidade;
import enums.TipoOportunidade;

public class Oportunidade {
    private int id;
    private String titulo;
    private String descricao;
    private TipoOportunidade tipo;
    private Modalidade modalidade;
    private int cargaHoraria;
    private int vagasDisponiveis;


    public Oportunidade(int id, String titulo, String descricao, TipoOportunidade tipo, Modalidade modalidade, int cargaHoraria, int vagasDisponiveis) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.modalidade = modalidade;
        this.cargaHoraria = cargaHoraria;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoOportunidade getTipo() {
        return tipo;
    }

    public void setTipo(TipoOportunidade tipo) {
        this.tipo = tipo;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    @Override
    public String toString() {
        return "Oportunidade{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", tipo=" + tipo +
                ", modalidade=" + modalidade +
                ", cargaHoraria=" + cargaHoraria +
                ", vagasDisponiveis=" + vagasDisponiveis +
                '}';
    }
}