package com.loiane.estruturadados.vetor.aulas;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula10 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);

		vetor.adiciona(10);
		vetor.adiciona("B");
		vetor.adiciona(true);
		vetor.adiciona("F");
		vetor.adiciona(4.3);
		
		System.out.println(vetor);
		
		System.out.println("Remover elemento B:");
		
		int posicao = vetor.busca("B");
		
		if (posicao >= 0) {
			vetor.remove(posicao);
		} else {
			System.out.println("Elemento nao existe no Vetor!");
		}
		
		System.out.println(vetor);

	}

}
