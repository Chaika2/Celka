package celestial;

import java.util.Arrays;
import java.util.HashSet;

public class rrWj_1 {
   public static void class_(Vu_1[] var0, Vu_1[] var1) {
      HashSet var2 = new HashSet();

      for (int var3 = 0; var3 < var1.length; var3++) {
         Vu_1 var4 = var1[var3];
         var2.add(var4.final_());
      }

      HashSet var7 = new HashSet<>(Arrays.asList(var0));
      var7.removeAll(Arrays.asList(var1));

      for (Vu_1 var5 : var7) {
         String var6 = var5.final_();
         if (var2.contains(var6)) {
            var5.break_(Ve_1.class_, false);
         }
      }
   }
}
