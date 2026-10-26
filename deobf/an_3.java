package celestial;

import celestial.module.combat.Popka;
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
   private static String[] id_class;
   private static short[] id_break;
   public Object[] id_throws;
   private static float[] id_protected;
   private static int[] id_catch;
   private static byte[] id_private;
   private static boolean[] id_implements;
   private static double[] id_finally;
   public static Object[] id_case;
   private static long[] id_extends;

   public float id_byte(iM_2 var1) {
      return this.id_class(var1, this.a_(var1));
   }

   public boolean id_byte(rhN_2 var1) {
      return true;
   }

   public rjU_2 id_byte(float var1, float var2) {
      float var3 = var1 * ((float)Math.PI / 180F);
      float var4 = -var2 * ((float)Math.PI / 180F);
      float var5 = rfU_2.id_break(var4);
      float var6 = rfU_2.id_class(var4);
      float var7 = rfU_2.id_break(var3);
      float var8 = rfU_2.id_class(var3);
      return new rjU_2((double)(var6 * var7), (double)(-var8), (double)(var5 * var7));
   }

   public boolean id_byte(rcd_3 var1) {
      return !this.Pm() && this.id_protected(var1) ? true : false;
   }

   public void id_byte(rjU_2 var1) {
      this.id_throws[14] = var1;
   }

   public double id_byte(rfH_2 var1) {
      return var1.id_class(this.rx(), this.re(), this.BO(), false);
   }

   public double id_byte(double var1) {
      return ((rjU_2)this.id_throws[11]).id_byte + (double)this.Bm() * var1;
   }

   public void id_byte(an_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         if (!this.id_return(var1) && !(Boolean)var1.id_throws[38] && !(Boolean)this.id_throws[38]) {
            double var2 = var1.rx() - this.rx();
            double var4 = var1.BO() - this.BO();
            double var6 = rfU_2.id_class(var2, var4);
            if (var6 >= (double)0.01F) {
               var6 = (double)rfU_2.id_class(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = (double)1.0F / var6;
               if (var8 > (double)1.0F) {
                  var8 = (double)1.0F;
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= (double)0.05F;
               var4 *= (double)0.05F;
               var2 *= (double)(1.0F - (Float)this.id_throws[39]);
               var4 *= (double)(1.0F - (Float)this.id_throws[39]);
               if (!this.BP()) {
                  this.id_implements(-var2, (double)0.0F, -var4);
               }

               if (!var1.BP()) {
                  var1.id_implements(var2, (double)0.0F, var4);
               }
            }
         }

      }
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1572744141;
   }

   public void id_byte(double var1, double var3, double var5) {
      this.id_catch(new rjU_2(var1, var3, var5));
   }

   public void id_int(double var1, double var3, double var5) {
      this.id_native(var1, var3, var5);
      this.PX();
   }

   public void id_int(boolean var1) {
      Boolean var6 = var1;
      this.id_throws[20] = var6;
   }

   private boolean id_int() {
      rfH_2 var1 = this.Bs();
      return !((rYB)this.id_throws[7]).id_while(var1) && !((rYB)this.id_throws[7]).id_while(new rfH_2((double)var1.b_(), this.rN().id_throws, (double)var1.d_())) ? false : true;
   }

   public rpr_3 id_int(float var1) {
      return rpr_3.id_class((double)var1);
   }

   public double id_int(an_3 var1) {
      return this.id_break(var1.Ps());
   }

   private static void id_long() {
      id_break = new short[]{1, 1, 3, 13, 14, 3, 19, 26, 32, 33, 40, 42, 44, 48, 40, 63, 63, 64, 66, 68, 0, 7, 70, 11, 12, 55, 49, 49, 5, 49, 6, 49, 8, 49, 7, 49, 9, 49, 10, 49, 11, 70, 71, 74, 7, 55, 55, 0, 1, 1, 66, 66, 1024, 66, 66, 49, 1, 1, 1, 7, 7, 16, 27, 49, 11, 49, 11, 11, 11, 11, 11, 11, 11, 15, 16, 70, 11, 11, 11, 7, 27, 4, 4, 4, 14, 13, 29, 28, 16, 18, 15, 17, 7, 42, 42, 42, 42, 42, 31, 31, 7, 42, 48, 58, 58, 58, 58, 42, 42, 42, 7, 7, 20, 20, 38, 75, 77, 76, 26, 26, 26, 57, 57, 21, 22, 0, 23, 24, 24, 20, 21, 22, 57, 0, 7, 20, 7, 20, 7, 29, 29, 30, 30, 30, 32, 32, 30, 33, 30, 33, 7, 42, 40, 40, 7, 7, 7, 20, 37, 37, 7, 37, 7, 37, 7, 7, 11, 11, 11, 7, 7, 7, 7, 7, 7, 11, 11, 7, 69, 68, 69, 0, 7, 7, 7, 20, 37, 37, 7, 37, 7, 37, 7, 7, 30, 7, 7, 7, 7, 40, 40, 7, 49, 9, 49, 9, 49, 10, 49, 10, 31, 7, 31, 31, 31, 31, 43, 7, 7, 7, 45, 44, 7, 43, 43, 48, 31, 43, 43, 45, 46, 7, 7, 46, 7, 40, 40, 40, 40, 70, 40, 70, 40, 70, 7, 40, 70, 40, 70, 40, 70, 7, 7, 7, 7, 40, 70, 40, 70, 46, 46, 46, 48, 44, 0, 15, 72, 15, 7, 7, 7, 15, 15, 15, 16, 16, 16, 15, 17, 16, 18, 8, 9, 10, 15, 16, 15, 16, 8, 9, 10, 34, 35, 36, 9, 10, 11, 7, 38, 38, 39, 39, 57, 25, 16, 18, 16, 17, 18, 15, 17, 15, 8, 9, 10, 71, 8, 9, 10, 8, 9, 10, 7, 7, 7, 4, 27, 5, 5, 5, 15, 16, 31, 42, 20, 62, 58, 65, 65, 66, 66, 15, 16, 15, 17, 16, 18, 15, 15, 31, 42, 20, 62, 58, 63, 63, 64, 15, 16, 15, 16, 0, 66, 1024, 66, 7, 7, 7, 27, 27, 7, 38, 70, 7, 70, 5, 5, 5, 5, 5, 4, 7, 7, 7, 3, 3, 5, 5, 5, 7, 3, 3, 3, 4, 16, 15, 16, 15, 7, 61, 61, 59, 7, 59, 7, 60, 60, 60, 59, 60, 60, 60, 60, 60, 300, 2, 2, 7, 7, 42, 65, 7, 65, 7, 75, 77, 76, 49, 5, 49, 5, 49, 5, 49, 5, 300, 49, 6, 49, 6, 42, 42, 31, 7, 7, 7, 40, 26, 0, 1, 7, 7, 62, 62, 62, 15, 16, 58, 58, 61, 61, 7, 27, 16, 7, 27, 7, 7, 7, 15, 16, 1, 63, 63, 64, 63, 64, 64, 4, 4, 49, 7, 49, 7, 49, 7, 49, 8, 49, 8, 7, 7, 7, 7, 15, 16, 11, 70, 70, 71, 48, 7, 15, 19, 19, 71, 7, 7, 15, 0, 15, 1, 67, 67, 54, 54, 3, 3, 3, 7, 5, 7, 7, 7, 7, 7, 7, 7, 7, 44, 44, 70, 70, 70, 0, 11, 8, 9, 10, 12, 14, 13, 13, 14, 11, 11, 40, 11, 11, 40, 11, 71, 11, 11, 40, 11, 11, 11, 11, 12, 12, 12, 12, 54, 71, 75, 76, 11, 15, 16, 73, 73, 74, 57, 16, 77};
   }

   public an_3(aI_2<?> var1, rYB var2) {
      this.id_abstract();
      Integer var7 = ((AtomicInteger)id_case[1]).incrementAndGet();
      this.id_throws[1] = var7;
      ArrayList var8 = Lists.newArrayList();
      this.id_throws[3] = var8;
      rjU_2 var9 = rjU_2.id_class;
      this.id_throws[13] = var9;
      rjU_2 var10 = rjU_2.id_class;
      this.id_throws[14] = var10;
      rfl_3 var11 = (rfl_3)id_case[3];
      this.id_throws[19] = var11;
      rjU_2 var12 = rjU_2.id_class;
      this.id_throws[26] = var12;
      Float var13 = 1.0F;
      this.id_throws[32] = var13;
      Float var14 = 1.0F;
      this.id_throws[33] = var14;
      Random var15 = new Random();
      this.id_throws[40] = var15;
      Integer var16 = -this.rV();
      this.id_throws[42] = var16;
      Object2DoubleArrayMap var17 = new Object2DoubleArrayMap(2);
      this.id_throws[44] = var17;
      Boolean var18 = true;
      this.id_throws[48] = var18;
      UUID var19 = rfU_2.id_class((Random)this.id_throws[40]);
      this.id_throws[63] = var19;
      String var20 = ((UUID)this.id_throws[63]).toString();
      this.id_throws[64] = var20;
      HashSet var21 = Sets.newHashSet();
      this.id_throws[66] = var21;
      double[] var10001 = new double[3];
      var10001[0] = (double)0.0F;
      var10001[1] = (double)0.0F;
      var10001[2] = (double)0.0F;
      double[] var22 = var10001;
      this.id_throws[68] = var22;
      this.id_throws[0] = var1;
      this.id_throws[7] = var2;
      ap_3 var25 = var1.id_volatile();
      this.id_throws[70] = var25;
      rjU_2 var26 = rjU_2.id_class;
      this.id_throws[11] = var26;
      rfH_2 var27 = rfH_2.id_protected;
      this.id_throws[12] = var27;
      rjU_2 var28 = rjU_2.id_class;
      this.id_throws[55] = var28;
      this.id_new((double)0.0F, (double)0.0F, (double)0.0F);
      rmE_2 var29 = new rmE_2(this);
      this.id_throws[49] = var29;
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[5], Byte.valueOf(0));
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[6], this.ri());
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[8], false);
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[7], Optional.empty());
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[9], false);
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[10], false);
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[11], iM_2.STANDING);
      this.m_();
      Float var30 = this.id_class(iM_2.STANDING, (ap_3)this.id_throws[70]);
      this.id_throws[71] = var30;
      String var31 = this.PT().id_byte();
      this.id_throws[74] = var31;
   }

   static {
      ntfClinit();
   }

   public boolean equals(Object var1) {
      if (var1 instanceof an_3) {
         return (Integer)((an_3)var1).id_throws[1] == (Integer)this.id_throws[1] ? true : false;
      } else {
         return false;
      }
   }

   public String toString() {
      Locale var10000 = Locale.ROOT;
      String var10001 = id_class[51];
      Object[] var10002 = new Object[7];
      var10002[0] = this.getClass().getSimpleName();
      var10002[1] = this.g().getString();
      var10002[2] = (Integer)this.id_throws[1];
      var10002[3] = (rYB)this.id_throws[7] == null ? id_class[52] : ((rYB)this.id_throws[7]).toString();
      var10002[4] = this.rx();
      var10002[5] = this.re();
      var10002[6] = this.BO();
      return String.format(var10000, var10001, var10002);
   }

   public int hashCode() {
      return (Integer)this.id_throws[1];
   }

   public boolean B() {
      return this.PF() && !this.rT() && !this.id_native() && !this.x() && !this.ry() && this.BM() ? true : false;
   }

   public boolean C() {
      return ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_final);
   }

   public boolean D() {
      return (Boolean)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[8]);
   }

   public boolean I() {
      return true;
   }

   public int V() {
      return (Integer)this.id_throws[1];
   }

   public boolean id_this(an_3 var1) {
      return this.id_class(var1, false);
   }

   public void id_this() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_break(6, this.w());
      }

      this.Pn();
   }

   public rYB e() {
      return (rYB)this.id_throws[7];
   }

   public String i() {
      return (String)this.id_throws[64];
   }

   public boolean x() {
      return this.Pb() == iM_2.CROUCHING ? true : false;
   }

   public boolean h() {
      return this.id_finally(true);
   }

   public float f() {
      return 0.0F;
   }

   public boolean l() {
      return true;
   }

   public void a() {
      if (this.rZ()) {
         Integer var5 = (Integer)this.id_throws[58] - 1;
         this.id_throws[58] = var5;
      }

   }

   public abstract void id_class(rcd_3 var1);

   public void id_class(an_3 var1, int var2, rye_3 var3) {
      if (var1 instanceof rhN_2) {
         Oo_1.id_byte.id_class((rhN_2)var1, this, var3);
      }

   }

   public void id_class(rrEm_1 var1, rSg_1 var2) {
      this.id_protected((Integer)this.id_throws[42] + 1);
      if ((Integer)this.id_throws[42] == 0) {
         this.id_case(8);
      }

      this.id_break(rye_3.id_break, 5.0F);
   }

   public boolean id_class(rlb_3<rXs_1> var1, double var2) {
      rfl_3 var4 = this.rN().id_break(0.001);
      int var5 = rfU_2.id_byte(var4.id_class);
      int var6 = rfU_2.id_throws(var4.id_protected);
      int var7 = rfU_2.id_byte(var4.id_break);
      int var8 = rfU_2.id_throws(var4.id_throws);
      int var9 = rfU_2.id_byte(var4.id_byte);
      int var10 = rfU_2.id_throws(var4.id_case);
      if (!((rYB)this.id_throws[7]).id_class(var5, var7, var9, var6, var8, var10)) {
         return false;
      } else {
         double var11 = (double)0.0F;
         boolean var13 = this.u();
         boolean var14 = false;
         rjU_2 var15 = rjU_2.id_class;
         int var16 = false;
         rfw_3 var17 = new rfw_3();

         for(int var18 = var5; var18 < var6; ++var18) {
            for(int var19 = var7; var19 < var8; ++var19) {
               for(int var20 = var9; var20 < var10; ++var20) {
                  var17.id_class(var18, var19, var20);
                  rXE var21 = ((rYB)this.id_throws[7]).id_break(var17);
                  if (var21.id_class(var1)) {
                     double var22 = (double)((float)var19 + var21.id_class((rYB)this.id_throws[7], var17));
                     if (var22 >= var4.id_break) {
                        var14 = true;
                        var11 = Math.max(var22 - var4.id_break, var11);
                        if (var13) {
                           rjU_2 var24 = var21.id_byte((rYB)this.id_throws[7], var17);
                           if (var11 < 0.4) {
                              var24 = var24.id_class(var11);
                           }

                           var15 = var15.id_throws(var24);
                           ++var16;
                        }
                     }
                  }
               }
            }
         }

         if (var15.id_case() > (double)0.0F) {
            if (var16 > 0) {
               var15 = var15.id_class((double)1.0F / (double)var16);
            }

            if (!(this instanceof rhd_3)) {
               var15 = var15.id_protected();
            }

            rjU_2 var26 = this.rv();
            var15 = var15.id_class(var2);
            if (Math.abs(var26.id_break) < 0.003 && Math.abs(var26.id_protected) < 0.003 && var15.id_case() < 0.0045000000000000005) {
               var15 = var15.id_protected().id_class(0.0045000000000000005);
            }

            this.id_byte(this.rv().id_throws(var15));
         }

         ((Object2DoubleMap)this.id_throws[44]).put(var1, var11);
         return var14;
      }
   }

   public void id_class(xd_3 var1) {
      Boolean var6 = true;
      this.id_throws[75] = var6;
      this.id_throws[77] = var1;
   }

   public void id_class(float var1, int var2) {
      this.id_implements(var1);
   }

   public boolean id_class(int var1, rdn_3 var2) {
      return false;
   }

   public an_3 id_class(rrEm_1 var1) {
      if ((rYB)this.id_throws[7] instanceof rrEm_1 && !(Boolean)this.id_throws[27]) {
         this.K();
         WP var2 = this.id_break(var1);
         if (var2 == null) {
            return null;
         } else {
            an_3 var3 = this.BC().id_class(var1);
            if (var3 != null) {
               var3.id_throws(this);
               var3.id_class(var2.id_class.id_break, var2.id_class.id_byte, var2.id_class.id_protected, var2.id_byte, (Float)var3.id_throws[16]);
               var3.id_byte(var2.id_break);
               var1.id_catch(var3);
               if (var1.E() == rYB.id_throws) {
                  rrEm_1.id_class(var1);
               }
            }

            this.Pi();
            ((rrEm_1)((rYB)this.id_throws[7])).id_volatile();
            var1.id_volatile();
            return var3;
         }
      } else {
         return null;
      }
   }

   public boolean id_class(QP var1) {
      if (this.ra() instanceof rSK) {
         return false;
      } else {
         double var2 = this.re() + (double)this.Bx();
         rfH_2 var4 = new rfH_2(this.rx(), var2, this.BO());
         xc_3 var5 = ((rYB)this.id_throws[7]).id_byte(var4);
         return var5.id_byte() == var1 ? true : false;
      }
   }

   private double id_class(rpB_2 var1, double var2) {
      int var4 = var1.ordinal();
      double var5 = rfU_2.id_class(var2 + ((double[])this.id_throws[68])[var4], -0.51, 0.51);
      var2 = var5 - ((double[])this.id_throws[68])[var4];
      ((double[])this.id_throws[68])[var4] = var5;
      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1910609438552633685L;
   }

   public rgP_2 id_class(rnO_2... var1) {
      return rnB_2.id_class(this.BG(), this.g(), var1).id_class((var1x) -> var1x.id_class(this.rM()).id_class(this.rz()));
   }

   public static rjU_2 id_class(rjU_2 var0, rfl_3 var1, rRR var2, rjm_3 var3, rqJ_2<rjC_2> var4, boolean var5, boolean var6) {
      double var7 = var0.id_break;
      double var9 = var0.id_byte;
      double var11 = var0.id_protected;
      if (var9 != (double)0.0F) {
         if (!var5) {
            var9 = rjw_3.id_class(rpB_2.Y, var1, var2, var9, var3, var4.id_class());
         }

         if (var9 != (double)0.0F) {
            var1 = var1.id_protected((double)0.0F, var9, (double)0.0F);
         }
      }

      boolean var13 = Math.abs(var7) < Math.abs(var11) ? true : false;
      if (var13 && var11 != (double)0.0F) {
         if (!var6) {
            var11 = rjw_3.id_class(rpB_2.Z, var1, var2, var11, var3, var4.id_class());
         }

         if (var11 != (double)0.0F) {
            var1 = var1.id_protected((double)0.0F, (double)0.0F, var11);
         }
      }

      if (var7 != (double)0.0F) {
         if (!var6) {
            var7 = rjw_3.id_class(rpB_2.X, var1, var2, var7, var3, var4.id_class());
         }

         if (!var13 && var7 != (double)0.0F) {
            var1 = var1.id_protected(var7, (double)0.0F, (double)0.0F);
         }
      }

      if (!var13 && var11 != (double)0.0F && !var6) {
         var11 = rjw_3.id_class(rpB_2.Z, var1, var2, var11, var3, var4.id_class());
      }

      return new rjU_2(var7, var9, var11);
   }

   public boolean id_class(an_3 var1, boolean var2) {
      for(an_3 var3 = var1; (an_3)var3.id_throws[5] != null; var3 = (an_3)var3.id_throws[5]) {
         if ((an_3)var3.id_throws[5] == this) {
            return false;
         }
      }

      if (var2 || this.id_new(var1) && var1.id_case(this)) {
         if (this.Pm()) {
            this.BH();
         }

         this.id_class(iM_2.STANDING);
         this.id_throws[5] = var1;
         ((an_3)this.id_throws[5]).id_extends(this);
         return true;
      } else {
         return false;
      }
   }

   public void id_class(byte var1) {
      if (var1 == 53) {
         kB_2.id_class(this);
      }

   }

   public float id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return var6;
   }

   public void id_class(rYB var1) {
      this.id_throws[7] = var1;
   }

   public void id_class(float var1, rjU_2 var2) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(this);
      rjU_2 var3 = id_class(var2, var1, (Float)this.id_throws[15]);
      this.id_byte(this.rv().id_throws(var3));
      Float var8 = (Float)this.id_throws[72];
      this.id_throws[15] = var8;
   }

   public boolean id_class(rlb_3<rXs_1> var1) {
      return (rlb_3)this.id_throws[46] == var1 ? true : false;
   }

   public boolean id_class(rfH_2 var1, xc_3 var2) {
      rjC_2 var3 = var2.id_break((rYB)this.id_throws[7], var1, rjm_3.id_class(this));
      rjC_2 var4 = var3.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
      return rjw_3.id_byte(var4, rjw_3.id_class(this.rN()), rjN_2.id_implements);
   }

   public void id_class(rqA_2 var1, float var2, float var3) {
      if (!this.BF()) {
         ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3);
      }

   }

   private void id_class(boolean var1, Set<an_3> var2) {
      for(an_3 var4 : this.Bh()) {
         if (!var1 || rhN_2.class.isAssignableFrom(var4.getClass())) {
            var2.add(var4);
         }

         var4.id_class(var1, var2);
      }

   }

   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.id_new(var1, var3, var5);
      this.id_case(var7, var8);
   }

   public rcy_3 id_class(float... var1) {
      rcy_3 var2 = new rcy_3();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = false; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.add(rcu_3.id_class(var6));
      }

      return var2;
   }

   public rsE_2 id_class(rpL_2 var1) {
      return this.id_class(var1, false);
   }

   private void id_class(an_3 var1, al_3 var2) {
      if (this.id_synchronized(var1)) {
         double var3 = this.re() + this.PS() + var1.Pv();
         var2.accept(var1, this.rx(), var3, this.BO());
      }

   }

   public ryZ_2 id_class(rhd_3 var1, rjU_2 var2, rpm_3 var3) {
      return ryZ_2.PASS;
   }

   public boolean id_class(an_3 var1, double var2) {
      double var4 = ((rjU_2)var1.id_throws[11]).id_break - ((rjU_2)this.id_throws[11]).id_break;
      double var6 = ((rjU_2)var1.id_throws[11]).id_byte - ((rjU_2)this.id_throws[11]).id_byte;
      double var8 = ((rjU_2)var1.id_throws[11]).id_protected - ((rjU_2)this.id_throws[11]).id_protected;
      return var4 * var4 + var6 * var6 + var8 * var8 < var2 * var2 ? true : false;
   }

   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      return ryZ_2.PASS;
   }

   public void id_class(double var1, double var3, double var5, float var7) {
      this.id_byte((new rjU_2(var1, var3, var5)).id_throws((double)var7, (double)var7, (double)var7));
   }

   public boolean id_class(float var1, float var2) {
      if (this.BP()) {
         for(an_3 var4 : this.Bh()) {
            var4.id_class(var1, var2);
         }
      }

      return false;
   }

   public rjG_2 id_class(double var1, float var3, boolean var4) {
      rjU_2 var5 = this.id_new(var3);
      rjU_2 var6 = this.id_break(var3);
      rjU_2 var7 = var5.id_break(var6.id_break * var1, var6.id_byte * var1, var6.id_protected * var1);
      return ((rYB)this.id_throws[7]).id_class(new rjB_2(var5, var7, rjS_2.OUTLINE, var4 ? rjs_3.ANY : rjs_3.NONE, this));
   }

   public void id_class(Ko_1 var1) {
      var1.id_class(id_class[54], () -> {
         rqO_2 var10000 = aI_2.id_class(this.BC());
         return var10000 + " (" + this.getClass().getCanonicalName() + ")";
      });
      var1.id_class(id_class[55], (Integer)this.id_throws[1]);
      var1.id_class(id_class[56], () -> this.g().getString());
      String var10001 = id_class[57];
      Locale var10002 = Locale.ROOT;
      String var10003 = id_class[58];
      Object[] var10004 = new Object[3];
      var10004[0] = this.rx();
      var10004[1] = this.re();
      var10004[2] = this.BO();
      var1.id_class(var10001, String.format(var10002, var10003, var10004));
      var1.id_class(id_class[59], Ko_1.id_class(rfU_2.id_byte(this.rx()), rfU_2.id_byte(this.re()), rfU_2.id_byte(this.BO())));
      rjU_2 var2 = this.rv();
      if (var2 != null) {
         var10001 = id_class[60];
         var10002 = Locale.ROOT;
         var10003 = id_class[61];
         var10004 = new Object[3];
         var10004[0] = var2.id_break;
         var10004[1] = var2.id_byte;
         var10004[2] = var2.id_protected;
         var1.id_class(var10001, String.format(var10002, var10003, var10004));
      }

      var1.id_class(id_class[62], () -> this.Bh().toString());
      var1.id_class(id_class[63], () -> this.ra().toString());
   }

   public rsE_2 id_class(rdn_3 var1, float var2) {
      if (var1.id_class()) {
         return null;
      } else if (((rYB)this.id_throws[7]).id_continue) {
         return null;
      } else {
         rsE_2 var3 = new rsE_2((rYB)this.id_throws[7], this.rx(), this.re() + (double)var2, this.BO(), var1);
         var3.id_private();
         ((rYB)this.id_throws[7]).a_(var3);
         return var3;
      }
   }

   public float id_class(eX_2 var1) {
      return this.id_break(var1.id_class(), var1.id_break(), var1.id_byte());
   }

   public rjU_2 id_class(float var1) {
      return this.id_finally(var1).id_break((double)0.0F, (double)(Float)this.id_throws[71] * 0.7, (double)0.0F);
   }

   public double id_class(double var1, double var3, double var5) {
      double var7 = this.rx() - var1;
      double var9 = this.re() - var3;
      double var11 = this.BO() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public rcy_3 id_class(double... var1) {
      rcy_3 var2 = new rcy_3();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = false; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.add(rcz_3.id_class(var6));
      }

      return var2;
   }

   public void id_class(xc_3 var1) {
   }

   public static rjU_2 id_class(an_3 var0, rjU_2 var1, rfl_3 var2, rYB var3, rjm_3 var4, rqJ_2<rjC_2> var5, boolean var6, boolean var7) {
      boolean var8 = var1.id_break == (double)0.0F ? true : false;
      boolean var9 = var1.id_byte == (double)0.0F ? true : false;
      boolean var10 = var1.id_protected == (double)0.0F ? true : false;
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         return id_class(var1, var2, var3, var4, var5, var6, var7);
      } else {
         rqJ_2 var11 = new rqJ_2(Stream.concat(var5.id_class(), var3.id_byte(var0, var2.id_break(var1))));
         return id_class(var1, var2, var11, var6, var7);
      }
   }

   public void id_class(rhN_2 var1) {
   }

   public rjU_2 id_class(float var1, float var2, float var3) {
      return this.id_byte(this.id_private(var2, var3), this.id_throws(var1, var3));
   }

   public boolean id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return true;
   }

   public void id_class(rrEm_1 var1, iB_2 var2) {
   }

   public void id_class(xc_3 var1, rjU_2 var2) {
      this.id_throws[26] = var2;
   }

   public void id_class(iM_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[11], var1);
   }

   public static rjU_2 id_class(double var0, double var2, float var4) {
      double var5 = (var0 + var2 + (double)1.0E-5F) / (double)2.0F;
      float var7 = -rfU_2.id_class(var4 * ((float)Math.PI / 180F));
      float var8 = rfU_2.id_break(var4 * ((float)Math.PI / 180F));
      float var9 = Math.max(Math.abs(var7), Math.abs(var8));
      return new rjU_2((double)var7 * var5 / (double)var9, (double)0.0F, (double)var8 * var5 / (double)var9);
   }

   public void id_class(rXQ var1, rdn_3 var2) {
   }

   public boolean id_class(rye_3 var1) {
      return (Boolean)this.id_throws[62] && var1 != rye_3.id_volatile && !var1.id_synchronized() ? true : false;
   }

   public rsE_2 id_class(rpL_2 var1, int var2) {
      return this.id_class(new rdn_3(var1), (float)var2);
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.id_package(var1, var3, var5);
      Float var14 = var7;
      this.id_throws[15] = var14;
      if (var9) {
         Float var15 = (Float)this.id_throws[15] % 360.0F;
         this.id_throws[15] = var15;
      }

      Float var16 = rfU_2.id_class(var8, -90.0F, 90.0F);
      this.id_throws[16] = var16;
      if (var9) {
         Float var17 = (Float)this.id_throws[16] % 360.0F;
         this.id_throws[16] = var17;
      }

      Float var18 = (Float)this.id_throws[15];
      this.id_throws[17] = var18;
      Float var19 = (Float)this.id_throws[16];
      this.id_throws[18] = var19;
   }

   public rjU_2 id_class(rjU_2 var1, float var2) {
      if (var2 == 1.0F) {
         return new rjU_2(var1.id_break, var1.id_byte + (double)(Float)this.id_throws[71], var1.id_byte);
      } else {
         double var3 = rfU_2.id_protected((double)var2, (Double)this.id_throws[8], this.rx());
         double var5 = rfU_2.id_protected((double)var2, (Double)this.id_throws[9], this.re()) + (double)this.Bx();
         double var7 = rfU_2.id_protected((double)var2, (Double)this.id_throws[10], this.BO());
         return new rjU_2(var3, var5, var7);
      }
   }

   public boolean id_class(rnM_2 var1) {
      return this.BG() != null && this.BG().id_class(var1) ? true : false;
   }

   public rjG_2 id_class(rjU_2 var1, double var2, float var4, boolean var5, Predicate<xc_3> var6) {
      rjU_2 var7 = this.id_new(var4);
      rjU_2 var8 = var7.id_break(var1.id_break * var2, var1.id_byte * var2, var1.id_protected * var2);
      rjB_2 var9 = new rjB_2(var7, var8, rjS_2.OUTLINE, var5 ? rjs_3.ANY : rjs_3.NONE, this);
      var9.id_class(var6);
      return ((rYB)this.id_throws[7]).id_break(var9);
   }

   public void id_class(rut_3<?> var1) {
      if (((rut_3)id_case[11]).equals(var1)) {
         this.q_();
      }

   }

   public void id_class(rfl_3 var1) {
      this.id_throws[19] = var1;
   }

   public void id_class(Rm_1 var1, rjU_2 var2) {
      rjU_2 var3 = var1.id_class(this);
      double var4 = var2.id_break - var3.id_break;
      double var6 = var2.id_byte - var3.id_byte;
      double var8 = var2.id_protected - var3.id_protected;
      double var10 = (double)rfU_2.id_class(var4 * var4 + var8 * var8);
      Float var16 = rfU_2.id_catch((float)(-(rfU_2.id_protected(var6, var10) * (double)(180F / (float)Math.PI))));
      this.id_throws[16] = var16;
      Float var17 = rfU_2.id_catch((float)(rfU_2.id_protected(var8, var4) * (double)(180F / (float)Math.PI)) - 90.0F);
      this.id_throws[15] = var17;
      this.id_implements((Float)this.id_throws[15]);
      Float var18 = (Float)this.id_throws[16];
      this.id_throws[18] = var18;
      Float var19 = (Float)this.id_throws[15];
      this.id_throws[17] = var19;
   }

   public boolean id_class(Class<? extends an_3> var1) {
      for(an_3 var3 : this.Bh()) {
         if (var1.isAssignableFrom(var3.getClass())) {
            return true;
         }
      }

      return false;
   }

   public static rjU_2 id_class(rjU_2 var0, rfl_3 var1, rqJ_2<rjC_2> var2, boolean var3, boolean var4) {
      double var5 = var0.id_break;
      double var7 = var0.id_byte;
      double var9 = var0.id_protected;
      if (var7 != (double)0.0F) {
         if (!var3) {
            var7 = rjw_3.id_class(rpB_2.Y, var1, var2.id_class(), var7);
         }

         if (var7 != (double)0.0F) {
            var1 = var1.id_protected((double)0.0F, var7, (double)0.0F);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9) ? true : false;
      if (var11 && var9 != (double)0.0F) {
         if (!var4) {
            var9 = rjw_3.id_class(rpB_2.Z, var1, var2.id_class(), var9);
         }

         if (var9 != (double)0.0F) {
            var1 = var1.id_protected((double)0.0F, (double)0.0F, var9);
         }
      }

      if (var5 != (double)0.0F) {
         if (!var4) {
            var5 = rjw_3.id_class(rpB_2.X, var1, var2.id_class(), var5);
         }

         if (!var11 && var5 != (double)0.0F) {
            var1 = var1.id_protected(var5, (double)0.0F, (double)0.0F);
         }
      }

      if (!var11 && var9 != (double)0.0F && !var4) {
         var9 = rjw_3.id_class(rpB_2.Z, var1, var2.id_class(), var9);
      }

      return new rjU_2(var5, var7, var9);
   }

   public rjU_2 id_class(rjU_2 var1, iG_2 var2) {
      return var1;
   }

   public boolean id_class(double var1) {
      double var3 = this.rN().id_class();
      if (Double.isNaN(var3)) {
         var3 = (double)1.0F;
      }

      var3 = var3 * (double)64.0F * (Double)id_case[4];
      return var1 < var3 * var3 ? true : false;
   }

   private static rjU_2 id_class(rjU_2 var0, float var1, float var2) {
      double var3 = var0.id_catch();
      if (var3 < 1.0E-7) {
         return rjU_2.id_class;
      } else {
         rjU_2 var5 = (var3 > (double)1.0F ? var0.id_protected() : var0).id_class((double)var1);
         float var6 = rfU_2.id_class(var2 * ((float)Math.PI / 180F));
         float var7 = rfU_2.id_break(var2 * ((float)Math.PI / 180F));
         return new rjU_2(var5.id_break * (double)var7 - var5.id_protected * (double)var6, var5.id_byte, var5.id_protected * (double)var7 + var5.id_break * (double)var6);
      }
   }

   public float id_class(rqd_3 var1) {
      float var2 = rfU_2.id_catch((Float)this.id_throws[15]);
      switch (((int[])aC_2.id_class[0])[var1.ordinal()]) {
         case 1 -> {
            return var2 + 180.0F;
         }
         case 2 -> {
            return var2 + 270.0F;
         }
         case 3 -> {
            return var2 + 90.0F;
         }
         default -> {
            return var2;
         }
      }
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8) {
      this.id_native(var1, var3, var5);
      Float var13 = var7;
      this.id_throws[15] = var13;
      Float var14 = var8;
      this.id_throws[16] = var14;
      this.PX();
   }

   public void id_class(iB_2 var1, an_3 var2) {
      if (var2 instanceof iB_2) {
         eA_2.id_class((iB_2)var2, var1);
      }

      eA_2.id_break(var1, var2);
   }

   private rjU_2 id_class(rjU_2 var1, boolean var2, boolean var3) {
      rfl_3 var4 = this.rN();
      rjm_3 var5 = rjm_3.id_class(this);
      boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().y().id_new();
      Stream var7 = ((rYB)this.id_throws[7]).id_class(this, var4.id_break(var1), (var0) -> true);
      if (!var6) {
         rjC_2 var8 = ((rYB)this.id_throws[7]).id_instanceof().id_byte();
         if (!rjw_3.id_byte(var8, rjw_3.id_class(var4.id_break(1.0E-7)), rjN_2.id_implements)) {
            var7 = Stream.concat(var7, Stream.of(var8));
         }
      }

      rqJ_2 var19 = new rqJ_2(var7);
      rjU_2 var9 = var1.id_catch() == (double)0.0F ? var1 : id_class(this, var1, var4, (rYB)this.id_throws[7], var5, var19, var2, var3);
      boolean var10 = var1.id_break != var9.id_break ? true : false;
      boolean var11 = var1.id_byte != var9.id_byte ? true : false;
      boolean var12 = var1.id_protected != var9.id_protected ? true : false;
      boolean var13 = !(Boolean)this.id_throws[20] && (!var11 || !(var1.id_byte < (double)0.0F)) ? false : true;
      if ((Float)this.id_throws[37] > 0.0F && var13 && (var10 || var12)) {
         rjU_2 var14 = new rjU_2(var1.id_break, (double)(Float)this.id_throws[37], var1.id_protected);
         rjU_2 var15 = id_class(this, var14, var4, (rYB)this.id_throws[7], var5, var19, var2, var3);
         rjU_2 var16 = new rjU_2((double)0.0F, (double)(Float)this.id_throws[37], (double)0.0F);
         rjU_2 var17 = id_class(this, var16, var4.id_break(var1.id_break, (double)0.0F, var1.id_protected), (rYB)this.id_throws[7], var5, var19, var2, var3);
         if (var17.id_byte < (double)(Float)this.id_throws[37]) {
            rjU_2 var18 = id_class(this, new rjU_2(var1.id_break, (double)0.0F, var1.id_protected), var4.id_protected(var17), (rYB)this.id_throws[7], var5, var19, var2, var3).id_throws(var17);
            if (id_case(var18) > id_case(var15)) {
               var15 = var18;
            }
         }

         if (id_case(var15) > id_case(var9)) {
            rjU_2 var20 = new rjU_2((double)0.0F, -var15.id_byte + var1.id_byte, (double)0.0F);
            return var15.id_throws(id_class(this, var20, var4.id_protected(var15), (rYB)this.id_throws[7], var5, var19, var2, var3));
         }
      }

      return var9;
   }

   private static rgP_2 id_class(rgP_2 var0) {
      rVi_1 var1 = var0.id_throws().id_class(var0.id_class().id_class((rgl_3)null));

      for(rgP_2 var3 : var0.id_protected()) {
         var1.id_class(id_class(var3));
      }

      return var1;
   }

   public float id_class(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.85F;
   }

   public void id_class(iG_2 var1, rjU_2 var2) {
      rfl_3 var3 = this.rN();
      double var4 = this.rx();
      double var6 = this.BO();
      if ((Boolean)this.id_throws[38]) {
         this.id_class(this.rN().id_protected(var2));
         this.PC();
      } else {
         QY var8 = QY.id_instanceof();
         if (var1 == iG_2.PISTON) {
            var2 = this.id_protected(var2);
            if (var2.equals(rjU_2.id_class)) {
               return;
            }
         }

         Boolean var32 = false;
         this.id_throws[75] = var32;
         Object var33 = null;
         this.id_throws[77] = var33;
         Boolean var34 = false;
         this.id_throws[76] = var34;
         if (((rjU_2)this.id_throws[26]).id_catch() > 1.0E-7) {
            var2 = var2.id_finally((rjU_2)this.id_throws[26]);
            rjU_2 var35 = rjU_2.id_class;
            this.id_throws[26] = var35;
            this.id_byte(rjU_2.id_class);
         }

         var2 = this.id_class(var2, var1);
         boolean var9 = false;
         boolean var10 = false;
         if (this == (cb_3)var8.id_class[57]) {
            rrLz_1 var11 = rrLz_1.id_class(var2, this.Ps(), var3, var9, var10, this.id_break(var2, var9, var10));
            var9 = var11.id_class();
            var10 = var11.id_class();
            var2 = var11.id_catch();
         }

         rjU_2 var47 = this.id_class(var2, var9, var10);
         if (var47.id_catch() > 1.0E-7) {
            this.id_class(this.rN().id_protected(var47));
            this.PC();
         }

         boolean var12 = rfU_2.id_break(var2.id_break, var47.id_break) && rfU_2.id_break(var2.id_protected, var47.id_protected) ? false : true;
         boolean var13 = var2.id_byte != var47.id_byte ? true : false;
         if (this == (cb_3)var8.id_class[57] && (var12 != (Boolean)this.id_throws[21] || var13 != (Boolean)this.id_throws[22])) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLj_1.id_class(var12, var13));
         }

         Boolean var36 = var12;
         this.id_throws[23] = var36;
         Boolean var37 = var13;
         this.id_throws[24] = var37;
         Boolean var38 = (Boolean)this.id_throws[24] && var2.id_byte < (double)0.0F ? true : false;
         this.id_throws[20] = var38;
         Boolean var39 = var12;
         this.id_throws[21] = var39;
         Boolean var40 = var13;
         this.id_throws[22] = var40;
         if (this == (cb_3)var8.id_class[57]) {
            double var14 = this.rx() - var4;
            double var16 = this.BO() - var6;
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLW.id_class((double)rfU_2.id_class(var14 * var14 + var16 * var16)));
         }

         rfH_2 var48 = this.BS();
         xc_3 var15 = ((rYB)this.id_throws[7]).id_byte(var48);
         this.id_class(var47.id_byte, (Boolean)this.id_throws[20], var15, var48);
         rjU_2 var49 = this.rv();
         if (var2.id_break != var47.id_break) {
            this.id_catch((double)0.0F, var49.id_byte, var49.id_protected);
         }

         if (var2.id_protected != var47.id_protected) {
            this.id_catch(var49.id_break, var49.id_byte, (double)0.0F);
         }

         xd_3 var17 = var15.id_break();
         if (var2.id_byte != var47.id_byte) {
            var17.id_class((rYB)this.id_throws[7], this);
         }

         if ((Boolean)this.id_throws[20] && !this.Pc()) {
            var17.id_class((rYB)this.id_throws[7], var48, this);
         }

         if (this.PK() && !this.Pm()) {
            double var18 = var47.id_break;
            double var20 = var47.id_byte;
            double var22 = var47.id_protected;
            if (!var17.id_class(rls_3.F)) {
               var20 = (double)0.0F;
            }

            Float var41 = (float)((double)(Float)this.id_throws[29] + (double)rfU_2.id_class(id_case(var47)) * 0.6);
            this.id_throws[29] = var41;
            Float var42 = (float)((double)(Float)this.id_throws[30] + (double)rfU_2.id_class(var18 * var18 + var20 * var20 + var22 * var22) * 0.6);
            this.id_throws[30] = var42;
            if ((Float)this.id_throws[30] > (Float)this.id_throws[32] && !var15.id_catch()) {
               Float var43 = this.rQ();
               this.id_throws[32] = var43;
               if (!this.rT()) {
                  this.id_break(var48, var15);
               } else {
                  an_3 var24 = this.BP() && this.rU() != null ? this.rU() : this;
                  float var25 = var24 == this ? 0.35F : 0.4F;
                  rjU_2 var26 = var24.rv();
                  float var27 = rfU_2.id_class(var26.id_break * var26.id_break * (double)0.2F + var26.id_byte * var26.id_byte + var26.id_protected * var26.id_protected * (double)0.2F) * var25;
                  if (var27 > 1.0F) {
                     var27 = 1.0F;
                  }

                  this.id_private(var27);
               }
            } else if ((Float)this.id_throws[30] > (Float)this.id_throws[33] && this.PJ() && var15.id_catch()) {
               Float var44 = this.id_final((Float)this.id_throws[30]);
               this.id_throws[33] = var44;
            }
         }

         try {
            this.Px();
         } catch (Throwable var45) {
            KY var19 = KY.id_class(var45, id_class[0]);
            Ko_1 var51 = var19.id_class(id_class[1]);
            this.id_class(var51);
            throw new KU(var19);
         }

         float var50 = this.rq();
         this.id_byte(this.rv().id_throws((double)var50, (double)1.0F, (double)var50));
         if (((rYB)this.id_throws[7]).id_byte(this.rN().id_break(0.001)).noneMatch((var0) -> var0.id_class(rls_3.N) || var0.id_class(xu_3.id_instanceof)) && (Integer)this.id_throws[42] <= 0) {
            this.id_protected(-this.rV());
         }

         if (this.Pk() && this.Pz()) {
            this.id_class(rqn_3.SY, 0.7F, 1.6F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.4F);
            this.id_protected(-this.rV());
         }
      }

   }

   public void id_class(rgP_2 var1, UUID var2) {
   }

   public float id_class(rpa_3 var1) {
      float var2 = rfU_2.id_catch((Float)this.id_throws[15]);
      switch (((int[])aC_2.id_class[1])[var1.ordinal()]) {
         case 1 -> {
            return -var2;
         }
         case 2 -> {
            return 180.0F - var2;
         }
         default -> {
            return var2;
         }
      }
   }

   public void id_class(rfH_2 var1, float var2, float var3) {
      this.id_class((double)var1.b_() + (double)0.5F, (double)var1.c_(), (double)var1.d_() + (double)0.5F, var2, var3);
   }

   public void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      if (var3) {
         if ((Float)this.id_throws[31] > 0.0F) {
            var4.id_break().id_class((rYB)this.id_throws[7], var5, this, (Float)this.id_throws[31]);
         }

         Float var10 = 0.0F;
         this.id_throws[31] = var10;
      } else if (var1 < (double)0.0F) {
         Float var11 = (float)((double)(Float)this.id_throws[31] - var1);
         this.id_throws[31] = var11;
      }

   }

   public Optional<rqT_2> id_class(rrEm_1 var1, rfH_2 var2, boolean var3) {
      return var1.M().id_class(var2, var3);
   }

   protected rjU_2 id_class(rpB_2 var1, rqT_2 var2) {
      return WB.id_class(var2, var1, this.Ps(), this.a_(this.Pb()));
   }

   public rjG_2 id_class(rjU_2 var1, rjU_2 var2, double var3, boolean var5) {
      rjU_2 var6 = var1.id_break(var2.id_break * var3, var2.id_byte * var3, var2.id_protected * var3);
      return ((rYB)this.id_throws[7]).id_break(new rjB_2(var1, var6, rjS_2.OUTLINE, var5 ? rjs_3.ANY : rjs_3.NONE, this));
   }

   public void rd() {
      if (this.ra() instanceof rSK) {
         Boolean var5 = false;
         this.id_throws[43] = var5;
      } else if (this.id_class(rlG_2.id_break, 0.014)) {
         if (!(Boolean)this.id_throws[43] && !(Boolean)this.id_throws[48]) {
            this.U();
         }

         Float var6 = 0.0F;
         this.id_throws[31] = var6;
         Boolean var7 = true;
         this.id_throws[43] = var7;
         this.rE();
      } else {
         Boolean var8 = false;
         this.id_throws[43] = var8;
      }

   }

   public rjU_2 m() {
      return this.id_byte((Float)this.id_throws[16], (Float)this.id_throws[15]);
   }

   public boolean o() {
      return false;
   }

   public void p() {
      if (this.Py()) {
         this.id_native(this.PF() && this.rT() && !this.Pm() ? true : false);
      } else {
         this.id_native(this.PF() && this.W() && !this.Pm() ? true : false);
      }

   }

   public void rb() {
      if (!this.q()) {
         this.id_case(15);
         this.id_break(rye_3.id_protected, 4.0F);
      }

   }

   public float t() {
      return 0.0F;
   }

   public rgP_2 g() {
      rgP_2 var1 = this.rD();
      return var1 != null ? id_class(var1) : this.PT();
   }

   public void j() {
      this.PD();
   }

   public boolean q() {
      return this.BC().id_byte();
   }

   public void U() {
      an_3 var1 = this.BP() && this.rU() != null ? this.rU() : this;
      float var2 = var1 == this ? 0.2F : 0.9F;
      rjU_2 var3 = var1.rv();
      float var4 = rfU_2.id_class(var3.id_break * var3.id_break * (double)0.2F + var3.id_byte * var3.id_byte + var3.id_protected * var3.id_protected * (double)0.2F) * var2;
      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      if ((double)var4 < (double)0.25F) {
         this.id_class(this.BJ(), var4, 1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.4F);
      } else {
         this.id_class(this.Bv(), var4, 1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.4F);
      }

      float var5 = (float)rfU_2.id_byte(this.re());

      for(int var6 = false; (float)var6 < 1.0F + ((ap_3)this.id_throws[70]).id_class * 20.0F; ++var6) {
         double var7 = (((Random)this.id_throws[40]).nextDouble() * (double)2.0F - (double)1.0F) * (double)((ap_3)this.id_throws[70]).id_class;
         double var9 = (((Random)this.id_throws[40]).nextDouble() * (double)2.0F - (double)1.0F) * (double)((ap_3)this.id_throws[70]).id_class;
         ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, this.rx() + var7, (double)(var5 + 1.0F), this.BO() + var9, var3.id_break, var3.id_byte - ((Random)this.id_throws[40]).nextDouble() * (double)0.2F, var3.id_protected);
      }

      for(int var11 = false; (float)var11 < 1.0F + ((ap_3)this.id_throws[70]).id_class * 20.0F; ++var11) {
         double var12 = (((Random)this.id_throws[40]).nextDouble() * (double)2.0F - (double)1.0F) * (double)((ap_3)this.id_throws[70]).id_class;
         double var13 = (((Random)this.id_throws[40]).nextDouble() * (double)2.0F - (double)1.0F) * (double)((ap_3)this.id_throws[70]).id_class;
         ((rYB)this.id_throws[7]).id_class(rLQ.E, this.rx() + var12, (double)(var5 + 1.0F), this.BO() + var13, var3.id_break, var3.id_byte, var3.id_protected);
      }

   }

   public void rf() {
      Boolean var5 = true;
      this.id_throws[25] = var5;
   }

   public boolean w() {
      return false;
   }

   public rjU_2 rv() {
      return (rjU_2)this.id_throws[14];
   }

   public boolean u() {
      return true;
   }

   public boolean rn() {
      boolean var1 = (Boolean)this.id_throws[67];
      Boolean var6 = false;
      this.id_throws[67] = var6;
      return var1;
   }

   public Set<String> y() {
      return (Set)this.id_throws[66];
   }

   public rjU_2 rh() {
      return rjU_2.id_class(this.id_import());
   }

   public double id_break(rjU_2 var1) {
      double var2 = this.rx() - var1.id_break;
      double var4 = this.re() - var1.id_byte;
      double var6 = this.BO() - var1.id_protected;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public WP id_break(rrEm_1 var1) {
      boolean var2 = ((rYB)this.id_throws[7]).E() == rYB.id_throws && var1.E() == rYB.id_byte ? true : false;
      boolean var3 = var1.E() == rYB.id_throws ? true : false;
      if (!var2 && !var3) {
         boolean var17 = var1.E() == rYB.id_protected ? true : false;
         if (((rYB)this.id_throws[7]).E() != rYB.id_protected && !var17) {
            return null;
         } else {
            roE_2 var5 = var1.id_instanceof();
            double var6 = Math.max((double)-2.9999872E7F, var5.id_throws() + (double)16.0F);
            double var8 = Math.max((double)-2.9999872E7F, var5.id_case() + (double)16.0F);
            double var10 = Math.min((double)2.9999872E7F, var5.id_catch() - (double)16.0F);
            double var12 = Math.min((double)2.9999872E7F, var5.id_private() - (double)16.0F);
            double var14 = rRJ.id_class(((rYB)this.id_throws[7]).id_default(), var1.id_default());
            rfH_2 var16 = new rfH_2(rfU_2.id_class(this.rx() * var14, var6, var10), this.re(), rfU_2.id_class(this.BO() * var14, var8, var12));
            return (WP)this.id_class(var1, var16, var17).map((var2x) -> {
               xc_3 var3 = ((rYB)this.id_throws[7]).id_byte((rfH_2)this.id_throws[61]);
               rpB_2 var4;
               rjU_2 var5;
               if (var3.id_break(rCT.id_char)) {
                  var4 = (rpB_2)var3.id_byte(rCT.id_char);
                  rqT_2 var6 = rqp_3.id_class((rfH_2)this.id_throws[61], var4, 21, rpB_2.Y, 21, (var2xx) -> ((rYB)this.id_throws[7]).id_byte(var2xx) == var3);
                  var5 = this.id_class(var4, var6);
               } else {
                  var4 = rpB_2.X;
                  var5 = new rjU_2((double)0.5F, (double)0.0F, (double)0.0F);
               }

               return WB.id_class(var1, var2x, var4, var5, this.a_(this.Pb()), this.rv(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
            }).orElse((Object)null);
         }
      } else {
         rfH_2 var4;
         if (var3) {
            var4 = rrEm_1.id_this;
         } else {
            var4 = var1.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, var1.X());
         }

         return new WP(new rjU_2((double)var4.b_() + (double)0.5F, (double)var4.c_(), (double)var4.d_() + (double)0.5F), this.rv(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
      }
   }

   public rjG_2 id_break(double var1, float var3, boolean var4) {
      return this.id_class(this.id_break(var3), var1, var3, var4, (var0) -> {
         Popka var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().q();
         return var1 == null || !var1.aJ_();
      });
   }

   public void id_break(rhN_2 var1) {
   }

   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         this.rf();
         return false;
      }
   }

   public float id_break(double var1, double var3, double var5) {
      float var7 = (float)(this.rx() - var1);
      float var8 = (float)(this.re() - var3);
      float var9 = (float)(this.BO() - var5);
      return rfU_2.id_byte(var7 * var7 + var8 * var8 + var9 * var9);
   }

   public void id_break(rgP_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[7], Optional.ofNullable(var1));
   }

   public double id_break(rlb_3<rXs_1> var1) {
      return ((Object2DoubleMap)this.id_throws[44]).getDouble(var1);
   }

   private boolean id_break(rfl_3 var1) {
      return ((rYB)this.id_throws[7]).a_(this, var1) && !((rYB)this.id_throws[7]).id_protected(var1) ? true : false;
   }

   public void id_break(rfH_2 var1, xc_3 var2) {
      if (!var2.id_byte().id_class()) {
         xc_3 var3 = ((rYB)this.id_throws[7]).id_byte(var1.id_final());
         zr_3 var4 = var3.id_class(xu_3.Pq) ? var3.id_package() : var2.id_package();
         this.id_class(var4.id_protected(), var4.id_class() * 0.15F, var4.id_break());
      }

   }

   public void id_break(double var1, double var3, double var5, float var7, float var8) {
      this.id_class(var1, var3, var5, var7, var8, true);
   }

   private boolean id_break(rjU_2 var1, boolean var2, boolean var3) {
      rfl_3 var4 = this.rN();
      rjm_3 var5 = rjm_3.id_class(this);
      rjC_2 var6 = ((rYB)this.id_throws[7]).id_instanceof().id_byte();
      Stream var7 = rjw_3.id_byte(var6, rjw_3.id_class(var4.id_break(1.0E-7)), rjN_2.id_implements) ? Stream.empty() : Stream.of(var6);
      Stream var8 = ((rYB)this.id_throws[7]).id_class(this, var4.id_break(var1), (var0) -> true);
      rqJ_2 var9 = new rqJ_2(Stream.concat(var8, var7));
      rjU_2 var10 = var1.id_catch() == (double)0.0F ? var1 : id_class(this, var1, var4, (rYB)this.id_throws[7], var5, var9, var2, var3);
      boolean var11 = var1.id_break != var10.id_break ? true : false;
      boolean var12 = var1.id_byte != var10.id_byte ? true : false;
      boolean var13 = var1.id_protected != var10.id_protected ? true : false;
      boolean var14 = !(Boolean)this.id_throws[20] && (!var12 || !(var1.id_byte < (double)0.0F)) ? false : true;
      if ((Float)this.id_throws[37] > 0.0F && var14 && (var11 || var13)) {
         rjU_2 var15 = id_class(this, new rjU_2(var1.id_break, (double)(Float)this.id_throws[37], var1.id_protected), var4, (rYB)this.id_throws[7], var5, var9, var2, var3);
         rjU_2 var16 = id_class(this, new rjU_2((double)0.0F, (double)(Float)this.id_throws[37], (double)0.0F), var4.id_break(var1.id_break, (double)0.0F, var1.id_protected), (rYB)this.id_throws[7], var5, var9, var2, var3);
         if (var16.id_byte < (double)(Float)this.id_throws[37]) {
            rjU_2 var17 = id_class(this, new rjU_2(var1.id_break, (double)0.0F, var1.id_protected), var4.id_protected(var16), (rYB)this.id_throws[7], var5, var9, var2, var3).id_throws(var16);
            if (id_case(var17) > id_case(var15)) {
               var15 = var17;
            }
         }

         if (id_case(var15) > id_case(var10)) {
            var15.id_throws(id_class(this, new rjU_2((double)0.0F, -var15.id_byte + var1.id_byte, (double)0.0F), var4.id_protected(var15), (rYB)this.id_throws[7], var5, var9, var2, var3));
         }
      }

      return var1.id_byte != var10.id_byte && var1.id_byte < (double)0.0F ? true : false;
   }

   public rjU_2 id_break(float var1) {
      return this.id_byte(this.id_case(var1), this.id_throws(var1));
   }

   public void id_break(int var1, boolean var2) {
      byte var3 = (Byte)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[5]);
      if (var2) {
         ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[5], (byte)(var3 | 1 << var1));
      } else {
         ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[5], (byte)(var3 & (1 << var1 ^ -1)));
      }

   }

   public double id_break(rfH_2 var1) {
      double var2 = (double)var1.b_() + (double)0.5F;
      double var4 = (double)var1.c_() + (double)0.5F;
      double var6 = (double)var1.d_() + (double)0.5F;
      double var8 = rfU_2.id_class(this.re() + (double)this.id_byte(this.Pb()) - var4, (double)0.0F, (double)1.0F);
      double var10 = rfU_2.id_class(this.rx() - var2, (double)-0.5F, (double)0.5F);
      double var12 = rfU_2.id_class(this.BO() - var6, (double)-0.5F, (double)0.5F);
      return this.id_new(1.0F).id_byte(var2 + var10, var4 + var8, var6 + var12);
   }

   public double id_break(double var1) {
      return this.id_catch(((double)2.0F * ((Random)this.id_throws[40]).nextDouble() - (double)1.0F) * var1);
   }

   public abstract void id_break(rcd_3 var1);

   public void id_throws(double var1, double var3, double var5) {
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         rfj_3 var7 = new rfj_3(new rfH_2(var1, var3, var5));
         ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_class(rrEl_1.id_catch, var7, false, this.V());
         ((rYB)this.id_throws[7]).id_throws(var7.id_break, var7.id_byte);
         this.id_case(var1, var3, var5);
      }

   }

   public float id_throws(float var1, float var2) {
      return var2 == 1.0F ? var1 : rfU_2.id_catch(var2, (Float)this.id_throws[17], var1);
   }

   public float id_throws(float var1) {
      return var1 == 1.0F ? (Float)this.id_throws[15] : rfU_2.id_catch(var1, (Float)this.id_throws[17], (Float)this.id_throws[15]);
   }

   public void id_throws(an_3 var1) {
      rcd_3 var2 = var1.id_case(new rcd_3());
      var2.id_continue(id_class[53]);
      this.id_throws(var2);
      Integer var7 = (Integer)var1.id_throws[58];
      this.id_throws[58] = var7;
      rfH_2 var8 = (rfH_2)var1.id_throws[61];
      this.id_throws[61] = var8;
   }

   public void id_throws(rcd_3 var1) {
      try {
         rcy_3 var2 = var1.id_protected(id_class[25], 6);
         rcy_3 var31 = var1.id_protected(id_class[26], 6);
         rcy_3 var32 = var1.id_protected(id_class[27], 5);
         double var5 = var31.id_catch(false);
         double var7 = var31.id_catch(true);
         double var9 = var31.id_catch(2);
         this.id_catch(Math.abs(var5) > (double)10.0F ? (double)0.0F : var5, Math.abs(var7) > (double)10.0F ? (double)0.0F : var7, Math.abs(var9) > (double)10.0F ? (double)0.0F : var9);
         this.id_native(var2.id_catch(false), var2.id_catch(true), var2.id_catch(2));
         Float var18 = var32.id_private(false);
         this.id_throws[15] = var18;
         Float var19 = var32.id_private(true);
         this.id_throws[16] = var19;
         Float var20 = (Float)this.id_throws[15];
         this.id_throws[17] = var20;
         Float var21 = (Float)this.id_throws[16];
         this.id_throws[18] = var21;
         this.id_implements((Float)this.id_throws[15]);
         this.id_native((Float)this.id_throws[15]);
         Float var22 = var1.id_finally(id_class[28]);
         this.id_throws[31] = var22;
         Integer var23 = var1.id_catch(id_class[29]);
         this.id_throws[42] = var23;
         this.id_throws(var1.id_catch(id_class[30]));
         Boolean var24 = var1.id_new(id_class[31]);
         this.id_throws[20] = var24;
         Boolean var25 = var1.id_new(id_class[32]);
         this.id_throws[62] = var25;
         Integer var26 = var1.id_private(id_class[33]);
         this.id_throws[58] = var26;
         if (var1.id_break(id_class[34])) {
            UUID var27 = var1.id_class(id_class[35]);
            this.id_throws[63] = var27;
            String var28 = ((UUID)this.id_throws[63]).toString();
            this.id_throws[64] = var28;
         }

         if (Double.isFinite(this.rx()) && Double.isFinite(this.re()) && Double.isFinite(this.BO())) {
            if (Double.isFinite((double)(Float)this.id_throws[15]) && Double.isFinite((double)(Float)this.id_throws[16])) {
               this.PX();
               this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
               if (var1.id_byte(id_class[36], 8)) {
                  String var11 = var1.id_native(id_class[37]);

                  try {
                     this.id_break((rgP_2)rgB_2.id_class(var11));
                  } catch (Exception var29) {
                     ((Logger)id_case[0]).warn(id_class[38], var11, var29);
                  }
               }

               this.id_final(var1.id_new(id_class[39]));
               this.id_extends(var1.id_new(id_class[40]));
               this.id_finally(var1.id_new(id_class[41]));
               this.id_implements(var1.id_new(id_class[42]));
               if (var1.id_byte(id_class[43], 9)) {
                  ((Set)this.id_throws[66]).clear();
                  rcy_3 var33 = var1.id_protected(id_class[44], 8);
                  int var12 = Math.min(var33.size(), 1024);

                  for(int var13 = false; var13 < var12; ++var13) {
                     ((Set)this.id_throws[66]).add(var33.id_implements(var13));
                  }
               }

               this.id_break(var1);
               if (this.BZ()) {
                  this.PX();
               }

            } else {
               throw new IllegalStateException(id_class[45]);
            }
         } else {
            throw new IllegalStateException(id_class[46]);
         }
      } catch (Throwable var30) {
         KY var3 = KY.id_class(var30, id_class[47]);
         Ko_1 var4 = var3.id_class(id_class[48]);
         this.id_class(var4);
         throw new KU(var3);
      }
   }

   public void id_throws(rjU_2 var1) {
      this.id_throws[13] = var1;
   }

   public double id_throws(double var1) {
      return ((rjU_2)this.id_throws[11]).id_protected + (double)this.PN() * var1;
   }

   public void id_throws(int var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[6], var1);
   }

   public boolean id_throws(iM_2 var1) {
      return !((rYB)this.id_throws[7]).a_(this, this.id_case(var1).id_break(1.0E-7)) ? true : false;
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_implements();
      id_throw();
      id_continue();
      id_long();
      id_while();
      id_final();
      id_instanceof();
      id_package();
      id_goto();
   }

   public boolean rt() {
      return true;
   }

   public xd_3 Pd() {
      return (xd_3)this.id_throws[77];
   }

   public rjU_2 Ps() {
      return (rjU_2)this.id_throws[11];
   }

   public boolean Pe() {
      return (Boolean)this.id_throws[76];
   }

   public boolean Pc() {
      return this.h();
   }

   public boolean Po() {
      an_3 var1 = this.rU();
      if (var1 instanceof rhd_3) {
         return ((rhd_3)var1).id_char();
      } else {
         return !((rYB)this.id_throws[7]).id_continue ? true : false;
      }
   }

   public void Pi() {
      Boolean var5 = true;
      this.id_throws[27] = var5;
   }

   public boolean Pf() {
      return !this.rT() && !this.id_int() ? false : true;
   }

   public boolean W() {
      return (Boolean)this.id_throws[45] && this.rT() ? true : false;
   }

   public boolean H() {
      return true;
   }

   public boolean R() {
      return this instanceof iB_2;
   }

   public void PD() {
      Boolean var5 = true;
      this.id_throws[27] = var5;
   }

   public boolean BE() {
      boolean var1 = (Boolean)this.id_throws[54];
      Boolean var6 = false;
      this.id_throws[54] = var6;
      return var1;
   }

   public void id_finally(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[10], var1);
   }

   public boolean id_finally(int var1) {
      return ((Byte)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[5]) & 1 << var1) != 0 ? true : false;
   }

   public boolean id_finally(double var1, double var3, double var5) {
      return this.id_break(this.rN().id_protected(var1, var3, var5));
   }

   public rjU_2 id_finally(float var1) {
      double var2 = rfU_2.id_protected((double)var1, (Double)this.id_throws[8], this.rx());
      double var4 = rfU_2.id_protected((double)var1, (Double)this.id_throws[9], this.re());
      double var6 = rfU_2.id_protected((double)var1, (Double)this.id_throws[10], this.BO());
      return new rjU_2(var2, var4, var6);
   }

   public boolean id_finally(an_3 var1) {
      return false;
   }

   public void id_catch(boolean var1) {
      Boolean var6 = var1;
      this.id_throws[62] = var6;
   }

   public void id_catch(rjU_2 var1) {
      this.id_throws[55] = var1;
   }

   public boolean id_catch(int var1) {
      return this.id_synchronized() >= var1 ? true : false;
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 101, -116, -110, -29, 108, 109, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_catch(double var1, double var3, double var5) {
      this.id_byte(new rjU_2(var1, var3, var5));
   }

   public double id_catch(double var1) {
      return ((rjU_2)this.id_throws[11]).id_break + (double)this.PN() * var1;
   }

   public rjU_2 id_catch(float var1, float var2) {
      return this.id_byte(var1 - 90.0F, var2);
   }

   public void id_catch(an_3 var1) {
      this.id_class(var1, an_3::id_new);
   }

   public float id_extends(float var1) {
      return 0.0F;
   }

   public void id_extends(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[9], var1);
   }

   public void id_extends(double var1, double var3, double var5) {
      this.id_catch(var1, var3, var5);
   }

   public String id_extends() {
      return (String)this.id_throws[74];
   }

   public void id_extends(an_3 var1) {
      if (var1.ra() != this) {
         throw new IllegalStateException(id_class[49]);
      } else {
         if (!((rYB)this.id_throws[7]).id_continue && var1 instanceof rhd_3 && !(this.rU() instanceof rhd_3)) {
            ((List)this.id_throws[3]).add(false, var1);
         } else {
            ((List)this.id_throws[3]).add(var1);
         }

      }
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{LogManager.getLogger(), new AtomicInteger(), Collections.emptyList(), new rfl_3((double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F), (double)1.0F, rmE_2.id_class(an_3.class, ruw_3.id_class), rmE_2.id_class(an_3.class, ruw_3.id_break), rmE_2.id_class(an_3.class, ruw_3.id_case), rmE_2.id_class(an_3.class, ruw_3.id_implements), rmE_2.id_class(an_3.class, ruw_3.id_implements), rmE_2.id_class(an_3.class, ruw_3.id_implements), rmE_2.id_class(an_3.class, ruw_3.id_super)};
      id_case = var0;
   }

   public void K() {
      if (this.BP()) {
         this.Bn();
      }

      if (this.Pm()) {
         this.BH();
      }

   }

   public void id_case(int var1) {
      int var2 = var1 * 20;
      if (this instanceof iB_2) {
         var2 = aM_2.id_class((iB_2)this, var2);
      }

      if ((Integer)this.id_throws[42] < var2) {
         this.id_protected(var2);
      }

   }

   public void id_case(float var1, float var2) {
      Float var7 = var1 % 360.0F;
      this.id_throws[15] = var7;
      Float var8 = var2 % 360.0F;
      this.id_throws[16] = var8;
   }

   public static void id_case(double var0) {
      Double var6 = var0;
      id_case[4] = var6;
   }

   public rfl_3 id_case(iM_2 var1) {
      ap_3 var2 = this.a_(var1);
      float var3 = var2.id_class / 2.0F;
      rjU_2 var4 = new rjU_2(this.rx() - (double)var3, this.re(), this.BO() - (double)var3);
      rjU_2 var5 = new rjU_2(this.rx() + (double)var3, this.re() + (double)var2.id_break, this.BO() + (double)var3);
      return new rfl_3(var4, var5);
   }

   public boolean id_case(an_3 var1) {
      return this.Bh().size() < 1 ? true : false;
   }

   public rcd_3 id_case(rcd_3 var1) {
      try {
         if ((an_3)this.id_throws[5] != null) {
            String var10001 = id_class[5];
            double[] var10003 = new double[3];
            var10003[0] = ((an_3)this.id_throws[5]).rx();
            var10003[1] = this.re();
            var10003[2] = ((an_3)this.id_throws[5]).BO();
            var1.id_class(var10001, this.id_class(var10003));
         } else {
            String var14 = id_class[6];
            double[] var17 = new double[3];
            var17[0] = this.rx();
            var17[1] = this.re();
            var17[2] = this.BO();
            var1.id_class(var14, this.id_class(var17));
         }

         rjU_2 var2 = this.rv();
         String var15 = id_class[7];
         double[] var18 = new double[3];
         var18[0] = var2.id_break;
         var18[1] = var2.id_byte;
         var18[2] = var2.id_protected;
         var1.id_class(var15, this.id_class(var18));
         var15 = id_class[8];
         float[] var19 = new float[2];
         var19[0] = (Float)this.id_throws[15];
         var19[1] = (Float)this.id_throws[16];
         var1.id_class(var15, this.id_class(var19));
         var1.id_class(id_class[9], (Float)this.id_throws[31]);
         var1.id_class(id_class[10], (short)(Integer)this.id_throws[42]);
         var1.id_class(id_class[11], (short)this.PA());
         var1.id_class(id_class[12], (Boolean)this.id_throws[20]);
         var1.id_class(id_class[13], (Boolean)this.id_throws[62]);
         var1.id_break(id_class[14], (Integer)this.id_throws[58]);
         var1.id_class(id_class[15], this.ro());
         rgP_2 var9 = this.rD();
         if (var9 != null) {
            var1.id_class(id_class[16], rgB_2.id_class(var9));
         }

         if (this.D()) {
            var1.id_class(id_class[17], this.D());
         }

         if (this.BF()) {
            var1.id_class(id_class[18], this.BF());
         }

         if (this.rw()) {
            var1.id_class(id_class[19], this.rw());
         }

         if ((Boolean)this.id_throws[65]) {
            var1.id_class(id_class[20], (Boolean)this.id_throws[65]);
         }

         if (!((Set)this.id_throws[66]).isEmpty()) {
            rcy_3 var10 = new rcy_3();

            for(String var6 : (Set)this.id_throws[66]) {
               var10.add(rca_3.id_class(var6));
            }

            var1.id_class(id_class[21], var10);
         }

         this.id_class(var1);
         if (this.BP()) {
            rcy_3 var11 = new rcy_3();

            for(an_3 var13 : this.Bh()) {
               rcd_3 var7 = new rcd_3();
               if (var13.id_protected(var7)) {
                  var11.add(var7);
               }
            }

            if (!var11.isEmpty()) {
               var1.id_class(id_class[22], var11);
            }
         }

         return var1;
      } catch (Throwable var8) {
         KY var3 = KY.id_class(var8, id_class[23]);
         Ko_1 var4 = var3.id_class(id_class[24]);
         this.id_class(var4);
         throw new KU(var3);
      }
   }

   public void id_case(double var1, double var3, double var5) {
      rYB var8 = (rYB)this.id_throws[7];
      if (var8 instanceof rrEm_1 var7) {
         this.id_class(var1, var3, var5, (Float)this.id_throws[15], (Float)this.id_throws[16]);
         this.Bu().forEach((var1x) -> {
            var7.id_byte(var1x);
            Boolean var8 = true;
            var1x.id_throws[67] = var8;

            for(an_3 var3 : (List)var1x.id_throws[3]) {
               var1x.id_class(var3, an_3::id_private);
            }

         });
      }

   }

   public static double id_case(rjU_2 var0) {
      return var0.id_break * var0.id_break + var0.id_protected * var0.id_protected;
   }

   public float id_case(float var1) {
      return var1 == 1.0F ? (Float)this.id_throws[16] : rfU_2.id_catch(var1, (Float)this.id_throws[18], (Float)this.id_throws[16]);
   }

   public void id_const() {
      if ((an_3)this.id_throws[5] != null) {
         an_3 var1 = (an_3)this.id_throws[5];
         Object var6 = null;
         this.id_throws[5] = var6;
         var1.id_package(this);
      }

   }

   public rjU_2 id_continue(float var1) {
      return this.id_catch(this.id_case(var1), this.id_throws(var1));
   }

   private static void id_continue() {
      id_extends = new long[1];
   }

   public boolean id_continue(an_3 var1) {
      return this == var1 ? true : false;
   }

   public boolean id_else(an_3 var1) {
      for(an_3 var3 : this.Bh()) {
         if (var3.equals(var1)) {
            return true;
         }

         if (var3.id_else(var1)) {
            return true;
         }
      }

      return false;
   }

   public void id_implements(double var1, double var3, double var5) {
      this.id_byte(this.rv().id_break(var1, var3, var5));
      Boolean var11 = true;
      this.id_throws[57] = var11;
   }

   public void id_implements(int var1) {
      Integer var6 = var1;
      this.id_throws[1] = var6;
   }

   public boolean id_implements(String var1) {
      return ((Set)this.id_throws[66]).size() < 1024 && ((Set)this.id_throws[66]).add(var1) ? true : false;
   }

   public void id_implements(boolean var1) {
      Boolean var6 = var1;
      this.id_throws[65] = var6;
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_break(6, (Boolean)this.id_throws[65]);
      }

   }

   public float id_implements(an_3 var1) {
      float var2 = (float)(this.rx() - var1.rx());
      float var3 = (float)(this.re() - var1.re());
      float var4 = (float)(this.BO() - var1.BO());
      return rfU_2.id_byte(var2 * var2 + var3 * var3 + var4 * var4);
   }

   private static void id_implements() {
      id_implements = new boolean[]{true, false, true, false, false, false, false, false, true, false, true, false, false, true, true, false, true, true, false, true, false, false, true, false, true, false, false, true, false, false, false, false, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, false, true, false, false, true, false, false, false, true, false, true, false, true, false, true, false, true, false, true, true, false, false, false, false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, false, false, true, false, true, false, false, false, true, false, false, false, false, true, false, true, false, true, false, true, false, true, false, true, true, false, true, true, false, false, true, false, false, true, false, true, false, true, false, true, true, true, true, false, true, false, true, false, false, false, true, false, true, false, true, true, true, true, false, true, true, true, false, true, false, true, false, true, false, false, true, true, false, true, true, false, true, false, true, false, true, true, false, false, true, false, true, true, false, true, false, true, false, false, false, false, false, true, false, true, false, false, true, true, true, false, true, false, true, true, false, true, false, true, false, true, false, true, true, false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
   }

   public void id_implements(float var1) {
   }

   public rjK_2 id_import() {
      return new rjK_2((Float)this.id_throws[16], (Float)this.id_throws[15]);
   }

   private static void id_instanceof() {
      id_private = new byte[]{2, 3, 2, 6, 4, 20, 15, 20, 3, 2, 3, 2, 3, 2, 2, 6, 6, 5, 2, 2, 8, 9, 8, 60, 4, 53, 3, 3, 4, 4, 6, 5, 5, -1, 8, 5, 2, 3, 4, 7, 2, 3, 4, 5, 6, 3, 3, 2, 3, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 78, 2, 4, 6, 8, 9, 10, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 45, 47, 48, 50, 51, 52, 53, 54, 56, 57, 58, 59, 60, 62, 65, 67, 69, 71, 72, 73, 75, 76, 12, 4};
   }

   public void id_new(boolean var1) {
      rjU_2 var2 = this.rv();
      double var3;
      if (var1) {
         var3 = Math.max(-0.3, var2.id_byte - 0.03);
      } else {
         var3 = Math.min(0.7, var2.id_byte + 0.06);
      }

      this.id_catch(var2.id_break, var3, var2.id_protected);
      Float var9 = 0.0F;
      this.id_throws[31] = var9;
   }

   public rjU_2 id_new(float var1) {
      if (var1 == 1.0F) {
         return new rjU_2(this.rx(), this.rH(), this.BO());
      } else {
         double var2 = rfU_2.id_protected((double)var1, (Double)this.id_throws[8], this.rx());
         double var4 = rfU_2.id_protected((double)var1, (Double)this.id_throws[9], this.re()) + (double)this.Bx();
         double var6 = rfU_2.id_protected((double)var1, (Double)this.id_throws[10], this.BO());
         return new rjU_2(var2, var4, var6);
      }
   }

   public boolean id_new(an_3 var1) {
      return !this.h() && (Integer)this.id_throws[4] <= 0 ? true : false;
   }

   private boolean id_new() {
      return ((rYB)this.id_throws[7]).id_byte(this.Bs()).id_class(xu_3.hM);
   }

   public void id_new(double var1, double var3, double var5) {
      this.id_volatile(var1, var3, var5);
      this.id_class(((ap_3)this.id_throws[70]).id_class(var1, var3, var5));
   }

   public void id_package(double var1, double var3, double var5) {
      double var7 = rfU_2.id_class(var1, (double)-3.0E7F, (double)3.0E7F);
      double var9 = rfU_2.id_class(var5, (double)-3.0E7F, (double)3.0E7F);
      Double var15 = var7;
      this.id_throws[8] = var15;
      Double var16 = var3;
      this.id_throws[9] = var16;
      Double var17 = var9;
      this.id_throws[10] = var17;
      this.id_new(var7, var3, var9);
   }

   private static void id_package() {
      id_catch = new int[]{16777215};
   }

   public void id_package(boolean var1) {
      this.id_break(5, var1);
   }

   public void id_package(an_3 var1) {
      if (var1.ra() == this) {
         throw new IllegalStateException(id_class[50]);
      } else {
         ((List)this.id_throws[3]).remove(var1);
         Integer var6 = 60;
         var1.id_throws[4] = var6;
      }
   }

   public float id_package(float var1) {
      QY var2 = QY.id_instanceof();
      return this == (cb_3)var2.id_class[57] ? ((Hh_1)var2.id_class[16]).id_finally().id_class(var1) : this.Bm();
   }

   public boolean id_return(an_3 var1) {
      return this.PO() == var1.PO() ? true : false;
   }

   private void id_super() {
      Boolean var14 = this.id_class((rlb_3)rlG_2.id_break);
      this.id_throws[45] = var14;
      Object var15 = null;
      this.id_throws[46] = var15;
      double var1 = this.rH() - (double)0.11111111F;
      an_3 var3 = this.ra();
      if (var3 instanceof rSK var4) {
         if (!var4.W() && var4.rN().id_throws >= var1 && var4.rN().id_break <= var1) {
            return;
         }
      }

      rfH_2 var17 = new rfH_2(this.rx(), var1, this.BO());
      rXE var5 = ((rYB)this.id_throws[7]).id_break(var17);

      for(rlb_3 var7 : rlG_2.id_class()) {
         if (var5.id_class(var7)) {
            double var8 = (double)((float)var17.c_() + var5.id_class((rYB)this.id_throws[7], var17));
            if (var8 > var1) {
               this.id_throws[46] = var7;
            }

            return;
         }
      }

   }

   public boolean id_super(an_3 var1) {
      return var1.PU() && !this.id_return(var1) ? true : false;
   }

   private static void id_throw() {
      id_class = new String[]{new String("Checking entity block collision"), new String("Entity being checked for collision"), new String("Colliding entity with block"), new String("Block being collided with"), new String("id"), new String("Pos"), new String("Pos"), new String("Motion"), new String("Rotation"), new String("FallDistance"), new String("Fire"), new String("Air"), new String("OnGround"), new String("Invulnerable"), new String("PortalCooldown"), new String("UUID"), new String("CustomName"), new String("CustomNameVisible"), new String("Silent"), new String("NoGravity"), new String("Glowing"), new String("Tags"), new String("Passengers"), new String("Saving entity NBT"), new String("Entity being saved"), new String("Pos"), new String("Motion"), new String("Rotation"), new String("FallDistance"), new String("Fire"), new String("Air"), new String("OnGround"), new String("Invulnerable"), new String("PortalCooldown"), new String("UUID"), new String("UUID"), new String("CustomName"), new String("CustomName"), new String("Failed to parse entity custom name {}"), new String("CustomNameVisible"), new String("Silent"), new String("NoGravity"), new String("Glowing"), new String("Tags"), new String("Tags"), new String("Entity has invalid rotation"), new String("Entity has invalid position"), new String("Loading entity NBT"), new String("Entity being loaded"), new String("Use x.startRiding(y), not y.addPassenger(x)"), new String("Use x.stopRiding(y), not y.removePassenger(x)"), new String("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]"), new String("~NULL~"), new String("Dimension"), new String("Entity Type"), new String("Entity ID"), new String("Entity Name"), new String("Entity's Exact location"), new String("%.2f, %.2f, %.2f"), new String("Entity's Block location"), new String("Entity's Momentum"), new String("%.2f, %.2f, %.2f"), new String("Entity's Passengers"), new String("Entity's Vehicle")};
   }

   private static void id_while() {
      id_protected = new float[]{1.0F, 1.0F, 0.0F, 360.0F, 360.0F, 1.0F, 0.5F, 4.0F, 0.35F, 0.4F, 1.0F, 1.0F, 0.7F, 1.6F, 0.4F, 0.0F, 0.0F, 0.15F, 1.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.9F, 1.0F, 1.0F, 1.0F, 0.4F, 1.0F, 0.4F, 1.0F, 20.0F, 1.0F, 1.0F, 20.0F, 1.0F, ((float)Math.PI / 180F), ((float)Math.PI / 180F), 0.0F, 360.0F, -90.0F, 90.0F, 360.0F, 2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, ((float)Math.PI / 180F), ((float)Math.PI / 180F), 90.0F, 1.0F, 1.0F, 0.0F, 0.8F, 0.0F, 5.0F, 0.0F, 0.2F, 0.1F, 0.0F, 2.0F, 0.85F, 0.4F, 180.0F, 270.0F, 90.0F, 180.0F, ((float)Math.PI / 180F), ((float)Math.PI / 180F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public Iterable<rdn_3> rs() {
      return (List)id_case[2];
   }

   public rjU_2 id_protected(rjU_2 var1) {
      if (var1.id_catch() <= 1.0E-7) {
         return var1;
      } else {
         long var2 = ((rYB)this.id_throws[7]).r();
         if (var2 != (Long)this.id_throws[69]) {
            Arrays.fill((double[])this.id_throws[68], (double)0.0F);
            Long var10 = var2;
            this.id_throws[69] = var10;
         }

         if (var1.id_break != (double)0.0F) {
            double var12 = this.id_class(rpB_2.X, var1.id_break);
            return Math.abs(var12) <= (double)1.0E-5F ? rjU_2.id_class : new rjU_2(var12, (double)0.0F, (double)0.0F);
         } else if (var1.id_byte != (double)0.0F) {
            double var11 = this.id_class(rpB_2.Y, var1.id_byte);
            return Math.abs(var11) <= (double)1.0E-5F ? rjU_2.id_class : new rjU_2((double)0.0F, var11, (double)0.0F);
         } else if (var1.id_protected != (double)0.0F) {
            double var4 = this.id_class(rpB_2.Z, var1.id_protected);
            return Math.abs(var4) <= (double)1.0E-5F ? rjU_2.id_class : new rjU_2((double)0.0F, (double)0.0F, var4);
         } else {
            return rjU_2.id_class;
         }
      }
   }

   public boolean id_protected(iM_2 var1) {
      return ((rYB)this.id_throws[7]).a_(this, this.id_case(var1).id_break(1.0E-7));
   }

   public double id_protected(an_3 var1) {
      double var2;
      double var4;
      double var6;
      if (var1 instanceof cM_2 var8) {
         double var9 = var1.rx();
         double var11 = var1.re();
         double var13 = var1.BO();
         double var15 = (Double)var8.id_break[9];
         double var17 = (Double)var8.id_break[10];
         double var19 = (Double)var8.id_break[11];
         rjU_2 var21 = this.Ps();
         double var22 = var21.id_byte(var9, var11, var13);
         double var24 = var21.id_byte(var15, var17, var19);
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
      double var10 = rfU_2.id_class(this.re() + (double)this.id_byte(this.Pb()) - var4, (double)0.0F, (double)var1.Bm());
      double var12 = rfU_2.id_class(this.rx() - var2, -var26, var26);
      double var14 = rfU_2.id_class(this.BO() - var6, -var26, var26);
      return this.id_new(1.0F).id_byte(var2 + var12, var4 + var10, var6 + var14);
   }

   public boolean id_protected(rcd_3 var1) {
      String var2 = this.rW();
      if (!(Boolean)this.id_throws[27] && var2 != null) {
         var1.id_class(id_class[4], var2);
         this.id_case(var1);
         return true;
      } else {
         return false;
      }
   }

   public void id_protected(int var1) {
      Integer var6 = var1;
      this.id_throws[42] = var6;
   }

   public void id_protected(rfH_2 var1) {
      if (this.rZ()) {
         this.rc();
      } else {
         if (!((rYB)this.id_throws[7]).id_continue && !var1.equals((rfH_2)this.id_throws[61])) {
            rfH_2 var6 = var1.id_int();
            this.id_throws[61] = var6;
         }

         Boolean var7 = true;
         this.id_throws[59] = var7;
      }

   }

   public rjU_2 id_protected(float var1, float var2) {
      return this.id_catch(var2, var1);
   }

   public void id_protected(double var1, double var3, double var5) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         rfH_2 var7 = new rfH_2(var1, var3, var5);
         rjU_2 var8 = new rjU_2(var1 - (double)var7.b_(), var3 - (double)var7.c_(), var5 - (double)var7.d_());
         rfw_3 var9 = new rfw_3();
         rpr_3 var10 = rpr_3.UP;
         double var11 = Double.MAX_VALUE;
         rpr_3[] var10000 = new rpr_3[5];
         var10000[0] = rpr_3.NORTH;
         var10000[1] = rpr_3.SOUTH;
         var10000[2] = rpr_3.WEST;
         var10000[3] = rpr_3.EAST;
         var10000[4] = rpr_3.UP;
         rpr_3[] var13 = var10000;
         int var14 = var13.length;

         for(int var15 = false; var15 < var14; ++var15) {
            rpr_3 var16 = var13[var15];
            var9.id_class(var7, var16);
            if (!((rYB)this.id_throws[7]).id_byte(var9).id_new((rYB)this.id_throws[7], var9)) {
               double var17 = var8.id_class(var16.id_final());
               double var19 = var16.id_throws() == rpG_2.POSITIVE ? (double)1.0F - var17 : var17;
               if (var19 < var11) {
                  var11 = var19;
                  var10 = var16;
               }
            }
         }

         float var21 = ((Random)this.id_throws[40]).nextFloat() * 0.2F + 0.1F;
         float var22 = (float)var10.id_throws().id_class();
         rjU_2 var23 = this.rv().id_class((double)0.75F);
         if (var10.id_final() == rpB_2.X) {
            this.id_catch((double)(var22 * var21), var23.id_byte, var23.id_protected);
         } else if (var10.id_final() == rpB_2.Y) {
            this.id_catch(var23.id_break, (double)(var22 * var21), var23.id_protected);
         } else if (var10.id_final() == rpB_2.Z) {
            this.id_catch(var23.id_break, var23.id_byte, (double)(var22 * var21));
         }

      }
   }

   public double id_protected(double var1) {
      return this.id_throws(((double)2.0F * ((Random)this.id_throws[40]).nextDouble() - (double)1.0F) * var1);
   }

   public void id_private(boolean var1) {
      rjU_2 var2 = this.rv();
      double var3;
      if (var1) {
         var3 = Math.max(-0.9, var2.id_byte - 0.03);
      } else {
         var3 = Math.min(1.8, var2.id_byte + 0.1);
      }

      this.id_catch(var2.id_break, var3, var2.id_protected);
   }

   public float id_private(float var1, float var2) {
      return var2 == 1.0F ? var1 : rfU_2.id_catch(var2, (Float)this.id_throws[18], var1);
   }

   public boolean id_private(String var1) {
      return ((Set)this.id_throws[66]).remove(var1);
   }

   public void id_private(float var1) {
      this.id_class(this.BB(), var1, 1.0F + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.4F);
   }

   public void id_private(int var1) {
      Integer var6 = var1;
      this.id_throws[73] = var6;
   }

   public void id_private(double var1, double var3, double var5) {
      this.id_class(var1, var3, var5, (Float)this.id_throws[15], (Float)this.id_throws[16]);
   }

   public float id_private(an_3 var1) {
      float var2 = (float)(this.rx() - var1.rx());
      float var3 = (float)(this.BO() - var1.BO());
      return rfU_2.id_byte(var2 * var2 + var3 * var3);
   }

   private void id_abstract() {
      if (this.id_throws == null) {
         this.id_throws = new Object[78];
         Object[] var1 = this.id_throws;
         var1[1] = Integer.valueOf(0);
         var1[2] = false;
         var1[4] = Integer.valueOf(0);
         var1[6] = false;
         var1[8] = (double)0.0F;
         var1[9] = (double)0.0F;
         var1[10] = (double)0.0F;
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
         var1[34] = (double)0.0F;
         var1[35] = (double)0.0F;
         var1[36] = (double)0.0F;
         var1[37] = 0.0F;
         var1[38] = false;
         var1[39] = 0.0F;
         var1[41] = Integer.valueOf(0);
         var1[42] = Integer.valueOf(0);
         var1[43] = false;
         var1[45] = false;
         var1[47] = Integer.valueOf(0);
         var1[48] = false;
         var1[50] = false;
         var1[51] = Integer.valueOf(0);
         var1[52] = Integer.valueOf(0);
         var1[53] = Integer.valueOf(0);
         var1[54] = false;
         var1[56] = false;
         var1[57] = false;
         var1[58] = Integer.valueOf(0);
         var1[59] = false;
         var1[60] = Integer.valueOf(0);
         var1[62] = false;
         var1[65] = false;
         var1[67] = false;
         var1[69] = id_extends[0];
         var1[71] = 0.0F;
         var1[72] = 0.0F;
         var1[73] = Integer.valueOf(0);
         var1[75] = false;
         var1[76] = false;
      }

   }

   private static void id_final() {
      id_finally = new double[]{(double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)256.0F, (double)1.0F, (double)-64.0F, 1.0E-7, 1.0E-7, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, 0.6, 0.6, (double)0.2F, (double)0.2F, (double)1.0F, 0.001, 1.0E-7, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.2F, (double)1.0F, (double)1.0F, 0.5000001, 1.0E-7, (double)0.0F, (double)0.0F, (double)1.0E-5F, (double)0.0F, (double)0.0F, (double)0.0F, (double)1.0E-5F, (double)0.0F, (double)0.0F, (double)0.0F, (double)1.0E-5F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, 1.0E-7, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)2.0F, (double)2.0F, 0.001, 0.001, 0.001, 0.001, 0.001, 0.001, (double)0.0F, 0.007, 0.0023333333333333335, 0.014, (double)0.11111111F, (double)0.2F, (double)0.2F, (double)0.25F, (double)2.0F, (double)1.0F, (double)2.0F, (double)1.0F, (double)0.2F, (double)2.0F, (double)1.0F, (double)2.0F, (double)1.0F, (double)0.2F, (double)0.5F, 0.1, (double)0.5F, (double)-4.0F, (double)1.5F, (double)-4.0F, (double)0.0F, 1.0E-7, (double)1.0F, (double)0.0F, (double)-3.0E7F, (double)3.0E7F, (double)-3.0E7F, (double)3.0E7F, (double)0.5F, (double)0.5F, (double)0.0F, (double)0.5F, (double)0.5F, (double)0.5F, (double)0.0F, (double)1.0F, (double)-0.5F, (double)0.5F, (double)-0.5F, (double)0.5F, (double)0.01F, (double)1.0F, (double)1.0F, (double)1.0F, (double)0.05F, (double)0.05F, (double)0.0F, (double)0.0F, (double)1.0F, (double)64.0F, (double)10.0F, (double)0.0F, (double)10.0F, (double)0.0F, (double)10.0F, (double)0.0F, (double)0.1F, (double)0.0F, (double)0.75F, 1.0E-7, 1.0E-7, 1.0E-7, -0.9, 0.03, 1.8, 0.1, -0.3, 0.03, 0.7, 0.06, Double.MAX_VALUE, (double)1.0F, (double)0.75F, (double)-2.9999872E7F, (double)16.0F, (double)-2.9999872E7F, (double)16.0F, (double)2.9999872E7F, (double)16.0F, (double)2.9999872E7F, (double)16.0F, (double)0.5F, (double)0.5F, (double)2.0F, (double)0.0F, (double)0.0F, (double)1.0E-5F, (double)2.0F, (double)0.0F, 0.001, (double)0.0F, 0.4, (double)0.0F, (double)1.0F, 0.003, 0.003, 0.0045000000000000005, 0.0045000000000000005, 0.4, (double)0.0F, 0.4, (double)2.0F, (double)1.0F, (double)2.0F, (double)1.0F, (double)0.0F, 0.7, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F};
   }

   public boolean id_final(double var1, double var3, double var5) {
      double var7 = this.rx() - var1;
      double var9 = this.re() - var3;
      double var11 = this.BO() - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.id_class(var13);
   }

   public void id_final(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[8], var1);
   }

   public float id_final(float var1) {
      return 0.0F;
   }

   public boolean id_final(an_3 var1) {
      return this.id_class(var1.BG());
   }

   public void id_volatile(boolean var1) {
      this.id_break(true, var1);
   }

   public void id_volatile(an_3 var1) {
   }

   public rjU_2 id_volatile(float var1) {
      return this.id_new(var1);
   }

   public void id_volatile(double var1, double var3, double var5) {
      if (((rjU_2)this.id_throws[11]).id_break != var1 || ((rjU_2)this.id_throws[11]).id_byte != var3 || ((rjU_2)this.id_throws[11]).id_protected != var5) {
         rjU_2 var14 = new rjU_2(var1, var3, var5);
         this.id_throws[11] = var14;
         int var7 = rfU_2.id_byte(var1);
         int var8 = rfU_2.id_byte(var3);
         int var9 = rfU_2.id_byte(var5);
         if (var7 != ((rfH_2)this.id_throws[12]).b_() || var8 != ((rfH_2)this.id_throws[12]).c_() || var9 != ((rfH_2)this.id_throws[12]).d_()) {
            rfH_2 var15 = new rfH_2(var7, var8, var9);
            this.id_throws[12] = var15;
         }

         Boolean var16 = true;
         this.id_throws[54] = var16;
      }

   }

   public boolean id_synchronized(an_3 var1) {
      for(an_3 var3 : this.Bh()) {
         if (var3.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public int id_synchronized() {
      return false;
   }

   public void id_native(boolean var1) {
      this.id_break(4, var1);
   }

   public void id_native(an_3 var1) {
      this.id_class(var1.rx(), var1.re(), var1.BO(), (Float)var1.id_throws[15], (Float)var1.id_throws[16]);
   }

   public void id_native(double var1, double var3, double var5) {
      this.id_volatile(var1, var3, var5);
      Double var11 = var1;
      this.id_throws[8] = var11;
      Double var12 = var3;
      this.id_throws[9] = var12;
      Double var13 = var5;
      this.id_throws[10] = var13;
      Double var14 = var1;
      this.id_throws[34] = var14;
      Double var15 = var3;
      this.id_throws[35] = var15;
      Double var16 = var5;
      this.id_throws[36] = var16;
   }

   public void id_native(float var1) {
   }

   public boolean id_native() {
      return false;
   }

   public rfH_2 PI() {
      return new rfH_2(((rjU_2)this.id_throws[11]).id_break, this.rN().id_break - 0.5000001, ((rjU_2)this.id_throws[11]).id_protected);
   }

   public int rp() {
      return 3;
   }

   public float rl() {
      float var1 = ((rYB)this.id_throws[7]).id_byte(this.Bs()).id_break().id_int();
      float var2 = ((rYB)this.id_throws[7]).id_byte(this.PI()).id_break().id_int();
      return (double)var1 == (double)1.0F ? var2 : var1;
   }

   public void A() {
      this.id_byte(rjU_2.id_class);
      this.id_this();
      if (this.Pm()) {
         this.ra().id_catch(this);
      }

   }

   public boolean rw() {
      return (Boolean)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[10]);
   }

   public boolean rg() {
      return (Boolean)this.id_throws[62];
   }

   public int ru() {
      return (Integer)this.id_throws[42];
   }

   public boolean T() {
      return this.Pz() && !this.id_native() ? true : false;
   }

   public UUID ro() {
      return (UUID)this.id_throws[63];
   }

   public double re() {
      return ((rjU_2)this.id_throws[11]).id_byte;
   }

   public aI_2<?> BC() {
      return (aI_2)this.id_throws[0];
   }

   public rjU_2 rr() {
      return (rjU_2)this.id_throws[11];
   }

   public rjU_2 rm() {
      return (rjU_2)this.id_throws[55];
   }

   public float rq() {
      xd_3 var1 = ((rYB)this.id_throws[7]).id_byte(this.Bs()).id_break();
      float var2 = var1.id_package();
      if (var1 != xu_3.id_try && var1 != xu_3.hM) {
         return (double)var2 == (double)1.0F ? ((rYB)this.id_throws[7]).id_byte(this.PI()).id_break().id_package() : var2;
      } else {
         return var2;
      }
   }

   public void rc() {
      Integer var5 = this.rj();
      this.id_throws[58] = var5;
   }

   public int ri() {
      return 300;
   }

   public boolean PM() {
      ((Object2DoubleMap)this.id_throws[44]).clear();
      this.rd();
      double var1 = ((rYB)this.id_throws[7]).id_default().id_protected() ? 0.007 : 0.0023333333333333335;
      boolean var3 = this.id_class(rlG_2.id_byte, var1);
      return !this.rT() && !var3 ? false : true;
   }

   public an_3 ra() {
      return (an_3)this.id_throws[5];
   }

   public boolean PZ() {
      return !this.rT() && !this.ry() ? false : true;
   }

   public boolean Pm() {
      return this.ra() != null ? true : false;
   }

   public boolean ry() {
      return !(Boolean)this.id_throws[48] && ((Object2DoubleMap)this.id_throws[44]).getDouble(rlG_2.id_byte) > (double)0.0F ? true : false;
   }

   public gy_3 PL() {
      return new gy_3(this, this.Ps(), this.id_import(), (rYB)this.id_throws[7] instanceof rrEm_1 ? (rrEm_1)((rYB)this.id_throws[7]) : null, this.id_synchronized(), this.g().getString(), this.L_(), ((rYB)this.id_throws[7]).id_const(), this);
   }

   public boolean PJ() {
      return false;
   }

   public PX rO() {
      return new PX((Float)this.id_throws[15], (Float)this.id_throws[16]);
   }

   public float rQ() {
      return (float)((int)(Float)this.id_throws[30] + 1);
   }

   public iM_2 Pb() {
      return (iM_2)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[11]);
   }

   public boolean Pk() {
      return !this.rT() && !this.id_int() && !this.id_new() ? false : true;
   }

   public void Pn() {
      if (this.Pm() && (Boolean)this.ra().id_throws[27]) {
         this.BH();
      }

      if ((Integer)this.id_throws[4] > 0) {
         Integer var5 = (Integer)this.id_throws[4] - 1;
         this.id_throws[4] = var5;
      }

      rjU_2 var6 = (rjU_2)this.id_throws[14];
      this.id_throws[13] = var6;
      Float var7 = (Float)this.id_throws[29];
      this.id_throws[28] = var7;
      Float var8 = (Float)this.id_throws[16];
      this.id_throws[18] = var8;
      Float var9 = (Float)this.id_throws[15];
      this.id_throws[17] = var9;
      this.PB();
      if (this.B()) {
         this.Bb();
      }

      this.PM();
      this.id_super();
      this.p();
      if (((rYB)this.id_throws[7]).id_continue) {
         this.rE();
      } else if ((Integer)this.id_throws[42] > 0) {
         if (this.q()) {
            this.id_protected((Integer)this.id_throws[42] - 4);
            if ((Integer)this.id_throws[42] < 0) {
               this.rE();
            }
         } else {
            if ((Integer)this.id_throws[42] % 20 == 0 && !this.ry()) {
               this.id_break(rye_3.id_byte, 1.0F);
            }

            this.id_protected((Integer)this.id_throws[42] - 1);
         }
      }

      if (this.ry()) {
         this.rb();
         Float var10 = (Float)this.id_throws[31] * 0.5F;
         this.id_throws[31] = var10;
      }

      if (this.re() < (double)-64.0F) {
         this.PQ();
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_break(false, (Integer)this.id_throws[42] > 0 ? true : false);
      }

      Boolean var11 = false;
      this.id_throws[48] = var11;
   }

   public void PC() {
      rfl_3 var1 = this.rN();
      this.id_volatile((var1.id_class + var1.id_protected) / (double)2.0F, var1.id_break, (var1.id_byte + var1.id_case) / (double)2.0F);
   }

   public xc_3 Pl() {
      return ((rYB)this.id_throws[7]).id_byte(this.BS());
   }

   public int PA() {
      return (Integer)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[6]);
   }

   public boolean Pz() {
      boolean var1 = (rYB)this.id_throws[7] != null && ((rYB)this.id_throws[7]).id_continue ? true : false;
      return this.q() || (Integer)this.id_throws[42] <= 0 && (!var1 || !this.id_finally(false)) ? false : true;
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
      return this.id_finally(4);
   }

   public boolean Pp() {
      return this.id_finally(5);
   }

   public boolean Pq() {
      HashSet var1 = Sets.newHashSet();
      this.id_class(true, var1);
      return var1.size() == 1 ? true : false;
   }

   public rgy_3 rM() {
      return new rgy_3(rgp_3.id_byte, new rgq_3(this.BC(), this.ro(), this.g()));
   }

   public rnW_2 rC() {
      return ((rYB)this.id_throws[7]).id_const();
   }

   public boolean rB() {
      return false;
   }

   public boolean rG() {
      return false;
   }

   public void rL() {
      Boolean var5 = true;
      this.id_throws[76] = var5;
   }

   public Collection<an_3> PP() {
      HashSet var1 = Sets.newHashSet();

      for(an_3 var3 : this.Bh()) {
         var1.add(var3);
         var3.id_class(false, var1);
      }

      return var1;
   }

   public void PB() {
      rYB var2 = (rYB)this.id_throws[7];
      if (var2 instanceof rrEm_1 var1) {
         int var15 = this.rR();
         if ((Boolean)this.id_throws[59]) {
            rnW_2 var3 = var1.id_const();
            rqM_2 var4 = ((rYB)this.id_throws[7]).E() == rYB.id_protected ? rYB.id_byte : rYB.id_protected;
            rrEm_1 var5 = var3.id_class(var4);
            if (var5 != null && var3.id_interface() && !this.Pm()) {
               int var10002 = (Integer)this.id_throws[60];
               Integer var10 = var10002 + 1;
               this.id_throws[60] = var10;
               if (var10002 >= var15) {
                  Integer var11 = var15;
                  this.id_throws[60] = var11;
                  this.rc();
                  this.id_class(var5);
               }
            }

            Boolean var12 = false;
            this.id_throws[59] = var12;
         } else {
            if ((Integer)this.id_throws[60] > 0) {
               Integer var13 = (Integer)this.id_throws[60] - 4;
               this.id_throws[60] = var13;
            }

            if ((Integer)this.id_throws[60] < 0) {
               Integer var14 = Integer.valueOf(0);
               this.id_throws[60] = var14;
            }
         }

         this.a();
      }

   }

   public double Ph() {
      return this.id_byte(((Random)this.id_throws[40]).nextDouble());
   }

   public double Pv() {
      return (double)0.0F;
   }

   public boolean rk() {
      return this.h();
   }

   public boolean PF() {
      return this.id_finally(3);
   }

   public an_3 rU() {
      return null;
   }

   public rjU_2 Pt() {
      return new rjU_2((Double)this.id_throws[8], (Double)this.id_throws[9], (Double)this.id_throws[10]);
   }

   public float rX() {
      rfw_3 var1 = new rfw_3(this.rx(), (double)0.0F, this.BO());
      if (((rYB)this.id_throws[7]).id_int(var1)) {
         var1.b_(rfU_2.id_byte(this.rH()));
         return ((rYB)this.id_throws[7]).id_native(var1);
      } else {
         return 0.0F;
      }
   }

   public double rH() {
      return ((rjU_2)this.id_throws[11]).id_byte + (double)(Float)this.id_throws[71];
   }

   public boolean rZ() {
      return (Integer)this.id_throws[58] > 0 ? true : false;
   }

   public int rj() {
      return 300;
   }

   public rgP_2 rD() {
      return (rgP_2)((Optional)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[7])).orElse((Object)null);
   }

   public double PS() {
      return (double)((ap_3)this.id_throws[70]).id_break * (double)0.75F;
   }

   public rfl_3 PE() {
      return this.rN();
   }

   public int rV() {
      return true;
   }

   public void rE() {
      this.id_protected(false);
   }

   public boolean rP() {
      return this.Pb() == iM_2.SWIMMING ? true : false;
   }

   public String rz() {
      return (String)this.id_throws[64];
   }

   public String rW() {
      aI_2 var1 = this.BC();
      rqO_2 var2 = aI_2.id_class(var1);
      return var1.id_class() && var2 != null ? var2.toString() : null;
   }

   public double rI() {
      return (double)this.Bx() < 0.4 ? (double)0.0F : 0.4;
   }

   public int rR() {
      return false;
   }

   public String PG() {
      int var10000 = (int)this.rx();
      return "X: " + var10000 + " Y: " + (int)this.re() + " Z: " + (int)this.BO();
   }

   public an_3 PO() {
      an_3 var1;
      for(var1 = this; var1.Pm(); var1 = var1.ra()) {
      }

      return var1;
   }

   public rqL_2 Pr() {
      return rqL_2.NEUTRAL;
   }

   public void PX() {
      this.id_new(((rjU_2)this.id_throws[11]).id_break, ((rjU_2)this.id_throws[11]).id_byte, ((rjU_2)this.id_throws[11]).id_protected);
   }

   public rfl_3 rN() {
      return (rfl_3)this.id_throws[19];
   }

   public void rF() {
   }

   public void Px() {
      rfl_3 var1 = this.rN();
      rfH_2 var2 = new rfH_2(var1.id_class + 0.001, var1.id_break + 0.001, var1.id_byte + 0.001);
      rfH_2 var3 = new rfH_2(var1.id_protected - 0.001, var1.id_throws - 0.001, var1.id_case - 0.001);
      rfw_3 var4 = new rfw_3();
      if (((rYB)this.id_throws[7]).id_class(var2, var3)) {
         for(int var5 = var2.b_(); var5 <= var3.b_(); ++var5) {
            for(int var6 = var2.c_(); var6 <= var3.c_(); ++var6) {
               for(int var7 = var2.d_(); var7 <= var3.d_(); ++var7) {
                  var4.id_class(var5, var6, var7);
                  xc_3 var8 = ((rYB)this.id_throws[7]).id_byte(var4);

                  try {
                     var8.id_class((rYB)this.id_throws[7], var4, this);
                     this.id_class(var8);
                  } catch (Throwable var12) {
                     KY var10 = KY.id_class(var12, id_class[2]);
                     Ko_1 var11 = var10.id_class(id_class[3]);
                     Ko_1.id_class(var11, var4, var8);
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
      return this.rP() && !this.rT() ? true : false;
   }

   public double rx() {
      return ((rjU_2)this.id_throws[11]).id_break;
   }

   public void PQ() {
      this.PD();
   }

   public boolean Pu() {
      return !(Boolean)this.id_throws[27] ? true : false;
   }

   public boolean rT() {
      return (Boolean)this.id_throws[43];
   }

   public float PN() {
      return ((ap_3)this.id_throws[70]).id_class;
   }

   public rpr_3 rS() {
      return this.Pg();
   }

   public int rK() {
      rnM_2 var1 = this.BG();
      return var1 != null && var1.id_volatile().id_protected() != null ? var1.id_volatile().id_protected() : id_catch[0];
   }

   public int BN() {
      return (Integer)this.id_throws[73];
   }

   public Iterable<rdn_3> PV() {
      return (List)id_case[2];
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
      return !this.Bh().isEmpty() ? true : false;
   }

   public void Bn() {
      for(int var1 = ((List)this.id_throws[3]).size() - 1; var1 >= 0; --var1) {
         ((an_3)((List)this.id_throws[3]).get(var1)).BH();
      }

   }

   public rqA_2 BB() {
      return rqn_3.SU;
   }

   public rmE_2 BQ() {
      return (rmE_2)this.id_throws[49];
   }

   public boolean BZ() {
      return true;
   }

   public boolean BF() {
      return (Boolean)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[9]);
   }

   public double BO() {
      return ((rjU_2)this.id_throws[11]).id_protected;
   }

   public boolean Pa() {
      return !this.rT() && !this.id_new() ? false : true;
   }

   public boolean BM() {
      return !(Boolean)this.id_throws[27] ? true : false;
   }

   public List<an_3> Bh() {
      return (List<an_3>)(((List)this.id_throws[3]).isEmpty() ? Collections.emptyList() : Lists.newArrayList((List)this.id_throws[3]));
   }

   public rqA_2 BJ() {
      return rqn_3.SD;
   }

   public boolean Bk() {
      return ((Optional)((rmE_2)this.id_throws[49]).id_class((rut_3)id_case[7])).isPresent();
   }

   public rfH_2 Bs() {
      return (rfH_2)this.id_throws[12];
   }

   public void Bb() {
      int var1 = rfU_2.id_byte(this.rx());
      int var2 = rfU_2.id_byte(this.re() - (double)0.2F);
      int var3 = rfU_2.id_byte(this.BO());
      rfH_2 var4 = new rfH_2(var1, var2, var3);
      xc_3 var5 = ((rYB)this.id_throws[7]).id_byte(var4);
      if (var5.id_private() != xN_2.INVISIBLE) {
         rjU_2 var6 = this.rv();
         ((rYB)this.id_throws[7]).id_class(new rLX(rLQ.id_protected, var5), this.rx() + (((Random)this.id_throws[40]).nextDouble() - (double)0.5F) * (double)((ap_3)this.id_throws[70]).id_class, this.re() + 0.1, this.BO() + (((Random)this.id_throws[40]).nextDouble() - (double)0.5F) * (double)((ap_3)this.id_throws[70]).id_class, var6.id_break * (double)-4.0F, (double)1.5F, var6.id_protected * (double)-4.0F);
      }

   }

   public rpr_3 Pg() {
      return rpr_3.id_class((double)(Float)this.id_throws[15]);
   }

   public float Bm() {
      return ((ap_3)this.id_throws[70]).id_break;
   }

   public boolean Bl() {
      return false;
   }

   public void BH() {
      this.id_const();
   }

   public static double Br() {
      return (Double)id_case[4];
   }

   public rjU_2 BA() {
      return new rjU_2((double)0.0F, (double)this.Bx(), (double)(this.PN() * 0.4F));
   }

   public Stream<an_3> Bu() {
      return Stream.concat(Stream.of(this), ((List)this.id_throws[3]).stream().flatMap(an_3::Bu));
   }

   public rjU_2 BX() {
      return (rjU_2)this.id_throws[13];
   }

   public rfH_2 BS() {
      int var1 = rfU_2.id_byte(((rjU_2)this.id_throws[11]).id_break);
      int var2 = rfU_2.id_byte(((rjU_2)this.id_throws[11]).id_byte - (double)0.2F);
      int var3 = rfU_2.id_byte(((rjU_2)this.id_throws[11]).id_protected);
      rfH_2 var4 = new rfH_2(var1, var2, var3);
      if (((rYB)this.id_throws[7]).id_byte(var4).id_catch()) {
         rfH_2 var5 = var4.id_break();
         xc_3 var6 = ((rYB)this.id_throws[7]).id_byte(var5);
         xd_3 var7 = var6.id_break();
         if (var7.id_class(rls_3.id_default) || var7.id_class(rls_3.id_abstract) || var7 instanceof dq_3) {
            return var5;
         }
      }

      return var4;
   }

   public boolean Pj() {
      return (rlb_3)this.id_throws[46] != rlG_2.id_break && (rlb_3)this.id_throws[46] != rlG_2.id_byte ? false : true;
   }

   public rnM_2 BG() {
      return ((rYB)this.id_throws[7]).id_package().id_private(this.i());
   }

   public boolean BL() {
      return (Boolean)this.id_throws[20];
   }

   public boolean Bz() {
      if (((rYB)this.id_throws[7]).id_continue) {
         return false;
      } else if ((Boolean)this.id_throws[38]) {
         return false;
      } else {
         float var1 = ((ap_3)this.id_throws[70]).id_class * 0.8F;
         rfl_3 var2 = rfl_3.id_catch((double)var1, (double)0.1F, (double)var1).id_protected(this.rx(), this.rH(), this.BO());
         return ((rYB)this.id_throws[7]).id_break(this, var2, (var1x, var2x) -> var1x.id_final((rYB)this.id_throws[7], var2x)).findAny().isPresent();
      }
   }

   public void Bc() {
      if ((rYB)this.id_throws[7] != null) {
         for(double var1 = this.re(); var1 > (double)0.0F && var1 < (double)256.0F; var1 += (double)1.0F) {
            this.id_new(this.rx(), var1, this.BO());
            if (((rYB)this.id_throws[7]).id_throws(this)) {
               break;
            }
         }

         this.id_byte(rjU_2.id_class);
         Float var7 = 0.0F;
         this.id_throws[16] = var7;
      }

   }

   public boolean BW() {
      return !((rYB)this.id_throws[7]).a_(this, this.rN().id_break(1.0E-7)) ? true : false;
   }

   public Iterable<rdn_3> PY() {
      return Iterables.concat(this.rs(), this.PV());
   }

   public float Bd() {
      return ((ap_3)this.id_throws[70]).id_protected;
   }

   public float Bx() {
      return (Float)this.id_throws[71];
   }

   public rqA_2 Bv() {
      return rqn_3.SD;
   }

   public boolean Pw() {
      return this.h();
   }

   public ap_3 a_(iM_2 var1) {
      return ((aI_2)this.id_throws[0]).id_volatile();
   }

   public void a_(rjU_2 var1) {
      this.id_private(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public boolean a_(rhd_3 var1) {
      if (var1.id_native()) {
         return false;
      } else {
         rnM_2 var2 = this.BG();
         return (var2 == null || var1 == null || var1.BG() != var2 || !var2.id_private()) && this.Pp() ? true : false;
      }
   }

   public void a_(UUID var1) {
      this.id_throws[63] = var1;
      String var7 = ((UUID)this.id_throws[63]).toString();
      this.id_throws[64] = var7;
   }

   public rsE_2 a_(rdn_3 var1) {
      return this.id_class(var1, 0.0F);
   }

   public rjU_2 a_(iB_2 var1) {
      return new rjU_2(this.rx(), this.rN().id_throws, this.BO());
   }

   public rgP_2 L_() {
      return rnB_2.id_class(this.BG(), this.g(), rnO_2.values()).id_class((var1) -> var1.id_class(this.rM()).id_class(this.rz()));
   }

   public abstract void m_();

   public void q_() {
      ap_3 var1 = (ap_3)this.id_throws[70];
      iM_2 var2 = this.Pb();
      ap_3 var3 = this.a_(var2);
      this.id_throws[70] = var3;
      Float var11 = this.id_class(var2, var3);
      this.id_throws[71] = var11;
      if (var3.id_class < var1.id_class) {
         double var4 = (double)var3.id_class / (double)2.0F;
         this.id_class(new rfl_3(this.rx() - var4, this.re(), this.BO() - var4, this.rx() + var4, this.re() + (double)var3.id_break, this.BO() + var4));
      } else {
         rfl_3 var12 = this.rN();
         this.id_class(new rfl_3(var12.id_class, var12.id_break, var12.id_byte, var12.id_class + (double)var3.id_class, var12.id_break + (double)var3.id_break, var12.id_byte + (double)var3.id_class));
         if (var3.id_class > var1.id_class && !(Boolean)this.id_throws[48] && !((rYB)this.id_throws[7]).id_continue) {
            float var5 = var1.id_class - var3.id_class;
            this.id_class(iG_2.SELF, new rjU_2((double)var5, (double)0.0F, (double)var5));
         }
      }

   }

   public abstract ruS_2<?> p_();

   public Qs_1 r_() {
      return Qs_1.NORMAL;
   }

   public boolean Y() {
      return (Boolean)this.id_throws[75];
   }

   public void c_(rhd_3 var1) {
   }

   public void c_(boolean var1) {
      this.id_break(3, var1);
   }

   public rgP_2 PT() {
      return ((aI_2)this.id_throws[0]).id_implements();
   }
}
