package tn.esprit.hamda.Services;

import tn.esprit.hamda.entities.Client;

import java.util.List;

public interface ClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
}
