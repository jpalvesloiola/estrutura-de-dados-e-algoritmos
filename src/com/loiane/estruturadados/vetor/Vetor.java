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

	/**
	 * Adiciona elemento ao final do vetor
	 * 
	 * @param elemento
	 */
	public void adiciona(String elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}	
	}

	/**
	 * Adiciona elemento em qualquer posição do vetor. Sobrecarga do metodo
	 * anterior.
	 * 
	 * @param elemento
	 * @param posicao
	 */
	public void adiciona(String elemento, int posicao) {
		if (posicao < 0 || posicao > this.elementos.length) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		
		this.aumentaCapacidade();
		
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}

	/**
	 * Caso o array fique cheio este metodo e acionado autmaticamente pelo o
	 * Adiciona().
	 */
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] novoElementos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novoElementos[i] = this.elementos[i];
			}
			this.elementos = novoElementos;
		}
	}

	/**
	 * Obtem elemento em uma posição do vetor
	 * 
	 * @param posicao
	 * @return elemento
	 */
	public String busca(int posicao) {
		if (posicao < 0 || posicao > this.tamanho) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		return this.elementos[posicao];
	}

	/**
	 * Verifica se elemento existe no vetor e retorna a posicao. Sbreescrita do
	 * metodo anterior. Algoritmo de busca sequencial.
	 * 
	 * @param elemento
	 * @return posicao ou -1 se nada for encontrado.
	 */
	public int busca(String elemento) {

		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "Vetor elementos = " + Arrays.toString(elementos);
	}
}
