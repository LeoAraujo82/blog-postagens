package com.blog.postagens.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "autor_id") // Cria a chave estrangeira na tabela de postagens
//    private List<Postagem> postagens = new ArrayList<>();

    // Construtor padrão
    public Autor() {}

    // Construtor com argumentos (opcional)
    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters
    public Long getId() {
        return id;
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

//    public List<Postagem> getPostagens() {
//        return postagens;
//    }
//    public void setPostagens(List<Postagem> postagens) {
//        this.postagens = postagens;
//    }
}
