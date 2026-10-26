package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GN extends rE_2 {
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[1];
   }

   public GN(GW var1, rfH_2 var2) {
      super(var2);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1540928292;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6965971323449496645L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, 62, -127, -65, 76, -86, 96, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var2 <= this.id_class[id_byte[0]] && (var1 != this.id_class[id_byte[1]] || var2 != this.id_class[id_byte[2]] || var3 != this.id_class[id_byte[3]])
         ? super.id_break(var1, var2, var3)
         : id_break[0];
   }

   private static void id_protected() {
      id_byte = new short[]{1, 0, 1, 2};
   }
}
