package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrls_3 extends rrTF<Speed> {
   private static float[] id_class;
   private static short[] id_break;
   private static double[] id_byte;

   private static void id_byte() {
      id_byte = new double[2];
   }

   public rrls_3(Speed var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, 110, 126, 76, 126, 90, 3, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[0]]) {
         if (((cb_3)id_import.id_class[57]).Y()
            || ((cb_3)id_import.id_class[57]).Pe()
            || ((cb_3)id_import.id_class[57]).o_()
            || ((cb_3)id_import.id_class[57]).PZ()) {
            return;
         }

         if (((cb_3)id_import.id_class[57]).BL() && !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
            ((cb_3)id_import.id_class[57]).sl();
            return;
         }

         rjU_2 var2 = ((cb_3)id_import.id_class[57]).rv();
         if (!((cb_3)id_import.id_class[57]).BL()
            && rrfo_3.id_byte()
            && !((gm_3)id_import.id_class[56])
               .a_((cb_3)id_import.id_class[57], ((cb_3)id_import.id_class[57]).rN().id_protected(id_byte[0], var2.id_byte, id_byte[1]))) {
            float var3 = 2.0F;
            var2.id_break *= (double)var3;
            var2.id_protected *= (double)var3;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2005159457;
   }

   private static void id_class() {
      id_break = new short[]{0, 57, 57, 57, 57, 57, 57, 17, 57, 57, 57, 56, 57, 57};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3219978026483362594L;
   }

   private static void id_break() {
      id_class = new float[]{2.0F};
   }
}
