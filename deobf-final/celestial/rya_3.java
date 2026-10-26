package celestial;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class rya_3 implements UncaughtExceptionHandler {
   private final Logger class_;

   public rya_3(Logger var1) {
      this.class_ = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.class_.error("Caught previously unhandled exception :", var2);
   }
}
