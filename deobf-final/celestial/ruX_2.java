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
   private static final Logger class_ = LogManager.getLogger();
   private static final Marker break_ = MarkerManager.getMarker("PACKET_SENT", rud_3.break_);
   private final rum_3 byte_;

   public ruX_2(rum_3 var1) {
      this.byte_ = var1;
   }

   protected void class_(ChannelHandlerContext var1, ruS_2<?> var2, ByteBuf var3) throws Exception {
      ruv_3 var4 = (ruv_3)var1.channel().attr(rud_3.byte_).get();
      if (var4 == null) {
         throw new RuntimeException("ConnectionProtocol unknown: " + var2);
      } else {
         Integer var5 = var4.class_(this.byte_, var2);
         if (class_.isDebugEnabled()) {
            class_.debug(break_, "OUT: [{}:{}] {}", var1.channel().attr(rud_3.byte_).get(), var5, var2.getClass().getName());
         }

         if (var5 == null) {
            throw new IOException("Can't serialize unregistered packet");
         } else {
            ruu_3 var6 = new ruu_3(var3);
            var6.protected_(var5);

            try {
               var2.break_(var6);
            } catch (Throwable var8) {
               class_.error(var8);
               if (var2.class_()) {
                  throw new ruq_3(var8);
               } else {
                  throw var8;
               }
            }
         }
      }
   }
}
