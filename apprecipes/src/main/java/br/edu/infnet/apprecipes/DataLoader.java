package br.edu.infnet.apprecipes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apprecipes.model.domain.AppRecipesUser;
import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.service.ClientService;
import br.edu.infnet.apprecipes.model.service.LayoutConsultancyService;
import br.edu.infnet.apprecipes.model.service.MenuConsultancyService;
import br.edu.infnet.apprecipes.model.service.TrainingConsultancyService;
import br.edu.infnet.apprecipes.model.service.UserService;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private LayoutConsultancyService layoutService;
	@Autowired
	private MenuConsultancyService menuService;
	@Autowired
	private TrainingConsultancyService trainingService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			
			String file = "mockupData.txt";
			
			try {
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
				
				String fileLine = reader.readLine();
				String[] fields = null;
				
				while (fileLine != null) {
					
					fields = fileLine.split(";");
					
					switch (fields[0]) {
					case "user":
							
						AppRecipesUser appRecipesUser = new AppRecipesUser(fields[1], fields[2], fields[3]);
						
						userService.addUser(appRecipesUser);
						
						System.out.println("Inclusão do usuário "+appRecipesUser.getName()+" realizada com sucesso!");
						
						break;
						
					case "client":
						
						Client client = new Client(fields[1], fields[2], fields[3], fields[4]);
						
						clientService.addClient(client);
						
						System.out.println("Inclusão do cliente "+client.getName()+" realizada com sucesso!");
						
						break;
						
					case "layout":
						
						LayoutConsultancy layoutConsultancy = new LayoutConsultancy(
								fields[1], 
								Float.parseFloat(fields[2]), 
								Float.parseFloat(fields[3]), 
								Boolean.parseBoolean(fields[4]), 
								fields[5], 
								fields[6]);
						
						layoutService.addLayoutConsultancy(layoutConsultancy);
						
						System.out.println("Inclusão de consultoria de layout realizada com sucesso!");
						
						break;
						
					case "menu":
						
						MenuConsultancy menuConsultancy = new MenuConsultancy(
								fields[1], 
								Float.parseFloat(fields[2]), 
								Float.parseFloat(fields[3]), 
								Boolean.parseBoolean(fields[4]), 
								fields[5], 
								fields[6]);
						
						menuService.addMenuConsultancy(menuConsultancy);
						
						System.out.println("Inclusão de consultoria de menu realizada com sucesso!");
						
						break;
						
					case "training":
						
						TrainingConsultancy trainingConsultancy = new TrainingConsultancy(
								fields[1], 
								Float.parseFloat(fields[2]), 
								Float.parseFloat(fields[3]),
								Float.parseFloat(fields[4]),
								fields[5],
								Integer.parseInt(fields[6]));
						
						trainingService.addTrainingConsultancy(trainingConsultancy);
						
						break; 

					default:
						System.out.println("Registro inválido!");
						break;
					}
					
					fileLine = reader.readLine();
					
				}
				
				reader.close();
				fileReader.close();
				
			} catch (IOException e) {
				
				System.out.println("[ERRO] " + e.getMessage());
				
			}
			
		} finally {
			
			System.out.println("Dados adicionados com sucesso!");
			
		}
	}
}
