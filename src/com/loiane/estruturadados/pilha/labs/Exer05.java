package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer05 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String palavra = "";
			
			while(scan.hasNext()) {
				palavra = scan.next();
				System.out.println(isPalindromo(palavra));
			}
		}
		
	}

	public static boolean isPalindromo(String palavra) {
		Stack<Character> pilha = new Stack<>();
		
		for (Character character : palavra.toCharArray()) {
			pilha.add(character);
		}
		
		String palavraInvertida = "";
		while (!pilha.empty()) {
			 palavraInvertida += pilha.pop();
		}
		
		return palavra.equalsIgnoreCase(palavraInvertida);
	}
	
	
}
