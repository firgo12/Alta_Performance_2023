package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		ListaIntCrescente list = new ListaIntCrescente();
		
		System.out.println("Informe valor positivo para inserir ou negativo para encerrar: ");
		int valor = le.nextInt();
		
		while (valor>= 0) {
			list.insere(valor);
			list.apresenta();
			System.out.println("Informe valor positivo para inserir ou negativo para encerrar: ");
			valor = le.nextInt();
		}
		
		le.close();
	}

}
