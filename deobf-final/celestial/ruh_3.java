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
   private static final Logger class_ = LogManager.getLogger();
   private static final Marker break_ = MarkerManager.getMarker("PACKET_RECEIVED", rud_3.break_);
   private final rum_3 byte_;

   public ruh_3(rum_3 var1) {
      this.byte_ = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() != 0) {
         ruu_3 var4 = new ruu_3(var2);
         int var5 = var4.case_();
         ruS_2 var6 = ((ruv_3)var1.channel().attr(rud_3.byte_).get()).class_(this.byte_, var5);
         if (var6 == null) {
            throw new IOException("Bad packet id " + var5);
         }

         var6.class_(var4);
         if (var4.readableBytes() > 0) {
            throw new IOException(
               "Packet "
                  + ((ruv_3)var1.channel().attr(rud_3.byte_).get()).class_()
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
         if (class_.isDebugEnabled()) {
            class_.debug(break_, " IN: [{}:{}] {}", var1.channel().attr(rud_3.byte_).get(), var5, var6.getClass().getName());
         }
      }
   }
}
