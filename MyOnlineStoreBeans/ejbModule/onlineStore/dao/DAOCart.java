package onlineStore.dao;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import onlineStore.exceptions.CartInconnu;
import library.entities.Lecteur;
import library.entities.Ouvrage;
import onlineStore.entities.Cart;
import onlineStore.entities.UserAccount;


/**
 * Session Bean implementation class DAOCart
 */
@Stateless
@LocalBean
public class DAOCart {
	@PersistenceContext
	private EntityManager em;
    
	
    public DAOCart() {
    }
    
    public void createCart(Cart c) {
        this.em.persist(c);
     }

     public Cart findCart(UserAccount a) throws CartInconnu {
        TypedQuery<Cart> q = this.em.createQuery("select c from Cart c where c.userAccount.login = '" + a.getLogin(), Cart.class);
        if (q.getResultList().size() > 0) {
           return (Cart)q.getResultList().get(0);
        } else {
           throw new CartInconnu();
        }
     }

     public void editCart(Cart c) {
        this.em.merge(c);
     }
}
