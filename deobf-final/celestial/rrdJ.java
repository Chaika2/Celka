package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrdJ {
   private static final Logger class_ = LogManager.getLogger();
   private static final String break_ = "[Shaders] ";

   public static void byte_(String var0) {
   }

   public static void byte_(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      class_.info("[Shaders] " + var2);
   }

   public static void class_(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      class_.error("[Shaders] " + var2);
   }

   public static void class_(String var0) {
      class_.error("[Shaders] " + var0);
   }

   public static void break_(String var0) {
      class_.warn("[Shaders] " + var0);
   }

   public static void break_(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      class_.warn("[Shaders] " + var2);
   }

   public static void protected_(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      class_.debug("[Shaders] " + var2);
   }

   public static void protected_(String var0) {
      class_.debug("[Shaders] " + var0);
   }
}
