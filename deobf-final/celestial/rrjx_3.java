package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjx_3 {
   public Object[] break_;
   private static boolean[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   public String[] byte_() {
      return (String[])this.break_[0];
   }

   public rrjx_3(String[] var1, int var2) {
      this.case_();
      this.break_[0] = var1;
      Integer var8 = var2;
      this.break_[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Server{names=" + this.class_() + ", number=" + (Integer)this.break_[1] + "}";
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1415776998;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3895380000036359602L;
   }

   public String class_() {
      return ((String[])this.break_[0])[0];
   }

   public int break_() {
      return (Integer)this.break_[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, 96, 54, 117, 98, -56, 92, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private static void catch_() {
      class_ = new boolean[]{false, true, false};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         this.break_[1] = 0;
      }
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 1, 0, 1};
   }
}
