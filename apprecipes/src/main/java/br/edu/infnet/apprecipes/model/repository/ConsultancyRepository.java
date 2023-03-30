package br.edu.infnet.apprecipes.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.Consultancy;

@Repository
public interface ConsultancyRepository extends CrudRepository<Consultancy, Integer>{
	
	@Query("from Consultancy c where c.user.id = :userId")
	List<Consultancy> getList(Integer userId, Sort sort);

}
