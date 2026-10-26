package celestial;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwJ_2 {
   public Object[] id_class;
   private static long[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   private static byte[] id_case;
   public static Object[] id_break;
   private static short[] id_catch;

   private static void id_byte() {
      id_catch = new short[]{0, 2, 3, 0, 0, 0, 0, 2, 0, 2, 2, 2, 2};
   }

   public rrwJ_2() {
      this.id_catch();
      String var5 = "";
      this.id_class[0] = var5;
      Object var6 = null;
      this.id_class[2] = var6;
   }

   static {
      ntfClinit();
   }

   private rud_3 id_class(InetAddress var1, int var2) {
      rud_3 var3 = new rud_3(rum_3.CLIENTBOUND);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rud_3.id_protected.id_class())).handler(new rrwd_3(this, var3)))
            .channel(NioSocketChannel.class))
         .connect(var1, var2)
         .syncUninterruptibly();
      return var3;
   }

   public void id_class(String var1, int var2, rrwu_3 var3) {
      this.id_class[3] = var3;
      ((ThreadPoolExecutor)id_break[0]).submit(() -> this.id_break(var1, var2));
   }

   public void id_class() {
      if ((rud_3)this.id_class[2] != null) {
         if (((rud_3)this.id_class[2]).id_case()) {
            ((rud_3)this.id_class[2]).id_class();
         } else {
            ((rud_3)this.id_class[2]).id_native();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1882893313;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-22, 57, 76, -84, 113, -89, 17, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3000857890993572813L;
   }

   private static void id_break() {
      id_case = new byte[]{5, 4};
   }

   private void id_break(String var1, int var2) {
      String var9 = new rgn_3("ui.proxyserver.ping.pinging", var1).getString();
      this.id_class[0] = var9;

      rud_3 var3;
      try {
         var3 = this.id_class(InetAddress.getByName(var1), var2);
      } catch (UnknownHostException var15) {
         String var10 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantConnect").getString();
         this.id_class[0] = var10;
         return;
      } catch (Exception var16) {
         String var11 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantPing", var1).getString();
         this.id_class[0] = var11;
         return;
      }

      this.id_class[2] = var3;
      var3.id_class(new rrwx_3(this, var3, var1));

      try {
         var3.id_class(new rmJ_2(var1, var2, ruv_3.STATUS));
         var3.id_class(new rLS());
      } catch (Throwable var14) {
         String var13 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantPing", var1).getString();
         this.id_class[0] = var13;
      }
   }

   private static void id_throws() {
      id_byte = new long[1];
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[1] = 0L;
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{true, false, true, false, true, false, true, false, true, true};
   }

   private static void id_protected() {
      id_throws = new String[]{
         new String(""),
         new String("ui.proxyserver.ping.pinging"),
         new String("ui.proxyserver.err.cantConnect"),
         new String("ui.proxyserver.err.cantPing"),
         new String("ui.proxyserver.err.cantPing"),
         new String("Server Pinger #%d")
      };
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new ScheduledThreadPoolExecutor(5, (new ThreadFactoryBuilder()).setNameFormat("Server Pinger #%d").setDaemon(true).build())};
      id_break = var0;
   }
}
