package ma.poly.formation.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.poly.formation.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{

}
