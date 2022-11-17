package tn.esprit.hamda.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailsFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailsFacture;
    private int qte;
    private float prixtotale;
    private int pourcentageRemise;
    private int MontantRemise;
    @ManyToOne
    private Produit produit;

    @ManyToOne
    private Facture detailsFacture;
}
