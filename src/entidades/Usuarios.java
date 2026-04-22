package entidades;

import entidades.enums.Papel;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

    private String nome;
    private String email;
    private String senha;
    private Papel papel;
    private boolean ativo=false;
    private List<Oportunidade>  oportunidades =  new ArrayList<Oportunidade>();

    public Usuarios(String nome, String email, String senha, Papel papel) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.papel = papel;
        this.ativo=true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void mudarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    //public List<Oportunidade> obterOportunidade(){}


}
