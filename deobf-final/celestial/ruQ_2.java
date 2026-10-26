package celestial;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ruQ_2 {
   private static final Logger protected_ = LogManager.getLogger();
   public static final rpo_3<NioEventLoopGroup> class_ = new rpo_3<>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build())
   );
   public static final rpo_3<EpollEventLoopGroup> break_ = new rpo_3<>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build())
   );
   final rnW_2 throws_;
   public volatile boolean byte_;
   private final List<ChannelFuture> case_ = Collections.synchronizedList(Lists.newArrayList());
   final List<rud_3> catch_ = Collections.synchronizedList(Lists.newArrayList());

   public void byte_() {
      synchronized (this.catch_) {
         Iterator var2 = this.catch_.iterator();

         while (var2.hasNext()) {
            rud_3 var3 = (rud_3)var2.next();
            if (!var3.catch_()) {
               if (var3.case_()) {
                  try {
                     var3.class_();
                  } catch (Exception var7) {
                     if (var3.protected_()) {
                        throw new KU(KY.class_(var7, "Ticking memory connection"));
                     }

                     protected_.warn("Failed to handle packet for {}", var3.byte_(), var7);
                     rgN_2 var5 = new rgN_2("Internal server error");
                     var3.class_(new rvb_3(var5), var2x -> var3.class_(var5));
                     var3.extends_();
                  }
               } else {
                  var2.remove();
                  var3.native_();
               }
            }
         }
      }
   }

   public ruQ_2(rnW_2 var1) {
      this.throws_ = var1;
      this.byte_ = true;
   }

   public void class_(InetAddress var1, int var2) throws IOException {
      synchronized (this.case_) {
         Class<EpollServerSocketChannel> var4;
         rpo_3 var5;
         if (Epoll.isAvailable() && this.throws_.G()) {
            var4 = EpollServerSocketChannel.class;
            var5 = break_;
            protected_.info("Using epoll channel type");
         } else {
            var4 = NioServerSocketChannel.class;
            var5 = class_;
            protected_.info("Using default channel type");
         }

         this.case_
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var4))
                     .childHandler(new ruN_2(this))
                     .group((EventLoopGroup)var5.class_())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress class_() {
      ChannelFuture var1;
      synchronized (this.case_) {
         var1 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new ruc_3(this))
               .group((EventLoopGroup)class_.class_())
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.case_.add(var1);
      }

      return var1.channel().localAddress();
   }

   public void break_() {
      this.byte_ = false;

      for (ChannelFuture var2 : this.case_) {
         try {
            var2.channel().close().sync();
         } catch (InterruptedException var4) {
            protected_.error("Interrupted whilst closing channel");
         }
      }
   }

   public rnW_2 protected_() {
      return this.throws_;
   }
}
