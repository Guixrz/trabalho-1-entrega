package entidades;

import entidades.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private String tipo;
    private String email;
    private String descricao;
    private Status statusGrupo;
    private Docente responsavel;
    private List<Usuarios> membros = new ArrayList<>();



    public Grupo(String nome, String tipo, String email, String descricao, Status statusGrupo, Docente responsavel) {
        this.nome = nome;
        this.tipo = tipo;
        this.email = email;
        this.descricao = descricao;
        this.statusGrupo = statusGrupo;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return statusGrupo;
    }

    public void setStatus(Status status) {
        this.statusGrupo = status;
    }

    public Docente getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Docente responsavel) {
        this.responsavel = responsavel;
    }

    public List<Usuarios> getMembros() {
        return membros;
    }

    public void adicionarMembro(Usuarios usuario) {
        this.membros.add(usuario);
    }

    public void removerMembro(Usuarios usuario) {
        this.membros.remove(usuario);
    }

}

