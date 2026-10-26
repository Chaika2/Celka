package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDi_1 extends rUO<rUt_1> {
   private static final Qd_1 class_ = Qd_1.class_(xu_3.throw_);
   private final xc_3 b = xu_3.Ga.continue_();
   private final xc_3 M = xu_3.F.continue_();
   private final xc_3 O = xu_3.try_.continue_();

   public rDi_1(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      var4 = var4.final_();

      while (var1.finally_(var4) && var4.c_() > 2) {
         var4 = var4.break_();
      }

      if (!class_.class_(var1.byte_(var4))) {
         return false;
      } else {
         for (int var6 = -2; var6 <= 2; var6++) {
            for (int var7 = -2; var7 <= 2; var7++) {
               if (var1.finally_(var4.break_(var6, -1, var7)) && var1.finally_(var4.break_(var6, -2, var7))) {
                  return false;
               }
            }
         }

         for (int var10 = -1; var10 <= 0; var10++) {
            for (int var15 = -2; var15 <= 2; var15++) {
               for (int var8 = -2; var8 <= 2; var8++) {
                  var1.class_(var4.break_(var15, var10, var8), this.M, 2);
               }
            }
         }

         var1.class_(var4, this.O, 2);

         for (rpr_3 var16 : rpb_3.HORIZONTAL) {
            var1.class_(var4.break_(var16), this.O, 2);
         }

         for (int var12 = -2; var12 <= 2; var12++) {
            for (int var17 = -2; var17 <= 2; var17++) {
               if (var12 == -2 || var12 == 2 || var17 == -2 || var17 == 2) {
                  var1.class_(var4.break_(var12, 1, var17), this.M, 2);
               }
            }
         }

         var1.class_(var4.break_(2, 1, 0), this.b, 2);
         var1.class_(var4.break_(-2, 1, 0), this.b, 2);
         var1.class_(var4.break_(0, 1, 2), this.b, 2);
         var1.class_(var4.break_(0, 1, -2), this.b, 2);

         for (int var13 = -1; var13 <= 1; var13++) {
            for (int var18 = -1; var18 <= 1; var18++) {
               if (var13 == 0 && var18 == 0) {
                  var1.class_(var4.break_(var13, 4, var18), this.M, 2);
               } else {
                  var1.class_(var4.break_(var13, 4, var18), this.b, 2);
               }
            }
         }

         for (int var14 = 1; var14 <= 3; var14++) {
            var1.class_(var4.break_(-1, var14, -1), this.M, 2);
            var1.class_(var4.break_(-1, var14, 1), this.M, 2);
            var1.class_(var4.break_(1, var14, -1), this.M, 2);
            var1.class_(var4.break_(1, var14, 1), this.M, 2);
         }

         return true;
      }
   }
}
