package celestial;

import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTY {
   private static short[] break_;
   private static long[] byte_;
   private static byte[] protected_;
   public Object[] class_;

   public String byte_() {
      return (String)this.class_[3];
   }

   public rrTY(ChannelHandlerContext var1) {
      this.catch_();
      rrtb_3 var6 = (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[0];
      this.class_[1] = var6;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public rrtb_3 class_() {
      return (rrtb_3)this.class_[1];
   }

   public void class_(String var1) {
      this.class_[3] = var1;
   }

   public void class_(rrtb_3 var1) {
      this.class_[1] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2022952189;
   }

   public void class_(long var1) {
      Long var7 = var1;
      this.class_[2] = var7;
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6575695543126808997L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{71, 72, -26, 120, 72, 71, 57, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long break_() {
      return (Long)this.class_[2];
   }

   private static void throws_() {
      byte_ = new long[1];
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0L;
      }
   }

   private static void case_() {
      protected_ = new byte[]{4, 2};
   }

   public ChannelHandlerContext protected_() {
      return (ChannelHandlerContext)this.class_[0];
   }

   private static void private_() {
      break_ = new short[]{0, 1, 2, 3, 0, 1, 0, 1, 2, 3};
   }
}
