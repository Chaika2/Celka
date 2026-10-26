package celestial;

import java.util.Random;

public class rzV_2 implements rWK {
   final float protected_;
   final float throws_;

   public float byte_() {
      return this.throws_;
   }

   public rzV_2(float var1, float var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   public rzV_2(float var1) {
      this.protected_ = var1;
      this.throws_ = var1;
   }

   @Override
   public int class_(Random var1) {
      return rfU_2.class_(var1, rfU_2.protected_(this.protected_), rfU_2.protected_(this.throws_));
   }

   @Override
   public rqO_2 class_() {
      return break_;
   }

   public boolean class_(int var1) {
      return (float)var1 <= this.throws_ && (float)var1 >= this.protected_;
   }

   public static rzV_2 class_(float var0, float var1) {
      return new rzV_2(var0, var1);
   }

   public float break_() {
      return this.protected_;
   }

   public float break_(Random var1) {
      return rfU_2.class_(var1, this.protected_, this.throws_);
   }
}
