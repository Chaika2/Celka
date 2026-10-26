package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class cM_2 extends cG_2 {
   private static boolean[] finally_;
   public Object[] break_;
   private static byte[] extends_;
   private static float[] native_;
   private static short[] volatile_;
   private static double[] final_;

   private static void boolean_() {
      finally_ = new boolean[]{true, true, false, true, false, true, true, true, false, false, true};
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 118, 119, -94, 48, -85, 15, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rjU_2 long_() {
      this.r();
      if (!this.Pm() && !this.for_()) {
         rjU_2 var1 = ((cb_3)QY.instanceof_().class_[57]).Ps();
         rjU_2 var2 = new rjU_2((Double)this.break_[6], (Double)this.break_[7], (Double)this.break_[8]);
         rjU_2 var3 = new rjU_2((Double)this.break_[3], (Double)this.break_[4], (Double)this.break_[5]);
         return var1.case_(var2) > var1.case_(var3) ? var3 : var2;
      } else {
         return this.Ps();
      }
   }

   private static void float_() {
      volatile_ = new short[]{
         37,
         38,
         3,
         6,
         4,
         7,
         5,
         8,
         3,
         4,
         5,
         24,
         0,
         24,
         24,
         45,
         46,
         45,
         47,
         45,
         48,
         45,
         15,
         49,
         15,
         45,
         15,
         16,
         50,
         16,
         45,
         16,
         45,
         45,
         15,
         16,
         52,
         25,
         51,
         25,
         52,
         25,
         52,
         52,
         8,
         7,
         20,
         8,
         8,
         8,
         9,
         10,
         11,
         19,
         0,
         1,
         2,
         1,
         0,
         1,
         2,
         1,
         57,
         6,
         7,
         8,
         3,
         4,
         5,
         3,
         4,
         5
      };
   }

   private static void double_() {
      native_ = new float[]{1.0F, -1.0F, -1.0F, 0.1F, 0.0F, 0.4F};
   }

   public cM_2(gm_3 var1, GameProfile var2) {
      super(var1, var2);
      this.r();
      Float var7 = 1.0F;
      this.throws_[37] = var7;
      Boolean var8 = true;
      this.throws_[38] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void this_() {
      super.this_();
      this.class_(this, false);
      Float var5 = -1.0F;
      this.implements_[24] = var5;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnk_3.class_(this));
   }

   @Override
   public boolean class_(double var1) {
      double var3 = this.rN().class_() * 10.0;
      if (Double.isNaN(var3)) {
         var3 = 1.0;
      }

      var3 = var3 * 64.0 * Br();
      return var1 < var3 * var3 ? true : finally_[2];
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.r();
      Double var15 = (Double)this.break_[3];
      this.break_[6] = var15;
      Double var16 = (Double)this.break_[4];
      this.break_[7] = var16;
      Double var17 = (Double)this.break_[5];
      this.break_[8] = var17;
      Double var18 = var1;
      this.break_[3] = var18;
      Double var19 = var3;
      this.break_[4] = var19;
      Double var20 = var5;
      this.break_[5] = var20;
      super.class_(var1, var3, var5, var7, var8, var9, var10);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -521288217;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5397502172016437295L;
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
      QY var3 = QY.instanceof_();
      if (!var3.class_(var2)) {
         ((cq_3)var3.class_[19]).throws_().class_(var1);
      }
   }

   @Override
   public void default_() {
      this.r();
      if ((Integer)this.private_[45] > 0) {
         double var1 = this.rx() + ((Double)this.private_[46] - this.rx()) / (double)((Integer)this.private_[45]).intValue();
         double var3 = this.re() + ((Double)this.private_[47] - this.re()) / (double)((Integer)this.private_[45]).intValue();
         double var5 = this.BO() + ((Double)this.private_[48] - this.BO()) / (double)((Integer)this.private_[45]).intValue();
         Float var11 = (float)(
            (double)((Float)this.throws_[15]).floatValue()
               + rfU_2.case_((Double)this.private_[49] - (double)((Float)this.throws_[15]).floatValue()) / (double)((Integer)this.private_[45]).intValue()
         );
         this.throws_[15] = var11;
         Float var12 = (float)(
            (double)((Float)this.throws_[16]).floatValue()
               + ((Double)this.private_[50] - (double)((Float)this.throws_[16]).floatValue()) / (double)((Integer)this.private_[45]).intValue()
         );
         this.throws_[16] = var12;
         Integer var13 = (Integer)this.private_[45] - 1;
         this.private_[45] = var13;
         this.new_(var1, var3, var5);
         this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
      }

      if ((Integer)this.private_[52] > 0) {
         Float var14 = (float)(
            (double)((Float)this.private_[25]).floatValue()
               + rfU_2.case_((Double)this.private_[51] - (double)((Float)this.private_[25]).floatValue()) / (double)((Integer)this.private_[52]).intValue()
         );
         this.private_[25] = var14;
         Integer var15 = (Integer)this.private_[52] - 1;
         this.private_[52] = var15;
      }

      Float var16 = (Float)this.implements_[8];
      this.implements_[7] = var16;
      this.Sg();
      float var21;
      if ((Boolean)this.throws_[20] && !this.Sl()) {
         var21 = Math.min(0.1F, rfU_2.class_(case_(this.rv())));
      } else {
         var21 = native_[4];
      }

      Float var17 = (Float)this.implements_[8] + (var21 - (Float)this.implements_[8]) * 0.4F;
      this.implements_[8] = var17;
      this.SS();
      rjU_2 var2 = this.long_();
      Double var18 = var2.break_;
      this.break_[9] = var18;
      Double var19 = var2.byte_;
      this.break_[10] = var19;
      Double var20 = var2.protected_;
      this.break_[11] = var20;
   }

   private static void short_() {
      final_ = new double[]{10.0, 1.0, 64.0, -999.0, -999.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   private void r() {
      if (this.break_ == null) {
         this.break_ = new Object[12];
         Object[] var1 = this.break_;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
         var1[6] = 0.0;
         var1[7] = 0.0;
         var1[8] = 0.0;
         var1[9] = 0.0;
         var1[10] = 0.0;
         var1[11] = 0.0;
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return true;
   }

   @Override
   public void else_() {
      this.r();
      if (!this.Pm() && !this.for_()) {
         Double var6 = this.rx();
         this.break_[0] = var6;
         Double var7 = this.re();
         this.break_[1] = var7;
         Double var8 = this.BO();
         this.break_[2] = var8;
         rjU_2 var1 = this.long_();
         this.new_(var1.break_, var1.byte_, var1.protected_);
      }
   }

   private boolean for_() {
      this.r();
      return this.break_[3] == 0.0 && this.break_[4] == 0.0 && this.break_[5] == 0.0 ? true : finally_[8];
   }

   private static void static_() {
      extends_ = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
   }

   @Override
   public void public_() {
      this.r();
      if ((Double)this.break_[1] != -999.0 && !this.for_()) {
         this.new_((Double)this.break_[0], (Double)this.break_[1], (Double)this.break_[2]);
         Double var5 = -999.0;
         this.break_[1] = var5;
      }
   }

   @Override
   public float u_() {
      return this.implements_[24] == -1.0F ? super.u_() : (Float)this.implements_[24];
   }

   @Override
   public void t_() {
   }
}
