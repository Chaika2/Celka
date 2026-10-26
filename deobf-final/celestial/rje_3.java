package celestial;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class rje_3 {
   public static rje_3 class_ = new rje_3(-1.0F, 0.0F, 0.0F);
   public static rje_3 break_ = new rje_3(1.0F, 0.0F, 0.0F);
   public static rje_3 byte_ = new rje_3(0.0F, -1.0F, 0.0F);
   public static rje_3 protected_ = new rje_3(0.0F, 1.0F, 0.0F);
   public static rje_3 throws_ = new rje_3(0.0F, 0.0F, -1.0F);
   public static rje_3 case_ = new rje_3(0.0F, 0.0F, 1.0F);
   public float catch_;
   public float private_;
   public float implements_;

   public void byte_(float var1, float var2, float var3) {
      this.catch_ += var1;
      this.private_ += var2;
      this.implements_ += var3;
   }

   public float byte_() {
      return this.implements_;
   }

   public rjY_2 byte_(float var1) {
      return new rjY_2(this, var1, true);
   }

   public float byte_(rje_3 var1) {
      return this.catch_ * var1.catch_ + this.private_ * var1.private_ + this.implements_ * var1.implements_;
   }

   public rje_3() {
   }

   public rje_3(float var1, float var2, float var3) {
      this.catch_ = var1;
      this.private_ = var2;
      this.implements_ = var3;
   }

   public rje_3(rjU_2 var1) {
      this((float)var1.break_, (float)var1.byte_, (float)var1.protected_);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rje_3 var2 = (rje_3)var1;
         if (Float.compare(var2.catch_, this.catch_) != 0) {
            return false;
         } else {
            return Float.compare(var2.private_, this.private_) != 0 ? false : Float.compare(var2.implements_, this.implements_) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.catch_ + ", " + this.private_ + ", " + this.implements_ + "]";
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.catch_);
      var1 = 31 * var1 + Float.floatToIntBits(this.private_);
      return 31 * var1 + Float.floatToIntBits(this.implements_);
   }

   public float class_() {
      return this.catch_;
   }

   public void class_(rjY_2 var1) {
      rjY_2 var2 = new rjY_2(var1);
      var2.class_(new rjY_2(this.class_(), this.break_(), this.byte_(), 0.0F));
      rjY_2 var3 = new rjY_2(var1);
      var3.throws_();
      var2.class_(var3);
      this.break_(var2.class_(), var2.break_(), var2.byte_());
   }

   public void class_(rje_3 var1, float var2) {
      float var3 = 1.0F - var2;
      this.catch_ = this.catch_ * var3 + var1.catch_ * var2;
      this.private_ = this.private_ * var3 + var1.private_ * var2;
      this.implements_ = this.implements_ * var3 + var1.implements_ * var2;
   }

   public void class_(rjj_3 var1) {
      float var2 = this.catch_;
      float var3 = this.private_;
      float var4 = this.implements_;
      this.catch_ = var1.class_ * var2 + var1.break_ * var3 + var1.byte_ * var4;
      this.private_ = var1.protected_ * var2 + var1.throws_ * var3 + var1.case_ * var4;
      this.implements_ = var1.catch_ * var2 + var1.private_ * var3 + var1.implements_ * var4;
   }

   public void class_(float var1) {
      this.catch_ *= var1;
      this.private_ *= var1;
      this.implements_ *= var1;
   }

   public void class_(float var1, float var2, float var3) {
      this.catch_ *= var1;
      this.private_ *= var2;
      this.implements_ *= var3;
   }

   public void class_(float var1, float var2) {
      this.catch_ = rfU_2.class_(this.catch_, var1, var2);
      this.private_ = rfU_2.class_(this.private_, var1, var2);
      this.implements_ = rfU_2.class_(this.implements_, var1, var2);
   }

   public void class_(Float2FloatFunction var1) {
      this.catch_ = var1.get(this.catch_);
      this.private_ = var1.get(this.private_);
      this.implements_ = var1.get(this.implements_);
   }

   public void class_(rje_3 var1) {
      this.catch_ = this.catch_ + var1.catch_;
      this.private_ = this.private_ + var1.private_;
      this.implements_ = this.implements_ + var1.implements_;
   }

   public rjY_2 break_(float var1) {
      return new rjY_2(this, var1, false);
   }

   public float break_() {
      return this.private_;
   }

   public void break_(float var1, float var2, float var3) {
      this.catch_ = var1;
      this.private_ = var2;
      this.implements_ = var3;
   }

   public void break_(rje_3 var1) {
      this.catch_ = this.catch_ - var1.catch_;
      this.private_ = this.private_ - var1.private_;
      this.implements_ = this.implements_ - var1.implements_;
   }

   public rje_3 throws_() {
      return new rje_3(this.catch_, this.private_, this.implements_);
   }

   public rje_3 protected_(float var1, float var2, float var3) {
      this.catch_ -= var1;
      this.private_ -= var2;
      this.implements_ -= var3;
      return this;
   }

   public boolean protected_() {
      float var1 = this.catch_ * this.catch_ + this.private_ * this.private_ + this.implements_ * this.implements_;
      if ((double)var1 < 1.0E-5) {
         return false;
      } else {
         float var2 = rfU_2.implements_(var1);
         this.catch_ *= var2;
         this.private_ *= var2;
         this.implements_ *= var2;
         return true;
      }
   }

   public void protected_(rje_3 var1) {
      float var2 = this.catch_;
      float var3 = this.private_;
      float var4 = this.implements_;
      float var5 = var1.class_();
      float var6 = var1.break_();
      float var7 = var1.byte_();
      this.catch_ = var3 * var7 - var4 * var6;
      this.private_ = var4 * var5 - var2 * var7;
      this.implements_ = var2 * var6 - var3 * var5;
   }
}
