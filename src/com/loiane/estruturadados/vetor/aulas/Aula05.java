package com.loiane.estruturadados.vetor.aulas;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);

		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		vetor.adiciona("Elemento 4");
		vetor.adiciona("Elemento 5");
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
		
		System.out.println(vetor.busca(0));
		
	}
}
