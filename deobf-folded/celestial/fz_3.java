package celestial;

public class fz_3 {
   private static final float[] id_class = rqR_2.id_class(new float[256], var0 -> {
      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = (float)Math.pow((double)((float)var1 / 255.0F), 2.2);
      }
   });

   private static int id_class(int var0, int var1, int var2, int var3, int var4) {
      float var5 = id_class(var0 >> var4);
      float var6 = id_class(var1 >> var4);
      float var7 = id_class(var2 >> var4);
      float var8 = id_class(var3 >> var4);
      float var9 = (float)((double)((float)Math.pow((double)(var5 + var6 + var7 + var8) * 0.25, 0.45454545454545453)));
      return (int)((double)var9 * 255.0);
   }

   private static float id_class(int var0) {
      return id_class[var0 & 0xFF];
   }

   public static fN_2[] id_class(fN_2 var0, int var1) {
      return id_class(var0, var1, (rrko_1)null);
   }

   private static int id_class(int var0, int var1, int var2, int var3, boolean var4) {
      return rrMB.id_class(var0, var1, var2, var3);
   }

   public static fN_2[] id_class(fN_2 var0, int var1, rrko_1 var2) {
      fN_2[] var3 = new fN_2[var1 + 1];
      var3[0] = var0;
      if (var1 > 0) {
         boolean var4 = false;

         for (int var5 = 1; var5 <= var1; var5++) {
            fN_2 var6 = var3[var5 - 1];
            fN_2 var7 = new fN_2(var6.id_class() >> 1, var6.id_break() >> 1, false);
            int var8 = var7.id_class();
            int var9 = var7.id_break();

            for (int var10 = 0; var10 < var8; var10++) {
               for (int var11 = 0; var11 < var9; var11++) {
                  if (var2 != null) {
                     var7.id_class(
                        var10,
                        var11,
                        var2.id_class(
                           var6.id_class(var10 * 2 + 0, var11 * 2 + 0),
                           var6.id_class(var10 * 2 + 1, var11 * 2 + 0),
                           var6.id_class(var10 * 2 + 0, var11 * 2 + 1),
                           var6.id_class(var10 * 2 + 1, var11 * 2 + 1)
                        )
                     );
                  } else {
                     var7.id_class(
                        var10,
                        var11,
                        id_class(
                           var6.id_class(var10 * 2 + 0, var11 * 2 + 0),
                           var6.id_class(var10 * 2 + 1, var11 * 2 + 0),
                           var6.id_class(var10 * 2 + 0, var11 * 2 + 1),
                           var6.id_class(var10 * 2 + 1, var11 * 2 + 1),
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
