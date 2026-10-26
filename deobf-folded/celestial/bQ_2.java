package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bQ_2 extends rS_2 {
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[]{0, 2};
   }

   public bQ_2(bW_2 var1, rfH_2 var2) {
      super(var2);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2126161726;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -909482707544349809L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return this.id_class[id_break[0]] == var1 && this.id_class[2] == var3 ? true : id_byte[1];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -63, -58, 88, 34, -100, 68, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false};
   }
}
