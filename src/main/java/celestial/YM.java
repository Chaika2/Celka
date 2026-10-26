package celestial;

import java.util.List;
import java.util.function.Supplier;

class YM implements YO {
   public static final YM id_class = new YM();

   private YM() {
   }

   public rcZ_2 id_class() {
      return new rcy_3();
   }

   public int id_class(rcZ_2 var1) {
      if (var1 instanceof rcx_3 var2) {
         int var3 = var2.size();
         if (var3 > 0) {
            var2.clear();
            return var3;
         }
      }

      return 0;
   }

   public int id_class(rcZ_2 var1, Supplier<rcZ_2> var2) {
      if (!(var1 instanceof rcx_3 var3)) {
         return 0;
      } else {
         int var4 = var3.size();
         if (var4 == 0) {
            var3.id_break(0, (rcZ_2)var2.get());
            return 1;
         } else {
            rcZ_2 var5 = (rcZ_2)var2.get();
            int var6 = var4 - (int)var3.stream().filter(var5::equals).count();
            if (var6 == 0) {
               return 0;
            } else {
               var3.clear();
               if (!var3.id_break(0, var5)) {
                  return 0;
               } else {
                  for (int var7 = 1; var7 < var4; var7++) {
                     var3.id_break(var7, (rcZ_2)var2.get());
                  }

                  return var6;
               }
            }
         }
      }
   }

   public void id_class(rcZ_2 var1, List<rcZ_2> var2) {
      if (var1 instanceof rcx_3) {
         var2.addAll((rcx_3)var1);
      }
   }

   public void id_class(rcZ_2 var1, Supplier<rcZ_2> var2, List<rcZ_2> var3) {
      if (var1 instanceof rcx_3 var4) {
         if (var4.isEmpty()) {
            rcZ_2 var5 = (rcZ_2)var2.get();
            if (var4.id_break(0, var5)) {
               var3.add(var5);
            }
         } else {
            var3.addAll(var4);
         }
      }
   }
}
