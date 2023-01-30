package ma.cih.gestionCompte.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.cih.gestionCompte.entities.Compte;
import ma.cih.gestionCompte.metier.ICompteMetier;

@Component
@WebService
public class CompteSouapService {
	
	 @Autowired
		ICompteMetier metier;
		
		@WebMethod(operationName = "ajouterCompte")
		public Compte addCompte( @WebParam(name="compte") Compte compte) {
			// TODO Auto-generated method stub
			return metier.addCompte(compte);
		}

		@WebMethod
		public Compte updateCompte(@WebParam(name="code") Long code, @WebParam(name="compte") Compte compte) {
			compte.setCode(code);
			return metier.updateCompte(code,compte);
		}

		@WebMethod
		public void deleteCompte(@WebParam(name="code")  Long code) {
			metier.deleteCompte(code);
			
		}

		@WebMethod
		public List<Compte> getComptes() {
			// TODO Auto-generated method stub
			return metier.getComptes();
		}

		@WebMethod
		public Compte getCompte( @WebParam(name="code") Long code) {
			// TODO Auto-generated method stub
			return metier.getCompte(code);
		}



}
