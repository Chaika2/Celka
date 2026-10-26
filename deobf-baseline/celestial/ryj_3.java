package celestial;

public class ryj_3 {
   public static int id_byte(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int id_class(int var0, int var1) {
      return id_class(
         id_class(var0) * id_class(var1) / 255,
         id_break(var0) * id_break(var1) / 255,
         id_byte(var0) * id_byte(var1) / 255,
         id_protected(var0) * id_protected(var1) / 255
      );
   }

   public static int id_class(int var0) {
      return var0 >>> 24;
   }

   public static int id_class(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   public static int id_break(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int id_protected(int var0) {
      return var0 & 0xFF;
   }
}
