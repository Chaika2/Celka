package celestial;

public class rRH {
   private static int[] id_class = new int[65536];

   public static void id_class(int[] var0) {
      id_class = var0;
   }

   public static int id_class(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0 - var0) * 255.0);
      int var5 = (int)((1.0 - var2) * 255.0);
      int var6 = var5 << 8 | var4;
      return var6 > id_class.length ? -65281 : id_class[var6];
   }
}
