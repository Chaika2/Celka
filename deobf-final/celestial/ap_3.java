package celestial;

public class ap_3 {
   public final float class_;
   public final float break_;
   public final boolean byte_;
   public final float protected_;

   public static ap_3 byte_(float var0, float var1) {
      return new ap_3(var0, var1, true);
   }

   public ap_3(float var1, float var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var1 * 0.65F;
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.class_ + ", h=" + this.break_ + ", fixed=" + this.byte_;
   }

   public rfl_3 class_(rjU_2 var1) {
      return this.class_(var1.break_, var1.byte_, var1.protected_);
   }

   public ap_3 class_(float var1, float var2) {
      return this.byte_ || var1 == 1.0F && var2 == 1.0F ? this : break_(this.class_ * var1, this.break_ * var2);
   }

   public rfl_3 class_(double var1, double var3, double var5) {
      float var7 = this.class_ / 2.0F;
      return new rfl_3(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)this.break_, var5 + (double)var7);
   }

   public ap_3 class_(float var1) {
      return this.class_(var1, var1);
   }

   public static ap_3 break_(float var0, float var1) {
      return new ap_3(var0, var1, false);
   }
}
