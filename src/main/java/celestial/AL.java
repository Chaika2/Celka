/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 */
package celestial;

import celestial.AA;
import celestial.Ad_1;
import celestial.Ak_1;
import celestial.Av_1;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

public class AL
extends ChannelInitializer<Channel> {
    public final /* synthetic */ Ad_1 id_class;
    public final /* synthetic */ Ak_1 id_break;

    public AL(Av_1 av_1, Ad_1 ad_1, Ak_1 ak_1) {
        this.id_class = ad_1;
        this.id_break = ak_1;
    }

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new AA(this)});
    }
}

