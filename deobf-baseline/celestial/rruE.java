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
      Integer var5 = Integer.valueOf(id_protected[0]);
      this.id_class[id_byte[0]] = var5;
      rrus_1 var6 = (rrus_1)rrus_1.staticFields671469053d923ac8912036fe43a40b51[id_byte[1]];
      this.id_class[id_byte[2]] = var6;
      rrur_1 var7 = (rrur_1)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[id_byte[3]];
      this.id_class[id_byte[4]] = var7;
      rrca_3 var8 = (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[id_byte[5]];
      this.id_class[id_byte[6]] = var8;
      Integer var9 = Integer.valueOf(id_protected[1]);
      this.id_class[id_byte[7]] = var9;
      Integer var10 = Integer.valueOf(id_protected[2]);
      this.id_class[id_byte[8]] = var10;
      Integer var11 = Integer.valueOf(id_protected[3]);
      this.id_class[id_byte[9]] = var11;
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
         this.id_class = new Object[id_protected[4]];
         Object[] var1 = this.id_class;
         var1[id_break[0]] = Integer.valueOf(id_break[1]);
         var1[id_protected[5]] = Integer.valueOf(id_break[2]);
         var1[id_protected[6]] = Integer.valueOf(id_break[3]);
         var1[id_protected[7]] = Integer.valueOf(id_break[4]);
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{2, 25, 6, 2, 7, 4, 5, 6};
   }
}
