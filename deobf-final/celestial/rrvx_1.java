package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrvx_1 {
   private static float[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private static void byte_() {
      break_ = new float[]{0.55F, 1.0F};
   }

   public rrvx_1() {
      this.break_();
      AnimValue var5 = new AnimValue(0.55F, true);
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public void class_(Runnable var1, Ml_1 var2, float var3, float var4, float var5, float var6) {
      rrvJ.class_(var2, var3, var4, (int)var5, (int)var6);
      var1.run();
      rrvJ.final_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2141109568;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1218084674821103428L;
   }

   public void class_(
      Ml_1 var1, rrZl_1 var2, rrtu_3 var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10, int var11, boolean var12
   ) {
      AnimValue var13 = var2.package_();
      float var14 = ((AnimValue)this.class_[0]).byte_();
      if (!var2.int_() && var14 < 1.0F) {
         boolean var15 = var10 > var9 ? true : byte_[2];
         if (var15) {
            var13.class_();
         } else {
            var13.extends_();
         }
      }

      int var16 = var2.int_() ? (int)((float)var11 * var14) : (int)((float)var11 * var13.byte_() * var14);
      var2.class_(var1, var3, var4, var5, var6, var7, var8, var10, var9, var12, (float)var16);
   }

   public AnimValue class_() {
      return (AnimValue)this.class_[0];
   }

   public Pair<Float, Boolean> class_(rrZl_1 var1) {
      AnimValue var2 = var1.package_();
      return Pair.of(var2.byte_(), var2.case_());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, 27, -21, 73, 76, 24, -78, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{true, true, false, true};
   }

   private static void protected_() {
      protected_ = new short[3];
   }
}
