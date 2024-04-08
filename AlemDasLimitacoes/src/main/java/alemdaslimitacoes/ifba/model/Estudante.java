package alemdaslimitacoes.ifba.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
	public class Estudante {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String nomeCompleto;
	    private Date dataNasc;
	    private String responsavel;

	    @ManyToOne
	    private Turma turma;
	    
	    @ManyToOne
	     private Endereco endereco;

	    public Estudante() {
	    }

	    public Estudante(String nomeCompleto, Date dataNasc, String responsavel, Turma turma,Endereco endereco) {
	        this.nomeCompleto = nomeCompleto;
	        this.dataNasc = dataNasc;
	        this.responsavel = responsavel;
	        this.turma = turma;
	        this.endereco = endereco;
	    }

	    public String getNomeCompleto() {
	        return nomeCompleto;
	    }

	    public void setNomeCompleto(String nomeCompleto) {
	        this.nomeCompleto = nomeCompleto;
	    }

	    public Date getDataNasc() {
	        return dataNasc;
	    }

	    public void setDataNasc(Date dataNasc) {
	        this.dataNasc = dataNasc;
	    }

	    public String getResponsavel() {
	        return responsavel;
	    }

	    public void setResponsavel(String responsavel) {
	        this.responsavel = responsavel;
	    }

	    public Turma getTurma() {
	        return turma;
	    }

	    public void setTurma(Turma turma) {
	        this.turma = turma;
	    }
	    public void setEndereco(Endereco  endereco) {
	        this.endereco = endereco;
	    }
	}