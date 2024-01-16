package onlineStore.beans;

import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import library.beans.GestionProductSelectionRemote;
import onlineStore.dao.DAOProductSelection;

/**
 * Session Bean implementation class GestionProductSelection
 */
@Stateless
@LocalBean
public class GestionProductSelection implements GestionProductSelectionRemote {

	@EJB
	   DAOProductSelection dao;

}
