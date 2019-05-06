package service;

import java.util.Scanner;

import dao.IPizzaDao;

public abstract class MenuService {
	public abstract void executeUC(Scanner s, IPizzaDao dao);
}
