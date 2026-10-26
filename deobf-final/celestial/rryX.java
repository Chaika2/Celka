package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryX extends rrTF<AntiAfk> {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static double[] case_;
   private static byte[] catch_;

   private static void byte_() {
      protected_ = new float[]{Float.NaN, 0.5F, -0.5F, 1.0F, -0.3F, 0.3F, 0.2F, 15000.0F, 1000.0F, 5000.0F, 0.0F};
   }

   public rryX(AntiAfk var1) {
      super(var1);
      this.implements_();
      rrfw_3 var6 = new rrfw_3();
      this.class_[0] = var6;
      Float var7 = Float.NaN;
      this.class_[2] = var7;
      Boolean var8 = true;
      this.class_[4] = var8;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7436306544589015464L;
   }

   public float class_() {
      this.implements_();

      float var1;
      do {
         var1 = protected_[3] + rrfQ_2.byte_(-0.3F, 0.3F);
      } while (Math.abs(var1 - (Float)this.class_[2]) < 0.2F);

      Float var6 = var1;
      this.class_[2] = var6;
      return var1;
   }

   @EventTarget
   public void class_(rrAO var1) {
      this.implements_();
      int var10002 = (Integer)this.class_[3] - 1;
      Integer var6 = var10002;
      this.class_[3] = var6;
      if (var10002 > 0) {
         var1.break_(this.class_[4] ? 0.5F : protected_[2]);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, -51, 56, 0, 96, -58, 28, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.implements_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
            || this.break_()) {
            ((rrfw_3)this.class_[0]).class_();
            Integer var11 = 0;
            this.class_[3] = var11;
            Boolean var12 = true;
            this.class_[4] = var12;
            return;
         }

         if (rrfj_3.catch_()) {
            ((rrfw_3)this.class_[0]).class_();
            return;
         }

         if (rrfZ_2.byte_()) {
            ((rrfw_3)this.class_[0]).class_();
            Integer var13 = 0;
            this.class_[3] = var13;
            Boolean var14 = true;
            this.class_[4] = var14;
            return;
         }

         if ((Double)this.class_[1] == 0.0) {
            Double var15 = (double)this.private_();
            this.class_[1] = var15;
         }

         if (((rrfw_3)this.class_[0]).class_((Double)this.class_[1])) {
            if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
               Integer var16 = 30;
               this.class_[3] = var16;
               Boolean var17 = !this.class_[4] ? true : byte_[6];
               this.class_[4] = var17;
            } else {
               float var2 = this.class_();
               float var3 = ((Random)rrfQ_2.class_[0]).nextBoolean() ? var2 : -var2;
               cb_3 var10000 = (cb_3)import_.class_[57];
               Float var18 = (Float)((cb_3)import_.class_[57]).throws_[15] + var3;
               var10000.throws_[15] = var18;
               if (PJ.class_(((cb_3)import_.class_[57]).z(), (double)((Ax_1)import_.class_[55]).byte_(), false) instanceof rff_3 var5) {
                  ryZ_2 var6 = ((Ax_1)import_.class_[55]).break_((cb_3)import_.class_[57], (gm_3)import_.class_[56], rpm_3.OFF_HAND, var5);
                  if (var6 == ryZ_2.SUCCESS) {
                     ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmq_3(rpm_3.OFF_HAND));
                  }
               }
            }

            Double var19 = (double)this.private_();
            this.class_[1] = var19;
            ((rrfw_3)this.class_[0]).class_();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2073151410;
   }

   private boolean break_() {
      return !((Qw_1)import_.class_[20]).h.protected_()
            && !((Qw_1)import_.class_[20]).J.protected_()
            && !((Qw_1)import_.class_[20]).X.protected_()
            && !((Qw_1)import_.class_[20]).x.protected_()
         ? byte_[12]
         : byte_[11];
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, true, false, true, true, false, false, true, false, true, true, false, true, false, false};
   }

   private static void finally_() {
      break_ = new short[]{
         0,
         2,
         4,
         0,
         1,
         2,
         1,
         4,
         0,
         3,
         4,
         0,
         0,
         3,
         4,
         1,
         1,
         0,
         1,
         1,
         4,
         3,
         4,
         4,
         0,
         57,
         15,
         15,
         57,
         55,
         55,
         57,
         56,
         57,
         0,
         1,
         0,
         3,
         3,
         4,
         0,
         1,
         3,
         4,
         2,
         2,
         20,
         20,
         20,
         20
      };
   }

   private static void case_() {
      catch_ = new byte[]{30, 5, 2, 3, 4};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         this.class_[1] = 0.0;
         this.class_[2] = 0.0F;
         this.class_[3] = 0;
         this.class_[4] = false;
      }
   }

   private static void protected_() {
      case_ = new double[3];
   }

   private float private_() {
      return 15000.0F + rrfQ_2.byte_(1000.0F, 5000.0F);
   }

   @Override
   public boolean aI_() {
      this.implements_();
      ((rrfw_3)this.class_[0]).class_();
      Double var5 = 0.0;
      this.class_[1] = var5;
      Integer var6 = 0;
      this.class_[3] = var6;
      Boolean var7 = true;
      this.class_[4] = var7;
      return super.aI_();
   }
}
