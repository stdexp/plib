package ma.poly.formation.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.poly.formation.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
