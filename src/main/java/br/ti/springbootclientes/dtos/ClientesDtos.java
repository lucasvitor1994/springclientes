package br.ti.springbootclientes.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ClientesDtos {
	
	@Size(min = 11, max = 11)
	@NotBlank
	private String cpf;
	@NotBlank
	private String fristName;
	@NotBlank(message = "nao pode ser vazio")
	private String lastName;
	@NotBlank
	@Size(max = 1)
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
