package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTN extends rJr_1 implements rXi_1 {
   public static Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] catch_;
   public Object[] break_;

   private void byte_() {
      this.throws_();

      for (int var1 = 0; var1 < 3; var1++) {
         for (int var2 = 0; var2 < 9; var2++) {
            int var3 = var2 + var1 * 9;
            int var4 = 8 + var2 * 18;
            int var5 = 18 + var1 * 18;
            this.break_(new rrTc_1((rXu_1)this.break_[0], var3, var4, var5));
         }
      }
   }

   public rrTN(List<rdn_3> var1) {
      super(null, -1);
      this.throws_();
      rXu_1 var6 = this.break_(var1);
      this.break_[0] = var6;
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      byte_ = new boolean[]{false, false, false, true, false, true, true, false};
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return false;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 110, -117, -33, -105, 63, -26, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      return rdn_3.break_;
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return true;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6055793232411197489L;
   }

   private static void break_() {
      Object[] var0 = new Object[]{27};
      class_ = var0;
   }

   private rXu_1 break_(List<rdn_3> var1) {
      rXA var2 = new rXA(27);

      for (int var3 = 0; var3 < Math.min(var1.size(), 27); var3++) {
         rdn_3 var4 = (rdn_3)var1.get(var3);
         if (var4 != null && !var4.class_()) {
            var2.break_(var3, var4.implements_());
         }
      }

      return var2;
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }

   private static void case_() {
      protected_ = new short[2];
   }

   private static int protected_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1337217027;
   }

   private static void protected_() {
      catch_ = new byte[]{-1, 27, 27, 3, 9, 9, 8, 18, 18, 18, 27};
   }
}
