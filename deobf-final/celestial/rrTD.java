package celestial;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.nio.charset.StandardCharsets;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTD extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{true, true, true};
   }

   public rrTD(rrTK var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1296973875;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6909958134031585047L;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, 126, 81, -29, -76, -31, -5, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(ChannelHandlerContext var1, BinaryWebSocketFrame var2) throws Exception {
      rrtB_2 var3 = ((rrTo_1)((rrTK)this.class_[0]).class_[1]).case_();
      var3.class_((rrTo_1)((rrTK)this.class_[0]).class_[1], var2, var1, true);
   }

   private static void break_() {
      break_ = new short[]{0, 0, 1, 2, 0, 1, 6, 0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 0, 1};
   }

   public void channelReadComplete(ChannelHandlerContext var1) throws Exception {
      super.channelReadComplete(var1);

      while (!((Queue)((rrTo_1)((rrTK)this.class_[0]).class_[1]).class_[2]).isEmpty()) {
         rrTi_1 var2 = (rrTi_1)((Queue)((rrTo_1)((rrTK)this.class_[0]).class_[1]).class_[2]).poll();
         ((rrTo_1)((rrTK)this.class_[0]).class_[1]).class_(var2, var1.channel(), true);
      }
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var2.printStackTrace();
      var1.close();
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      ((Queue)((rrTo_1)((rrTK)this.class_[0]).class_[1]).class_[2]).add(new rrtE_2((String)((rrTo_1)((rrTK)this.class_[0]).class_[1]).class_[6]));
   }
}
