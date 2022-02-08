package ma.fstt.GestionProduits.services;

import ma.fstt.GestionProduits.model.Produit;
import org.apache.catalina.LifecycleState;

import java.util.Collection;


public interface produitService {

    Produit save(Produit client);

    Collection<Produit> list(int limit);

    Collection<Produit> getALL();

    Produit get(String id);

    Produit update(Produit client);

    Boolean delete(String id);

    Collection<Produit> getProduitsByCategory(String idCat);
}
