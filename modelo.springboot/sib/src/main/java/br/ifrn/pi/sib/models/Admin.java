package br.ifrn.pi.sib.models;

import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.*;

@Entity
@Table (name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "email", length = 180, nullable = false)
    private String email;

    @Column(name = "senha", length = 255, nullable = false)
    private String senha;

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
        return senha.substring(0, 3) + "****";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
