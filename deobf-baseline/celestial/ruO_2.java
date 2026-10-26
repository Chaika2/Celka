package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class ruO_2 {
   private final Cipher id_class;
   private byte[] id_break = new byte[0];
   private byte[] id_byte = new byte[0];

   protected ruO_2(Cipher var1) {
      this.id_class = var1;
   }

   protected void id_class(ByteBuf var1, ByteBuf var2) throws ShortBufferException {
      int var3 = var1.readableBytes();
      byte[] var4 = this.id_class(var1);
      int var5 = this.id_class.getOutputSize(var3);
      if (this.id_byte.length < var5) {
         this.id_byte = new byte[var5];
      }

      var2.writeBytes(this.id_byte, 0, this.id_class.update(var4, 0, var3, this.id_byte));
   }

   protected ByteBuf id_class(ChannelHandlerContext var1, ByteBuf var2) throws ShortBufferException {
      int var3 = var2.readableBytes();
      byte[] var4 = this.id_class(var2);
      ByteBuf var5 = var1.alloc().heapBuffer(this.id_class.getOutputSize(var3));
      var5.writerIndex(this.id_class.update(var4, 0, var3, var5.array(), var5.arrayOffset()));
      return var5;
   }

   private byte[] id_class(ByteBuf var1) {
      int var2 = var1.readableBytes();
      if (this.id_break.length < var2) {
         this.id_break = new byte[var2];
      }

      var1.readBytes(this.id_break, 0, var2);
      return this.id_break;
   }
}
