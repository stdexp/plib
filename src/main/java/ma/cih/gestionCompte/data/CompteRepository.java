package ma.cih.gestionCompte.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.cih.gestionCompte.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
