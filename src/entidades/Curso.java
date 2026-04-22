package entidades;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private String versaoPPC;


    public Curso(String nome, int codigo, int cargaHoraria, String versao_ppc) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.versaoPPC = versao_ppc;
    }

    public void atualizarPPC(int horas,String versao){
        this.cargaHoraria = horas;
        this.versaoPPC = versao;
    }

    public int getId(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public String getVersaoPPC(){
        return versaoPPC;
    }

    public void setVersaoPPC(String versaoPPC){
        this.versaoPPC = versaoPPC;
    }
}
