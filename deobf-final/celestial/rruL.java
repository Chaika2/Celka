package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruL {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new short[8];
   }

   public rruL() {
      this.throws_();
      ArrayList var5 = new ArrayList();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      for (int var6 = ((List)this.class_[0]).size() - 1; var6 >= 0; var6--) {
         rruF var7 = (rruF)((List)this.class_[0]).get(var6);
         if (var7.protected_().break_((float)var2, (float)var3) && var7.class_(var1, var2, var3, var4, var5)) {
            return true;
         }
      }

      return break_[2];
   }

   public List<rruF> class_() {
      return (List<rruF>)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, 122, 26, -73, -7, 126, 110, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -655533607;
   }

   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5, boolean var6) {
      if (!var6) {
         for (rruF var8 : (List)this.class_[0]) {
            var8.class_(var1, var2, var3, var4, var5);
         }
      }
   }

   public void class_(rruF... var1) {
      ((List)this.class_[0]).addAll(Arrays.asList(var1));
   }

   public void class_(float var1) {
      for (rruF var3 : (List)this.class_[0]) {
         if (var3.break_()) {
            var3.case_().byte_(var1);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2901200006721061486L;
   }

   public void break_(float var1) {
      for (rruF var3 : (List)this.class_[0]) {
         if (var3.break_()) {
            var3.case_().break_(var1);
         }
      }
   }

   public void break_() {
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new boolean[]{true, true, false, true};
   }
}
