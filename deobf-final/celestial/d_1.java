package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class d_1 extends J {
   public Object[] class_;
   private static byte[] break_;
   private static String[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      throws_ = new boolean[]{false, true, true, true};
   }

   public d_1(C_import var1, String var2) {
      super(class_(var1, var2));
      this.class_();
      this.class_[0] = var1;
   }

   public d_1(C_import var1, String var2, Throwable var3) {
      super(class_(var1, var2), var3);
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static String class_(C_import var0, String var1) {
      return String.format("Ошибка при аргументе #%s: %s", var0.class_() == -1 ? "<unknown>" : Integer.toString(var0.class_() + 1), var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -63878381;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7486242441194048241L;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 92, 81, 57, -108, -50, -111, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new String[]{new String("Ошибка при аргументе #%s: %s"), new String("<unknown>")};
   }

   private static void throws_() {
      protected_ = new short[2];
   }

   private static void protected_() {
      break_ = new byte[]{2, -1};
   }
}
