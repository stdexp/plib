package metier;

import java.util.List;

import entities.Produit;

public interface ICatalogueMetier {
	
	public  List<Produit >getProduits();
	public  Produit  getProduit(Long idProd);
	public  List<Produit>getProduitsParMC(String mc);
	public Produit addProduit(Produit p);
	public Produit UpdateProduit(Long idProd,Produit p);
	public void deleteProduit(Long idProd);

}
