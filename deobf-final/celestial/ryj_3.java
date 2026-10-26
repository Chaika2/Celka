package celestial;

public class ryj_3 {
   public static int byte_(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int class_(int var0, int var1) {
      return class_(
         class_(var0) * class_(var1) / 255, break_(var0) * break_(var1) / 255, byte_(var0) * byte_(var1) / 255, protected_(var0) * protected_(var1) / 255
      );
   }

   public static int class_(int var0) {
      return var0 >>> 24;
   }

   public static int class_(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   public static int break_(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int protected_(int var0) {
      return var0 & 0xFF;
   }
}
