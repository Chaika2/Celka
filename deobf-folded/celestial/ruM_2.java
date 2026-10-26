package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class ruM_2 extends MessageToByteEncoder<ByteBuf> {
   private final ruO_2 id_class;

   public ruM_2(Cipher var1) {
      this.id_class = new ruO_2(var1);
   }

   protected void id_class(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.id_class.id_class(var2, var3);
   }
}
