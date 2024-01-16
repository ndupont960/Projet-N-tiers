package onlineStore.beans;

import java.util.ArrayList;

import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import library.beans.GestionUserAccountRemote;
import onlineStore.dao.DAOUserAccount;
import onlineStore.entities.UserAccount;

/**
 * Session Bean implementation class GestionUserAccount
 */
@Stateless
@LocalBean
public class GestionUserAccount implements GestionUserAccountRemote {

    @EJB
    DAOUserAccount dao;
    
    public UserAccount createAccount(String firstName, String name, String login, String password){
        UserAccount account = new UserAccount();
        account.setName(name);
        account.setFirstName(firstName);
        account.setLogin(login);
        account.setPassword(password);
        account.setOrders(new ArrayList<>());
        dao.saveUserAccount(account);
        return account;
    }

}
