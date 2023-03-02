package br.ti.springbootclientes.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ti.springbootclientes.model.ClientesModel;
import br.ti.springbootclientes.repository.ClientesRepositories;

@RestController
@RequestMapping("/clientes")
public class ClientsController {

	@Autowired
	ClientesRepositories clientesRepositories;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("TESTEEEEEE");
		return "TESTE";
	}
	@RequestMapping(value = "/listaclientes", method = RequestMethod.GET)
	public List<ClientesModel> getAllClientes() {
		
		return clientesRepositories.findAll();
	}
	
	
	@RequestMapping(value = "/savecliente", method = RequestMethod.POST)
	public ResponseEntity<Object> savecliente(@RequestBody ClientesModel clientesModel){
		return ResponseEntity.status(HttpStatus.OK).body(clientesRepositories.save(clientesModel));
	}


}
