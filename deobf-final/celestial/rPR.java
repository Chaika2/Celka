package celestial;

public class rPR {
   protected final is_3 class_;
   protected float break_;
   protected float byte_;
   protected boolean protected_;
   protected double throws_;
   protected double case_;
   protected double catch_;

   public boolean byte_() {
      return this.protected_;
   }

   public rPR(is_3 var1) {
      this.class_ = var1;
   }

   public void class_() {
      if (this.break_()) {
         is_3 var10000 = this.class_;
         Float var5 = 0.0F;
         var10000.throws_[16] = var5;
      }

      if (this.protected_) {
         this.protected_ = false;
         is_3 var10 = this.class_;
         Float var6 = this.class_((Float)this.class_.private_[25], this.private_(), this.break_);
         var10.private_[25] = var6;
         var10 = this.class_;
         Float var7 = this.class_((Float)this.class_.throws_[16], this.catch_(), this.byte_);
         var10.throws_[16] = var7;
      } else {
         is_3 var12 = this.class_;
         Float var8 = this.class_((Float)this.class_.private_[25], (Float)this.class_.private_[23], 10.0F);
         var12.private_[25] = var8;
      }

      if (!this.class_.public_().native_()) {
         is_3 var13 = this.class_;
         Float var9 = rfU_2.break_((Float)this.class_.private_[25], (Float)this.class_.private_[23], (float)this.class_.S());
         var13.private_[25] = var9;
      }
   }

   public void class_(rjU_2 var1) {
      this.class_(var1.break_, var1.byte_, var1.protected_);
   }

   private static double class_(an_3 var0) {
      return var0 instanceof iB_2 ? var0.rH() : (var0.rN().break_ + var0.rN().throws_) / 2.0;
   }

   protected float class_(float var1, float var2, float var3) {
      float var4 = rfU_2.byte_(var1, var2);
      float var5 = rfU_2.class_(var4, -var3, var3);
      return var1 + var5;
   }

   public void class_(an_3 var1, float var2, float var3) {
      this.class_(var1.rx(), class_(var1), var1.BO(), var2, var3);
   }

   public void class_(double var1, double var3, double var5, float var7, float var8) {
      this.throws_ = var1;
      this.case_ = var3;
      this.catch_ = var5;
      this.break_ = var7;
      this.byte_ = var8;
      this.protected_ = true;
   }

   public void class_(double var1, double var3, double var5) {
      this.class_(var1, var3, var5, (float)this.class_.s(), (float)this.class_.r());
   }

   protected boolean break_() {
      return true;
   }

   public double throws_() {
      return this.case_;
   }

   protected float catch_() {
      double var1 = this.throws_ - this.class_.rx();
      double var3 = this.case_ - this.class_.rH();
      double var5 = this.catch_ - this.class_.BO();
      double var7 = (double)rfU_2.class_(var1 * var1 + var5 * var5);
      return (float)(-(rfU_2.protected_(var3, var7) * 180.0F / (float)Math.PI));
   }

   public double case_() {
      return this.catch_;
   }

   public double protected_() {
      return this.throws_;
   }

   protected float private_() {
      double var1 = this.throws_ - this.class_.rx();
      double var3 = this.catch_ - this.class_.BO();
      return (float)(rfU_2.protected_(var3, var1) * 180.0F / (float)Math.PI) - 90.0F;
   }
}
