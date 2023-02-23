package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;

public class TrainingConsultancyRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, TrainingConsultancy> mapLayoutList = new HashMap<Integer, TrainingConsultancy>();
	
	public static boolean addTrainingConsultancy(TrainingConsultancy trainingConsultancy) {
		
		trainingConsultancy.setId(id++);
		
		try {
			mapLayoutList.put(trainingConsultancy.getId(), trainingConsultancy);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public static TrainingConsultancy removeTrainingConsultancy(Integer menuId) {
		
		return mapLayoutList.remove(menuId);
		
	}
	
	public static Collection<TrainingConsultancy> getTrainingConsultancyList() {
		return mapLayoutList.values();
	}

}
