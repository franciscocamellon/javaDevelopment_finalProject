package br.edu.infnet.apprecipes.model.tests;

import br.edu.infnet.apprecipes.model.domain.LayoutConsultancy;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class LayoutConsultancyTest {

	public static void main(String[] args) {
		
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
		
		try {
			LayoutConsultancy lc4 = new LayoutConsultancy("", 1, 0, false);
			lc4.setLayoutType("Construção");
			lc4.setKitchenType("Fria");
			lc4.toString();
			System.out.println(lc4);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
	}
}
