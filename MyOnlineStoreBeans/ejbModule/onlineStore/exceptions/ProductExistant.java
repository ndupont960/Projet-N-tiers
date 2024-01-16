package onlineStore.exceptions;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class ProductExistant extends Exception {
   public ProductExistant() {
   }
}
