package celestial;

import java.util.Random;

public abstract class riY_2 extends rrrn_1 {
   protected final int class_;
   protected final int break_;
   protected final int byte_;
   protected int protected_ = -1;

   protected riY_2(raF_2 var1, Random var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, 0);
      this.class_ = var6;
      this.break_ = var7;
      this.byte_ = var8;
      this.class_(rpb_3.HORIZONTAL.class_(var2));
      if (this.implements_().final_() == rpB_2.Z) {
         this.final_ = new rfi_3(var3, var4, var5, var3 + var6 - 1, var4 + var7 - 1, var5 + var8 - 1);
      } else {
         this.final_ = new rfi_3(var3, var4, var5, var3 + var8 - 1, var4 + var7 - 1, var5 + var6 - 1);
      }
   }

   protected riY_2(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.class_ = var2.private_("Width");
      this.break_ = var2.private_("Height");
      this.byte_ = var2.private_("Depth");
      this.protected_ = var2.private_("HPos");
   }

   protected boolean class_(rRg_1 var1, rfi_3 var2, int var3) {
      if (this.protected_ >= 0) {
         return true;
      } else {
         int var4 = 0;
         int var5 = 0;
         rfw_3 var6 = new rfw_3();

         for (int var7 = this.final_.byte_; var7 <= this.final_.case_; var7++) {
            for (int var8 = this.final_.class_; var8 <= this.final_.protected_; var8++) {
               var6.class_(var8, 64, var7);
               if (var2.break_(var6)) {
                  var4 += var1.class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, var6).c_();
                  var5++;
               }
            }
         }

         if (var5 == 0) {
            return false;
         } else {
            this.protected_ = var4 / var5;
            this.final_.class_(0, this.protected_ - this.final_.break_ + var3, 0);
            return true;
         }
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.break_("Width", this.class_);
      var1.break_("Height", this.break_);
      var1.break_("Depth", this.byte_);
      var1.break_("HPos", this.protected_);
   }
}
