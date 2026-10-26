package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCe_1 extends rrTF<NoSlow> {
   private static boolean[] class_;

   public rrCe_1(NoSlow var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAB var1) {
      if (var1.catch_().break_() == rdy_3.kU) {
         var1.class_(true);
      }
   }

   @EventTarget
   public void class_(rrAb_1 var1) {
      if (var1.class_() == xu_3.XJ) {
         var1.class_(true);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 8, -120, 16, -72, -53, -107, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -144101126178709864L;
   }

   private static void class_() {
      class_ = new boolean[]{true, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1374527869;
   }
}
