package celestial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class rrMW {
   public static String id_class(String var0, String var1) {
      Properties var2 = id_class(var0);
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.getProperty(var1);
         if (var3 != null) {
            var3 = var3.trim();
         }

         return var3;
      }
   }

   public static Properties id_class(String var0) {
      try {
         rqO_2 var1 = new rqO_2(var0);
         InputStream var2 = rrbb_3.id_class(var1);
         if (var2 == null) {
            return null;
         } else {
            rrzE_2 var3 = new rrzE_2();
            var3.load(var2);
            var2.close();
            return var3;
         }
      } catch (FileNotFoundException var4) {
         return null;
      } catch (IOException var5) {
         rrbb_3.id_protected("Error parsing: " + var0);
         rrbb_3.id_protected(var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      }
   }
}
