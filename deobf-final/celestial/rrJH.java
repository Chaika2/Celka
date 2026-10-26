package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class rrJH {
   private static final List<wK_2> class_ = ImmutableList.of();

   private static HU class_(HU var0) {
      return var0 != null && var0 != rrxA_2.class_ ? var0 : rrxA_2.break_;
   }

   private static wK_2[] class_(wK_2 var0, rRp_1 var1, xc_3 var2, rfH_2 var3, rpr_3 var4, long var5, rrxF_2 var7) {
      if (var7.class_(var0)) {
         return var7.break_(var0);
      } else {
         wK_2 var8 = var0;
         if (rrbb_3.a()) {
            wK_2[] var9 = rrbO_2.class_(var1, var2, var3, var0, var7);
            if (var9.length != 1 || var9[0] != var0) {
               return var9;
            }
         }

         if (rrbb_3.i()) {
            var0 = rrMs_1.class_(var3, var0);
            if (var0 != var8) {
               return var7.break_(var0);
            }
         }

         return var7.break_(var0);
      }
   }

   public static IJ class_(IJ var0, xc_3 var1, rrxF_2 var2) {
      if (var2.volatile_()) {
         var0 = rrMX.class_(var0, var1);
      }

      return var0;
   }

   public static List<wK_2> class_(List<wK_2> var0, rRp_1 var1, xc_3 var2, rfH_2 var3, rpr_3 var4, HU var5, long var6, rrxF_2 var8) {
      if (var4 != null) {
         if (var8.volatile_() && rrMX.class_(var1.byte_(var3.break_(var4)), var2)) {
            return class_;
         }

         if (!var8.class_(var0) && rrbb_3.c()) {
            var0 = rrGU.class_(var1, var2, var3, var4, var0);
         }
      }

      List var9 = var8.final_();
      var9.clear();

      for (int var10 = 0; var10 < var0.size(); var10++) {
         wK_2 var11 = (wK_2)var0.get(var10);
         wK_2[] var12 = class_(var11, var1, var2, var3, var4, var6, var8);
         if (var10 == 0 && var0.size() == 1 && var12.length == 1 && var12[0] == var11 && var11.int_() == null) {
            return var0;
         }

         for (int var13 = 0; var13 < var12.length; var13++) {
            wK_2 var14 = var12[var13];
            var9.add(var14);
            if (var14.int_() != null) {
               var8.class_(class_(var5)).class_(var14.int_(), var2);
               var8.class_(true);
            }
         }
      }

      return var9;
   }
}
