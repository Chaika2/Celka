package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjW_2 {
   public static Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;
   private static String[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{"SnowBall", "STUN_STAR", "ExplosiveStuff", "EXPLOSIVE_TRAP", "ALTERNATIVE_TRAP", "backpack-inventory"};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -120, -81, -41, 102, -50, -55, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -936417963320825261L;
   }

   private static void class_() {
      protected_ = new String[]{
         new String("SnowBall"),
         new String("STUN_STAR"),
         new String("ExplosiveStuff"),
         new String("EXPLOSIVE_TRAP"),
         new String("ALTERNATIVE_TRAP"),
         new String("backpack-inventory")
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -653868657;
   }

   private static void break_() {
      break_ = new byte[]{6, 2, 3, 4, 5};
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true};
   }
}
