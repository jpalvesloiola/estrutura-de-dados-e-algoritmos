package com.loiane.estruturadados.vetor;

public class VetorDinamico<T> {
	private T[] elementos;
	private int tamanho;

	@SuppressWarnings("unchecked")
	public VetorDinamico(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	/**
	 * Adiciona elemento ao final do vetor
	 * 
	 * @param elemento
	 */
	public void adiciona(T elemento) {
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
	public void adiciona(T elemento, int posicao) {
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
	 * Remove um elemento do Vetor de acordo com o elemento passado como parametro.
	 * 
	 * @param elemento a ser removido.
	 */
	public void remove(T elemento) {
		int posicao = this.busca(elemento);
		if (posicao > -1) {
			this.remove(posicao);
		}else {
			return;
		}
		
	}
	
	/**
	 * Limpa todos os elementos da array. 
	 */
	public void limpa() {
		for (int i = 0; i < this.elementos.length; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
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
	 * Verifica se elemento existe no vetor e retorna a
	 * posicao. Sbreescrita do metodo anterior. Algoritmo de busca sequencial.
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
	 * Verifica se elemento existe no vetor com busca sequencial.
	 * @param elemento
	 * @return true de existe ou false senao existe.
	 */
	public boolean contem(T elemento) {

		return busca(elemento) > -1;
	}
	
	/**
	 * Passa a ultima ocorrencia do elemento no vetor
	 * @param elemento
	 * @return
	 */
	public int ultimoIndice(T elemento) {
		
		for (int i = this.tamanho - 1; i >= 0; i--) {
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
	private void aumentaCapacidade() {
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
		string.append("Vetor elementos = ");
		string.append("[");
		for (int i = 0; i < this.tamanho; i++) {
			string.append(this.elementos[i]);
			if (i < this.tamanho) {
				string.append(", ");
			} 
		}
		string.append("]");
		return string.toString();
	}
}
