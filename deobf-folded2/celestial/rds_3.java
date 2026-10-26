package celestial;

import java.util.List;

public interface rds_3 {
   static rdn_3 id_class(rdn_3 var0, List<rxA_2> var1) {
      rdn_3 var2 = rdn_3.id_break;
      int[] var3 = new int[3];
      int var4 = 0;
      int var5 = 0;
      rds_3 var6 = null;
      rdb_3 var7 = var0.id_break();
      if (var7 instanceof rds_3) {
         var6 = (rds_3)var7;
         var2 = var0.id_implements();
         var2.id_throws(1);
         if (var6.c_(var0)) {
            int var8 = var6.d_(var2);
            float var9 = (float)(var8 >> 16 & 0xFF) / 255.0F;
            float var10 = (float)(var8 >> 8 & 0xFF) / 255.0F;
            float var11 = (float)(var8 & 0xFF) / 255.0F;
            var4 = (int)((float)var4 + Math.max(var9, Math.max(var10, var11)) * 255.0F);
            var3[0] = (int)((float)var3[0] + var9 * 255.0F);
            var3[1] = (int)((float)var3[1] + var10 * 255.0F);
            var3[2] = (int)((float)var3[2] + var11 * 255.0F);
            var5++;
         }

         for (rxA_2 var17 : var1) {
            float[] var20 = var17.id_byte().id_protected();
            int var23 = (int)(var20[0] * 255.0F);
            int var12 = (int)(var20[1] * 255.0F);
            int var13 = (int)(var20[2] * 255.0F);
            var4 += Math.max(var23, Math.max(var12, var13));
            var3[0] += var23;
            var3[1] += var12;
            var3[2] += var13;
            var5++;
         }
      }

      if (var6 == null) {
         return rdn_3.id_break;
      } else {
         int var15 = var3[0] / var5;
         int var18 = var3[1] / var5;
         int var21 = var3[2] / var5;
         float var24 = (float)var4 / (float)var5;
         float var25 = (float)Math.max(var15, Math.max(var18, var21));
         var15 = (int)((float)var15 * var24 / var25);
         var18 = (int)((float)var18 * var24 / var25);
         var21 = (int)((float)var21 * var24 / var25);
         int var26 = (var15 << 8) + var18;
         var26 = (var26 << 8) + var21;
         var6.id_class(var2, var26);
         return var2;
      }
   }

   default void id_class(rdn_3 var1, int var2) {
      var1.id_class("display").id_break("color", var2);
   }

   default void e_(rdn_3 var1) {
      rcd_3 var2 = var1.id_break("display");
      if (var2 != null && var2.id_throws("color")) {
         var2.id_continue("color");
      }
   }

   default boolean c_(rdn_3 var1) {
      rcd_3 var2 = var1.id_break("display");
      return var2 != null && var2.id_byte("color", 99);
   }

   default int d_(rdn_3 var1) {
      rcd_3 var2 = var1.id_break("display");
      return var2 != null && var2.id_byte("color", 99) ? var2.id_private("color") : 10511680;
   }
}
