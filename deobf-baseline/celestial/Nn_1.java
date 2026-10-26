package celestial;

import com.google.common.collect.Lists;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

class Nn_1 {
   private final List<ByteBuffer> id_class = Lists.newArrayList();
   private final int id_break;
   int id_byte;
   private ByteBuffer id_protected;

   public Nn_1(int var1) {
      this.id_break = var1 + 1 & -2;
      this.id_break();
   }

   public ByteBuffer id_class() {
      ((Buffer)this.id_protected).flip();
      if (this.id_class.isEmpty()) {
         return this.id_protected;
      } else {
         ByteBuffer var1 = BufferUtils.createByteBuffer(this.id_byte);
         this.id_class.forEach(var1::put);
         var1.put(this.id_protected);
         ((Buffer)var1).flip();
         return var1;
      }
   }

   public void id_class(float var1) {
      if (this.id_protected.remaining() == 0) {
         ((Buffer)this.id_protected).flip();
         this.id_class.add(this.id_protected);
         this.id_break();
      }

      int var2 = rfU_2.id_class((int)(var1 * 32767.5F - 0.5F), -32768, 32767);
      this.id_protected.putShort((short)var2);
      this.id_byte += 2;
   }

   private void id_break() {
      this.id_protected = BufferUtils.createByteBuffer(this.id_break);
   }
}
