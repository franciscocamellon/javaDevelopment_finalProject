package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.repository.TrainingConsultancyRepository;

@Service
public class TrainingConsultancyService {
	
	@Autowired
	private TrainingConsultancyRepository trainingRepository;
	
	public TrainingConsultancy addTrainingConsultancy(TrainingConsultancy trainingConsultancy) {
		return trainingRepository.save(trainingConsultancy);
	}
	
	public void removeTrainingConsultancy(Integer menuId) {
		trainingRepository.deleteById(menuId);
	}

	public TrainingConsultancy getById(Integer id) {
		return trainingRepository.findById(id).orElse(null);
	}
	
	public Collection<TrainingConsultancy> getTrainingConsultancyList() {
		return (Collection<TrainingConsultancy>) trainingRepository.findAll();
	}
	
	public Collection<TrainingConsultancy> getTrainingConsultancyList(AppRecipesUser user) {
		return trainingRepository.getList(user.getId(), Sort.by(Direction.ASC, "name"));
	}

}
