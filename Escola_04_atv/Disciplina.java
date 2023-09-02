

public class Disciplina {
	private int id;
	private String nome;
	private String sigla;
	private int periodo;
	
	
	public Disciplina(String nome, String sigla, int periodo) {
//		super();
		this.nome = nome;
		this.sigla = sigla;
		this.periodo = periodo;
	}
	
	public Disciplina() {
//		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "\n|| \tDisciplina: " + nome + " \t| Sigla: " + sigla + "\t| Periodo:  " + periodo + " ||";
	}
}
	