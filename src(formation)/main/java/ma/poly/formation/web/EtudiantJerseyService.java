package ma.poly.formation.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.poly.formation.data.EtudiantRepository;
import ma.poly.formation.entities.Etudiant;

@Component
@Path("/scolarite")
public class EtudiantJerseyService {
	
	@Autowired
	private EtudiantRepository etudRep;

	@GET
	@Path("/etudiants")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Etudiant> listEtudiant() {
		return etudRep.findAll();
	}
	
	@GET
	@Path("/etudiants/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Etudiant afficherEtudiant(@PathParam("id") Long id) {
		return etudRep.findById(id).get();
	}
	
	@POST
	@Path("/etudiants")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant ajouterEtudiant(Etudiant etd) {
		return etudRep.save(etd);
	}
	
	@PUT
	@Path("/etudiants/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant modifierEtudiant(@PathParam("id") Long id,Etudiant etd) {
		etd.setId(id);
		return etudRep.save(etd);
	}
	@DELETE
	@Path("/etudiants/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void suprimerEtudiant(@PathParam("id") Long id) {
		etudRep.deleteById(id);
	}
	
	
}
