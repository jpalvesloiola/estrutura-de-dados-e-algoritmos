package com.loiane.estruturadados.pilha.labs;

import java.util.Objects;

public class Livro {
    String nome;
    int ano;
    String autor;
    String isbn;

    public Livro(String nome, int ano, String autor, String isbn) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return isbn.equals(livro.isbn) && Objects.equals(nome, livro.nome) && Objects.equals(ano, livro.ano) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, autor, isbn);
    }
}
