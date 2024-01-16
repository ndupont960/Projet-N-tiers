package onlineStore.entities;

import java.io.Serializable;

import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity

public class Order implements Serializable {

	@Id
	@GeneratedValue
	private int OID;
	@ManyToOne
	private UserAccount userAccount;
	private static final long serialVersionUID = 1L;
	
	public Order() {
		super();
	}
	
	public int getOID() {
		return this.OID;
	}
   
}
