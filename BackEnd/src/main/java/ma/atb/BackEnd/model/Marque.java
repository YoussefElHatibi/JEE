package ma.atb.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name ="[Table Marques]")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Marque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[N° Marques]")
    private Long numero_Marque;
    
    @Column(name = "[Nom Marque]")
    private String nom_Marque;
}
