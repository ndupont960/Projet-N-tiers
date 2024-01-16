package onlineStore.beans;

import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import library.beans.GestionOrderRemote;
import onlineStore.dao.DAOOrder;

/**
 * Session Bean implementation class GestionOrder
 */
@Stateless
@LocalBean
public class GestionOrder implements GestionOrderRemote {

	@EJB
	DAOOrder dao;

}
