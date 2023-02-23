package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;

public class MenuConsultancyRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, MenuConsultancy> mapLayoutList = new HashMap<Integer, MenuConsultancy>();
	
	public static boolean addMenuConsultancy(MenuConsultancy menuConsultancy) {
		
		menuConsultancy.setId(id++);
		
		try {
			mapLayoutList.put(menuConsultancy.getId(), menuConsultancy);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public static MenuConsultancy removeMenuConsultancy(Integer menuId) {
		
		return mapLayoutList.remove(menuId);
		
	}
	
	public static Collection<MenuConsultancy> getMenuConsultancyList() {
		return mapLayoutList.values();
	}

}
