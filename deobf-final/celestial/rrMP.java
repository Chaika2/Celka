package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrMP {
   private static final Logger break_ = LogManager.getLogger();
   public static final boolean class_ = System.getProperty("log.detail", "false").equals("true");

   public static void byte_(String var0) {
      break_.warn("[OptiFine] " + var0);
   }

   public static void class_(String var0, Throwable var1) {
      break_.warn("[OptiFine] " + var0, var1);
   }

   public static void class_(String var0) {
      if (class_) {
         break_.info("[OptiFine] " + var0);
      }
   }

   public static void break_(String var0, Throwable var1) {
      break_.error("[OptiFine] " + var0, var1);
   }

   public static void break_(String var0) {
   }

   public static void throws_(String var0) {
   }

   public static void protected_(String var0) {
      break_.error("[OptiFine] " + var0);
   }
}
