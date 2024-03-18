package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> livros = new Pilha<>();

        Livro livro1 = new Livro("Java Efetivo", 1996, "Joshua", "1234df34rf");
        Livro livro2 = new Livro("Código limpo", 1998, "Cambrigde", "23d23dde1d14");
        Livro livro3 = new Livro("Design Patterns", 2010, "Seya", "345f345fcch4");
        Livro livro4 = new Livro("Refactoring", 1800, "Castor", "h67566yjyj");
        Livro livro5 = new Livro("SOLID", 2020, "Atila", "ftgyrftgrftgrtyh");


        System.out.println("Empilhando...");

        livros.empilha(livro1);
        livros.empilha(livro2);
        livros.empilha(livro3);
        livros.empilha(livro4);
        livros.empilha(livro5);

        System.out.println("Pilha está vazia? " + (livros.estaVazia() ? "Sim" : "Não"));

        System.out.println("O primeiro livro é " + livros.topoPilha());

        System.out.println(livros.getTamanho() + " livros empilhados.");

        System.out.println("Todos os livros: " + livros);

        System.out.println("Esvaziando a pilha...");

        while (!livros.estaVazia()){
            livros.desempilha();
        }

        System.out.println("Pilha está vazia? " + (livros.estaVazia() ? "Sim" : "Não"));
    }
}
