package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzl_3 extends rrzC_2 {
   private static boolean[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_protected = new byte[]{127};
   }

   @Override
   public byte[] id_byte(String var1) {
      for (int var2 = id_byte[0]; var2 < var1.length(); var2++) {
         if (var1.charAt(var2) > 127) {
            return super.id_byte(var1);
         }
      }

      return var1.getBytes(StandardCharsets.ISO_8859_1);
   }

   public rrzl_3() {
      super(StandardCharsets.UTF_8);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3898409757145281948L;
   }

   @Override
   public String id_class(byte[] var1) {
      byte[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = id_byte[1]; var4 < var3; var4++) {
         byte var5 = var2[var4];
         if (var5 < 0) {
            return super.id_class(var1);
         }
      }

      return new String(var1, StandardCharsets.ISO_8859_1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2008565214;
   }

   private static void id_break() {
      id_byte = new boolean[2];
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 27, 31, -7, -25, -51, 82, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
