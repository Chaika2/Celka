package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ruh_3 extends ByteToMessageDecoder {
   private static final Logger id_class = LogManager.getLogger();
   private static final Marker id_break = MarkerManager.getMarker("PACKET_RECEIVED", rud_3.id_break);
   private final rum_3 id_byte;

   public ruh_3(rum_3 var1) {
      this.id_byte = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() != 0) {
         ruu_3 var4 = new ruu_3(var2);
         int var5 = var4.id_case();
         ruS_2 var6 = ((ruv_3)var1.channel().attr(rud_3.id_byte).get()).id_class(this.id_byte, var5);
         if (var6 == null) {
            throw new IOException("Bad packet id " + var5);
         }

         var6.id_class(var4);
         if (var4.readableBytes() > 0) {
            throw new IOException(
               "Packet "
                  + ((ruv_3)var1.channel().attr(rud_3.id_byte).get()).id_class()
                  + "/"
                  + var5
                  + " ("
                  + var6.getClass().getSimpleName()
                  + ") was larger than I expected, found "
                  + var4.readableBytes()
                  + " bytes extra whilst reading packet "
                  + var5
            );
         }

         var3.add(var6);
         if (id_class.isDebugEnabled()) {
            id_class.debug(id_break, " IN: [{}:{}] {}", var1.channel().attr(rud_3.id_byte).get(), var5, var6.getClass().getName());
         }
      }
   }
}
