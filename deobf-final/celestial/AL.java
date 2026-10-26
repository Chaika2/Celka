package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

class AL extends ChannelInitializer<Channel> {
   AL(Av_1 var1, Ad_1 var2, Ak_1 var3) {
      this.class_ = var2;
      this.break_ = var3;
   }

   protected void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      var1.pipeline().addLast(new ChannelHandler[]{new AA(this)});
   }
}
