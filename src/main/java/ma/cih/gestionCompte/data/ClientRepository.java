package ma.cih.gestionCompte.data;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.cih.gestionCompte.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
