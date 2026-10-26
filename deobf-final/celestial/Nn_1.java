package celestial;

import com.google.common.collect.Lists;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

class Nn_1 {
   private final List<ByteBuffer> class_ = Lists.newArrayList();
   private final int break_;
   int byte_;
   private ByteBuffer protected_;

   public Nn_1(int var1) {
      this.break_ = var1 + 1 & -2;
      this.break_();
   }

   public ByteBuffer class_() {
      ((Buffer)this.protected_).flip();
      if (this.class_.isEmpty()) {
         return this.protected_;
      } else {
         ByteBuffer var1 = BufferUtils.createByteBuffer(this.byte_);
         this.class_.forEach(var1::put);
         var1.put(this.protected_);
         ((Buffer)var1).flip();
         return var1;
      }
   }

   public void class_(float var1) {
      if (this.protected_.remaining() == 0) {
         ((Buffer)this.protected_).flip();
         this.class_.add(this.protected_);
         this.break_();
      }

      int var2 = rfU_2.class_((int)(var1 * 32767.5F - 0.5F), -32768, 32767);
      this.protected_.putShort((short)var2);
      this.byte_ += 2;
   }

   private void break_() {
      this.protected_ = BufferUtils.createByteBuffer(this.break_);
   }
}
