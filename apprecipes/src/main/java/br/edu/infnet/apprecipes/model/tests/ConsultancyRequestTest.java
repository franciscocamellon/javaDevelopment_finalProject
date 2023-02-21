package br.edu.infnet.apprecipes.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.domain.Consultancy;
import br.edu.infnet.apprecipes.model.domain.ConsultancyRequest;
import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.RecipeWithoutChefException;
import br.edu.infnet.apprecipes.model.exceptions.RecipeWithoutIngredientsException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class ConsultancyRequestTest {

	public static void main(String[] args) {
		
		List<Consultancy> consultancy1 = new ArrayList<Consultancy>();
		List<Consultancy> consultancy2 = new ArrayList<Consultancy>();
		List<Consultancy> consultancy3 = new ArrayList<Consultancy>();
		List<Consultancy> consultancy4 = new ArrayList<Consultancy>();
		
		try {
			TrainingConsultancy tc1 = new TrainingConsultancy("Projeto", 30, 20000, 15);
			tc1.setTrainingType("Boas práticas");
			tc1.setQtyPeople(20);
			
			consultancy2.add(tc1);
			consultancy4.add(tc1);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
			
		try {
			TrainingConsultancy tc2 = new TrainingConsultancy("Indeterminado", 1000, 100000, 300);
			tc2.setTrainingType("Mudança de praça");
			tc2.setQtyPeople(5);
			
			consultancy1.add(tc2);
			consultancy2.add(tc2);
			consultancy3.add(tc2);
			consultancy4.add(tc2);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
			
		try {
			TrainingConsultancy tc3 = new TrainingConsultancy("Tempo Fixo", 100, 15000, 70);
			tc3.setTrainingType("Novo cardápio");
			tc3.setQtyPeople(30);
			
			consultancy1.add(tc3);
			consultancy3.add(tc3);
			consultancy4.add(tc3);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			MenuConsultancy mc1 = new MenuConsultancy("Projeto", 30, 20000, false);
			mc1.setMenuType("Comida");
			mc1.setCuisine("Brasileira");
			
			consultancy4.add(mc1);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			MenuConsultancy mc2 = new MenuConsultancy("Indeterminado", 1000, 100000, true);
			mc2.setMenuType("Sobremesa");
			mc2.setCuisine("Francesa");
			
			consultancy1.add(mc2);
			consultancy4.add(mc2);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			MenuConsultancy mc3 = new MenuConsultancy("Tempo Fixo", 100, 15000, false);
			mc3.setMenuType("Bebidas");
			mc3.setCuisine("Marroquina");
			
			consultancy2.add(mc3);
			consultancy4.add(mc3);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			LayoutConsultancy lc1 = new LayoutConsultancy("Projeto", 30, 20000, false);
			lc1.setLayoutType("Construção");
			lc1.setKitchenType("Quente");
			
			consultancy4.add(lc1);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			LayoutConsultancy lc2 = new LayoutConsultancy("Indeterminado", 1000, 100000, false);
			lc2.setLayoutType("Construção");
			lc2.setKitchenType("Mista");
			
			consultancy1.add(lc2);
			consultancy4.add(lc2);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			LayoutConsultancy lc3 = new LayoutConsultancy("Tempo Fixo", 100, 15000, true);
			lc3.setLayoutType("Reforma");
			lc3.setKitchenType("Quente");
			
			consultancy1.add(lc3);
			consultancy2.add(lc3);
			consultancy3.add(lc3);
			consultancy4.add(lc3);
			
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			ConsultancyRequest r1 = new ConsultancyRequest(new Client(null, "Empreendedor", "maria.cantucci@email.com" ), consultancy1);
			r1.setTotalCost(150000);
			r1.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			ConsultancyRequest r2 = new ConsultancyRequest(new Client("Restaurante", "Maria", "maria@email.com"), consultancy2);
			r2.setTotalCost(190000);
			r2.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			ConsultancyRequest r3 = new ConsultancyRequest(new Client("Restaurante", "Manel", "manel@email.com"), consultancy3);
			r3.setTotalCost(50000);
			r3.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			ConsultancyRequest r4 = new ConsultancyRequest(new Client("Empreendedor", "Jose", "jose.empreende@email.com"), consultancy4);
			r4.setTotalCost(70000);
			r4.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			ConsultancyRequest r5 = new ConsultancyRequest(null, consultancy4);
			r5.setTotalCost(150000);
			r5.printReport();
		} catch (RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Client s6 = new Client("Francisco", "Pizza Dominos", "chico.bala@email.com");
			
			ConsultancyRequest r6 = new ConsultancyRequest(s6, null);
			r6.setTotalCost(150000);
			r6.printReport();
		} catch (NullOrEmptyAttributeException | RecipeWithoutChefException | RecipeWithoutIngredientsException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
