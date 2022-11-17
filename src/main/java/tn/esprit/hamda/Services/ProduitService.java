package tn.esprit.hamda.Services;

import tn.esprit.hamda.entities.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);
}
