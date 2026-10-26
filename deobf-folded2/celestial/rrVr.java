package celestial;

import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;

public class rrVr {
   public static void id_class(ChannelHandlerContext var0, ByteBuf var1) throws InvocationTargetException {
      ChannelHandler var2 = var0.pipeline().get("decompress");
      ByteBuf var3 = var2 instanceof MessageToMessageDecoder
         ? (ByteBuf)PipelineUtil.callDecode((MessageToMessageDecoder)var2, var0, var1).get(0)
         : (ByteBuf)PipelineUtil.callDecode((ByteToMessageDecoder)var2, var0, var1).get(0);

      try {
         var1.clear().writeBytes(var3);
      } finally {
         var3.release();
      }
   }

   public static void id_break(ChannelHandlerContext var0, ByteBuf var1) throws Exception {
      ByteBuf var2 = var0.alloc().buffer();

      try {
         PipelineUtil.callEncode((MessageToByteEncoder)var0.pipeline().get("compress"), var0, var1, var2);
         var1.clear().writeBytes(var2);
      } finally {
         var2.release();
      }
   }
}
