package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
