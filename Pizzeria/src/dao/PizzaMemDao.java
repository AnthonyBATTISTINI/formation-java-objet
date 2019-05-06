package dao;

import model.Pizza;

public class PizzaMemDao implements IPizzaDao {

	private static Pizza[] arrayPizzas= new Pizza[0];
	
	@Override
	/**
	 * This function return the array of Pizza
	 */
	public Pizza[] findAllPizzas() {
		return arrayPizzas;
	}

	@Override
	/**
	 * This process add a Pizza in the array
	 */
	public void saveNewPizza(Pizza pizza) {
		int i = 0;
		while(i < arrayPizzas.length && arrayPizzas[i] != null) {
			i++;
		}
		if(i == arrayPizzas.length) {
			Pizza[] arrayPizzasTemp = new Pizza[arrayPizzas.length + 1];
			for(int j = 0; j < arrayPizzas.length; j++) {
				arrayPizzasTemp[j] = arrayPizzas[j];
			}
			arrayPizzas = arrayPizzasTemp;
		}
		arrayPizzas[i] = pizza;
	}

	@Override
	/**
	 * This process update the pizza who have a codePizza by the new pizza
	 * But the codePizza exist in the array
	 */
	public void updatePizza(String codePizza, Pizza pizza) {
		int i = 0;
		while(!arrayPizzas[i].getCode().equalsIgnoreCase(codePizza)) {
			i++;
		}
		arrayPizzas[i] = pizza;
	}

	@Override
	/**
	 * This process delete the pizza who have a codePizza
	 * But the codePizza exist in the array
	 */
	public void deletePizza(String codePizza) {
		int i = 0;
		while(!arrayPizzas[i].getCode().equalsIgnoreCase(codePizza)) {
			i++;
		}
		Pizza[] arrayPizzasTemp = new Pizza[arrayPizzas.length - 1];
		for(int j = 0; j < i; j++) {
			arrayPizzasTemp[j] = arrayPizzas[j];
		}
		for(int j = i; j < arrayPizzasTemp.length; j++) {
			arrayPizzasTemp[j] = arrayPizzas[j + 1];
		}
		arrayPizzas = arrayPizzasTemp;
	}

	@Override
	/**
	 * This function return the pizza who have a codePizza
	 * But the codePizza exist in the array
	 */
	public Pizza findPizzaByCode(String codePizza) {
		int i = 0;
		while(!arrayPizzas[i].getCode().equalsIgnoreCase(codePizza)) {
			i++;
		}
		return arrayPizzas[i];
	}

	@Override
	/**
	 * This function return true if the codePizza exist in the array
	 */
	public boolean pizzaExists(String codePizza) {
		for(int i = 0; i < arrayPizzas.length; i++) {
			if(arrayPizzas[i].getCode().equalsIgnoreCase(codePizza)) {
				return true;
			}
		}
		return false;
	}
}