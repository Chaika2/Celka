/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
package celestial;

import celestial.An_1;
import celestial.ruQ_2;
import celestial.rud_3;
import celestial.rum_3;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;

public class ruc_3
extends ChannelInitializer<Channel> {
    public final /* synthetic */ ruQ_2 id_class;

    public ruc_3(ruQ_2 ruQ_22) {
        this.id_class = ruQ_22;
    }

    protected void initChannel(Channel channel) throws Exception {
        rud_3 rud_32 = new rud_3(rum_3.SERVERBOUND);
        rud_32.id_class(new An_1(this.id_class.id_throws, rud_32));
        this.id_class.id_catch.add(rud_32);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)rud_32);
    }
}

