package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrSo_1 extends rrsE_2<rrsG_2> {
   public rrSo_1(Codec<rrsG_2> var1) {
      super(var1);
   }

   protected void class_(
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
         var17.class_(var20, var22, var21);
         xc_3 var23 = var2.byte_(var17);
         if (var23.catch_()) {
            var18 = -1;
         } else if (var23.class_(var9.break_())) {
            if (var18 == -1) {
               if (var19 <= 0) {
                  var15 = xu_3.class_.continue_();
                  var16 = var9;
               } else if (var22 >= var14 - 4 && var22 <= var14 + 1) {
                  var15 = var11;
                  var16 = var12;
               }

               if (var22 < var14 && (var15 == null || var15.catch_())) {
                  if (var3.class_(var17.class_(var4, var22, var5)) < 0.15F) {
                     var15 = xu_3.PT.continue_();
                  } else {
                     var15 = var10;
                  }

                  var17.class_(var20, var22, var21);
               }

               var18 = var19;
               if (var22 >= var14 - 1) {
                  var2.class_(var17, var15, false);
               } else if (var22 < var14 - 7 - var19) {
                  var15 = xu_3.class_.continue_();
                  var16 = var9;
                  var2.class_(var17, var13, false);
               } else {
                  var2.class_(var17, var16, false);
               }
            } else if (var18 > 0) {
               var18--;
               var2.class_(var17, var16, false);
               if (var18 == 0 && var16.class_(xu_3.throw_) && var19 > 1) {
                  var18 = var1.nextInt(4) + Math.max(0, var22 - 63);
                  var16 = var16.class_(xu_3.interface_) ? xu_3.GI.continue_() : xu_3.F.continue_();
               }
            }
         }
      }
   }

   public void class_(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14) {
      this.class_(var1, var2, var3, var4, var5, var6, var7, var9, var10, var14.class_(), var14.break_(), var14.byte_(), var11);
   }
}
