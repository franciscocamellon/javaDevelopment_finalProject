package br.edu.infnet.apprecipes.model.tests;

import br.edu.infnet.apprecipes.model.domain.Client;
import br.edu.infnet.apprecipes.model.exceptions.NullOrEmptyAttributeException;

public class ClientTest {

	public static void main(String[] args) {

		
		try {
			Client c1 = new Client("Joao", "Restaurante", "joao.almeria@email.com" );
			System.out.println(c1);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Client c2 = new Client(null, "Empreendedor", "maria.cantucci@email.com" );
			System.out.println(c2);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Client c3 = new Client("Manel", "Administrador", "" );
			System.out.println(c3);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Client c4 = new Client("Francisco", "", "chico.bala@email.com" );
			System.out.println(c4);
		} catch (NullOrEmptyAttributeException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
}
