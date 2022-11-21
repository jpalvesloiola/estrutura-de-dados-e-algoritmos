package com.loiane.estruturadados.pilha.aulas;

import java.util.Stack;

public class Aula18 {
	public static void main(String[] args) {
		//Pilha<Integer> pilha = new Pilha<>(5);
		Stack<Integer> stack = new Stack<>(); //teste de capacidade
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack.isEmpty() ? "Vazia!" : "Nao vazia!");
		System.out.println("Tamanho: " + stack.size());
		System.out.println("Topo da pilha: " + stack.peek());
		System.out.println("Pilha antes: ");
		System.out.println(stack);
		System.out.println("Desempilha : " + stack.pop());
		System.out.println("Pilha depois: ");
		System.out.println(stack);
	}
	
}
