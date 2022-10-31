package com.loiane.estruturadados.vetor.objetos;

import java.util.Objects;

public class Contato {
	private String nome;
	private String email;
	private String numero;

	public Contato(String nome, String email, String numero) {
		super();
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", numro=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(numero, other.numero);
	}

}
