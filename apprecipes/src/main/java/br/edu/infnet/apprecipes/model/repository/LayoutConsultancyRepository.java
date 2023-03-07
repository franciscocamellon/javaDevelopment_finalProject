package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;

@Repository
public class LayoutConsultancyRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, LayoutConsultancy> mapLayoutList = new HashMap<Integer, LayoutConsultancy>();
	
	public boolean addLayoutConsultancy(LayoutConsultancy layoutConsultancy) {
		
		layoutConsultancy.setId(id++);
		
		try {
			mapLayoutList.put(layoutConsultancy.getId(), layoutConsultancy);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public LayoutConsultancy removeLayoutConsultancy(Integer layoutId) {
		
		return mapLayoutList.remove(layoutId);
		
	}
	
	public Collection<LayoutConsultancy> getLayoutConsultancyList() {
		return mapLayoutList.values();
	}

}
