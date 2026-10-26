/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package celestial;

import celestial.rmh_3;
import celestial.ruA_2;
import celestial.ruJ_2;
import celestial.ruQ_2;
import celestial.ruX_2;
import celestial.rud_3;
import celestial.ruh_3;
import celestial.rum_3;
import celestial.rus_3;
import celestial.rux_3;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class ruN_2
extends ChannelInitializer<Channel> {
    public final /* synthetic */ ruQ_2 id_class;

    public ruN_2(ruQ_2 ruQ_22) {
        this.id_class = ruQ_22;
    }

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new rus_3(this.id_class)).addLast("splitter", (ChannelHandler)new ruJ_2()).addLast("decoder", (ChannelHandler)new ruh_3(rum_3.SERVERBOUND)).addLast("prepender", (ChannelHandler)new rux_3()).addLast("encoder", (ChannelHandler)new ruX_2(rum_3.CLIENTBOUND));
        int n = this.id_class.id_throws.r();
        rud_3 rud_32 = n > 0 ? new ruA_2(n) : new rud_3(rum_3.SERVERBOUND);
        this.id_class.id_catch.add(rud_32);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)rud_32);
        rud_32.id_class(new rmh_3(this.id_class.id_throws, rud_32));
    }
}

