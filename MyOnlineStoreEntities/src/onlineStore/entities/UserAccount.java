package onlineStore.entities;

import java.io.Serializable;

import java.lang.String;
import java.util.List;

import jakarta.persistence.*;
import onlineStore.entities.Cart;
import onlineStore.entities.Order;

/**
 * Entity implementation class for Entity: UserAccount
 *
 */
@Entity

public class UserAccount implements Serializable {
	
	@Id
	@GeneratedValue
	private int OID;
	private String firstName;
	private String name;
	private String login;
	private String password;
	@OneToMany
	private List<Order> orders;
	@OneToOne
	private Cart cart;
	private static final long serialVersionUID = 1L;

	public UserAccount() {
		super();
	}   
	public String getFirstName() {
		return this.firstName;
	}
	
	public int getOID() {
		return this.OID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}   
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	} 
	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
   
}
