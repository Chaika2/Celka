package celestial;

public class rrzb_3 {
   public static double id_class(int var0) {
      double var1 = (double)var0 / 4096.0;
      var1 *= 0.995;
      double var3 = var1 * 2.0 - 1.0;
      var3 = rfU_2.id_class(var3, -1.0, 1.0);
      return (double)rfU_2.id_class(1.0 - var3 * var3);
   }

   public static int id_class(yQ_2 var0) {
      roQ_2[] var1 = var0.id_volatile().id_byte();
      if (var1 == null) {
         return 0;
      } else {
         int var2 = var0.id_throws().c_() >> 4;
         roQ_2 var3 = var1[var2];
         return var3 == null ? 0 : var3.id_extends();
      }
   }

   public static double id_break(yQ_2 var0) {
      int var1 = id_class(var0);
      return id_class(var1);
   }
}
