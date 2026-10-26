package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class an_3 implements ao_3, gV_2, rpA_2, rrTR {
   private static String[] class_;
   private static short[] break_;
   public Object[] throws_;
   private static float[] protected_;
   private static int[] catch_;
   private static byte[] private_;
   private static boolean[] implements_;
   private static double[] finally_;
   public static Object[] case_;
   private static long[] extends_;

   public float byte_(iM_2 var1) {
      return this.class_(var1, this.a_(var1));
   }

   public boolean byte_(rhN_2 var1) {
      return true;
   }

   public rjU_2 byte_(float var1, float var2) {
      float var3 = var1 * (float) (Math.PI / 180.0);
      float var4 = -var2 * (float) (Math.PI / 180.0);
      float var5 = rfU_2.break_(var4);
      float var6 = rfU_2.class_(var4);
      float var7 = rfU_2.break_(var3);
      float var8 = rfU_2.class_(var3);
      return new rjU_2((double)(var6 * var7), (double)(-var8), (double)(var5 * var7));
   }

   public boolean byte_(rcd_3 var1) {
      return !this.Pm() && this.protected_(var1) ? true : implements_[118];
   }

   public void byte_(rjU_2 var1) {
      this.throws_[14] = var1;
   }

   public double byte_(rfH_2 var1) {
      return var1.class_(this.rx(), this.re(), this.BO(), false);
   }

   public double byte_(double var1) {
      return ((rjU_2)this.throws_[11]).byte_ + (double)this.Bm() * var1;
   }

   public void byte_(an_3 var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         if (!this.return_(var1) && !(Boolean)var1.throws_[38] && !(Boolean)this.throws_[38]) {
            double var2 = var1.rx() - this.rx();
            double var4 = var1.BO() - this.BO();
            double var6 = rfU_2.class_(var2, var4);
            if (var6 >= 0.01F) {
               var6 = (double)rfU_2.class_(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = 1.0 / var6;
               if (var8 > 1.0) {
                  var8 = 1.0;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= 0.05F;
               var4 *= 0.05F;
               var2 *= (double)(1.0F - this.throws_[39]);
               var4 *= (double)(1.0F - this.throws_[39]);
               if (!this.BP()) {
                  this.implements_(-var2, 0.0, -var4);
               }

               if (!var1.BP()) {
                  var1.implements_(var2, 0.0, var4);
               }
            }
         }
      }
   }

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1572744141;
   }

   public void byte_(double var1, double var3, double var5) {
      this.catch_(new rjU_2(var1, var3, var5));
   }

   public void int_(double var1, double var3, double var5) {
      this.native_(var1, var3, var5);
      this.PX();
   }

   public void int_(boolean var1) {
      Boolean var6 = var1;
      this.throws_[20] = var6;
   }

   private boolean int_() {
      rfH_2 var1 = this.Bs();
      return !((rYB)this.throws_[7]).while_(var1) && !((rYB)this.throws_[7]).while_(new rfH_2((double)var1.b_(), this.rN().throws_, (double)var1.d_()))
         ? implements_[74]
         : implements_[73];
   }

   public rpr_3 int_(float var1) {
      return rpr_3.class_((double)var1);
   }

   public double int_(an_3 var1) {
      return this.break_(var1.Ps());
   }

   private static void long_() {
      break_ = new short[]{
         1,
         1,
         3,
         13,
         14,
         3,
         19,
         26,
         32,
         33,
         40,
         42,
         44,
         48,
         40,
         63,
         63,
         64,
         66,
         68,
         0,
         7,
         70,
         11,
         12,
         55,
         49,
         49,
         5,
         49,
         6,
         49,
         8,
         49,
         7,
         49,
         9,
         49,
         10,
         49,
         11,
         70,
         71,
         74,
         7,
         55,
         55,
         0,
         1,
         1,
         66,
         66,
         1024,
         66,
         66,
         49,
         1,
         1,
         1,
         7,
         7,
         16,
         27,
         49,
         11,
         49,
         11,
         11,
         11,
         11,
         11,
         11,
         11,
         15,
         16,
         70,
         11,
         11,
         11,
         7,
         27,
         4,
         4,
         4,
         14,
         13,
         29,
         28,
         16,
         18,
         15,
         17,
         7,
         42,
         42,
         42,
         42,
         42,
         31,
         31,
         7,
         42,
         48,
         58,
         58,
         58,
         58,
         42,
         42,
         42,
         7,
         7,
         20,
         20,
         38,
         75,
         77,
         76,
         26,
         26,
         26,
         57,
         57,
         21,
         22,
         0,
         23,
         24,
         24,
         20,
         21,
         22,
         57,
         0,
         7,
         20,
         7,
         20,
         7,
         29,
         29,
         30,
         30,
         30,
         32,
         32,
         30,
         33,
         30,
         33,
         7,
         42,
         40,
         40,
         7,
         7,
         7,
         20,
         37,
         37,
         7,
         37,
         7,
         37,
         7,
         7,
         11,
         11,
         11,
         7,
         7,
         7,
         7,
         7,
         7,
         11,
         11,
         7,
         69,
         68,
         69,
         0,
         7,
         7,
         7,
         20,
         37,
         37,
         7,
         37,
         7,
         37,
         7,
         7,
         30,
         7,
         7,
         7,
         7,
         40,
         40,
         7,
         49,
         9,
         49,
         9,
         49,
         10,
         49,
         10,
         31,
         7,
         31,
         31,
         31,
         31,
         43,
         7,
         7,
         7,
         45,
         44,
         7,
         43,
         43,
         48,
         31,
         43,
         43,
         45,
         46,
         7,
         7,
         46,
         7,
         40,
         40,
         40,
         40,
         70,
         40,
         70,
         40,
         70,
         7,
         40,
         70,
         40,
         70,
         40,
         70,
         7,
         7,
         7,
         7,
         40,
         70,
         40,
         70,
         46,
         46,
         46,
         48,
         44,
         0,
         15,
         72,
         15,
         7,
         7,
         7,
         15,
         15,
         15,
         16,
         16,
         16,
         15,
         17,
         16,
         18,
         8,
         9,
         10,
         15,
         16,
         15,
         16,
         8,
         9,
         10,
         34,
         35,
         36,
         9,
         10,
         11,
         7,
         38,
         38,
         39,
         39,
         57,
         25,
         16,
         18,
         16,
         17,
         18,
         15,
         17,
         15,
         8,
         9,
         10,
         71,
         8,
         9,
         10,
         8,
         9,
         10,
         7,
         7,
         7,
         4,
         27,
         5,
         5,
         5,
         15,
         16,
         31,
         42,
         20,
         62,
         58,
         65,
         65,
         66,
         66,
         15,
         16,
         15,
         17,
         16,
         18,
         15,
         15,
         31,
         42,
         20,
         62,
         58,
         63,
         63,
         64,
         15,
         16,
         15,
         16,
         0,
         66,
         1024,
         66,
         7,
         7,
         7,
         27,
         27,
         7,
         38,
         70,
         7,
         70,
         5,
         5,
         5,
         5,
         5,
         4,
         7,
         7,
         7,
         3,
         3,
         5,
         5,
         5,
         7,
         3,
         3,
         3,
         4,
         16,
         15,
         16,
         15,
         7,
         61,
         61,
         59,
         7,
         59,
         7,
         60,
         60,
         60,
         59,
         60,
         60,
         60,
         60,
         60,
         300,
         2,
         2,
         7,
         7,
         42,
         65,
         7,
         65,
         7,
         75,
         77,
         76,
         49,
         5,
         49,
         5,
         49,
         5,
         49,
         5,
         300,
         49,
         6,
         49,
         6,
         42,
         42,
         31,
         7,
         7,
         7,
         40,
         26,
         0,
         1,
         7,
         7,
         62,
         62,
         62,
         15,
         16,
         58,
         58,
         61,
         61,
         7,
         27,
         16,
         7,
         27,
         7,
         7,
         7,
         15,
         16,
         1,
         63,
         63,
         64,
         63,
         64,
         64,
         4,
         4,
         49,
         7,
         49,
         7,
         49,
         7,
         49,
         8,
         49,
         8,
         7,
         7,
         7,
         7,
         15,
         16,
         11,
         70,
         70,
         71,
         48,
         7,
         15,
         19,
         19,
         71,
         7,
         7,
         15,
         0,
         15,
         1,
         67,
         67,
         54,
         54,
         3,
         3,
         3,
         7,
         5,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         44,
         44,
         70,
         70,
         70,
         0,
         11,
         8,
         9,
         10,
         12,
         14,
         13,
         13,
         14,
         11,
         11,
         40,
         11,
         11,
         40,
         11,
         71,
         11,
         11,
         40,
         11,
         11,
         11,
         11,
         12,
         12,
         12,
         12,
         54,
         71,
         75,
         76,
         11,
         15,
         16,
         73,
         73,
         74,
         57,
         16,
         77
      };
   }

   public an_3(aI_2<?> var1, rYB var2) {
      this.abstract_();
      Integer var7 = ((AtomicInteger)case_[1]).incrementAndGet();
      this.throws_[1] = var7;
      ArrayList var8 = Lists.newArrayList();
      this.throws_[3] = var8;
      rjU_2 var9 = rjU_2.class_;
      this.throws_[13] = var9;
      rjU_2 var10 = rjU_2.class_;
      this.throws_[14] = var10;
      rfl_3 var11 = (rfl_3)case_[3];
      this.throws_[19] = var11;
      rjU_2 var12 = rjU_2.class_;
      this.throws_[26] = var12;
      Float var13 = 1.0F;
      this.throws_[32] = var13;
      Float var14 = 1.0F;
      this.throws_[33] = var14;
      Random var15 = new Random();
      this.throws_[40] = var15;
      Integer var16 = -this.rV();
      this.throws_[42] = var16;
      Object2DoubleArrayMap var17 = new Object2DoubleArrayMap(2);
      this.throws_[44] = var17;
      Boolean var18 = true;
      this.throws_[48] = var18;
      UUID var19 = rfU_2.class_((Random)this.throws_[40]);
      this.throws_[63] = var19;
      String var20 = ((UUID)this.throws_[63]).toString();
      this.throws_[64] = var20;
      HashSet var21 = Sets.newHashSet();
      this.throws_[66] = var21;
      double[] var22 = new double[]{0.0, 0.0, 0.0};
      this.throws_[68] = var22;
      this.throws_[0] = var1;
      this.throws_[7] = var2;
      ap_3 var25 = var1.volatile_();
      this.throws_[70] = var25;
      rjU_2 var26 = rjU_2.class_;
      this.throws_[11] = var26;
      rfH_2 var27 = rfH_2.protected_;
      this.throws_[12] = var27;
      rjU_2 var28 = rjU_2.class_;
      this.throws_[55] = var28;
      this.new_(0.0, 0.0, 0.0);
      rmE_2 var29 = new rmE_2(this);
      this.throws_[49] = var29;
      ((rmE_2)this.throws_[49]).class_((rut_3<Byte>)case_[5], (byte)0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Integer>)case_[6], this.ri());
      ((rmE_2)this.throws_[49]).class_((rut_3<Boolean>)case_[8], false);
      ((rmE_2)this.throws_[49]).class_((rut_3<Optional>)case_[7], Optional.empty());
      ((rmE_2)this.throws_[49]).class_((rut_3<Boolean>)case_[9], false);
      ((rmE_2)this.throws_[49]).class_((rut_3<Boolean>)case_[10], false);
      ((rmE_2)this.throws_[49]).class_((rut_3<iM_2>)case_[11], iM_2.STANDING);
      this.m_();
      Float var30 = this.class_(iM_2.STANDING, (ap_3)this.throws_[70]);
      this.throws_[71] = var30;
      String var31 = this.PT().byte_();
      this.throws_[74] = var31;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof an_3) {
         return ((an_3)var1).throws_[1] == this.throws_[1] ? true : implements_[11];
      } else {
         return implements_[12];
      }
   }

   @Override
   public String toString() {
      return String.format(
         Locale.ROOT,
         "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
         this.getClass().getSimpleName(),
         this.g().getString(),
         (Integer)this.throws_[1],
         (rYB)this.throws_[7] == null ? "~NULL~" : ((rYB)this.throws_[7]).toString(),
         this.rx(),
         this.re(),
         this.BO()
      );
   }

   @Override
   public int hashCode() {
      return (Integer)this.throws_[1];
   }

   public boolean B() {
      return this.PF() && !this.rT() && !this.native_() && !this.x() && !this.ry() && this.BM() ? true : implements_[98];
   }

   @Override
   public boolean C() {
      return ((rYB)this.throws_[7]).B().break_(rRu_1.final_);
   }

   public boolean D() {
      return ((rmE_2)this.throws_[49]).<Boolean>class_((rut_3<Boolean>)case_[8]);
   }

   public boolean I() {
      return true;
   }

   public int V() {
      return (Integer)this.throws_[1];
   }

   public boolean this_(an_3 var1) {
      return this.class_(var1, false);
   }

   public void this_() {
      if (!((rYB)this.throws_[7]).continue_) {
         this.break_(6, this.w());
      }

      this.Pn();
   }

   public rYB e() {
      return (rYB)this.throws_[7];
   }

   public String i() {
      return (String)this.throws_[64];
   }

   public boolean x() {
      return this.Pb() == iM_2.CROUCHING ? true : implements_[179];
   }

   public boolean h() {
      return this.finally_(1);
   }

   public float f() {
      return 0.0F;
   }

   @Override
   public boolean l() {
      return true;
   }

   public void a() {
      if (this.rZ()) {
         Integer var5 = (Integer)this.throws_[58] - 1;
         this.throws_[58] = var5;
      }
   }

   public abstract void class_(rcd_3 var1);

   public void class_(an_3 var1, int var2, rye_3 var3) {
      if (var1 instanceof rhN_2) {
         Oo_1.byte_.class_((rhN_2)var1, this, var3);
      }
   }

   public void class_(rrEm_1 var1, rSg_1 var2) {
      this.protected_((Integer)this.throws_[42] + 1);
      if ((Integer)this.throws_[42] == 0) {
         this.case_(8);
      }

      this.break_(rye_3.break_, 5.0F);
   }

   public boolean class_(rlb_3<rXs_1> var1, double var2) {
      rfl_3 var4 = this.rN().break_(0.001);
      int var5 = rfU_2.byte_(var4.class_);
      int var6 = rfU_2.throws_(var4.protected_);
      int var7 = rfU_2.byte_(var4.break_);
      int var8 = rfU_2.throws_(var4.throws_);
      int var9 = rfU_2.byte_(var4.byte_);
      int var10 = rfU_2.throws_(var4.case_);
      if (!((rYB)this.throws_[7]).class_(var5, var7, var9, var6, var8, var10)) {
         return false;
      } else {
         double var11 = finally_[190];
         boolean var13 = this.u();
         boolean var14 = false;
         rjU_2 var15 = rjU_2.class_;
         int var16 = 0;
         rfw_3 var17 = new rfw_3();

         for (int var18 = var5; var18 < var6; var18++) {
            for (int var19 = var7; var19 < var8; var19++) {
               for (int var20 = var9; var20 < var10; var20++) {
                  var17.class_(var18, var19, var20);
                  rXE var21 = ((rYB)this.throws_[7]).break_(var17);
                  if (var21.class_(var1)) {
                     double var22 = (double)((float)var19 + var21.class_((rRq_1)((rYB)this.throws_[7]), var17));
                     if (var22 >= var4.break_) {
                        var14 = true;
                        var11 = Math.max(var22 - var4.break_, var11);
                        if (var13) {
                           rjU_2 var24 = var21.byte_((rYB)this.throws_[7], var17);
                           if (var11 < 0.4) {
                              var24 = var24.class_(var11);
                           }

                           var15 = var15.throws_(var24);
                           var16++;
                        }
                     }
                  }
               }
            }
         }

         if (var15.case_() > 0.0) {
            if (var16 > 0) {
               var15 = var15.class_(1.0 / (double)var16);
            }

            if (!(this instanceof rhd_3)) {
               var15 = var15.protected_();
            }

            rjU_2 var26 = this.rv();
            var15 = var15.class_(var2);
            if (Math.abs(var26.break_) < 0.003 && Math.abs(var26.protected_) < 0.003 && var15.case_() < 0.0045000000000000005) {
               var15 = var15.protected_().class_(0.0045000000000000005);
            }

            this.byte_(this.rv().throws_(var15));
         }

         ((Object2DoubleMap)this.throws_[44]).put(var1, var11);
         return var14;
      }
   }

   public void class_(xd_3 var1) {
      Boolean var6 = true;
      this.throws_[75] = var6;
      this.throws_[77] = var1;
   }

   public void class_(float var1, int var2) {
      this.implements_(var1);
   }

   public boolean class_(int var1, rdn_3 var2) {
      return false;
   }

   public an_3 class_(rrEm_1 var1) {
      if ((rYB)this.throws_[7] instanceof rrEm_1 && !(Boolean)this.throws_[27]) {
         this.K();
         WP var2 = this.break_(var1);
         if (var2 == null) {
            return null;
         } else {
            an_3 var3 = this.BC().class_(var1);
            if (var3 != null) {
               var3.throws_(this);
               var3.class_(var2.class_.break_, var2.class_.byte_, var2.class_.protected_, var2.byte_, (Float)var3.throws_[16]);
               var3.byte_(var2.break_);
               var1.catch_(var3);
               if (var1.E() == rYB.throws_) {
                  rrEm_1.class_(var1);
               }
            }

            this.Pi();
            ((rrEm_1)((rYB)this.throws_[7])).volatile_();
            var1.volatile_();
            return var3;
         }
      } else {
         return null;
      }
   }

   public boolean class_(QP var1) {
      if (this.ra() instanceof rSK) {
         return false;
      } else {
         double var2 = this.re() + (double)this.Bx();
         rfH_2 var4 = new rfH_2(this.rx(), var2, this.BO());
         xc_3 var5 = ((rYB)this.throws_[7]).byte_(var4);
         return var5.byte_() == var1 ? true : implements_[94];
      }
   }

   private double class_(rpB_2 var1, double var2) {
      int var4 = var1.ordinal();
      double var5 = rfU_2.class_(var2 + ((double[])this.throws_[68])[var4], -0.51, 0.51);
      var2 = var5 - ((double[])this.throws_[68])[var4];
      ((double[])this.throws_[68])[var4] = var5;
      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1910609438552633685L;
   }

   public rgP_2 class_(rnO_2... var1) {
      return rnB_2.class_(this.BG(), this.g(), var1).class_(var1x -> var1x.class_(this.rM()).class_(this.rz()));
   }

   public static rjU_2 class_(rjU_2 var0, rfl_3 var1, rRR var2, rjm_3 var3, rqJ_2<rjC_2> var4, boolean var5, boolean var6) {
      double var7 = var0.break_;
      double var9 = var0.byte_;
      double var11 = var0.protected_;
      if (var9 != 0.0) {
         if (!var5) {
            var9 = rjw_3.class_(rpB_2.Y, var1, var2, var9, var3, var4.class_());
         }

         if (var9 != 0.0) {
            var1 = var1.protected_(0.0, var9, 0.0);
         }
      }

      boolean var13 = Math.abs(var7) < Math.abs(var11) ? true : implements_[66];
      if (var13 && var11 != 0.0) {
         if (!var6) {
            var11 = rjw_3.class_(rpB_2.Z, var1, var2, var11, var3, var4.class_());
         }

         if (var11 != 0.0) {
            var1 = var1.protected_(0.0, 0.0, var11);
         }
      }

      if (var7 != 0.0) {
         if (!var6) {
            var7 = rjw_3.class_(rpB_2.X, var1, var2, var7, var3, var4.class_());
         }

         if (!var13 && var7 != 0.0) {
            var1 = var1.protected_(var7, 0.0, 0.0);
         }
      }

      if (!var13 && var11 != 0.0 && !var6) {
         var11 = rjw_3.class_(rpB_2.Z, var1, var2, var11, var3, var4.class_());
      }

      return new rjU_2(var7, var9, var11);
   }

   public boolean class_(an_3 var1, boolean var2) {
      for (an_3 var3 = var1; (an_3)var3.throws_[5] != null; var3 = (an_3)var3.throws_[5]) {
         if ((an_3)var3.throws_[5] == this) {
            return false;
         }
      }

      if (var2 || this.new_(var1) && var1.case_(this)) {
         if (this.Pm()) {
            this.BH();
         }

         this.class_(iM_2.STANDING);
         this.throws_[5] = var1;
         ((an_3)this.throws_[5]).extends_(this);
         return true;
      } else {
         return implements_[150];
      }
   }

   public void class_(byte var1) {
      if (var1 == 53) {
         kB_2.class_(this);
      }
   }

   public float class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return var6;
   }

   public void class_(rYB var1) {
      this.throws_[7] = var1;
   }

   public void class_(float var1, rjU_2 var2) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(this);
      rjU_2 var3 = class_(var2, var1, (Float)this.throws_[15]);
      this.byte_(this.rv().throws_(var3));
      Float var8 = (Float)this.throws_[72];
      this.throws_[15] = var8;
   }

   public boolean class_(rlb_3<rXs_1> var1) {
      return (rlb_3)this.throws_[46] == var1 ? true : implements_[100];
   }

   public boolean class_(rfH_2 var1, xc_3 var2) {
      rjC_2 var3 = var2.break_((rYB)this.throws_[7], var1, rjm_3.class_(this));
      rjC_2 var4 = var3.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
      return rjw_3.byte_(var4, rjw_3.class_(this.rN()), rjN_2.implements_);
   }

   public void class_(rqA_2 var1, float var2, float var3) {
      if (!this.BF()) {
         ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3);
      }
   }

   private void class_(boolean var1, Set<an_3> var2) {
      for (an_3 var4 : this.Bh()) {
         if (!var1 || rhN_2.class.isAssignableFrom(var4.getClass())) {
            var2.add(var4);
         }

         var4.class_(var1, var2);
      }
   }

   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.new_(var1, var3, var5);
      this.case_(var7, var8);
   }

   public rcy_3 class_(float... var1) {
      rcy_3 var2 = new rcy_3();

      for (float var6 : var1) {
         var2.add(rcu_3.class_(var6));
      }

      return var2;
   }

   public rsE_2 class_(rpL_2 var1) {
      return this.class_(var1, 0);
   }

   private void class_(an_3 var1, al_3 var2) {
      if (this.synchronized_(var1)) {
         double var3 = this.re() + this.PS() + var1.Pv();
         var2.accept(var1, this.rx(), var3, this.BO());
      }
   }

   public ryZ_2 class_(rhd_3 var1, rjU_2 var2, rpm_3 var3) {
      return ryZ_2.PASS;
   }

   public boolean class_(an_3 var1, double var2) {
      double var4 = ((rjU_2)var1.throws_[11]).break_ - ((rjU_2)this.throws_[11]).break_;
      double var6 = ((rjU_2)var1.throws_[11]).byte_ - ((rjU_2)this.throws_[11]).byte_;
      double var8 = ((rjU_2)var1.throws_[11]).protected_ - ((rjU_2)this.throws_[11]).protected_;
      return var4 * var4 + var6 * var6 + var8 * var8 < var2 * var2 ? true : implements_[15];
   }

   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      return ryZ_2.PASS;
   }

   public void class_(double var1, double var3, double var5, float var7) {
      this.byte_(new rjU_2(var1, var3, var5).throws_((double)var7, (double)var7, (double)var7));
   }

   public boolean class_(float var1, float var2) {
      if (this.BP()) {
         for (an_3 var4 : this.Bh()) {
            var4.class_(var1, var2);
         }
      }

      return implements_[70];
   }

   public rjG_2 class_(double var1, float var3, boolean var4) {
      rjU_2 var5 = this.new_(var3);
      rjU_2 var6 = this.break_(var3);
      rjU_2 var7 = var5.break_(var6.break_ * var1, var6.byte_ * var1, var6.protected_ * var1);
      return ((rYB)this.throws_[7]).class_(new rjB_2(var5, var7, rjS_2.OUTLINE, var4 ? rjs_3.ANY : rjs_3.NONE, this));
   }

   public void class_(Ko_1 var1) {
      var1.class_("Entity Type", () -> aI_2.class_(this.BC()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.class_("Entity ID", (Integer)this.throws_[1]);
      var1.class_("Entity Name", () -> this.g().getString());
      var1.class_("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.rx(), this.re(), this.BO()));
      var1.class_("Entity's Block location", Ko_1.class_(rfU_2.byte_(this.rx()), rfU_2.byte_(this.re()), rfU_2.byte_(this.BO())));
      rjU_2 var2 = this.rv();
      if (var2 != null) {
         var1.class_("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", var2.break_, var2.byte_, var2.protected_));
      }

      var1.class_("Entity's Passengers", () -> this.Bh().toString());
      var1.class_("Entity's Vehicle", () -> this.ra().toString());
   }

   public rsE_2 class_(rdn_3 var1, float var2) {
      if (var1.class_()) {
         return null;
      } else if (((rYB)this.throws_[7]).continue_) {
         return null;
      } else {
         rsE_2 var3 = new rsE_2((rYB)this.throws_[7], this.rx(), this.re() + (double)var2, this.BO(), var1);
         var3.private_();
         ((rYB)this.throws_[7]).a_(var3);
         return var3;
      }
   }

   public float class_(eX_2 var1) {
      return this.break_(var1.class_(), var1.break_(), var1.byte_());
   }

   public rjU_2 class_(float var1) {
      return this.finally_(var1).break_(0.0, (double)((Float)this.throws_[71]).floatValue() * 0.7, 0.0);
   }

   public double class_(double var1, double var3, double var5) {
      double var7 = this.rx() - var1;
      double var9 = this.re() - var3;
      double var11 = this.BO() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public rcy_3 class_(double... var1) {
      rcy_3 var2 = new rcy_3();

      for (double var6 : var1) {
         var2.add(rcz_3.class_(var6));
      }

      return var2;
   }

   public void class_(xc_3 var1) {
   }

   public static rjU_2 class_(an_3 var0, rjU_2 var1, rfl_3 var2, rYB var3, rjm_3 var4, rqJ_2<rjC_2> var5, boolean var6, boolean var7) {
      boolean var8 = var1.break_ == 0.0 ? true : implements_[50];
      boolean var9 = var1.byte_ == 0.0 ? true : implements_[52];
      boolean var10 = var1.protected_ == 0.0 ? true : implements_[54];
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         return class_(var1, var2, var3, var4, var5, var6, var7);
      } else {
         rqJ_2 var11 = new rqJ_2<>(Stream.concat(var5.class_(), var3.byte_(var0, var2.break_(var1))));
         return class_(var1, var2, var11, var6, var7);
      }
   }

   public void class_(rhN_2 var1) {
   }

   public rjU_2 class_(float var1, float var2, float var3) {
      return this.byte_(this.private_(var2, var3), this.throws_(var1, var3));
   }

   public boolean class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return true;
   }

   public void class_(rrEm_1 var1, iB_2 var2) {
   }

   public void class_(xc_3 var1, rjU_2 var2) {
      this.throws_[26] = var2;
   }

   public void class_(iM_2 var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<iM_2>)case_[11], var1);
   }

   public static rjU_2 class_(double var0, double var2, float var4) {
      double var5 = (var0 + var2 + 1.0E-5F) / 2.0;
      float var7 = -rfU_2.class_(var4 * (float) (Math.PI / 180.0));
      float var8 = rfU_2.break_(var4 * (float) (Math.PI / 180.0));
      float var9 = Math.max(Math.abs(var7), Math.abs(var8));
      return new rjU_2((double)var7 * var5 / (double)var9, 0.0, (double)var8 * var5 / (double)var9);
   }

   public void class_(rXQ var1, rdn_3 var2) {
   }

   public boolean class_(rye_3 var1) {
      return this.throws_[62] && var1 != rye_3.volatile_ && !var1.synchronized_() ? true : implements_[208];
   }

   public rsE_2 class_(rpL_2 var1, int var2) {
      return this.class_(new rdn_3(var1), (float)var2);
   }

   public void class_(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.package_(var1, var3, var5);
      Float var14 = var7;
      this.throws_[15] = var14;
      if (var9) {
         Float var15 = (Float)this.throws_[15] % 360.0F;
         this.throws_[15] = var15;
      }

      Float var16 = rfU_2.class_(var8, -90.0F, 90.0F);
      this.throws_[16] = var16;
      if (var9) {
         Float var17 = (Float)this.throws_[16] % 360.0F;
         this.throws_[16] = var17;
      }

      Float var18 = (Float)this.throws_[15];
      this.throws_[17] = var18;
      Float var19 = (Float)this.throws_[16];
      this.throws_[18] = var19;
   }

   public rjU_2 class_(rjU_2 var1, float var2) {
      if (var2 == 1.0F) {
         return new rjU_2(var1.break_, var1.byte_ + (double)((Float)this.throws_[71]).floatValue(), var1.byte_);
      } else {
         double var3 = rfU_2.protected_((double)var2, (Double)this.throws_[8], this.rx());
         double var5 = rfU_2.protected_((double)var2, (Double)this.throws_[9], this.re()) + (double)this.Bx();
         double var7 = rfU_2.protected_((double)var2, (Double)this.throws_[10], this.BO());
         return new rjU_2(var3, var5, var7);
      }
   }

   public boolean class_(rnM_2 var1) {
      return this.BG() != null && this.BG().class_(var1) ? true : implements_[189];
   }

   public rjG_2 class_(rjU_2 var1, double var2, float var4, boolean var5, Predicate<xc_3> var6) {
      rjU_2 var7 = this.new_(var4);
      rjU_2 var8 = var7.break_(var1.break_ * var2, var1.byte_ * var2, var1.protected_ * var2);
      rjB_2 var9 = new rjB_2(var7, var8, rjS_2.OUTLINE, var5 ? rjs_3.ANY : rjs_3.NONE, this);
      var9.class_(var6);
      return ((rYB)this.throws_[7]).break_(var9);
   }

   public void class_(rut_3<?> var1) {
      if (((rut_3)case_[11]).equals(var1)) {
         this.q_();
      }
   }

   public void class_(rfl_3 var1) {
      this.throws_[19] = var1;
   }

   public void class_(Rm_1 var1, rjU_2 var2) {
      rjU_2 var3 = var1.class_(this);
      double var4 = var2.break_ - var3.break_;
      double var6 = var2.byte_ - var3.byte_;
      double var8 = var2.protected_ - var3.protected_;
      double var10 = (double)rfU_2.class_(var4 * var4 + var8 * var8);
      Float var16 = rfU_2.catch_((float)(-(rfU_2.protected_(var6, var10) * 180.0F / (float)Math.PI)));
      this.throws_[16] = var16;
      Float var17 = rfU_2.catch_((float)(rfU_2.protected_(var8, var4) * 180.0F / (float)Math.PI) - 90.0F);
      this.throws_[15] = var17;
      this.implements_((Float)this.throws_[15]);
      Float var18 = (Float)this.throws_[16];
      this.throws_[18] = var18;
      Float var19 = (Float)this.throws_[15];
      this.throws_[17] = var19;
   }

   public boolean class_(Class<? extends an_3> var1) {
      for (an_3 var3 : this.Bh()) {
         if (var1.isAssignableFrom(var3.getClass())) {
            return true;
         }
      }

      return implements_[236];
   }

   public static rjU_2 class_(rjU_2 var0, rfl_3 var1, rqJ_2<rjC_2> var2, boolean var3, boolean var4) {
      double var5 = var0.break_;
      double var7 = var0.byte_;
      double var9 = var0.protected_;
      if (var7 != 0.0) {
         if (!var3) {
            var7 = rjw_3.class_(rpB_2.Y, var1, var2.class_(), var7);
         }

         if (var7 != 0.0) {
            var1 = var1.protected_(0.0, var7, 0.0);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9) ? true : implements_[56];
      if (var11 && var9 != 0.0) {
         if (!var4) {
            var9 = rjw_3.class_(rpB_2.Z, var1, var2.class_(), var9);
         }

         if (var9 != 0.0) {
            var1 = var1.protected_(0.0, 0.0, var9);
         }
      }

      if (var5 != 0.0) {
         if (!var4) {
            var5 = rjw_3.class_(rpB_2.X, var1, var2.class_(), var5);
         }

         if (!var11 && var5 != 0.0) {
            var1 = var1.protected_(var5, 0.0, 0.0);
         }
      }

      if (!var11 && var9 != 0.0 && !var4) {
         var9 = rjw_3.class_(rpB_2.Z, var1, var2.class_(), var9);
      }

      return new rjU_2(var5, var7, var9);
   }

   public rjU_2 class_(rjU_2 var1, iG_2 var2) {
      return var1;
   }

   public boolean class_(double var1) {
      double var3 = this.rN().class_();
      if (Double.isNaN(var3)) {
         var3 = 1.0;
      }

      var3 = var3 * 64.0 * (Double)case_[4];
      return var1 < var3 * var3 ? true : implements_[114];
   }

   private static rjU_2 class_(rjU_2 var0, float var1, float var2) {
      double var3 = var0.catch_();
      if (var3 < 1.0E-7) {
         return rjU_2.class_;
      } else {
         rjU_2 var5 = (var3 > 1.0 ? var0.protected_() : var0).class_((double)var1);
         float var6 = rfU_2.class_(var2 * (float) (Math.PI / 180.0));
         float var7 = rfU_2.break_(var2 * (float) (Math.PI / 180.0));
         return new rjU_2(var5.break_ * (double)var7 - var5.protected_ * (double)var6, var5.byte_, var5.protected_ * (double)var7 + var5.break_ * (double)var6);
      }
   }

   public float class_(rqd_3 var1) {
      float var2 = rfU_2.catch_((Float)this.throws_[15]);
      switch (((int[])aC_2.class_[0])[var1.ordinal()]) {
         case 1:
            return var2 + 180.0F;
         case 2:
            return var2 + 270.0F;
         case 3:
            return var2 + 90.0F;
         default:
            return var2;
      }
   }

   public void class_(double var1, double var3, double var5, float var7, float var8) {
      this.native_(var1, var3, var5);
      Float var13 = var7;
      this.throws_[15] = var13;
      Float var14 = var8;
      this.throws_[16] = var14;
      this.PX();
   }

   public void class_(iB_2 var1, an_3 var2) {
      if (var2 instanceof iB_2) {
         eA_2.class_((iB_2)var2, var1);
      }

      eA_2.break_(var1, var2);
   }

   private rjU_2 class_(rjU_2 var1, boolean var2, boolean var3) {
      rfl_3 var4 = this.rN();
      rjm_3 var5 = rjm_3.class_(this);
      boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().y().new_();
      Stream var7 = ((rYB)this.throws_[7]).class_(this, var4.break_(var1), var0 -> true);
      if (!var6) {
         rjC_2 var8 = ((rYB)this.throws_[7]).instanceof_().byte_();
         if (!rjw_3.byte_(var8, rjw_3.class_(var4.break_(1.0E-7)), rjN_2.implements_)) {
            var7 = Stream.concat(var7, Stream.of(var8));
         }
      }

      rqJ_2 var19 = new rqJ_2(var7);
      rjU_2 var9 = var1.catch_() == 0.0 ? var1 : class_(this, var1, var4, (rYB)this.throws_[7], var5, var19, var2, var3);
      boolean var10 = var1.break_ != var9.break_ ? true : implements_[58];
      boolean var11 = var1.byte_ != var9.byte_ ? true : implements_[60];
      boolean var12 = var1.protected_ != var9.protected_ ? true : implements_[62];
      boolean var13 = !this.throws_[20] && (!var11 || !(var1.byte_ < 0.0)) ? implements_[64] : implements_[63];
      if ((Float)this.throws_[37] > 0.0F && var13 && (var10 || var12)) {
         rjU_2 var14 = new rjU_2(var1.break_, (double)((Float)this.throws_[37]).floatValue(), var1.protected_);
         rjU_2 var15 = class_(this, var14, var4, (rYB)this.throws_[7], var5, var19, var2, var3);
         rjU_2 var16 = new rjU_2(0.0, (double)((Float)this.throws_[37]).floatValue(), 0.0);
         rjU_2 var17 = class_(this, var16, var4.break_(var1.break_, 0.0, var1.protected_), (rYB)this.throws_[7], var5, var19, var2, var3);
         if (var17.byte_ < (double)((Float)this.throws_[37]).floatValue()) {
            rjU_2 var18 = class_(this, new rjU_2(var1.break_, 0.0, var1.protected_), var4.protected_(var17), (rYB)this.throws_[7], var5, var19, var2, var3)
               .throws_(var17);
            if (case_(var18) > case_(var15)) {
               var15 = var18;
            }
         }

         if (case_(var15) > case_(var9)) {
            rjU_2 var20 = new rjU_2(0.0, -var15.byte_ + var1.byte_, 0.0);
            return var15.throws_(class_(this, var20, var4.protected_(var15), (rYB)this.throws_[7], var5, var19, var2, var3));
         }
      }

      return var9;
   }

   private static rgP_2 class_(rgP_2 var0) {
      rVi_1 var1 = var0.throws_().class_(var0.class_().class_(null));

      for (rgP_2 var3 : var0.protected_()) {
         var1.class_(class_(var3));
      }

      return var1;
   }

   public float class_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.85F;
   }

   public void class_(iG_2 var1, rjU_2 var2) {
      rfl_3 var3 = this.rN();
      double var4 = this.rx();
      double var6 = this.BO();
      if ((Boolean)this.throws_[38]) {
         this.class_(this.rN().protected_(var2));
         this.PC();
      } else {
         QY var8 = QY.instanceof_();
         if (var1 == iG_2.PISTON) {
            var2 = this.protected_(var2);
            if (var2.equals(rjU_2.class_)) {
               return;
            }
         }

         Boolean var32 = false;
         this.throws_[75] = var32;
         Object var33 = null;
         this.throws_[77] = var33;
         Boolean var34 = false;
         this.throws_[76] = var34;
         if (((rjU_2)this.throws_[26]).catch_() > 1.0E-7) {
            var2 = var2.finally_((rjU_2)this.throws_[26]);
            rjU_2 var35 = rjU_2.class_;
            this.throws_[26] = var35;
            this.byte_(rjU_2.class_);
         }

         var2 = this.class_(var2, var1);
         boolean var9 = false;
         boolean var10 = false;
         if (this == (cb_3)var8.class_[57]) {
            rrLz_1 var11 = rrLz_1.class_(var2, this.Ps(), var3, var9, var10, this.break_(var2, var9, var10));
            var9 = var11.class_();
            var10 = var11.class_();
            var2 = var11.catch_();
         }

         rjU_2 var47 = this.class_(var2, var9, var10);
         if (var47.catch_() > 1.0E-7) {
            this.class_(this.rN().protected_(var47));
            this.PC();
         }

         boolean var12 = rfU_2.break_(var2.break_, var47.break_) && rfU_2.break_(var2.protected_, var47.protected_) ? implements_[34] : implements_[33];
         boolean var13 = var2.byte_ != var47.byte_ ? true : implements_[36];
         if (this == (cb_3)var8.class_[57] && (var12 != (Boolean)this.throws_[21] || var13 != (Boolean)this.throws_[22])) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLj_1.class_(var12, var13));
         }

         Boolean var36 = var12;
         this.throws_[23] = var36;
         Boolean var37 = var13;
         this.throws_[24] = var37;
         Boolean var38 = this.throws_[24] && var2.byte_ < 0.0 ? true : implements_[38];
         this.throws_[20] = var38;
         Boolean var39 = var12;
         this.throws_[21] = var39;
         Boolean var40 = var13;
         this.throws_[22] = var40;
         if (this == (cb_3)var8.class_[57]) {
            double var14 = this.rx() - var4;
            double var16 = this.BO() - var6;
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLW.class_((double)rfU_2.class_(var14 * var14 + var16 * var16)));
         }

         rfH_2 var48 = this.BS();
         xc_3 var15 = ((rYB)this.throws_[7]).byte_(var48);
         this.class_(var47.byte_, (Boolean)this.throws_[20], var15, var48);
         rjU_2 var49 = this.rv();
         if (var2.break_ != var47.break_) {
            this.catch_(0.0, var49.byte_, var49.protected_);
         }

         if (var2.protected_ != var47.protected_) {
            this.catch_(var49.break_, var49.byte_, 0.0);
         }

         xd_3 var17 = var15.break_();
         if (var2.byte_ != var47.byte_) {
            var17.class_((rYB)this.throws_[7], this);
         }

         if ((Boolean)this.throws_[20] && !this.Pc()) {
            var17.class_((rYB)this.throws_[7], var48, this);
         }

         if (this.PK() && !this.Pm()) {
            double var18 = var47.break_;
            double var20 = var47.byte_;
            double var22 = var47.protected_;
            if (!var17.class_(rls_3.F)) {
               var20 = 0.0;
            }

            Float var41 = (float)((double)((Float)this.throws_[29]).floatValue() + (double)rfU_2.class_(case_(var47)) * 0.6);
            this.throws_[29] = var41;
            Float var42 = (float)((double)((Float)this.throws_[30]).floatValue() + (double)rfU_2.class_(var18 * var18 + var20 * var20 + var22 * var22) * 0.6);
            this.throws_[30] = var42;
            if ((Float)this.throws_[30] > (Float)this.throws_[32] && !var15.catch_()) {
               Float var43 = this.rQ();
               this.throws_[32] = var43;
               if (!this.rT()) {
                  this.break_(var48, var15);
               } else {
                  an_3 var24 = this.BP() && this.rU() != null ? this.rU() : this;
                  float var25 = var24 == this ? 0.35F : protected_[9];
                  rjU_2 var26 = var24.rv();
                  float var27 = rfU_2.class_(var26.break_ * var26.break_ * 0.2F + var26.byte_ * var26.byte_ + var26.protected_ * var26.protected_ * 0.2F)
                     * var25;
                  if (var27 > 1.0F) {
                     var27 = 1.0F;
                  }

                  this.private_(var27);
               }
            } else if ((Float)this.throws_[30] > (Float)this.throws_[33] && this.PJ() && var15.catch_()) {
               Float var44 = this.final_((Float)this.throws_[30]);
               this.throws_[33] = var44;
            }
         }

         try {
            this.Px();
         } catch (Throwable var45) {
            KY var19 = KY.class_(var45, "Checking entity block collision");
            Ko_1 var51 = var19.class_("Entity being checked for collision");
            this.class_(var51);
            throw new KU(var19);
         }

         float var50 = this.rq();
         this.byte_(this.rv().throws_((double)var50, 1.0, (double)var50));
         if (((rYB)this.throws_[7]).byte_(this.rN().break_(0.001)).noneMatch(var0 -> var0.class_(rls_3.N) || var0.class_(xu_3.instanceof_))
            && (Integer)this.throws_[42] <= 0) {
            this.protected_(-this.rV());
         }

         if (this.Pk() && this.Pz()) {
            this.class_(rqn_3.SY, 0.7F, 1.6F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.4F);
            this.protected_(-this.rV());
         }
      }
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
   }

   public float class_(rpa_3 var1) {
      float var2 = rfU_2.catch_((Float)this.throws_[15]);
      switch (((int[])aC_2.class_[1])[var1.ordinal()]) {
         case 1:
            return -var2;
         case 2:
            return protected_[73] - var2;
         default:
            return var2;
      }
   }

   public void class_(rfH_2 var1, float var2, float var3) {
      this.class_((double)var1.b_() + 0.5, (double)var1.c_(), (double)var1.d_() + 0.5, var2, var3);
   }

   public void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      if (var3) {
         if ((Float)this.throws_[31] > 0.0F) {
            var4.break_().class_((rYB)this.throws_[7], var5, this, (Float)this.throws_[31]);
         }

         Float var10 = 0.0F;
         this.throws_[31] = var10;
      } else if (var1 < 0.0) {
         Float var11 = (float)((double)((Float)this.throws_[31]).floatValue() - var1);
         this.throws_[31] = var11;
      }
   }

   public Optional<rqT_2> class_(rrEm_1 var1, rfH_2 var2, boolean var3) {
      return var1.M().class_(var2, var3);
   }

   protected rjU_2 class_(rpB_2 var1, rqT_2 var2) {
      return WB.class_(var2, var1, this.Ps(), this.a_(this.Pb()));
   }

   public rjG_2 class_(rjU_2 var1, rjU_2 var2, double var3, boolean var5) {
      rjU_2 var6 = var1.break_(var2.break_ * var3, var2.byte_ * var3, var2.protected_ * var3);
      return ((rYB)this.throws_[7]).break_(new rjB_2(var1, var6, rjS_2.OUTLINE, var5 ? rjs_3.ANY : rjs_3.NONE, this));
   }

   public void rd() {
      if (this.ra() instanceof rSK) {
         Boolean var5 = false;
         this.throws_[43] = var5;
      } else if (this.class_(rlG_2.break_, 0.014)) {
         if (!(Boolean)this.throws_[43] && !(Boolean)this.throws_[48]) {
            this.U();
         }

         Float var6 = 0.0F;
         this.throws_[31] = var6;
         Boolean var7 = true;
         this.throws_[43] = var7;
         this.rE();
      } else {
         Boolean var8 = false;
         this.throws_[43] = var8;
      }
   }

   public rjU_2 m() {
      return this.byte_((Float)this.throws_[16], (Float)this.throws_[15]);
   }

   public boolean o() {
      return false;
   }

   public void p() {
      if (this.Py()) {
         this.native_(this.PF() && this.rT() && !this.Pm() ? true : implements_[84]);
      } else {
         this.native_(this.PF() && this.W() && !this.Pm() ? true : implements_[86]);
      }
   }

   public void rb() {
      if (!this.q()) {
         this.case_(15);
         this.break_(rye_3.protected_, 4.0F);
      }
   }

   public float t() {
      return 0.0F;
   }

   @Override
   public rgP_2 g() {
      rgP_2 var1 = this.rD();
      return var1 != null ? class_(var1) : this.PT();
   }

   public void j() {
      this.PD();
   }

   public boolean q() {
      return this.BC().byte_();
   }

   public void U() {
      an_3 var1 = this.BP() && this.rU() != null ? this.rU() : this;
      float var2 = var1 == this ? 0.2F : protected_[25];
      rjU_2 var3 = var1.rv();
      float var4 = rfU_2.class_(var3.break_ * var3.break_ * 0.2F + var3.byte_ * var3.byte_ + var3.protected_ * var3.protected_ * 0.2F) * var2;
      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      if ((double)var4 < 0.25) {
         this.class_(this.BJ(), var4, 1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.4F);
      } else {
         this.class_(this.Bv(), var4, 1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.4F);
      }

      float var5 = (float)rfU_2.byte_(this.re());

      for (int var6 = 0; (float)var6 < 1.0F + ((ap_3)this.throws_[70]).class_ * 20.0F; var6++) {
         double var7 = (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * (double)((ap_3)this.throws_[70]).class_;
         double var9 = (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * (double)((ap_3)this.throws_[70]).class_;
         ((rYB)this.throws_[7])
            .class_(
               rLQ.throws_,
               this.rx() + var7,
               (double)(var5 + 1.0F),
               this.BO() + var9,
               var3.break_,
               var3.byte_ - ((Random)this.throws_[40]).nextDouble() * 0.2F,
               var3.protected_
            );
      }

      for (int var11 = implements_[96]; (float)var11 < 1.0F + ((ap_3)this.throws_[70]).class_ * 20.0F; var11++) {
         double var12 = (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * (double)((ap_3)this.throws_[70]).class_;
         double var13 = (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * (double)((ap_3)this.throws_[70]).class_;
         ((rYB)this.throws_[7]).class_(rLQ.E, this.rx() + var12, (double)(var5 + 1.0F), this.BO() + var13, var3.break_, var3.byte_, var3.protected_);
      }
   }

   public void rf() {
      Boolean var5 = true;
      this.throws_[25] = var5;
   }

   public boolean w() {
      return false;
   }

   public rjU_2 rv() {
      return (rjU_2)this.throws_[14];
   }

   public boolean u() {
      return true;
   }

   public boolean rn() {
      boolean var1 = (Boolean)this.throws_[67];
      Boolean var6 = false;
      this.throws_[67] = var6;
      return var1;
   }

   public Set<String> y() {
      return (Set<String>)this.throws_[66];
   }

   public rjU_2 rh() {
      return rjU_2.class_(this.import_());
   }

   public double break_(rjU_2 var1) {
      double var2 = this.rx() - var1.break_;
      double var4 = this.re() - var1.byte_;
      double var6 = this.BO() - var1.protected_;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public WP break_(rrEm_1 var1) {
      boolean var2 = ((rYB)this.throws_[7]).E() == rYB.throws_ && var1.E() == rYB.byte_ ? true : implements_[211];
      boolean var3 = var1.E() == rYB.throws_ ? true : implements_[213];
      if (!var2 && !var3) {
         boolean var17 = var1.E() == rYB.protected_ ? true : implements_[215];
         if (((rYB)this.throws_[7]).E() != rYB.protected_ && !var17) {
            return null;
         } else {
            roE_2 var5 = var1.instanceof_();
            double var6 = Math.max(-2.9999872E7, var5.throws_() + 16.0);
            double var8 = Math.max(-2.9999872E7, var5.case_() + 16.0);
            double var10 = Math.min(2.9999872E7, var5.catch_() - 16.0);
            double var12 = Math.min(2.9999872E7, var5.private_() - 16.0);
            double var14 = rRJ.class_(((rYB)this.throws_[7]).default_(), var1.default_());
            rfH_2 var16 = new rfH_2(rfU_2.class_(this.rx() * var14, var6, var10), this.re(), rfU_2.class_(this.BO() * var14, var8, var12));
            return this.class_(var1, var16, var17).map(var2x -> {
               xc_3 var3x = ((rYB)this.throws_[7]).byte_((rfH_2)this.throws_[61]);
               rpB_2 var4x;
               rjU_2 var5x;
               if (var3x.break_(rCT.char_)) {
                  var4x = var3x.byte_(rCT.char_);
                  rqT_2 var6x = rqp_3.class_((rfH_2)this.throws_[61], var4x, 21, rpB_2.Y, 21, var2xx -> ((rYB)this.throws_[7]).byte_(var2xx) == var3x);
                  var5x = this.class_(var4x, var6x);
               } else {
                  var4x = rpB_2.X;
                  var5x = new rjU_2(0.5, 0.0, 0.0);
               }

               return WB.class_(var1, var2x, var4x, var5x, this.a_(this.Pb()), this.rv(), (Float)this.throws_[15], (Float)this.throws_[16]);
            }).orElse(null);
         }
      } else {
         rfH_2 var4;
         if (var3) {
            var4 = rrEm_1.this_;
         } else {
            var4 = var1.class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, var1.X());
         }

         return new WP(
            new rjU_2((double)var4.b_() + 0.5, (double)var4.c_(), (double)var4.d_() + 0.5), this.rv(), (Float)this.throws_[15], (Float)this.throws_[16]
         );
      }
   }

   public rjG_2 break_(double var1, float var3, boolean var4) {
      return this.class_(this.break_(var3), var1, var3, var4, var0 -> {
         Popka var1x = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().q();
         return var1x == null || !var1x.aJ_();
      });
   }

   public void break_(rhN_2 var1) {
   }

   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         this.rf();
         return false;
      }
   }

   public float break_(double var1, double var3, double var5) {
      float var7 = (float)(this.rx() - var1);
      float var8 = (float)(this.re() - var3);
      float var9 = (float)(this.BO() - var5);
      return rfU_2.byte_(var7 * var7 + var8 * var8 + var9 * var9);
   }

   public void break_(rgP_2 var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Optional<rgP_2>>)case_[7], Optional.ofNullable(var1));
   }

   public double break_(rlb_3<rXs_1> var1) {
      return ((Object2DoubleMap)this.throws_[44]).getDouble(var1);
   }

   private boolean break_(rfl_3 var1) {
      return ((rYB)this.throws_[7]).a_(this, var1) && !((rYB)this.throws_[7]).protected_(var1) ? true : implements_[28];
   }

   public void break_(rfH_2 var1, xc_3 var2) {
      if (!var2.byte_().class_()) {
         xc_3 var3 = ((rYB)this.throws_[7]).byte_(var1.final_());
         zr_3 var4 = var3.class_(xu_3.Pq) ? var3.package_() : var2.package_();
         this.class_(var4.protected_(), var4.class_() * 0.15F, var4.break_());
      }
   }

   public void break_(double var1, double var3, double var5, float var7, float var8) {
      this.class_(var1, var3, var5, var7, var8, true);
   }

   private boolean break_(rjU_2 var1, boolean var2, boolean var3) {
      rfl_3 var4 = this.rN();
      rjm_3 var5 = rjm_3.class_(this);
      rjC_2 var6 = ((rYB)this.throws_[7]).instanceof_().byte_();
      Stream var7 = rjw_3.byte_(var6, rjw_3.class_(var4.break_(1.0E-7)), rjN_2.implements_) ? Stream.empty() : Stream.of(var6);
      Stream var8 = ((rYB)this.throws_[7]).class_(this, var4.break_(var1), var0 -> true);
      rqJ_2 var9 = new rqJ_2(Stream.concat(var8, var7));
      rjU_2 var10 = var1.catch_() == 0.0 ? var1 : class_(this, var1, var4, (rYB)this.throws_[7], var5, var9, var2, var3);
      boolean var11 = var1.break_ != var10.break_ ? true : implements_[40];
      boolean var12 = var1.byte_ != var10.byte_ ? true : implements_[42];
      boolean var13 = var1.protected_ != var10.protected_ ? true : implements_[44];
      boolean var14 = !this.throws_[20] && (!var12 || !(var1.byte_ < 0.0)) ? implements_[46] : implements_[45];
      if ((Float)this.throws_[37] > 0.0F && var14 && (var11 || var13)) {
         rjU_2 var15 = class_(
            this, new rjU_2(var1.break_, (double)((Float)this.throws_[37]).floatValue(), var1.protected_), var4, (rYB)this.throws_[7], var5, var9, var2, var3
         );
         rjU_2 var16 = class_(
            this,
            new rjU_2(0.0, (double)((Float)this.throws_[37]).floatValue(), 0.0),
            var4.break_(var1.break_, 0.0, var1.protected_),
            (rYB)this.throws_[7],
            var5,
            var9,
            var2,
            var3
         );
         if (var16.byte_ < (double)((Float)this.throws_[37]).floatValue()) {
            rjU_2 var17 = class_(this, new rjU_2(var1.break_, 0.0, var1.protected_), var4.protected_(var16), (rYB)this.throws_[7], var5, var9, var2, var3)
               .throws_(var16);
            if (case_(var17) > case_(var15)) {
               var15 = var17;
            }
         }

         if (case_(var15) > case_(var10)) {
            var15.throws_(class_(this, new rjU_2(0.0, -var15.byte_ + var1.byte_, 0.0), var4.protected_(var15), (rYB)this.throws_[7], var5, var9, var2, var3));
         }
      }

      return var1.byte_ != var10.byte_ && var1.byte_ < 0.0 ? true : implements_[48];
   }

   public rjU_2 break_(float var1) {
      return this.byte_(this.case_(var1), this.throws_(var1));
   }

   public void break_(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)case_[5]);
      if (var2) {
         ((rmE_2)this.throws_[49]).break_((rut_3<Byte>)case_[5], (byte)(var3 | 1 << var1));
      } else {
         ((rmE_2)this.throws_[49]).break_((rut_3<Byte>)case_[5], (byte)(var3 & ~(1 << var1)));
      }
   }

   public double break_(rfH_2 var1) {
      double var2 = (double)var1.b_() + 0.5;
      double var4 = (double)var1.c_() + 0.5;
      double var6 = (double)var1.d_() + 0.5;
      double var8 = rfU_2.class_(this.re() + (double)this.byte_(this.Pb()) - var4, 0.0, 1.0);
      double var10 = rfU_2.class_(this.rx() - var2, -0.5, 0.5);
      double var12 = rfU_2.class_(this.BO() - var6, -0.5, 0.5);
      return this.new_(1.0F).byte_(var2 + var10, var4 + var8, var6 + var12);
   }

   public double break_(double var1) {
      return this.catch_((2.0 * ((Random)this.throws_[40]).nextDouble() - 1.0) * var1);
   }

   public abstract void break_(rcd_3 var1);

   public void throws_(double var1, double var3, double var5) {
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         rfj_3 var7 = new rfj_3(new rfH_2(var1, var3, var5));
         ((rrEm_1)((rYB)this.throws_[7])).else_().class_(rrEl_1.catch_, var7, 0, this.V());
         ((rYB)this.throws_[7]).throws_(var7.break_, var7.byte_);
         this.case_(var1, var3, var5);
      }
   }

   public float throws_(float var1, float var2) {
      return var2 == 1.0F ? var1 : rfU_2.catch_(var2, (Float)this.throws_[17], var1);
   }

   public float throws_(float var1) {
      return var1 == 1.0F ? (Float)this.throws_[15] : rfU_2.catch_(var1, (Float)this.throws_[17], (Float)this.throws_[15]);
   }

   public void throws_(an_3 var1) {
      rcd_3 var2 = var1.case_(new rcd_3());
      var2.continue_("Dimension");
      this.throws_(var2);
      Integer var7 = (Integer)var1.throws_[58];
      this.throws_[58] = var7;
      rfH_2 var8 = (rfH_2)var1.throws_[61];
      this.throws_[61] = var8;
   }

   public void throws_(rcd_3 var1) {
      try {
         rcy_3 var2 = var1.protected_(class_[25], private_[15]);
         rcy_3 var31 = var1.protected_(class_[26], private_[16]);
         rcy_3 var32 = var1.protected_(class_[27], private_[17]);
         double var5 = var31.catch_(implements_[127]);
         double var7 = var31.catch_(implements_[128]);
         double var9 = var31.catch_(private_[18]);
         this.catch_(
            Math.abs(var5) > finally_[150] ? finally_[151] : var5,
            Math.abs(var7) > finally_[152] ? finally_[153] : var7,
            Math.abs(var9) > finally_[154] ? finally_[155] : var9
         );
         this.native_(var2.catch_(implements_[129]), var2.catch_(implements_[130]), var2.catch_(private_[19]));
         Float var18 = var32.private_(implements_[131]);
         this.throws_[break_[341]] = var18;
         Float var19 = var32.private_(implements_[132]);
         this.throws_[break_[342]] = var19;
         Float var20 = (Float)this.throws_[break_[343]];
         this.throws_[break_[344]] = var20;
         Float var21 = (Float)this.throws_[break_[345]];
         this.throws_[break_[346]] = var21;
         this.implements_((Float)this.throws_[break_[347]]);
         this.native_((Float)this.throws_[break_[348]]);
         Float var22 = var1.finally_(class_[28]);
         this.throws_[break_[349]] = var22;
         Integer var23 = Integer.valueOf(var1.catch_(class_[29]));
         this.throws_[break_[350]] = var23;
         this.throws_(var1.catch_(class_[30]));
         Boolean var24 = var1.new_(class_[31]);
         this.throws_[break_[351]] = var24;
         Boolean var25 = var1.new_(class_[32]);
         this.throws_[break_[352]] = var25;
         Integer var26 = var1.private_(class_[33]);
         this.throws_[break_[353]] = var26;
         if (var1.break_(class_[34])) {
            UUID var27 = var1.class_(class_[35]);
            this.throws_[break_[354]] = var27;
            String var28 = ((UUID)this.throws_[break_[355]]).toString();
            this.throws_[break_[356]] = var28;
         }

         if (!Double.isFinite(this.rx()) || !Double.isFinite(this.re()) || !Double.isFinite(this.BO())) {
            throw new IllegalStateException(class_[46]);
         } else if (Double.isFinite((double)((Float)this.throws_[break_[357]]).floatValue())
            && Double.isFinite((double)((Float)this.throws_[break_[358]]).floatValue())) {
            this.PX();
            this.case_((Float)this.throws_[break_[359]], (Float)this.throws_[break_[360]]);
            if (var1.byte_(class_[36], private_[20])) {
               String var11 = var1.native_(class_[37]);

               try {
                  this.break_(rgB_2.class_(var11));
               } catch (Exception var29) {
                  ((Logger)case_[break_[361]]).warn(class_[38], var11, var29);
               }
            }

            this.final_(var1.new_(class_[39]));
            this.extends_(var1.new_(class_[40]));
            this.finally_(var1.new_(class_[41]));
            this.implements_(var1.new_(class_[42]));
            if (var1.byte_(class_[43], private_[21])) {
               ((Set)this.throws_[break_[362]]).clear();
               rcy_3 var33 = var1.protected_(class_[44], private_[22]);
               int var12 = Math.min(var33.size(), break_[363]);

               for (int var13 = implements_[133]; var13 < var12; var13++) {
                  ((Set)this.throws_[break_[364]]).add(var33.implements_(var13));
               }
            }

            this.break_(var1);
            if (this.BZ()) {
               this.PX();
            }
         } else {
            throw new IllegalStateException(class_[45]);
         }
      } catch (Throwable var30) {
         KY var3 = KY.class_(var30, "Loading entity NBT");
         Ko_1 var4 = var3.class_("Entity being loaded");
         this.class_(var4);
         throw new KU(var3);
      }
   }

   public void throws_(rjU_2 var1) {
      this.throws_[13] = var1;
   }

   public double throws_(double var1) {
      return ((rjU_2)this.throws_[11]).protected_ + (double)this.PN() * var1;
   }

   public void throws_(int var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)case_[6], var1);
   }

   public boolean throws_(iM_2 var1) {
      return !((rYB)this.throws_[7]).a_(this, this.case_(var1).break_(1.0E-7)) ? true : implements_[156];
   }

   public boolean rt() {
      return true;
   }

   public xd_3 Pd() {
      return (xd_3)this.throws_[77];
   }

   public rjU_2 Ps() {
      return (rjU_2)this.throws_[11];
   }

   public boolean Pe() {
      return (Boolean)this.throws_[76];
   }

   public boolean Pc() {
      return this.h();
   }

   public boolean Po() {
      an_3 var1 = this.rU();
      if (var1 instanceof rhd_3) {
         return ((rhd_3)var1).char_();
      } else {
         return !((rYB)this.throws_[7]).continue_ ? true : implements_[248];
      }
   }

   public void Pi() {
      Boolean var5 = true;
      this.throws_[27] = var5;
   }

   public boolean Pf() {
      return !this.rT() && !this.int_() ? implements_[76] : implements_[75];
   }

   public boolean W() {
      return this.throws_[45] && this.rT() ? true : implements_[82];
   }

   @Override
   public boolean H() {
      return true;
   }

   public boolean R() {
      return this instanceof iB_2;
   }

   public void PD() {
      Boolean var5 = true;
      this.throws_[27] = var5;
   }

   public boolean BE() {
      boolean var1 = (Boolean)this.throws_[54];
      Boolean var6 = false;
      this.throws_[54] = var6;
      return var1;
   }

   public void finally_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Boolean>)case_[10], var1);
   }

   public boolean finally_(int var1) {
      return (((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)case_[5]) & 1 << var1) != 0 ? true : implements_[194];
   }

   public boolean finally_(double var1, double var3, double var5) {
      return this.break_(this.rN().protected_(var1, var3, var5));
   }

   public rjU_2 finally_(float var1) {
      double var2 = rfU_2.protected_((double)var1, (Double)this.throws_[8], this.rx());
      double var4 = rfU_2.protected_((double)var1, (Double)this.throws_[9], this.re());
      double var6 = rfU_2.protected_((double)var1, (Double)this.throws_[10], this.BO());
      return new rjU_2(var2, var4, var6);
   }

   public boolean finally_(an_3 var1) {
      return false;
   }

   public void catch_(boolean var1) {
      Boolean var6 = var1;
      this.throws_[62] = var6;
   }

   public void catch_(rjU_2 var1) {
      this.throws_[55] = var1;
   }

   public boolean catch_(int var1) {
      return this.synchronized_() >= var1 ? true : implements_[252];
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 101, -116, -110, -29, 108, 109, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void catch_(double var1, double var3, double var5) {
      this.byte_(new rjU_2(var1, var3, var5));
   }

   public double catch_(double var1) {
      return ((rjU_2)this.throws_[11]).break_ + (double)this.PN() * var1;
   }

   public rjU_2 catch_(float var1, float var2) {
      return this.byte_(var1 - 90.0F, var2);
   }

   public void catch_(an_3 var1) {
      this.class_(var1, an_3::new_);
   }

   public float extends_(float var1) {
      return 0.0F;
   }

   public void extends_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Boolean>)case_[9], var1);
   }

   public void extends_(double var1, double var3, double var5) {
      this.catch_(var1, var3, var5);
   }

   public String extends_() {
      return (String)this.throws_[74];
   }

   public void extends_(an_3 var1) {
      if (var1.ra() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (!((rYB)this.throws_[7]).continue_ && var1 instanceof rhd_3 && !(this.rU() instanceof rhd_3)) {
            ((List)this.throws_[3]).add(0, var1);
         } else {
            ((List)this.throws_[3]).add(var1);
         }
      }
   }

   private static void goto_() {
      Object[] var0 = new Object[]{
         LogManager.getLogger(),
         new AtomicInteger(),
         Collections.emptyList(),
         new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
         1.0,
         rmE_2.class_(an_3.class, ruw_3.class_),
         rmE_2.class_(an_3.class, ruw_3.break_),
         rmE_2.class_(an_3.class, ruw_3.case_),
         rmE_2.class_(an_3.class, ruw_3.implements_),
         rmE_2.class_(an_3.class, ruw_3.implements_),
         rmE_2.class_(an_3.class, ruw_3.implements_),
         rmE_2.class_(an_3.class, ruw_3.super_)
      };
      case_ = var0;
   }

   public void K() {
      if (this.BP()) {
         this.Bn();
      }

      if (this.Pm()) {
         this.BH();
      }
   }

   public void case_(int var1) {
      int var2 = var1 * 20;
      if (this instanceof iB_2) {
         var2 = aM_2.class_((iB_2)this, var2);
      }

      if ((Integer)this.throws_[42] < var2) {
         this.protected_(var2);
      }
   }

   public void case_(float var1, float var2) {
      Float var7 = var1 % 360.0F;
      this.throws_[15] = var7;
      Float var8 = var2 % 360.0F;
      this.throws_[16] = var8;
   }

   public static void case_(double var0) {
      Double var6 = var0;
      case_[4] = var6;
   }

   public rfl_3 case_(iM_2 var1) {
      ap_3 var2 = this.a_(var1);
      float var3 = var2.class_ / 2.0F;
      rjU_2 var4 = new rjU_2(this.rx() - (double)var3, this.re(), this.BO() - (double)var3);
      rjU_2 var5 = new rjU_2(this.rx() + (double)var3, this.re() + (double)var2.break_, this.BO() + (double)var3);
      return new rfl_3(var4, var5);
   }

   public boolean case_(an_3 var1) {
      return this.Bh().size() < 1 ? true : implements_[161];
   }

   public rcd_3 case_(rcd_3 var1) {
      try {
         if ((an_3)this.throws_[break_[327]] != null) {
            String var10001 = class_[5];
            double[] var10003 = new double[private_[8]];
            var10003[implements_[119]] = ((an_3)this.throws_[break_[328]]).rx();
            var10003[implements_[120]] = this.re();
            var10003[private_[9]] = ((an_3)this.throws_[break_[329]]).BO();
            var1.class_(var10001, this.class_(var10003));
         } else {
            String var14 = class_[6];
            double[] var17 = new double[private_[10]];
            var17[implements_[121]] = this.rx();
            var17[implements_[122]] = this.re();
            var17[private_[11]] = this.BO();
            var1.class_(var14, this.class_(var17));
         }

         rjU_2 var2 = this.rv();
         String var15 = class_[7];
         double[] var18 = new double[private_[12]];
         var18[implements_[123]] = var2.break_;
         var18[implements_[124]] = var2.byte_;
         var18[private_[13]] = var2.protected_;
         var1.class_(var15, this.class_(var18));
         var15 = class_[8];
         float[] var19 = new float[private_[14]];
         var19[implements_[125]] = (Float)this.throws_[break_[330]];
         var19[implements_[126]] = (Float)this.throws_[break_[331]];
         var1.class_(var15, this.class_(var19));
         var1.class_(class_[9], (Float)this.throws_[break_[332]]);
         var1.class_(class_[10], (short)((Integer)this.throws_[break_[333]]).intValue());
         var1.class_(class_[11], (short)this.PA());
         var1.class_(class_[12], (Boolean)this.throws_[break_[334]]);
         var1.class_(class_[13], (Boolean)this.throws_[break_[335]]);
         var1.break_(class_[14], (Integer)this.throws_[break_[336]]);
         var1.class_(class_[15], this.ro());
         rgP_2 var9 = this.rD();
         if (var9 != null) {
            var1.class_(class_[16], rgB_2.class_(var9));
         }

         if (this.D()) {
            var1.class_(class_[17], this.D());
         }

         if (this.BF()) {
            var1.class_(class_[18], this.BF());
         }

         if (this.rw()) {
            var1.class_(class_[19], this.rw());
         }

         if ((Boolean)this.throws_[break_[337]]) {
            var1.class_(class_[20], (Boolean)this.throws_[break_[338]]);
         }

         if (!((Set)this.throws_[break_[339]]).isEmpty()) {
            rcy_3 var10 = new rcy_3();

            for (String var6 : (Set)this.throws_[break_[340]]) {
               var10.add(rca_3.class_(var6));
            }

            var1.class_(class_[21], var10);
         }

         this.class_(var1);
         if (this.BP()) {
            rcy_3 var11 = new rcy_3();

            for (an_3 var13 : this.Bh()) {
               rcd_3 var7 = new rcd_3();
               if (var13.protected_(var7)) {
                  var11.add(var7);
               }
            }

            if (!var11.isEmpty()) {
               var1.class_(class_[22], var11);
            }
         }

         return var1;
      } catch (Throwable var8) {
         KY var3 = KY.class_(var8, "Saving entity NBT");
         Ko_1 var4 = var3.class_("Entity being saved");
         this.class_(var4);
         throw new KU(var3);
      }
   }

   public void case_(double var1, double var3, double var5) {
      rYB var8 = (rYB)this.throws_[7];
      if (var8 instanceof rrEm_1 var7) {
         this.class_(var1, var3, var5, (Float)this.throws_[15], (Float)this.throws_[16]);
         this.Bu().forEach(var1x -> {
            var7.byte_(var1x);
            Boolean var8x = true;
            var1x.throws_[67] = var8x;

            for (an_3 var3x : (List)var1x.throws_[3]) {
               var1x.class_(var3x, an_3::private_);
            }
         });
      }
   }

   public static double case_(rjU_2 var0) {
      return var0.break_ * var0.break_ + var0.protected_ * var0.protected_;
   }

   public float case_(float var1) {
      return var1 == 1.0F ? (Float)this.throws_[16] : rfU_2.catch_(var1, (Float)this.throws_[18], (Float)this.throws_[16]);
   }

   public void const_() {
      if ((an_3)this.throws_[5] != null) {
         an_3 var1 = (an_3)this.throws_[5];
         Object var6 = null;
         this.throws_[5] = var6;
         var1.package_(this);
      }
   }

   public rjU_2 continue_(float var1) {
      return this.catch_(this.case_(var1), this.throws_(var1));
   }

   private static void continue_() {
      extends_ = new long[1];
   }

   public boolean continue_(an_3 var1) {
      return this == var1 ? true : implements_[202];
   }

   public boolean else_(an_3 var1) {
      for (an_3 var3 : this.Bh()) {
         if (var3.equals(var1)) {
            return true;
         }

         if (var3.else_(var1)) {
            return true;
         }
      }

      return implements_[246];
   }

   public void implements_(double var1, double var3, double var5) {
      this.byte_(this.rv().break_(var1, var3, var5));
      Boolean var11 = true;
      this.throws_[57] = var11;
   }

   public void implements_(int var1) {
      Integer var6 = var1;
      this.throws_[1] = var6;
   }

   public boolean implements_(String var1) {
      return ((Set)this.throws_[66]).size() < 1024 && ((Set)this.throws_[66]).add(var1) ? true : implements_[9];
   }

   public void implements_(boolean var1) {
      Boolean var6 = var1;
      this.throws_[65] = var6;
      if (!((rYB)this.throws_[7]).continue_) {
         this.break_(6, (Boolean)this.throws_[65]);
      }
   }

   public float implements_(an_3 var1) {
      float var2 = (float)(this.rx() - var1.rx());
      float var3 = (float)(this.re() - var1.re());
      float var4 = (float)(this.BO() - var1.BO());
      return rfU_2.byte_(var2 * var2 + var3 * var3 + var4 * var4);
   }

   private static void implements_() {
      implements_ = new boolean[]{
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   public void implements_(float var1) {
   }

   public rjK_2 import_() {
      return new rjK_2((Float)this.throws_[16], (Float)this.throws_[15]);
   }

   private static void instanceof_() {
      private_ = new byte[]{
         2,
         3,
         2,
         6,
         4,
         20,
         15,
         20,
         3,
         2,
         3,
         2,
         3,
         2,
         2,
         6,
         6,
         5,
         2,
         2,
         8,
         9,
         8,
         60,
         4,
         53,
         3,
         3,
         4,
         4,
         6,
         5,
         5,
         -1,
         8,
         5,
         2,
         3,
         4,
         7,
         2,
         3,
         4,
         5,
         6,
         3,
         3,
         2,
         3,
         2,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         78,
         2,
         4,
         6,
         8,
         9,
         10,
         15,
         16,
         17,
         18,
         20,
         21,
         22,
         23,
         24,
         25,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         41,
         42,
         43,
         45,
         47,
         48,
         50,
         51,
         52,
         53,
         54,
         56,
         57,
         58,
         59,
         60,
         62,
         65,
         67,
         69,
         71,
         72,
         73,
         75,
         76,
         12,
         4
      };
   }

   public void new_(boolean var1) {
      rjU_2 var2 = this.rv();
      double var3;
      if (var1) {
         var3 = Math.max(-0.3, var2.byte_ - 0.03);
      } else {
         var3 = Math.min(finally_[168], var2.byte_ + 0.06);
      }

      this.catch_(var2.break_, var3, var2.protected_);
      Float var9 = 0.0F;
      this.throws_[31] = var9;
   }

   public rjU_2 new_(float var1) {
      if (var1 == 1.0F) {
         return new rjU_2(this.rx(), this.rH(), this.BO());
      } else {
         double var2 = rfU_2.protected_((double)var1, (Double)this.throws_[8], this.rx());
         double var4 = rfU_2.protected_((double)var1, (Double)this.throws_[9], this.re()) + (double)this.Bx();
         double var6 = rfU_2.protected_((double)var1, (Double)this.throws_[10], this.BO());
         return new rjU_2(var2, var4, var6);
      }
   }

   public boolean new_(an_3 var1) {
      return !this.h() && this.throws_[4] <= 0 ? true : implements_[152];
   }

   private boolean new_() {
      return ((rYB)this.throws_[7]).byte_(this.Bs()).class_(xu_3.hM);
   }

   public void new_(double var1, double var3, double var5) {
      this.volatile_(var1, var3, var5);
      this.class_(((ap_3)this.throws_[70]).class_(var1, var3, var5));
   }

   public void package_(double var1, double var3, double var5) {
      double var7 = rfU_2.class_(var1, -3.0E7, 3.0E7);
      double var9 = rfU_2.class_(var5, -3.0E7, 3.0E7);
      Double var15 = var7;
      this.throws_[8] = var15;
      Double var16 = var3;
      this.throws_[9] = var16;
      Double var17 = var9;
      this.throws_[10] = var17;
      this.new_(var7, var3, var9);
   }

   private static void package_() {
      catch_ = new int[]{16777215};
   }

   public void package_(boolean var1) {
      this.break_(5, var1);
   }

   public void package_(an_3 var1) {
      if (var1.ra() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         ((List)this.throws_[3]).remove(var1);
         Integer var6 = 60;
         var1.throws_[4] = var6;
      }
   }

   public float package_(float var1) {
      QY var2 = QY.instanceof_();
      return this == (cb_3)var2.class_[57] ? ((Hh_1)var2.class_[16]).finally_().class_(var1) : this.Bm();
   }

   public boolean return_(an_3 var1) {
      return this.PO() == var1.PO() ? true : implements_[243];
   }

   private void super_() {
      Boolean var14 = this.class_(rlG_2.break_);
      this.throws_[45] = var14;
      Object var15 = null;
      this.throws_[46] = var15;
      double var1 = this.rH() - 0.11111111F;
      if (this.ra() instanceof rSK var4 && !var4.W() && var4.rN().throws_ >= var1 && var4.rN().break_ <= var1) {
         return;
      }

      rfH_2 var17 = new rfH_2(this.rx(), var1, this.BO());
      rXE var5 = ((rYB)this.throws_[7]).break_(var17);

      for (rlb_3 var7 : rlG_2.class_()) {
         if (var5.class_(var7)) {
            double var8 = (double)((float)var17.c_() + var5.class_((rRq_1)((rYB)this.throws_[7]), var17));
            if (var8 > var1) {
               this.throws_[46] = var7;
            }

            return;
         }
      }
   }

   public boolean super_(an_3 var1) {
      return var1.PU() && !this.return_(var1) ? true : implements_[145];
   }

   private static void throw_() {
      class_ = new String[]{
         new String("Checking entity block collision"),
         new String("Entity being checked for collision"),
         new String("Colliding entity with block"),
         new String("Block being collided with"),
         new String("id"),
         new String("Pos"),
         new String("Pos"),
         new String("Motion"),
         new String("Rotation"),
         new String("FallDistance"),
         new String("Fire"),
         new String("Air"),
         new String("OnGround"),
         new String("Invulnerable"),
         new String("PortalCooldown"),
         new String("UUID"),
         new String("CustomName"),
         new String("CustomNameVisible"),
         new String("Silent"),
         new String("NoGravity"),
         new String("Glowing"),
         new String("Tags"),
         new String("Passengers"),
         new String("Saving entity NBT"),
         new String("Entity being saved"),
         new String("Pos"),
         new String("Motion"),
         new String("Rotation"),
         new String("FallDistance"),
         new String("Fire"),
         new String("Air"),
         new String("OnGround"),
         new String("Invulnerable"),
         new String("PortalCooldown"),
         new String("UUID"),
         new String("UUID"),
         new String("CustomName"),
         new String("CustomName"),
         new String("Failed to parse entity custom name {}"),
         new String("CustomNameVisible"),
         new String("Silent"),
         new String("NoGravity"),
         new String("Glowing"),
         new String("Tags"),
         new String("Tags"),
         new String("Entity has invalid rotation"),
         new String("Entity has invalid position"),
         new String("Loading entity NBT"),
         new String("Entity being loaded"),
         new String("Use x.startRiding(y), not y.addPassenger(x)"),
         new String("Use x.stopRiding(y), not y.removePassenger(x)"),
         new String("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]"),
         new String("~NULL~"),
         new String("Dimension"),
         new String("Entity Type"),
         new String("Entity ID"),
         new String("Entity Name"),
         new String("Entity's Exact location"),
         new String("%.2f, %.2f, %.2f"),
         new String("Entity's Block location"),
         new String("Entity's Momentum"),
         new String("%.2f, %.2f, %.2f"),
         new String("Entity's Passengers"),
         new String("Entity's Vehicle")
      };
   }

   private static void while_() {
      protected_ = new float[]{
         1.0F,
         1.0F,
         0.0F,
         360.0F,
         360.0F,
         1.0F,
         0.5F,
         4.0F,
         0.35F,
         0.4F,
         1.0F,
         1.0F,
         0.7F,
         1.6F,
         0.4F,
         0.0F,
         0.0F,
         0.15F,
         1.0F,
         0.4F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.2F,
         0.9F,
         1.0F,
         1.0F,
         1.0F,
         0.4F,
         1.0F,
         0.4F,
         1.0F,
         20.0F,
         1.0F,
         1.0F,
         20.0F,
         1.0F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         0.0F,
         360.0F,
         -90.0F,
         90.0F,
         360.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         90.0F,
         1.0F,
         1.0F,
         0.0F,
         0.8F,
         0.0F,
         5.0F,
         0.0F,
         0.2F,
         0.1F,
         0.0F,
         2.0F,
         0.85F,
         0.4F,
         180.0F,
         270.0F,
         90.0F,
         180.0F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public Iterable<rdn_3> rs() {
      return (List)case_[2];
   }

   public rjU_2 protected_(rjU_2 var1) {
      if (var1.catch_() <= 1.0E-7) {
         return var1;
      } else {
         long var2 = ((rYB)this.throws_[7]).r();
         if (var2 != (Long)this.throws_[69]) {
            Arrays.fill((double[])this.throws_[68], 0.0);
            Long var10 = var2;
            this.throws_[69] = var10;
         }

         if (var1.break_ != 0.0) {
            double var12 = this.class_(rpB_2.X, var1.break_);
            return Math.abs(var12) <= 1.0E-5F ? rjU_2.class_ : new rjU_2(var12, 0.0, 0.0);
         } else if (var1.byte_ != 0.0) {
            double var11 = this.class_(rpB_2.Y, var1.byte_);
            return Math.abs(var11) <= 1.0E-5F ? rjU_2.class_ : new rjU_2(0.0, var11, 0.0);
         } else if (var1.protected_ != 0.0) {
            double var4 = this.class_(rpB_2.Z, var1.protected_);
            return Math.abs(var4) <= 1.0E-5F ? rjU_2.class_ : new rjU_2(0.0, 0.0, var4);
         } else {
            return rjU_2.class_;
         }
      }
   }

   public boolean protected_(iM_2 var1) {
      return ((rYB)this.throws_[7]).a_(this, this.case_(var1).break_(1.0E-7));
   }

   public double protected_(an_3 var1) {
      double var2;
      double var4;
      double var6;
      if (var1 instanceof cM_2 var8) {
         double var9 = var1.rx();
         double var11 = var1.re();
         double var13 = var1.BO();
         double var15 = (Double)var8.break_[9];
         double var17 = (Double)var8.break_[10];
         double var19 = (Double)var8.break_[11];
         rjU_2 var21 = this.Ps();
         double var22 = var21.byte_(var9, var11, var13);
         double var24 = var21.byte_(var15, var17, var19);
         if (var24 < var22) {
            var2 = var15;
            var4 = var17;
            var6 = var19;
         } else {
            var2 = var9;
            var4 = var11;
            var6 = var13;
         }
      } else {
         var2 = var1.rx();
         var4 = var1.re();
         var6 = var1.BO();
      }

      double var26 = (double)(var1.PN() / 2.0F);
      double var10 = rfU_2.class_(this.re() + (double)this.byte_(this.Pb()) - var4, 0.0, (double)var1.Bm());
      double var12 = rfU_2.class_(this.rx() - var2, -var26, var26);
      double var14 = rfU_2.class_(this.BO() - var6, -var26, var26);
      return this.new_(1.0F).byte_(var2 + var12, var4 + var10, var6 + var14);
   }

   public boolean protected_(rcd_3 var1) {
      String var2 = this.rW();
      if (!(Boolean)this.throws_[27] && var2 != null) {
         var1.class_("id", var2);
         this.case_(var1);
         return true;
      } else {
         return implements_[116];
      }
   }

   public void protected_(int var1) {
      Integer var6 = var1;
      this.throws_[42] = var6;
   }

   public void protected_(rfH_2 var1) {
      if (this.rZ()) {
         this.rc();
      } else {
         if (!((rYB)this.throws_[7]).continue_ && !var1.equals((rfH_2)this.throws_[61])) {
            rfH_2 var6 = var1.int_();
            this.throws_[61] = var6;
         }

         Boolean var7 = true;
         this.throws_[59] = var7;
      }
   }

   public rjU_2 protected_(float var1, float var2) {
      return this.catch_(var2, var1);
   }

   public void protected_(double var1, double var3, double var5) {
      if (!((rYB)this.throws_[7]).continue_) {
         rfH_2 var7 = new rfH_2(var1, var3, var5);
         rjU_2 var8 = new rjU_2(var1 - (double)var7.b_(), var3 - (double)var7.c_(), var5 - (double)var7.d_());
         rfw_3 var9 = new rfw_3();
         rpr_3 var10 = rpr_3.UP;
         double var11 = Double.MAX_VALUE;

         for (rpr_3 var16 : new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.WEST, rpr_3.EAST, rpr_3.UP}) {
            var9.class_(var7, var16);
            if (!((rYB)this.throws_[7]).byte_(var9).new_((rYB)this.throws_[7], var9)) {
               double var17 = var8.class_(var16.final_());
               double var19 = var16.throws_() == rpG_2.POSITIVE ? 1.0 - var17 : var17;
               if (var19 < var11) {
                  var11 = var19;
                  var10 = var16;
               }
            }
         }

         float var21 = ((Random)this.throws_[40]).nextFloat() * 0.2F + 0.1F;
         float var22 = (float)var10.throws_().class_();
         rjU_2 var23 = this.rv().class_(0.75);
         if (var10.final_() == rpB_2.X) {
            this.catch_((double)(var22 * var21), var23.byte_, var23.protected_);
         } else if (var10.final_() == rpB_2.Y) {
            this.catch_(var23.break_, (double)(var22 * var21), var23.protected_);
         } else if (var10.final_() == rpB_2.Z) {
            this.catch_(var23.break_, var23.byte_, (double)(var22 * var21));
         }
      }
   }

   public double protected_(double var1) {
      return this.throws_((2.0 * ((Random)this.throws_[40]).nextDouble() - 1.0) * var1);
   }

   public void private_(boolean var1) {
      rjU_2 var2 = this.rv();
      double var3;
      if (var1) {
         var3 = Math.max(-0.9, var2.byte_ - 0.03);
      } else {
         var3 = Math.min(finally_[164], var2.byte_ + 0.1);
      }

      this.catch_(var2.break_, var3, var2.protected_);
   }

   public float private_(float var1, float var2) {
      return var2 == 1.0F ? var1 : rfU_2.catch_(var2, (Float)this.throws_[18], var1);
   }

   public boolean private_(String var1) {
      return ((Set)this.throws_[66]).remove(var1);
   }

   public void private_(float var1) {
      this.class_(this.BB(), var1, 1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.4F);
   }

   public void private_(int var1) {
      Integer var6 = var1;
      this.throws_[73] = var6;
   }

   public void private_(double var1, double var3, double var5) {
      this.class_(var1, var3, var5, (Float)this.throws_[15], (Float)this.throws_[16]);
   }

   public float private_(an_3 var1) {
      float var2 = (float)(this.rx() - var1.rx());
      float var3 = (float)(this.BO() - var1.BO());
      return rfU_2.byte_(var2 * var2 + var3 * var3);
   }

   private void abstract_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[78];
         Object[] var1 = this.throws_;
         var1[1] = 0;
         var1[2] = false;
         var1[4] = 0;
         var1[6] = false;
         var1[8] = 0.0;
         var1[9] = 0.0;
         var1[10] = 0.0;
         var1[15] = 0.0F;
         var1[16] = 0.0F;
         var1[17] = 0.0F;
         var1[18] = 0.0F;
         var1[20] = false;
         var1[21] = false;
         var1[22] = false;
         var1[23] = false;
         var1[24] = false;
         var1[25] = false;
         var1[27] = false;
         var1[28] = 0.0F;
         var1[29] = 0.0F;
         var1[30] = 0.0F;
         var1[31] = 0.0F;
         var1[32] = 0.0F;
         var1[33] = 0.0F;
         var1[34] = 0.0;
         var1[35] = 0.0;
         var1[36] = 0.0;
         var1[37] = 0.0F;
         var1[38] = false;
         var1[39] = 0.0F;
         var1[41] = 0;
         var1[42] = 0;
         var1[43] = false;
         var1[45] = false;
         var1[47] = 0;
         var1[48] = false;
         var1[50] = false;
         var1[51] = 0;
         var1[52] = 0;
         var1[53] = 0;
         var1[54] = false;
         var1[56] = false;
         var1[57] = false;
         var1[58] = 0;
         var1[59] = false;
         var1[60] = 0;
         var1[62] = false;
         var1[65] = false;
         var1[67] = false;
         var1[69] = 0L;
         var1[71] = 0.0F;
         var1[72] = 0.0F;
         var1[73] = 0;
         var1[75] = false;
         var1[76] = false;
      }
   }

   private static void final_() {
      finally_ = new double[]{
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         256.0,
         1.0,
         -64.0,
         1.0E-7,
         1.0E-7,
         0.0,
         0.0,
         0.0,
         0.0,
         0.6,
         0.6,
         0.2F,
         0.2F,
         1.0,
         0.001,
         1.0E-7,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.2F,
         1.0,
         1.0,
         0.5000001,
         1.0E-7,
         0.0,
         0.0,
         1.0E-5F,
         0.0,
         0.0,
         0.0,
         1.0E-5F,
         0.0,
         0.0,
         0.0,
         1.0E-5F,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         1.0E-7,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         2.0,
         2.0,
         0.001,
         0.001,
         0.001,
         0.001,
         0.001,
         0.001,
         0.0,
         0.007,
         0.0023333333333333335,
         0.014,
         0.11111111F,
         0.2F,
         0.2F,
         0.25,
         2.0,
         1.0,
         2.0,
         1.0,
         0.2F,
         2.0,
         1.0,
         2.0,
         1.0,
         0.2F,
         0.5,
         0.1,
         0.5,
         -4.0,
         1.5,
         -4.0,
         0.0,
         1.0E-7,
         1.0,
         0.0,
         -3.0E7,
         3.0E7,
         -3.0E7,
         3.0E7,
         0.5,
         0.5,
         0.0,
         0.5,
         0.5,
         0.5,
         0.0,
         1.0,
         -0.5,
         0.5,
         -0.5,
         0.5,
         0.01F,
         1.0,
         1.0,
         1.0,
         0.05F,
         0.05F,
         0.0,
         0.0,
         1.0,
         64.0,
         10.0,
         0.0,
         10.0,
         0.0,
         10.0,
         0.0,
         0.1F,
         0.0,
         0.75,
         1.0E-7,
         1.0E-7,
         1.0E-7,
         -0.9,
         0.03,
         1.8,
         0.1,
         -0.3,
         0.03,
         0.7,
         0.06,
         Double.MAX_VALUE,
         1.0,
         0.75,
         -2.9999872E7,
         16.0,
         -2.9999872E7,
         16.0,
         2.9999872E7,
         16.0,
         2.9999872E7,
         16.0,
         0.5,
         0.5,
         2.0,
         0.0,
         0.0,
         1.0E-5F,
         2.0,
         0.0,
         0.001,
         0.0,
         0.4,
         0.0,
         1.0,
         0.003,
         0.003,
         0.0045000000000000005,
         0.0045000000000000005,
         0.4,
         0.0,
         0.4,
         2.0,
         1.0,
         2.0,
         1.0,
         0.0,
         0.7,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         1.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0
      };
   }

   public boolean final_(double var1, double var3, double var5) {
      double var7 = this.rx() - var1;
      double var9 = this.re() - var3;
      double var11 = this.BO() - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.class_(var13);
   }

   public void final_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Boolean>)case_[8], var1);
   }

   public float final_(float var1) {
      return 0.0F;
   }

   public boolean final_(an_3 var1) {
      return this.class_(var1.BG());
   }

   public void volatile_(boolean var1) {
      this.break_(1, var1);
   }

   public void volatile_(an_3 var1) {
   }

   public rjU_2 volatile_(float var1) {
      return this.new_(var1);
   }

   public void volatile_(double var1, double var3, double var5) {
      if (((rjU_2)this.throws_[11]).break_ != var1 || ((rjU_2)this.throws_[11]).byte_ != var3 || ((rjU_2)this.throws_[11]).protected_ != var5) {
         rjU_2 var14 = new rjU_2(var1, var3, var5);
         this.throws_[11] = var14;
         int var7 = rfU_2.byte_(var1);
         int var8 = rfU_2.byte_(var3);
         int var9 = rfU_2.byte_(var5);
         if (var7 != ((rfH_2)this.throws_[12]).b_() || var8 != ((rfH_2)this.throws_[12]).c_() || var9 != ((rfH_2)this.throws_[12]).d_()) {
            rfH_2 var15 = new rfH_2(var7, var8, var9);
            this.throws_[12] = var15;
         }

         Boolean var16 = true;
         this.throws_[54] = var16;
      }
   }

   public boolean synchronized_(an_3 var1) {
      for (an_3 var3 : this.Bh()) {
         if (var3.equals(var1)) {
            return true;
         }
      }

      return implements_[234];
   }

   public int synchronized_() {
      return 0;
   }

   public void native_(boolean var1) {
      this.break_(4, var1);
   }

   public void native_(an_3 var1) {
      this.class_(var1.rx(), var1.re(), var1.BO(), (Float)var1.throws_[15], (Float)var1.throws_[16]);
   }

   public void native_(double var1, double var3, double var5) {
      this.volatile_(var1, var3, var5);
      Double var11 = var1;
      this.throws_[8] = var11;
      Double var12 = var3;
      this.throws_[9] = var12;
      Double var13 = var5;
      this.throws_[10] = var13;
      Double var14 = var1;
      this.throws_[34] = var14;
      Double var15 = var3;
      this.throws_[35] = var15;
      Double var16 = var5;
      this.throws_[36] = var16;
   }

   public void native_(float var1) {
   }

   public boolean native_() {
      return false;
   }

   public rfH_2 PI() {
      return new rfH_2(((rjU_2)this.throws_[11]).break_, this.rN().break_ - 0.5000001, ((rjU_2)this.throws_[11]).protected_);
   }

   public int rp() {
      return 3;
   }

   public float rl() {
      float var1 = ((rYB)this.throws_[7]).byte_(this.Bs()).break_().int_();
      float var2 = ((rYB)this.throws_[7]).byte_(this.PI()).break_().int_();
      return (double)var1 == 1.0 ? var2 : var1;
   }

   public void A() {
      this.byte_(rjU_2.class_);
      this.this_();
      if (this.Pm()) {
         this.ra().catch_(this);
      }
   }

   public boolean rw() {
      return ((rmE_2)this.throws_[49]).<Boolean>class_((rut_3<Boolean>)case_[10]);
   }

   public boolean rg() {
      return (Boolean)this.throws_[62];
   }

   public int ru() {
      return (Integer)this.throws_[42];
   }

   public boolean T() {
      return this.Pz() && !this.native_() ? true : implements_[224];
   }

   public UUID ro() {
      return (UUID)this.throws_[63];
   }

   public double re() {
      return ((rjU_2)this.throws_[11]).byte_;
   }

   public aI_2<?> BC() {
      return (aI_2<?>)this.throws_[0];
   }

   @Override
   public rjU_2 rr() {
      return (rjU_2)this.throws_[11];
   }

   public rjU_2 rm() {
      return (rjU_2)this.throws_[55];
   }

   public float rq() {
      xd_3 var1 = ((rYB)this.throws_[7]).byte_(this.Bs()).break_();
      float var2 = var1.package_();
      if (var1 != xu_3.try_ && var1 != xu_3.hM) {
         return (double)var2 == 1.0 ? ((rYB)this.throws_[7]).byte_(this.PI()).break_().package_() : var2;
      } else {
         return var2;
      }
   }

   public void rc() {
      Integer var5 = this.rj();
      this.throws_[58] = var5;
   }

   public int ri() {
      return 300;
   }

   public boolean PM() {
      ((Object2DoubleMap)this.throws_[44]).clear();
      this.rd();
      double var1 = ((rYB)this.throws_[7]).default_().protected_() ? 0.007 : finally_[98];
      boolean var3 = this.class_(rlG_2.byte_, var1);
      return !this.rT() && !var3 ? implements_[88] : implements_[87];
   }

   public an_3 ra() {
      return (an_3)this.throws_[5];
   }

   public boolean PZ() {
      return !this.rT() && !this.ry() ? implements_[72] : implements_[71];
   }

   public boolean Pm() {
      return this.ra() != null ? true : implements_[172];
   }

   public boolean ry() {
      return !this.throws_[48] && ((Object2DoubleMap)this.throws_[44]).getDouble(rlG_2.byte_) > 0.0 ? true : implements_[104];
   }

   public gy_3 PL() {
      return new gy_3(
         this,
         this.Ps(),
         this.import_(),
         (rYB)this.throws_[7] instanceof rrEm_1 ? (rrEm_1)((rYB)this.throws_[7]) : null,
         this.synchronized_(),
         this.g().getString(),
         this.L_(),
         ((rYB)this.throws_[7]).const_(),
         this
      );
   }

   public boolean PJ() {
      return false;
   }

   public PX rO() {
      return new PX((Float)this.throws_[15], (Float)this.throws_[16]);
   }

   public float rQ() {
      return (float)((int)((Float)this.throws_[30]).floatValue() + 1);
   }

   public iM_2 Pb() {
      return ((rmE_2)this.throws_[49]).class_((rut_3<iM_2>)case_[11]);
   }

   public boolean Pk() {
      return !this.rT() && !this.int_() && !this.new_() ? implements_[78] : implements_[77];
   }

   public void Pn() {
      if (this.Pm() && (Boolean)this.ra().throws_[27]) {
         this.BH();
      }

      if ((Integer)this.throws_[4] > 0) {
         Integer var5 = (Integer)this.throws_[4] - 1;
         this.throws_[4] = var5;
      }

      rjU_2 var6 = (rjU_2)this.throws_[14];
      this.throws_[13] = var6;
      Float var7 = (Float)this.throws_[29];
      this.throws_[28] = var7;
      Float var8 = (Float)this.throws_[16];
      this.throws_[18] = var8;
      Float var9 = (Float)this.throws_[15];
      this.throws_[17] = var9;
      this.PB();
      if (this.B()) {
         this.Bb();
      }

      this.PM();
      this.super_();
      this.p();
      if (((rYB)this.throws_[7]).continue_) {
         this.rE();
      } else if ((Integer)this.throws_[42] > 0) {
         if (this.q()) {
            this.protected_((Integer)this.throws_[42] - 4);
            if ((Integer)this.throws_[42] < 0) {
               this.rE();
            }
         } else {
            if ((Integer)this.throws_[42] % 20 == 0 && !this.ry()) {
               this.break_(rye_3.byte_, 1.0F);
            }

            this.protected_((Integer)this.throws_[42] - 1);
         }
      }

      if (this.ry()) {
         this.rb();
         Float var10 = (Float)this.throws_[31] * 0.5F;
         this.throws_[31] = var10;
      }

      if (this.re() < -64.0) {
         this.PQ();
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.break_(0, this.throws_[42] > 0 ? true : implements_[20]);
      }

      Boolean var11 = false;
      this.throws_[48] = var11;
   }

   public void PC() {
      rfl_3 var1 = this.rN();
      this.volatile_((var1.class_ + var1.protected_) / 2.0, var1.break_, (var1.byte_ + var1.case_) / 2.0);
   }

   public xc_3 Pl() {
      return ((rYB)this.throws_[7]).byte_(this.BS());
   }

   public int PA() {
      return ((rmE_2)this.throws_[49]).<Integer>class_((rut_3<Integer>)case_[6]);
   }

   public boolean Pz() {
      boolean var1 = (rYB)this.throws_[7] != null && ((rYB)this.throws_[7]).continue_ ? true : implements_[167];
      return this.q() || this.throws_[42] <= 0 && (!var1 || !this.finally_(0)) ? implements_[170] : implements_[169];
   }

   public boolean PH() {
      return true;
   }

   public boolean rJ() {
      return this.D();
   }

   public void rA() {
   }

   public boolean Py() {
      return this.finally_(4);
   }

   public boolean Pp() {
      return this.finally_(5);
   }

   public boolean Pq() {
      HashSet var1 = Sets.newHashSet();
      this.class_(true, var1);
      return var1.size() == 1 ? true : implements_[241];
   }

   public rgy_3 rM() {
      return new rgy_3(rgp_3.byte_, new rgq_3(this.BC(), this.ro(), this.g()));
   }

   public rnW_2 rC() {
      return ((rYB)this.throws_[7]).const_();
   }

   public boolean rB() {
      return false;
   }

   public boolean rG() {
      return false;
   }

   public void rL() {
      Boolean var5 = true;
      this.throws_[76] = var5;
   }

   public Collection<an_3> PP() {
      HashSet var1 = Sets.newHashSet();

      for (an_3 var3 : this.Bh()) {
         var1.add(var3);
         var3.class_(false, var1);
      }

      return var1;
   }

   public void PB() {
      rYB var2 = (rYB)this.throws_[7];
      if (var2 instanceof rrEm_1 var1) {
         int var15 = this.rR();
         if ((Boolean)this.throws_[59]) {
            rnW_2 var3 = var1.const_();
            rqM_2 var4 = ((rYB)this.throws_[7]).E() == rYB.protected_ ? rYB.byte_ : rYB.protected_;
            rrEm_1 var5 = var3.class_(var4);
            if (var5 != null && var3.interface_() && !this.Pm()) {
               int var10002 = (Integer)this.throws_[60];
               Integer var10 = var10002 + 1;
               this.throws_[60] = var10;
               if (var10002 >= var15) {
                  Integer var11 = var15;
                  this.throws_[60] = var11;
                  this.rc();
                  this.class_(var5);
               }
            }

            Boolean var12 = false;
            this.throws_[59] = var12;
         } else {
            if ((Integer)this.throws_[60] > 0) {
               Integer var13 = (Integer)this.throws_[60] - 4;
               this.throws_[60] = var13;
            }

            if ((Integer)this.throws_[60] < 0) {
               Integer var14 = 0;
               this.throws_[60] = var14;
            }
         }

         this.a();
      }
   }

   public double Ph() {
      return this.byte_(((Random)this.throws_[40]).nextDouble());
   }

   public double Pv() {
      return 0.0;
   }

   public boolean rk() {
      return this.h();
   }

   public boolean PF() {
      return this.finally_(3);
   }

   public an_3 rU() {
      return null;
   }

   public rjU_2 Pt() {
      return new rjU_2((Double)this.throws_[8], (Double)this.throws_[9], (Double)this.throws_[10]);
   }

   public float rX() {
      rfw_3 var1 = new rfw_3(this.rx(), 0.0, this.BO());
      if (((rYB)this.throws_[7]).int_(var1)) {
         var1.b_(rfU_2.byte_(this.rH()));
         return ((rYB)this.throws_[7]).native_(var1);
      } else {
         return protected_[40];
      }
   }

   public double rH() {
      return ((rjU_2)this.throws_[11]).byte_ + (double)((Float)this.throws_[71]).floatValue();
   }

   public boolean rZ() {
      return this.throws_[58] > 0 ? true : implements_[23];
   }

   public int rj() {
      return 300;
   }

   @Override
   public rgP_2 rD() {
      return ((rmE_2)this.throws_[49]).<Optional<rgP_2>>class_((rut_3<Optional<rgP_2>>)case_[7]).orElse(null);
   }

   public double PS() {
      return (double)((ap_3)this.throws_[70]).break_ * 0.75;
   }

   public rfl_3 PE() {
      return this.rN();
   }

   public int rV() {
      return 1;
   }

   public void rE() {
      this.protected_(0);
   }

   public boolean rP() {
      return this.Pb() == iM_2.SWIMMING ? true : implements_[181];
   }

   public String rz() {
      return (String)this.throws_[64];
   }

   public String rW() {
      aI_2 var1 = this.BC();
      rqO_2 var2 = aI_2.class_(var1);
      return var1.class_() && var2 != null ? var2.toString() : null;
   }

   public double rI() {
      return (double)this.Bx() < 0.4 ? 0.0 : finally_[200];
   }

   public int rR() {
      return 0;
   }

   public String PG() {
      return "X: " + (int)this.rx() + " Y: " + (int)this.re() + " Z: " + (int)this.BO();
   }

   public an_3 PO() {
      an_3 var1 = this;

      while (var1.Pm()) {
         var1 = var1.ra();
      }

      return var1;
   }

   public rqL_2 Pr() {
      return rqL_2.NEUTRAL;
   }

   public void PX() {
      this.new_(((rjU_2)this.throws_[11]).break_, ((rjU_2)this.throws_[11]).byte_, ((rjU_2)this.throws_[11]).protected_);
   }

   public rfl_3 rN() {
      return (rfl_3)this.throws_[19];
   }

   public void rF() {
   }

   public void Px() {
      rfl_3 var1 = this.rN();
      rfH_2 var2 = new rfH_2(var1.class_ + 0.001, var1.break_ + 0.001, var1.byte_ + 0.001);
      rfH_2 var3 = new rfH_2(var1.protected_ - 0.001, var1.throws_ - 0.001, var1.case_ - 0.001);
      rfw_3 var4 = new rfw_3();
      if (((rYB)this.throws_[7]).class_(var2, var3)) {
         for (int var5 = var2.b_(); var5 <= var3.b_(); var5++) {
            for (int var6 = var2.c_(); var6 <= var3.c_(); var6++) {
               for (int var7 = var2.d_(); var7 <= var3.d_(); var7++) {
                  var4.class_(var5, var6, var7);
                  xc_3 var8 = ((rYB)this.throws_[7]).byte_(var4);

                  try {
                     var8.class_((rYB)this.throws_[break_[197]], var4, this);
                     this.class_(var8);
                  } catch (Throwable var12) {
                     KY var10 = KY.class_(var12, "Colliding entity with block");
                     Ko_1 var11 = var10.class_("Block being collided with");
                     Ko_1.class_(var11, var4, var8);
                     throw new KU(var10);
                  }
               }
            }
         }
      }
   }

   public boolean rY() {
      return false;
   }

   public boolean PW() {
      return this.rP() && !this.rT() ? true : implements_[183];
   }

   public double rx() {
      return ((rjU_2)this.throws_[11]).break_;
   }

   public void PQ() {
      this.PD();
   }

   public boolean Pu() {
      return !this.throws_[27] ? true : implements_[141];
   }

   public boolean rT() {
      return (Boolean)this.throws_[43];
   }

   public float PN() {
      return ((ap_3)this.throws_[70]).class_;
   }

   public rpr_3 rS() {
      return this.Pg();
   }

   public int rK() {
      rnM_2 var1 = this.BG();
      return var1 != null && var1.volatile_().protected_() != null ? var1.volatile_().protected_() : catch_[0];
   }

   public int BN() {
      return (Integer)this.throws_[73];
   }

   public Iterable<rdn_3> PV() {
      return (List)case_[2];
   }

   public boolean PU() {
      return false;
   }

   public boolean PK() {
      return true;
   }

   public boolean PR() {
      return this.h();
   }

   public boolean BP() {
      return !this.Bh().isEmpty() ? true : implements_[174];
   }

   public void Bn() {
      for (int var1 = ((List)this.throws_[3]).size() - 1; var1 >= 0; var1--) {
         ((an_3)((List)this.throws_[3]).get(var1)).BH();
      }
   }

   public rqA_2 BB() {
      return rqn_3.SU;
   }

   public rmE_2 BQ() {
      return (rmE_2)this.throws_[49];
   }

   public boolean BZ() {
      return true;
   }

   public boolean BF() {
      return ((rmE_2)this.throws_[49]).<Boolean>class_((rut_3<Boolean>)case_[9]);
   }

   public double BO() {
      return ((rjU_2)this.throws_[11]).protected_;
   }

   public boolean Pa() {
      return !this.rT() && !this.new_() ? implements_[80] : implements_[79];
   }

   public boolean BM() {
      return !this.throws_[27] ? true : implements_[139];
   }

   public List<an_3> Bh() {
      return (List<an_3>)(((List)this.throws_[3]).isEmpty() ? Collections.emptyList() : Lists.newArrayList((List)this.throws_[3]));
   }

   public rqA_2 BJ() {
      return rqn_3.SD;
   }

   @Override
   public boolean Bk() {
      return ((rmE_2)this.throws_[49]).<Optional>class_((rut_3<Optional>)case_[7]).isPresent();
   }

   public rfH_2 Bs() {
      return (rfH_2)this.throws_[12];
   }

   public void Bb() {
      int var1 = rfU_2.byte_(this.rx());
      int var2 = rfU_2.byte_(this.re() - 0.2F);
      int var3 = rfU_2.byte_(this.BO());
      rfH_2 var4 = new rfH_2(var1, var2, var3);
      xc_3 var5 = ((rYB)this.throws_[7]).byte_(var4);
      if (var5.private_() != xN_2.INVISIBLE) {
         rjU_2 var6 = this.rv();
         ((rYB)this.throws_[7])
            .class_(
               new rLX(rLQ.protected_, var5),
               this.rx() + (((Random)this.throws_[40]).nextDouble() - 0.5) * (double)((ap_3)this.throws_[70]).class_,
               this.re() + 0.1,
               this.BO() + (((Random)this.throws_[40]).nextDouble() - 0.5) * (double)((ap_3)this.throws_[70]).class_,
               var6.break_ * -4.0,
               1.5,
               var6.protected_ * -4.0
            );
      }
   }

   public rpr_3 Pg() {
      return rpr_3.class_((double)((Float)this.throws_[15]).floatValue());
   }

   public float Bm() {
      return ((ap_3)this.throws_[70]).break_;
   }

   public boolean Bl() {
      return false;
   }

   public void BH() {
      this.const_();
   }

   public static double Br() {
      return (Double)case_[4];
   }

   public rjU_2 BA() {
      return new rjU_2(0.0, (double)this.Bx(), (double)(this.PN() * 0.4F));
   }

   public Stream<an_3> Bu() {
      return Stream.concat(Stream.of(this), ((List)this.throws_[3]).stream().flatMap(an_3::Bu));
   }

   public rjU_2 BX() {
      return (rjU_2)this.throws_[13];
   }

   public rfH_2 BS() {
      int var1 = rfU_2.byte_(((rjU_2)this.throws_[11]).break_);
      int var2 = rfU_2.byte_(((rjU_2)this.throws_[11]).byte_ - 0.2F);
      int var3 = rfU_2.byte_(((rjU_2)this.throws_[11]).protected_);
      rfH_2 var4 = new rfH_2(var1, var2, var3);
      if (((rYB)this.throws_[7]).byte_(var4).catch_()) {
         rfH_2 var5 = var4.break_();
         xc_3 var6 = ((rYB)this.throws_[7]).byte_(var5);
         xd_3 var7 = var6.break_();
         if (var7.class_(rls_3.default_) || var7.class_(rls_3.abstract_) || var7 instanceof dq_3) {
            return var5;
         }
      }

      return var4;
   }

   public boolean Pj() {
      return (rlb_3)this.throws_[46] != rlG_2.break_ && (rlb_3)this.throws_[46] != rlG_2.byte_ ? implements_[102] : implements_[101];
   }

   public rnM_2 BG() {
      return ((rYB)this.throws_[7]).package_().private_(this.i());
   }

   public boolean BL() {
      return (Boolean)this.throws_[20];
   }

   public boolean Bz() {
      if (((rYB)this.throws_[7]).continue_) {
         return false;
      } else if ((Boolean)this.throws_[38]) {
         return false;
      } else {
         float var1 = ((ap_3)this.throws_[70]).class_ * 0.8F;
         rfl_3 var2 = rfl_3.catch_((double)var1, 0.1F, (double)var1).protected_(this.rx(), this.rH(), this.BO());
         return ((rYB)this.throws_[7]).break_(this, var2, (var1x, var2x) -> var1x.final_((rYB)this.throws_[7], var2x)).findAny().isPresent();
      }
   }

   public void Bc() {
      if ((rYB)this.throws_[7] != null) {
         for (double var1 = this.re(); var1 > 0.0 && var1 < 256.0; var1++) {
            this.new_(this.rx(), var1, this.BO());
            if (((rYB)this.throws_[7]).throws_(this)) {
               break;
            }
         }

         this.byte_(rjU_2.class_);
         Float var7 = 0.0F;
         this.throws_[16] = var7;
      }
   }

   public boolean BW() {
      return !((rYB)this.throws_[7]).a_(this, this.rN().break_(1.0E-7)) ? true : implements_[154];
   }

   public Iterable<rdn_3> PY() {
      return Iterables.concat(this.rs(), this.PV());
   }

   public float Bd() {
      return ((ap_3)this.throws_[70]).protected_;
   }

   public float Bx() {
      return (Float)this.throws_[71];
   }

   public rqA_2 Bv() {
      return rqn_3.SD;
   }

   public boolean Pw() {
      return this.h();
   }

   public ap_3 a_(iM_2 var1) {
      return ((aI_2)this.throws_[0]).volatile_();
   }

   public void a_(rjU_2 var1) {
      this.private_(var1.break_, var1.byte_, var1.protected_);
   }

   public boolean a_(rhd_3 var1) {
      if (var1.native_()) {
         return false;
      } else {
         rnM_2 var2 = this.BG();
         return (var2 == null || var1 == null || var1.BG() != var2 || !var2.private_()) && this.Pp() ? true : implements_[187];
      }
   }

   public void a_(UUID var1) {
      this.throws_[63] = var1;
      String var7 = ((UUID)this.throws_[63]).toString();
      this.throws_[64] = var7;
   }

   public rsE_2 a_(rdn_3 var1) {
      return this.class_(var1, 0.0F);
   }

   public rjU_2 a_(iB_2 var1) {
      return new rjU_2(this.rx(), this.rN().throws_, this.BO());
   }

   @Override
   public rgP_2 L_() {
      return rnB_2.class_(this.BG(), this.g(), rnO_2.values()).class_(var1 -> var1.class_(this.rM()).class_(this.rz()));
   }

   public abstract void m_();

   public void q_() {
      ap_3 var1 = (ap_3)this.throws_[70];
      iM_2 var2 = this.Pb();
      ap_3 var3 = this.a_(var2);
      this.throws_[70] = var3;
      Float var11 = this.class_(var2, var3);
      this.throws_[71] = var11;
      if (var3.class_ < var1.class_) {
         double var4 = (double)var3.class_ / 2.0;
         this.class_(new rfl_3(this.rx() - var4, this.re(), this.BO() - var4, this.rx() + var4, this.re() + (double)var3.break_, this.BO() + var4));
      } else {
         rfl_3 var12 = this.rN();
         this.class_(
            new rfl_3(
               var12.class_,
               var12.break_,
               var12.byte_,
               var12.class_ + (double)var3.class_,
               var12.break_ + (double)var3.break_,
               var12.byte_ + (double)var3.class_
            )
         );
         if (var3.class_ > var1.class_ && !(Boolean)this.throws_[48] && !((rYB)this.throws_[7]).continue_) {
            float var5 = var1.class_ - var3.class_;
            this.class_(iG_2.SELF, new rjU_2((double)var5, 0.0, (double)var5));
         }
      }
   }

   public abstract ruS_2<?> p_();

   public Qs_1 r_() {
      return Qs_1.NORMAL;
   }

   public boolean Y() {
      return (Boolean)this.throws_[75];
   }

   public void c_(rhd_3 var1) {
   }

   public void c_(boolean var1) {
      this.break_(3, var1);
   }

   public rgP_2 PT() {
      return ((aI_2)this.throws_[0]).implements_();
   }
}
