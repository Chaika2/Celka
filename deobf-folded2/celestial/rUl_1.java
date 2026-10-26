package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUl_1 extends rUO<rDq_1> {
   private static final xc_3 id_class = xu_3.hb.id_continue();

   public rUl_1(Codec<rDq_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDq_1 var5) {
      while (var4.c_() > 5 && var1.id_finally(var4)) {
         var4 = var4.id_break();
      }

      if (var4.c_() <= 4) {
         return false;
      } else {
         var4 = var4.id_catch(4);
         if (var1.id_class(rjh_3.id_class(var4), rrrZ.id_new).findAny().isPresent()) {
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
                        QP var12 = var1.id_byte(var4.id_break(var33, var10, var38)).id_byte();
                        if (var10 >= 4 && var12.id_class()) {
                           return false;
                        }

                        if (var10 < 4 && !var12.id_break() && var1.id_byte(var4.id_break(var33, var10, var38)) != var5.id_break) {
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
                        var1.id_class(var4.id_break(var34, var43, var39), var43 >= 4 ? id_class : var5.id_break, 2);
                     }
                  }
               }
            }

            for (int var35 = 0; var35 < 16; var35++) {
               for (int var40 = 0; var40 < 16; var40++) {
                  for (int var44 = 4; var44 < 8; var44++) {
                     if (var6[(var35 * 16 + var40) * 8 + var44]) {
                        rfH_2 var48 = var4.id_break(var35, var44 - 1, var40);
                        if (id_break(var1.id_byte(var48).id_break()) && var1.id_class(rRo_1.SKY, var4.id_break(var35, var44, var40)) > 0) {
                           rYG var51 = var1.id_implements(var48);
                           if (var51.id_throws().id_throws().id_class().id_class(xu_3.Bi)) {
                              var1.id_class(var48, xu_3.Bi.id_continue(), 2);
                           } else {
                              var1.id_class(var48, xu_3.id_implements.id_continue(), 2);
                           }
                        }
                     }
                  }
               }
            }

            if (var5.id_break.id_byte() == QP.id_native) {
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
                        if (var49 && (var45 < 4 || var3.nextInt(2) != 0) && var1.id_byte(var4.id_break(var36, var45, var41)).id_byte().id_break()) {
                           var1.id_class(var4.id_break(var36, var45, var41), xu_3.id_break.id_continue(), 2);
                        }
                     }
                  }
               }
            }

            if (var5.id_break.id_byte() == QP.id_finally) {
               for (int var37 = 0; var37 < 16; var37++) {
                  for (int var42 = 0; var42 < 16; var42++) {
                     byte var46 = 4;
                     rfH_2 var50 = var4.id_break(var37, 4, var42);
                     if (var1.id_implements(var50).id_class(var1, var50, false)) {
                        var1.id_class(var50, xu_3.PT.id_continue(), 2);
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
