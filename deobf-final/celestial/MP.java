package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class MP implements a_1 {
   private static short[] class_;
   private static boolean[] break_;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5080181844749200708L;
   }

   public MP break_(Object var1) {
      if (!(Boolean)C_class.instanceof_().return_.class_[0]) {
         return this;
      } else {
         bw_3 var2 = (bw_3)var1;

         for (int var3 = 0; var3 < this.break_().size(); var3++) {
            rfH_2 var4 = this.break_().get(var3);
            if (!var2.class_(var4.b_(), var4.d_())) {
               return new GO(this, var3);
            }
         }

         return this;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-75, -15, -33, -59, 109, 33, -114, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 555818743;
   }

   public MP break_(rP_2 var1) {
      int var2 = (Integer)C_throws.break_().ra.class_[0];
      if (this.class_() < var2) {
         return this;
      } else if (var1 != null && !var1.break_(this.protected_())) {
         double var3 = (Double)C_throws.break_().final_.class_[0];
         int var5 = (int)((double)(this.class_() - var2) * var3) + var2 - 1;
         return new GO(this, var5);
      } else {
         return this;
      }
   }

   private static void finally_() {
      class_ = new short[3];
   }

   private static void extends_() {
      break_ = new boolean[]{false, true};
   }
}
