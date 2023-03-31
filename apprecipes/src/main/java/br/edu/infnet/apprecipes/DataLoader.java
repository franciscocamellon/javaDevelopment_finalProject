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
import br.edu.infnet.apprecipes.model.service.AddressService;
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
	@Autowired
	private AddressService addressService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			
			String file = "mockupData.txt";
			
			try {
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
				
				String fileLine = reader.readLine();
				String[] fields = null;
				
				AppRecipesUser user = new AppRecipesUser();
				user.setId(1);
				
				while (fileLine != null) {
					
					fields = fileLine.split(";");
					
					switch (fields[0]) {
					case "user":
							
						AppRecipesUser appRecipesUser = new AppRecipesUser(fields[1], fields[2], fields[3]);
						appRecipesUser.setAdmin(Boolean.parseBoolean(fields[4]));
						appRecipesUser.setAddress(addressService.getByZIP(fields[5]));
						
						userService.addUser(appRecipesUser);
						
						System.out.println("Usuário "+appRecipesUser.getName()+" incluído com sucesso!");
						
						break;
						
					case "client":
						
						Client client = new Client(fields[1], fields[2], fields[3], fields[4]);
						client.setUser(user);
						client.setAddress(addressService.getByZIP(fields[5]));
						
						clientService.addClient(client);
						
						System.out.println("Cliente "+client.getName()+" incluído com sucesso!");
						
						break;
						
					case "layout":
						
						LayoutConsultancy layoutConsultancy = new LayoutConsultancy(
								fields[2], 
								Float.parseFloat(fields[3]), 
								Float.parseFloat(fields[4]), 
								Boolean.parseBoolean(fields[5]), 
								fields[6], 
								fields[7]);
						
						layoutConsultancy.setName(fields[1]);
						layoutConsultancy.setUser(user);
						
						layoutService.addLayoutConsultancy(layoutConsultancy);
						
						System.out.println("Consultoria "+layoutConsultancy.getName()+" incluída com sucesso!");
						
						break;
						
					case "menu":
						
						MenuConsultancy menuConsultancy = new MenuConsultancy(
								fields[2], 
								Float.parseFloat(fields[3]), 
								Float.parseFloat(fields[4]), 
								Boolean.parseBoolean(fields[5]), 
								fields[6], 
								fields[7]);
						
						menuConsultancy.setName(fields[1]);
						menuConsultancy.setUser(user);
						
						menuService.addMenuConsultancy(menuConsultancy);
						
						System.out.println("Consultoria "+menuConsultancy.getName()+" incluída com sucesso!");
						
						break;
						
					case "training":
						
						TrainingConsultancy trainingConsultancy = new TrainingConsultancy(
								fields[2], 
								Float.parseFloat(fields[3]), 
								Float.parseFloat(fields[4]),
								Float.parseFloat(fields[5]),
								fields[6],
								Integer.parseInt(fields[7]));
						
						trainingConsultancy.setName(fields[1]);
						trainingConsultancy.setUser(user);
						
						trainingService.addTrainingConsultancy(trainingConsultancy);
						
						System.out.println("Consultoria "+trainingConsultancy.getName()+" incluída com sucesso!");
						
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
