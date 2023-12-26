package br.ifrn.pi.sib.models;

import jakarta.persistence.*;

@Entity
@Table(name = "acervo")
public class Catalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "colecao")
    private String colecao;

    @Column(name = "volume")
    private int volume;

    @Column(name = "editora")
    private String editora;

    @Column(name = "lancamento")
    private int lancamento;

    @Column(name = "edicao")
    private int edicao;

    @Column(name = "anoEdicao")
    private int anoEdicao;

    @Column(name = "txtNumPaginas")
    private int txtNumPaginas;

    @Column(name = "classificacao_indicativa")
    private int classificacao_indicativa;

    @Column(name = "genero")
    private String genero;

    @Column(name = "isbn10")
    private String isbn10;

    @Column(name = "isbn13")
    private String isbn13;

    @Column(name = "copias")
    private int copias;

    @Column(name = "sinopse")
    private String sinopse;


    public Catalogue() {
    }

    public Catalogue(int id, String titulo, String autor, String colecao, int volume, String editora, int lancamento, int edicao, int anoEdicao, int txtNumPaginas, int classificacao_indicativa, String genero, String isbn10, String isbn13, int copias, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.colecao = colecao;
        this.volume = volume;
        this.editora = editora;
        this.lancamento = lancamento;
        this.edicao = edicao;
        this.anoEdicao = anoEdicao;
        this.txtNumPaginas = txtNumPaginas;
        this.classificacao_indicativa = classificacao_indicativa;
        this.genero = genero;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.copias = copias;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public int getTxtNumPaginas() {
        return txtNumPaginas;
    }

    public void setTxtNumPaginas(int txtNumPaginas) {
        this.txtNumPaginas = txtNumPaginas;
    }

    public int getClassificacao_indicativa() {
        return classificacao_indicativa;
    }

    public void setClassificacao_indicativa(int classificacao_indicativa) {
        this.classificacao_indicativa = classificacao_indicativa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


}
