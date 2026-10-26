package celestial;

public enum rrBk_1 implements rrBC, rrBq_1 {
   INSTANCE;

   @Override
   public int class_(rKC var1, rKj_1 var2, rKj_1 var3, int var4, int var5) {
      int var6 = var2.class_(this.class_(var4), this.break_(var5));
      int var7 = var3.class_(this.class_(var4), this.break_(var5));
      if (!rrBx_1.class_(var6)) {
         return var6;
      } else {
         byte var8 = 8;
         byte var9 = 4;

         for (byte var10 = -8; var10 <= 8; var10 += 4) {
            for (byte var11 = -8; var11 <= 8; var11 += 4) {
               int var12 = var2.class_(this.class_(var4 + var10), this.break_(var5 + var11));
               if (!rrBx_1.class_(var12)) {
                  if (var7 == 44) {
                     return 45;
                  }

                  if (var7 == 10) {
                     return 46;
                  }
               }
            }
         }

         if (var6 == 24) {
            if (var7 == 45) {
               return 48;
            }

            if (var7 == 0) {
               return 24;
            }

            if (var7 == 46) {
               return 49;
            }

            if (var7 == 10) {
               return 50;
            }
         }

         return var7;
      }
   }
}
