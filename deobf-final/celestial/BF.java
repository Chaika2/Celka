package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BF extends Pv_1 {
   private static byte[] byte_;
   private static short[] protected_;
   private static String[] throws_;
   private static long[] case_;
   private static float[] catch_;
   private static boolean[] private_;
   public Object[] break_;

   public String byte_() {
      this.throws_();
      return (String)this.break_[3];
   }

   public BF(C_class var1) {
      super(var1);
      this.throws_();
      float[] var6 = new float[20];
      this.break_[0] = var6;
      Long var7 = -1L;
      this.break_[1] = var7;
      String var8 = "20.0";
      this.break_[3] = var8;
      Float var9 = 20.0F;
      this.break_[4] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(y_1 var1) {
      this.throws_();
      if (var1.protected_() instanceof rFp_1) {
         if ((Long)this.break_[1] != -1L) {
            float var2 = (float)(System.currentTimeMillis() - (Long)this.break_[1]) / 1000.0F;
            ((float[])this.break_[0])[this.break_[2] % ((float[])this.break_[0]).length] = rfU_2.class_(20.0F / var2, 0.0F, 20.0F);
            Integer var7 = (Integer)this.break_[2] + 1;
            this.break_[2] = var7;
         }

         Long var8 = System.currentTimeMillis();
         this.break_[1] = var8;
         Float var9 = this.protected_();
         this.break_[4] = var9;
         if (!((Float)this.break_[4] <= 0.0F) && !Float.isNaN((Float)this.break_[4])) {
            String var11 = rql_3.class_((Float)this.break_[4]);
            this.break_[3] = var11;
         } else {
            String var10 = "0.0";
            this.break_[3] = var10;
         }
      }
   }

   public float class_() {
      this.throws_();
      return 20.0F / (Float)this.break_[4];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4917165579917451537L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1113112124;
   }

   public float break_() {
      this.throws_();
      return (Float)this.break_[4];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -95, -100, 80, -106, 81, 102, -7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[1] = 0L;
         var1[2] = 0;
         var1[4] = 0.0F;
      }
   }

   private static void finally_() {
      byte_ = new byte[]{20, 5, 2, 4};
   }

   private static void catch_() {
      catch_ = new float[]{20.0F, 1000.0F, 20.0F, 0.0F, 20.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 20.0F, 20.0F, 0.0F};
   }

   private static void extends_() {
      private_ = new boolean[]{true, false, true, false};
   }

   private static void case_() {
      case_ = new long[]{-1L, -1L, 0L};
   }

   private static void implements_() {
      protected_ = new short[]{0, 1, 3, 4, 1, 1, 0, 2, 0, 2, 2, 1, 4, 4, 4, 3, 4, 3, 0, 4, 4, 3};
   }

   private float protected_() {
      this.throws_();
      float var1 = 0.0F;
      float var2 = 0.0F;

      for (float var6 : (float[])this.break_[0]) {
         if (var6 > 0.0F) {
            var2 += var6;
            var1++;
         }
      }

      return rfU_2.class_(var2 / var1, 0.0F, 20.0F);
   }

   private static void private_() {
      throws_ = new String[]{new String("20.0"), new String("0.0")};
   }
}
