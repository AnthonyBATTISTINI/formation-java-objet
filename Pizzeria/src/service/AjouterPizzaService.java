package service;

import java.util.Scanner;

import dao.IPizzaDao;
import model.Pizza;

public class AjouterPizzaService extends MenuService {

	@Override
	public void executeUC(Scanner s, IPizzaDao dao) {
		System.out.println("Veuillez saisir le code :");
		String code = s.next();
		System.out.println("Veuillez saisir le nom :");
		String libelle = s.next();
		System.out.println("Veuillez saisir le prix :");
		double prix = s.nextDouble();
		dao.saveNewPizza(new Pizza(code, libelle, prix));
		System.out.println("Ajout effectuer");
	}
}
