package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLF {
   public Object[] class_;
   private static boolean[] byte_;
   public static Object[] break_;
   private static byte[] protected_;
   private static short[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rrLF() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public static rrLF class_(rnB_2 var0, rgP_2 var1) {
      rrLF var2 = break_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
      return var2;
   }

   public rgP_2 class_() {
      return (rgP_2)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, 116, -27, 122, -103, 62, 68, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rgP_2 var1) {
      this.class_[1] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -83131796841881780L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1132904086;
   }

   public static rrLF break_(rnB_2 var0, rgP_2 var1) {
      ((rrLF)break_[0]).class_[0] = var0;
      ((rrLF)break_[0]).class_[1] = var1;
      return (rrLF)break_[0];
   }

   public rnB_2 break_() {
      return (rnB_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrLF()};
      break_ = var0;
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1, 1};
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }
}
