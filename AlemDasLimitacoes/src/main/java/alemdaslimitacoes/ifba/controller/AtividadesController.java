package alemdaslimitacoes.ifba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import alemdaslimitacoes.ifba.model.Atividades;

public class AtividadesController {

	@RestController
	public class TipoAtividadeController {

		@GetMapping("/tipos-atividade")
		public Atividades[] listarTiposAtividade() {
			return Atividades.values();
		}
	}

}
