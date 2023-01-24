package Collections;

public class gato implements Comparable<gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Gatos: [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
	
}
