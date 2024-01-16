package onlineStore.dao;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Session Bean implementation class DAOProductSelection
 */
@Stateless
@LocalBean
public class DAOProductSelection {
	@PersistenceContext
	private EntityManager em;
    
	
    public DAOProductSelection() {
        // TODO Auto-generated constructor stub
    }

}
