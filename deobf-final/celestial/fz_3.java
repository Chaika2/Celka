package celestial;

public class fz_3 {
   private static final float[] class_ = rqR_2.class_(new float[256], var0 -> {
      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = (float)Math.pow((double)((float)var1 / 255.0F), 2.2);
      }
   });

   private static int class_(int var0, int var1, int var2, int var3, int var4) {
      float var5 = class_(var0 >> var4);
      float var6 = class_(var1 >> var4);
      float var7 = class_(var2 >> var4);
      float var8 = class_(var3 >> var4);
      float var9 = (float)((double)((float)Math.pow((double)(var5 + var6 + var7 + var8) * 0.25, 0.45454545454545453)));
      return (int)((double)var9 * 255.0);
   }

   private static float class_(int var0) {
      return class_[var0 & 0xFF];
   }

   public static fN_2[] class_(fN_2 var0, int var1) {
      return class_(var0, var1, (rrko_1)null);
   }

   private static int class_(int var0, int var1, int var2, int var3, boolean var4) {
      return rrMB.class_(var0, var1, var2, var3);
   }

   public static fN_2[] class_(fN_2 var0, int var1, rrko_1 var2) {
      fN_2[] var3 = new fN_2[var1 + 1];
      var3[0] = var0;
      if (var1 > 0) {
         boolean var4 = false;

         for (int var5 = 1; var5 <= var1; var5++) {
            fN_2 var6 = var3[var5 - 1];
            fN_2 var7 = new fN_2(var6.class_() >> 1, var6.break_() >> 1, false);
            int var8 = var7.class_();
            int var9 = var7.break_();

            for (int var10 = 0; var10 < var8; var10++) {
               for (int var11 = 0; var11 < var9; var11++) {
                  if (var2 != null) {
                     var7.class_(
                        var10,
                        var11,
                        var2.class_(
                           var6.class_(var10 * 2 + 0, var11 * 2 + 0),
                           var6.class_(var10 * 2 + 1, var11 * 2 + 0),
                           var6.class_(var10 * 2 + 0, var11 * 2 + 1),
                           var6.class_(var10 * 2 + 1, var11 * 2 + 1)
                        )
                     );
                  } else {
                     var7.class_(
                        var10,
                        var11,
                        class_(
                           var6.class_(var10 * 2 + 0, var11 * 2 + 0),
                           var6.class_(var10 * 2 + 1, var11 * 2 + 0),
                           var6.class_(var10 * 2 + 0, var11 * 2 + 1),
                           var6.class_(var10 * 2 + 1, var11 * 2 + 1),
                           var4
                        )
                     );
                  }
               }
            }

            var3[var5] = var7;
         }
      }

      return var3;
   }
}
