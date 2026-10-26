package celestial;

public class rhc_3 {
   protected static rfH_2 class_(rrEm_1 var0, int var1, int var2, boolean var3) {
      rfw_3 var4 = new rfw_3(var1, 0, var2);
      rYG var5 = var0.implements_(var4);
      boolean var6 = var0.default_().byte_();
      xc_3 var7 = var5.throws_().throws_().class_();
      if (var3 && !var7.break_().class_(rls_3.P)) {
         return null;
      } else {
         roJ_2 var8 = var0.throws_(var1 >> 4, var2 >> 4);
         int var9 = var6 ? var0.else_().implements_().byte_() : var8.class_(rKv_1.MOTION_BLOCKING, var1 & 15, var2 & 15);
         if (var9 < 0) {
            return null;
         } else {
            int var10 = var8.class_(rKv_1.WORLD_SURFACE, var1 & 15, var2 & 15);
            if (var10 <= var9 && var10 > var8.class_(rKv_1.OCEAN_FLOOR, var1 & 15, var2 & 15)) {
               return null;
            } else {
               for (int var11 = var9 + 1; var11 >= 0; var11--) {
                  var4.class_(var1, var11, var2);
                  xc_3 var12 = var0.byte_(var4);
                  if (!var12.volatile_().byte_()) {
                     break;
                  }

                  if (var12.equals(var7)) {
                     return var4.final_().int_();
                  }
               }

               return null;
            }
         }
      }
   }

   public static rfH_2 class_(rrEm_1 var0, rfj_3 var1, boolean var2) {
      for (int var3 = var1.break_(); var3 <= var1.protected_(); var3++) {
         for (int var4 = var1.byte_(); var4 <= var1.throws_(); var4++) {
            rfH_2 var5 = class_(var0, var3, var4, var2);
            if (var5 != null) {
               return var5;
            }
         }
      }

      return null;
   }
}
