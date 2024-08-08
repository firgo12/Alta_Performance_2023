package teste;

import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt(); //Importar o package com CTRL+SHIFT+O
		
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);
		
		
		System.out.println("Valor retirado da pilha: "+pilha.pop());
		System.out.println("Valor retirado da pilha: "+pilha.pop());
	}

}
