package entidades;

import entidades.enums.Modalidade;
import entidades.enums.Status;
import entidades.enums.Tipo;

import java.time.LocalDateTime;

public class Oportunidade {
    private String titulo;
    private String descricao;
    private Tipo tipo;
    private Modalidade modalidade;
    private int cargaHoraria;
    private int vagasDisponiveis;
    private Status status;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Usuarios autor;
    private Docente responsavel;

    public Oportunidade(String titulo, String descricao, Tipo tipo, Modalidade modalidade,
                        int cargaHoraria, int vagasDisponiveis, Status status, LocalDateTime inicio,
                        Usuarios autor, Docente responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.modalidade = modalidade;
        this.cargaHoraria = Oportunidade.this.cargaHoraria;
        this.vagasDisponiveis = Oportunidade.this.vagasDisponiveis;
        this.status = status;
        this.inicio = inicio;
        this.autor = autor;
        this.responsavel = responsavel;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public int getCarga_horaria() {
        return cargaHoraria;
    }

    public int getVagas() {
        return vagasDisponiveis;
    }

    public void setVagas(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Usuarios getAutor() {
        return autor;
    }

    public Usuarios getResponsavel() {
        return responsavel;
    }

    public void publicar() {
        this.status = Status.publicada;
    }

    public void fecharInscricao() {
        this.status = Status.encerrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oportunidade)) return false;
        Oportunidade op = (Oportunidade) o;
        return this.titulo.equals(op.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }

    @Override
    public String toString() {
        return "Oportunidade{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", modalidade=" + modalidade +
                ", cargaHoraria=" + cargaHoraria +
                ", vagasDisponiveis=" + vagasDisponiveis +
                ", status=" + status +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", autor=" + autor +
                ", responsavel=" + responsavel +
                '}';
    }
}