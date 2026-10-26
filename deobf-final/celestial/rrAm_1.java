package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAm_1 {
   private static boolean[] byte_;
   private static short[] protected_;
   public static Object[] class_;
   public Object[] break_;
   private static byte[] throws_;

   private static void byte_() {
      throws_ = new byte[]{2};
   }

   public rrAm_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public vm_3 class_() {
      return (vm_3)this.break_[0];
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[1] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, -83, -52, 68, 44, -38, -69, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1050662598;
   }

   public static rrAm_1 class_(vm_3 var0) {
      ((rrAm_1)class_[0]).break_[0] = var0;
      rrAm_1 var10000 = (rrAm_1)class_[0];
      Boolean var6 = false;
      var10000.break_[1] = var6;
      return (rrAm_1)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8580315293209524696L;
   }

   public boolean break_() {
      return (Boolean)this.break_[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAm_1()};
      class_ = var0;
   }

   private static void catch_() {
      byte_ = new boolean[]{false, false, true, false, true};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 1, 1};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[1] = false;
      }
   }
}
