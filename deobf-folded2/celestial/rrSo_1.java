package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrSo_1 extends rrsE_2<rrsG_2> {
   public rrSo_1(Codec<rrsG_2> var1) {
      super(var1);
   }

   protected void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, xc_3 var11, xc_3 var12, xc_3 var13, int var14
   ) {
      xc_3 var15 = var11;
      xc_3 var16 = var12;
      rfw_3 var17 = new rfw_3();
      int var18 = -1;
      int var19 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var20 = var4 & 15;
      int var21 = var5 & 15;

      for (int var22 = var6; var22 >= 0; var22--) {
         var17.id_class(var20, var22, var21);
         xc_3 var23 = var2.id_byte(var17);
         if (var23.id_catch()) {
            var18 = -1;
         } else if (var23.id_class(var9.id_break())) {
            if (var18 == -1) {
               if (var19 <= 0) {
                  var15 = xu_3.id_class.id_continue();
                  var16 = var9;
               } else if (var22 >= var14 - 4 && var22 <= var14 + 1) {
                  var15 = var11;
                  var16 = var12;
               }

               if (var22 < var14 && (var15 == null || var15.id_catch())) {
                  if (var3.id_class(var17.id_class(var4, var22, var5)) < 0.15F) {
                     var15 = xu_3.PT.id_continue();
                  } else {
                     var15 = var10;
                  }

                  var17.id_class(var20, var22, var21);
               }

               var18 = var19;
               if (var22 >= var14 - 1) {
                  var2.id_class(var17, var15, false);
               } else if (var22 < var14 - 7 - var19) {
                  var15 = xu_3.id_class.id_continue();
                  var16 = var9;
                  var2.id_class(var17, var13, false);
               } else {
                  var2.id_class(var17, var16, false);
               }
            } else if (var18 > 0) {
               var18--;
               var2.id_class(var17, var16, false);
               if (var18 == 0 && var16.id_class(xu_3.id_throw) && var19 > 1) {
                  var18 = var1.nextInt(4) + Math.max(0, var22 - 63);
                  var16 = var16.id_class(xu_3.id_interface) ? xu_3.GI.id_continue() : xu_3.F.id_continue();
               }
            }
         }
      }
   }

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      this.id_class(var1, var2, var3, var4, var5, var6, var7, var9, var10, var14.id_class(), var14.id_break(), var14.id_byte(), var11);
   }
}
