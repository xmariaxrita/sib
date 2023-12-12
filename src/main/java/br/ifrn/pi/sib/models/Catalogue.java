package br.ifrn.pi.sib.models;

import jakarta.persistence.*;

@Entity
@Table(name = "acervo")
public class Catalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "autor")
    private String autor;

    @Column(name = "classificacao_indicativa")
    private int classificacao_indicativa;

    @Column(name = "lancamento")
    private int lancamento;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "codigo")
    private int codigo;

    public Catalogue(int id, String autor, int classificacao_indicativa, int lancamento, String titulo, int codigo) {
        this.id = id;
        this.autor = autor;
        this.classificacao_indicativa = classificacao_indicativa;
        this.lancamento = lancamento;
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public Catalogue() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getClassificacao_indicativa() {
        return classificacao_indicativa;
    }

    public void setClassificacao_indicativa(int classificacao_indicativa) {
        this.classificacao_indicativa = classificacao_indicativa;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
