package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.lwjgl.stb.STBIWriteCallback;

class fm_3 extends STBIWriteCallback {
   private final WritableByteChannel id_class;
   private IOException id_break;

   public void invoke(long var1, long var3, int var5) {
      ByteBuffer var6 = getData(var3, var5);

      try {
         this.id_class.write(var6);
      } catch (IOException var8) {
         this.id_break = var8;
      }
   }

   fm_3(WritableByteChannel var1) {
      this.id_class = var1;
   }

   public void id_class() throws IOException {
      if (this.id_break != null) {
         throw this.id_break;
      }
   }
}
