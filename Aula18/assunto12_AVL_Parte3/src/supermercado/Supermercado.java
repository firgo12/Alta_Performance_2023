package supermercado;

import java.util.Scanner;

public class Supermercado {

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
			System.out.println(" 2 - Apresenta todos os produtos com precos menores do que um valor escolhido");
			System.out.println(" 3 - Remover produto escolhido pelo codigo");
			System.out.println(" 4 - Consulta produto pelo codigo");
			opcao = le.nextInt();

			switch (opcao) {
			case 0:
				System.out.println(" Encerrado o programa");
				break;
			case 1:
				System.out.print("Informe codigo do produto: ");
				codigo = le.nextInt();
				System.out.print("Informe descricao do produto: ");
				descricao = le.next();
				System.out.print("Informe preco do produto: ");
				preco = le.nextDouble();
				Produto p = new Produto(codigo, descricao, preco);
				loja.root = loja.inserirAVL(loja.root, p);
				loja.atualizaAlturas(loja.root);
				//loja.mostra(loja.root);
				break;
			case 2:
				System.out.println("Valor de limite para apresentacao de produtos R$");
				preco = le.nextDouble();
				System.out.println("\n *** Lista de Produtos com Preco Baixo do Limite ***");
				loja.listaMaisBaratos(loja.root, preco);
				break;
			case 3:
				System.out.print("Informe codigo do produto a ser removido: ");
				codigo = le.nextInt();
				loja.root = loja.removeValor(loja.root, codigo);
				loja.root = loja.atualizaAlturaBalanceamento(loja.root);
				loja.atualizaAlturas(loja.root);
				break;
			case 4:
				System.out.println("Informe codigo do produto a ser pesquisado: ");
				codigo = le.nextInt();
				Produto prod = loja.consultaCodigo(loja.root, codigo);
				if (prod == null) 
					System.out.println("Produto não encontrado");
				else
					System.out.println(prod);
				
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		} while (opcao != 0);
		le.close();

	}


}
