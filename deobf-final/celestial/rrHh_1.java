package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHh_1 extends HashMap<xd_3, Integer> {
   private static boolean[] class_;
   private static byte[] break_;

   public rrHh_1() {
      this.put(xu_3.Jx, Integer.valueOf(7));
      this.put(xu_3.ri, Integer.valueOf(6));
      this.put(xu_3.Sk, Integer.valueOf(5));
      this.put(xu_3.abstract_, Integer.valueOf(4));
      this.put(xu_3.long_, Integer.valueOf(3));
      this.put(xu_3.m, Integer.valueOf(2));
      this.put(xu_3.Pl, Integer.valueOf(1));
      this.put(xu_3.float_, Integer.valueOf(0));
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1764968981;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, -28, -77, -65, 124, -89, -10, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2345998190961028242L;
   }

   private static void class_() {
      class_ = new boolean[]{true, false};
   }

   private static void break_() {
      break_ = new byte[]{7, 6, 5, 4, 3, 2};
   }
}
