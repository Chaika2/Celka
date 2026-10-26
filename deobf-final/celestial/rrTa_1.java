package celestial;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTa_1 extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{true};
   }

   public rrTa_1(rrTe_1 var1) {
      this.protected_();
      this.class_[1] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{10, 76, 96, -119, -18, 65, -43, -69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new byte[]{2};
   }

   public void class_(ChannelHandlerContext var1, BinaryWebSocketFrame var2) throws Exception {
      rrtB_2 var3 = ((rrTU)((rrTe_1)this.class_[1]).class_[0]).case_();
      if (var3.class_((rrTU)((rrTe_1)this.class_[1]).class_[0], var2, var1, true) instanceof rrtE_2 var5) {
         ((rrTY)this.class_[0]).class_(var5.class_());
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6046786626859058031L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1533230339;
   }

   private static void break_() {
      break_ = new short[]{1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public void channelInactive(ChannelHandlerContext var1) {
      ((rrTU)((rrTe_1)this.class_[1]).class_[0]).break_((rrTY)this.class_[0]);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var2.printStackTrace();
      var1.close();
      ((rrTU)((rrTe_1)this.class_[1]).class_[0]).break_((rrTY)this.class_[0]);
   }

   public void channelActive(ChannelHandlerContext var1) {
      rrTU var10000 = (rrTU)((rrTe_1)this.class_[1]).class_[0];
      rrTY var6;
      rrTY var10001 = var6 = new rrTY(var1);
      this.class_[0] = var6;
      var10000.class_(var10001);
   }
}
