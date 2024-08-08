package listaencadeada;

public class ListaEncadeada {

	public static void main(String[] args) {
		
		//lista --> | dado | prox |
		NO lista = new NO();
		lista.dado=1;
		lista.prox = null; //Não tem nó depois do null
		
		NO novo = new NO();
		novo.dado=2;
		novo.prox = null;
		
		lista.prox = novo;
		
		NO novo2 = new NO();
		novo2.dado =3;
		novo2.prox = lista;
		
		lista = novo2;
		
		NO aux = lista;
		while (aux != null) {
			System.out.println("aux.dado: "+aux.dado+"\t prox: "+ aux.prox);
			aux = aux.prox;
			
		}
		
		//System.out.println("lista: "+ lista);
		//System.out.println("Novo: "+ novo);
		
		//System.out.println("lista.dado: "+ lista.dado+"\t prox: "+lista.prox);
		//System.out.println("novo.dado: "+ novo.dado+"\t prox: "+novo.prox);
		
	}

}
