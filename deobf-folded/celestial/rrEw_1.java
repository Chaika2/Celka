package celestial;

import java.util.Random;

public class rrEw_1 implements rrEq_1 {
   private int id_class;

   @Override
   public int id_class(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (!var1.B().id_break(rRu_1.id_interface)) {
         return 0;
      } else {
         Random var4 = var1.id_int;
         this.id_class--;
         if (this.id_class > 0) {
            return 0;
         } else {
            this.id_class = this.id_class + 12000 + var4.nextInt(1200);
            long var5 = var1.P() / 24000L;
            if (var5 < 5L || !var1.id_strictfp()) {
               return 0;
            } else if (var4.nextInt(5) != 0) {
               return 0;
            } else {
               int var7 = var1.id_continue().size();
               if (var7 < 1) {
                  return 0;
               } else {
                  rhd_3 var8 = var1.id_continue().get(var4.nextInt(var7));
                  if (var8.id_native()) {
                     return 0;
                  } else if (var1.id_byte(var8.Bs(), 2)) {
                     return 0;
                  } else {
                     int var9 = (24 + var4.nextInt(24)) * (var4.nextBoolean() ? -1 : 1);
                     int var10 = (24 + var4.nextInt(24)) * (var4.nextBoolean() ? -1 : 1);
                     rfw_3 var11 = var8.Bs().id_new().id_byte(var9, 0, var10);
                     if (!var1.id_class(var11.b_() - 10, var11.c_() - 10, var11.d_() - 10, var11.b_() + 10, var11.c_() + 10, var11.d_() + 10)) {
                        return 0;
                     } else {
                        rYG var12 = var1.id_implements(var11);
                        rYh_1 var13 = var12.id_this();
                        if (var13 == rYh_1.MUSHROOM) {
                           return 0;
                        } else {
                           int var14 = 0;
                           int var15 = (int)Math.ceil((double)var1.id_throws(var11).id_break()) + 1;

                           for (int var16 = 0; var16 < var15; var16++) {
                              var14++;
                              var11.b_(var1.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, var11).c_());
                              if (var16 == 0) {
                                 if (!this.id_class(var1, var11, var4, true)) {
                                    break;
                                 }
                              } else {
                                 this.id_class(var1, var11, var4, false);
                              }

                              var11.a_(var11.b_() + var4.nextInt(5) - var4.nextInt(5));
                              var11.c_(var11.d_() + var4.nextInt(5) - var4.nextInt(5));
                           }

                           return var14;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean id_class(rrEm_1 var1, rfH_2 var2, Random var3, boolean var4) {
      xc_3 var5 = var1.id_byte(var2);
      if (!rrEj_1.id_class(var1, var2, var5, var5.id_volatile(), aI_2.W)) {
         return false;
      } else if (!rGr_1.id_break(aI_2.W, var1, iO_2.PATROL, var2, var3)) {
         return false;
      } else {
         rGr_1 var6 = aI_2.W.id_class(var1);
         if (var6 != null) {
            if (var4) {
               var6.id_synchronized(true);
               var6.sL();
            }

            var6.id_new((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
            var6.id_class(var1, var1.id_throws(var2), iO_2.PATROL, (aU_2)null, (rcd_3)null);
            var1.id_class(var6);
            return true;
         } else {
            return false;
         }
      }
   }
}
