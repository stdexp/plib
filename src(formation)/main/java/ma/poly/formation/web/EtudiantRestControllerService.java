package ma.poly.formation.web;

import java.util.List;
import java.util.*;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.poly.formation.data.EtudiantRepository;
import ma.poly.formation.entities.Etudiant;

@RestController
//@RequestMapping("/scolarite")
public class EtudiantRestControllerService {
	@Autowired
	private EtudiantRepository etudRep;

	@RequestMapping(value = "/etudiants",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Etudiant> listEtudiant() {
		return etudRep.findAll();
	}
	
	@GetMapping(path = "/etudiants/{id}",produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML} )
	public Etudiant afficherEtudiant(@PathVariable("id") Long id) {
		return etudRep.findById(id).get();
	}
	
	@PostMapping(path = "/etudiants",produces = {MediaType.APPLICATION_JSON} )
	public Etudiant ajouterEtudiant(@RequestBody Etudiant etd) {
		return etudRep.save(etd);
	}
	
	@PutMapping(path = "/etudiants/{id}",produces = {MediaType.APPLICATION_JSON} )
	public Etudiant modifierEtudiant(@PathVariable("id") Long id,@RequestBody Etudiant etd) {
		etd.setId(id);
		return etudRep.save(etd);
	}
	
	@DeleteMapping(path = "/etudiants/{id}" )
	public void suprimerEtudiant(@PathVariable("id") Long id) {
		etudRep.deleteById(id);
	}
	
	
}
