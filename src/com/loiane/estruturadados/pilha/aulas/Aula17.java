package com.loiane.estruturadados.pilha.aulas;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula17 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(5); //teste de capacidade
		for (int i = 0; i < 10; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha.estaVazia() ? "Vazia!" : "Nao vazia!");
		System.out.println("Pilha antes: ");
		System.out.println(pilha);
		System.out.println("Desempilha : " + pilha.desempilha());
		System.out.println("Pilha depois: ");
		System.out.println(pilha);
	}
	
}
