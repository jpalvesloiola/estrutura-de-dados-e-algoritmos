package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.VetorDinamico;

public class Exer05 {

	public static void main(String[] args) {

		VetorDinamico<String> vetor = new VetorDinamico<>(5);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("A");

		vetor.limpa();

		System.out.println(vetor);

	}

}
