package br.edu.infnet.apprecipes.model.tests;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class ConsultancyTest {

	public static void main(String[] args) {

		try {
			TrainingConsultancy tc1 = new TrainingConsultancy("Projeto", 30, 20000, 15);
			tc1.setTrainingType("Boas práticas");
			tc1.setQtyPeople(20);
			System.out.println(tc1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			TrainingConsultancy tc2 = new TrainingConsultancy("Indeterminado", 1000, 100000, 300);
			tc2.setTrainingType("Mudança de praça");
			tc2.setQtyPeople(5);
			System.out.println(tc2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			TrainingConsultancy tc3 = new TrainingConsultancy("Tempo Fixo", 100, 15000, 70);
			tc3.setTrainingType("Novo cardápio");
			tc3.setQtyPeople(30);
			System.out.println(tc3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			MenuConsultancy mc1;
			mc1 = new MenuConsultancy("Projeto", 30, 20000, false);
			mc1.setMenuType("Comida");
			mc1.setCuisine("Brasileira");
			System.out.println(mc1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			MenuConsultancy mc2 = new MenuConsultancy("Indeterminado", 1000, 100000, true);
			mc2.setMenuType("Sobremesa");
			mc2.setCuisine("Francesa");
			System.out.println(mc2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			MenuConsultancy mc3 = new MenuConsultancy("Tempo Fixo", 100, 15000, false);
			mc3.setMenuType("Bebidas");
			mc3.setCuisine("Marroquina");
			System.out.println(mc3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			LayoutConsultancy lc1;
			lc1 = new LayoutConsultancy("Projeto", 30, 20000, false);
			lc1.setLayoutType("Construção");
			lc1.setKitchenType("Quente");
			lc1.toString();
			System.out.println(lc1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			LayoutConsultancy lc2 = new LayoutConsultancy("Indeterminado", 1000, 100000, false);
			lc2.setLayoutType("Construção");
			lc2.setKitchenType("Mista");
			lc2.toString();
			System.out.println(lc2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			LayoutConsultancy lc3 = new LayoutConsultancy("Tempo Fixo", 100, 15000, true);
			lc3.setLayoutType("Reforma");
			lc3.setKitchenType("Quente");
			lc3.toString();
			System.out.println(lc3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}

	}

}
