package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

//	public void adiciona(String elemento) {
//		for (int i = 0; i < elementos.length; i++) {
//			if (elementos[i] == null) {
//				elementos[i] = elemento;
//				break;
//			}
//		}
//	}

	public void adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new IndexOutOfBoundsException("Tamanho excedido!");
		}
		
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "]";
	}
}
