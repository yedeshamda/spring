package tn.esprit.hamda.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;
    private float MontantRemise;
    private float MontantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    private boolean active;
    @ManyToOne
    private Client clientFacture;

    @OneToMany(mappedBy = "detailsFacture")
    private List<DetailsFacture> FactureListeDetails;

}
