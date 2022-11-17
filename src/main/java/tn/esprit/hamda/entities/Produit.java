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
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String CodeProduit;
    private String LibelleProduit;
    private long PrixUnitaire;

    @OneToOne
    private DetailsProduit detailsProduit;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private Rayon rayon;
}
