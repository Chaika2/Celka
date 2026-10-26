package celestial;

import java.util.Random;

public class rrEI implements rrEq_1 {
   private int id_class;

   @Override
   public int id_class(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (!var1.B().id_break(rRu_1.id_goto)) {
         return 0;
      } else {
         Random var4 = var1.id_int;
         this.id_class--;
         if (this.id_class > 0) {
            return 0;
         } else {
            this.id_class = this.id_class + (60 + var4.nextInt(60)) * 20;
            if (var1.id_void() < 5 && var1.id_default().id_break()) {
               return 0;
            } else {
               int var5 = 0;

               for (rhd_3 var7 : var1.id_continue()) {
                  if (!var7.id_native()) {
                     rfH_2 var8 = var7.Bs();
                     if (!var1.id_default().id_break() || var8.c_() >= var1.id_short() && var1.id_case(var8)) {
                        rRh_1 var9 = var1.id_throws(var8);
                        if (var9.id_class(var4.nextFloat() * 3.0F)) {
                           rCa_1 var10 = ((rhN_2)var7).id_long();
                           int var11 = rfU_2.id_class(var10.id_class(rlB_2.id_implements.id_break(rlB_2.id_volatile)), 1, Integer.MAX_VALUE);
                           short var12 = 24000;
                           if (var4.nextInt(var11) >= 72000) {
                              rfH_2 var13 = var8.id_break(20 + var4.nextInt(15)).id_volatile(-10 + var4.nextInt(21)).id_private(-10 + var4.nextInt(21));
                              xc_3 var14 = var1.id_byte(var13);
                              rXE var15 = var1.id_break(var13);
                              if (rrEj_1.id_class(var1, var13, var14, var15, aI_2.J)) {
                                 aU_2 var16 = null;
                                 int var17 = 1 + var4.nextInt(var9.id_class().id_class() + 1);

                                 for (int var18 = 0; var18 < var17; var18++) {
                                    rGB var19 = aI_2.J.id_class(var1);
                                    var19.id_class(var13, 0.0F, 0.0F);
                                    var16 = var19.id_class(var1, var9, iO_2.NATURAL, var16, (rcd_3)null);
                                    var1.id_class(var19);
                                 }

                                 var5 += var17;
                              }
                           }
                        }
                     }
                  }
               }

               return var5;
            }
         }
      }
   }
}
