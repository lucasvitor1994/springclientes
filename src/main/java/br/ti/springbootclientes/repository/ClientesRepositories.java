package br.ti.springbootclientes.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ti.springbootclientes.model.ClientesModel;

@Repository
public interface ClientesRepositories extends JpaRepository<ClientesModel, String>{

	Optional<ClientesModel> findByCpf(String cpf);

}
