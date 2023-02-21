package br.edu.infnet.apprecipes.model.tests;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class SpiceTest {

	public static void main(String[] args) {

		try {
		TrainingConsultancy sp1 = new TrainingConsultancy("Páprica", 0.1f, 1, "Avermelhado");
		sp1.setSpiceForm("Moído");
		sp1.setTaste("Agridoce");
		System.out.println(sp1);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
		TrainingConsultancy sp2 = new TrainingConsultancy("Pimenta do reino", 0.15f, -0.5f, "Incolor");
		sp2.setSpiceForm("Moído");
		sp2.setTaste("Apimentado");
		System.out.println(sp2);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
		TrainingConsultancy sp3 = new TrainingConsultancy("Aniz estrelado", 0.20f, 0, "Incolor");
		sp3.setSpiceForm("Fresco");
		sp3.setTaste("Azedo");
		System.out.println(sp3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			TrainingConsultancy sp3 = new TrainingConsultancy(" ", 0.20f, 1, "Incolor");
			sp3.setSpiceForm("Fresco");
			sp3.setTaste("Azedo");
			System.out.println(sp3);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
