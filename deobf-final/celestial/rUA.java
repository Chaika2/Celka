package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUA extends rUO<rUt_1> {
   public rUA(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      while (var1.finally_(var4) && var4.c_() > 2) {
         var4 = var4.break_();
      }

      if (!var1.byte_(var4).class_(xu_3.Pt)) {
         return false;
      } else {
         var4 = var4.break_(var3.nextInt(4));
         int var6 = var3.nextInt(4) + 7;
         int var7 = var6 / 4 + var3.nextInt(2);
         if (var7 > 1 && var3.nextInt(60) == 0) {
            var4 = var4.break_(10 + var3.nextInt(30));
         }

         for (int var8 = 0; var8 < var6; var8++) {
            float var9 = (1.0F - (float)var8 / (float)var6) * (float)var7;
            int var10 = rfU_2.case_(var9);

            for (int var11 = -var10; var11 <= var10; var11++) {
               float var12 = (float)rfU_2.class_(var11) - 0.25F;

               for (int var13 = -var10; var13 <= var10; var13++) {
                  float var14 = (float)rfU_2.class_(var13) - 0.25F;
                  if ((var11 == 0 && var13 == 0 || !(var12 * var12 + var14 * var14 > var9 * var9))
                     && (var11 != -var10 && var11 != var10 && var13 != -var10 && var13 != var10 || !(var3.nextFloat() > 0.75F))) {
                     xc_3 var15 = var1.byte_(var4.break_(var11, var8, var13));
                     xd_3 var16 = var15.break_();
                     if (var15.catch_() || break_(var16) || var16 == xu_3.Pt || var16 == xu_3.PT) {
                        this.class_(var1, var4.break_(var11, var8, var13), xu_3.Ei.continue_());
                     }

                     if (var8 != 0 && var10 > 1) {
                        var15 = var1.byte_(var4.break_(var11, -var8, var13));
                        var16 = var15.break_();
                        if (var15.catch_() || break_(var16) || var16 == xu_3.Pt || var16 == xu_3.PT) {
                           this.class_(var1, var4.break_(var11, -var8, var13), xu_3.Ei.continue_());
                        }
                     }
                  }
               }
            }
         }

         int var18 = var7 - 1;
         if (var18 < 0) {
            var18 = 0;
         } else if (var18 > 1) {
            var18 = 1;
         }

         for (int var19 = -var18; var19 <= var18; var19++) {
            for (int var20 = -var18; var20 <= var18; var20++) {
               rfH_2 var21 = var4.break_(var19, -1, var20);
               int var22 = 50;
               if (Math.abs(var19) == 1 && Math.abs(var20) == 1) {
                  var22 = var3.nextInt(5);
               }

               while (var21.c_() > 50) {
                  xc_3 var23 = var1.byte_(var21);
                  xd_3 var24 = var23.break_();
                  if (!var23.catch_() && !break_(var24) && var24 != xu_3.Pt && var24 != xu_3.PT && var24 != xu_3.Ei) {
                     break;
                  }

                  this.class_(var1, var21, xu_3.Ei.continue_());
                  var21 = var21.break_();
                  if (--var22 <= 0) {
                     var21 = var21.catch_(var3.nextInt(5) + 1);
                     var22 = var3.nextInt(5);
                  }
               }
            }
         }

         return true;
      }
   }
}
