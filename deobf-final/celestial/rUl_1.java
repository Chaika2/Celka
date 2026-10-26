package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUl_1 extends rUO<rDq_1> {
   private static final xc_3 class_ = xu_3.hb.continue_();

   public rUl_1(Codec<rDq_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDq_1 var5) {
      while (var4.c_() > 5 && var1.finally_(var4)) {
         var4 = var4.break_();
      }

      if (var4.c_() <= 4) {
         return false;
      } else {
         var4 = var4.catch_(4);
         if (var1.class_(rjh_3.class_(var4), rrrZ.new_).findAny().isPresent()) {
            return false;
         } else {
            boolean[] var6 = new boolean[2048];
            int var7 = var3.nextInt(4) + 4;

            for (int var8 = 0; var8 < var7; var8++) {
               double var9 = var3.nextDouble() * 6.0 + 3.0;
               double var11 = var3.nextDouble() * 4.0 + 2.0;
               double var13 = var3.nextDouble() * 6.0 + 3.0;
               double var15 = var3.nextDouble() * (16.0 - var9 - 2.0) + 1.0 + var9 / 2.0;
               double var17 = var3.nextDouble() * (8.0 - var11 - 4.0) + 2.0 + var11 / 2.0;
               double var19 = var3.nextDouble() * (16.0 - var13 - 2.0) + 1.0 + var13 / 2.0;

               for (int var21 = 1; var21 < 15; var21++) {
                  for (int var22 = 1; var22 < 15; var22++) {
                     for (int var23 = 1; var23 < 7; var23++) {
                        double var24 = ((double)var21 - var15) / (var9 / 2.0);
                        double var26 = ((double)var23 - var17) / (var11 / 2.0);
                        double var28 = ((double)var22 - var19) / (var13 / 2.0);
                        double var30 = var24 * var24 + var26 * var26 + var28 * var28;
                        if (var30 < 1.0) {
                           var6[(var21 * 16 + var22) * 8 + var23] = true;
                        }
                     }
                  }
               }
            }

            for (int var33 = 0; var33 < 16; var33++) {
               for (int var38 = 0; var38 < 16; var38++) {
                  for (int var10 = 0; var10 < 8; var10++) {
                     boolean var47 = !var6[(var33 * 16 + var38) * 8 + var10]
                        && (
                           var33 < 15 && var6[((var33 + 1) * 16 + var38) * 8 + var10]
                              || var33 > 0 && var6[((var33 - 1) * 16 + var38) * 8 + var10]
                              || var38 < 15 && var6[(var33 * 16 + var38 + 1) * 8 + var10]
                              || var38 > 0 && var6[(var33 * 16 + (var38 - 1)) * 8 + var10]
                              || var10 < 7 && var6[(var33 * 16 + var38) * 8 + var10 + 1]
                              || var10 > 0 && var6[(var33 * 16 + var38) * 8 + (var10 - 1)]
                        );
                     if (var47) {
                        QP var12 = var1.byte_(var4.break_(var33, var10, var38)).byte_();
                        if (var10 >= 4 && var12.class_()) {
                           return false;
                        }

                        if (var10 < 4 && !var12.break_() && var1.byte_(var4.break_(var33, var10, var38)) != var5.break_) {
                           return false;
                        }
                     }
                  }
               }
            }

            for (int var34 = 0; var34 < 16; var34++) {
               for (int var39 = 0; var39 < 16; var39++) {
                  for (int var43 = 0; var43 < 8; var43++) {
                     if (var6[(var34 * 16 + var39) * 8 + var43]) {
                        var1.class_(var4.break_(var34, var43, var39), var43 >= 4 ? class_ : var5.break_, 2);
                     }
                  }
               }
            }

            for (int var35 = 0; var35 < 16; var35++) {
               for (int var40 = 0; var40 < 16; var40++) {
                  for (int var44 = 4; var44 < 8; var44++) {
                     if (var6[(var35 * 16 + var40) * 8 + var44]) {
                        rfH_2 var48 = var4.break_(var35, var44 - 1, var40);
                        if (break_(var1.byte_(var48).break_()) && var1.class_(rRo_1.SKY, var4.break_(var35, var44, var40)) > 0) {
                           rYG var51 = var1.implements_(var48);
                           if (var51.throws_().throws_().class_().class_(xu_3.Bi)) {
                              var1.class_(var48, xu_3.Bi.continue_(), 2);
                           } else {
                              var1.class_(var48, xu_3.implements_.continue_(), 2);
                           }
                        }
                     }
                  }
               }
            }

            if (var5.break_.byte_() == QP.native_) {
               for (int var36 = 0; var36 < 16; var36++) {
                  for (int var41 = 0; var41 < 16; var41++) {
                     for (int var45 = 0; var45 < 8; var45++) {
                        boolean var49 = !var6[(var36 * 16 + var41) * 8 + var45]
                           && (
                              var36 < 15 && var6[((var36 + 1) * 16 + var41) * 8 + var45]
                                 || var36 > 0 && var6[((var36 - 1) * 16 + var41) * 8 + var45]
                                 || var41 < 15 && var6[(var36 * 16 + var41 + 1) * 8 + var45]
                                 || var41 > 0 && var6[(var36 * 16 + (var41 - 1)) * 8 + var45]
                                 || var45 < 7 && var6[(var36 * 16 + var41) * 8 + var45 + 1]
                                 || var45 > 0 && var6[(var36 * 16 + var41) * 8 + (var45 - 1)]
                           );
                        if (var49 && (var45 < 4 || var3.nextInt(2) != 0) && var1.byte_(var4.break_(var36, var45, var41)).byte_().break_()) {
                           var1.class_(var4.break_(var36, var45, var41), xu_3.break_.continue_(), 2);
                        }
                     }
                  }
               }
            }

            if (var5.break_.byte_() == QP.finally_) {
               for (int var37 = 0; var37 < 16; var37++) {
                  for (int var42 = 0; var42 < 16; var42++) {
                     byte var46 = 4;
                     rfH_2 var50 = var4.break_(var37, 4, var42);
                     if (var1.implements_(var50).class_(var1, var50, false)) {
                        var1.class_(var50, xu_3.PT.continue_(), 2);
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
