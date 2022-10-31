package com.loiane.estruturadados.vetor.aulas;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.objetos.Contato;

public class Aula12 {
	public static void main(String[] args) {
		
		Contato c1 = new Contato("Joao", "jpalve@gmail.com", "8923899");
		Contato c2 = new Contato("Joao2", "jpalve@gmail.com", "8923899");		
		Contato c3 = new Contato("Joao2", "jpalve@gmail.com", "8923899");
		
		ArrayList<Contato> arrayList = new ArrayList<>();
		
		arrayList.add(c1);
		arrayList.add(c2);
		arrayList.add(c3);
		
		arrayList.contains(c1);
		
		int posicao = arrayList.indexOf(c1);
		if (posicao < 0) {
			System.out.println("Nao existe!");
		}else {
			System.out.println("Posicao: " + posicao);
		}
		
		arrayList.remove(posicao);
		
		int tamanho = arrayList.size();
		
		System.out.println(tamanho);
		
	}
}
