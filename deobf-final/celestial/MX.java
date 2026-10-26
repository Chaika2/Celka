package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum MX {
   private static String[] stringsd2fe04b6c6f939bbbb913f5ab83b18e0;

   MX(String var3) {
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1772474197;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6756207835365039437L;
   }

   private static void class_() {
      stringsd2fe04b6c6f939bbbb913f5ab83b18e0 = new String[]{new String("Version"), new String("Unsupported Version of a Sponge Schematic")};
   }

   @Override
   public rw_3 class_(InputStream var1) throws IOException {
      rcd_3 var2 = rcW_2.class_(var1);
      int var3 = var2.private_("Version");
      switch (var3) {
         case 1:
         case 2:
            return new MW(var2);
         default:
            throw new UnsupportedOperationException("Unsupported Version of a Sponge Schematic");
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{118, 18, -79, 28, 81, -43, 1, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
