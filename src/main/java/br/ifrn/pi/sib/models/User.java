package br.ifrn.pi.sib.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
    @Table(name = "users")
    public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private int id;

        @Column(name = "nome")
            private String nome;

        @Column(name = "email")
        private String email;

        @Column(name = "senha")
        private String senha;

        @Column(name = "data_nascimento")
        private Date dataNascimento;

        @Column(name = "cpf")
        private String cpf;

        @Column(name = "id_responsavel")
        private String idResponsavel;

    public User(int id, String nome, String email, String senha, Date dataNascimento, String cpf, String idResponsavel) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.idResponsavel = idResponsavel;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
}
