/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.rgN_2;
import celestial.rnW_2;
import celestial.rpo_3;
import celestial.ruN_2;
import celestial.ruc_3;
import celestial.rud_3;
import celestial.rvb_3;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruQ_2 {
    private static final Logger id_protected = LogManager.getLogger();
    public static final rpo_3<NioEventLoopGroup> id_class = new rpo_3<NioEventLoopGroup>(() -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build()));
    public static final rpo_3<EpollEventLoopGroup> id_break = new rpo_3<EpollEventLoopGroup>(() -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build()));
    public final rnW_2 id_throws;
    public volatile boolean id_byte;
    private final List<ChannelFuture> id_case = Collections.synchronizedList(Lists.newArrayList());
    public final List<rud_3> id_catch = Collections.synchronizedList(Lists.newArrayList());

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_byte() {
        List<rud_3> list = this.id_catch;
        synchronized (list) {
            Iterator<rud_3> iterator = this.id_catch.iterator();
            while (iterator.hasNext()) {
                rud_3 rud_32 = iterator.next();
                if (rud_32.id_catch()) continue;
                if (rud_32.id_case()) {
                    try {
                        rud_32.id_class();
                    }
                    catch (Exception exception) {
                        if (rud_32.id_protected()) {
                            throw new KU(KY.id_class(exception, "Ticking memory connection"));
                        }
                        id_protected.warn("Failed to handle packet for {}", (Object)rud_32.id_byte(), (Object)exception);
                        rgN_2 rgN_22 = new rgN_2("Internal server error");
                        rud_32.id_class(new rvb_3(rgN_22), (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)future -> rud_32.id_class(rgN_22)));
                        rud_32.id_extends();
                    }
                    continue;
                }
                iterator.remove();
                rud_32.id_native();
            }
        }
    }

    public ruQ_2(rnW_2 rnW_22) {
        this.id_throws = rnW_22;
        this.id_byte = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(InetAddress inetAddress, int n) throws IOException {
        List<ChannelFuture> list = this.id_case;
        synchronized (list) {
            rpo_3<NioEventLoopGroup> rpo_32;
            Class<NioServerSocketChannel> clazz;
            if (Epoll.isAvailable() && this.id_throws.G()) {
                clazz = EpollServerSocketChannel.class;
                rpo_32 = id_break;
                id_protected.info("Using epoll channel type");
            } else {
                clazz = NioServerSocketChannel.class;
                rpo_32 = id_class;
                id_protected.info("Using default channel type");
            }
            this.id_case.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(clazz)).childHandler((ChannelHandler)new ruN_2(this)).group((EventLoopGroup)rpo_32.id_class()).localAddress(inetAddress, n)).bind().syncUninterruptibly());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress id_class() {
        ChannelFuture channelFuture;
        List<ChannelFuture> list = this.id_case;
        synchronized (list) {
            channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new ruc_3(this)).group((EventLoopGroup)id_class.id_class()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.id_case.add(channelFuture);
        }
        return channelFuture.channel().localAddress();
    }

    public void id_break() {
        this.id_byte = false;
        for (ChannelFuture channelFuture : this.id_case) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException interruptedException) {
                id_protected.error("Interrupted whilst closing channel");
            }
        }
    }

    public rnW_2 id_protected() {
        return this.id_throws;
    }
}

