package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.lwjgl.system.MemoryUtil;

class fn_3 extends fL_2 {
   private final SeekableByteChannel break_;

   fn_3(SeekableByteChannel var1) {
      this.break_ = var1;
   }

   @Override
   public int class_(long var1) {
      return super.class_(var1) != 0 && this.break_.isOpen() ? 1 : 0;
   }

   @Override
   public void class_(int var1) throws IOException {
      this.break_.position(this.break_.position() + (long)var1);
   }

   @Override
   public void close() throws IOException {
      this.break_.close();
   }

   @Override
   public int break_(long var1, int var3) throws IOException {
      ByteBuffer var4 = MemoryUtil.memByteBuffer(var1, var3);
      return this.break_.read(var4);
   }
}
