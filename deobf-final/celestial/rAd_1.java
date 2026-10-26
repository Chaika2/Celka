package celestial;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

class rAd_1 extends FilterInputStream {
   private final String class_;
   private boolean break_;

   public rAd_1(InputStream var1, rqO_2 var2, String var3) {
      super(var1);
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(var4));
      this.class_ = "Leaked resource: '" + var2 + "' loaded from pack: '" + var3 + "'\n" + var4;
   }

   @Override
   protected void finalize() throws Throwable {
      if (!this.break_) {
         rAx_1.break_.warn(this.class_);
      }

      super.finalize();
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.break_ = true;
   }
}
