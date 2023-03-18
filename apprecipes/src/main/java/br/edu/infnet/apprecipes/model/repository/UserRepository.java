package br.edu.infnet.apprecipes.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;

@Repository
public interface UserRepository extends CrudRepository<AppRecipesUser, Integer>{
	
	@Query("from AppRecipesUser u where u.email = :email and u.password = :password")
	AppRecipesUser authentication(String email, String password);

}
