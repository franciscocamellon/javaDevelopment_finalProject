package br.edu.infnet.apprecipes.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

}
