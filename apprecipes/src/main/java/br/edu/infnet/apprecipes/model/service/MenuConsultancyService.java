package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.repository.MenuConsultancyRepository;

@Service
public class MenuConsultancyService {
	
	@Autowired
	private MenuConsultancyRepository menuRepository;
	
	public boolean addMenuConsultancy(MenuConsultancy menuConsultancy) {
		return menuRepository.addMenuConsultancy(menuConsultancy);
	}
	
	public MenuConsultancy removeMenuConsultancy(Integer menuId) {
		return menuRepository.removeMenuConsultancy(menuId);
		
	}
	
	public Collection<MenuConsultancy> getMenuConsultancyList() {
		return menuRepository.getMenuConsultancyList();
	}

}
