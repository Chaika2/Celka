package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

/**
 * Faithful re-implementation of the runtime jar's celestial.ruk_3 (the live client
 * ChannelInitializer, built by rud_3.id_class(InetAddress,int,boolean)), with one
 * addition: a PacketTap handler is injected right before "packet_handler".
 *
 * This class is compiled separately against the runtime jar and placed in a small
 * directory that src net.minecraft.client.main.Main prepends to the nested game
 * classloader. It intentionally matches the original's package-private visibility
 * and constructor so it links against the runtime celestial.* classes.
 *
 * Delete this directory / the Main hook to revert.
 */
class ruk_3 extends ChannelInitializer<Channel> {
    final /* synthetic */ rud_3 id_class;

    ruk_3(rud_3 rud_32) {
        this.id_class = rud_32;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, Boolean.TRUE);
        } catch (ChannelException channelException) {
            // empty catch block (matches original)
        }
        rrwm_3.id_class(channel);
        channel.pipeline()
            .addLast("timeout", (ChannelHandler) new ReadTimeoutHandler(30))
            .addLast("splitter", (ChannelHandler) new ruJ_2())
            .addLast("decoder", (ChannelHandler) new ruh_3(rum_3.CLIENTBOUND))
            .addLast("prepender", (ChannelHandler) new rux_3())
            .addLast("encoder", (ChannelHandler) new ruX_2(rum_3.SERVERBOUND))
            .addLast("packet_handler", (ChannelHandler) this.id_class);
        if (channel instanceof SocketChannel && rrjA_2.id_protected().id_throws().getVersion() != 754) {
            com.viaversion.viaversion.connection.UserConnectionImpl userConnectionImpl =
                new com.viaversion.viaversion.connection.UserConnectionImpl(channel, true);
            new com.viaversion.viaversion.protocol.ProtocolPipelineImpl(
                (com.viaversion.viaversion.api.connection.UserConnection) userConnectionImpl);
            channel.pipeline().addBefore("encoder", "via-encoder",
                (ChannelHandler) new rrjt_3((com.viaversion.viaversion.api.connection.UserConnection) userConnectionImpl));
            channel.pipeline().addBefore("decoder", "via-decoder",
                (ChannelHandler) new rrjT_2((com.viaversion.viaversion.api.connection.UserConnection) userConnectionImpl));
        }
        // DEBUG: observe decoded inbound + outbound packets (no-op unless packetdebug.on exists)
        System.out.println("[packettap] ruk_3.initChannel -> injecting packet_tap cwd="
            + new java.io.File(".").getAbsolutePath()
            + " via=" + (channel instanceof SocketChannel));
        channel.pipeline().addBefore("packet_handler", "packet_tap", (ChannelHandler) new PacketTap());
    }
}
