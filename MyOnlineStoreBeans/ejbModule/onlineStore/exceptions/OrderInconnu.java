package onlineStore.exceptions;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class OrderInconnu extends Exception {
   public OrderInconnu() {
   }
}
