package listas;

import entidades.Formulario;

public class ListaPerguntas {

	private class NO{
		Formulario perguntas;
		NO prox;
	}

	private NO lista = null;

	public void insere(Formulario elem) {

		NO novo = new NO();
		novo.perguntas = elem;

		if (lista == null) {
			novo.prox = null;
			lista = novo;
		} else {
			if (novo.perguntas.getId() < lista.perguntas.getId()) {
				novo.prox = lista;
				lista = novo;
			} else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.perguntas.getId() < novo.perguntas.getId()) {
						aux = aux.prox;
					} else {
						achou = true;
					}
				}

				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
	}

	public boolean remove(int id) {
		boolean achou = false;
		if (lista != null) {
			if (id == lista.perguntas.getId()) {
				achou = true;
				lista = lista.prox;
			} else {
				NO aux = lista;
				while (aux.prox != null && !achou) {
					if (aux.prox.perguntas.getId() != id) {
						aux = aux.prox;
					} else {
						achou = true;
						aux.prox = aux.prox.prox;
					}
				}
			}
		}
		return achou;
	}
	

	public int contaNos() {
		int cont = 0;
		NO aux = lista;
		/* percorrer cada no da lista para obter quantidade de nos */
		while (aux != null) {
			aux = aux.prox;
			cont++;
		}

		return cont;
	}

	public void apresenta() {
		NO aux = lista;
		System.out.println("\n  *** LISTA ***");

		while (aux != null) {
			System.out.println("\t" + aux.perguntas);
			aux = aux.prox;
		}
	}
	
}
