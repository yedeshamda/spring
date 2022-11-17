package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
