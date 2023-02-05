package ma.atb.BackEnd.service;

import org.springframework.stereotype.Service;

import ma.atb.BackEnd.model.Produit;
import ma.atb.BackEnd.repository.ProduitRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProduitService {
    
    @Autowired
    ProduitRepository produitRepository;

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

    public Produit getProduitById(Long numero_Produit) {
        return produitRepository.findById(numero_Produit).get();
    }

    public Produit updateProduit(Produit produit, Long numero_Produit) {
        produit.setNumero_Produit(numero_Produit);
        return produitRepository.save(produit);
    }

    public void deleteProduitById(Long numero_Produit) {
        Produit produit = produitRepository.findById(numero_Produit).get();
        produitRepository.delete(produit);;
    }
}
