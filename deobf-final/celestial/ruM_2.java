package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class ruM_2 extends MessageToByteEncoder<ByteBuf> {
   private final ruO_2 class_;

   public ruM_2(Cipher var1) {
      this.class_ = new ruO_2(var1);
   }

   protected void class_(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.class_.class_(var2, var3);
   }
}
