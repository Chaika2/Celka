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
   private static short[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public static Object[] id_class;
   private static String[] id_throws;

   private static void id_byte() {
      id_break = new short[2];
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -473348345528649895L;
   }

   public String id_class(String var1, String var2) {
      try {
         this.id_break(var2);
         Cipher var3 = Cipher.getInstance(id_throws[2]);
         var3.init(1, (SecretKeySpec)id_class[id_break[1]]);
         return Base64.getEncoder().encodeToString(var3.doFinal(var1.getBytes(StandardCharsets.UTF_8)));
      } catch (Exception var4) {
         return null;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -717892223;
   }

   private static void id_class() {
      id_throws = new String[]{new String("SHA-1"), new String("AES"), new String("AES"), new String("AES")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 86, -109, 96, -56, 99, 74, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true};
   }

   public void id_break(String var1) {
      try {
         byte[] var3 = var1.getBytes(StandardCharsets.UTF_8);
         MessageDigest var2 = MessageDigest.getInstance(id_throws[0]);
         var3 = var2.digest(var3);
         var3 = Arrays.copyOf(var3, 16);
         SecretKeySpec var8 = new SecretKeySpec(var3, id_throws[1]);
         id_class[id_break[0]] = var8;
      } catch (NoSuchAlgorithmException var9) {
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{null, id_throws[3]};
      id_class = var0;
   }

   private static void id_protected() {
      id_protected = new byte[]{16, 2};
   }
}
