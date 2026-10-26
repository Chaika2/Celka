package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class MP implements a_1 {
   private static short[] id_class;
   private static boolean[] id_break;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5080181844749200708L;
   }

   public MP id_break(Object var1) {
      if (!(Boolean)C_class.id_instanceof().id_return.id_class[0]) {
         return this;
      } else {
         bw_3 var2 = (bw_3)var1;

         for (int var3 = 0; var3 < this.id_break().size(); var3++) {
            rfH_2 var4 = this.id_break().get(var3);
            if (!var2.id_class(var4.b_(), var4.d_())) {
               return new GO(this, var3);
            }
         }

         return this;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-75, -15, -33, -59, 109, 33, -114, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 555818743;
   }

   public MP id_break(rP_2 var1) {
      int var2 = (Integer)C_throws.id_break().ra.id_class[0];
      if (this.id_class() < var2) {
         return this;
      } else if (var1 != null && !var1.id_break(this.id_protected())) {
         double var3 = (Double)C_throws.id_break().id_final.id_class[0];
         int var5 = (int)((double)(this.id_class() - var2) * var3) + var2 - 1;
         return new GO(this, var5);
      } else {
         return this;
      }
   }

   private static void id_finally() {
      id_class = new short[3];
   }

   private static void id_extends() {
      id_break = new boolean[]{false, true};
   }
}
