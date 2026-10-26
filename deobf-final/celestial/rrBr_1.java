package celestial;

public enum rrBr_1 implements rrBl_1 {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2, int var3, int var4, int var5, int var6) {
      if (!rrBx_1.break_(var6) || rrBx_1.break_(var5) && rrBx_1.break_(var4) && rrBx_1.break_(var2) && rrBx_1.break_(var3)) {
         if (!rrBx_1.break_(var6) && (rrBx_1.break_(var5) || rrBx_1.break_(var2) || rrBx_1.break_(var4) || rrBx_1.break_(var3)) && var1.class_(5) == 0) {
            if (rrBx_1.break_(var5)) {
               return var6 == 4 ? 4 : var5;
            }

            if (rrBx_1.break_(var2)) {
               return var6 == 4 ? 4 : var2;
            }

            if (rrBx_1.break_(var4)) {
               return var6 == 4 ? 4 : var4;
            }

            if (rrBx_1.break_(var3)) {
               return var6 == 4 ? 4 : var3;
            }
         }

         return var6;
      } else {
         int var7 = 1;
         int var8 = 1;
         if (!rrBx_1.break_(var5) && var1.class_(var7++) == 0) {
            var8 = var5;
         }

         if (!rrBx_1.break_(var4) && var1.class_(var7++) == 0) {
            var8 = var4;
         }

         if (!rrBx_1.break_(var2) && var1.class_(var7++) == 0) {
            var8 = var2;
         }

         if (!rrBx_1.break_(var3) && var1.class_(var7++) == 0) {
            var8 = var3;
         }

         if (var1.class_(3) == 0) {
            return var8;
         } else {
            return var8 == 4 ? 4 : var6;
         }
      }
   }
}
