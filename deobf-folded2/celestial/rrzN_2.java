package celestial;

import java.util.Comparator;

public class rrzN_2 implements Comparator<yM_2> {
   public int id_class(yM_2 var1, yM_2 var2) {
      if (var1.id_class() != var2.id_class()) {
         return var1.id_class() - var2.id_class();
      } else if (var1.id_break() != var2.id_break()) {
         return var1.id_break() - var2.id_break();
      } else if (var1.id_case() != var2.id_case()) {
         return var1.id_case() - var2.id_case();
      } else {
         int var3 = var1.id_byte() + var1.id_protected() + var1.id_throws();
         int var4 = var2.id_byte() + var2.id_protected() + var2.id_throws();
         return var3 != var4 ? var3 - var4 : 0;
      }
   }
}
