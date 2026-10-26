/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.DefaultEventLoopGroup
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package celestial;

import celestial.Aq_1;
import celestial.C_break;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rmW_2;
import celestial.rmy_3;
import celestial.rpo_3;
import celestial.rrLZ;
import celestial.rrLu_1;
import celestial.rrQX;
import celestial.ruB_2;
import celestial.ruE_2;
import celestial.ruG_2;
import celestial.ruM_2;
import celestial.ruS_2;
import celestial.ruT_2;
import celestial.ruW_2;
import celestial.rub_3;
import celestial.ruk_3;
import celestial.rum_3;
import celestial.ruq_3;
import celestial.ruv_3;
import celestial.ruz_3;
import celestial.rvb_3;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import javax.crypto.Cipher;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class rud_3
extends SimpleChannelInboundHandler<ruS_2<?>> {
    private static final Logger id_catch = LogManager.getLogger();
    public static final Marker id_class = MarkerManager.getMarker((String)"NETWORK");
    public static final Marker id_break = MarkerManager.getMarker((String)"NETWORK_PACKETS", (Marker)id_class);
    public static final AttributeKey<ruv_3> id_byte = AttributeKey.valueOf((String)"protocol");
    public static final rpo_3<NioEventLoopGroup> id_protected = new rpo_3<NioEventLoopGroup>(() -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
    public static final rpo_3<EpollEventLoopGroup> id_throws = new rpo_3<EpollEventLoopGroup>(() -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build()));
    public static final rpo_3<DefaultEventLoopGroup> id_case = new rpo_3<DefaultEventLoopGroup>(() -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build()));
    private final rum_3 id_private;
    private final Queue<ruz_3> id_implements = Queues.newConcurrentLinkedQueue();
    private Channel id_finally;
    private SocketAddress id_extends;
    private ruB_2 id_native;
    private rgP_2 id_volatile;
    private rgP_2 id_final;
    private boolean id_package;
    private boolean id_int;
    private int id_new;
    private int id_continue;
    private float id_super;
    private float id_this;
    private int id_else;
    private boolean id_synchronized;

    public SocketAddress id_byte() {
        return this.id_extends;
    }

    public rud_3(rum_3 rum_32) {
        this.id_private = rum_32;
    }

    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        if (this.id_finally.isOpen()) {
            this.id_finally.close().awaitUninterruptibly();
            this.id_volatile = rgP_22;
            this.id_final = rgP_23;
        }
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_class(Aq_1.id_class, rgP_22);
    }

    public void id_class() {
        this.id_package();
        if (this.id_native instanceof rmW_2) {
            ((rmW_2)this.id_native).id_break();
        }
        if (this.id_native instanceof rmy_3) {
            ((rmy_3)this.id_native).id_break();
        }
        if (this.id_finally != null) {
            this.id_finally.flush();
        }
        if (this.id_else++ % 20 == 0) {
            this.id_break();
        }
    }

    public void id_class(Cipher cipher, Cipher cipher2) {
        this.id_package = true;
        this.id_finally.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new rub_3(cipher));
        this.id_finally.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new ruM_2(cipher2));
    }

    public void id_class(ruv_3 ruv_32) {
        this.id_finally.attr(id_byte).set((Object)ruv_32);
        this.id_finally.config().setAutoRead(true);
        id_catch.debug("Enabled auto read");
    }

    public static rud_3 id_class(InetAddress inetAddress, int n, boolean bl) {
        rpo_3<NioEventLoopGroup> rpo_32;
        Class<NioSocketChannel> clazz;
        rud_3 rud_32 = new rud_3(rum_3.CLIENTBOUND);
        if (Epoll.isAvailable() && bl) {
            clazz = EpollSocketChannel.class;
            rpo_32 = id_throws;
        } else {
            clazz = NioSocketChannel.class;
            rpo_32 = id_protected;
        }
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rpo_32.id_class())).handler((ChannelHandler)new ruk_3(rud_32))).channel(clazz)).connect(inetAddress, n).syncUninterruptibly();
        return rud_32;
    }

    public void id_class(int n) {
        if (n >= 0) {
            if (this.id_finally.pipeline().get("decompress") instanceof ruE_2) {
                ((ruE_2)this.id_finally.pipeline().get("decompress")).id_class(n);
            } else {
                this.id_finally.pipeline().addBefore("decoder", "decompress", (ChannelHandler)new ruE_2(n));
            }
            if (this.id_finally.pipeline().get("compress") instanceof ruG_2) {
                ((ruG_2)this.id_finally.pipeline().get("compress")).id_class(n);
            } else {
                this.id_finally.pipeline().addBefore("encoder", "compress", (ChannelHandler)new ruG_2(n));
            }
        } else {
            if (this.id_finally.pipeline().get("decompress") instanceof ruE_2) {
                this.id_finally.pipeline().remove("decompress");
            }
            if (this.id_finally.pipeline().get("compress") instanceof ruG_2) {
                this.id_finally.pipeline().remove("compress");
            }
        }
    }

    private static <T extends ruB_2> void id_class(ruS_2<T> ruS_22, ruB_2 ruB_22) {
        ruS_22.id_class(ruB_22);
    }

    public void id_class(ruS_2<?> ruS_22) {
        rrLZ rrLZ2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLZ.id_class(ruS_22));
        rrLZ.id_class(rrLZ2, ruS_22);
        if (rrLZ2.id_byte()) {
            return;
        }
        this.id_class(ruS_22, null);
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ruS_2<?> ruS_22) {
        if (this.id_finally.isOpen()) {
            try {
                ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break(ruS_22, this.id_private);
                if (rrLu_1.id_class(ruS_22).id_byte()) {
                    return;
                }
                rud_3.id_class(ruS_22, this.id_native);
            }
            catch (ruT_2 ruT_22) {
                // empty catch block
            }
            ++this.id_new;
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_protected(ruS_22, this.id_private);
        }
    }

    public void id_class(ruS_2<?> ruS_22, GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        if (this.id_case()) {
            this.id_package();
            this.id_break(ruS_22, genericFutureListener);
        } else {
            this.id_implements.add(new ruz_3(ruS_22, genericFutureListener));
        }
    }

    public static rud_3 id_class(SocketAddress socketAddress) {
        rud_3 rud_32 = new rud_3(rum_3.CLIENTBOUND);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)id_case.id_class())).handler((ChannelHandler)new ruW_2(rud_32))).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return rud_32;
    }

    public void id_class(ruB_2 ruB_22) {
        Validate.notNull((Object)ruB_22, (String)"packetListener", (Object[])new Object[0]);
        this.id_native = ruB_22;
    }

    protected void id_break() {
        this.id_this = rfU_2.id_catch(0.75f, this.id_continue, this.id_this);
        this.id_super = rfU_2.id_catch(0.75f, this.id_new, this.id_super);
        this.id_continue = 0;
        this.id_new = 0;
    }

    public void id_break(ruS_2<?> ruS_22) {
        this.id_class(ruS_22, null);
    }

    private void id_break(ruS_2<?> ruS_22, GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_byte(ruS_22, this.id_private);
        ruv_3 ruv_32 = ruv_3.id_class(ruS_22);
        ruv_3 ruv_33 = (ruv_3)((Object)this.id_finally.attr(id_byte).get());
        ++this.id_continue;
        if (ruv_33 != ruv_32) {
            id_catch.debug("Disabled auto read");
            this.id_finally.config().setAutoRead(false);
        }
        if (this.id_finally.eventLoop().inEventLoop()) {
            if (ruv_32 != ruv_33) {
                this.id_class(ruv_32);
            }
            ChannelFuture channelFuture = this.id_finally.writeAndFlush(ruS_22);
            if (genericFutureListener != null) {
                channelFuture.addListener(genericFutureListener);
            }
            channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.id_finally.eventLoop().execute(() -> {
                if (ruv_32 != ruv_33) {
                    this.id_class(ruv_32);
                }
                ChannelFuture channelFuture = this.id_finally.writeAndFlush((Object)ruS_22);
                if (genericFutureListener != null) {
                    channelFuture.addListener(genericFutureListener);
                }
                channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
            });
        }
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(ruS_22, this.id_private);
    }

    public boolean id_throws() {
        return this.id_package;
    }

    public rgP_2 id_finally() {
        return this.id_final;
    }

    public boolean id_catch() {
        return this.id_finally == null;
    }

    public void id_extends() {
        this.id_finally.config().setAutoRead(false);
    }

    public boolean id_case() {
        return this.id_finally != null && this.id_finally.isOpen();
    }

    public rgP_2 id_implements() {
        return this.id_volatile;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_package() {
        if (this.id_finally != null && this.id_finally.isOpen()) {
            Queue<ruz_3> queue = this.id_implements;
            synchronized (queue) {
                ruz_3 ruz_32;
                while ((ruz_32 = this.id_implements.poll()) != null) {
                    this.id_break(ruz_32.id_class, ruz_32.id_break);
                }
            }
        }
    }

    public boolean id_protected() {
        return this.id_finally instanceof LocalChannel || this.id_finally instanceof LocalServerChannel;
    }

    public ruB_2 id_private() {
        return this.id_native;
    }

    public float id_final() {
        return this.id_this;
    }

    public float id_volatile() {
        return this.id_super;
    }

    public void id_native() {
        if (this.id_finally != null && !this.id_finally.isOpen()) {
            if (this.id_int) {
                id_catch.warn("handleDisconnection() called twice");
            } else {
                rgP_2 rgP_22;
                this.id_int = true;
                rgP_2 rgP_23 = this.id_implements();
                rgP_2 rgP_24 = rgP_22 = rgP_23 == null ? Aq_1.id_class : rgP_23;
                if (rgP_22 != null && this.id_finally() != null) {
                    this.id_private().id_class(rgP_22, this.id_finally());
                } else if (this.id_private() != null) {
                    this.id_private().id_class(rgP_22, new rgn_3("multiplayer.disconnect.generic"));
                }
            }
        }
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.id_class(new rgn_3("disconnect.endOfStream"));
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        if (throwable instanceof ruq_3) {
            id_catch.debug("Skipping packet due to errors", throwable.getCause());
        } else {
            boolean bl = !this.id_synchronized;
            this.id_synchronized = true;
            if (this.id_finally.isOpen()) {
                if (throwable instanceof TimeoutException) {
                    id_catch.debug("Timeout", throwable);
                    this.id_class(new rgn_3("disconnect.timeout"));
                } else {
                    rgn_3 rgn_32 = new rgn_3("disconnect.genericReason", "Internal Exception: " + throwable);
                    if (bl) {
                        id_catch.debug("Failed to sent packet", throwable);
                        this.id_class(new rvb_3(rgn_32), (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)future -> this.id_class(rgn_32)));
                        this.id_extends();
                    } else {
                        id_catch.debug("Double fault", throwable);
                        this.id_class(rgn_32);
                    }
                }
            }
        }
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.id_finally = channelHandlerContext.channel();
        this.id_extends = this.id_finally.remoteAddress();
        try {
            this.id_class(ruv_3.HANDSHAKING);
        }
        catch (Throwable throwable) {
            id_catch.fatal((Object)throwable);
        }
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.id_class(channelHandlerContext, (ruS_2)object);
    }
}

