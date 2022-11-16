package com.loiane.estruturadados.vetor.aulas;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula15 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(5); //teste de capacidade
		System.out.println(pilha.estaVazia() ? "Vazia!" : "Nao estah vazia");
		System.out.println("Tamanho: " + pilha.tamanho());
		for (int i = 0; i < 10; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha.estaVazia() ? "Vazia!" : "Nao vazia!");
		System.out.println("Tamanho: " + pilha.tamanho());
	}
	
}
