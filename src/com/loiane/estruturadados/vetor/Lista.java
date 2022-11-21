package com.loiane.estruturadados.vetor;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {
	
	public Lista() {
		super();
	}
	
	/**
	 * @param capacidade
	 */
	public Lista(int capacidade) {
		super(capacidade);
	}

	/**
	 * Adiciona elemento ao final do vetor
	 * 
	 * @param elemento
	 */
	public void adiciona(T elemento) {
		super.adiciona(elemento);
	}

	/**
	 * Adiciona elemento na posição desejada do vetor. Sobrecarga do metodo
	 * anterior.
	 * 
	 * @param elemento
	 * @param posicao
	 */
	public void adiciona(T elemento, int posicao) {
		super.adiciona(elemento, posicao);
	}
}
