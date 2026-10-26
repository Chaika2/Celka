/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
package celestial;

import celestial.rud_3;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;

public class ruW_2
extends ChannelInitializer<Channel> {
    public final /* synthetic */ rud_3 id_class;

    public ruW_2(rud_3 rud_32) {
        this.id_class = rud_32;
    }

    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.id_class);
    }
}

