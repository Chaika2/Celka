package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnn_3 implements rrTf_1 {
   public Object[] class_;
   private static short[] break_;
   private static float[] byte_;
   private static boolean[] protected_;
   private static double[] throws_;

   private static void byte_() {
      protected_ = new boolean[]{true, true, true};
   }

   public rrnn_3(AutoExplosion var1) {
      this.class_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 107, 9, -112, -73, -67, -25, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3974957009043968563L;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 27166978;
   }

   private static void break_() {
      throws_ = new double[]{-0.2F, 0.2F, -0.2F, 0.2F};
   }

   private static void throws_() {
      byte_ = new float[]{5.0F, 5.0F};
   }

   private static void protected_() {
      break_ = new short[]{0, 0, 8, 57, 16, 57, 16};
   }

   @Override
   public PX processRandom(PX var1, PX var2) {
      float var3 = var1.throws_();
      float var4 = var1.protected_();
      float var5 = var2.throws_();
      float var6 = var2.protected_();
      Pr_1 var7 = ((rrTT)((AutoExplosion)this.class_[0]).break_[8]).protected_().protected_();
      if ((Integer)((cb_3)MinecraftAccessor.import_.class_[57]).private_[16] == 1) {
         var5 = var3 + 5.0F;
         var6 = var4 + 5.0F;
      } else if ((Integer)((cb_3)MinecraftAccessor.import_.class_[57]).private_[16] > 1) {
         var5 += (float)rrfQ_2.class_(var7, -0.2F, 0.2F);
         var6 += (float)rrfQ_2.class_(var7, -0.2F, 0.2F);
      }

      return new PX(var5, var6);
   }
}
