package celestial;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfF_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   public static Object[] class_;
   private static String[] throws_;

   private static void byte_() {
      break_ = new short[2];
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -473348345528649895L;
   }

   public String class_(String var1, String var2) {
      try {
         this.break_(var2);
         Cipher var3 = Cipher.getInstance(throws_[2]);
         var3.init(byte_[0], (SecretKeySpec)class_[break_[1]]);
         return Base64.getEncoder().encodeToString(var3.doFinal(var1.getBytes(StandardCharsets.UTF_8)));
      } catch (Exception var4) {
         return null;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -717892223;
   }

   private static void class_() {
      throws_ = new String[]{new String("SHA-1"), new String("AES"), new String("AES"), new String("AES")};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 86, -109, 96, -56, 99, 74, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{true, true};
   }

   public void break_(String var1) {
      try {
         byte[] var3 = var1.getBytes(StandardCharsets.UTF_8);
         MessageDigest var2 = MessageDigest.getInstance(throws_[0]);
         var3 = var2.digest(var3);
         var3 = Arrays.copyOf(var3, protected_[0]);
         SecretKeySpec var8 = new SecretKeySpec(var3, throws_[1]);
         class_[break_[0]] = var8;
      } catch (NoSuchAlgorithmException var9) {
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{null, "AES"};
      class_ = var0;
   }

   private static void protected_() {
      protected_ = new byte[]{16, 2};
   }
}
