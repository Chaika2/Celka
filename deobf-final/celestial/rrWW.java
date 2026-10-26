package celestial;

import java.util.Comparator;

public class rrWW implements Comparator {
   @Override
   public int compare(Object var1, Object var2) {
      yM_2 var3 = (yM_2)var1;
      yM_2 var4 = (yM_2)var2;
      if (var3.class_() != var4.class_()) {
         return var3.class_() - var4.class_();
      } else if (var3.break_() != var4.break_()) {
         return var3.break_() - var4.break_();
      } else {
         int var5 = var3.byte_() + var3.protected_() + var3.throws_();
         int var6 = var4.byte_() + var4.protected_() + var4.throws_();
         if (var5 != var6) {
            return var5 - var6;
         } else {
            return var3.case_() != var4.case_() ? var3.case_() - var4.case_() : 0;
         }
      }
   }
}
