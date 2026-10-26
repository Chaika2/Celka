package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwd_3 extends ChannelInitializer<Channel> {
   private static String[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_break = new String[]{
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
      this.id_class();
      this.id_class[id_throws[0]] = var1;
      this.id_class[id_throws[1]] = var2;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, -121, -2, 125, 85, -11, 23, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[1]];
         Object[] var1 = this.id_class;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 932824658;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 88116776736097387L;
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, false, true, false};
   }

   private static void id_throws() {
      id_protected = new byte[]{30, 2};
   }

   private static void id_protected() {
      id_throws = new short[]{1, 0, 0, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};
   }

   public void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, id_byte[0]);
      } catch (ChannelException var3) {
      }

      var1.pipeline()
         .addLast(id_break[0], new ReadTimeoutHandler(id_protected[0]))
         .addLast(id_break[1], new ruJ_2())
         .addLast(id_break[2], new ruh_3(rum_3.CLIENTBOUND))
         .addLast(id_break[3], new rux_3())
         .addLast(id_break[4], new ruX_2(rum_3.SERVERBOUND))
         .addLast(id_break[5], (rud_3)this.id_class[id_throws[2]]);
      if (((rrwu_3)((rrwJ_2)this.id_class[id_throws[3]]).id_class[id_throws[4]]).id_protected.equals(id_break[6])) {
         ChannelPipeline var10000 = var1.pipeline();
         ChannelHandler[] var10001 = new ChannelHandler[id_byte[1]];
         var10001[id_byte[2]] = new Socks5ProxyHandler(
            new InetSocketAddress(
               ((rrwu_3)((rrwJ_2)this.id_class[id_throws[5]]).id_class[id_throws[6]]).id_class(),
               ((rrwu_3)((rrwJ_2)this.id_class[id_throws[7]]).id_class[id_throws[8]]).id_break()
            ),
            ((rrwu_3)((rrwJ_2)this.id_class[id_throws[9]]).id_class[id_throws[10]]).id_byte.isEmpty()
               ? null
               : ((rrwu_3)((rrwJ_2)this.id_class[id_throws[11]]).id_class[id_throws[12]]).id_byte,
            ((rrwu_3)((rrwJ_2)this.id_class[id_throws[13]]).id_class[id_throws[14]]).id_class.isEmpty()
               ? null
               : ((rrwu_3)((rrwJ_2)this.id_class[id_throws[15]]).id_class[id_throws[16]]).id_class
         );
         var10000.addFirst(var10001);
      } else {
         ChannelPipeline var4 = var1.pipeline();
         ChannelHandler[] var5 = new ChannelHandler[id_byte[3]];
         var5[id_byte[4]] = new Socks4ProxyHandler(
            new InetSocketAddress(
               ((rrwu_3)((rrwJ_2)this.id_class[id_throws[17]]).id_class[id_throws[18]]).id_class(),
               ((rrwu_3)((rrwJ_2)this.id_class[id_throws[19]]).id_class[id_throws[20]]).id_break()
            ),
            ((rrwu_3)((rrwJ_2)this.id_class[id_throws[21]]).id_class[id_throws[22]]).id_byte.isEmpty()
               ? null
               : ((rrwu_3)((rrwJ_2)this.id_class[id_throws[23]]).id_class[id_throws[24]]).id_byte
         );
         var4.addFirst(var5);
      }
   }
}
