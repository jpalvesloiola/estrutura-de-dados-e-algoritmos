package com.loiane.estruturadados.pilha.aulas;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula13 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(10);
		
		for (int i = 0; i < 15; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha.getTamanho());
	}
	
}
