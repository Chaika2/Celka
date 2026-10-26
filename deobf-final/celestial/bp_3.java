package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bp_3 implements D, bj_3 {
   private static short[] catch_;
   private static double[] private_;
   public static Object[] class_;
   private static boolean[] implements_;
   public Object[] break_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   public bp_3(C_class var1, by_3 var2) {
      this.byte_();
      this.break_[0] = var2;
      var1.s().class_(this);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7382193856303215155L;
   }

   public static void class_(Ml_1 var0, rY_2[] var1) {
      float var2 = (Float)protected_.super_.class_[0];
      boolean var3 = (Boolean)protected_.package_.class_[0];
      float var4 = (Float)protected_.PT.class_[0];
      if ((Boolean)protected_.J.class_[0]) {
         bj_3.class_((Color)protected_.try_.class_[0], var2, var4, var3);

         for (rY_2 var8 : var1) {
            bj_3.class_(var0, var8.break_(), 0.005);
         }

         if ((Boolean)protected_.Pw.class_[0]) {
            bj_3.class_((Color)protected_.short_.class_[0], var2);

            for (rY_2 var15 : var1) {
               bj_3.class_(var0, new rfl_3(var15.byte_(), var15.byte_().class_(1, 1, 1)));
            }

            bj_3.class_((Color)protected_.float_.class_[0], var2);

            for (rY_2 var16 : var1) {
               bj_3.class_(var0, new rfl_3(var16.case_(), var16.case_().class_(1, 1, 1)));
            }
         }

         bj_3.class_(var3);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1124077589;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 49, -43, 123, -67, 100, -2, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      catch_ = new short[10];
   }

   @Override
   public void class_(T var1) {
      class_(var1.byte_(), ((by_3)this.break_[0]).byte_());
   }

   private static void break_() {
      implements_ = new boolean[]{false, false, true, true, true, false, true, true, true, true, true, false};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{0.005};
      class_ = var0;
   }

   private static void protected_() {
      private_ = new double[]{0.005, 0.005};
   }
}
