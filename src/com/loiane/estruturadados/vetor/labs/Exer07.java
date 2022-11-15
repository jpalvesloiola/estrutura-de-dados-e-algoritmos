package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;


import com.loiane.estruturadados.vetor.objetos.Contato;

public class Exer07 {

	public static void main(String[] args) {
		var entrada = new Scanner(System.in);

		int quantidade = obtemNumeroDeContatos(entrada);

		ArrayList<Contato> vetor = new ArrayList<>(quantidade);
		

//		criaContatos(vetor, quantidade);

		obterOpcaoMenu(entrada, vetor);
	}

	private static int obtemNumeroDeContatos(Scanner entrada) {
		int quantidade = 0;
		boolean entradaInvalida = false;

		while (!entradaInvalida) {
			System.out.println("Digite o numero de contatos que deseja criar: ");

			try {
				quantidade = Integer.parseInt(entrada.nextLine());
				entradaInvalida = true;
			} catch (Exception e) {

				System.out.println("Opcao invalida!");
			}
		}
		return quantidade;
	}

	protected static void obterOpcaoMenu(Scanner entrada, ArrayList<Contato> vetor) {

		int opcao = 0;
		boolean entradaValida = false;

		while (!entradaValida) {
			System.out.println("\n\n1-Adiciona elemento ao final do vetor;");
			System.out.println("2-Adiciona elemento na posicao desejada, no vetor;");
			System.out.println("3-Remove um elemento do Vetor de acordo com o indice passado como parametro;");
			System.out.println("4-Remove um elemento do Vetor de acordo com o elemento passado como parametro;");
			System.out.println("5-Limpa todos os elementos da array;");
			System.out.println("6-Obtem posicao do elemento no vetor passando um elemento;");
			System.out.println("7-Obtem elemento passando uma posicao;");
			System.out.println("8-Verifica se o elemento existe no vetor;");
			System.out.println("9-Exibe a ultima ocorrencia de um elemento no vetor;");
			System.out.println("10-Verifica tamanho do vetor;");
			System.out.println("11-Imprime Vetor;");
			System.out.println("0-Sair.\n\n");
			System.out.println("Digite o numero que corresponde a opcao desejada abaixo: ");

			try {
				opcao = Integer.parseInt(entrada.nextLine());

				if (opcao > 15 || opcao < 0) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println(e + " Opcao invalida! Digite novamente: ");
			}
			
			if(opcao == 0)
				entradaValida = true;
			
			processaOpcaoEscolhida(entrada, vetor, opcao);
		}
	}

	private static void processaOpcaoEscolhida(Scanner entrada, ArrayList<Contato> vetor, int opcao) {

		switch (opcao) {
		case 0:
			System.out.println("Fim do programa!");
			break;
		case 1:
			adicionaFinalDaLista(entrada, vetor);
			break;
		case 2:
			adicionaQulaquerPosicaoDaLista(entrada, vetor);
			break;
		case 3:
			removeElementoPorPosicao(entrada, vetor);
			break;
		case 4:
			removeContato(entrada, vetor);
			break;
		case 5:
			System.out.println("Limpando a lista de Contatos...");
			vetor.clear();
			break;
		case 6:
			obtemContatoPorInfo(entrada, vetor);
			break;
		case 7:
			obtemContatoPelaPosicao(entrada, vetor);
			break;
		case 8:
			contemContato(entrada, vetor);
			break;
		case 9:
			ultimaOcorrencia(entrada, vetor);
			break;
		case 10:
			System.out.println("Numero de Contatos: " + vetor.size());
			break;
		case 11:
			System.out.println("Lista de Contatos: ");
			System.out.println(vetor);
			return;
		default:
			
			break;
		}
	}

	private static void removeElementoPorPosicao(Scanner entrada, ArrayList<Contato> vetor) {
		int posicao;
		posicao = Integer.parseInt(leInformacao("Digite a posicao do elemento que deseje remover: ", entrada));
		vetor.remove(posicao);
	}

