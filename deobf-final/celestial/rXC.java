package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rXC {
   public static rcd_3 class_(rcd_3 var0, rqs_3<rdn_3> var1, boolean var2) {
      rcy_3 var3 = new rcy_3();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         rdn_3 var5 = (rdn_3)var1.get(var4);
         if (!var5.class_()) {
            rcd_3 var6 = new rcd_3();
            var6.class_("Slot", (byte)var4);
            var5.break_(var6);
            var3.add(var6);
         }
      }

      if (!var3.isEmpty() || var2) {
         var0.class_("Items", var3);
      }

      return var0;
   }

   public static int class_(rXu_1 var0, Predicate<rdn_3> var1, int var2, boolean var3) {
      int var4 = 0;

      for (int var5 = 0; var5 < var0.else_(); var5++) {
         rdn_3 var6 = var0.extends_(var5);
         int var7 = class_(var6, var1, var2 - var4, var3);
         if (var7 > 0 && !var3 && var6.class_()) {
            var0.break_(var5, rdn_3.break_);
         }

         var4 += var7;
      }

      return var4;
   }

   public static int class_(rdn_3 var0, Predicate<rdn_3> var1, int var2, boolean var3) {
      if (var0.class_() || !var1.test(var0)) {
         return 0;
      } else if (var3) {
         return var0.char_();
      } else {
         int var4 = var2 < 0 ? var0.char_() : Math.min(var2, var0.char_());
         var0.catch_(var4);
         return var4;
      }
   }

   public static rdn_3 class_(List<rdn_3> var0, int var1, int var2) {
      return var1 >= 0 && var1 < var0.size() && !((rdn_3)var0.get(var1)).class_() && var2 > 0 ? ((rdn_3)var0.get(var1)).class_(var2) : rdn_3.break_;
   }

   public static rdn_3 class_(List<rdn_3> var0, int var1) {
      return var1 >= 0 && var1 < var0.size() ? var0.set(var1, rdn_3.break_) : rdn_3.break_;
   }

   public static rcd_3 class_(rcd_3 var0, rqs_3<rdn_3> var1) {
      return class_(var0, var1, true);
   }

   public static void break_(rcd_3 var0, rqs_3<rdn_3> var1) {
      rcy_3 var2 = var0.protected_("Items", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rcd_3 var4 = var2.class_(var3);
         int var5 = var4.case_("Slot") & 255;
         if (var5 >= 0 && var5 < var1.size()) {
            var1.set(var5, rdn_3.class_(var4));
         }
      }
   }
}
