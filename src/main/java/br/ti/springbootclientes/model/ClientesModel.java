package br.ti.springbootclientes.model;

import java.util.UUID;

import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Clientes")
public class ClientesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable = false)
	private String fristName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String stateCliente;
	@Column(nullable = false)
	private String acconuntType;
	@Column(nullable = false)
	private String cpf;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	

}
