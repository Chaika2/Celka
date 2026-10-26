package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrni_3 implements rrTf_1 {
   private static double[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static float[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrni_3(rrna_3 var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7357703450379031034L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -71, -12, 77, -35, 86, -17, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new double[]{-0.5, 0.5, -0.5, 0.5};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1436078237;
   }

   private static void break_() {
      throws_ = new float[]{16.0F, 0.8F, 4.0F};
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 1, 0, 0, 0, 57, 41, 57, 41};
   }

   private static void protected_() {
      protected_ = new boolean[]{true};
   }

   @Override
   public PX processRandom(PX var1, PX var2) {
      float var3 = var2.throws_();
      float var4 = var2.protected_();
      if ((Boolean)((rrna_3)this.class_[0]).byte_[1] && !((rrna_3)this.class_[0]).synchronized_() && ((rrna_3)this.class_[0]).continue_().continue_() != null) {
         Pr_1 var5 = ((rrna_3)this.class_[0]).implements_().protected_();
         var3 += (float)rrfQ_2.class_(var5, -0.5, 0.5);
         var4 += (float)rrfQ_2.class_(var5, -0.5, 0.5);
         var3 += rfU_2.class_((float)((Integer)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[41]).intValue()) * 16.0F;
         var4 += rfU_2.class_((float)((Integer)((cb_3)MinecraftAccessor.import_.class_[57]).throws_[41]).intValue() * 0.8F) * 4.0F;
      }

      return new PX(var3, var4);
   }
}
