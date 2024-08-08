package aplicacao;

import java.util.Scanner;

import arvores.ABBint;

public class Exercicio1 {

	public static void main(String[] args) {
		ABBint abb = new ABBint();
		Scanner le = new Scanner(System.in);
		int opcao;
		do {
			System.out.println(" 0 - sair");
			System.out.println(" 1 - Inserir");
			//...
			opcao = le.nextInt();
			switch (opcao) {
			case 0: 
				System.out.println("Encerrando o programa");
				break;
			case 1:
				System.out.println("Informe valor: ");
				int info = le.nextInt();
				abb.root = abb.inserir(abb.root, info);
				break;
			case 2:
				System.out.println("Apresentando valor");
				abb.listaEmOrdem(abb.root);
				System.out.println();
				break;
			default:
				System.out.println("Opcao invalida");
			}
			
		} while (opcao !=0);
		
		
	}

}
