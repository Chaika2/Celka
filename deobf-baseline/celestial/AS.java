package celestial;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class AS extends Authenticator {
   public AS(String var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.id_class, this.id_break.toCharArray());
   }
}
