package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer02 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        try (Scanner scan = new Scanner(System.in)) {
			int numero;

			for (int i = 0; i < 10; i++) {
			    System.out.println("Digite um número:");
			    numero = scan.nextInt();
			    if(numero == 0){

			        Integer desempilhado = (Integer) par.desempilha();
			        //pilha par
			        if( desempilhado == null) {
			            System.out.println("Pilha Par está vazia!");
			        }else{
			            System.out.println("\nDesempilha da pilha Par: " + desempilhado);
			        }

			        desempilhado = (Integer) impar.desempilha();
			        //pilha impar
			        if(desempilhado == null) {
			            System.out.println("Pilha Impar está vazia!");
			        }else{ 
			            System.out.println("Desempilha da pilha ìmpar: " + desempilhado);
			        }
			        
			        
			    }else if (numero % 2 == 0) {
			        System.out.println("Empilha número par, segue a pilha:");
			        par.empilha(numero);
			        
			    } else{                
			        System.out.println("Empilha número ímpar, segue a pilha:");
			        impar.empilha(numero);
			       
			    } 
			}
		}
        System.out.println("\n\nPilha Par: \n" + par);
        System.out.println("Pilha Impar: \n" + impar);

        System.out.println("Sua Pilha será desmontada:");
        System.out.println("Pares:");
        while (!par.estaVazia()) {
            System.out.println("Desempilhando...\n" + par);
            par.desempilha();
            
        }            
        System.out.println("Impares:");
        while (!impar.estaVazia()) {
            System.out.println("Desempilhando...\n" + impar);
            impar.desempilha();
            
        }           
        
        System.out.println("Sua pilha foi esvaziada!");
    }
}
