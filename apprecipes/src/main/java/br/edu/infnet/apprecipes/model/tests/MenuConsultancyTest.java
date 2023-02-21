package br.edu.infnet.apprecipes.model.tests;

import br.edu.infnet.apprecipes.model.domain.MenuConsultancy;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class MenuConsultancyTest {

	public static void main(String[] args) {

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
			MenuConsultancy mc4 = new MenuConsultancy(null, 200, 0, false);
			mc4.setMenuType("Comida e Sobremesa");
			mc4.setCuisine("Italiana");
			System.out.println(mc4);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
