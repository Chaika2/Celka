package celestial;

public class rrxc_3 {
   public static final float class_(xc_3 var0, rRp_1 var1, rfH_2 var2) {
      float var3 = var0.case_(var1, var2);
      return lT_2.class_(var3);
   }

   public static final int break_(xc_3 var0, rRp_1 var1, rfH_2 var2) {
      if (var1 instanceof rrJI var3) {
         int[] var4 = var3.protected_();
         int var5 = var3.protected_(var2);
         if (var5 >= 0 && var5 < var4.length && var4 != null) {
            int var6 = var4[var5];
            if (var6 == -1) {
               var6 = yX_2.class_(var1, var0, var2);
               var4[var5] = var6;
            }

            return var6;
         } else {
            return yX_2.class_(var1, var0, var2);
         }
      } else {
         return yX_2.class_(var1, var0, var2);
      }
   }
}
