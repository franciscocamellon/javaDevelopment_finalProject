package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.Consultancy;
import br.edu.infnet.apprecipes.model.repository.ConsultancyRepository;

@Service
public class ConsultancyService {
	
	@Autowired
	private ConsultancyRepository consultancyRepository;
	
	public void removeConsultancy(Integer layoutId) {
		consultancyRepository.deleteById(layoutId);
	}
	
	public Consultancy getById(Integer id) {
		return consultancyRepository.findById(id).orElse(null);
	}
	
	public Collection<Consultancy> getConsultancyList() {
		return (Collection<Consultancy>) consultancyRepository.findAll();
	}
	
	public Collection<Consultancy> getConsultancyList(AppRecipesUser user) {
		return consultancyRepository.getList(user.getId(), Sort.by(Direction.ASC, "name"));
	}

	public Long getTotalConsultancies(AppRecipesUser user) {
		
		if (user.isAdmin()) {
			return consultancyRepository.count();
		}
		
		return consultancyRepository.getTotal(user.getId());
	}

}
