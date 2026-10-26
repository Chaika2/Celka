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
   public Object[] class_;
   private static long[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   private static byte[] case_;
   public static Object[] break_;
   private static short[] catch_;

   private static void byte_() {
      catch_ = new short[]{0, 2, 3, 0, 0, 0, 0, 2, 0, 2, 2, 2, 2};
   }

   public rrwJ_2() {
      this.catch_();
      String var5 = "";
      this.class_[0] = var5;
      Object var6 = null;
      this.class_[2] = var6;
   }

   static {
      ntfClinit();
   }

   private rud_3 class_(InetAddress var1, int var2) {
      rud_3 var3 = new rud_3(rum_3.CLIENTBOUND);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)rud_3.protected_.class_())).handler(new rrwd_3(this, var3)))
            .channel(NioSocketChannel.class))
         .connect(var1, var2)
         .syncUninterruptibly();
      return var3;
   }

   public void class_(String var1, int var2, rrwu_3 var3) {
      this.class_[3] = var3;
      ((ThreadPoolExecutor)break_[0]).submit(() -> this.break_(var1, var2));
   }

   public void class_() {
      if ((rud_3)this.class_[2] != null) {
         if (((rud_3)this.class_[2]).case_()) {
            ((rud_3)this.class_[2]).class_();
         } else {
            ((rud_3)this.class_[2]).native_();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1882893313;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-22, 57, 76, -84, 113, -89, 17, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3000857890993572813L;
   }

   private static void break_() {
      case_ = new byte[]{5, 4};
   }

   private void break_(String var1, int var2) {
      String var9 = new rgn_3("ui.proxyserver.ping.pinging", var1).getString();
      this.class_[0] = var9;

      rud_3 var3;
      try {
         var3 = this.class_(InetAddress.getByName(var1), var2);
      } catch (UnknownHostException var15) {
         String var10 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantConnect").getString();
         this.class_[0] = var10;
         return;
      } catch (Exception var16) {
         String var11 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantPing", var1).getString();
         this.class_[0] = var11;
         return;
      }

      this.class_[2] = var3;
      var3.class_(new rrwx_3(this, var3, var1));

      try {
         var3.class_(new rmJ_2(var1, var2, ruv_3.STATUS));
         var3.class_(new rLS());
      } catch (Throwable var14) {
         String var13 = rgF_2.RED + new rgn_3("ui.proxyserver.err.cantPing", var1).getString();
         this.class_[0] = var13;
      }
   }

   private static void throws_() {
      byte_ = new long[1];
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = 0L;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{true, false, true, false, true, false, true, false, true, true};
   }

   private static void protected_() {
      throws_ = new String[]{
         new String(""),
         new String("ui.proxyserver.ping.pinging"),
         new String("ui.proxyserver.err.cantConnect"),
         new String("ui.proxyserver.err.cantPing"),
         new String("ui.proxyserver.err.cantPing"),
         new String("Server Pinger #%d")
      };
   }

   private static void private_() {
      Object[] var0 = new Object[]{new ScheduledThreadPoolExecutor(5, (new ThreadFactoryBuilder()).setNameFormat("Server Pinger #%d").setDaemon(true).build())};
      break_ = var0;
   }
}
