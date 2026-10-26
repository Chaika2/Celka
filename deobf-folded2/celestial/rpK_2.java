package celestial;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rpK_2 extends PrintStream {
   protected static final Logger id_class = LogManager.getLogger();
   protected final String id_break;

   public rpK_2(String var1, OutputStream var2) {
      super(var2);
      this.id_break = var1;
   }

   @Override
   public void println(String var1) {
      this.id_class(var1);
   }

   @Override
   public void println(Object var1) {
      this.id_class(String.valueOf(var1));
   }

   protected void id_class(String var1) {
      id_class.info("[{}]: {}", this.id_break, var1);
   }
}