	private static void ultimaOcorrencia(Scanner entrada, ArrayList<Contato> vetor) {
		int posicao;
		System.out.println("***Ultimo ocorrencia do contato.***");
		String nome = leInformacao("Digite o nome do contato:", entrada);
		String email = leInformacao("Digite o email do contato:", entrada);
		String numero = leInformacao("Digite o numero do contato:", entrada);
		Contato contato = new Contato(nome, email, numero);
		posicao = vetor.lastIndexOf(contato);
		if (posicao < 0) {
			System.out.println("Nao existe este contato!");
		} else {
			System.out.println("Ultima posicao do contato encontrado: " + posicao);
		}
	}

	private static void contemContato(Scanner entrada, ArrayList<Contato> vetor) {
		System.out.println("***Contem contato?***");

		String nome = leInformacao("Digite o nome do contato:", entrada);
		String email = leInformacao("Digite o email do contato:", entrada);
		String numero = leInformacao("Digite o numero do contato:", entrada);
		Contato contato = new Contato(nome, email, numero);
		if (vetor.contains(contato)) {
			System.out.println("Elemento nao existe!");
		} else {
			System.out.println("Elemento existe");
		}
	}

	protected static String leInformacao(String mensagem, Scanner entrada) {
		System.out.println(mensagem);
		String saida = null;
		try {
			saida = entrada.nextLine();
		} catch (Exception e) {
			System.out.println("Digite uma opcao valida!");
		}
		return saida;
		
	}

	private static void obtemContatoPorInfo(Scanner entrada, ArrayList<Contato> vetor) {
		System.out.println("***Obtem contato por informacoes.***");
		String nome = leInformacao("Digite o nome do contato:", entrada);
		String email = leInformacao("Digite o email do contato:", entrada);
		String numero = leInformacao("Digite o numero do contato:", entrada);
		Contato contato = new Contato(nome, email, numero);
		int posicao = vetor.indexOf(contato);
		if (posicao < 0) {
			System.out.println("Elemento nao encontrado!");
		} else {
			System.out.println("Elemento esta na posicao: " + posicao);
		}
	}

	private static void obtemContatoPelaPosicao(Scanner entrada, ArrayList<Contato> vetor) {
		int posicao;
		System.out.println("***Obtem contato pela posicao.***");
		System.out.println("Digite a posicao do contato:");
		posicao = entrada.nextInt();
		System.out.println("Contato na posicao: " + vetor.get(posicao));
	}

	private static void removeContato(Scanner entrada, ArrayList<Contato> vetor) {
		System.out.println("***Remove o contato passado como parametro.***");
		String nome = leInformacao("Digite o nome do contato:", entrada);
		String email = leInformacao("Digite o email do contato:", entrada);
		String numero = leInformacao("Digite o numero do contato:", entrada);
		Contato contato = new Contato(nome, email, numero);
		vetor.remove(contato);
		System.out.println("Contato removido com sucesso!");
	}

	private static void adicionaQulaquerPosicaoDaLista(Scanner entrada, ArrayList<Contato> vetor) {
		System.out.println("***Adiciona contato na posicao desejada.***");
		int posicao = Integer.parseInt(leInformacao("Digite a posicao do contato:", entrada));
		String nome = leInformacao("Digite o nome do contato:", entrada);
		String email = leInformacao("Digite o email do contato:", entrada);
		String numero = leInformacao("Digite o numero do contato:", entrada);
		Contato contato = new Contato(nome, email, numero);
		vetor.add(posicao, contato);
		System.out.println("Contato adicionado com sucesso!");
	}

	private static void adicionaFinalDaLista(Scanner entrada, ArrayList<Contato> vetor) {
		System.out.println("***Adicionar contato no final da lista.***");
		String nome = leInformacao("Digite o nome do contato:", entrada);
		String email = leInformacao("Digite o email do contato:", entrada);
		String numero = leInformacao("Digite o numero do contato:", entrada);
		Contato contato = new Contato(nome, email, numero);
		vetor.add(contato);
		System.out.println("Contato adicionado com sucesso!");
	}

//	public static void criaContatos(ArrayList<Contato> vetor, int capacidade) {
//		for (int i = 0; i < capacidade; i++) {
//			vetor.adiciona(new Contato("Contato_" + i, "contato" + i + "@mail.com", "9999-999" + i));
//		}
//	}

}
