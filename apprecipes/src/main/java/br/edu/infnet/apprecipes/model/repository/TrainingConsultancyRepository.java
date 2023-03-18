package br.edu.infnet.apprecipes.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;

public interface TrainingConsultancyRepository extends CrudRepository<TrainingConsultancy, Integer> {
	
	@Query("from TrainingConsultancy tc where tc.user.id = :userId")
	List<TrainingConsultancy> getList(Integer userId);

}
