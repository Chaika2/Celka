package celestial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.function.Predicate;

public class je_3 extends rAY {
   private final jo_3 id_protected;

   @Override
   protected InputStream id_byte(rAI var1, rqO_2 var2) {
      if (var1 == rAI.CLIENT_RESOURCES) {
         File var3 = this.id_protected.id_class(var2);
         if (var3 != null && var3.exists()) {
            try {
               return new FileInputStream(var3);
            } catch (FileNotFoundException var5) {
            }
         }
      }

      return super.id_byte(var1, var2);
   }

   public je_3(jo_3 var1) {
      super("minecraft", "realms");
      this.id_protected = var1;
   }

   @Override
   public Collection<rqO_2> id_class(rAI var1, String var2, String var3, int var4, Predicate<String> var5) {
      Collection var6 = super.id_class(var1, var2, var3, var4, var5);
      var6.addAll(this.id_protected.id_class(var3, var2, var4, var5));
      return var6;
   }

   @Override
   protected InputStream id_break(String var1) {
      File var2 = this.id_protected.id_class(var1);
      if (var2 != null && var2.exists()) {
         try {
            return new FileInputStream(var2);
         } catch (FileNotFoundException var4) {
         }
      }

      return super.id_break(var1);
   }

   @Override
   public boolean id_break(rAI var1, rqO_2 var2) {
      if (var1 == rAI.CLIENT_RESOURCES) {
         File var3 = this.id_protected.id_class(var2);
         if (var3 != null && var3.exists()) {
            return true;
         }
      }

      return super.id_break(var1, var2);
   }
}
