package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrdJ {
   private static final Logger id_class = LogManager.getLogger();
   private static final String id_break = "[Shaders] ";

   public static void id_byte(String var0) {
   }

   public static void id_byte(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      id_class.info("[Shaders] " + var2);
   }

   public static void id_class(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      id_class.error("[Shaders] " + var2);
   }

   public static void id_class(String var0) {
      id_class.error("[Shaders] " + var0);
   }

   public static void id_break(String var0) {
      id_class.warn("[Shaders] " + var0);
   }

   public static void id_break(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      id_class.warn("[Shaders] " + var2);
   }

   public static void id_protected(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      id_class.debug("[Shaders] " + var2);
   }

   public static void id_protected(String var0) {
      id_class.debug("[Shaders] " + var0);
   }
}
