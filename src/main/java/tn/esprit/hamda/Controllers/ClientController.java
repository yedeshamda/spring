package tn.esprit.hamda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamda.Services.ClientService;
import tn.esprit.hamda.entities.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientController {
    @Autowired
    ClientService clientService;
    List<Client> l = new ArrayList<Client>();

    public Client addClientClient(@RequestBody Client c){
        return  clientService.addClient(c);
    }
    @PostMapping("/addclient")
    public Client addClient(@RequestBody Client c){
        return  clientService.addClient(c);
    }

    @PutMapping("/editC")
    public Client updateClient(@RequestBody Client c){
        return clientService.updateClient(c);

    }
    @DeleteMapping("/deleteC/{idC}")
    public void deleteClient(@PathVariable Long idC){
        clientService.deleteClient(idC);
    }
    @GetMapping("/listC")
    public List<Client> listeCt(){
        return clientService.retrieveAllClients();

    }

    @GetMapping ("/GetC/{id}")
    public Client getClient(@PathVariable Integer id){
        return clientService.retrieveClient(id.longValue());
    }
}
