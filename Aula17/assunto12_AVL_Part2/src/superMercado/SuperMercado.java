package superMercado;

import java.util.Scanner;

import arvores.AVLint;

public class SuperMercado {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		AVLProdutos loja = new AVLProdutos();
		int codigo;
		String descricao;
		double preco;

		int opcao;
		do {
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Inserir");
			System.out.println(" 2 - Apresenta todos os produtos com preco menores do que um valor");
			System.out.println(" 3 - Remover produto escolhido pelo código");
			System.out.println(" 4 - Consulta produto código");
			opcao = le.nextInt();

			switch (opcao) {
			case 0:
				System.out.println(" Encerrado o programa");
				break;
			case 1:
				System.out.println("Informe codigo do produto: ");
				codigo = le.nextInt();
				System.out.println("Informe descricao do produto: ");
				descricao = le.next();
				System.out.println("Informe preço do produto: ");
				preco = le.nextDouble();
				
				Produto p = new Produto(codigo, descricao, preco);
				loja.root = loja.inserirAVL(loja.root, p);
				loja.mostra(loja.root);
				
				break;
			
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break; 
				
				default:
					System.out.println("Opção inválida");
			}
		} while(opcao != 0);

	}

}
