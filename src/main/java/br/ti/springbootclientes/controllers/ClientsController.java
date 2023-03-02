package br.ti.springbootclientes.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientsController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		System.out.println("TESTEEEEEE");
		return "TESTE";
	}

	

}
