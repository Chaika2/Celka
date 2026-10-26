package celestial;

public class rrWX {
   public static int id_class(float var0) {
      return Float.hashCode(var0);
   }

   public static int id_class(int var0) {
      return var0;
   }

   public static int id_class(Object var0, Object var1) {
      return 31 * id_class(var0) + id_class(var1);
   }

   public static int id_class(boolean var0) {
      return Boolean.hashCode(var0);
   }

   public static int id_class(Object var0) {
      return var0 == null ? 0 : var0.hashCode();
   }

   public static int id_class(int var0, float var1) {
      return 31 * id_class(var0) + id_class(var1);
   }

   public static int id_class(float var0, float var1) {
      return 31 * id_class(var0) + id_class(var1);
   }

   public static int id_class(boolean var0, boolean var1) {
      return 31 * id_class(var0) + id_class(var1);
   }

   public static int id_class(int var0, Object var1) {
      return 31 * id_class(var0) + id_class(var1);
   }

   public static int id_class(Object var0, boolean var1) {
      return 31 * id_class(var0) + id_class(var1);
   }
}
