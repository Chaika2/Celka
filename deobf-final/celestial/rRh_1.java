package celestial;

public class rRh_1 {
   private final rRO class_;
   private final float break_;

   public float byte_() {
      if (this.break_ < 2.0F) {
         return 0.0F;
      } else {
         return this.break_ > 4.0F ? 1.0F : (this.break_ - 2.0F) / 2.0F;
      }
   }

   public rRh_1(rRO var1, long var2, long var4, float var6) {
      this.class_ = var1;
      this.break_ = this.class_(var1, var2, var4, var6);
   }

   private float class_(rRO var1, long var2, long var4, float var6) {
      if (var1 == rRO.PEACEFUL) {
         return 0.0F;
      } else {
         boolean var7 = var1 == rRO.HARD;
         float var8 = 0.75F;
         float var9 = rfU_2.class_(((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         var8 += var9;
         float var10 = 0.0F;
         var10 += rfU_2.class_((float)var4 / 3600000.0F, 0.0F, 1.0F) * (var7 ? 1.0F : 0.75F);
         var10 += rfU_2.class_(var6 * 0.25F, 0.0F, var9);
         if (var1 == rRO.EASY) {
            var10 *= 0.5F;
         }

         var8 += var10;
         return (float)var1.class_() * var8;
      }
   }

   public boolean class_(float var1) {
      return this.break_ > var1;
   }

   public rRO class_() {
      return this.class_;
   }

   public float break_() {
      return this.break_;
   }
}
