package celestial;

public class rBG extends rBm_1 {
   private static final int[] class_ = new int[]{0, 1, 4, 5, 6, 7};
   private final rbo_3 break_;
   private final int byte_;
   private boolean protected_;

   @Override
   public void byte_() {
      rpr_3 var1 = this.break_.rS();
      this.break_.byte_(this.break_.rv().break_((double)var1.implements_() * 0.6, 0.7, (double)var1.extends_() * 0.6));
      this.break_.public_().final_();
   }

   public rBG(rbo_3 var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public boolean class_() {
      if (this.break_.Sa().nextInt(this.byte_) != 0) {
         return false;
      } else {
         rpr_3 var1 = this.break_.rS();
         int var2 = var1.implements_();
         int var3 = var1.extends_();
         rfH_2 var4 = this.break_.Bs();

         for (int var8 : class_) {
            if (!this.class_(var4, var2, var3, var8) || !this.break_(var4, var2, var3, var8)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean class_(rfH_2 var1, int var2, int var3, int var4) {
      rfH_2 var5 = var1.break_(var2 * var4, 0, var3 * var4);
      return ((rYB)this.break_.throws_[7]).break_(var5).class_(rlG_2.break_) && !((rYB)this.break_.throws_[7]).byte_(var5).byte_().byte_();
   }

   private boolean break_(rfH_2 var1, int var2, int var3, int var4) {
      return ((rYB)this.break_.throws_[7]).byte_(var1.break_(var2 * var4, 1, var3 * var4)).catch_()
         && ((rYB)this.break_.throws_[7]).byte_(var1.break_(var2 * var4, 2, var3 * var4)).catch_();
   }

   @Override
   public boolean break_() {
      double var1 = this.break_.rv().byte_;
      return (!(var1 * var1 < 0.03F) || (Float)this.break_.throws_[16] == 0.0F || !(Math.abs((Float)this.break_.throws_[16]) < 10.0F) || !this.break_.rT())
         && !this.break_.BL();
   }

   @Override
   public void throws_() {
      boolean var1 = this.protected_;
      if (!var1) {
         rXE var2 = ((rYB)this.break_.throws_[7]).break_(this.break_.Bs());
         this.protected_ = var2.class_(rlG_2.break_);
      }

      if (this.protected_ && !var1) {
         this.break_.class_(rqn_3.PV, 1.0F, 1.0F);
      }

      rjU_2 var13 = this.break_.rv();
      if (var13.byte_ * var13.byte_ < 0.03F && (Float)this.break_.throws_[16] != 0.0F) {
         rbo_3 var14 = this.break_;
         Float var11 = rfU_2.implements_((Float)this.break_.throws_[16], 0.0F, 0.2F);
         var14.throws_[16] = var11;
      } else {
         double var3 = Math.sqrt(an_3.case_(var13));
         double var5 = Math.signum(-var13.byte_) * Math.acos(var3 / var13.case_()) * 180.0F / (float)Math.PI;
         rbo_3 var10000 = this.break_;
         Float var12 = (float)var5;
         var10000.throws_[16] = var12;
      }
   }

   @Override
   public void protected_() {
      rbo_3 var10000 = this.break_;
      Float var5 = 0.0F;
      var10000.throws_[16] = var5;
   }

   @Override
   public boolean J_() {
      return false;
   }
}
