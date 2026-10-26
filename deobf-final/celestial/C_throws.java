package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_throws {
   private static boolean[] break_;
   private static short[] byte_;
   public static Object[] class_;
   private static byte[] protected_;

   public static C_class byte_() {
      return (C_class)class_().break_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, 29, 32, 25, 1, -40, 37, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1773539219;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5772819695079633059L;
   }

   public static C_catch class_() {
      return (C_catch)class_[0];
   }

   public static C_private break_() {
      return (C_private)class_[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[2];
      class_ = var0;
      C_private var10002 = new C_private();
      Pd_1.byte_(var10002);
      var0[1] = var10002;
      var0[0] = new C_byte();
   }

   private static void catch_() {
      break_ = new boolean[]{true, true, false};
   }

   private static void case_() {
      byte_ = new short[]{0, 1};
   }

   private static void protected_() {
      protected_ = new byte[]{2};
   }
}
