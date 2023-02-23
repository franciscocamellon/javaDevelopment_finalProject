package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;

public class LayoutConsultancyRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, LayoutConsultancy> mapLayoutList = new HashMap<Integer, LayoutConsultancy>();
	
	public static boolean addLayoutConsultancy(LayoutConsultancy layoutConsultancy) {
		
		layoutConsultancy.setId(id++);
		
		try {
			mapLayoutList.put(layoutConsultancy.getId(), layoutConsultancy);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public static LayoutConsultancy removeLayoutConsultancy(Integer layoutId) {
		
		return mapLayoutList.remove(layoutId);
		
	}
	
	public static Collection<LayoutConsultancy> getLayoutConsultancyList() {
		return mapLayoutList.values();
	}

}
