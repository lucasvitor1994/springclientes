package br.ti.springbootclientes.controllers;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ti.springbootclientes.dtos.ClientesDtos;
import br.ti.springbootclientes.model.ClientesModel;
import br.ti.springbootclientes.repository.ClientesRepositories;
import br.ti.springbootclientes.service.ClientesServices;
import ch.qos.logback.core.status.Status;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClientsController {

	@Autowired
	ClientesRepositories clientesRepositories;
	
	final ClientesServices clientesServices;
	
	public ClientsController(ClientesServices clientesServices) {
		this.clientesServices = clientesServices;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("TESTEEEEEE");
		return "TESTE";
	}
	@RequestMapping(value = "/listaclientes", method = RequestMethod.GET)
	public List<ClientesModel> getAllClientes() {
		
		return clientesRepositories.findAll();
	}
	
	
//	@RequestMapping(value = "/savecliente", method = RequestMethod.POST)
	@PostMapping("/savecliente")
	public ResponseEntity<Object> saveCliente(@RequestBody @Valid ClientesDtos clientesDtos){
//		ClientesModel clientesModel = new ClientesModel();	
		var clientesModel = new ClientesModel();
		BeanUtils.copyProperties(clientesDtos, clientesModel);
		return ResponseEntity.status(HttpStatus.OK).body(clientesRepositories.save(clientesModel));
	}
	
	@PostMapping("/savecliente2")
	public ResponseEntity<Object> saveClienteDto(@RequestBody @Valid ClientesDtos clientesDtos){
		var clientesModel = new ClientesModel();
		BeanUtils.copyProperties(clientesDtos, clientesModel);
		return ResponseEntity.status(HttpStatus.OK).body(clientesServices.save(clientesModel));
//		return ResponseEntity.status(HttpStatus.OK).body("recebido");
	}
	
	
	@GetMapping("/{cpf}")
	public ResponseEntity<Object> getClientByCpf(@PathVariable(value = "cpf")String cpf){
		return ResponseEntity.status(HttpStatus.CREATED).body(clientesRepositories.findByCpf(cpf));
	}
	


}
