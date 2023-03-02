package br.ti.springbootclientes.dtos;

import javax.validation.constraints.Size;

import jakarta.persistence.Column;

public class ClientesDtos {
	
	private String fristName;
	private String lastName;
	private String stateCliente;
	private String acconuntType;
	@Size(min = 11, max = 11)
	private String cpf;

}
