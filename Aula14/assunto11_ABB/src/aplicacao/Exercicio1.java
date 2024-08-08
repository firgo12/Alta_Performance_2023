package aplicacao;

import java.util.Scanner;

import arvores.ABBint;

public class Exercicio1 {

	public static void main(String[] args) {
		ABBint abb = new ABBint();
		Scanner le = new Scanner(System.in);
		int opcao;
		do {
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Inserir");
			System.out.println(" 2 - Apresenta ABB");
			System.out.println(" 3 - Apresenta quantidade de nos");
			System.out.println(" 4 - Pesquisar 1 valor na ABB");
			System.out.println(" 5 - Pesquisar 1 valor apresentando quantidade de comparações");
			
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrando o programa");
				break;
			case 1:
				System.out.print("Informe valor: ");
				int info = le.nextInt();
				abb.root = abb.inserir(abb.root, info);
				break;
			case 2:
				System.out.println("Apresentando os valores");
				abb.listaEmOrdem(abb.root);
				System.out.println();
				break;
			case 3:
				System.out.println("Quantidade de nos da ABB = "+ abb.contaNos(abb.root, 0));
				break;
			case 4:
				System.out.println("Informe valor a ser pesquisado: ");
				info = le.nextInt();
				if(abb.consulta(abb.root, info)) {
					System.out.println("Valor está na ABB");
				} else {
					System.out.println("Valor NÃO está na ABB");
				}
				break;
			case 5:
				System.out.println("Informe valor a ser pesquisado: ");
				info = le.nextInt();
				System.out.println("Quantidade de comparações: "+ abb.contaConsulta(abb.root, info, 0));
				
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);

	}

}
