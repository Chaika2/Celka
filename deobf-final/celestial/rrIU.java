package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIU implements MinecraftAccessor {
   private static double[] class_;
   private static float[] break_;
   private static short[] byte_;

   private static void byte_() {
      class_ = new double[]{0.0, 0.4, 0.0};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 102, -32, -98, -11, -46, -68, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_() {
      if (!(Boolean)((cb_3)import_.class_[57]).break_[42]) {
         float var0 = ((cb_3)import_.class_[57]).Sa().nextFloat() * 0.05F;
         cb_3 var10000 = (cb_3)import_.class_[57];
         Float var5 = var0;
         var10000.break_[49] = var5;
         var10000 = (cb_3)import_.class_[57];
         Float var6 = var0;
         var10000.break_[50] = var6;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1498795957;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4823372435021610040L;
   }

   public static void break_() {
      rfH_2 var0 = ((cb_3)import_.class_[57]).Bs().byte_(0.0, 0.4, 0.0);
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.STOP_DESTROY_BLOCK, var0, rpr_3.UP));
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).break_(new rZb_1(rZM.START_DESTROY_BLOCK, var0, rpr_3.UP));
   }

   private static void throws_() {
      byte_ = new short[]{57, 42, 57, 57, 49, 57, 50, 57, 57, 0, 57, 0};
   }

   private static void protected_() {
      break_ = new float[]{0.05F};
   }
}
