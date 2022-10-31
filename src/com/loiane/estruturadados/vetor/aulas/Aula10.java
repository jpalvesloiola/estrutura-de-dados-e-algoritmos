package com.loiane.estruturadados.vetor.aulas;

import com.loiane.estruturadados.vetor.Vetor;
import com.loiane.estruturadados.vetor.objetos.Contato;

public class Aula10 {

	public static void main(String[] args) {
		Contato c1 = new Contato("Joao", "jpalve@gmail.com", "8923899");
		Contato c2 = new Contato("Joao2", "jpalve@gmail.com", "8923899");		
		Contato c4 = new Contato("Joao2", "jpalve@gmail.com", "8923899");
		Vetor vetor = new Vetor(5);

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(true);
		vetor.adiciona("F");
		vetor.adiciona(4.3);
		vetor.adiciona(c4);
		
		System.out.println(vetor);
		
		int busca = vetor.busca(c4);
		
		if (busca < 0) {
			System.out.println("Nao existe.");
		}else {
			System.out.println("Elemento, " + vetor.busca(busca) + " foi encontrado.");
		}
		
		System.out.println("Tamanho: " + vetor.tamanho());

	}

}
