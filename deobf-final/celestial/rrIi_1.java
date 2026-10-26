package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIi_1 implements MinecraftAccessor {
   private static boolean[] class_;
   private static float[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static double[] throws_;

   private static void byte_() {
      class_ = new boolean[]{false, true, true, false, true, true, false, true, true, false, true, true, false, true, true};
   }

   static {
      ntfClinit();
   }

   public static float class_(float var0) {
      return ((cb_3)import_.class_[57]).throws_[41] % 2 == 0 ? var0 - 1.0E-4F : var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 111, -122, -2, 42, 109, 121, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(rrfB_2 var0, double var1, double var3, double var5) {
      switch (((int[])rrfr_3.class_[0])[var0.ordinal()]) {
         case 1:
            for (int var10 = class_[0]; var10 < 12; var10++) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(var1, var3, var5, true));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(var1, var3 + 0.1F, var5, true));
            }

            for (int var11 = class_[3]; var11 < 12; var11++) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(((cb_3)import_.class_[57]).rx(), var3, ((cb_3)import_.class_[57]).BO(), true));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0])
                  .break_(new rZh_1(((cb_3)import_.class_[57]).rx(), var3 + 0.1F, ((cb_3)import_.class_[57]).BO(), true));
            }
            break;
         case 2:
         case 3:
            for (int var7 = class_[6]; var7 < 12; var7++) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(var1, var3, var5, true));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(var1, var3 + 0.1F, var5, true));
            }

            for (int var8 = class_[9]; var8 < 12; var8++) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(((cb_3)import_.class_[57]).rx(), var3, ((cb_3)import_.class_[57]).BO(), true));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0])
                  .break_(new rZh_1(((cb_3)import_.class_[57]).rx(), var3 + 0.1F, ((cb_3)import_.class_[57]).BO(), true));
            }

            for (int var9 = class_[12]; var9 < 12; var9++) {
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(var1, var3, var5, true));
               ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZh_1(var1, var3, var5, true));
            }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1123644771;
   }

   private static void class_() {
      byte_ = new byte[]{12, 12, 12, 12, 12, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4908910862679697599L;
   }

   private static void break_() {
      break_ = new float[]{1.0E-4F};
   }

   private static void throws_() {
      protected_ = new short[]{0, 57, 0, 57, 0, 57, 0, 57, 57, 57, 0, 57, 57, 57, 0, 57, 0, 57, 0, 57, 57, 57, 0, 57, 57, 57, 0, 57, 0, 57, 41};
   }

   private static void protected_() {
      throws_ = new double[]{0.1F, 0.1F, 0.1F, 0.1F};
   }
}
