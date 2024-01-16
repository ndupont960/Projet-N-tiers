package onlineStore.exceptions;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class UserAccountInconnu extends Exception {
   public UserAccountInconnu() {
   }
}
