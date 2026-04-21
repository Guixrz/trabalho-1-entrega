package entidades;

public class Curso {
    private int id;
    private String nome;
    private int cargaHoraria;
    private String versaoPPC;
    

    public Curso(int id, String nome, int cargaHoraria, String versaoPPC){
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.versaoPPC = versaoPPC;
    }


    public int getId(){
        return id;
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
