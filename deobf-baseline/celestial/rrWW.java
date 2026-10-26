package celestial;

import java.util.Comparator;

public class rrWW implements Comparator {
   @Override
   public int compare(Object var1, Object var2) {
      yM_2 var3 = (yM_2)var1;
      yM_2 var4 = (yM_2)var2;
      if (var3.id_class() != var4.id_class()) {
         return var3.id_class() - var4.id_class();
      } else if (var3.id_break() != var4.id_break()) {
         return var3.id_break() - var4.id_break();
      } else {
         int var5 = var3.id_byte() + var3.id_protected() + var3.id_throws();
         int var6 = var4.id_byte() + var4.id_protected() + var4.id_throws();
         if (var5 != var6) {
            return var5 - var6;
         } else {
            return var3.id_case() != var4.id_case() ? var3.id_case() - var4.id_case() : 0;
         }
      }
   }
}
