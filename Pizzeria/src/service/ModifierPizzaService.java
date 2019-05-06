package service;

import java.util.Scanner;

import dao.IPizzaDao;

import model.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner s, IPizzaDao dao) {
		boolean codeValide;
		String code;
		System.out.println("Veuillez choisir le code de la pizza à modifier");
		code = s.next();
		codeValide = dao.pizzaExists(code);
		if(!codeValide) {
			System.out.println("Code inexistant");
		}
		else {
			System.out.println("Veuillez saisir le nouveau code :");
			String newCode = s.next();
			System.out.println("Veuillez saisir le nouveau nom :");
			String libelle = s.next();
			System.out.println("Veuillez saisir le nouveau prix :");
			double prix = s.nextDouble();
			dao.updatePizza(code, new Pizza(newCode, libelle, prix));
			System.out.println("Modification effective");
		}
	}
}
