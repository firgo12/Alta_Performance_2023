package entidades;

public class Formulario {

	private String pergunta;
	private int id;

	public Formulario(String pergunta, int id) {
		super();
		this.pergunta = pergunta;
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Formulario [pergunta = " + pergunta + ", id = " + id + "]";
	}

	
	
	
	
}
