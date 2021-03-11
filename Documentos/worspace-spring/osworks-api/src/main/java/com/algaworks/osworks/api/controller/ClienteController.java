package com.algaworks.osworks.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.osworks.domain.model.Cliente;;
@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		
		var cliente1 = new Cliente(1L,"Kelly Nascimento","18kellycarvalho@gmail.com","72987498456");
		var cliente2 = new Cliente(2L,"Amanda","Amanda@gmail.com","72987498456");
		var cliente3 = new Cliente(1L,"Júlia","Júlia@gmail.com","72987498456");
		var cliente4 = new Cliente(1L,"Samanta","Samanta@gmail.com","72987498456");
		List<Cliente> a= new ArrayList<Cliente>();
		a.add(cliente1);
		a.add(cliente2);
		a.add(cliente3);
		a.add(cliente4);
		
		return a;
	
	}

}
