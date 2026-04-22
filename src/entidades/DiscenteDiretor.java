package entidades;

import java.time.LocalDate;

public class DiscenteDiretor {
    private int id;
    private int discenteId;
    private Grupo grupo;
    private String cargo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    
    public DiscenteDiretor(int id, int discente, Grupo grupo, String cargo, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.discenteId = discente;
        this.grupo = grupo;
        this.cargo = cargo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public int getDiscente() {
        return discenteId;
    }

    public void setDiscente(int discente) {
        this.discenteId = discente;
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
    
}

