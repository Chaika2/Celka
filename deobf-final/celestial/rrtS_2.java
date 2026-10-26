package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtS_2 implements rrTi_1 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;

   public rdn_3 byte_() {
      return (rdn_3)this.class_[0];
   }

   public rrtS_2(rdn_3 var1, String var2, int var3, String var4, rrts_3 var5) {
      this.implements_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Integer var12 = var3;
      this.class_[3] = var12;
      this.class_[2] = var4;
      this.class_[4] = var5;
   }

   public rrtS_2() {
      this.implements_();
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, -41, 56, 31, -37, -101, 110, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String class_() {
      return (String)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7219585156719842765L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2107622072;
   }

   @Override
   public void class_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.class_((rdn_3)this.class_[0]);
      var2.class_((String)this.class_[1]);
      var2.writeInt((Integer)this.class_[3]);
      var2.class_((String)this.class_[2]);
      var2.class_((rrts_3)this.class_[4]);
   }

   @Override
   public void break_(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      rdn_3 var7 = var2.extends_();
      this.class_[0] = var7;
      String var8 = var2.native_();
      this.class_[1] = var8;
      Integer var9 = var2.readInt();
      this.class_[3] = var9;
      String var10 = var2.native_();
      this.class_[2] = var10;
      rrts_3 var11 = var2.class_(rrts_3.class);
      this.class_[4] = var11;
   }

   public String break_() {
      return (String)this.class_[2];
   }

   public rrts_3 throws_() {
      return (rrts_3)this.class_[4];
   }

   private static void catch_() {
      protected_ = new byte[]{5, 3};
   }

   private static void case_() {
      break_ = new short[]{0, 1, 3, 2, 4, 0, 1, 3, 2, 4, 0, 1, 3, 2, 4, 0, 1, 2, 3, 4};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[3] = 0;
      }
   }

   public int protected_() {
      return (Integer)this.class_[3];
   }

   private static void private_() {
      byte_ = new boolean[1];
   }
}
