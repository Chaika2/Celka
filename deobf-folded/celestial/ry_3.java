package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ry_3 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static byte[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_break[1]);
         var1[2] = Integer.valueOf(id_break[2]);
         var1[3] = Integer.valueOf(id_break[3]);
      }
   }

   public ry_3(rq_3 var1, int var2, int var3, int var4) {
      this.id_byte();
      this.id_class[id_byte[0]] = var1;
      Integer var10 = var2;
      this.id_class[1] = var10;
      Integer var11 = var3;
      this.id_class[2] = var11;
      Integer var12 = var4;
      this.id_class[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8538990649725726379L;
   }

   private static void id_class() {
      id_byte = new short[]{0, 1, 2, 3};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -39, 74, 122, 6, -69, -116, -110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -551747534;
   }

   private static void id_break() {
      id_protected = new byte[]{4, 2, 3};
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, false};
   }
}
