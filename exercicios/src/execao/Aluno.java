package execao;

import java.util.Objects;

public class Aluno {
	
	public final String nome;
	public final double nota1;
	final double nota2;
	final String sobreNome;
	public final boolean bomComportamento;
	
	public Aluno (String nome, double nota1) {
		this(nome, nota1, 0, "Seucuca", true);
	}
	
	public Aluno(String nome, double nota1, double nota2, String sobreNome, boolean bomComportamento) {
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.sobreNome = sobreNome;
		this.bomComportamento = bomComportamento;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota1);
	}
	
	public String toString() {
		return nome + " tem nota " + nota1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1);
	}
	
	
}
