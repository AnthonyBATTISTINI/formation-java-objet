package model;

public class Pizza {
	private String code;
	private String libelle;
	private double prix;
	
	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public double getPrix() {
		return this.prix;
	}
}