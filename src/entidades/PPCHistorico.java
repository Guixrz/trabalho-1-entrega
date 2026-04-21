package entidades;

import java.time.LocalDate;

public class PPCHistorico {
    private int id;
    private Curso curso;
    private String versao;
    private int cargaHorariaExtensao;
    private LocalDate dataVigenciaInicio;
    private LocalDate dataVigenciaFim;
    private String autorAlteracaoId;

   public PPCHistorico(int id, Curso curso, String versao, int cargaHorariaExtensao, LocalDate dataVigenciaInicio, LocalDate dataVigenciaFim, String autorAlteracaoId){
        this.id = id;
        this.curso = curso;
        this.versao = versao;
        this.cargaHorariaExtensao = cargaHorariaExtensao;
        this.dataVigenciaInicio = dataVigenciaInicio;
        this.dataVigenciaFim = dataVigenciaFim;
        this.autorAlteracaoId = autorAlteracaoId;
    }

    public int getId() {
        return id;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String getVersao() {
        return versao;
    }
    public void setVersao(String versao) {
        this.versao = versao;
    }
    public int getCargaHorariaExtensao() {
        return cargaHorariaExtensao;
    }
    public void setCargaHorariaExtensao(int cargaHorariaExtensao) {
        this.cargaHorariaExtensao = cargaHorariaExtensao;
    }
    public LocalDate getDataVigenciaInicio() {
        return dataVigenciaInicio;
    }
    public void setDataVigenciaInicio(LocalDate dataVigenciaInicio) {
        this.dataVigenciaInicio = dataVigenciaInicio;
    }
    public LocalDate getDataVigenciaFim() {
        return dataVigenciaFim;
    }
    public void setDataVigenciaFim(LocalDate dataVigenciaFim) {
        this.dataVigenciaFim = dataVigenciaFim;
    }
    public String getAutorAlteracaoId() {
        return autorAlteracaoId;
    }
    public void setAutorAlteracaoId(String autorAlteracaoId) {
        this.autorAlteracaoId = autorAlteracaoId;
    }

    

}

