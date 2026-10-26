package celestial;

import java.util.Random;

public class rrEI implements rrEq_1 {
   private int class_;

   @Override
   public int class_(rrEm_1 var1, boolean var2, boolean var3) {
      if (!var2) {
         return 0;
      } else if (!var1.B().break_(rRu_1.goto_)) {
         return 0;
      } else {
         Random var4 = var1.int_;
         this.class_--;
         if (this.class_ > 0) {
            return 0;
         } else {
            this.class_ = this.class_ + (60 + var4.nextInt(60)) * 20;
            if (var1.void_() < 5 && var1.default_().break_()) {
               return 0;
            } else {
               int var5 = 0;

               for (rhd_3 var7 : var1.continue_()) {
                  if (!var7.native_()) {
                     rfH_2 var8 = var7.Bs();
                     if (!var1.default_().break_() || var8.c_() >= var1.short_() && var1.case_(var8)) {
                        rRh_1 var9 = var1.throws_(var8);
                        if (var9.class_(var4.nextFloat() * 3.0F)) {
                           rCa_1 var10 = ((rhN_2)var7).long_();
                           int var11 = rfU_2.class_(var10.class_(rlB_2.implements_.break_(rlB_2.volatile_)), 1, Integer.MAX_VALUE);
                           short var12 = 24000;
                           if (var4.nextInt(var11) >= 72000) {
                              rfH_2 var13 = var8.break_(20 + var4.nextInt(15)).volatile_(-10 + var4.nextInt(21)).private_(-10 + var4.nextInt(21));
                              xc_3 var14 = var1.byte_(var13);
                              rXE var15 = var1.break_(var13);
                              if (rrEj_1.class_(var1, var13, var14, var15, aI_2.J)) {
                                 aU_2 var16 = null;
                                 int var17 = 1 + var4.nextInt(var9.class_().class_() + 1);

                                 for (int var18 = 0; var18 < var17; var18++) {
                                    rGB var19 = aI_2.J.class_(var1);
                                    var19.class_(var13, 0.0F, 0.0F);
                                    var16 = var19.class_(var1, var9, iO_2.NATURAL, var16, (rcd_3)null);
                                    var1.class_(var19);
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
