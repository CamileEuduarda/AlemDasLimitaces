package alemdaslimitacoes.ifba.model;

import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;

	@OneToMany(mappedBy = "endereco")
	private List estudantes;

	public Endereco() {
	}

	public Endereco(String logradouro, String numero, String bairro, String cidade, String cep, String estado) {

		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List estudantes) {
		this.estudantes = estudantes;
	}

}