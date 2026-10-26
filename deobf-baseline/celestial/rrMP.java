package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrMP {
   private static final Logger id_break = LogManager.getLogger();
   public static final boolean id_class = System.getProperty("log.detail", "false").equals("true");

   public static void id_byte(String var0) {
      id_break.warn("[OptiFine] " + var0);
   }

   public static void id_class(String var0, Throwable var1) {
      id_break.warn("[OptiFine] " + var0, var1);
   }

   public static void id_class(String var0) {
      if (id_class) {
         id_break.info("[OptiFine] " + var0);
      }
   }

   public static void id_break(String var0, Throwable var1) {
      id_break.error("[OptiFine] " + var0, var1);
   }

   public static void id_break(String var0) {
   }

   public static void id_throws(String var0) {
   }

   public static void id_protected(String var0) {
      id_break.error("[OptiFine] " + var0);
   }
}
