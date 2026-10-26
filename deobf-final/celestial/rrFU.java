package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFU {
   private static short[] break_;
   private static boolean[] byte_;
   public static Object[] class_;

   private static void byte_() {
      break_ = new short[3];
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1520241811003773213L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1160008550;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, 90, 50, -67, 102, 40, -48, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_() {
      rrFU var0 = protected_();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var0);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var0);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrFU()};
      class_ = var0;
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true};
   }

   private static rrFU protected_() {
      return (rrFU)class_[0];
   }
}
