package service;

import java.util.Scanner;

import dao.IPizzaDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner s, IPizzaDao dao) {
		boolean codeValide;
		String code;
		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		code = s.next();
		codeValide = dao.pizzaExists(code);
		if(!codeValide) {
			System.out.println("Code inexistant");
		}
		else {
			dao.deletePizza(code);
			System.out.println("Suppression effective");
		}
	}
}
