package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			Pilha<Integer> pilha = new Pilha<>();
			int numero;
			
			for (int i = 0; i < 5; i++) {
			    System.out.println("Digite um número:");
			    numero = scan.nextInt();
			    if (numero % 2 == 0) {
			        pilha.empilha(numero);
			    } else if(pilha.estaVazia()){
			        System.out.println("Sua pilha está vazia!");
			    } else  {
			        System.out.println("Número ímpar! Sua pilha foi reduzida.");
			        pilha.desempilha();
			    }
			}

			System.out.println("\nSua pilha foi conculída: ");
			System.out.println(pilha);

			while (!pilha.estaVazia()) {
			    System.out.println("Desempilhando... " + pilha);
			}
		}
        System.out.println();
        System.out.println("Sua pilha foi esvaziada!");
        
    }
}
