package celestial;

public class rrzP_2 {
   public static float id_class(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static int id_class(int var0, int var1) {
      int var2 = var0 % var1;
      if (var2 < 0) {
         var2 += var1;
      }

      return var2;
   }
}
