package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{

	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}

	/**
	 * Adiciona o elemento na pilha jogano-o para a última posição
	 * 
	 * @param elemento 
	 */
	public void empilha(T elemento) {
		this.aumentaCapacidade();
		super.adiciona(elemento);
	}

	/**
	 * Retorna o primeiro elemento da pilha (LIFO).
	 * 
	 * @return
	 */
	public T topoPilha(){
		if (!this.estaVazia()) {
			return this.elementos[this.getTamanho() - 1];	
		} 
		return null;
	}

	public T desempilha(){
		if (!this.estaVazia()) {
			return this.elementos[--this.tamanho];
		}

		return null;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i = this.tamanho - 1; i >= 0; i--) {
			string.append("[");
			string.append(this.elementos[i]);
			string.append("]\n");
		}
		
		return string.toString();
	}
}
