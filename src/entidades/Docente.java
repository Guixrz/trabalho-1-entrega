package entidades;

import entidades.enums.Papel;
import entidades.enums.Status;
import entidades.enums.Tipo;
import entidades.enums.Modalidade;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Docente extends Usuarios{

    private String siape;
    private String departamento;

    public Docente(String nome, String email, String senha, Papel papel,String siape, String departamento) {
        super(nome, email, senha, papel);
        this.siape = siape;
        this.departamento = departamento;
    }

    public String getSiepe() {
        return siape;
    }

    public void setSiepe(String siape) {
        this.siape = siape;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Oportunidade criarOportunidade(String titulo, String descricao, Tipo tipo,
                                         Modalidade modalidade, int cargaHoraria,
                                         int vagas, LocalDate dataInicio) {
        LocalDateTime dataInicioDateTime = dataInicio.atStartOfDay();

        // Criar oportunidade com status PENDENTE (aguardando aprovação)
        Oportunidade oportunidade = new Oportunidade(titulo, descricao, tipo, modalidade,
                cargaHoraria, vagas, Status.pendente, dataInicioDateTime, this,
            this);

        return oportunidade;
    }

    public void registrarPlanoAtividade(Oportunidade oportunidade, LocalDate dataInicio) {
        if (oportunidade == null) {
            System.out.println("oportunidade nao existe");
            return;
        }

        if (!oportunidade.getResponsavel().equals(this) && !oportunidade.getAutor().equals(this)) {
            System.out.println("sem permissao");
            return;
        }
        if (dataInicio.isBefore(LocalDate.now())) {
            System.out.println("a data de início não pode ser anterior a hoje");
            return;
        }

        LocalDateTime dataInicioDateTime = dataInicio.atStartOfDay();

        oportunidade.setInicio(dataInicioDateTime);

        System.out.println("plano de atividade registrado com sucesso para: " + oportunidade.getTitulo());
        System.out.println("data de início: " + dataInicio);
    }
}
