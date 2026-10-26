package celestial;

import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
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

public class rud_3 extends SimpleChannelInboundHandler<ruS_2<?>> {
   private static final Logger id_catch = LogManager.getLogger();
   public static final Marker id_class = MarkerManager.getMarker("NETWORK");
   public static final Marker id_break = MarkerManager.getMarker("NETWORK_PACKETS", id_class);
   public static final AttributeKey<ruv_3> id_byte = AttributeKey.valueOf("protocol");
   public static final rpo_3<NioEventLoopGroup> id_protected = new rpo_3<>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final rpo_3<EpollEventLoopGroup> id_throws = new rpo_3<>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final rpo_3<DefaultEventLoopGroup> id_case = new rpo_3<>(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
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

   public rud_3(rum_3 var1) {
      this.id_private = var1;
   }

   public void id_class(rgP_2 var1, rgP_2 var2) {
      if (this.id_finally.isOpen()) {
         this.id_finally.close().awaitUninterruptibly();
         this.id_volatile = var1;
         this.id_final = var2;
      }
   }

   public void id_class(rgP_2 var1) {
      this.id_class(Aq_1.id_class, var1);
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

   public void id_class(Cipher var1, Cipher var2) {
      this.id_package = true;
      this.id_finally.pipeline().addBefore("splitter", "decrypt", new rub_3(var1));
      this.id_finally.pipeline().addBefore("prepender", "encrypt", new ruM_2(var2));
   }

   public void id_class(ruv_3 var1) {
      this.id_finally.attr(id_byte).set(var1);
      this.id_finally.config().setAutoRead(true);
      id_catch.debug("Enabled auto read");
   }

   public static rud_3 id_class(InetAddress var0, int var1, boolean var2) {
      rud_3 var3 = new rud_3(rum_3.CLIENTBOUND);
      Class<EpollSocketChannel> var4;
      rpo_3 var5;
      if (Epoll.isAvailable() && var2) {
         var4 = EpollSocketChannel.class;
         var5 = id_throws;
      } else {
         var4 = NioSocketChannel.class;
         var5 = id_protected;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)var5.id_class())).handler(new ruk_3(var3))).channel(var4))
         .connect(var0, var1)
         .syncUninterruptibly();
      return var3;
   }

   public void id_class(int var1) {
      if (var1 >= 0) {
         if (this.id_finally.pipeline().get("decompress") instanceof ruE_2) {
            ((ruE_2)this.id_finally.pipeline().get("decompress")).id_class(var1);
         } else {
            this.id_finally.pipeline().addBefore("decoder", "decompress", new ruE_2(var1));
         }

         if (this.id_finally.pipeline().get("compress") instanceof ruG_2) {
            ((ruG_2)this.id_finally.pipeline().get("compress")).id_class(var1);
         } else {
            this.id_finally.pipeline().addBefore("encoder", "compress", new ruG_2(var1));
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

   private static <T extends ruB_2> void id_class(ruS_2<T> var0, ruB_2 var1) {
      var0.id_class(var1);
   }

   public void id_class(ruS_2<?> var1) {
      rrLZ var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLZ.id_class(var1));
      rrLZ.id_class(var2, var1);
      if (!var2.id_byte()) {
         this.id_class(var1, null);
      }
   }

   protected void id_class(ChannelHandlerContext var1, ruS_2<?> var2) {
      if (this.id_finally.isOpen()) {
         try {
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break(var2, this.id_private);
            if (rrLu_1.id_class(var2).id_byte()) {
               return;
            }

            id_class(var2, this.id_native);
         } catch (ruT_2 var4) {
         }

         this.id_new++;
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_protected(var2, this.id_private);
      }
   }

   public void id_class(ruS_2<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      if (this.id_case()) {
         this.id_package();
         this.id_break(var1, var2);
      } else {
         this.id_implements.add(new ruz_3(var1, var2));
      }
   }

   public static rud_3 id_class(SocketAddress var0) {
      rud_3 var1 = new rud_3(rum_3.CLIENTBOUND);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)id_case.id_class())).handler(new ruW_2(var1))).channel(LocalChannel.class))
         .connect(var0)
         .syncUninterruptibly();
      return var1;
   }

   public void id_class(ruB_2 var1) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      this.id_native = var1;
   }

   protected void id_break() {
      this.id_this = rfU_2.id_catch(0.75F, (float)this.id_continue, this.id_this);
      this.id_super = rfU_2.id_catch(0.75F, (float)this.id_new, this.id_super);
      this.id_continue = 0;
      this.id_new = 0;
   }

   public void id_break(ruS_2<?> var1) {
      this.id_class(var1, null);
   }

   private void id_break(ruS_2<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_byte(var1, this.id_private);
      ruv_3 var3 = ruv_3.id_class(var1);
      ruv_3 var4 = (ruv_3)this.id_finally.attr(id_byte).get();
      this.id_continue++;
      if (var4 != var3) {
         id_catch.debug("Disabled auto read");
         this.id_finally.config().setAutoRead(false);
      }

      if (this.id_finally.eventLoop().inEventLoop()) {
         if (var3 != var4) {
            this.id_class(var3);
         }

         ChannelFuture var5 = this.id_finally.writeAndFlush(var1);
         if (var2 != null) {
            var5.addListener(var2);
         }

         var5.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.id_finally.eventLoop().execute(() -> {
            if (var3 != var4) {
               this.id_class(var3);
            }

            ChannelFuture var5x = this.id_finally.writeAndFlush(var1);
            if (var2 != null) {
               var5x.addListener(var2);
            }

            var5x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
         });
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1, this.id_private);
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

   private void id_package() {
      if (this.id_finally != null && this.id_finally.isOpen()) {
         ruz_3 var2;
         synchronized (this.id_implements) {
            while ((var2 = this.id_implements.poll()) != null) {
               this.id_break(var2.id_class, var2.id_break);
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
            this.id_int = true;
            rgP_2 var1 = this.id_implements();
            rgP_2 var2 = var1 == null ? Aq_1.id_class : var1;
            if (var2 != null && this.id_finally() != null) {
               this.id_private().id_class(var2, this.id_finally());
            } else if (this.id_private() != null) {
               this.id_private().id_class(var2, new rgn_3("multiplayer.disconnect.generic"));
            }
         }
      }
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.id_class(new rgn_3("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (var2 instanceof ruq_3) {
         id_catch.debug("Skipping packet due to errors", var2.getCause());
      } else {
         boolean var3 = !this.id_synchronized;
         this.id_synchronized = true;
         if (this.id_finally.isOpen()) {
            if (var2 instanceof TimeoutException) {
               id_catch.debug("Timeout", var2);
               this.id_class(new rgn_3("disconnect.timeout"));
            } else {
               rgn_3 var4 = new rgn_3("disconnect.genericReason", "Internal Exception: " + var2);
               if (var3) {
                  id_catch.debug("Failed to sent packet", var2);
                  this.id_class(new rvb_3(var4), var2x -> this.id_class(var4));
                  this.id_extends();
               } else {
                  id_catch.debug("Double fault", var2);
                  this.id_class(var4);
               }
            }
         }
      }
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      this.id_finally = var1.channel();
      this.id_extends = this.id_finally.remoteAddress();

      try {
         this.id_class(ruv_3.HANDSHAKING);
      } catch (Throwable var3) {
         id_catch.fatal(var3);
      }
   }
}
