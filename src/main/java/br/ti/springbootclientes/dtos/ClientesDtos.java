package br.ti.springbootclientes.dtos;

import jakarta.validation.constraints.NotBlank;

public class ClientesDtos {
	
	@NotBlank
	private String cpf;
	@NotBlank(message = "primeiro nome nao pode ser vazio")
	private String fristName;
	@NotBlank(message = "ultimo nome nao pode ser vazio")
	private String lastName;
	@NotBlank
	private String stateCliente;
	@NotBlank
	private String acconuntType;

	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStateCliente() {
		return stateCliente;
	}
	public void setStateCliente(String stateCliente) {
		this.stateCliente = stateCliente;
	}
	public String getAcconuntType() {
		return acconuntType;
	}
	public void setAcconuntType(String acconuntType) {
		this.acconuntType = acconuntType;
	}
	
	
	
}
