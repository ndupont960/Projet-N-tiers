package onlineStore.exceptions;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class CartInconnu extends Exception {
   public CartInconnu() {
   }
}
