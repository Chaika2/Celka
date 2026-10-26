package celestial;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.lwjgl.system.MemoryUtil;

class fA_2 extends fL_2 {
   private final ReadableByteChannel break_;
   private long byte_ = MemoryUtil.nmemAlloc(128L);
   private int protected_ = 128;
   private int throws_;
   private int case_;

   fA_2(ReadableByteChannel var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(int var1) throws IOException {
      if (var1 > 0) {
         this.break_(var1);
         if (var1 + this.case_ > this.throws_) {
            throw new EOFException("Can't skip past the EOF.");
         }
      }

      if (this.case_ + var1 < 0) {
         throw new IOException("Can't seek before the beginning: " + (this.case_ + var1));
      } else {
         this.case_ += var1;
      }
   }

   @Override
   public void close() throws IOException {
      MemoryUtil.nmemFree(this.byte_);
      this.break_.close();
   }

   private void break_(int var1) throws IOException {
      ByteBuffer var2 = MemoryUtil.memByteBuffer(this.byte_, this.protected_);
      if (var1 + this.case_ > this.protected_) {
         this.protected_ = var1 + this.case_;
         var2 = MemoryUtil.memRealloc(var2, this.protected_);
         this.byte_ = MemoryUtil.memAddress(var2);
      }

      ((Buffer)var2).position(this.throws_);

      while (var1 + this.case_ > this.throws_) {
         try {
            int var3 = this.break_.read(var2);
            if (var3 == -1) {
               break;
            }
         } finally {
            this.throws_ = var2.position();
         }
      }
   }

   @Override
   public int break_(long var1, int var3) throws IOException {
      this.break_(var3);
      if (var3 + this.case_ > this.throws_) {
         var3 = this.throws_ - this.case_;
      }

      MemoryUtil.memCopy(this.byte_ + (long)this.case_, var1, (long)var3);
      this.case_ += var3;
      return var3;
   }
}
