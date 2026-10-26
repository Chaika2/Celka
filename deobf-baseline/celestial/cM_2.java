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
         rjU_2 var1 = ((cb_3)QY.id_instanceof().id_class[id_volatile[62]]).Ps();
         rjU_2 var2 = new rjU_2((Double)this.id_break[id_volatile[63]], (Double)this.id_break[id_volatile[64]], (Double)this.id_break[id_volatile[65]]);
         rjU_2 var3 = new rjU_2((Double)this.id_break[id_volatile[66]], (Double)this.id_break[id_volatile[67]], (Double)this.id_break[id_volatile[68]]);
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
      Float var7 = id_native[0];
      this.id_throws[id_volatile[0]] = var7;
      Boolean var8 = id_finally[0];
      this.id_throws[id_volatile[1]] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_this() {
      super.id_this();
      this.id_class(this, id_finally[4]);
      Float var5 = id_native[1];
      this.id_implements[id_volatile[11]] = var5;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[12]]).id_finally().id_class(rrnk_3.id_class(this));
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = this.rN().id_class() * id_final[0];
      if (Double.isNaN(var3)) {
         var3 = id_final[1];
      }

      var3 = var3 * id_final[2] * Br();
      return var1 < var3 * var3 ? id_finally[1] : id_finally[2];
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.r();
      Double var15 = (Double)this.id_break[id_volatile[2]];
      this.id_break[id_volatile[3]] = var15;
      Double var16 = (Double)this.id_break[id_volatile[4]];
      this.id_break[id_volatile[5]] = var16;
      Double var17 = (Double)this.id_break[id_volatile[6]];
      this.id_break[id_volatile[7]] = var17;
      Double var18 = var1;
      this.id_break[id_volatile[8]] = var18;
      Double var19 = var3;
      this.id_break[id_volatile[9]] = var19;
      Double var20 = var5;
      this.id_break[id_volatile[10]] = var20;
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
         ((cq_3)var3.id_class[id_volatile[53]]).id_throws().id_class(var1);
      }
   }

   @Override
   public void id_default() {
      this.r();
      if ((Integer)this.id_private[id_volatile[15]] > 0) {
         double var1 = this.rx() + ((Double)this.id_private[id_volatile[16]] - this.rx()) / (double)((Integer)this.id_private[id_volatile[17]]).intValue();
         double var3 = this.re() + ((Double)this.id_private[id_volatile[18]] - this.re()) / (double)((Integer)this.id_private[id_volatile[19]]).intValue();
         double var5 = this.BO() + ((Double)this.id_private[id_volatile[20]] - this.BO()) / (double)((Integer)this.id_private[id_volatile[21]]).intValue();
         Float var11 = (float)(
            (double)((Float)this.id_throws[id_volatile[22]]).floatValue()
               + rfU_2.id_case((Double)this.id_private[id_volatile[23]] - (double)((Float)this.id_throws[id_volatile[24]]).floatValue())
                  / (double)((Integer)this.id_private[id_volatile[25]]).intValue()
         );
         this.id_throws[id_volatile[26]] = var11;
         Float var12 = (float)(
            (double)((Float)this.id_throws[id_volatile[27]]).floatValue()
               + ((Double)this.id_private[id_volatile[28]] - (double)((Float)this.id_throws[id_volatile[29]]).floatValue())
                  / (double)((Integer)this.id_private[id_volatile[30]]).intValue()
         );
         this.id_throws[id_volatile[31]] = var12;
         Integer var13 = (Integer)this.id_private[id_volatile[32]] - id_finally[5];
         this.id_private[id_volatile[33]] = var13;
         this.id_new(var1, var3, var5);
         this.id_case((Float)this.id_throws[id_volatile[34]], (Float)this.id_throws[id_volatile[35]]);
      }

      if ((Integer)this.id_private[id_volatile[36]] > 0) {
         Float var14 = (float)(
            (double)((Float)this.id_private[id_volatile[37]]).floatValue()
               + rfU_2.id_case((Double)this.id_private[id_volatile[38]] - (double)((Float)this.id_private[id_volatile[39]]).floatValue())
                  / (double)((Integer)this.id_private[id_volatile[40]]).intValue()
         );
         this.id_private[id_volatile[41]] = var14;
         Integer var15 = (Integer)this.id_private[id_volatile[42]] - id_finally[6];
         this.id_private[id_volatile[43]] = var15;
      }

      Float var16 = (Float)this.id_implements[id_volatile[44]];
      this.id_implements[id_volatile[45]] = var16;
      this.Sg();
      float var21;
      if ((Boolean)this.id_throws[id_volatile[46]] && !this.Sl()) {
         var21 = Math.min(id_native[3], rfU_2.id_class(id_case(this.rv())));
      } else {
         var21 = id_native[4];
      }

      Float var17 = (Float)this.id_implements[id_volatile[47]] + (var21 - (Float)this.id_implements[id_volatile[48]]) * id_native[5];
      this.id_implements[id_volatile[49]] = var17;
      this.SS();
      rjU_2 var2 = this.id_long();
      Double var18 = var2.id_break;
      this.id_break[id_volatile[50]] = var18;
      Double var19 = var2.id_byte;
      this.id_break[id_volatile[51]] = var19;
      Double var20 = var2.id_protected;
      this.id_break[id_volatile[52]] = var20;
   }

   private static void id_short() {
      id_final = new double[]{10.0, 1.0, 64.0, -999.0, -999.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   private void r() {
      if (this.id_break == null) {
         this.id_break = new Object[id_extends[0]];
         Object[] var1 = this.id_break;
         var1[id_finally[9]] = id_final[8];
         var1[id_finally[10]] = id_final[9];
         var1[id_extends[1]] = id_final[10];
         var1[id_extends[2]] = id_final[11];
         var1[id_extends[3]] = id_final[12];
         var1[id_extends[4]] = id_final[13];
         var1[id_extends[5]] = id_final[14];
         var1[id_extends[6]] = id_final[15];
         var1[id_extends[7]] = id_final[16];
         var1[id_extends[8]] = id_final[17];
         var1[id_extends[9]] = id_final[18];
         var1[id_extends[10]] = id_final[19];
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return id_finally[3];
   }

   @Override
   public void id_else() {
      this.r();
      if (!this.Pm() && !this.id_for()) {
         Double var6 = this.rx();
         this.id_break[id_volatile[54]] = var6;
         Double var7 = this.re();
         this.id_break[id_volatile[55]] = var7;
         Double var8 = this.BO();
         this.id_break[id_volatile[56]] = var8;
         rjU_2 var1 = this.id_long();
         this.id_new(var1.id_break, var1.id_byte, var1.id_protected);
      }
   }

   private boolean id_for() {
      this.r();
      return this.id_break[id_volatile[69]] == id_final[5] && this.id_break[id_volatile[70]] == id_final[6] && this.id_break[id_volatile[71]] == id_final[7]
         ? id_finally[7]
         : id_finally[8];
   }

   private static void id_static() {
      id_extends = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
   }

   @Override
   public void id_public() {
      this.r();
      if ((Double)this.id_break[id_volatile[57]] != id_final[3] && !this.id_for()) {
         this.id_new((Double)this.id_break[id_volatile[58]], (Double)this.id_break[id_volatile[59]], (Double)this.id_break[id_volatile[60]]);
         Double var5 = id_final[4];
         this.id_break[id_volatile[61]] = var5;
      }
   }

   @Override
   public float u_() {
      return this.id_implements[id_volatile[13]] == id_native[2] ? super.u_() : (Float)this.id_implements[id_volatile[14]];
   }

   @Override
   public void t_() {
   }
}
