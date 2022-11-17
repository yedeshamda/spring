package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.DetailsProduit;

public interface DetailsProduitRepository extends JpaRepository<DetailsProduit,Long> {
}
