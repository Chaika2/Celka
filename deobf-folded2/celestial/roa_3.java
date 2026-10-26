package celestial;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

class roa_3 extends ByteArrayOutputStream {
   private final rfj_3 id_break;

   public roa_3(roe_3 var1, rfj_3 var2) {
      super(8096);
      this.id_class = var1;
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(0);
      super.write(var1.id_case.id_class());
      this.id_break = var2;
   }

   @Override
   public void close() throws IOException {
      ByteBuffer var1 = ByteBuffer.wrap(this.buf, 0, this.count);
      var1.putInt(0, this.count - 5 + 1);
      this.id_class.id_class(this.id_break, var1);
   }
}
