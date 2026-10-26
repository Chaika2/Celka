package celestial;

import com.viaversion.viaversion.connection.UserConnectionImpl;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

class ruk_3 extends ChannelInitializer<Channel> {
   ruk_3(rud_3 var1) {
      this.id_class = var1;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      rrwm_3.id_class(var1);
      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new ruJ_2())
         .addLast("decoder", new ruh_3(rum_3.CLIENTBOUND))
         .addLast("prepender", new rux_3())
         .addLast("encoder", new ruX_2(rum_3.SERVERBOUND))
         .addLast("packet_handler", this.id_class);
      if (var1 instanceof SocketChannel && rrjA_2.id_protected().id_throws().getVersion() != 754) {
         UserConnectionImpl var2 = new UserConnectionImpl(var1, true);
         new ProtocolPipelineImpl(var2);
         var1.pipeline().addBefore("encoder", "via-encoder", new rrjt_3(var2));
         var1.pipeline().addBefore("decoder", "via-decoder", new rrjT_2(var2));
      }
   }
}
