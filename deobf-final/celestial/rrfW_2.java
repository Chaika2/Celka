package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfW_2 extends ArrayList<rrfz_3> {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrfW_2(rrfk_3 var1) {
      this.byte_();
      this.class_[0] = var1;

      for (rrfx_3 var5 : rrfx_3.values()) {
         if (var5.byte_()) {
            this.add(new rrfz_3((rrfk_3)this.class_[0], var5, var5.break_()));
         }
      }
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7512166251123763148L;
   }

   private static void class_() {
      byte_ = new short[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, 57, 72, 62, -10, -57, 8, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1133804194;
   }

   private static void break_() {
      break_ = new boolean[]{false, true};
   }
}
