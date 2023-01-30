package ma.cih.gestionCompte.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.cih.gestionCompte.data.CompteRepository;
import ma.cih.gestionCompte.entities.Compte;

@Component
public class ComteImpl implements ICompteMetier {
	
    @Autowired
	CompteRepository compteRep;
	
	
	@Override
	public Compte addCompte(Compte compte) {
		// TODO Auto-generated method stub
		return compteRep.save(compte);
	}

	@Override
	public Compte updateCompte(Long code, Compte compte) {
		compte.setCode(code);
		return compteRep.save(compte);
	}

	@Override
	public void deleteCompte(Long code) {
		compteRep.deleteById(code);
		
	}

	@Override
	public List<Compte> getComptes() {
		// TODO Auto-generated method stub
		return compteRep.findAll();
	}

	@Override
	public Compte getCompte(Long code) {
		// TODO Auto-generated method stub
		return compteRep.findById(code).get();
	}

}
