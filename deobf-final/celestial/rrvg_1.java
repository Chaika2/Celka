package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvg_1 {
   private static boolean[] class_;
   private static short[] break_;
   private static float[] byte_;

   private static void byte_() {
      byte_ = new float[]{225.0F, 0.0F, 90.0F, 270.0F, 180.0F, 2.0F, 1.0F, 2.0F, 255.0F};
   }

   static {
      ntfClinit();
   }

   private static void class_(rrtN_2 var0, Ml_1 var1, float var2, float var3) {
      float var4 = var0.long_();
      int var5 = (int)(225.0F * var4);
      int var6 = ColorHelper.class_(0.0F, var5);
      int var7 = ColorHelper.class_(90.0F, var5);
      int var8 = ColorHelper.class_(270.0F, var5);
      int var9 = ColorHelper.class_(180.0F, var5);
      float var10 = var0.implements_();
      float var11 = var0.ao_();
      rrfD_2.class_(var1, var2, var3, var10, var11, var5, var6, var7, var8, var9, true);
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .protected_()
         .byte_(var1, var0.byte_(), var2 + var10 / 2.0F + 1.0F, var3 + 2.0F, ColorHelper.break_(rrZF.d_, (int)(255.0F * var4)), false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -514924292;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5052710784145900207L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 54, -25, 90, -89, -96, -15, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(rrtN_2 var0, Ml_1 var1, Runnable var2) {
      class_(var0, var1, var0.default_(), var0.abstract_());
      var2.run();
   }

   private static void class_() {
      break_ = new short[1];
   }

   private static void break_() {
      class_ = new boolean[]{true, false};
   }
}
