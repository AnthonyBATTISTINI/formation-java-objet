package factory;

import service.*;

public class MenuServiceFactory {
	public static MenuService selectService(int choix) {
		switch(choix) {
		case 1:
			System.out.println("Liste des pizzas");
			return new ListerPizzasService();
		case 2:
			System.out.println("Ajout d'une nouvelle pizza");
			return new AjouterPizzaService();
		case 3:
			System.out.println("Mise � jour d'une pizza");
			return new ModifierPizzaService();
		case 4:
			System.out.println("Suppression d'une pizza");
			return new SupprimerPizzaService();
		case 99:
			System.out.println("Au revoir");
			System.exit(0);
		default:
			System.out.println("Choix non valide");
			return null;
		}
	}
}
