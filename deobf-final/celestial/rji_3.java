package celestial;

public class rji_3 {
   public static final rji_3 class_ = new rji_3(0.0F, 0.0F, 0.0F, 0.0F);
   private float break_;
   private float byte_;
   private float protected_;
   private float throws_;

   public float byte_() {
      return this.protected_;
   }

   public rji_3() {
   }

   public rji_3(rje_3 var1) {
      this(var1.class_(), var1.break_(), var1.byte_(), 1.0F);
   }

   public rji_3(float var1, float var2, float var3, float var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rji_3 var2 = (rji_3)var1;
         if (Float.compare(var2.break_, this.break_) != 0) {
            return false;
         } else if (Float.compare(var2.byte_, this.byte_) != 0) {
            return false;
         } else {
            return Float.compare(var2.protected_, this.protected_) != 0 ? false : Float.compare(var2.throws_, this.throws_) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.break_ + ", " + this.byte_ + ", " + this.protected_ + ", " + this.throws_ + "]";
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.break_);
      var1 = 31 * var1 + Float.floatToIntBits(this.byte_);
      var1 = 31 * var1 + Float.floatToIntBits(this.protected_);
      return 31 * var1 + Float.floatToIntBits(this.throws_);
   }

   public void class_(rjV_2 var1) {
      float var2 = this.break_;
      float var3 = this.byte_;
      float var4 = this.protected_;
      float var5 = this.throws_;
      this.break_ = var1.class_ * var2 + var1.break_ * var3 + var1.byte_ * var4 + var1.protected_ * var5;
      this.byte_ = var1.throws_ * var2 + var1.case_ * var3 + var1.catch_ * var4 + var1.private_ * var5;
      this.protected_ = var1.implements_ * var2 + var1.finally_ * var3 + var1.extends_ * var4 + var1.native_ * var5;
      this.throws_ = var1.volatile_ * var2 + var1.final_ * var3 + var1.package_ * var4 + var1.int_ * var5;
   }

   public float class_(rji_3 var1) {
      return this.break_ * var1.break_ + this.byte_ * var1.byte_ + this.protected_ * var1.protected_ + this.throws_ * var1.throws_;
   }

   public void class_(rjY_2 var1) {
      rjY_2 var2 = new rjY_2(var1);
      var2.class_(new rjY_2(this.class_(), this.break_(), this.byte_(), 0.0F));
      rjY_2 var3 = new rjY_2(var1);
      var3.throws_();
      var2.class_(var3);
      this.class_(var2.class_(), var2.break_(), var2.byte_(), this.protected_());
   }

   public void class_(rje_3 var1) {
      this.break_ = this.break_ * var1.class_();
      this.byte_ = this.byte_ * var1.break_();
      this.protected_ = this.protected_ * var1.byte_();
   }

   public float class_() {
      return this.break_;
   }

   public void class_(float var1) {
      float var2 = 1.0F / var1;
      this.break_ *= var2;
      this.byte_ *= var2;
      this.protected_ *= var2;
      this.throws_ *= var2;
   }

   public void class_(float var1, float var2, float var3, float var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public float break_() {
      return this.byte_;
   }

   public boolean throws_() {
      float var1 = this.break_ * this.break_ + this.byte_ * this.byte_ + this.protected_ * this.protected_ + this.throws_ * this.throws_;
      if ((double)var1 < 1.0E-5) {
         return false;
      } else {
         float var2 = rfU_2.implements_(var1);
         this.break_ *= var2;
         this.byte_ *= var2;
         this.protected_ *= var2;
         this.throws_ *= var2;
         return true;
      }
   }

   public void case_() {
      this.break_ = this.break_ / this.throws_;
      this.byte_ = this.byte_ / this.throws_;
      this.protected_ = this.protected_ / this.throws_;
      this.throws_ = 1.0F;
   }

   public float protected_() {
      return this.throws_;
   }
}
