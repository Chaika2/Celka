package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCB implements rrTf_1 {
   private static short[] break_;
   private static double[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new float[]{0.1F, 0.1F};
   }

   public rrCB(rrCP var1) {
      this.throws_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5008574620239952111L;
   }

   private static void class_() {
      byte_ = new double[]{-0.5, 0.5, -0.5, 0.5};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1717429766;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 83, -97, -8, 42, -33, 104, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new boolean[]{true, true, true};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   private static void protected_() {
      break_ = new short[]{0, 0, 0, 0, 57, 16, 57, 16};
   }

   @Override
   public PX processRandom(PX var1, PX var2) {
      float var3 = var1.throws_();
      float var4 = var1.protected_();
      float var5 = var2.throws_();
      float var6 = var2.protected_();
      Pr_1 var7 = ((rrCP)this.class_[0]).implements_().protected_();
      if (!(Boolean)((rrCP)this.class_[0]).byte_[0]) {
         if ((Integer)((cb_3)MinecraftAccessor.import_.class_[57]).private_[16] == 1) {
            var5 = var3 + 0.1F;
            var6 = var4 + 0.1F;
         } else if ((Integer)((cb_3)MinecraftAccessor.import_.class_[57]).private_[16] > 1) {
            var5 += (float)rrfQ_2.class_(var7, -0.5, 0.5);
            var6 += (float)rrfQ_2.class_(var7, -0.5, 0.5);
         }
      }

      return new PX(var5, var6);
   }
}
