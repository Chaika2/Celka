package celestial;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class NC implements Nz_1 {
   private final Nl_1 id_class;
   private Nz_1 id_break;
   private final BufferedInputStream id_byte;

   public NC(Nl_1 var1, InputStream var2) throws IOException {
      this.id_class = var1;
      this.id_byte = new BufferedInputStream(var2);
      this.id_byte.mark(Integer.MAX_VALUE);
      this.id_break = var1.create(new NH(this.id_byte));
   }

   @Override
   public ByteBuffer id_class(int var1) throws IOException {
      ByteBuffer var2 = this.id_break.id_class(var1);
      if (!var2.hasRemaining()) {
         this.id_break.close();
         this.id_byte.reset();
         this.id_break = this.id_class.create(new NH(this.id_byte));
         var2 = this.id_break.id_class(var1);
      }

      return var2;
   }

   @Override
   public AudioFormat id_class() {
      return this.id_break.id_class();
   }

   @Override
   public void close() throws IOException {
      this.id_break.close();
      this.id_byte.close();
   }
}
