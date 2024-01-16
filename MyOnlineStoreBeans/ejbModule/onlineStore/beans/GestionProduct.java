package onlineStore.beans;

import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import library.beans.GestionProductRemote;
import onlineStore.dao.DAOProduct;
import onlineStore.entities.Product;
import onlineStore.exceptions.ProductInconnu;
import onlineStore.exceptions.ProductExistant;

@Stateless
@LocalBean
public class GestionProduct implements GestionProductRemote {
   @EJB
   DAOProduct dao;

   public GestionProduct() {
   }

   public void addProduct(Product o) throws ProductExistant {
      this.dao.addProduct(o);
   }

   public void editProduct(Product o) throws ProductInconnu {
      this.dao.editProduct(o);
   }

   public Product findProduct(int id) throws ProductInconnu {
      return this.dao.findProduct(id);
   }

   public Product findProduct(String titre) throws ProductInconnu {
      return this.dao.findProduct(titre);
   }

   public void deleteProduct(int id) throws ProductInconnu {
      this.dao.deleteProduct(id);
   }
}