package onlineStore.dao;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import onlineStore.exceptions.OrderInconnu;
import onlineStore.entities.Order;

/**
 * Session Bean implementation class DAOOrder
 */
@Stateless
@LocalBean
public class DAOOrder {
	@PersistenceContext
	private EntityManager em;
    
	public DAOOrder() {
	   }

	   public void ajouterOrder(Order l) {
	      this.em.persist(l);
	   }

	   public void modifierOrder(Order l) throws OrderInconnu {
	      Order l2 = (Order)this.em.find(Order.class, l.getOID());
	      if (l2 == null) {
	         throw new OrderInconnu();
	      } else {
	         this.em.merge(l);
	      }
	   }

	   public Order chercherOrder(int id) throws OrderInconnu {
	      Order l = (Order)this.em.find(Order.class, id);
	      if (l == null) {
	         throw new OrderInconnu();
	      } else {
	         return l;
	      }
	   }

	   public Order chercherOrder(String nom) throws OrderInconnu {
	      TypedQuery<Order> q = this.em.createQuery("select l from Order l where l.nom = '" + nom + "'", Order.class);
	      if (q.getResultList().isEmpty()) {
	         throw new OrderInconnu();
	      } else {
	         Order l = (Order)q.getResultList().get(0);
	         return l;
	      }
	   }

	   public void supprimerOrder(int id) throws OrderInconnu {
	      Order l = (Order)this.em.find(Order.class, id);
	      if (l == null) {
	         throw new OrderInconnu();
	      } else {
	         this.em.remove(l);
	      }
	   }
}
