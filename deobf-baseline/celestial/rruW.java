package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruW {
   private static byte[] id_break;
   private static float[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
         var1[id_break[1]] = id_byte[0];
      }
   }

   public rruW(rruk_1 var1, rruk_1 var2, float var3) {
      this.id_byte();
      this.id_class[id_protected[0]] = var1;
      this.id_class[id_protected[1]] = var2;
      Float var10 = var3;
      this.id_class[id_protected[2]] = var10;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, 27, 77, 29, 102, 75, -13, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1396608766;
   }

   private static void id_class() {
      id_byte = new float[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6513212307341370335L;
   }

   private static void id_break() {
      id_break = new byte[]{3, 2};
   }

   private static void id_protected() {
      id_protected = new short[]{0, 1, 2};
   }
}
