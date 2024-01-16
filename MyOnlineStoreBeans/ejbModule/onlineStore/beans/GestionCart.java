package onlineStore.beans;

import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import library.beans.EmpruntInconnu;
import library.beans.GestionCartRemote;
import library.beans.LecteurInconnu;
import library.beans.OuvrageInconnu;
import library.entities.Emprunt;
import library.entities.Lecteur;
import library.entities.Ouvrage;
import onlineStore.dao.DAOCart;
import onlineStore.entities.Cart;
import onlineStore.entities.UserAccount;

/**
 * Session Bean implementation class GestionCart
 */
@Stateless
@LocalBean
public class GestionCart implements GestionCartRemote {

    @EJB
    DAOCart dao;
    
    public GestionCart() {
    }
    
    public Emprunt consultCart() throws CartInconnu {
        return this.dao.findCart(this.lecteur, this.ouvrage);
     }

     public void validerEmprunt() {
        Emprunt e = new Emprunt();
        e.setEmprunteur(this.lecteur);
        e.setOuvrage(this.ouvrage);
        this.dao.ajouterEmprunt(e);
        this.emprunt = e;
     }

     public void choisirOuvrage(Ouvrage o) throws OuvrageInconnu {
        this.ouvrage = this.gestOuvrage.chercherOuvrage(o.getTitre());
     }

     public void choisirLecteur(Lecteur l) throws LecteurInconnu {
        this.lecteur = this.gestLecteur.chercherLecteur(l.getNom());
     }

     public void annulation() {
        System.out.println("transaction annul\u00e9e");
     }

     public void modifierEmprunt() {
        this.emprunt.setEmprunteur(this.lecteur);
        this.emprunt.setOuvrage(this.ouvrage);
        this.dao.modifierEmprunt(this.emprunt);
     }

}
