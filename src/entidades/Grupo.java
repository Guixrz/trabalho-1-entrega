package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.StatusGrupo;

public class Grupo {
    private int id;
    private String nome;
    private String tipo;
    private String email;
    private String descricao;
    private StatusGrupo statusGrupo;
    private int docenteresponsavelId;
    private List<GrupoMembro> membros;

    

    public Grupo(int id, String nome, String tipo, String email, String descricao, StatusGrupo statusGrupo, int docenteresponsavelId ) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.email = email;
        this.descricao = descricao;
        this.statusGrupo = statusGrupo;
        this.docenteresponsavelId = docenteresponsavelId;
        this.membros = new ArrayList<>();
    }
    public int getId() {
        return id;
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
    public StatusGrupo getStatusGrupo() {
        return statusGrupo;
    }
    public void setStatusGrupo(StatusGrupo statusGrupo) {
        this.statusGrupo = statusGrupo;
    }
    public int getDocenteresponsavelId() {
        return docenteresponsavelId;
    }
    public void setDocenteresponsavelId(int docenteresponsavelId) {
        this.docenteresponsavelId = docenteresponsavelId;
    }
    public List<GrupoMembro> getMembros() {
        return membros;
    }
    public void setMembros(List<GrupoMembro> membros) {
        this.membros = membros;
    }
    
}

