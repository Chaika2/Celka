package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class ruG_2 extends MessageToByteEncoder<ByteBuf> {
   private final byte[] class_ = new byte[8192];
   private final Deflater break_;
   private int byte_;

   public ruG_2(int var1) {
      this.byte_ = var1;
      this.break_ = new Deflater();
   }

   protected void class_(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var4 = var2.readableBytes();
      ruu_3 var5 = new ruu_3(var3);
      if (var4 < this.byte_) {
         var5.protected_(0);
         var5.writeBytes(var2);
      } else {
         byte[] var6 = new byte[var4];
         var2.readBytes(var6);
         var5.protected_(var6.length);
         this.break_.setInput(var6, 0, var4);
         this.break_.finish();

         while (!this.break_.finished()) {
            int var7 = this.break_.deflate(this.class_);
            var5.writeBytes(this.class_, 0, var7);
         }

         this.break_.reset();
      }
   }

   public void class_(int var1) {
      this.byte_ = var1;
   }
}
