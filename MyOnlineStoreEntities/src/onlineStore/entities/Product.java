package onlineStore.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import jakarta.persistence.*;
import onlineStore.entities.ProductSelection;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	@Id
	@GeneratedValue
	private int OID;
	private String name;
	private int stock;
	@ManyToMany
	private List<ProductSelection> productSelections;
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}
	
	public int getOID() {
		return this.OID;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<ProductSelection> getProductSelections() {
		return productSelections;
	}

	public void setProductSelections(List<ProductSelection> productSelections) {
		this.productSelections = productSelections;
	}   

   
}
