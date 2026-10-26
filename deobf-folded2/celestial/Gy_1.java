package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gy_1 extends rX_2 {
   private static short[] id_byte;

   public Gy_1(int var1, int var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1347483465476853308L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1126616058;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      return super.id_class(var1, var2, var3) + rJ_2.id_class((Integer)C_class.id_instanceof().rP.id_class[0], var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, -69, 67, 66, 100, -121, -85, -40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_protected() {
      id_byte = new short[1];
   }
}
