package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.repository.LayoutConsultancyRepository;

@Service
public class LayoutConsultancyService {
	
	@Autowired
	private LayoutConsultancyRepository layoutRepository;
	
	public boolean addLayoutConsultancy(LayoutConsultancy layoutConsultancy) {
		return layoutRepository.addLayoutConsultancy(layoutConsultancy);
	}
	
	public LayoutConsultancy removeLayoutConsultancy(Integer layoutId) {
		return layoutRepository.removeLayoutConsultancy(layoutId);
		
	}
	
	public Collection<LayoutConsultancy> getLayoutConsultancyList() {
		return layoutRepository.getLayoutConsultancyList();
	}

}
