package entidades;

public class UCE {
    private int id;
    private PPCHistorico ppcHistorico;
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private String semestreSugerido;

    public UCE(int id, PPCHistorico ppcHistorico, String nome, String codigo, int cargaHoraria, String semestreSugerido){
        this.id = id;
        this.ppcHistorico = ppcHistorico;
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.semestreSugerido = semestreSugerido;

    }

    public int getId() {
        return id;
    }
   
    public PPCHistorico getPpcHistorico() {
        return ppcHistorico;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public String getSemestreSugerido() {
        return semestreSugerido;
    }
    public void setSemestreSugerido(String semestreSugerido) {
        this.semestreSugerido = semestreSugerido;
    }
    
}
