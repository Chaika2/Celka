package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rus_3 extends ChannelInboundHandlerAdapter {
   private static final Logger class_ = LogManager.getLogger();
   private final ruQ_2 break_;

   public rus_3(ruQ_2 var1) {
      this.break_ = var1;
   }

   private ByteBuf class_(String var1) {
      ByteBuf var2 = Unpooled.buffer();
      var2.writeByte(255);
      char[] var3 = var1.toCharArray();
      var2.writeShort(var3.length);

      for (char var7 : var3) {
         var2.writeChar(var7);
      }

      return var2;
   }

   private void class_(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      ByteBuf var3 = (ByteBuf)var2;
      var3.markReaderIndex();
      boolean var4 = true;

      try {
         if (var3.readUnsignedByte() == 254) {
            InetSocketAddress var5 = (InetSocketAddress)var1.channel().remoteAddress();
            rnW_2 var6 = this.break_.protected_();
            int var7 = var3.readableBytes();
            switch (var7) {
               case 0:
                  class_.debug("Ping: (<1.3.x) from {}:{}", var5.getAddress(), var5.getPort());
                  String var8 = String.format("%s§%d§%d", var6.h(), var6.case_(), var6.catch_());
                  this.class_(var1, this.class_(var8));
                  break;
               case 1:
                  if (var3.readUnsignedByte() != 1) {
                     return;
                  }

                  class_.debug("Ping: (1.4-1.5.x) from {}:{}", var5.getAddress(), var5.getPort());
                  String var9 = String.format("§1��%d��%s��%s��%d��%d", 127, var6.throws_(), var6.h(), var6.case_(), var6.catch_());
                  this.class_(var1, this.class_(var9));
                  break;
               default:
                  boolean var10 = var3.readUnsignedByte() == 1;
                  var10 &= var3.readUnsignedByte() == 250;
                  var10 &= "MC|PingHost".equals(new String(var3.readBytes(var3.readShort() * 2).array(), StandardCharsets.UTF_16BE));
                  int var11 = var3.readUnsignedShort();
                  var10 &= var3.readUnsignedByte() >= 73;
                  var10 &= 3 + var3.readBytes(var3.readShort() * 2).array().length + 4 == var11;
                  var10 &= var3.readInt() <= 65535;
                  var10 &= var3.readableBytes() == 0;
                  if (!var10) {
                     return;
                  }

                  class_.debug("Ping: (1.6) from {}:{}", var5.getAddress(), var5.getPort());
                  String var12 = String.format("§1��%d��%s��%s��%d��%d", 127, var6.throws_(), var6.h(), var6.case_(), var6.catch_());
                  ByteBuf var13 = this.class_(var12);

                  try {
                     this.class_(var1, var13);
                  } finally {
                     var13.release();
                  }
            }

            var3.release();
            var4 = false;
         }
      } catch (RuntimeException var23) {
      } finally {
         if (var4) {
            var3.resetReaderIndex();
            var1.channel().pipeline().remove("legacy_query");
            var1.fireChannelRead(var2);
         }
      }
   }
}
