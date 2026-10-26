package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bL_2 extends rU_2 {
   private static short[] catch_;

   public bL_2 byte_(rpr_3 var1) {
      return new bL_2((Integer)this.break_[0] + var1.implements_(), (Integer)this.break_[1] + var1.finally_(), (Integer)this.break_[2] + var1.extends_());
   }

   public bL_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public bL_2 class_(rja_3 var1) {
      return new bL_2((Integer)this.break_[0] + var1.b_(), (Integer)this.break_[1] + var1.c_(), (Integer)this.break_[2] + var1.d_());
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, 35, 61, 89, 99, -104, -9, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long case_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -555794058631369404L;
   }

   private static void continue_() {
      catch_ = new short[]{0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static int package_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 145150951;
   }

   public bL_2 protected_(int var1, int var2, int var3) {
      return new bL_2((Integer)this.break_[0] + var1, (Integer)this.break_[1] + var2, (Integer)this.break_[2] + var3);
   }
}
