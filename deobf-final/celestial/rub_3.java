package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class rub_3 extends MessageToMessageDecoder<ByteBuf> {
   private final ruO_2 class_;

   public rub_3(Cipher var1) {
      this.class_ = new ruO_2(var1);
   }

   protected void class_(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      var3.add(this.class_.class_(var1, var2));
   }
}
