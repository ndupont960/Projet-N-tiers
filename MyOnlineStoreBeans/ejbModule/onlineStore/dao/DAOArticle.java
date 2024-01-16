package onlineStore.dao;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Session Bean implementation class DAOArticle
 */
@Stateless
@LocalBean
public class DAOArticle {
	@PersistenceContext
	private EntityManager em;
    
	
    public DAOArticle() {
        // TODO Auto-generated constructor stub
    }

}
