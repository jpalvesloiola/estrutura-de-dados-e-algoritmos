package com.loiane.estruturadados.base;

/**
 * Classe referencia para os tipos de estrutura de dados estaticos.
 * 
 * @author jpalv
 *
 * @param <T>
 */
public abstract class EstruturaEstatica<T> {
	private T[] elementos;
	private int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	/**
	 * Adiciona elemento ao final do vetor
	 * 
	 * @param elemento
	 */
	protected void adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
	}

	/**
	 * Adiciona elemento na posição desejada do vetor. Sobrecarga do metodo
	 * anterior.
	 * 
	 * @param elemento
	 * @param posicao
	 */
	protected void adiciona(T elemento, int posicao) {
		this.validaPosicao(posicao);

		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}

	/**
	 * Remove um elemento do Vetor de acordo com o indice passado como parametro.
	 * 
	 * @param posicao .
	 */
	public void remove(int posicao) {
		this.validaPosicao(posicao);
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	/**
	 * Obtem elemento em uma posição do vetor
	 * 
	 * @param posicao
	 * @return elemento
	 */
	public T busca(int posicao) {
		this.validaPosicao(posicao);
		return this.elementos[posicao];
	}

	/**
	 * Verifica se elemento existe no vetor e retorna a posicao. Sbreescrita do
	 * metodo anterior. Algoritmo de busca sequencial.
	 * 
	 * @param elemento
	 * @return inteiro >= 0 (posicao) ou -1 se nada for encontrado.
	 */
	public int busca(T elemento) {

		for (int i = 0; i < this.tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * Caso o array fique cheio este metodo e acionado autmaticamente pelo o
	 * Adiciona().
	 */
	@SuppressWarnings("unchecked")
	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] novoElementos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novoElementos[i] = this.elementos[i];
			}
			this.elementos = novoElementos;
		}
	}

	private void validaPosicao(int posicao) {
		if (posicao < 0 || posicao > this.tamanho) {
			throw new IllegalArgumentException("Posicao invalida!");
		}

	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Contatos = ");
		string.append("[");
		for (int i = 0; i < this.tamanho; i++) {
			string.append(this.elementos[i]);
			if (i < this.tamanho - 1) {
				string.append(", ");
			}
		}
		string.append("]");
		return string.toString();
	}
}
