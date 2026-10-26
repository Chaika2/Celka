package celestial;

import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.nio.charset.StandardCharsets;

class AA extends SimpleChannelInboundHandler<ByteBuf> {
   AA(AL var1) {
      this.class_ = var1;
   }

   protected void class_(ChannelHandlerContext var1, ByteBuf var2) throws Exception {
      short var3 = var2.readUnsignedByte();
      if (var3 == 255) {
         String var4 = new String(var2.readBytes(var2.readShort() * 2).array(), StandardCharsets.UTF_16BE);
         String[] var5 = (String[])Iterables.toArray(Av_1.class_.split(var4), String.class);
         if ("§1".equals(var5[0])) {
            int var6 = rfU_2.class_(var5[1], 0);
            String var7 = var5[2];
            String var8 = var5[3];
            int var9 = rfU_2.class_(var5[4], -1);
            int var10 = rfU_2.class_(var5[5], -1);
            this.class_.break_.case_ = -1;
            this.class_.break_.catch_ = new rgN_2(var7);
            this.class_.break_.protected_ = new rgN_2(var8);
            this.class_.break_.byte_ = Av_1.class_(var9, var10);
         }
      }

      var1.close();
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      var1.close();
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      ByteBuf var2 = Unpooled.buffer();

      try {
         var2.writeByte(254);
         var2.writeByte(1);
         var2.writeByte(250);
         char[] var3 = "MC|PingHost".toCharArray();
         var2.writeShort(var3.length);

         for (char var7 : var3) {
            var2.writeChar(var7);
         }

         var2.writeShort(7 + 2 * this.class_.class_.class_().length());
         var2.writeByte(127);
         var3 = this.class_.class_.class_().toCharArray();
         var2.writeShort(var3.length);

         for (char var15 : var3) {
            var2.writeChar(var15);
         }

         var2.writeInt(this.class_.class_.break_());
         var1.channel().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
      } finally {
         var2.release();
      }
   }
}
