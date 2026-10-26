/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.connection.UserConnectionImpl
 *  com.viaversion.viaversion.protocol.ProtocolPipelineImpl
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package celestial;

import celestial.rrjA_2;
import celestial.rrjT_2;
import celestial.rrjt_3;
import celestial.rrwm_3;
import celestial.ruJ_2;
import celestial.ruX_2;
import celestial.rud_3;
import celestial.ruh_3;
import celestial.rum_3;
import celestial.rux_3;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.connection.UserConnectionImpl;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class ruk_3
extends ChannelInitializer<Channel> {
    public final /* synthetic */ rud_3 id_class;

    public ruk_3(rud_3 rud_32) {
        this.id_class = rud_32;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        rrwm_3.id_class(channel);
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new ruJ_2()).addLast("decoder", (ChannelHandler)new ruh_3(rum_3.CLIENTBOUND)).addLast("prepender", (ChannelHandler)new rux_3()).addLast("encoder", (ChannelHandler)new ruX_2(rum_3.SERVERBOUND)).addLast("packet_handler", (ChannelHandler)this.id_class);
        if (channel instanceof SocketChannel && rrjA_2.id_protected().id_throws().getVersion() != 754) {
            UserConnectionImpl userConnectionImpl = new UserConnectionImpl(channel, true);
            new ProtocolPipelineImpl((UserConnection)userConnectionImpl);
            channel.pipeline().addBefore("encoder", "via-encoder", (ChannelHandler)new rrjt_3((UserConnection)userConnectionImpl));
            channel.pipeline().addBefore("decoder", "via-decoder", (ChannelHandler)new rrjT_2((UserConnection)userConnectionImpl));
        }
    }
}

