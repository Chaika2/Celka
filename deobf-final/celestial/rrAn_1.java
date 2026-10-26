package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAn_1 {
   public Object[] class_;
   private static short[] byte_;
   public static Object[] break_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = false;
      }
   }

   public rrAn_1() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, 78, -110, -76, -38, 85, 99, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      return (Boolean)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -190635172;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8504861821528033953L;
   }

   public static rrAn_1 class_(boolean var0) {
      rrAn_1 var10000 = (rrAn_1)break_[0];
      Boolean var5 = var0;
      var10000.class_[0] = var5;
      return (rrAn_1)break_[0];
   }

   public void break_(boolean var1) {
      Boolean var6 = var1;
      this.class_[0] = var6;
   }

   private static void break_() {
      protected_ = new boolean[]{false, true, false, false, true};
   }

   private static void throws_() {
      byte_ = new short[5];
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrAn_1()};
      break_ = var0;
   }
}
