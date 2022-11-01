package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.VetorDinamico;

public class Exer01 {

	public static void main(String[] args) {

		VetorDinamico<String> vetor = new VetorDinamico<>(5);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");

		System.out.println(vetor.contem("A") ? "Contem" : "Nao contem");
		System.out.println(vetor.contem("B") ? "Contem" : "Nao contem");
		System.out.println(vetor.contem("D") ? "Contem" : "Nao contem");

	}

}
