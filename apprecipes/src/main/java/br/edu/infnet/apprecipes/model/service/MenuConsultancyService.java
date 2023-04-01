package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.repository.MenuConsultancyRepository;

@Service
public class MenuConsultancyService {
	
	@Autowired
	private MenuConsultancyRepository menuRepository;
	
	public MenuConsultancy addMenuConsultancy(MenuConsultancy menuConsultancy) {
		return menuRepository.save(menuConsultancy);
	}
	
	public void removeMenuConsultancy(Integer menuId) {
		menuRepository.deleteById(menuId);
	}
	
	public MenuConsultancy getById(Integer id) {
		return menuRepository.findById(id).orElse(null);
	}
	
	public Collection<MenuConsultancy> getMenuConsultancyList() {
		return (Collection<MenuConsultancy>) menuRepository.findAll();
	}
	
	public Collection<MenuConsultancy> getMenuConsultancyList(AppRecipesUser user) {
		return menuRepository.getList(user.getId(), Sort.by(Direction.ASC, "cuisine"));
	}

}
