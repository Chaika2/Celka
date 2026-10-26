package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrva_1 extends Pv_1 {
   private static short[] break_;

   public rrva_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new short[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1223192869;
   }

   @Override
   public void class_(rrAM var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrvi_1 var4) {
            var4.class_(var1);
            break;
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5098235311973169137L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, 5, -59, 9, 60, -88, -55, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
