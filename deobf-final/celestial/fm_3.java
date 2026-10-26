package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.lwjgl.stb.STBIWriteCallback;

class fm_3 extends STBIWriteCallback {
   private final WritableByteChannel class_;
   private IOException break_;

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer var6 = getData(var3, var5);

      try {
         this.class_.write(var6);
      } catch (IOException var8) {
         this.break_ = var8;
      }
   }

   fm_3(WritableByteChannel var1) {
      this.class_ = var1;
   }

   public void class_() throws IOException {
      if (this.break_ != null) {
         throw this.break_;
      }
   }
}
