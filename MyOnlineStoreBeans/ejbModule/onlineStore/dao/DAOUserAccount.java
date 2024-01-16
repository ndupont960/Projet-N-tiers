package onlineStore.dao;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import onlineStore.exceptions.UserAccountInconnu;
import onlineStore.entities.UserAccount;

/**
 * Session Bean implementation class DAOUserAccount
 */
@Stateless
@LocalBean
public class DAOUserAccount {
	@PersistenceContext
	private EntityManager em;
    
	public DAOUserAccount() {
	   }

   public void saveUserAccount(UserAccount l) {
      this.em.persist(l);
   }

   public void editUserAccount(UserAccount l) throws UserAccountInconnu {
      UserAccount l2 = (UserAccount)this.em.find(UserAccount.class, l.getOID());
      if (l2 == null) {
         throw new UserAccountInconnu();
      } else {
         this.em.merge(l);
      }
   }

   public UserAccount findUserAccount(int id) throws UserAccountInconnu {
      UserAccount l = (UserAccount)this.em.find(UserAccount.class, id);
      if (l == null) {
         throw new UserAccountInconnu();
      } else {
         return l;
      }
   }

   public UserAccount findUserAccount(String nom) throws UserAccountInconnu {
      TypedQuery<UserAccount> q = this.em.createQuery("select l from UserAccount l where l.nom = '" + nom + "'", UserAccount.class);
      if (q.getResultList().isEmpty()) {
         throw new UserAccountInconnu();
      } else {
         UserAccount l = (UserAccount)q.getResultList().get(0);
         return l;
      }
   }

   public void deleteUserAccount(int id) throws UserAccountInconnu {
      UserAccount l = (UserAccount)this.em.find(UserAccount.class, id);
      if (l == null) {
         throw new UserAccountInconnu();
      } else {
         this.em.remove(l);
      }
   }
}
