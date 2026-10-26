package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZh_1 implements rpv_3 {
   private static float[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   private static int[] throws_;
   private static short[] case_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0;
         var1[4] = 0.0F;
         var1[5] = 0;
      }
   }

   public rrZh_1(rrZO var1, float var2, int var3, Ml_1 var4, float var5, int var6) {
      this.byte_();
      this.class_[6] = var1;
      Float var12 = var2;
      this.class_[1] = var12;
      Integer var13 = var3;
      this.class_[2] = var13;
      this.class_[3] = var4;
      Float var15 = var5;
      this.class_[4] = var15;
      Integer var16 = var6;
      this.class_[5] = var16;
      Float var17 = (Float)this.class_[1];
      this.class_[0] = var17;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 8, -73, 13, -22, -92, -19, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1582147912;
   }

   private static void class_() {
      protected_ = new byte[]{8, 7, 2, 4, 5};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3921254796466781133L;
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      int var4 = var2.class_() != null ? var2.class_().class_() : (Integer)this.class_[2];
      char var5 = (char)var3;
      rrZM var6 = (rrZM)((Int2ObjectOpenHashMap)((rrZO)this.class_[6]).class_[1]).getOrDefault(var5, (rrZM)((rrZO)this.class_[6]).class_[2]);
      if (var6 != null) {
         ((rrZO)this.class_[6])
            .class_((Ml_1)this.class_[3], var5, (Float)this.class_[0], (Float)this.class_[4], ColorHelper.break_(var4 | 0xFF000000, (Integer)this.class_[5]));
         Float var11 = (Float)this.class_[0] + (float)((Integer)var6.class_[2] - 8);
         this.class_[0] = var11;
      }

      return byte_[0];
   }

   private static void break_() {
      break_ = new float[3];
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, true, false, false};
   }

   private static void case_() {
      case_ = new short[]{6, 1, 2, 3, 4, 5, 1, 0, 2, 6, 1, 6, 2, 6, 3, 0, 4, 5, 0, 2, 0};
   }

   private static void protected_() {
      throws_ = new int[]{-16777216};
   }
}
