package entidades;

import java.time.LocalDate;

public class GrupoMembro {
    private int id;
    private Grupo grupo;
    private int usuarioId;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public GrupoMembro(int id, Grupo grupo, int usuarioId, LocalDate dataEntrada, LocalDate dataSaida) {
        this.id = id;
        this.grupo = grupo;
        this.usuarioId = usuarioId;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    public int getId(){
        return id;
    }
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    
    
}

