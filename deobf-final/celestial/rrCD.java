package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCD extends rrTF<Flight> {
   private static double[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] case_;
   public Object[] class_;
   private static float[] catch_;

   private static void byte_() {
      break_ = new double[]{-0.2};
   }

   public rrCD(Flight var1) {
      super(var1);
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      catch_ = new float[]{2.0F};
   }

   @EventTarget
   public void class_(rrLz_1 var1) {
      this.case_();
      float var2 = this.continue_().this_().byte_();
      var1.class_(var2);
      int var10002 = (Integer)this.class_[0] + 1;
      Integer var7 = var10002;
      this.class_[0] = var7;
      if (var10002 > 70) {
         var1.catch_().byte_ = -0.2;
         Integer var8 = 0;
         this.class_[0] = var8;
      } else {
         var1.catch_().byte_ = (double)(rrfj_3.class_() * var2 / 2.0F);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4525601928039463013L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 106, -52, 52, -56, 100, 17, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -713869217;
   }

   private static void break_() {
      case_ = new byte[]{70};
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, false, true, false, false};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         this.class_[0] = 0;
      }
   }

   private static void protected_() {
      byte_ = new short[4];
   }

   @Override
   public boolean aK_() {
      this.case_();
      Integer var5 = 0;
      this.class_[0] = var5;
      return super.aK_();
   }
}
