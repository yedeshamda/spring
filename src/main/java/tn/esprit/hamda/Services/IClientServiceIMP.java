package tn.esprit.hamda.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.hamda.Repository.ClientRepository;
import tn.esprit.hamda.entities.Client;

import java.util.List;

public class IClientServiceIMP implements ClientService {
    @Autowired
    ClientRepository clientRepository;
@Override
    public List<Client> retrieveAllClients(){
    return  clientRepository.findAll();
    }
    @Override
    public Client addClient(Client c){
        return  clientRepository.save(c);
    }
    @Override
    public void deleteClient(Long id){
          clientRepository.deleteById(id);
    }
    @Override
    public Client updateClient(Client c){
        return  clientRepository.save(c);
    }
    @Override
    public Client retrieveClient(Long id){
        return clientRepository.findById(id).orElse(null);
    }
}
