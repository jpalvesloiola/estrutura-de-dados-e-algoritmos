package com.loiane.estruturadados.pilha.aulas;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula16 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>(5); //teste de capacidade
		
		for (int i = 0; i < 10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println("Topo da pilha: " + pilha.topoPilha());
	}
	
}
