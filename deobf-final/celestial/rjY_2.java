package celestial;

public final class rjY_2 {
   public static final rjY_2 class_ = new rjY_2(0.0F, 0.0F, 0.0F, 1.0F);
   private float break_;
   private float byte_;
   private float protected_;
   private float throws_;

   private static float byte_(float var0) {
      return (float)Math.sin((double)var0);
   }

   public float byte_() {
      return this.protected_;
   }

   public rjY_2(float var1, float var2, float var3, float var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public rjY_2(rjY_2 var1) {
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
   }

   public rjY_2(float var1, float var2, float var3, boolean var4) {
      if (var4) {
         var1 *= (float) (Math.PI / 180.0);
         var2 *= (float) (Math.PI / 180.0);
         var3 *= (float) (Math.PI / 180.0);
      }

      float var5 = byte_(0.5F * var1);
      float var6 = break_(0.5F * var1);
      float var7 = byte_(0.5F * var2);
      float var8 = break_(0.5F * var2);
      float var9 = byte_(0.5F * var3);
      float var10 = break_(0.5F * var3);
      this.break_ = var5 * var8 * var10 + var6 * var7 * var9;
      this.byte_ = var6 * var7 * var10 - var5 * var8 * var9;
      this.protected_ = var5 * var7 * var10 + var6 * var8 * var9;
      this.throws_ = var6 * var8 * var10 - var5 * var7 * var9;
   }

   public rjY_2(rje_3 var1, float var2, boolean var3) {
      if (var3) {
         var2 *= (float) (Math.PI / 180.0);
      }

      float var4 = byte_(var2 / 2.0F);
      this.break_ = var1.class_() * var4;
      this.byte_ = var1.break_() * var4;
      this.protected_ = var1.byte_() * var4;
      this.throws_ = break_(var2 / 2.0F);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rjY_2 var2 = (rjY_2)var1;
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
      StringBuilder var1 = new StringBuilder();
      var1.append("Quaternion[").append(this.protected_()).append(" + ");
      var1.append(this.class_()).append("i + ");
      var1.append(this.break_()).append("j + ");
      var1.append(this.byte_()).append("k]");
      return var1.toString();
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.break_);
      var1 = 31 * var1 + Float.floatToIntBits(this.byte_);
      var1 = 31 * var1 + Float.floatToIntBits(this.protected_);
      return 31 * var1 + Float.floatToIntBits(this.throws_);
   }

   public void class_(float var1) {
      this.break_ *= var1;
      this.byte_ *= var1;
      this.protected_ *= var1;
      this.throws_ *= var1;
   }

   public void class_(float var1, float var2, float var3, float var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public float class_() {
      return this.break_;
   }

   public void class_(rjY_2 var1) {
      float var2 = this.class_();
      float var3 = this.break_();
      float var4 = this.byte_();
      float var5 = this.protected_();
      float var6 = var1.class_();
      float var7 = var1.break_();
      float var8 = var1.byte_();
      float var9 = var1.protected_();
      this.break_ = var5 * var6 + var2 * var9 + var3 * var8 - var4 * var7;
      this.byte_ = var5 * var7 - var2 * var8 + var3 * var9 + var4 * var6;
      this.protected_ = var5 * var8 + var2 * var7 - var3 * var6 + var4 * var9;
      this.throws_ = var5 * var9 - var2 * var6 - var3 * var7 - var4 * var8;
   }

   public float break_() {
      return this.byte_;
   }

   private static float break_(float var0) {
      return (float)Math.cos((double)var0);
   }

   public void throws_() {
      this.break_ = -this.break_;
      this.byte_ = -this.byte_;
      this.protected_ = -this.protected_;
   }

   public rjY_2 catch_() {
      return new rjY_2(this);
   }

   public void case_() {
      float var1 = this.class_() * this.class_() + this.break_() * this.break_() + this.byte_() * this.byte_() + this.protected_() * this.protected_();
      if (var1 > 1.0E-6F) {
         float var2 = rfU_2.implements_(var1);
         this.break_ *= var2;
         this.byte_ *= var2;
         this.protected_ *= var2;
         this.throws_ *= var2;
      } else {
         this.break_ = 0.0F;
         this.byte_ = 0.0F;
         this.protected_ = 0.0F;
         this.throws_ = 0.0F;
      }
   }

   public float protected_() {
      return this.throws_;
   }
}
