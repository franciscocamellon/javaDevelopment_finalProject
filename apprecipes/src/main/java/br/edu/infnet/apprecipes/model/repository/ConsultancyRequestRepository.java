package br.edu.infnet.apprecipes.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.apprecipes.model.domain.ConsultancyRequest;

public class ConsultancyRequestRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, ConsultancyRequest> mapRequestList = new HashMap<Integer, ConsultancyRequest>();
	
	public static boolean addRequest(ConsultancyRequest consultancyRequest) {
		
		consultancyRequest.setId(id++);
		
		try {
			mapRequestList.put(consultancyRequest.getId(), consultancyRequest);
			return true;		
		} catch (Exception e) {
			return false;
		}
	}
	
	public static ConsultancyRequest removeRequest(Integer requestId) {
		
		return mapRequestList.remove(requestId);
		
	}
	
	public static Collection<ConsultancyRequest> getRequestList() {
		return mapRequestList.values();
	}
	
}
