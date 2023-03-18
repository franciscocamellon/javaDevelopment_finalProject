package br.edu.infnet.apprecipes.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;

public interface LayoutConsultancyRepository extends CrudRepository<LayoutConsultancy, Integer> {
	
	@Query("from LayoutConsultancy lc where lc.user.id = :userId")
	List<LayoutConsultancy> getList(Integer userId);

}
