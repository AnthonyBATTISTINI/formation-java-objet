package service;

import java.util.Scanner;

import dao.IPizzaDao;
import model.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(Scanner s, IPizzaDao dao) {
		Pizza[] arrayPizzas = dao.findAllPizzas();
		for(int i = 0; i < arrayPizzas.length; i++) {
			System.out.println(arrayPizzas[i].getCode() + " -> " + arrayPizzas[i].getLibelle() + " (" + String.format("%.2f", arrayPizzas[i].getPrix()) + "€)");
		}
		System.out.println();
	}
}
