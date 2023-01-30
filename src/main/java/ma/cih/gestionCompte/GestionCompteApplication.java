package ma.cih.gestionCompte;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.cih.gestionCompte.data.ClientRepository;
import ma.cih.gestionCompte.data.CompteRepository;
import ma.cih.gestionCompte.entities.Client;
import ma.cih.gestionCompte.entities.Compte;

@SpringBootApplication
public class GestionCompteApplication implements CommandLineRunner {
	
	@Autowired
	ClientRepository clientRep;
	@Autowired
	CompteRepository compteRep;

	public static void main(String[] args) {
		SpringApplication.run(GestionCompteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		clientRep.save(new Client(null, "Rami", null));
		clientRep.save(new Client(null, "Hassani", null));
		
		compteRep.save(new Compte(null, 8523.69, new Date(), new Client(1L, null, null)));
		compteRep.save(new Compte(null, 9523.69, new Date(), new Client(1L, null, null)));
		
		compteRep.save(new Compte(null, 10523.69, new Date(), new Client(2L, null, null)));
		compteRep.save(new Compte(null, 11523.69, new Date(), new Client(2L, null, null)));
	}

}
