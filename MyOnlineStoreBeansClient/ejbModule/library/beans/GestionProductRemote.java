package library.beans;

import jakarta.ejb.Remote;
import onlineStore.entities.Product;
import onlineStore.exceptions.ProductExistant;
import onlineStore.exceptions.ProductInconnu;

@Remote
public interface GestionProductRemote {
	
	void addProduct(Product o) throws ProductExistant;
	
	void editProduct(Product o) throws ProductInconnu;
	
	Product findProduct(int id) throws ProductInconnu;
	
	Product findProduct(String titre) throws ProductInconnu;
	
	void deleteProduct(int id) throws ProductInconnu;

}
