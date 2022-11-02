package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.VetorDinamico;
import com.loiane.estruturadados.vetor.objetos.Contato;

public class Exer06 {

	public static void main(String[] args) {
		var entrada = new Scanner(System.in);

		System.out.println("Digite o numero de contatos que deseja criar: ");
		
		int quantidade = entrada.nextInt();
		
		VetorDinamico<Contato> vetor = new VetorDinamico<>(quantidade);
		
		criaContatos(vetor, quantidade);

		obterOpcaoMenu(entrada, quantidade, vetor);
	}

	public static void obterOpcaoMenu(Scanner entrada, int quantidade, VetorDinamico<Contato> vetor) {
		boolean entradaInvalida = false;

		while (!entradaInvalida) {
			System.out.println("1-Adiciona elemento ao final do vetor;");
			System.out.println("2-Adiciona elemento na posição desejada, no vetor;");
			System.out.println("3-Remove um elemento do Vetor de acordo com o indice passado como parametro;");
			System.out.println("4-Remove um elemento do Vetor de acordo com o elemento passado como parametro;");
			System.out.println("5-Limpa todos os elementos da array;");
			System.out.println("6-Obtem posição do elemento no vetor passando um elemento;");
			System.out.println("7-Obtem elemento passando uma posicao;");
			System.out.println("8-Verifica se o elemento existe no vetor;");
			System.out.println("9-Passa a ultima ocorrencia do elemento no vetor;");
			System.out.println("10-Verifica tamanho do vetor;");
			System.out.println("11-Imprime Vetor;");
			System.out.println("0-Sair.\n\n");
			System.out.println("Digite o numero que corresponde a opcao desejada abaixo: ");
			
			quantidade = entrada.nextInt();
			if (quantidade > 15 || quantidade < 0) {
				entradaInvalida = true;
			}
			int posicao;
			boolean contem;
			String nome;
			String email;
			String numero;
			Contato contato;

			switch (quantidade) {
			case 0:
				System.out.println("Fim do programa!");
				entrada.close();
			case 1:
				System.out.println("Adiciona contato no final da lista.");
				System.out.println("Digite o nome do contato:");
				nome = entrada.nextLine();
				System.out.println("Digite o email do contato:");
				email = entrada.nextLine();
				System.out.println("Digite o numero do contato:");
				numero = entrada.nextLine();
				contato = new Contato(nome, email, numero);
				vetor.adiciona(contato);
				break;
			case 2:
				System.out.println("Adiciona contato na posicao desejada.");
				System.out.println("Digite a posicao do contato:");
				posicao = entrada.nextInt();
				System.out.println("Digite o nome do contato:");
				nome = entrada.nextLine();
				System.out.println("Digite o email do contato:");
				email = entrada.nextLine();
				System.out.println("Digite o numero do contato:");
				numero = entrada.nextLine();
				contato = new Contato(nome, email, numero);
				vetor.adiciona(contato);
				break;
			case 3:
				posicao = entrada.nextInt();
				vetor.remove(posicao);
				break;
			case 4:
				System.out.println("Remove o contato passado como parametro.");
				System.out.println("Digite o nome do contato:");
				nome = entrada.nextLine();
				System.out.println("Digite o email do contato:");
				email = entrada.nextLine();
				System.out.println("Digite o numero do contato:");
				numero = entrada.nextLine();
				contato = new Contato(nome, email, numero);
				vetor.remove(contato);
				break;
			case 5:
				System.out.println("Limpando a lista de Contatos...");
				vetor.limpa();
				break;
			case 6:
				System.out.println("Obtem contato pela posicao.");
				System.out.println("Digite a posicao do contato:");
				posicao = entrada.nextInt();
				System.out.println(vetor.busca(posicao));
				break;
			case 7:
				System.out.println("Obtem contato passando contato.");
				System.out.println("Digite o nome do contato:");
				nome = entrada.nextLine();
				System.out.println("Digite o email do contato:");
				email = entrada.nextLine();
				System.out.println("Digite o numero do contato:");
				numero = entrada.nextLine();
				contato = new Contato(nome, email, numero);
				posicao = vetor.busca(contato);
				if (posicao < 0) {
					System.out.println("Elemento nao encontrado!");
				} else {
					System.out.println("Elemento esta na posicao: " + posicao);
				}
				break;
			case 8:
				System.out.println("Contem contato?");
				System.out.println("Digite o nome do contato:");
				nome = entrada.nextLine();
				System.out.println("Digite o email do contato:");
				email = entrada.nextLine();
				System.out.println("Digite o numero do contato:");
				numero = entrada.nextLine();
				contato = new Contato(nome, email, numero);
				contem = vetor.contem(contato);
				if (contem == false) {
					System.out.println("Elemento nao existe!");
				} else {
					System.out.println("Elemento existe");
				}
				break;
			case 9:
				System.out.println("Digite o nome do contato:");
				nome = entrada.nextLine();
				System.out.println("Digite o email do contato:");
				email = entrada.nextLine();
				System.out.println("Digite o numero do contato:");
				numero = entrada.nextLine();
				contato = new Contato(nome, email, numero);
				posicao = vetor.ultimoIndice(contato);
				if (posicao < 0) {
					System.out.println("Nao existe este contato!");
				} else {
					System.out.println("Ultima posicao do contato encontrado: " + posicao);
				}
				break;
			case 10:
				System.out.println("Numero de Contatos: " + vetor.tamanho());
				break;
			case 11:
				System.out.println("Lista de Contatos: ");
				System.out.println(vetor);
				break;
			default:
				entrada.close();
				break;
			}
		}
	}

	public static void criaContatos(VetorDinamico<Contato> vetor, int capacidade) {
		for (int i = 0; i < capacidade; i++) {
			vetor.adiciona(new Contato("Contato_" + i, "contato" + i + "@mail.com", "9999-999" + i));
		}
	}

}
