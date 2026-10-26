package celestial;

public class rRH {
   private static int[] class_ = new int[65536];

   public static void class_(int[] var0) {
      class_ = var0;
   }

   public static int class_(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0 - var0) * 255.0);
      int var5 = (int)((1.0 - var2) * 255.0);
      int var6 = var5 << 8 | var4;
      return var6 > class_.length ? -65281 : class_[var6];
   }
}
