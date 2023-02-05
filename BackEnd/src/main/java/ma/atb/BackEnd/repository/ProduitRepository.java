package ma.atb.BackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.atb.BackEnd.model.Produit;

public interface ProduitRepository extends JpaRepository <Produit, Long>{
}
