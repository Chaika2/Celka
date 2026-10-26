package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwd_3 extends ChannelInitializer<Channel> {
   private static String[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;

   private static void byte_() {
      break_ = new String[]{
         new String("timeout"),
         new String("splitter"),
         new String("decoder"),
         new String("prepender"),
         new String("encoder"),
         new String("packet_handler"),
         new String("SOCKS5")
      };
   }

   public rrwd_3(rrwJ_2 var1, rud_3 var2) {
      this.class_();
      this.class_[1] = var1;
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, -121, -2, 125, 85, -11, 23, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 932824658;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 88116776736097387L;
   }

   private static void break_() {
      byte_ = new boolean[]{true, true, false, true, false};
   }

   private static void throws_() {
      protected_ = new byte[]{30, 2};
   }

   private static void protected_() {
      throws_ = new short[]{1, 0, 0, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};
   }

   public void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, byte_[0]);
      } catch (ChannelException var3) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new ruJ_2())
         .addLast("decoder", new ruh_3(rum_3.CLIENTBOUND))
         .addLast("prepender", new rux_3())
         .addLast("encoder", new ruX_2(rum_3.SERVERBOUND))
         .addLast("packet_handler", (rud_3)this.class_[0]);
      if (((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).protected_.equals("SOCKS5")) {
         var1.pipeline()
            .addFirst(
               new ChannelHandler[]{
                  new Socks5ProxyHandler(
                     new InetSocketAddress(((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).class_(), ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).break_()),
                     ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).byte_.isEmpty() ? null : ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).byte_,
                     ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).class_.isEmpty() ? null : ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).class_
                  )
               }
            );
      } else {
         var1.pipeline()
            .addFirst(
               new ChannelHandler[]{
                  new Socks4ProxyHandler(
                     new InetSocketAddress(((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).class_(), ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).break_()),
                     ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).byte_.isEmpty() ? null : ((rrwu_3)((rrwJ_2)this.class_[1]).class_[3]).byte_
                  )
               }
            );
      }
   }
}
