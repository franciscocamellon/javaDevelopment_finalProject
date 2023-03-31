package br.edu.infnet.apprecipes.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{
	
	@Query("from Client c where c.user.id = :userId")
	List<Client> getList(Integer userId, Sort sort);

}
