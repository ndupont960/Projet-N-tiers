package onlineStore.dao;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.TypedQuery;
import onlineStore.exceptions.ProductExistant;
import onlineStore.exceptions.ProductInconnu;
import onlineStore.entities.Product;

/**
 * Session Bean implementation class DAOProduct
 */
@Stateless
@LocalBean
public class DAOProduct {
	@PersistenceContext
	private EntityManager em;
    
	public DAOProduct() {
	   }

   public void addProduct(Product l) throws ProductExistant{
	   try {
	         this.em.persist(1);
	      } catch (PersistenceException var3) {
	         var3.printStackTrace();
	         throw new ProductExistant();
	      }   
	   }
      
   public void editProduct(Product l) throws ProductInconnu {
      Product l2 = (Product)this.em.find(Product.class, l.getOID());
      if (l2 == null) {
         throw new ProductInconnu();
      } else {
         this.em.merge(l);
      }
   }

   public Product findProduct(int id) throws ProductInconnu {
      Product l = (Product)this.em.find(Product.class, id);
      if (l == null) {
         throw new ProductInconnu();
      } else {
         return l;
      }
   }

   public Product findProduct(String nom) throws ProductInconnu {
      TypedQuery<Product> q = this.em.createQuery("select l from Product l where l.nom = '" + nom + "'", Product.class);
      if (q.getResultList().isEmpty()) {
         throw new ProductInconnu();
      } else {
         Product l = (Product)q.getResultList().get(0);
         return l;
      }
   }

   public void deleteProduct(int id) throws ProductInconnu {
      Product l = (Product)this.em.find(Product.class, id);
      if (l == null) {
         throw new ProductInconnu();
      } else {
         this.em.remove(l);
      }
   }
}
