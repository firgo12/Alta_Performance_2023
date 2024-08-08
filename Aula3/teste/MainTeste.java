package teste;

import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt(); //Importar o package com CTRL+SHIFT+O
		
		pilha.init();
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);
		pilha.push(60);
		
		if (!pilha.isEmpty())
			System.out.println("Valor que esta no topo da pilha: "+pilha.top());
		else
			System.out.println("Pilha vazia");
		
		if (!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: "+pilha.pop());
		else
			System.out.println("Pilha vazia");
		
		if (!pilha.isEmpty())
			System.out.println("Valor retirado da pilha: "+pilha.pop());
		else
			System.out.println("Pilha vazia");
		
		System.out.println("Esvaziando pilha...");
		pilha.empty();
		
	}

}
