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
   private static final Logger catch_ = LogManager.getLogger();
   public static final Marker class_ = MarkerManager.getMarker("NETWORK");
   public static final Marker break_ = MarkerManager.getMarker("NETWORK_PACKETS", class_);
   public static final AttributeKey<ruv_3> byte_ = AttributeKey.valueOf("protocol");
   public static final rpo_3<NioEventLoopGroup> protected_ = new rpo_3<>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final rpo_3<EpollEventLoopGroup> throws_ = new rpo_3<>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final rpo_3<DefaultEventLoopGroup> case_ = new rpo_3<>(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final rum_3 private_;
   private final Queue<ruz_3> implements_ = Queues.newConcurrentLinkedQueue();
   private Channel finally_;
   private SocketAddress extends_;
   private ruB_2 native_;
   private rgP_2 volatile_;
   private rgP_2 final_;
   private boolean package_;
   private boolean int_;
   private int new_;
   private int continue_;
   private float super_;
   private float this_;
   private int else_;
   private boolean synchronized_;

   public SocketAddress byte_() {
      return this.extends_;
   }

   public rud_3(rum_3 var1) {
      this.private_ = var1;
   }

   public void class_(rgP_2 var1, rgP_2 var2) {
      if (this.finally_.isOpen()) {
         this.finally_.close().awaitUninterruptibly();
         this.volatile_ = var1;
         this.final_ = var2;
      }
   }

   public void class_(rgP_2 var1) {
      this.class_(Aq_1.class_, var1);
   }

   public void class_() {
      this.package_();
      if (this.native_ instanceof rmW_2) {
         ((rmW_2)this.native_).break_();
      }

      if (this.native_ instanceof rmy_3) {
         ((rmy_3)this.native_).break_();
      }

      if (this.finally_ != null) {
         this.finally_.flush();
      }

      if (this.else_++ % 20 == 0) {
         this.break_();
      }
   }

   public void class_(Cipher var1, Cipher var2) {
      this.package_ = true;
      this.finally_.pipeline().addBefore("splitter", "decrypt", new rub_3(var1));
      this.finally_.pipeline().addBefore("prepender", "encrypt", new ruM_2(var2));
   }

   public void class_(ruv_3 var1) {
      this.finally_.attr(byte_).set(var1);
      this.finally_.config().setAutoRead(true);
      catch_.debug("Enabled auto read");
   }

   public static rud_3 class_(InetAddress var0, int var1, boolean var2) {
      rud_3 var3 = new rud_3(rum_3.CLIENTBOUND);
      Class<EpollSocketChannel> var4;
      rpo_3 var5;
      if (Epoll.isAvailable() && var2) {
         var4 = EpollSocketChannel.class;
         var5 = throws_;
      } else {
         var4 = NioSocketChannel.class;
         var5 = protected_;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)var5.class_())).handler(new ruk_3(var3))).channel(var4))
         .connect(var0, var1)
         .syncUninterruptibly();
      return var3;
   }

   public void class_(int var1) {
      if (var1 >= 0) {
         if (this.finally_.pipeline().get("decompress") instanceof ruE_2) {
            ((ruE_2)this.finally_.pipeline().get("decompress")).class_(var1);
         } else {
            this.finally_.pipeline().addBefore("decoder", "decompress", new ruE_2(var1));
         }

         if (this.finally_.pipeline().get("compress") instanceof ruG_2) {
            ((ruG_2)this.finally_.pipeline().get("compress")).class_(var1);
         } else {
            this.finally_.pipeline().addBefore("encoder", "compress", new ruG_2(var1));
         }
      } else {
         if (this.finally_.pipeline().get("decompress") instanceof ruE_2) {
            this.finally_.pipeline().remove("decompress");
         }

         if (this.finally_.pipeline().get("compress") instanceof ruG_2) {
            this.finally_.pipeline().remove("compress");
         }
      }
   }

   private static <T extends ruB_2> void class_(ruS_2<T> var0, ruB_2 var1) {
      var0.class_(var1);
   }

   public void class_(ruS_2<?> var1) {
      rrLZ var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLZ.class_(var1));
      rrLZ.class_(var2, var1);
      if (!var2.byte_()) {
         this.class_(var1, null);
      }
   }

   protected void class_(ChannelHandlerContext var1, ruS_2<?> var2) {
      if (this.finally_.isOpen()) {
         try {
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).break_(var2, this.private_);
            if (rrLu_1.class_(var2).byte_()) {
               return;
            }

            class_(var2, this.native_);
         } catch (ruT_2 var4) {
         }

         this.new_++;
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).protected_(var2, this.private_);
      }
   }

   public void class_(ruS_2<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      if (this.case_()) {
         this.package_();
         this.break_(var1, var2);
      } else {
         this.implements_.add(new ruz_3(var1, var2));
      }
   }

   public static rud_3 class_(SocketAddress var0) {
      rud_3 var1 = new rud_3(rum_3.CLIENTBOUND);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)case_.class_())).handler(new ruW_2(var1))).channel(LocalChannel.class))
         .connect(var0)
         .syncUninterruptibly();
      return var1;
   }

   public void class_(ruB_2 var1) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      this.native_ = var1;
   }

   protected void break_() {
      this.this_ = rfU_2.catch_(0.75F, (float)this.continue_, this.this_);
      this.super_ = rfU_2.catch_(0.75F, (float)this.new_, this.super_);
      this.continue_ = 0;
      this.new_ = 0;
   }

   public void break_(ruS_2<?> var1) {
      this.class_(var1, null);
   }

   private void break_(ruS_2<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).byte_(var1, this.private_);
      ruv_3 var3 = ruv_3.class_(var1);
      ruv_3 var4 = (ruv_3)this.finally_.attr(byte_).get();
      this.continue_++;
      if (var4 != var3) {
         catch_.debug("Disabled auto read");
         this.finally_.config().setAutoRead(false);
      }

      if (this.finally_.eventLoop().inEventLoop()) {
         if (var3 != var4) {
            this.class_(var3);
         }

         ChannelFuture var5 = this.finally_.writeAndFlush(var1);
         if (var2 != null) {
            var5.addListener(var2);
         }

         var5.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.finally_.eventLoop().execute(() -> {
            if (var3 != var4) {
               this.class_(var3);
            }

            ChannelFuture var5x = this.finally_.writeAndFlush(var1);
            if (var2 != null) {
               var5x.addListener(var2);
            }

            var5x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
         });
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1, this.private_);
   }

   public boolean throws_() {
      return this.package_;
   }

   public rgP_2 finally_() {
      return this.final_;
   }

   public boolean catch_() {
      return this.finally_ == null;
   }

   public void extends_() {
      this.finally_.config().setAutoRead(false);
   }

   public boolean case_() {
      return this.finally_ != null && this.finally_.isOpen();
   }

   public rgP_2 implements_() {
      return this.volatile_;
   }

   private void package_() {
      if (this.finally_ != null && this.finally_.isOpen()) {
         ruz_3 var2;
         synchronized (this.implements_) {
            while ((var2 = this.implements_.poll()) != null) {
               this.break_(var2.class_, var2.break_);
            }
         }
      }
   }

   public boolean protected_() {
      return this.finally_ instanceof LocalChannel || this.finally_ instanceof LocalServerChannel;
   }

   public ruB_2 private_() {
      return this.native_;
   }

   public float final_() {
      return this.this_;
   }

   public float volatile_() {
      return this.super_;
   }

   public void native_() {
      if (this.finally_ != null && !this.finally_.isOpen()) {
         if (this.int_) {
            catch_.warn("handleDisconnection() called twice");
         } else {
            this.int_ = true;
            rgP_2 var1 = this.implements_();
            rgP_2 var2 = var1 == null ? Aq_1.class_ : var1;
            if (var2 != null && this.finally_() != null) {
               this.private_().class_(var2, this.finally_());
            } else if (this.private_() != null) {
               this.private_().class_(var2, new rgn_3("multiplayer.disconnect.generic"));
            }
         }
      }
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.class_(new rgn_3("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (var2 instanceof ruq_3) {
         catch_.debug("Skipping packet due to errors", var2.getCause());
      } else {
         boolean var3 = !this.synchronized_;
         this.synchronized_ = true;
         if (this.finally_.isOpen()) {
            if (var2 instanceof TimeoutException) {
               catch_.debug("Timeout", var2);
               this.class_(new rgn_3("disconnect.timeout"));
            } else {
               rgn_3 var4 = new rgn_3("disconnect.genericReason", "Internal Exception: " + var2);
               if (var3) {
                  catch_.debug("Failed to sent packet", var2);
                  this.class_(new rvb_3(var4), var2x -> this.class_(var4));
                  this.extends_();
               } else {
                  catch_.debug("Double fault", var2);
                  this.class_(var4);
               }
            }
         }
      }
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      this.finally_ = var1.channel();
      this.extends_ = this.finally_.remoteAddress();

      try {
         this.class_(ruv_3.HANDSHAKING);
      } catch (Throwable var3) {
         catch_.fatal(var3);
      }
   }
}
