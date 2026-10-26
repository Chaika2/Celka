package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

class ruW_2 extends ChannelInitializer<Channel> {
   ruW_2(rud_3 var1) {
      this.class_ = var1;
   }

   protected void initChannel(Channel var1) throws Exception {
      var1.pipeline().addLast("packet_handler", this.class_);
   }
}
