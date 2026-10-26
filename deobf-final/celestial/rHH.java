package celestial;

import java.util.Random;

public class rHH extends ryO_2 implements rHf_1, rpA_2 {
   public int class_;
   public float break_;
   public float byte_;
   public float protected_;
   public float throws_;
   public float case_;
   public float catch_;
   public float private_;
   public float implements_;
   public float finally_;
   private static final Random final_ = new Random();
   private rgP_2 package_;

   public rHH() {
      super(ryW_2.native_);
   }

   public void class_(rgP_2 var1) {
      this.package_ = var1;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (this.Bk()) {
         var1.class_("CustomName", rgB_2.class_(this.package_));
      }

      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      if (var2.byte_("CustomName", 8)) {
         this.package_ = rgB_2.class_(var2.native_("CustomName"));
      }
   }

   @Override
   public rgP_2 g() {
      return (rgP_2)(this.package_ != null ? this.package_ : new rgn_3("container.enchant"));
   }

   @Override
   public void throws_() {
      this.catch_ = this.case_;
      this.implements_ = this.private_;
      rhd_3 var1 = this.extends_.class_((double)this.native_.b_() + 0.5, (double)this.native_.c_() + 0.5, (double)this.native_.d_() + 0.5, 3.0, false);
      if (var1 != null) {
         double var2 = var1.rx() - ((double)this.native_.b_() + 0.5);
         double var4 = var1.BO() - ((double)this.native_.d_() + 0.5);
         this.finally_ = (float)rfU_2.protected_(var4, var2);
         this.case_ += 0.1F;
         if (this.case_ < 0.5F || final_.nextInt(40) == 0) {
            float var6 = this.protected_;

            do {
               this.protected_ = this.protected_ + (float)(final_.nextInt(4) - final_.nextInt(4));
            } while (var6 == this.protected_);
         }
      } else {
         this.finally_ += 0.02F;
         this.case_ -= 0.1F;
      }

      while (this.private_ >= (float) Math.PI) {
         this.private_ -= (float) (Math.PI * 2);
      }

      while (this.private_ < (float) -Math.PI) {
         this.private_ += (float) (Math.PI * 2);
      }

      while (this.finally_ >= (float) Math.PI) {
         this.finally_ -= (float) (Math.PI * 2);
      }

      while (this.finally_ < (float) -Math.PI) {
         this.finally_ += (float) (Math.PI * 2);
      }

      float var7 = this.finally_ - this.private_;

      while (var7 >= (float) Math.PI) {
         var7 -= (float) (Math.PI * 2);
      }

      while (var7 < (float) -Math.PI) {
         var7 += (float) (Math.PI * 2);
      }

      this.private_ += var7 * 0.4F;
      this.case_ = rfU_2.class_(this.case_, 0.0F, 1.0F);
      this.class_++;
      this.byte_ = this.break_;
      float var3 = (this.protected_ - this.break_) * 0.4F;
      float var9 = 0.2F;
      var3 = rfU_2.class_(var3, -0.2F, 0.2F);
      this.throws_ = this.throws_ + (var3 - this.throws_) * 0.9F;
      this.break_ = this.break_ + this.throws_;
   }

   @Override
   public rgP_2 rD() {
      return this.package_;
   }
}
