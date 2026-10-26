package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

class ruc_3 extends ChannelInitializer<Channel> {
   ruc_3(ruQ_2 var1) {
      this.class_ = var1;
   }

   protected void initChannel(Channel var1) throws Exception {
      rud_3 var2 = new rud_3(rum_3.SERVERBOUND);
      var2.class_(new An_1(this.class_.throws_, var2));
      this.class_.catch_.add(var2);
      var1.pipeline().addLast("packet_handler", var2);
   }
}
