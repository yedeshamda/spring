package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
