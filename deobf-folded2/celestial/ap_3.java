package celestial;

public class ap_3 {
   public final float id_class;
   public final float id_break;
   public final boolean id_byte;
   public final float id_protected;

   public static ap_3 id_byte(float var0, float var1) {
      return new ap_3(var0, var1, true);
   }

   public ap_3(float var1, float var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var1 * 0.65F;
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.id_class + ", h=" + this.id_break + ", fixed=" + this.id_byte;
   }

   public rfl_3 id_class(rjU_2 var1) {
      return this.id_class(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public ap_3 id_class(float var1, float var2) {
      return this.id_byte || var1 == 1.0F && var2 == 1.0F ? this : id_break(this.id_class * var1, this.id_break * var2);
   }

   public rfl_3 id_class(double var1, double var3, double var5) {
      float var7 = this.id_class / 2.0F;
      return new rfl_3(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)this.id_break, var5 + (double)var7);
   }

   public ap_3 id_class(float var1) {
      return this.id_class(var1, var1);
   }

   public static ap_3 id_break(float var0, float var1) {
      return new ap_3(var0, var1, false);
   }
}
