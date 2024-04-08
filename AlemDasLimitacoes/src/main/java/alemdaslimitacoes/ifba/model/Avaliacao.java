package alemdaslimitacoes.ifba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int atendimentoSemanal;
	private String sintese;
	private String resultados;
	private String encaminhamentos;
	private String tipo;
	private String tempo;

	@OneToOne
	private Estudante estudante;

	@Enumerated(EnumType.STRING)
	private Atividades atividades;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSintese() {
		return sintese;
	}

	public void setSintese(String sintese) {
		this.sintese = sintese;
	}

	public String getResultados() {
		return resultados;
	}

	public void setResultados(String resultados) {
		this.resultados = resultados;
	}

	public String getEncaminhamentos() {
		return encaminhamentos;
	}

	public void setEncaminhamentos(String encaminhamentos) {
		this.encaminhamentos = encaminhamentos;
	}

	public int getAtendimentoSemanal() {
		return atendimentoSemanal;
	}

	public void setAtendimentoSemanal(int atendimentoSemanal) {
		this.atendimentoSemanal = atendimentoSemanal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;

	}

}