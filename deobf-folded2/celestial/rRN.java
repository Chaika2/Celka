package celestial;

public class rRN {
   private static int[] id_class = new int[65536];

   public static int id_byte() {
      return 4764952;
   }

   public static int id_class() {
      return 6396257;
   }

   public static void id_class(int[] var0) {
      id_class = var0;
   }

   public static int id_class(double var0, double var2) {
      var2 *= var0;
      int var4 = (int)((1.0 - var0) * 255.0);
      int var5 = (int)((1.0 - var2) * 255.0);
      return id_class[var5 << 8 | var4];
   }

   public static int id_break() {
      return 8431445;
   }
}
