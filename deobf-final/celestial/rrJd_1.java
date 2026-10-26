package celestial;

import java.awt.Rectangle;
import java.util.ArrayList;

public class rrJd_1 implements rrJJ {
   public static String[] class_(String var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < 10; var2++) {
         String var3 = var0 + ".tooltip." + (var2 + 1);
         String var4 = rrba_3.class_(var3, (String)null);
         if (var4 == null) {
            break;
         }

         var1.add(var4);
      }

      return var1.size() <= 0 ? null : var1.toArray(new String[var1.size()]);
   }

   @Override
   public String[] class_(LZ var1, int var2) {
      if (!(var1 instanceof rrJO var3)) {
         return null;
      } else {
         QF var4 = var3.implements_();
         return class_(var4.byte_());
      }
   }

   @Override
   public boolean class_() {
      return false;
   }

   @Override
   public Rectangle class_(vm_3 var1, int var2, int var3) {
      int var4 = var1.package_ / 2 - 150;
      int var5 = var1.int_ / 6 - 7;
      if (var3 <= var5 + 98) {
         var5 += 105;
      }

      int var6 = var4 + 150 + 150;
      int var7 = var5 + 84 + 10;
      return new Rectangle(var4, var5, var6 - var4, var7 - var5);
   }
}
