package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Produit;

public class CatalogueMetierImpl implements ICatalogueMetier {
	
	private Map<Long, Produit> produits;
	
	public  CatalogueMetierImpl() {
		produits=new HashMap<Long, Produit>();
		initialiser();
	}

	private void initialiser() {

       produits.put(1L, new Produit(1L,"P1",1580.23));
       produits.put(2L, new Produit(2L,"P2",2580.23));
       produits.put(3L, new Produit(3L,"P2",3580.23));
		
	}

	@Override
	public List<Produit> getProduits() {
		
		return new ArrayList<Produit>(produits.values());
	}

	@Override
	public Produit getProduit(Long idProd) {
		
		return produits.get(idProd);
	}

	@Override
	public List<Produit> getProduitsParMC(String mc) {
		  List<Produit> prds=new ArrayList<Produit>();
		  for(Produit p:produits.values())
			  if (p.getNom().contains(mc))
				  prds.add(p);
		return prds;
	}

	@Override
	public Produit addProduit(Produit p) {
		produits.put(p.getIdprod(), p);
		return p;
	}

	@Override
	public Produit UpdateProduit(Long idProd, Produit p) {
		p.setIdprod(idProd);
		produits.put(p.getIdprod(),p);
		return p;
	}

	@Override
	public void deleteProduit(Long idProd) {
		produits.remove(idProd);
		
	}

}
