package onlineStore.beans;

import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import library.beans.GestionArticleRemote;
import onlineStore.dao.DAOArticle;
import onlineStore.dao.DAOProduct;

/**
 * Session Bean implementation class GestionArticle
 */
@Stateless
@LocalBean
public class GestionArticle implements GestionArticleRemote {

	@EJB
	DAOArticle dao;

}
