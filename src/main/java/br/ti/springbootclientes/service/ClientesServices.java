package br.ti.springbootclientes.service;

import org.springframework.stereotype.Service;

import br.ti.springbootclientes.model.ClientesModel;
import br.ti.springbootclientes.repository.ClientesRepositories;

@Service
public class ClientesServices {
	
	final ClientesRepositories clientesRepositories;
	public ClientesServices(ClientesRepositories clientesRepositories) {
		this.clientesRepositories = clientesRepositories;
	}
	
	public ClientesModel save(ClientesModel clientesModel) {
		// TODO Auto-generated method stub
		return clientesRepositories.save(clientesModel);
	}
	
	

	
}
