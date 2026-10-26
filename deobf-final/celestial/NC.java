package celestial;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class NC implements Nz_1 {
   private final Nl_1 class_;
   private Nz_1 break_;
   private final BufferedInputStream byte_;

   public NC(Nl_1 var1, InputStream var2) throws IOException {
      this.class_ = var1;
      this.byte_ = new BufferedInputStream(var2);
      this.byte_.mark(Integer.MAX_VALUE);
      this.break_ = var1.create(new NH(this.byte_));
   }

   @Override
   public ByteBuffer class_(int var1) throws IOException {
      ByteBuffer var2 = this.break_.class_(var1);
      if (!var2.hasRemaining()) {
         this.break_.close();
         this.byte_.reset();
         this.break_ = this.class_.create(new NH(this.byte_));
         var2 = this.break_.class_(var1);
      }

      return var2;
   }

   @Override
   public AudioFormat class_() {
      return this.break_.class_();
   }

   @Override
   public void close() throws IOException {
      this.break_.close();
      this.byte_.close();
   }
}
