package celestial;

import java.util.Comparator;

public class rrbq_3 implements Comparator {
   @Override
   public int compare(Object var1, Object var2) {
      rrbH_2 var3 = (rrbH_2)var1;
      rrbH_2 var4 = (rrbH_2)var2;
      if (var3.id_synchronized != var4.id_synchronized) {
         return var4.id_synchronized - var3.id_synchronized;
      } else {
         return !rrbb_3.id_class(var3.id_break, var4.id_break) ? var3.id_break.compareTo(var4.id_break) : var3.id_class.compareTo(var4.id_class);
      }
   }
}
