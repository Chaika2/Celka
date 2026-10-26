package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtG_2 implements rrTi_1 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public rrtG_2() {
      this.protected_();
   }

   public rrtG_2(String var1, rrtb_3 var2) {
      this.protected_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public rrtb_3 class_() {
      return (rrtb_3)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1101899049325358614L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, 78, -101, -66, -52, 84, 66, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -915668583;
   }

   @Override
   public void class_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.class_((String)this.class_[0]);
      var2.class_((rrtb_3)this.class_[1]);
   }

   @Override
   public void class_(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   @Override
   public void break_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      String var7 = var2.native_();
      this.class_[0] = var7;
      rrtb_3 var8 = var2.class_(rrtb_3.class);
      this.class_[1] = var8;
   }

   public String break_() {
      return (String)this.class_[0];
   }

   private static void throws_() {
      break_ = new short[]{0, 1, 0, 1, 0, 1, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
