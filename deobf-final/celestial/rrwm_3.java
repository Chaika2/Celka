package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwm_3 implements MinecraftAccessor {
   private static String[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      class_ = new String[]{new String(""), new String(""), new String("SOCKS5")};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 608659009;
   }

   public static void class_(Channel var0) {
      rrwu_3 var1 = (rrwu_3)rrwZ_2.class_[1];
      if ((Boolean)rrwZ_2.class_[0]) {
         rrwZ_2.class_[2] = var1;
         if (var1.protected_.equals("SOCKS5")) {
            var0.pipeline()
               .addFirst(
                  new ChannelHandler[]{
                     new Socks5ProxyHandler(
                        new InetSocketAddress(var1.class_(), var1.break_()),
                        var1.byte_.isEmpty() ? null : var1.byte_,
                        var1.class_.isEmpty() ? null : var1.class_
                     )
                  }
               );
         } else {
            var0.pipeline()
               .addFirst(
                  new ChannelHandler[]{new Socks4ProxyHandler(new InetSocketAddress(var1.class_(), var1.break_()), var1.byte_.isEmpty() ? null : var1.byte_)}
               );
         }
      } else {
         rrwu_3 var7 = new rrwu_3();
         rrwZ_2.class_[2] = var7;
      }

      if ((LZ)rrwZ_2.class_[3] != null) {
         ((LZ)rrwZ_2.class_[3]).break_(new rgN_2("Proxy: " + rrwZ_2.class_()));
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -103, 54, 49, -64, 6, -106, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7165304014308543617L;
   }

   private static void class_() {
      protected_ = new byte[]{125, 5, 120, 20};
   }

   public static void class_(vG_2 var0) {
      String var1 = import_.while_().throws_().getName();
      if (!var1.equals((String)rrwN_2.break_[1])) {
         rrwN_2.break_[1] = var1;
         if (((HashMap)rrwN_2.break_[0]).containsKey(var1)) {
            rrwu_3 var7 = (rrwu_3)((HashMap)rrwN_2.break_[0]).get(var1);
            rrwZ_2.class_[1] = var7;
         } else if (((HashMap)rrwN_2.break_[0]).containsKey("")) {
            rrwu_3 var8 = (rrwu_3)((HashMap)rrwN_2.break_[0]).get("");
            rrwZ_2.class_[1] = var8;
         }
      }

      LZ var9 = var0.class_(new LF(var0.package_ - 125, 5, 120, 20, new rgN_2("Proxy: " + rrwZ_2.class_()), var1x -> import_.break_(new rrwv_3(var0))));
      rrwZ_2.class_[3] = var9;
   }

   private static void break_() {
      byte_ = new short[]{1, 1, 0, 0, 1, 0, 0, 1, 3, 1, 0, 2, 2, 3, 3};
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, true, false};
   }
}
