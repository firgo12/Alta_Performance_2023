package aplicacao;

import java.util.Scanner;

import entidades.Atendimento;
import entidades.Formulario;
import listas.ListaPerguntas;
import listas.ListaString;

public class AtendimentoFeedback {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);

		ListaString listaFeedback = new ListaString();
		ListaPerguntas listaPergunta = new ListaPerguntas();

		System.out.println("Deseja entrar como administrador? : (1-sim)/(2-n�o)/(3-encerrar programa)");
		int adm = le.nextInt();

		//valida��o
		if (adm < 1 || adm > 3) {
			do {
				System.out.println("Op��o inv�lida... Deseja entrar como administrador?: (1-sim)/(2-n�o)/(3-encerrar programa)");
				adm = le.nextInt();
			} while (adm < 1 || adm > 3);
		}
		while (adm != 3) {
			// Somente o ADM poder� criar formul�rios e visualizar os feedbacks.

			if (adm == 1) {
				int opcao = 0;

				do {
					System.out.println("\t 1 - Criar uma pergunta e enviar para os funcion�rios");
					System.out.println("\t 2 - Visualizar as perguntas feitas");
					System.out.println("\t 3 - Visualizar as respostas");
					System.out.println("\t 4 - Voltar para a p�gina login");
					System.out.println("Ir para: ");
					opcao = le.nextInt();
					
					if (opcao < 1 || opcao > 4) {
						System.out.println("Op��o inv�lido!!");
					} else {
						switch (opcao) {
						case 1:
							//Limpa o �ltimo next
							le.nextLine();
							
							System.out.println("Digite a pergunta: ");
							String p = le.nextLine();
							
							System.out.println("Digite o Id da pergunta: ");
							int id = le.nextInt();
							
							Formulario pergunta = new Formulario(p, id);
							listaPergunta.insere(pergunta);

							break;

						case 2:
							listaPergunta.apresenta();

							break;
							
						case 3:
							
							listaFeedback.apresenta();
							
							break;
							
						case 4:
							
							System.out.println("Voltando para a p�gina anterior...");
							System.out.println("Deseja entrar como administrador? : (1-sim)/(2-n�o)/(3-encerrar programa)");
							adm = le.nextInt();
							
							//valida��o
							if (adm < 1 || adm > 3) {
								do {
									System.out.println("Op��o inv�lida... Deseja entrar como administrador?: (1-sim)/(2-n�o)/(3-encerrar programa)");
									adm = le.nextInt();
								} while (adm < 1 || adm > 3);
							}
							
							break;
						}
					}

				} while (opcao != 4);

			} else {
				if(adm == 2) {
					int opcao = 0;
					
					do {
						System.out.println("\t 1 - Responder as perguntas");
						System.out.println("\t 2 - Visualizar as perguntas");
						System.out.println("\t 3 - Voltar para a p�gina anterior");
						System.out.println("Ir para: ");
						opcao = le.nextInt();
						
						//Valida��o
						if (opcao < 1 || opcao > 3) {
							System.out.println("Op��o inv�lido!!");
						} else {
							switch (opcao) {
							case 1:
								
								listaPergunta.apresenta();
								System.out.println("Qual pergunta pretende responder? (Digite o ID da pergunta)");
								int idResponde = le.nextInt();
			
								listaPergunta.remove(idResponde);
								
								System.out.println("Digite o seu id: ");
								int idFuncionario = le.nextInt();
								
								System.out.println("Digite o seu nome: ");
								String consumidor = le.next();
								
								le.nextLine();
								
								System.out.println("Digite o produto e/ou assunto do feedback: ");
								String produto = le.nextLine();
								
								System.out.println("Digite o feedback: ");
								String feedback = le.nextLine();
								
								Atendimento atendimento = new Atendimento(idFuncionario, feedback, consumidor, produto);
								
								listaFeedback.insere(atendimento);
								
								break;
								
							case 2:
								
								listaPergunta.apresenta();
								
								break;
								
							case 3:
								
								System.out.println("Voltando para a p�gina anterior...");
								System.out.println("Deseja entrar como administrador? : (1-sim)/(2-n�o)/(3-encerrar programa)");
								adm = le.nextInt();
								
								//valida��o
								if (adm < 1 || adm > 3) {
									do {
										System.out.println("Op��o inv�lida... Deseja entrar como administrador?: (1-sim)/(2-n�o)/(3-encerrar programa)");
										adm = le.nextInt();
									} while (adm < 1 || adm > 3);
								}
								
								
								break;

							default:
								break;
							}
						}
						
					} while (opcao != 3);
				}
			}

		}
	}

}
