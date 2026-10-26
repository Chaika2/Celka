package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

class ruN_2 extends ChannelInitializer<Channel> {
   ruN_2(ruQ_2 var1) {
      this.class_ = var1;
   }

   protected void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var4) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("legacy_query", new rus_3(this.class_))
         .addLast("splitter", new ruJ_2())
         .addLast("decoder", new ruh_3(rum_3.SERVERBOUND))
         .addLast("prepender", new rux_3())
         .addLast("encoder", new ruX_2(rum_3.CLIENTBOUND));
      int var2 = this.class_.throws_.r();
      Object var3 = var2 > 0 ? new ruA_2(var2) : new rud_3(rum_3.SERVERBOUND);
      this.class_.catch_.add((rud_3)var3);
      var1.pipeline().addLast("packet_handler", (ChannelHandler)var3);
      ((rud_3)var3).class_(new rmh_3(this.class_.throws_, (rud_3)var3));
   }
}
