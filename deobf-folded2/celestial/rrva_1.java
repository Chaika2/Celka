package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrva_1 extends Pv_1 {
   private static short[] id_break;

   public rrva_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new short[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1223192869;
   }

   @Override
   public void id_class(rrAM var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[0]).id_class()) {
         if (var3 instanceof rrvi_1 var4) {
            var4.id_class(var1);
            break;
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5098235311973169137L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, 5, -59, 9, 60, -88, -55, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
