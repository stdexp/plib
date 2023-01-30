package ma.cih.gestionCompte.metier;

import java.util.List;

import ma.cih.gestionCompte.entities.Compte;

public interface ICompteMetier {
	public Compte addCompte(Compte compte);
	public Compte updateCompte(Long code,Compte compte);
	public void deleteCompte(Long code);
	public List<Compte> getComptes();
	public Compte getCompte(Long code);
	

}
