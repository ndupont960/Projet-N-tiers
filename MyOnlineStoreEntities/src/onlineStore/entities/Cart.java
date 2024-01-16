package onlineStore.entities;

import java.io.Serializable;

import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: Cart
 *
 */
@Entity

public class Cart implements Serializable {

	@Id
	@GeneratedValue
	private int OID;
	@OneToOne
	private UserAccount userAccount;
	private static final long serialVersionUID = 1L;

	public Cart() {
		super();
	}
	
	public int getOID() {
		return this.OID;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
	
   
}
