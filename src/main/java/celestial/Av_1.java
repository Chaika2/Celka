/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AF;
import celestial.AL;
import celestial.Ad_1;
import celestial.Ak_1;
import celestial.rLS;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rmJ_2;
import celestial.rud_3;
import celestial.ruv_3;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Av_1 {
    public static final Splitter id_class = Splitter.on((char)'\u0000').limit(6);
    public static final Logger id_break = LogManager.getLogger();
    private final List<rud_3> id_byte = Collections.synchronizedList(Lists.newArrayList());

    public static rgP_2 id_class(int n, int n2) {
        return new rgN_2(Integer.toString(n)).id_class(new rgN_2("/").id_class(rgF_2.DARK_GRAY)).id_break(Integer.toString(n2)).id_class(rgF_2.GRAY);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class() {
        List<rud_3> list = this.id_byte;
        synchronized (list) {
            Iterator<rud_3> iterator = this.id_byte.iterator();
            while (iterator.hasNext()) {
                rud_3 rud_32 = iterator.next();
                if (rud_32.id_case()) {
                    rud_32.id_class();
                    continue;
                }
                iterator.remove();
                rud_32.id_native();
            }
        }
    }

    public void id_class(Ak_1 ak_1, Runnable runnable) throws UnknownHostException {
        Ad_1 ad_1 = Ad_1.id_class(ak_1.id_break);
        rud_3 rud_32 = rud_3.id_class(InetAddress.getByName(ad_1.id_class()), ad_1.id_break(), false);
        this.id_byte.add(rud_32);
        ak_1.id_protected = new rgn_3("multiplayer.status.pinging");
        ak_1.id_throws = -1L;
        ak_1.id_implements = null;
        rud_32.id_class(new AF(this, rud_32, ak_1, runnable));
        try {
            rud_32.id_class(new rmJ_2(ad_1.id_class(), ad_1.id_break(), ruv_3.STATUS));
            rud_32.id_class(new rLS());
        }
        catch (Throwable throwable) {
            id_break.error((Object)throwable);
        }
    }

    public void id_class(Ak_1 ak_1) {
        Ad_1 ad_1 = Ad_1.id_class(ak_1.id_break);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rud_3.id_protected.id_class())).handler((ChannelHandler)new AL(this, ad_1, ak_1))).channel(NioSocketChannel.class)).connect(ad_1.id_class(), ad_1.id_break());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_break() {
        List<rud_3> list = this.id_byte;
        synchronized (list) {
            Iterator<rud_3> iterator = this.id_byte.iterator();
            while (iterator.hasNext()) {
                rud_3 rud_32 = iterator.next();
                if (!rud_32.id_case()) continue;
                iterator.remove();
                rud_32.id_class(new rgn_3("multiplayer.status.cancelled"));
            }
        }
    }
}

