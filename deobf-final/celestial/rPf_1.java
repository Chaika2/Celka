package celestial;

public class rPf_1 {
   private final is_3 class_;
   private int break_;
   private float byte_;

   private void byte_() {
      is_3 var10000 = this.class_;
      Float var5 = rfU_2.break_((Float)this.class_.private_[25], (Float)this.class_.private_[23], (float)this.class_.S());
      var10000.private_[25] = var5;
   }

   public rPf_1(is_3 var1) {
      this.class_ = var1;
   }

   public void class_() {
      if (this.case_()) {
         is_3 var10000 = this.class_;
         Float var5 = (Float)this.class_.throws_[15];
         var10000.private_[23] = var5;
         this.byte_();
         this.byte_ = (Float)this.class_.private_[25];
         this.break_ = 0;
      } else if (this.throws_()) {
         if (Math.abs((Float)this.class_.private_[25] - this.byte_) > 15.0F) {
            this.break_ = 0;
            this.byte_ = (Float)this.class_.private_[25];
            this.break_();
         } else {
            this.break_++;
            if (this.break_ > 10) {
               this.protected_();
            }
         }
      }
   }

   private void break_() {
      is_3 var10000 = this.class_;
      Float var5 = rfU_2.break_((Float)this.class_.private_[23], (Float)this.class_.private_[25], (float)this.class_.S());
      var10000.private_[23] = var5;
   }

   private boolean throws_() {
      return this.class_.Bh().isEmpty() || !(this.class_.Bh().get(0) instanceof is_3);
   }

   private boolean case_() {
      double var1 = this.class_.rx() - (Double)this.class_.throws_[8];
      double var3 = this.class_.BO() - (Double)this.class_.throws_[10];
      return var1 * var1 + var3 * var3 > 2.5000003E-7F;
   }

   private void protected_() {
      int var1 = this.break_ - 10;
      float var2 = rfU_2.class_((float)var1 / 10.0F, 0.0F, 1.0F);
      float var3 = (float)this.class_.S() * (1.0F - var2);
      is_3 var10000 = this.class_;
      Float var8 = rfU_2.break_((Float)this.class_.private_[23], (Float)this.class_.private_[25], var3);
      var10000.private_[23] = var8;
   }
}
