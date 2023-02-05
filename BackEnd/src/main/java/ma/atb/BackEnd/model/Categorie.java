package ma.atb.BackEnd.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name ="[Table Catégories]")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[N° Catégories]")
    private Long numero_Categories;

    @Column(name = "[Désignation]")
    private String designation;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "[N° Marque]")
    private Marque marque;
}
