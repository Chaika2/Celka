package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.lwjgl.system.MemoryUtil;

class fn_3 extends fL_2 {
   private final SeekableByteChannel id_break;

   fn_3(SeekableByteChannel var1) {
      this.id_break = var1;
   }

   @Override
   public int id_class(long var1) {
      return super.id_class(var1) != 0 && this.id_break.isOpen() ? 1 : 0;
   }

   @Override
   public void id_class(int var1) throws IOException {
      this.id_break.position(this.id_break.position() + (long)var1);
   }

   @Override
   public void close() throws IOException {
      this.id_break.close();
   }

   @Override
   public int id_break(long var1, int var3) throws IOException {
      ByteBuffer var4 = MemoryUtil.memByteBuffer(var1, var3);
      return this.id_break.read(var4);
   }
}
