package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PH {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -741995032;
   }

   public int byte_() {
      return this.protected_() - this.class_();
   }

   public PH(String var1, int var2) {
      this.implements_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -10, -44, -24, 30, 87, -85, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(int var1) {
      this.break_(this.class_() + var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3710832080344191855L;
   }

   public int class_() {
      return (Integer)this.class_[2];
   }

   public String break_() {
      return (String)this.class_[0];
   }

   public void break_(int var1) {
      Integer var6 = var1;
      this.class_[2] = var6;
   }

   public boolean throws_() {
      return this.class_() >= this.protected_() ? true : break_[1];
   }

   private static void catch_() {
      byte_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   private static void case_() {
      protected_ = new byte[]{3, 2};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public int protected_() {
      return (Integer)this.class_[1];
   }

   private static void private_() {
      break_ = new boolean[]{true, false, true, false, false};
   }
}
