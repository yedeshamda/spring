package tn.esprit.hamda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamda.entities.DetailsFacture;
import tn.esprit.hamda.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
