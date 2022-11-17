package tn.esprit.hamda.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamda.Repository.ProduitRepository;
import tn.esprit.hamda.Repository.RayonRepository;
import tn.esprit.hamda.Repository.StockRepository;
import tn.esprit.hamda.entities.Produit;
import tn.esprit.hamda.entities.Rayon;
import tn.esprit.hamda.entities.Stock;

import java.util.List;

@Service
public class IProduitServiceIMP implements ProduitService{
    @Autowired
    ProduitRepository produitRepository;
    RayonRepository rayonRepository;
    StockRepository stockRepository;
    @Override
    public List<Produit> retrieveAllProduits(){
        return  produitRepository.findAll();
    }
    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock)
    {
       Rayon Rayon= rayonRepository.findById(idRayon).orElse(null);
       Stock Stock= stockRepository.findById(idStock).orElse(null);
if(Rayon!=null && Stock !=null) {
           Produit produit = produitRepository.save(p);
           produit.setRayon(Rayon);
           produit.setStock(Stock);

}
        return null;
    }
    @Override
    public Produit retrieveProduit(Long id)
    {
        return produitRepository.findById(id).orElse(null);
    }
}
