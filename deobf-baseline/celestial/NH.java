package celestial;

import java.io.FilterInputStream;
import java.io.InputStream;

class NH extends FilterInputStream {
   NH(InputStream var1) {
      super(var1);
   }

   @Override
   public void close() {
   }
}
