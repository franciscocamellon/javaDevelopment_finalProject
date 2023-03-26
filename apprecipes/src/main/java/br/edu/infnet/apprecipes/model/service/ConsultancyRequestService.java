package br.edu.infnet.apprecipes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.ConsultancyRequest;
import br.edu.infnet.apprecipes.model.repository.ConsultancyRequestRepository;

@Service
public class ConsultancyRequestService {
	
	@Autowired
	private ConsultancyRequestRepository consultancyRequestRepository;
	
	public ConsultancyRequest addConsultancyRequest(ConsultancyRequest consultancyRequest) {
		return consultancyRequestRepository.save(consultancyRequest);
	}
	
	public void removeConsultancyRequest(Integer menuId) {
		consultancyRequestRepository.deleteById(menuId);
		
	}
	
	public ConsultancyRequest getById(Integer id) {
		return consultancyRequestRepository.findById(id).orElse(null);
	}
	
	public Collection<ConsultancyRequest> getConsultancyRequestList() {
		return (Collection<ConsultancyRequest>) consultancyRequestRepository.findAll();
	}
	
	public Collection<ConsultancyRequest> getConsultancyRequestList(AppRecipesUser user) {
		return consultancyRequestRepository.getList(user.getId());
	}

}
