package service;
import metier.ICatalogueMetier;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import entities.Produit;
import metier.CatalogueMetierImpl;

@Singleton
@Path("/catalogue")
public class CatalogueService implements ICatalogueMetier{
	
	private CatalogueMetierImpl metier;
	
	public CatalogueService() {
		metier=new CatalogueMetierImpl();
	}
	
    @GET
	@Path("/produits")
	@Produces(MediaType.APPLICATION_JSON)
	 @Override
	public List<Produit> getProduits() {
		return metier.getProduits();
	}

	
	@GET
	@Path("/produits/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Produit getProduit(@PathParam(value = "id") Long idProd) {
		// TODO Auto-generated method stub
		return metier.getProduit(idProd);
	}
	
	@GET
	@Path("/produitsMC")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Produit> getProduitsParMC(@QueryParam(value="mc") String mc) {
		// TODO Auto-generated method stub
		return metier.getProduitsParMC(mc);
	}

	@POST
	@Path("/produits")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Produit addProduit(Produit p) {
		// TODO Auto-generated method stub
		return metier.addProduit(p);
	}
	@PUT
	@Path("/produits/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Produit UpdateProduit(@PathParam("id")  Long idProd, Produit p) {
		// TODO Auto-generated method stub
		return metier.UpdateProduit(idProd, p);
	}
	@DELETE
	@Path("/produits/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public void deleteProduit(@PathParam("id")  Long idProd) {
		metier.deleteProduit(idProd);
		
	}

}
