package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruE {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_break = new boolean[5];
   }

   public rruE() {
      this.id_break();
      Integer var5 = 2;
      this.id_class[id_byte[0]] = var5;
      rrus_1 var6 = (rrus_1)rrus_1.staticFields671469053d923ac8912036fe43a40b51[1];
      this.id_class[1] = var6;
      rrur_1 var7 = (rrur_1)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[1];
      this.id_class[2] = var7;
      rrca_3 var8 = (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[2];
      this.id_class[3] = var8;
      Integer var9 = 25;
      this.id_class[4] = var9;
      Integer var10 = 6;
      this.id_class[5] = var10;
      Integer var11 = 2;
      this.id_class[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1057628547;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{13, -18, 54, -71, -80, 69, 89, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1376371597138239098L;
   }

   private static void id_class() {
      id_byte = new short[]{0, 1, 1, 1, 2, 2, 3, 4, 5, 6};
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[id_break[0]] = Integer.valueOf(id_break[1]);
         var1[4] = Integer.valueOf(id_break[2]);
         var1[5] = Integer.valueOf(id_break[3]);
         var1[6] = Integer.valueOf(id_break[4]);
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{2, 25, 6, 2, 7, 4, 5, 6};
   }
}
