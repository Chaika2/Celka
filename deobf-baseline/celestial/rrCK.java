package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCK extends rrTF<Flight> {
   private static float[] id_class;

   public rrCK(Flight var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5309789042226583512L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 813178784;
   }

   @EventTarget
   public void id_class(rrAs_1 var1) {
      var1.id_class((double)(this.id_continue().id_super().id_byte() / id_class[0]));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-125, 27, -89, 25, -62, 24, 69, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new float[]{10.0F};
   }
}
