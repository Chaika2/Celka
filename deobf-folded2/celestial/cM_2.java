package celestial;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class cM_2 extends cG_2 {
   private static boolean[] id_finally;
   public Object[] id_break;
   private static byte[] id_extends;
   private static float[] id_native;
   private static short[] id_volatile;
   private static double[] id_final;

   private static void id_boolean() {
      id_finally = new boolean[]{true, true, false, true, false, true, true, true, false, false, true};
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 118, 119, -94, 48, -85, 15, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rjU_2 id_long() {
      this.r();
      if (!this.Pm() && !this.id_for()) {
         rjU_2 var1 = ((cb_3)QY.id_instanceof().id_class[57]).Ps();
         rjU_2 var2 = new rjU_2((Double)this.id_break[6], (Double)this.id_break[7], (Double)this.id_break[8]);
         rjU_2 var3 = new rjU_2((Double)this.id_break[3], (Double)this.id_break[4], (Double)this.id_break[5]);
         return var1.id_case(var2) > var1.id_case(var3) ? var3 : var2;
      } else {
         return this.Ps();
      }
   }

   private static void id_float() {
      id_volatile = new short[]{
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

   private static void id_double() {
      id_native = new float[]{1.0F, -1.0F, -1.0F, 0.1F, 0.0F, 0.4F};
   }

   public cM_2(gm_3 var1, GameProfile var2) {
      super(var1, var2);
      this.r();
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
      Boolean var8 = true;
      this.id_throws[38] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_this() {
      super.id_this();
      this.id_class(this, false);
      Float var5 = -1.0F;
      this.id_implements[24] = var5;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnk_3.id_class(this));
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = this.rN().id_class() * 10.0;
      if (Double.isNaN(var3)) {
         var3 = 1.0;
      }

      var3 = var3 * 64.0 * Br();
      return var1 < var3 * var3 ? true : id_finally[2];
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.r();
      Double var15 = (Double)this.id_break[3];
      this.id_break[6] = var15;
      Double var16 = (Double)this.id_break[4];
      this.id_break[7] = var16;
      Double var17 = (Double)this.id_break[5];
      this.id_break[8] = var17;
      Double var18 = var1;
      this.id_break[3] = var18;
      Double var19 = var3;
      this.id_break[4] = var19;
      Double var20 = var5;
      this.id_break[5] = var20;
      super.id_class(var1, var3, var5, var7, var8, var9, var10);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -521288217;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5397502172016437295L;
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
      QY var3 = QY.id_instanceof();
      if (!var3.id_class(var2)) {
         ((cq_3)var3.id_class[19]).id_throws().id_class(var1);
      }
   }

   @Override
   public void id_default() {
      this.r();
      if ((Integer)this.id_private[45] > 0) {
         double var1 = this.rx() + ((Double)this.id_private[46] - this.rx()) / (double)((Integer)this.id_private[45]).intValue();
         double var3 = this.re() + ((Double)this.id_private[47] - this.re()) / (double)((Integer)this.id_private[45]).intValue();
         double var5 = this.BO() + ((Double)this.id_private[48] - this.BO()) / (double)((Integer)this.id_private[45]).intValue();
         Float var11 = (float)(
            (double)((Float)this.id_throws[15]).floatValue()
               + rfU_2.id_case((Double)this.id_private[49] - (double)((Float)this.id_throws[15]).floatValue())
                  / (double)((Integer)this.id_private[45]).intValue()
         );
         this.id_throws[15] = var11;
         Float var12 = (float)(
            (double)((Float)this.id_throws[16]).floatValue()
               + ((Double)this.id_private[50] - (double)((Float)this.id_throws[16]).floatValue()) / (double)((Integer)this.id_private[45]).intValue()
         );
         this.id_throws[16] = var12;
         Integer var13 = (Integer)this.id_private[45] - 1;
         this.id_private[45] = var13;
         this.id_new(var1, var3, var5);
         this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
      }

      if ((Integer)this.id_private[52] > 0) {
         Float var14 = (float)(
            (double)((Float)this.id_private[25]).floatValue()
               + rfU_2.id_case((Double)this.id_private[51] - (double)((Float)this.id_private[25]).floatValue())
                  / (double)((Integer)this.id_private[52]).intValue()
         );
         this.id_private[25] = var14;
         Integer var15 = (Integer)this.id_private[52] - 1;
         this.id_private[52] = var15;
      }

      Float var16 = (Float)this.id_implements[8];
      this.id_implements[7] = var16;
      this.Sg();
      float var21;
      if ((Boolean)this.id_throws[20] && !this.Sl()) {
         var21 = Math.min(0.1F, rfU_2.id_class(id_case(this.rv())));
      } else {
         var21 = id_native[4];
      }

      Float var17 = (Float)this.id_implements[8] + (var21 - (Float)this.id_implements[8]) * 0.4F;
      this.id_implements[8] = var17;
      this.SS();
      rjU_2 var2 = this.id_long();
      Double var18 = var2.id_break;
      this.id_break[9] = var18;
      Double var19 = var2.id_byte;
      this.id_break[10] = var19;
      Double var20 = var2.id_protected;
      this.id_break[11] = var20;
   }

   private static void id_short() {
      id_final = new double[]{10.0, 1.0, 64.0, -999.0, -999.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   private void r() {
      if (this.id_break == null) {
         this.id_break = new Object[12];
         Object[] var1 = this.id_break;
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
   public boolean id_break(rye_3 var1, float var2) {
      return true;
   }

   @Override
   public void id_else() {
      this.r();
      if (!this.Pm() && !this.id_for()) {
         Double var6 = this.rx();
         this.id_break[0] = var6;
         Double var7 = this.re();
         this.id_break[1] = var7;
         Double var8 = this.BO();
         this.id_break[2] = var8;
         rjU_2 var1 = this.id_long();
         this.id_new(var1.id_break, var1.id_byte, var1.id_protected);
      }
   }

   private boolean id_for() {
      this.r();
      return this.id_break[3] == 0.0 && this.id_break[4] == 0.0 && this.id_break[5] == 0.0 ? true : id_finally[8];
   }

   private static void id_static() {
      id_extends = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
   }

   @Override
   public void id_public() {
      this.r();
      if ((Double)this.id_break[1] != -999.0 && !this.id_for()) {
         this.id_new((Double)this.id_break[0], (Double)this.id_break[1], (Double)this.id_break[2]);
         Double var5 = -999.0;
         this.id_break[1] = var5;
      }
   }

   @Override
   public float u_() {
      return this.id_implements[24] == -1.0F ? super.u_() : (Float)this.id_implements[24];
   }

   @Override
   public void t_() {
   }
}
