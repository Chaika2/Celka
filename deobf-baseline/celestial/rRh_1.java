package celestial;

public class rRh_1 {
   private final rRO id_class;
   private final float id_break;

   public float id_byte() {
      if (this.id_break < 2.0F) {
         return 0.0F;
      } else {
         return this.id_break > 4.0F ? 1.0F : (this.id_break - 2.0F) / 2.0F;
      }
   }

   public rRh_1(rRO var1, long var2, long var4, float var6) {
      this.id_class = var1;
      this.id_break = this.id_class(var1, var2, var4, var6);
   }

   private float id_class(rRO var1, long var2, long var4, float var6) {
      if (var1 == rRO.PEACEFUL) {
         return 0.0F;
      } else {
         boolean var7 = var1 == rRO.HARD;
         float var8 = 0.75F;
         float var9 = rfU_2.id_class(((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         var8 += var9;
         float var10 = 0.0F;
         var10 += rfU_2.id_class((float)var4 / 3600000.0F, 0.0F, 1.0F) * (var7 ? 1.0F : 0.75F);
         var10 += rfU_2.id_class(var6 * 0.25F, 0.0F, var9);
         if (var1 == rRO.EASY) {
            var10 *= 0.5F;
         }

         var8 += var10;
         return (float)var1.id_class() * var8;
      }
   }

   public boolean id_class(float var1) {
      return this.id_break > var1;
   }

   public rRO id_class() {
      return this.id_class;
   }

   public float id_break() {
      return this.id_break;
   }
}
