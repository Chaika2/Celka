package celestial;

import java.io.OutputStream;

public class rnk_3 extends rpK_2 {
   public rnk_3(String var1, OutputStream var2) {
      super(var1, var2);
   }

   @Override
   protected void id_class(String var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      StackTraceElement var3 = var2[Math.min(3, var2.length)];
      id_class.info("[{}]@.({}:{}): {}", this.id_break, var3.getFileName(), var3.getLineNumber(), var1);
   }
}
