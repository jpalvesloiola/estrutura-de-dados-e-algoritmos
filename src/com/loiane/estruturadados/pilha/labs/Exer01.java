package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int numero;
        
        for (int i = 0; i < 10; i++) {
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                pilha.push(numero);
            }
            if (pilha.isEmpty()) {
                System.out.println("Sua pilha está vazia!");
            }else{
                pilha.pop();
            }   
        }
        scan.close();
        if (pilha.isEmpty()) {
            for (int i = pilha.size(); i >= 0; i--) {
                System.out.println(pilha);
                pilha.pop();   
            }            
        }else{
            System.out.println("Sua pilha está vazia!");
        }



    }
}
