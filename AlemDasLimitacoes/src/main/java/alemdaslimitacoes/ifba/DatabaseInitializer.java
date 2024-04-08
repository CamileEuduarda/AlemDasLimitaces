package alemdaslimitacoes.ifba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import alemdaslimitacoes.ifba.controller.AvaliacaoController;
import alemdaslimitacoes.ifba.model.Avaliacao;
import alemdaslimitacoes.ifba.service.AvaliacaoService;
import alemdaslimitacoes.ifba.repository.AvaliacaoRepository;

import alemdaslimitacoes.ifba.controller.EnderecoController;
import alemdaslimitacoes.ifba.model.Endereco;
import alemdaslimitacoes.ifba.service.EnderecoService;
import alemdaslimitacoes.ifba.repository.EnderecoRepository;

import alemdaslimitacoes.ifba.controller.EstudanteController;
import alemdaslimitacoes.ifba.model.Estudante;
import alemdaslimitacoes.ifba.service.EstudanteService;
import alemdaslimitacoes.ifba.repository.EstudanteRepository;

import alemdaslimitacoes.ifba.controller.FrequenciaController;
import alemdaslimitacoes.ifba.repository.FrequenciaRepository;
import alemdaslimitacoes.ifba.service.FrequenciaService;
import alemdaslimitacoes.ifba.model.Frequencia;

import alemdaslimitacoes.ifba.controller.TurmaController;
import alemdaslimitacoes.ifba.model.Turma;
import alemdaslimitacoes.ifba.service.TurmaService;
import alemdaslimitacoes.ifba.repository.TurmaRepository;


@SpringBootApplication
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private TurmaService turmaService;

    @Autowired
    private FrequenciaService frequenciaService;

    @Autowired
    private EstudanteService estudanteService;

    @Autowired
    private AvaliacaoService avaliacaoService;

    @Override
    public void run(String... args) throws Exception {
        initializeEndereco();
        initializeTurma();
        initializeFrequencia();
        initializeEstudante();
        initializeAvaliacao();
    }

    private void initializeEndereco() {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua ABC");
        endereco.setNumero("123");
        endereco.setBairro("Centro");
        endereco.setCidade("Cidade A");
        endereco.setCep("12345-678");
        endereco.setEstado("UF");
        enderecoService.inserir(endereco);
    }

    private void initializeTurma() {
        Turma turma = new Turma();
        turma.setEscola("Escola A");
        turma.setTurma("Turma 1");
        turma.setTurno("Matutino");
        turma.setProfessor("Professor X");
        turmaService.inserir(turma);
    }

    private void initializeFrequencia() {
        Estudante estudante = new Estudante();
        Frequencia frequencia = new Frequencia();
        frequencia.setMes(4); 
        frequencia.setAno(2024); 
        frequencia.setAtendimentos(20);
        frequencia.setEstudante(estudante);
        frequenciaService.add(frequencia);
    }

    private void initializeEstudante() {
        Estudante estudante = new Estudante();
        estudante.setNomeCompleto("Fulano de Tal");
        estudanteService.adicionarEstudante(estudante);
    }

    private void initializeAvaliacao() {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setEstudante(estudanteService.localizarPorId(1).orElse(null)); // Supondo que o ID do estudante seja 1
        avaliacaoService.adicionarAvaliacao(avaliacao);
    }
}
