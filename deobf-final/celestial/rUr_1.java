package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rUr_1 extends rUO<rUt_1> {
   private static final Logger class_ = LogManager.getLogger();
   private static final aI_2<?>[] b = new aI_2[]{aI_2.A, aI_2.rs, aI_2.rs, aI_2.q};
   private static final xc_3 M = xu_3.hb.continue_();

   public rUr_1(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      byte var6 = 3;
      int var7 = var3.nextInt(2) + 2;
      int var8 = -var7 - 1;
      int var9 = var7 + 1;
      byte var10 = -1;
      byte var11 = 4;
      int var12 = var3.nextInt(2) + 2;
      int var13 = -var12 - 1;
      int var14 = var12 + 1;
      int var15 = 0;

      for (int var16 = var8; var16 <= var9; var16++) {
         for (int var17 = -1; var17 <= 4; var17++) {
            for (int var18 = var13; var18 <= var14; var18++) {
               rfH_2 var19 = var4.break_(var16, var17, var18);
               QP var20 = var1.byte_(var19).byte_();
               boolean var21 = var20.break_();
               if (var17 == -1 && !var21) {
                  return false;
               }

               if (var17 == 4 && !var21) {
                  return false;
               }

               if ((var16 == var8 || var16 == var9 || var18 == var13 || var18 == var14) && var17 == 0 && var1.finally_(var19) && var1.finally_(var19.final_())) {
                  var15++;
               }
            }
         }
      }

      if (var15 >= 1 && var15 <= 5) {
         for (int var25 = var8; var25 <= var9; var25++) {
            for (int var28 = 3; var28 >= -1; var28--) {
               for (int var30 = var13; var30 <= var14; var30++) {
                  rfH_2 var32 = var4.break_(var25, var28, var30);
                  xc_3 var34 = var1.byte_(var32);
                  if (var25 != var8 && var28 != -1 && var30 != var13 && var25 != var9 && var28 != 4 && var30 != var14) {
                     if (!var34.class_(xu_3.re) && !var34.class_(xu_3.rD)) {
                        var1.class_(var32, M, 2);
                     }
                  } else if (var32.c_() >= 0 && !var1.byte_(var32.break_()).byte_().break_()) {
                     var1.class_(var32, M, 2);
                  } else if (var34.byte_().break_() && !var34.class_(xu_3.re)) {
                     if (var28 == -1 && var3.nextInt(4) != 0) {
                        var1.class_(var32, xu_3.rV.continue_(), 2);
                     } else {
                        var1.class_(var32, xu_3.volatile_.continue_(), 2);
                     }
                  }
               }
            }
         }

         for (int var26 = 0; var26 < 2; var26++) {
            for (int var29 = 0; var29 < 3; var29++) {
               int var31 = var4.b_() + var3.nextInt(var7 * 2 + 1) - var7;
               int var33 = var4.c_();
               int var35 = var4.d_() + var3.nextInt(var12 * 2 + 1) - var12;
               rfH_2 var36 = new rfH_2(var31, var33, var35);
               if (var1.finally_(var36)) {
                  int var22 = 0;

                  for (rpr_3 var24 : rpb_3.HORIZONTAL) {
                     if (var1.byte_(var36.break_(var24)).byte_().break_()) {
                        var22++;
                     }
                  }

                  if (var22 == 1) {
                     var1.class_(var36, rrrn_1.class_(var1, var36, xu_3.re.continue_()), 2);
                     rHK.class_(var1, var3, var36, rzl_3.protected_);
                     break;
                  }
               }
            }
         }

         var1.class_(var4, xu_3.rD.continue_(), 2);
         ryO_2 var27 = var1.class_(var4);
         if (var27 instanceof rHU) {
            ((rHU)var27).catch_().class_(this.class_(var3));
         } else {
            class_.error("Failed to fetch mob spawner entity at ({}, {}, {})", var4.b_(), var4.c_(), var4.d_());
         }

         return true;
      } else {
         return false;
      }
   }

   private aI_2<?> class_(Random var1) {
      return rqR_2.class_(b, var1);
   }
}
