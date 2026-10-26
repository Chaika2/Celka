package celestial;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class AS extends Authenticator {
   public AS(String var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.class_, this.break_.toCharArray());
   }
}
