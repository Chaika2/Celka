package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

class ruc_3 extends ChannelInitializer<Channel> {
   ruc_3(ruQ_2 var1) {
      this.id_class = var1;
   }

   protected void initChannel(Channel var1) throws Exception {
      rud_3 var2 = new rud_3(rum_3.SERVERBOUND);
      var2.id_class(new An_1(this.id_class.id_throws, var2));
      this.id_class.id_catch.add(var2);
      var1.pipeline().addLast("packet_handler", var2);
   }
}
