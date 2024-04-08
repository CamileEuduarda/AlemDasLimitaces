package alemdaslimitacoes.ifba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Frequencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int mes;
	private int ano;
	private int atendimentos;

	@ManyToOne
	private Estudante estudante;

	public Frequencia() {
	}

	public Frequencia(int mes, int ano, int atendimentos, Estudante estudante) {
		this.mes = mes;
		this.ano = ano;
		this.atendimentos = atendimentos;
		this.estudante = estudante;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(int atendimentos) {
		this.atendimentos = atendimentos;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
}