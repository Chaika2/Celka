package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCe_1 extends rrTF<NoSlow> {
   private static boolean[] id_class;

   public rrCe_1(NoSlow var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrAB var1) {
      if (var1.id_catch().id_break() == rdy_3.kU) {
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(rrAb_1 var1) {
      if (var1.id_class() == xu_3.XJ) {
         var1.id_class(true);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 8, -120, 16, -72, -53, -107, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -144101126178709864L;
   }

   private static void id_class() {
      id_class = new boolean[]{true, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1374527869;
   }
}
