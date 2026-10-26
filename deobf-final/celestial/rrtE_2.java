package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtE_2 implements rrTi_1 {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrtE_2() {
      this.byte_();
   }

   public rrtE_2(String var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1245007638;
   }

   @Override
   public void class_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.class_((String)this.class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -127, 107, -14, -72, 125, -62, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6932505172077912646L;
   }

   public String class_() {
      return (String)this.class_[0];
   }

   @Override
   public void class_(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   @Override
   public void break_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      String var7 = var2.native_();
      this.class_[0] = var7;
   }

   private static void break_() {
      byte_ = new short[4];
   }

   private static void protected_() {
      break_ = new boolean[]{true};
   }
}
