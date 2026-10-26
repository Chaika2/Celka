package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class rub_3 extends MessageToMessageDecoder<ByteBuf> {
   private final ruO_2 id_class;

   public rub_3(Cipher var1) {
      this.id_class = new ruO_2(var1);
   }

   protected void id_class(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      var3.add(this.id_class.id_class(var1, var2));
   }
}
