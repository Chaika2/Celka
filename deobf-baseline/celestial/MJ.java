package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum MJ {
   private static String[] strings0d5b709486283861898e8c1ef233f216;
   private static boolean[] booleans0d5b709486283861898e8c1ef233f216;

   MJ(String var3) {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8455095678700035939L;
   }

   private static void id_class() {
      strings0d5b709486283861898e8c1ef233f216 = new String[]{
         new String("Version"),
         new String("This litematic Version is too old."),
         new String("This litematic Version is too new."),
         new String("Unsuported Version of a Litematica Schematic")
      };
   }

   @Override
   public rw_3 id_class(InputStream var1) throws IOException {
      rcd_3 var2 = rcW_2.id_class(var1);
      int var3 = var2.id_private(strings0d5b709486283861898e8c1ef233f216[0]);
      switch (var3) {
         case 4:
            throw new UnsupportedOperationException(strings0d5b709486283861898e8c1ef233f216[1]);
         case 5:
            return new Mx_1(var2, booleans0d5b709486283861898e8c1ef233f216[0]);
         case 6:
            throw new UnsupportedOperationException(strings0d5b709486283861898e8c1ef233f216[2]);
         default:
            throw new UnsupportedOperationException(strings0d5b709486283861898e8c1ef233f216[3]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1155011980;
   }

   private static void id_break() {
      booleans0d5b709486283861898e8c1ef233f216 = new boolean[1];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, 40, -29, -102, -17, -27, -27, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
