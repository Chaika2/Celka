package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvN {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[2];
   }

   rrvN(String var1) {
      this.id_break();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1316676752;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -30, 25, -65, -90, -39, 11, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 990409141764438191L;
   }

   String id_class() {
      return (String)this.id_class[id_break[1]];
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{true};
   }
}
