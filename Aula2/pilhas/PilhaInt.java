package pilhas;

public class PilhaInt {
	
	public final int N = 6;
	int dados[] = new int[N];
	//TOPO sempre será inteiro
	int topo;
	
	
	public void init() {
		topo = 0;
	}
	
	//Quando chamar o método, precisamos falar o elemento que será acrescentado
	public void push(int elem) {
		dados[topo] = elem;
		topo++;
	}
	
	//Diminui o índice e retorna o índice anterior
	public int pop() {
		topo--;
		return (dados[topo]);
	}

}
