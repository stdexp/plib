package entities;

import java.io.Serializable;

public class Produit implements Serializable {
	
	private Long idprod;
	private String nom;
	private double prix;
	
	public Produit() {
		super();
	}

	public Produit(Long idprod, String nom, double prix) {
		super();
		this.idprod = idprod;
		this.nom = nom;
		this.prix = prix;
	}

	public Long getIdprod() {
		return idprod;
	}

	public void setIdprod(Long idprod) {
		this.idprod = idprod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [idprod=" + idprod + ", nom=" + nom + ", prix=" + prix + "]";
	}
	
	
	

}
