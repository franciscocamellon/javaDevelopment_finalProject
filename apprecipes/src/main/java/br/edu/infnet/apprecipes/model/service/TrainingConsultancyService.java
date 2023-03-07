package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.repository.TrainingConsultancyRepository;

@Service
public class TrainingConsultancyService {
	
	@Autowired
	private TrainingConsultancyRepository trainingRepository;
	
	public boolean addTrainingConsultancy(TrainingConsultancy trainingConsultancy) {
		return trainingRepository.addTrainingConsultancy(trainingConsultancy);
	}
	
	public TrainingConsultancy removeTrainingConsultancy(Integer menuId) {
		return trainingRepository.removeTrainingConsultancy(menuId);
		
	}
	
	public Collection<TrainingConsultancy> getTrainingConsultancyList() {
		return trainingRepository.getTrainingConsultancyList();
	}

}
