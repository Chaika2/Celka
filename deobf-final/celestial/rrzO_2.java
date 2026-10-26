package celestial;

public class rrzO_2 {
   private float class_;
   private float break_;
   private float byte_;
   private long protected_;

   public float byte_() {
      return this.byte_;
   }

   public rrzO_2(float var1, float var2) {
      this(var1, var2, var2);
   }

   public rrzO_2(float var1, float var2, float var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = System.currentTimeMillis();
   }

   public static float class_(float var0, float var1, float var2, float var3) {
      if (var2 <= 0.0F) {
         return var0;
      } else {
         float var4 = var1 - var0;
         float var5;
         if (var3 > 0.0F && var2 < var3 && Math.abs(var4) > 1.0E-6F) {
            float var6 = var3 / var2;
            float var7 = 4.61F;
            float var8 = 0.13F;
            float var9 = 10.0F;
            float var10 = var7 - 1.0F / (var8 + var6 / var9);
            float var11 = var2 / var3 * var10;
            var11 = rrzP_2.class_(var11, 0.0F, 1.0F);
            var5 = var0 + var4 * var11;
         } else {
            var5 = var1;
         }

         return var5;
      }
   }

   public float class_(float var1) {
      long var2 = System.currentTimeMillis();
      float var4 = this.class_;
      long var5 = this.protected_;
      float var7 = (float)(var2 - var5) / 1000.0F;
      float var8 = var1 >= var4 ? this.break_ : this.byte_;
      float var9 = class_(var4, var1, var7, var8);
      this.class_ = var9;
      this.protected_ = var2;
      return var9;
   }

   public float class_(float var1, float var2, float var3) {
      this.break_ = var2;
      this.byte_ = var3;
      return this.class_(var1);
   }

   public float class_() {
      return this.class_;
   }

   public float break_() {
      return this.break_;
   }

   public long protected_() {
      return this.protected_;
   }
}
