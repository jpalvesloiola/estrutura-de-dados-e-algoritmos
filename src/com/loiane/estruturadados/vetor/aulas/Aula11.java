package com.loiane.estruturadados.vetor.aulas;

import com.loiane.estruturadados.vetor.VetorDinamico;
import com.loiane.estruturadados.vetor.objetos.Contato;

public class Aula11 {
	public static void main(String[] args) {
		Contato c1 = new Contato("Joao", "jpalve@gmail.com", "8923899");
		Contato c2 = new Contato("Joao2", "jpalve@gmail.com", "8923899");		
		Contato c3 = new Contato("Joao2", "jpalve@gmail.com", "8923899");
		
		VetorDinamico<Contato> vetor = new VetorDinamico<>(5);

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
	}
}
