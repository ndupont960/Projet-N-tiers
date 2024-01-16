package onlineStore.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import onlineStore.entities.Product;

/**
 * Entity implementation class for Entity: ProductSelection
 *
 */
@Entity

public class ProductSelection implements Serializable {

	@Id
	@GeneratedValue
	private int OID;
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "selection")
    public List<Article<?>> articles;
	
	private static final long serialVersionUID = 1L;

	public ProductSelection() {
		super();
	}
	
	public int getOID() {
		return this.OID;
	}

}
