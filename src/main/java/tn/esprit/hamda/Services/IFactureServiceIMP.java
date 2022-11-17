package tn.esprit.hamda.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.hamda.Repository.ClientRepository;
import tn.esprit.hamda.Repository.FactureRepository;
import tn.esprit.hamda.Repository.StockRepository;
import tn.esprit.hamda.entities.Client;
import tn.esprit.hamda.entities.Facture;
import tn.esprit.hamda.entities.Stock;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class IFactureServiceIMP implements FactureService{
    @Autowired
    FactureRepository factureRepository;
    ClientRepository clientRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return  factureRepository.findAll();
    }
    @Override
    @Transactional
    public void cancelFacture(Long id){
       Facture facture = factureRepository.findById(id).orElse(null);
       facture.setActive(false);

    }
    @Override
    public  Facture retrieveFacture(Long id)
    {
        return factureRepository.findById(id).orElse(null);
    }
    public  Facture addFacture(Facture f,Long id)
    {
        Client client = clientRepository.findById(id).orElse(null);
        if (client!= null){
            Facture facture = factureRepository.save(f);
            facture.setClientFacture(client);
            return factureRepository.save(facture);
        }
        return  null;
    }

}
