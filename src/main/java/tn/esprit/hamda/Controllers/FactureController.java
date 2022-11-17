package tn.esprit.hamda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.hamda.Services.FactureService;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    FactureService factureService;

}
