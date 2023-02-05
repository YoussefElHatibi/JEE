package ma.atb.BackEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ma.atb.BackEnd.model.Produit;
import ma.atb.BackEnd.service.ProduitService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProduitController {
    
    @Autowired
    ProduitService produitService;

    @PostMapping("/Produit")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    private Produit createProduit(@RequestBody Produit produit) {
        return produitService.createProduit(produit);
    }
}
