package celestial;

public class rrWX {
   public static int class_(float var0) {
      return Float.hashCode(var0);
   }

   public static int class_(int var0) {
      return var0;
   }

   public static int class_(Object var0, Object var1) {
      return 31 * class_(var0) + class_(var1);
   }

   public static int class_(boolean var0) {
      return Boolean.hashCode(var0);
   }

   public static int class_(Object var0) {
      return var0 == null ? 0 : var0.hashCode();
   }

   public static int class_(int var0, float var1) {
      return 31 * class_(var0) + class_(var1);
   }

   public static int class_(float var0, float var1) {
      return 31 * class_(var0) + class_(var1);
   }

   public static int class_(boolean var0, boolean var1) {
      return 31 * class_(var0) + class_(var1);
   }

   public static int class_(int var0, Object var1) {
      return 31 * class_(var0) + class_(var1);
   }

   public static int class_(Object var0, boolean var1) {
      return 31 * class_(var0) + class_(var1);
   }
}
