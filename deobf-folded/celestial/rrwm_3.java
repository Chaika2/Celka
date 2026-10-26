package celestial;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwm_3 implements MinecraftAccessor {
   private static String[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_class = new String[]{new String(""), new String(""), new String("SOCKS5")};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 608659009;
   }

   public static void id_class(Channel var0) {
      rrwu_3 var1 = (rrwu_3)rrwZ_2.id_class[1];
      if ((Boolean)rrwZ_2.id_class[id_byte[10]]) {
         rrwZ_2.id_class[2] = var1;
         if (var1.id_protected.equals(id_class[2])) {
            ChannelPipeline var10000 = var0.pipeline();
            ChannelHandler[] var10001 = new ChannelHandler[1];
            var10001[id_break[1]] = new Socks5ProxyHandler(
               new InetSocketAddress(var1.id_class(), var1.id_break()),
               var1.id_byte.isEmpty() ? null : var1.id_byte,
               var1.id_class.isEmpty() ? null : var1.id_class
            );
            var10000.addFirst(var10001);
         } else {
            ChannelPipeline var8 = var0.pipeline();
            ChannelHandler[] var9 = new ChannelHandler[1];
            var9[id_break[3]] = new Socks4ProxyHandler(new InetSocketAddress(var1.id_class(), var1.id_break()), var1.id_byte.isEmpty() ? null : var1.id_byte);
            var8.addFirst(var9);
         }
      } else {
         rrwu_3 var7 = new rrwu_3();
         rrwZ_2.id_class[2] = var7;
      }

      if ((LZ)rrwZ_2.id_class[3] != null) {
         ((LZ)rrwZ_2.id_class[3]).id_break(new rgN_2("Proxy: " + rrwZ_2.id_class()));
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, -103, 54, 49, -64, 6, -106, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7165304014308543617L;
   }

   private static void id_class() {
      id_protected = new byte[]{125, 5, 120, 20};
   }

   public static void id_class(vG_2 var0) {
      String var1 = id_import.id_while().id_throws().getName();
      if (!var1.equals((String)rrwN_2.id_break[1])) {
         rrwN_2.id_break[1] = var1;
         if (((HashMap)rrwN_2.id_break[id_byte[2]]).containsKey(var1)) {
            rrwu_3 var7 = (rrwu_3)((HashMap)rrwN_2.id_break[id_byte[3]]).get(var1);
            rrwZ_2.id_class[1] = var7;
         } else if (((HashMap)rrwN_2.id_break[id_byte[5]]).containsKey(id_class[0])) {
            rrwu_3 var8 = (rrwu_3)((HashMap)rrwN_2.id_break[id_byte[6]]).get(id_class[1]);
            rrwZ_2.id_class[1] = var8;
         }
      }

      LZ var9 = var0.id_class(
         new LF(var0.id_package - 125, 5, 120, 20, new rgN_2("Proxy: " + rrwZ_2.id_class()), var1x -> id_import.id_break(new rrwv_3(var0)))
      );
      rrwZ_2.id_class[3] = var9;
   }

   private static void id_break() {
      id_byte = new short[]{1, 1, 0, 0, 1, 0, 0, 1, 3, 1, 0, 2, 2, 3, 3};
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, true, false};
   }
}
