package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;

@Repository
public class TrainingConsultancyRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, TrainingConsultancy> mapLayoutList = new HashMap<Integer, TrainingConsultancy>();
	
	public boolean addTrainingConsultancy(TrainingConsultancy trainingConsultancy) {
		
		trainingConsultancy.setId(id++);
		
		try {
			mapLayoutList.put(trainingConsultancy.getId(), trainingConsultancy);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public TrainingConsultancy removeTrainingConsultancy(Integer trainingId) {
		
		return mapLayoutList.remove(trainingId);
		
	}
	
	public Collection<TrainingConsultancy> getTrainingConsultancyList() {
		return mapLayoutList.values();
	}

}
