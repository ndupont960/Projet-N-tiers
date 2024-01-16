package onlineStore.exceptions;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class ProductInconnu extends Exception {
   public ProductInconnu() {
   }
}
