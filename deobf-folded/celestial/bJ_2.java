package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bJ_2 extends rS_2 {
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[]{0, 2};
   }

   public bJ_2(bX_2 var1, rfH_2 var2) {
      super(var2);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1189011213175720384L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1109984009;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return this.id_class[id_byte[0]] == var1 && this.id_class[2] == var3 ? true : id_break[1];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, -70, -24, -59, -59, -113, -69, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false};
   }
}
