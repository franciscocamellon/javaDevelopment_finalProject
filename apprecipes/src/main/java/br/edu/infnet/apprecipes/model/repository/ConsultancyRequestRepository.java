package br.edu.infnet.apprecipes.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.ConsultancyRequest;

@Repository	
public interface ConsultancyRequestRepository extends CrudRepository<ConsultancyRequest, Integer> {
	
	@Query("from ConsultancyRequest cr where cr.user.id = :userId")
	List<ConsultancyRequest> getList(Integer userId, Sort sort);
	
	@Query("select count(cr) from ConsultancyRequest cr where cr.user.id = :userId")
	Long getTotal(Integer userId);
	
}
