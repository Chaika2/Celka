package celestial;

public class wP_2 {
   public static float id_class(float var0, float var1, float var2) {
      float var3 = var1 - var0;

      while (var3 < (float) -Math.PI) {
         var3 += (float) (Math.PI * 2);
      }

      while (var3 >= (float) Math.PI) {
         var3 -= (float) (Math.PI * 2);
      }

      return var0 + var2 * var3;
   }
}
