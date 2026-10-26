package celestial;

import java.util.EnumSet;

public class rjU_2 implements eX_2, rrTR {
   public static final rjU_2 class_ = new rjU_2(0.0, 0.0, 0.0);
   public double break_;
   public double byte_;
   public double protected_;

   public rjU_2 byte_(float var1) {
      float var2 = rfU_2.break_(var1);
      float var3 = rfU_2.class_(var1);
      double var4 = this.break_ * (double)var2 + this.byte_ * (double)var3;
      double var6 = this.byte_ * (double)var2 - this.break_ * (double)var3;
      double var8 = this.protected_;
      return new rjU_2(var4, var6, var8);
   }

   public static rjU_2 byte_(rja_3 var0) {
      return new rjU_2((double)var0.b_(), (double)var0.c_(), (double)var0.d_());
   }

   public double byte_(double var1, double var3, double var5) {
      double var7 = var1 - this.break_;
      double var9 = var3 - this.byte_;
      double var11 = var5 - this.protected_;
      return (double)rfU_2.class_(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public rjU_2 byte_(rjU_2 var1) {
      return new rjU_2(
         this.byte_ * var1.protected_ - this.protected_ * var1.byte_,
         this.protected_ * var1.break_ - this.break_ * var1.protected_,
         this.break_ * var1.byte_ - this.byte_ * var1.break_
      );
   }

   @Override
   public final double byte_() {
      return this.protected_;
   }

   public rjU_2(double var1, double var3, double var5) {
      this.break_ = var1;
      this.byte_ = var3;
      this.protected_ = var5;
   }

   public rjU_2(rfH_2 var1) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
   }

   public rjU_2(rfl_3 var1) {
      rjU_2 var2 = var1.case_();
      this.break_ = var2.break_;
      this.byte_ = var2.byte_;
      this.protected_ = var2.protected_;
   }

   public rjU_2(rja_3 var1) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
   }

