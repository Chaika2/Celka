package celestial;

import java.util.List;
import java.util.Random;

public class rrrs_1 extends rrrQ {
   private final int class_;

   public rrrs_1(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.else_, var1);
      this.class_(var3);
      this.final_ = var2;
      this.class_ = var3 != rpr_3.NORTH && var3 != rpr_3.SOUTH ? var2.protected_() : var2.case_();
   }

   public rrrs_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.else_, var2);
      this.class_ = var2.private_("Steps");
   }

   public static rfi_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5) {
      byte var6 = 3;
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      rrrn_1 var8 = rrrn_1.class_(var0, var7);
      if (var8 == null) {
         return null;
      } else {
         if (var8.catch_().break_ == var7.break_) {
            for (int var9 = 3; var9 >= 1; var9--) {
               var7 = rfi_3.class_(var2, var3, var4, -1, -1, 0, 5, 5, var9 - 1, var5);
               if (!var8.catch_().class_(var7)) {
                  return rfi_3.class_(var2, var3, var4, -1, -1, 0, 5, 5, var9, var5);
               }
            }
         }

         return null;
      }
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      for (int var8 = 0; var8 < this.class_; var8++) {
         this.class_(var1, xu_3.BL.continue_(), 0, 0, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 1, 0, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 2, 0, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 3, 0, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 4, 0, var8, var5);

         for (int var9 = 1; var9 <= 3; var9++) {
            this.class_(var1, xu_3.BL.continue_(), 0, var9, var8, var5);
            this.class_(var1, xu_3.hb.continue_(), 1, var9, var8, var5);
            this.class_(var1, xu_3.hb.continue_(), 2, var9, var8, var5);
            this.class_(var1, xu_3.hb.continue_(), 3, var9, var8, var5);
            this.class_(var1, xu_3.BL.continue_(), 4, var9, var8, var5);
         }

         this.class_(var1, xu_3.BL.continue_(), 0, 4, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 1, 4, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 2, 4, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 3, 4, var8, var5);
         this.class_(var1, xu_3.BL.continue_(), 4, 4, var8, var5);
      }

      return true;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Steps", this.class_);
   }
}
