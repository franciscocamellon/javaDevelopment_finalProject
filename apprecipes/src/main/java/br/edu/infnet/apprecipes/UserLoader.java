package br.edu.infnet.apprecipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.service.UserService;

@Component
public class UserLoader implements ApplicationRunner {
	
	@Autowired
	private UserService userService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		AppRecipesUser appRecipesUser = new AppRecipesUser("Administrador", "administrador@email.com", "administrador@email.com");
		appRecipesUser.setId(1);
		appRecipesUser.setAge(42);
		appRecipesUser.setZip("70745-080");
		appRecipesUser.setAddress("SQN 306 BLOCO H APTO 602");
		
		userService.addUser(appRecipesUser);
		
		System.out.println("Inclusão do usuário "+appRecipesUser.getName()+" realizada com sucesso!");
		
	}
	
	

}
