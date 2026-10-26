package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class N extends x_1 {
   public Object[] class_;
   private static String[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{true, false, true};
   }

   public N(String var1) {
      super(String.format("Команда не найдена: %s", var1));
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(C_interface var1, List<C_import> var2) {
      PP.a_.case_(this.getMessage());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 357345980578508876L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, -128, -86, -73, -100, 14, -97, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new short[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1862701993;
   }

   private static void break_() {
      break_ = new String[]{new String("Команда не найдена: %s")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
