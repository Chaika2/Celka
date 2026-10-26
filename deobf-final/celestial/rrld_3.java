package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrld_3 extends rrTF<WaterSpeed> {
   private static byte[] break_;
   private static double[] byte_;
   private static short[] protected_;
   private static float[] case_;
   public Object[] class_;
   private static boolean[] catch_;

   private static void byte_() {
      protected_ = new short[]{0, 1, 57, 57, 57, 23, 57, 0, 0, 57, 17, 57, 17, 1, 0, 1, 57, 41, 57, 42, 57, 44, 0, 0, 1, 57, 0, 1};
   }

   public rrld_3(WaterSpeed var1) {
      super(var1);
      this.throws_();
      rrIa_1 var6 = new rrIa_1();
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8327104366150302132L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -66, 119, 64, -68, 12, -46, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLj_1 var1) {
      this.throws_();
      if (var1.break_() || !var1.class_()) {
         ((rrIa_1)this.class_[0]).class_();
      }
   }

   @EventTarget
   public void class_(rrLZ var1) {
      this.throws_();
      if (var1.class_() instanceof rmD_2 var2) {
         if (var2.break_() == rmU_2.STOP_SPRINTING) {
            var1.class_(true);
         } else if (var2.break_() == rmU_2.RELEASE_SHIFT_KEY
            && (Float)((cb_3)import_.class_[57]).private_[42] != 0.0F
            && (Float)((cb_3)import_.class_[57]).private_[44] == 0.0F) {
            ((rrIa_1)this.class_[0]).class_();
         }
      }
   }

   @EventTarget
   public void class_(rrLk_1 var1) {
      var1.class_(0.0);
   }

   @EventTarget
   public void class_(rrLz_1 var1) {
      this.throws_();
      Boolean var9 = false;
      this.class_[1] = var9;
      float var2 = rrIi_1.class_(this.case_());
      float var3 = rrfj_3.class_();
      boolean var4 = rrfo_3.break_(1);
      if (((cb_3)import_.class_[57]).PZ() && (((cb_3)import_.class_[57]).Pj() || var4)) {
         if ((Boolean)((cb_3)import_.class_[57]).throws_[23]) {
            return;
         }

         if (var4 && var3 == 0.0F && !((cb_3)import_.class_[57]).Pj()) {
            var1.catch_().byte_ = 0.0;
         }

         if (!rrfj_3.catch_()) {
            ((rrIa_1)this.class_[0]).class_();
         }

         var1.class_(((rrIa_1)this.class_[0]).class_(var2, 0.15F));
         rjU_2 var10000 = var1.catch_();
         var10000.byte_ = var10000.byte_
            + (
               ((rqr_3)((cb_3)import_.class_[57]).break_[17]).implements_
                  ? -0.2F
                  : (((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_ ? 0.06F : byte_[3])
            );
         Boolean var10 = true;
         this.class_[1] = var10;
      } else {
         ((rrIa_1)this.class_[0]).class_();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1511173044;
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      this.throws_();
      if ((Boolean)this.class_[1]) {
         var1.protected_(var1.catch_() + (((cb_3)import_.class_[57]).throws_[41] % 2 == 0 ? 0.02 : byte_[5]));
      }
   }

   private static void class_() {
      catch_ = new boolean[]{false, true, true, true, false, false, true, false};
   }

   @EventTarget
   public void class_(rrAB var1) {
      this.throws_();
      if ((Boolean)this.class_[1]) {
         var1.class_(false);
      }
   }

   private static void break_() {
      break_ = new byte[]{2, 2};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = false;
      }
   }

   private float case_() {
      return ((cb_3)import_.class_[57]).BL() ? 0.29F : case_[5];
   }

   private static void protected_() {
      byte_ = new double[]{0.0, -0.2F, 0.06F, 0.0, 0.02, 0.001, 0.0};
   }

   private static void private_() {
      case_ = new float[]{0.0F, 0.15F, 0.0F, 0.0F, 0.29F, 0.67F};
   }

   @Override
   public boolean aK_() {
      this.throws_();
      ((rrIa_1)this.class_[0]).class_();
      Boolean var5 = false;
      this.class_[1] = var5;
      return super.aK_();
   }
}
