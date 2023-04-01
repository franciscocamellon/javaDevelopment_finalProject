package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.repository.LayoutConsultancyRepository;

@Service
public class LayoutConsultancyService {
	
	@Autowired
	private LayoutConsultancyRepository layoutRepository;
	
	public LayoutConsultancy addLayoutConsultancy(LayoutConsultancy layoutConsultancy) {
		return layoutRepository.save(layoutConsultancy);
	}
	
	public void removeLayoutConsultancy(Integer layoutId) {
		layoutRepository.deleteById(layoutId);
	}
	
	public LayoutConsultancy getById(Integer id) {
		return layoutRepository.findById(id).orElse(null);
	}
	
	public Collection<LayoutConsultancy> getLayoutConsultancyList() {
		return (Collection<LayoutConsultancy>) layoutRepository.findAll();
	}
	
	public Collection<LayoutConsultancy> getLayoutConsultancyList(AppRecipesUser user) {
		return layoutRepository.getList(user.getId(), Sort.by(Direction.ASC, "name"));
	}

}
