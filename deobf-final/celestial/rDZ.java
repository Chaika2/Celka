package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDZ extends rUO<rUt_1> {
   public rDZ(Codec<rUt_1> var1) {
      super(var1);
   }

   private void class_(rRg_1 var1, Random var2, rfH_2 var3) {
      if (var2.nextBoolean()) {
         var1.class_(var3, xu_3.PK.continue_(), 2);
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      if (var1.finally_(var4) && !var1.finally_(var4.final_())) {
         rfw_3 var6 = var4.new_();
         rfw_3 var7 = var4.new_();
         boolean var8 = true;
         boolean var9 = true;
         boolean var10 = true;
         boolean var11 = true;

         while (var1.finally_(var6)) {
            if (rYB.super_(var6)) {
               return true;
            }

            var1.class_(var6, xu_3.PK.continue_(), 2);
            var8 = var8 && this.break_(var1, var3, var7.class_(var6, rpr_3.NORTH));
            var9 = var9 && this.break_(var1, var3, var7.class_(var6, rpr_3.SOUTH));
            var10 = var10 && this.break_(var1, var3, var7.class_(var6, rpr_3.WEST));
            var11 = var11 && this.break_(var1, var3, var7.class_(var6, rpr_3.EAST));
            var6.class_(rpr_3.DOWN);
         }

         var6.class_(rpr_3.UP);
         this.class_(var1, var3, var7.class_(var6, rpr_3.NORTH));
         this.class_(var1, var3, var7.class_(var6, rpr_3.SOUTH));
         this.class_(var1, var3, var7.class_(var6, rpr_3.WEST));
         this.class_(var1, var3, var7.class_(var6, rpr_3.EAST));
         var6.class_(rpr_3.DOWN);
         rfw_3 var12 = new rfw_3();

         for (int var13 = -3; var13 < 4; var13++) {
            for (int var14 = -3; var14 < 4; var14++) {
               int var15 = rfU_2.class_(var13) * rfU_2.class_(var14);
               if (var3.nextInt(10) < 10 - var15) {
                  var12.class_(var6.break_(var13, 0, var14));
                  int var16 = 3;

                  while (var1.finally_(var7.class_(var12, rpr_3.DOWN))) {
                     var12.class_(rpr_3.DOWN);
                     if (--var16 <= 0) {
                        break;
                     }
                  }

                  if (!var1.finally_(var7.class_(var12, rpr_3.DOWN))) {
                     var1.class_(var12, xu_3.PK.continue_(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean break_(rRg_1 var1, Random var2, rfH_2 var3) {
      if (var2.nextInt(10) != 0) {
         var1.class_(var3, xu_3.PK.continue_(), 2);
         return true;
      } else {
         return false;
      }
   }
}
