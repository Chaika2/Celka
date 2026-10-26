package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class rrZ_2 extends rPW {
   private static final List<rdb_3> class_ = ImmutableList.of(rdy_3.hP, rdy_3.kJ);

   private void class_(rrEm_1 var1, xc_3 var2, rfH_2 var3, xc_3 var4) {
      var1.byte_(1500, var3, var4 != var2 ? 1 : 0);
   }

   private void class_(rsq_3 var1) {
      rXA var2 = var1.sd();
      if (var2.class_(rdy_3.hS) <= 36) {
         int var3 = var2.class_(rdy_3.hB);
         byte var4 = 3;
         byte var5 = 3;
         int var6 = Math.min(3, var3 / 3);
         if (var6 != 0) {
            int var7 = var6 * 3;
            var2.class_(rdy_3.hB, var7);
            rdn_3 var8 = var2.class_(new rdn_3(rdy_3.hS, var6));
            if (!var8.class_()) {
               var1.class_(var8, 0.5F);
            }
         }
      }
   }

   @Override
   protected void class_(rrEm_1 var1, rsq_3 var2) {
      Optional var3 = var2.SF().byte_(il_3.byte_);
      if (var3.isPresent()) {
         rfK_2 var4 = (rfK_2)var3.get();
         xc_3 var5 = var1.byte_(var4.break_());
         if (var5.class_(xu_3.JG)) {
            this.class_(var2);
            this.class_(var1, var2, var4, var5);
         }
      }
   }

   private void class_(rrEm_1 var1, rsq_3 var2, rfK_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.break_();
      if (var4.byte_(xU_2.volatile_) == 8) {
         var4 = xU_2.byte_(var4, (rYB)var1, var5);
      }

      int var6 = 20;
      byte var7 = 10;
      int[] var8 = new int[class_.size()];
      rXA var9 = var2.sd();
      int var10 = var9.else_();
      xc_3 var11 = var4;

      for (int var12 = var10 - 1; var12 >= 0 && var6 > 0; var12--) {
         rdn_3 var13 = var9.extends_(var12);
         int var14 = class_.indexOf(var13.break_());
         if (var14 != -1) {
            int var15 = var13.char_();
            int var16 = var8[var14] + var15;
            var8[var14] = var16;
            int var17 = Math.min(Math.min(var16 - 10, var6), var15);
            if (var17 > 0) {
               var6 -= var17;

               for (int var18 = 0; var18 < var17; var18++) {
                  var11 = xU_2.class_(var11, var1, var13, var5);
                  if (var11.byte_(xU_2.volatile_) == 7) {
                     this.class_(var1, var4, var5, var11);
                     return;
                  }
               }
            }
         }
      }

      this.class_(var1, var4, var5, var11);
   }
}
