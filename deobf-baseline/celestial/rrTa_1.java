package celestial;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTa_1 extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{true};
   }

   public rrTa_1(rrTe_1 var1) {
      this.id_protected();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{10, 76, 96, -119, -18, 65, -43, -69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new byte[]{2};
   }

   public void id_class(ChannelHandlerContext var1, BinaryWebSocketFrame var2) throws Exception {
      rrtB_2 var3 = ((rrTU)((rrTe_1)this.id_class[id_break[7]]).id_class[id_break[8]]).id_case();
      if (var3.id_class((rrTU)((rrTe_1)this.id_class[id_break[9]]).id_class[id_break[10]], var2, var1, id_protected[0]) instanceof rrtE_2 var5) {
         ((rrTY)this.id_class[id_break[11]]).id_class(var5.id_class());
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6046786626859058031L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1533230339;
   }

   private static void id_break() {
      id_break = new short[]{1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   public void channelInactive(ChannelHandlerContext var1) {
      ((rrTU)((rrTe_1)this.id_class[id_break[4]]).id_class[id_break[5]]).id_break((rrTY)this.id_class[id_break[6]]);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var2.printStackTrace();
      var1.close();
      ((rrTU)((rrTe_1)this.id_class[id_break[12]]).id_class[id_break[13]]).id_break((rrTY)this.id_class[id_break[14]]);
   }

   public void channelActive(ChannelHandlerContext var1) {
      rrTU var10000 = (rrTU)((rrTe_1)this.id_class[id_break[1]]).id_class[id_break[2]];
      rrTY var6;
      rrTY var10001 = var6 = new rrTY(var1);
      this.id_class[id_break[3]] = var6;
      var10000.id_class(var10001);
   }
}
