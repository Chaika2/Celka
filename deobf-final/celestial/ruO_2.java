package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class ruO_2 {
   private final Cipher class_;
   private byte[] break_ = new byte[0];
   private byte[] byte_ = new byte[0];

   protected ruO_2(Cipher var1) {
      this.class_ = var1;
   }

   protected void class_(ByteBuf var1, ByteBuf var2) throws ShortBufferException {
      int var3 = var1.readableBytes();
      byte[] var4 = this.class_(var1);
      int var5 = this.class_.getOutputSize(var3);
      if (this.byte_.length < var5) {
         this.byte_ = new byte[var5];
      }

      var2.writeBytes(this.byte_, 0, this.class_.update(var4, 0, var3, this.byte_));
   }

   protected ByteBuf class_(ChannelHandlerContext var1, ByteBuf var2) throws ShortBufferException {
      int var3 = var2.readableBytes();
      byte[] var4 = this.class_(var2);
      ByteBuf var5 = var1.alloc().heapBuffer(this.class_.getOutputSize(var3));
      var5.writerIndex(this.class_.update(var4, 0, var3, var5.array(), var5.arrayOffset()));
      return var5;
   }

   private byte[] class_(ByteBuf var1) {
      int var2 = var1.readableBytes();
      if (this.break_.length < var2) {
         this.break_ = new byte[var2];
      }

      var1.readBytes(this.break_, 0, var2);
      return this.break_;
   }
}
