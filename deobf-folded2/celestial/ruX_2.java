package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ruX_2 extends MessageToByteEncoder<ruS_2<?>> {
   private static final Logger id_class = LogManager.getLogger();
   private static final Marker id_break = MarkerManager.getMarker("PACKET_SENT", rud_3.id_break);
   private final rum_3 id_byte;

   public ruX_2(rum_3 var1) {
      this.id_byte = var1;
   }

   protected void id_class(ChannelHandlerContext var1, ruS_2<?> var2, ByteBuf var3) throws Exception {
      ruv_3 var4 = (ruv_3)var1.channel().attr(rud_3.id_byte).get();
      if (var4 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + var2);
      } else {
         Integer var5 = var4.id_class(this.id_byte, var2);
         if (id_class.isDebugEnabled()) {
            id_class.debug(id_break, "OUT: [{}:{}] {}", var1.channel().attr(rud_3.id_byte).get(), var5, var2.getClass().getName());
         }

         if (var5 == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            ruu_3 var6 = new ruu_3(var3);
            var6.id_protected(var5);

            try {
               var2.id_break(var6);
            } catch (Throwable var8) {
               id_class.error(var8);
               if (var2.id_class()) {
                  throw new ruq_3(var8);
               } else {
                  throw var8;
               }
            }
         }
      }
   }
}
