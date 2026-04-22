package entidades;

import entidades.enums.Modalidade;
import entidades.enums.Papel;
import entidades.enums.Status;
import entidades.enums.Tipo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DiscenteDiretor extends  Discente {
    private Grupo grupo;
    private String cargo;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public DiscenteDiretor(String nome, String email, String senha,
                           Papel papel, String matricula, int semestreAtual,
                           Curso curso, Grupo grupo, String cargo,
                           LocalDate dataInicio, LocalDate dataFim) {
        super(nome, email, senha, Papel.discenteDiretor, matricula, semestreAtual, curso);
        this.grupo = grupo;
        this.cargo = cargo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupoId) {
        this.grupo = grupoId;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Oportunidade criarOportunidade(String titulo, String descricao, Tipo tipo,
                                          Modalidade modalidade, int carga_horaria,
                                          int vagas, Status status, LocalDateTime inicio
            , Usuarios autor, Docente responsavel) {
        return new Oportunidade(titulo,descricao,tipo,modalidade,carga_horaria,vagas
                ,status,inicio,autor,responsavel);
    }

}

