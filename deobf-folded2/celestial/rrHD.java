package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHD implements Comparator<rLY> {
   private static byte[] id_break;
   public static Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, false, true};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -62, -46, -114, -20, 18, -44, 39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1184578071;
   }

   public int id_class(rLY var1, rLY var2) {
      int var3 = ((List)id_class[0]).indexOf(var1.id_class());
      int var4 = ((List)id_class[0]).indexOf(var2.id_class());
      if (var3 == -1 && var4 == -1) {
         return 0;
      } else if (var3 == -1) {
         return 1;
      } else {
         return var4 == -1 ? -1 : Integer.compare(var3, var4);
      }
   }

   private static void id_class() {
      id_break = new byte[]{-1, -1, -1, -1, -1};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4153987677645003447L;
   }

   private static void id_break() {
      id_byte = new short[2];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrHU()};
      id_class = var0;
   }
}
