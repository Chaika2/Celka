package celestial;

public class rrzO_2 {
   private float id_class;
   private float id_break;
   private float id_byte;
   private long id_protected;

   public float id_byte() {
      return this.id_byte;
   }

   public rrzO_2(float var1, float var2) {
      this(var1, var2, var2);
   }

   public rrzO_2(float var1, float var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = System.currentTimeMillis();
   }

   public static float id_class(float var0, float var1, float var2, float var3) {
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
            var11 = rrzP_2.id_class(var11, 0.0F, 1.0F);
            var5 = var0 + var4 * var11;
         } else {
            var5 = var1;
         }

         return var5;
      }
   }

   public float id_class(float var1) {
      long var2 = System.currentTimeMillis();
      float var4 = this.id_class;
      long var5 = this.id_protected;
      float var7 = (float)(var2 - var5) / 1000.0F;
      float var8 = var1 >= var4 ? this.id_break : this.id_byte;
      float var9 = id_class(var4, var1, var7, var8);
      this.id_class = var9;
      this.id_protected = var2;
      return var9;
   }

   public float id_class(float var1, float var2, float var3) {
      this.id_break = var2;
      this.id_byte = var3;
      return this.id_class(var1);
   }

   public float id_class() {
      return this.id_class;
   }

   public float id_break() {
      return this.id_break;
   }

   public long id_protected() {
      return this.id_protected;
   }
}
