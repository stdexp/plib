package ma.cih.gestionCompte.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.cih.gestionCompte.data.CompteRepository;
import ma.cih.gestionCompte.entities.Compte;
import ma.cih.gestionCompte.metier.ICompteMetier;

@RestController
@RequestMapping(path="/cih")
public class CompteRestControllerService implements ICompteService {
	
	 @Autowired
		ICompteMetier metier;
		
		
		@PostMapping(path="/comptes")
		public Compte addCompte( @RequestBody Compte compte) {
			// TODO Auto-generated method stub
			return metier.addCompte(compte);
		}

		@PutMapping(path="/comptes/{code}")
		public Compte updateCompte(@PathVariable("code") Long code, @RequestBody Compte compte) {
			compte.setCode(code);
			return metier.updateCompte(code,compte);
		}

		@DeleteMapping(path="/comptes/{code}")
		public void deleteCompte(@PathVariable  Long code) {
			metier.deleteCompte(code);
			
		}

		//@RequestMapping(value = "/comptes",
		       // method = RequestMethod.GET,
		      //  produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
		@GetMapping(path="/comptes",produces = 
			{MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
		public List<Compte> getComptes() {
			// TODO Auto-generated method stub
			return metier.getComptes();
		}

		@GetMapping(path="/comptes/{code}",produces = 
			{MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
		public Compte getCompte( @PathVariable Long code) {
			// TODO Auto-generated method stub
			return metier.getCompte(code);
		}


}
