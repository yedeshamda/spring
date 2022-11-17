package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.DetailsFacture;

public interface DetailsFactureRepository extends JpaRepository<DetailsFacture,Long> {
}
