package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class ruG_2 extends MessageToByteEncoder<ByteBuf> {
   private final byte[] id_class = new byte[8192];
   private final Deflater id_break;
   private int id_byte;

   public ruG_2(int var1) {
      this.id_byte = var1;
      this.id_break = new Deflater();
   }

   protected void id_class(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var4 = var2.readableBytes();
      ruu_3 var5 = new ruu_3(var3);
      if (var4 < this.id_byte) {
         var5.id_protected(0);
         var5.writeBytes(var2);
      } else {
         byte[] var6 = new byte[var4];
         var2.readBytes(var6);
         var5.id_protected(var6.length);
         this.id_break.setInput(var6, 0, var4);
         this.id_break.finish();

         while (!this.id_break.finished()) {
            int var7 = this.id_break.deflate(this.id_class);
            var5.writeBytes(this.id_class, 0, var7);
         }

         this.id_break.reset();
      }
   }

   public void id_class(int var1) {
      this.id_byte = var1;
   }
}
