package celestial;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class rya_3 implements UncaughtExceptionHandler {
   private final Logger id_class;

   public rya_3(Logger var1) {
      this.id_class = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.id_class.error("Caught previously unhandled exception :", var2);
   }
}
