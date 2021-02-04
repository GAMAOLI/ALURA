package springRest.SpringRest.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springRest.SpringRest.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Gabriel de Oliveira ");
		cliente1.setTelefone("11 94750-3222");
		cliente1.setEmail("testes@hotmail.com");

		var cliente2 = new Cliente();

		cliente2.setId(2L);
		cliente2.setNome("Nathalia Lima");
		cliente2.setTelefone("11 93333-2312");
		cliente2.setEmail("qwertys@hotmail.com");

		return Arrays.asList(cliente1, cliente2);
	}

}
