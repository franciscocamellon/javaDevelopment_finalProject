package br.edu.infnet.apprecipes.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;

public interface MenuConsultancyRepository extends CrudRepository<MenuConsultancy, Integer> {
	
	@Query("from MenuConsultancy mc where mc.user.id = :userId")
	List<MenuConsultancy> getList(Integer userId, Sort sort);

}
