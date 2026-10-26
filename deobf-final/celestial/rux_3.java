package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToByteEncoder;

@Sharable
public class rux_3 extends MessageToByteEncoder<ByteBuf> {
   protected void class_(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      int var4 = var2.readableBytes();
      int var5 = ruu_3.class_(var4);
      if (var5 > 3) {
         throw new IllegalArgumentException("unable to fit " + var4 + " into 3");
      } else {
         ruu_3 var6 = new ruu_3(var3);
         var6.ensureWritable(var5 + var4);
         var6.protected_(var4);
         var6.writeBytes(var2, var2.readerIndex(), var4);
      }
   }
}
