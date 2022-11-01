package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.VetorDinamico;

public class Exer03 {

	public static void main(String[] args) {

		VetorDinamico<String> vetor = new VetorDinamico<>(5);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("A");

		System.out.println(vetor);

		vetor.remove("A");

		System.out.println(vetor);

		vetor.remove("A");

		System.out.println(vetor);

	}

}
