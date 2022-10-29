package com.loiane.estruturadados.vetor.aulas;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula08 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		vetor.adiciona("A", 1);
		
		System.out.println(vetor);
	}
}
