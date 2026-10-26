package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZV {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static long[] id_throws;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[0]] = Integer.valueOf(id_byte[1]);
         var1[id_byte[2]] = id_throws[1];
         var1[id_break[1]] = id_throws[2];
         var1[id_break[2]] = Integer.valueOf(id_byte[3]);
      }
   }

   rrZV() {
      this.id_byte();
      Long var5 = id_throws[0];
      this.id_class[id_protected[0]] = var5;
      HashMap var6 = new HashMap();
      this.id_class[id_protected[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2629989135903626820L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, -7, 46, -62, 0, 3, -30, 79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1668703629;
   }

   private static void id_class() {
      id_break = new byte[]{6, 2, 5};
   }

   private static void id_break() {
      id_protected = new short[]{2, 3};
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, false, true, false};
   }

   private static void id_protected() {
      id_throws = new long[]{Long.MAX_VALUE, 0L, 0L};
   }
}
