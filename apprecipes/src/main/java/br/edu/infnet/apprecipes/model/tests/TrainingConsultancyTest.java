package br.edu.infnet.apprecipes.model.tests;

import br.edu.infnet.apprecipes.model.domain.TrainingConsultancy;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;
import br.edu.infnet.apprecipes.model.exceptions.ZeroCostException;

public class TrainingConsultancyTest {

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
			TrainingConsultancy tc4 = new TrainingConsultancy(" ", 350, 125600, 200);
			tc4.setTrainingType("Estoque");
			tc4.setQtyPeople(20);
			System.out.println(tc4);
		} catch (ZeroCostException | NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
