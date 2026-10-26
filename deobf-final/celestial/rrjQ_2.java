package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjQ_2 implements MinecraftAccessor {
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   public static Object[] class_;

   private static void byte_() {
      throws_ = new String[]{new String("шар"), new String("пасхальное яйцо"), new String("голова"), new String("дед-мороз")};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7442691967393647656L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1323322964;
   }

   public static boolean class_(rfH_2 var0) {
      if (rrjc_3.protected_(var0) instanceof JU var2) {
         return var2.break_() == Wf_1.PLAYER ? true : protected_[2];
      } else {
         return protected_[3];
      }
   }

   private static void class_() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{"шар", "пасхальное яйцо", "голова", "дед-мороз"};
      var0[0] = var2;
      class_ = var0;
   }

   public static boolean class_(rdn_3 var0) {
      if (var0.break_() instanceof rkG_2) {
         String var1 = var0.continue_().byte_().toLowerCase();
         return Arrays.<String>stream((String[])class_[0]).anyMatch(var1x -> var1.contains(var1x));
      } else {
         return protected_[0];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, -57, 25, -126, -30, -36, 91, -71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new short[1];
   }

   private static void throws_() {
      byte_ = new byte[]{4, 2, 3};
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true, false, false, false, true, false, true};
   }
}
