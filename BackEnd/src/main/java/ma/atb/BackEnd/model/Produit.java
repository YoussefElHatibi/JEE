package ma.atb.BackEnd.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name ="[Table Produits]")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[N° Produits]")
    private Long numero_Produit;
    
    @Column(name = "[Nom Produits]")
    private String nom_Produit;

    @Column(name = "[Description Produits]")
    private String description;

    @Column(name = "[Prix À L'Unité]")
    private double prix_Unite;

    @Column(name = "[Total En Stock]")
    private int quantite;

    @Column(name = "[Etat En Stock]")
    private boolean Stock;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "[N° Catégorie]")
    private Categorie categorie;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "[N° Marque]")
    private Marque marque;
}
