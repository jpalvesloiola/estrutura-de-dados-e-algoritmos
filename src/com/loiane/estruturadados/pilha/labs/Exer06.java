package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer06 {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String palavra = "";
			
			while(scan.hasNext()) {
				palavra = scan.next();
				System.out.println(isBalanced(palavra));
			}
		}
	}
	
	public static boolean isBalanced(String palavra) {
		Stack<Character> pilha = new Stack<>();
		
		for (char character : palavra.toCharArray()) {
			
			if (character == '(' || character == '[' || character == '{') {
				pilha.push(character);
			} else if (character == ')' || character == ']' || character == '}'){
				if(pilha.isEmpty())
					return false;
				Character top = pilha.pop();
				if(		(top != '(' && character == ')') ||
						(top != '[' && character == ']') ||
						(top != '{' && character == '}')){
					return false;
				}
			}
		}
		
		return pilha.isEmpty();
	}
		
		
}


