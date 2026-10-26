package celestial;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.lwjgl.system.MemoryUtil;

class fA_2 extends fL_2 {
   private final ReadableByteChannel id_break;
   private long id_byte = MemoryUtil.nmemAlloc(128L);
   private int id_protected = 128;
   private int id_throws;
   private int id_case;

   fA_2(ReadableByteChannel var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(int var1) throws IOException {
      if (var1 > 0) {
         this.id_break(var1);
         if (var1 + this.id_case > this.id_throws) {
            throw new EOFException("Can't skip past the EOF.");
         }
      }

      if (this.id_case + var1 < 0) {
         throw new IOException("Can't seek before the beginning: " + (this.id_case + var1));
      } else {
         this.id_case += var1;
      }
   }

   @Override
   public void close() throws IOException {
      MemoryUtil.nmemFree(this.id_byte);
      this.id_break.close();
   }

   private void id_break(int var1) throws IOException {
      ByteBuffer var2 = MemoryUtil.memByteBuffer(this.id_byte, this.id_protected);
      if (var1 + this.id_case > this.id_protected) {
         this.id_protected = var1 + this.id_case;
         var2 = MemoryUtil.memRealloc(var2, this.id_protected);
         this.id_byte = MemoryUtil.memAddress(var2);
      }

      ((Buffer)var2).position(this.id_throws);

      while (var1 + this.id_case > this.id_throws) {
         try {
            int var3 = this.id_break.read(var2);
            if (var3 == -1) {
               break;
            }
         } finally {
            this.id_throws = var2.position();
         }
      }
   }

   @Override
   public int id_break(long var1, int var3) throws IOException {
      this.id_break(var3);
      if (var3 + this.id_case > this.id_throws) {
         var3 = this.id_throws - this.id_case;
      }

      MemoryUtil.memCopy(this.id_byte + (long)this.id_case, var1, (long)var3);
      this.id_case += var3;
      return var3;
   }
}
