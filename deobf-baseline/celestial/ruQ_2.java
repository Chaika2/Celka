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
   private static final Logger id_protected = LogManager.getLogger();
   public static final rpo_3<NioEventLoopGroup> id_class = new rpo_3<>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build())
   );
   public static final rpo_3<EpollEventLoopGroup> id_break = new rpo_3<>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build())
   );
   final rnW_2 id_throws;
   public volatile boolean id_byte;
   private final List<ChannelFuture> id_case = Collections.synchronizedList(Lists.newArrayList());
   final List<rud_3> id_catch = Collections.synchronizedList(Lists.newArrayList());

   public void id_byte() {
      synchronized (this.id_catch) {
         Iterator var2 = this.id_catch.iterator();

         while (var2.hasNext()) {
            rud_3 var3 = (rud_3)var2.next();
            if (!var3.id_catch()) {
               if (var3.id_case()) {
                  try {
                     var3.id_class();
                  } catch (Exception var7) {
                     if (var3.id_protected()) {
                        throw new KU(KY.id_class(var7, "Ticking memory connection"));
                     }

                     id_protected.warn("Failed to handle packet for {}", var3.id_byte(), var7);
                     rgN_2 var5 = new rgN_2("Internal server error");
                     var3.id_class(new rvb_3(var5), var2x -> var3.id_class(var5));
                     var3.id_extends();
                  }
               } else {
                  var2.remove();
                  var3.id_native();
               }
            }
         }
      }
   }

   public ruQ_2(rnW_2 var1) {
      this.id_throws = var1;
      this.id_byte = true;
   }

   public void id_class(InetAddress var1, int var2) throws IOException {
      synchronized (this.id_case) {
         Class<EpollServerSocketChannel> var4;
         rpo_3 var5;
         if (Epoll.isAvailable() && this.id_throws.G()) {
            var4 = EpollServerSocketChannel.class;
            var5 = id_break;
            id_protected.info("Using epoll channel type");
         } else {
            var4 = NioServerSocketChannel.class;
            var5 = id_class;
            id_protected.info("Using default channel type");
         }

         this.id_case
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var4))
                     .childHandler(new ruN_2(this))
                     .group((EventLoopGroup)var5.id_class())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress id_class() {
      ChannelFuture var1;
      synchronized (this.id_case) {
         var1 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new ruc_3(this))
               .group((EventLoopGroup)id_class.id_class())
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.id_case.add(var1);
      }

      return var1.channel().localAddress();
   }

   public void id_break() {
      this.id_byte = false;

      for (ChannelFuture var2 : this.id_case) {
         try {
            var2.channel().close().sync();
         } catch (InterruptedException var4) {
            id_protected.error("Interrupted whilst closing channel");
         }
      }
   }

   public rnW_2 id_protected() {
      return this.id_throws;
   }
}
