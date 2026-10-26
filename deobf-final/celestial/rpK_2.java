package celestial;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rpK_2 extends PrintStream {
   protected static final Logger class_ = LogManager.getLogger();
   protected final String break_;

   public rpK_2(String var1, OutputStream var2) {
      super(var2);
      this.break_ = var1;
   }

   @Override
   public void println(String var1) {
      this.class_(var1);
   }

   @Override
   public void println(Object var1) {
      this.class_(String.valueOf(var1));
   }

   protected void class_(String var1) {
      class_.info("[{}]: {}", this.break_, var1);
   }
}
