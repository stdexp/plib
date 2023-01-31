package ma.poly.formation;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.poly.formation.data.EtudiantRepository;
import ma.poly.formation.data.FormationRepository;
import ma.poly.formation.entities.Etudiant;
import ma.poly.formation.entities.Formation;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private FormationRepository formaRep;
	@Autowired
	private EtudiantRepository etudRep;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Java","C++","Python").forEach(f->{
			formaRep.save(new Formation(null, f, (int)(Math.random()*50), null));
		});
		Formation f1=formaRep.findById(1L).get();
		etudRep.save(new Etudiant(null,"Rami",f1));
		etudRep.save(new Etudiant(null,"Jamali",f1));
		etudRep.save(new Etudiant(null,"Sami",new Formation(2L,null,0,null)));
		etudRep.save(new Etudiant(null,"Aman",new Formation(2L,null,0,null)));
		etudRep.save(new Etudiant(null,"Assadi",new Formation(3L,null,0,null)));
		etudRep.save(new Etudiant(null,"Bahman",new Formation(3L,null,0,null)));
	}

	
}
