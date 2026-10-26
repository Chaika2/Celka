package celestial;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

class rAd_1 extends FilterInputStream {
   private final String id_class;
   private boolean id_break;

   public rAd_1(InputStream var1, rqO_2 var2, String var3) {
      super(var1);
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(var4));
      this.id_class = "Leaked resource: '" + var2 + "' loaded from pack: '" + var3 + "'\n" + var4;
   }

   @Override
   protected void finalize() throws Throwable {
      if (!this.id_break) {
         rAx_1.id_break.warn(this.id_class);
      }

      super.finalize();
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.id_break = true;
   }
}