   public rjU_2(rje_3 var1) {
      this((double)var1.class_(), (double)var1.break_(), (double)var1.byte_());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rjU_2 var2) {
         if (Double.compare(var2.break_, this.break_) != 0) {
            return false;
         } else {
            return Double.compare(var2.byte_, this.byte_) != 0 ? false : Double.compare(var2.protected_, this.protected_) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "(" + this.break_ + ", " + this.byte_ + ", " + this.protected_ + ")";
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.break_);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.byte_);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.protected_);
      return 31 * var3 + (int)(var1 ^ var1 >>> 32);
   }

   public rjU_2 class_(double var1) {
      return this.throws_(var1, var1, var1);
   }

   public double class_(rpB_2 var1) {
      return var1.class_(this.break_, this.byte_, this.protected_);
   }

   public rjU_2 class_(float var1, float var2, float var3) {
      this.break_ = (double)var1;
      this.byte_ = (double)var2;
      this.protected_ = (double)var3;
      return this;
   }

   public double class_(rfH_2 var1) {
      double var2 = (double)var1.b_() - this.break_;
      double var4 = (double)var1.c_() - this.byte_;
      double var6 = (double)var1.d_() - this.protected_;
      return (double)rfU_2.class_(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double class_(an_3 var1) {
      return this.private_(var1.Ps());
   }

   public static rjU_2 class_(rjK_2 var0) {
      return class_(var0.byte_, var0.protected_);
   }

   public static rjU_2 class_(rja_3 var0) {
      return new rjU_2((double)var0.b_() + 0.5, (double)var0.c_() + 0.5, (double)var0.d_() + 0.5);
   }

   public rjU_2 class_(float var1) {
      float var2 = rfU_2.break_(var1);
      float var3 = rfU_2.class_(var1);
      double var4 = this.break_;
      double var6 = this.byte_ * (double)var2 + this.protected_ * (double)var3;
      double var8 = this.protected_ * (double)var2 - this.byte_ * (double)var3;
      return new rjU_2(var4, var6, var8);
   }

   public static rjU_2 class_(float var0, float var1) {
      float var2 = rfU_2.break_(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = rfU_2.class_(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var4 = -rfU_2.break_(-var0 * (float) (Math.PI / 180.0));
      float var5 = rfU_2.class_(-var0 * (float) (Math.PI / 180.0));
      return new rjU_2((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   public rjU_2 class_(EnumSet<rpB_2> var1) {
      double var2 = var1.contains(rpB_2.X) ? (double)rfU_2.byte_(this.break_) : this.break_;
      double var4 = var1.contains(rpB_2.Y) ? (double)rfU_2.byte_(this.byte_) : this.byte_;
      double var6 = var1.contains(rpB_2.Z) ? (double)rfU_2.byte_(this.protected_) : this.protected_;
      return new rjU_2(var2, var4, var6);
   }

   public boolean class_(eX_2 var1, double var2) {
      return this.protected_(var1.class_(), var1.break_(), var1.byte_()) < var2 * var2;
   }

   public rjU_2 class_(rjU_2 var1) {
      return new rjU_2(var1.break_ - this.break_, var1.byte_ - this.byte_, var1.protected_ - this.protected_);
   }

   public rjU_2 class_(double var1, double var3, double var5) {
      return this.break_(-var1, -var3, -var5);
   }

   public rjU_2 class_(rjU_2 var1, float var2) {
      return new rjU_2(
         rfU_2.protected_((double)var2, this.break_, var1.break_),
         rfU_2.protected_((double)var2, this.byte_, var1.byte_),
         rfU_2.protected_((double)var2, this.protected_, var1.protected_)
      );
   }

   public static rjU_2 class_(rja_3 var0, double var1) {
      return new rjU_2((double)var0.b_() + 0.5, (double)var0.c_() + var1, (double)var0.d_() + 0.5);
   }

   public static rjU_2 class_(int var0) {
      double var1 = (double)(var0 >> 16 & 0xFF) / 255.0;
      double var3 = (double)(var0 >> 8 & 0xFF) / 255.0;
      double var5 = (double)(var0 & 0xFF) / 255.0;
      return new rjU_2(var1, var3, var5);
   }

   @Override
   public final double class_() {
      return this.break_;
   }

   public rjU_2 break_(float var1) {
      float var2 = rfU_2.break_(var1);
      float var3 = rfU_2.class_(var1);
      double var4 = this.break_ * (double)var2 + this.protected_ * (double)var3;
      double var6 = this.byte_;
      double var8 = this.protected_ * (double)var2 - this.break_ * (double)var3;
      return new rjU_2(var4, var6, var8);
   }

   public rjU_2 break_(double var1, double var3, double var5) {
      return new rjU_2(this.break_ + var1, this.byte_ + var3, this.protected_ + var5);
   }

   public double break_(rjU_2 var1) {
      return this.break_ * var1.break_ + this.byte_ * var1.byte_ + this.protected_ * var1.protected_;
   }

   @Override
   public final double break_() {
      return this.byte_;
   }

   public static rjU_2 break_(rja_3 var0) {
      return new rjU_2((double)var0.b_(), (double)var0.c_(), (double)var0.d_());
   }

   public rjU_2 throws_() {
      return this.class_(-1.0);
   }

   public rjU_2 throws_(double var1, double var3, double var5) {
      return new rjU_2(this.break_ * var1, this.byte_ * var3, this.protected_ * var5);
   }

   public rjU_2 throws_(rjU_2 var1) {
      return this.break_(var1.break_, var1.byte_, var1.protected_);
   }

   public rjU_2 finally_(rjU_2 var1) {
      return this.throws_(var1.break_, var1.byte_, var1.protected_);
   }

   public rja_3 finally_() {
      return new rja_3(this.break_, this.byte_, this.protected_);
   }

   public double catch_() {
      return this.break_ * this.break_ + this.byte_ * this.byte_ + this.protected_ * this.protected_;
   }

   public double catch_(rjU_2 var1) {
      double var2 = var1.break_ - this.break_;
      double var4 = var1.protected_ - this.protected_;
      return (double)rfU_2.class_(var2 * var2 + var4 * var4);
   }

   public rjU_2 extends_() {
      return new rjU_2(this.break_, this.byte_, this.protected_);
   }

   public double case_(rjU_2 var1) {
      double var2 = var1.break_ - this.break_;
      double var4 = var1.byte_ - this.byte_;
      double var6 = var1.protected_ - this.protected_;
      return (double)rfU_2.class_(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double case_() {
      return (double)rfU_2.class_(this.break_ * this.break_ + this.byte_ * this.byte_ + this.protected_ * this.protected_);
   }

   public rjU_2 implements_() {
      return new rjU_2(Math.abs(this.break_), Math.abs(this.byte_), Math.abs(this.protected_));
   }

   public double implements_(rjU_2 var1) {
      double var2 = var1.break_ - this.break_;
      double var4 = var1.byte_ - this.byte_;
      double var6 = var1.protected_ - this.protected_;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public rjU_2 protected_() {
      double var1 = (double)rfU_2.class_(this.break_ * this.break_ + this.byte_ * this.byte_ + this.protected_ * this.protected_);
      return var1 < 1.0E-4 ? class_ : new rjU_2(this.break_ / var1, this.byte_ / var1, this.protected_ / var1);
   }

   public double protected_(double var1, double var3, double var5) {
      double var7 = var1 - this.break_;
      double var9 = var3 - this.byte_;
      double var11 = var5 - this.protected_;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public static rjU_2 protected_(rja_3 var0) {
      return new rjU_2((double)var0.b_() + 0.5, (double)var0.c_(), (double)var0.d_() + 0.5);
   }

   public rjU_2 protected_(rjU_2 var1) {
      return this.class_(var1.break_, var1.byte_, var1.protected_);
   }

   public double private_(rjU_2 var1) {
      double var2 = var1.break_ - this.break_;
      double var4 = var1.byte_ - this.byte_;
      double var6 = var1.protected_ - this.protected_;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public rjU_2 private_() {
      return new rjU_2((double)rfU_2.byte_(this.break_) + 0.5, (double)rfU_2.byte_(this.byte_) + 0.5, (double)rfU_2.byte_(this.protected_) + 0.5);
   }

   @Override
   public rjU_2 rr() {
      return this;
   }
}
