package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtM_2 implements rrTi_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   public int byte_() {
      return (Integer)this.class_[3];
   }

   public rrtM_2() {
      this.private_();
   }

   public rrtM_2(rdn_3 var1, String var2, String var3, int var4) {
      this.private_();
      this.class_[0] = var1;
      this.class_[2] = var3;
      this.class_[1] = var2;
      Integer var12 = var4;
      this.class_[3] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -97, 55, 108, -88, 28, -12, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.class_((rdn_3)this.class_[0]);
      var2.class_((String)this.class_[2]);
      var2.class_((String)this.class_[1]);
      var2.writeInt((Integer)this.class_[3]);
   }

   public String class_() {
      return (String)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 841965896;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7264902911505791819L;
   }

   @Override
   public void break_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      rdn_3 var7 = var2.extends_();
      this.class_[0] = var7;
      String var8 = var2.native_();
      this.class_[2] = var8;
      String var9 = var2.native_();
      this.class_[1] = var9;
      Integer var10 = var2.readInt();
      this.class_[3] = var10;
   }

   public rdn_3 break_() {
      return (rdn_3)this.class_[0];
   }

   private static void throws_() {
      protected_ = new byte[]{4, 3};
   }

   private static void catch_() {
      break_ = new boolean[1];
   }

   private static void case_() {
      byte_ = new short[]{0, 2, 1, 3, 0, 2, 1, 3, 0, 2, 1, 3, 0, 1, 2, 3};
   }

   public String protected_() {
      return (String)this.class_[2];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[3] = 0;
      }
   }
}
