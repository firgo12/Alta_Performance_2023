package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		ListaIntCrescente list = new ListaIntCrescente();
		
		System.out.print("Informe valor positivo para inserir ou negativo para encerrar: ");
		int valor = le.nextInt();
		
		while (valor>= 0) {
			list.insere(valor);
			list.apresenta();
			System.out.print("Informe valor positivo para inserir ou negativo para encerrar: ");
			valor = le.nextInt();
		}
		
		int n = list.contaNos();
		System.out.println();
		System.out.println("A quantidade de nos na lista = "+n);
		
		System.out.println("\n\n Informe valor positivo para inserir ou negativo para encerrar: ");
		valor = le.nextInt();
		while (valor>= 0) {
			if (list.remove(valor))
				list.apresenta();
			else
				System.out.println("Valor não encontrado na lista!! \n");
			System.out.print("Informe valor positivo para remover ou negativo para encerrar: ");
			valor = le.nextInt();
		}
		
		le.close();
	}

}
