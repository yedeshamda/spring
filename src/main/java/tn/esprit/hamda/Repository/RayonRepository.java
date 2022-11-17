package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.DetailsFacture;
import tn.esprit.hamda.entities.Rayon;

public interface RayonRepository extends JpaRepository<Rayon,Long> {
}
