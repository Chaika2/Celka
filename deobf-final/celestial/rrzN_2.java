package celestial;

import java.util.Comparator;

public class rrzN_2 implements Comparator<yM_2> {
   public int class_(yM_2 var1, yM_2 var2) {
      if (var1.class_() != var2.class_()) {
         return var1.class_() - var2.class_();
      } else if (var1.break_() != var2.break_()) {
         return var1.break_() - var2.break_();
      } else if (var1.case_() != var2.case_()) {
         return var1.case_() - var2.case_();
      } else {
         int var3 = var1.byte_() + var1.protected_() + var1.throws_();
         int var4 = var2.byte_() + var2.protected_() + var2.throws_();
         return var3 != var4 ? var3 - var4 : 0;
      }
   }
}
