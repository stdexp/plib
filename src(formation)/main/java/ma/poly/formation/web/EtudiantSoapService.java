package ma.poly.formation.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.poly.formation.data.EtudiantRepository;
import ma.poly.formation.entities.Etudiant;

@Component
@WebService
public class EtudiantSoapService {
	@Autowired
	private EtudiantRepository etudRep;

	@WebMethod(operationName = "getEtudiants")
	public List<Etudiant> listEtudiant() {
		return etudRep.findAll();
	}
	
	@WebMethod
	public Etudiant afficherEtudiant(@WebParam(name = "id") Long id) {
		return etudRep.findById(id).get();
	}
	
	@WebMethod
	public Etudiant ajouterEtudiant(@WebParam(name = "etudiant") Etudiant etd) {
		return etudRep.save(etd);
	}
	
	@WebMethod
	public Etudiant modifierEtudiant(@WebParam(name = "id") Long id,@WebParam(name = "etudiant") Etudiant etd) {
		etd.setId(id);
		return etudRep.save(etd);
	}
	
	@WebMethod
	public void suprimerEtudiant(@WebParam(name = "id") Long id) {
		etudRep.deleteById(id);
	}
}
