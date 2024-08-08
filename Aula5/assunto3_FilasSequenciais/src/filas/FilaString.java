package filas;

public class FilaString {

	public final int N=30;
	String dados[]= new String[N];
	int ini, fim, cont;
	
	public void init() {
		ini = fim = cont = 0;
	}
	public boolean isEmpty() {
		if (cont == 0)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (cont == N)
			return true;
		else
			return false;
	}
	public void enqueue(String elem) {
		if (isFull())
			System.out.println("Fila cheia");
		else {
			dados[fim] = elem;
			fim = (fim+1) % N;
			cont++;
		}
	}
	public String dequeue() {
		String elem = dados[ini];
		//ini = (ini+1) % N;
		ini++;
		if (ini==N)
			ini=0;
		cont--;
		return elem;
	}
	
	
}
