package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

class ruW_2 extends ChannelInitializer<Channel> {
   ruW_2(rud_3 var1) {
      this.id_class = var1;
   }

   protected void initChannel(Channel var1) throws Exception {
      var1.pipeline().addLast("packet_handler", this.id_class);
   }
}
