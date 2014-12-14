package com.UTC.BooksMatching.Beans;


public class User {
	private String nom; 
	private String adresse; 
	private String telephone;
	private String dateCreation;
	private String statutCompte;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getStatutCompte() {
		return statutCompte;
	}
	public void setStatutCompte(String statutCompte) {
		this.statutCompte = statutCompte;
	}
	
}
