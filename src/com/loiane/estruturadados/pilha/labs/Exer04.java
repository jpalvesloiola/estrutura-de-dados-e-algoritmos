package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> livros = new Stack<>();

        Livro livro1 = new Livro("Java Efetivo", 1996, "Joshua", "1234df34rf");
        Livro livro2 = new Livro("Código limpo", 1998, "Cambrigde", "23d23dde1d14");
        Livro livro3 = new Livro("Design Patterns", 2010, "Seya", "345f345fcch4");
        Livro livro4 = new Livro("Refactoring", 1800, "Castor", "h67566yjyj");
        Livro livro5 = new Livro("SOLID", 2020, "Atila", "ftgyrftgrftgrtyh");


        System.out.println("Empilhando...");

        livros.push(livro1);
        livros.push(livro2);
        livros.push(livro3);
        livros.push(livro4);
        livros.push(livro5);

        System.out.println("Pilha está vazia? " + (livros.isEmpty() ? "Sim" : "Não"));

        System.out.println("O primeiro livro é " + livros.peek());

        System.out.println(livros.size() + " livros empilhados.");

        System.out.println("Todos os livros: " + livros);

        System.out.println("Esvaziando a pilha...");

        while (!livros.isEmpty()){
            livros.pop();
        }


        System.out.println("Pilha está vazia? " + (livros.isEmpty() ? "Sim" : "Não"));
    }
}
