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
      return id_implements[227];
   }

   public rjU_2 id_byte(float var1, float var2) {
      float var3 = var1 * id_protected[54];
      float var4 = -var2 * id_protected[55];
      float var5 = rfU_2.id_break(var4);
      float var6 = rfU_2.id_class(var4);
      float var7 = rfU_2.id_break(var3);
      float var8 = rfU_2.id_class(var3);
      return new rjU_2((double)(var6 * var7), (double)(-var8), (double)(var5 * var7));
   }

   public boolean id_byte(rcd_3 var1) {
      return !this.Pm() && this.id_protected(var1) ? id_implements[117] : id_implements[118];
   }

   public void id_byte(rjU_2 var1) {
      this.id_throws[id_break[543]] = var1;
   }

   public double id_byte(rfH_2 var1) {
      return var1.id_class(this.rx(), this.re(), this.BO(), id_implements[106]);
   }

   public double id_byte(double var1) {
      return ((rjU_2)this.id_throws[id_break[548]]).id_byte + (double)this.Bm() * var1;
   }

   public void id_byte(an_3 var1) {
      if (!((rYB)this.id_throws[id_break[297]]).id_continue) {
         if (!this.id_return(var1) && !(Boolean)var1.id_throws[id_break[298]] && !(Boolean)this.id_throws[id_break[299]]) {
            double var2 = var1.rx() - this.rx();
            double var4 = var1.BO() - this.BO();
            double var6 = rfU_2.id_class(var2, var4);
            if (var6 >= id_finally[140]) {
               var6 = (double)rfU_2.id_class(var6);
               var2 /= var6;
               var4 /= var6;
               double var8 = id_finally[141] / var6;
               if (var8 > id_finally[142]) {
                  var8 = id_finally[143];
               }

               var2 *= var8;
               var4 *= var8;
               var2 *= id_finally[144];
               var4 *= id_finally[145];
               var2 *= (double)(id_protected[48] - this.id_throws[id_break[300]]);
               var4 *= (double)(id_protected[49] - this.id_throws[id_break[301]]);
               if (!this.BP()) {
                  this.id_implements(-var2, id_finally[146], -var4);
               }

               if (!var1.BP()) {
                  var1.id_implements(var2, id_finally[147], var4);
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
      this.id_throws[id_break[112]] = var6;
   }

   private boolean id_int() {
      rfH_2 var1 = this.Bs();
      return !((rYB)this.id_throws[id_break[217]]).id_while(var1)
            && !((rYB)this.id_throws[id_break[218]]).id_while(new rfH_2((double)var1.b_(), this.rN().id_throws, (double)var1.d_()))
         ? id_implements[74]
         : id_implements[73];
   }

   public rpr_3 id_int(float var1) {
      return rpr_3.id_class((double)var1);
   }

   public double id_int(an_3 var1) {
      return this.id_break(var1.Ps());
   }

   private static void id_long() {
      id_break = new short[]{
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
      this.id_abstract();
      Integer var7 = ((AtomicInteger)id_case[id_break[0]]).incrementAndGet();
      this.id_throws[id_break[1]] = var7;
      ArrayList var8 = Lists.newArrayList();
      this.id_throws[id_break[2]] = var8;
      rjU_2 var9 = rjU_2.id_class;
      this.id_throws[id_break[3]] = var9;
      rjU_2 var10 = rjU_2.id_class;
      this.id_throws[id_break[4]] = var10;
      rfl_3 var11 = (rfl_3)id_case[id_break[5]];
      this.id_throws[id_break[6]] = var11;
      rjU_2 var12 = rjU_2.id_class;
      this.id_throws[id_break[7]] = var12;
      Float var13 = id_protected[0];
      this.id_throws[id_break[8]] = var13;
      Float var14 = id_protected[1];
      this.id_throws[id_break[9]] = var14;
      Random var15 = new Random();
      this.id_throws[id_break[10]] = var15;
      Integer var16 = -this.rV();
      this.id_throws[id_break[11]] = var16;
      Object2DoubleArrayMap var17 = new Object2DoubleArrayMap(id_private[0]);
      this.id_throws[id_break[12]] = var17;
      Boolean var18 = id_implements[0];
      this.id_throws[id_break[13]] = var18;
      UUID var19 = rfU_2.id_class((Random)this.id_throws[id_break[14]]);
      this.id_throws[id_break[15]] = var19;
      String var20 = ((UUID)this.id_throws[id_break[16]]).toString();
      this.id_throws[id_break[17]] = var20;
      HashSet var21 = Sets.newHashSet();
      this.id_throws[id_break[18]] = var21;
      double[] var10001 = new double[id_private[1]];
      var10001[id_implements[1]] = id_finally[0];
      var10001[id_implements[2]] = id_finally[1];
      var10001[id_private[2]] = id_finally[2];
      double[] var22 = var10001;
      this.id_throws[id_break[19]] = var22;
      this.id_throws[id_break[20]] = var1;
      this.id_throws[id_break[21]] = var2;
      ap_3 var25 = var1.id_volatile();
      this.id_throws[id_break[22]] = var25;
      rjU_2 var26 = rjU_2.id_class;
      this.id_throws[id_break[23]] = var26;
      rfH_2 var27 = rfH_2.id_protected;
      this.id_throws[id_break[24]] = var27;
      rjU_2 var28 = rjU_2.id_class;
      this.id_throws[id_break[25]] = var28;
      this.id_new(id_finally[3], id_finally[4], id_finally[5]);
      rmE_2 var29 = new rmE_2(this);
      this.id_throws[id_break[26]] = var29;
      ((rmE_2)this.id_throws[id_break[27]]).id_class((rut_3<Byte>)id_case[id_break[28]], Byte.valueOf(id_implements[3]));
      ((rmE_2)this.id_throws[id_break[29]]).id_class((rut_3<Integer>)id_case[id_break[30]], this.ri());
      ((rmE_2)this.id_throws[id_break[31]]).id_class((rut_3<Boolean>)id_case[id_break[32]], id_implements[4]);
      ((rmE_2)this.id_throws[id_break[33]]).id_class((rut_3<Optional>)id_case[id_break[34]], Optional.empty());
      ((rmE_2)this.id_throws[id_break[35]]).id_class((rut_3<Boolean>)id_case[id_break[36]], id_implements[5]);
      ((rmE_2)this.id_throws[id_break[37]]).id_class((rut_3<Boolean>)id_case[id_break[38]], id_implements[6]);
      ((rmE_2)this.id_throws[id_break[39]]).id_class((rut_3<iM_2>)id_case[id_break[40]], iM_2.STANDING);
      this.m_();
      Float var30 = this.id_class(iM_2.STANDING, (ap_3)this.id_throws[id_break[41]]);
      this.id_throws[id_break[42]] = var30;
      String var31 = this.PT().id_byte();
      this.id_throws[id_break[43]] = var31;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof an_3) {
         return ((an_3)var1).id_throws[id_break[56]] == this.id_throws[id_break[57]] ? id_implements[10] : id_implements[11];
      } else {
         return id_implements[12];
      }
   }

   @Override
   public String toString() {
      Locale var10000 = Locale.ROOT;
      String var10001 = id_class[51];
      Object[] var10002 = new Object[id_private[39]];
      var10002[id_implements[205]] = this.getClass().getSimpleName();
      var10002[id_implements[206]] = this.g().getString();
      var10002[id_private[40]] = (Integer)this.id_throws[id_break[449]];
      var10002[id_private[41]] = (rYB)this.id_throws[id_break[450]] == null ? id_class[52] : ((rYB)this.id_throws[id_break[451]]).toString();
      var10002[id_private[42]] = this.rx();
      var10002[id_private[43]] = this.re();
      var10002[id_private[44]] = this.BO();
      return String.format(var10000, var10001, var10002);
   }

   @Override
   public int hashCode() {
      return (Integer)this.id_throws[id_break[58]];
   }

   public boolean B() {
      return this.PF() && !this.rT() && !this.id_native() && !this.x() && !this.ry() && this.BM() ? id_implements[97] : id_implements[98];
   }

   @Override
   public boolean C() {
      return ((rYB)this.id_throws[id_break[524]]).B().id_break(rRu_1.id_final);
   }

   public boolean D() {
      return ((rmE_2)this.id_throws[id_break[488]]).<Boolean>id_class((rut_3<Boolean>)id_case[id_break[489]]);
   }

   public boolean I() {
      return id_implements[216];
   }

   public int V() {
      return (Integer)this.id_throws[id_break[48]];
   }

   public boolean id_this(an_3 var1) {
      return this.id_class(var1, id_implements[147]);
   }

   public void id_this() {
      if (!((rYB)this.id_throws[id_break[79]]).id_continue) {
         this.id_break(id_private[3], this.w());
      }

      this.Pn();
   }

   public rYB e() {
      return (rYB)this.id_throws[id_break[506]];
   }

   public String i() {
      return (String)this.id_throws[id_break[477]];
   }

   public boolean x() {
      return this.Pb() == iM_2.CROUCHING ? id_implements[178] : id_implements[179];
   }

   public boolean h() {
      return this.id_finally(id_implements[177]);
   }

   public float f() {
      return id_protected[61];
   }

   @Override
   public boolean l() {
      return id_implements[253];
   }

   public void a() {
      if (this.rZ()) {
         Integer var5 = (Integer)this.id_throws[id_break[105]] - id_implements[24];
         this.id_throws[id_break[106]] = var5;
      }
   }

   public abstract void id_class(rcd_3 var1);

   public void id_class(an_3 var1, int var2, rye_3 var3) {
      if (var1 instanceof rhN_2) {
         Oo_1.id_byte.id_class((rhN_2)var1, this, var3);
      }
   }

   public void id_class(rrEm_1 var1, rSg_1 var2) {
      this.id_protected((Integer)this.id_throws[id_break[440]] + id_implements[197]);
      if ((Integer)this.id_throws[id_break[441]] == 0) {
         this.id_case(id_private[34]);
      }

      this.id_break(rye_3.id_break, id_protected[62]);
   }

   public boolean id_class(rlb_3<rXs_1> var1, double var2) {
      rfl_3 var4 = this.rN().id_break(id_finally[189]);
      int var5 = rfU_2.id_byte(var4.id_class);
      int var6 = rfU_2.id_throws(var4.id_protected);
      int var7 = rfU_2.id_byte(var4.id_break);
      int var8 = rfU_2.id_throws(var4.id_throws);
      int var9 = rfU_2.id_byte(var4.id_byte);
      int var10 = rfU_2.id_throws(var4.id_case);
      if (!((rYB)this.id_throws[id_break[525]]).id_class(var5, var7, var9, var6, var8, var10)) {
         return id_implements[255];
      } else {
         double var11 = id_finally[190];
         boolean var13 = this.u();
         boolean var14 = id_implements[256];
         rjU_2 var15 = rjU_2.id_class;
         int var16 = id_implements[257];
         rfw_3 var17 = new rfw_3();

         for (int var18 = var5; var18 < var6; var18++) {
            for (int var19 = var7; var19 < var8; var19++) {
               for (int var20 = var9; var20 < var10; var20++) {
                  var17.id_class(var18, var19, var20);
                  rXE var21 = ((rYB)this.id_throws[id_break[526]]).id_break(var17);
                  if (var21.id_class(var1)) {
                     double var22 = (double)((float)var19 + var21.id_class((rRq_1)((rYB)this.id_throws[id_break[527]]), var17));
                     if (var22 >= var4.id_break) {
                        var14 = id_implements[258];
                        var11 = Math.max(var22 - var4.id_break, var11);
                        if (var13) {
                           rjU_2 var24 = var21.id_byte((rYB)this.id_throws[id_break[528]], var17);
                           if (var11 < id_finally[191]) {
                              var24 = var24.id_class(var11);
                           }

                           var15 = var15.id_throws(var24);
                           var16++;
                        }
                     }
                  }
               }
            }
         }

         if (var15.id_case() > id_finally[192]) {
            if (var16 > 0) {
               var15 = var15.id_class(id_finally[193] / (double)var16);
            }

            if (!(this instanceof rhd_3)) {
               var15 = var15.id_protected();
            }

            rjU_2 var26 = this.rv();
            var15 = var15.id_class(var2);
            if (Math.abs(var26.id_break) < id_finally[194] && Math.abs(var26.id_protected) < id_finally[195] && var15.id_case() < id_finally[196]) {
               var15 = var15.id_protected().id_class(id_finally[197]);
            }

            this.id_byte(this.rv().id_throws(var15));
         }

         ((Object2DoubleMap)this.id_throws[id_break[529]]).put(var1, var11);
         return var14;
      }
   }

   public void id_class(xd_3 var1) {
      Boolean var6 = id_implements[190];
      this.id_throws[id_break[424]] = var6;
      this.id_throws[id_break[425]] = var1;
   }

   public void id_class(float var1, int var2) {
      this.id_implements(var1);
   }

   public boolean id_class(int var1, rdn_3 var2) {
      return id_implements[228];
   }

   public an_3 id_class(rrEm_1 var1) {
      if ((rYB)this.id_throws[id_break[461]] instanceof rrEm_1 && !(Boolean)this.id_throws[id_break[462]]) {
         this.K();
         WP var2 = this.id_break(var1);
         if (var2 == null) {
            return null;
         } else {
            an_3 var3 = this.BC().id_class(var1);
            if (var3 != null) {
               var3.id_throws(this);
               var3.id_class(var2.id_class.id_break, var2.id_class.id_byte, var2.id_class.id_protected, var2.id_byte, (Float)var3.id_throws[id_break[463]]);
               var3.id_byte(var2.id_break);
               var1.id_catch(var3);
               if (var1.E() == rYB.id_throws) {
                  rrEm_1.id_class(var1);
               }
            }

            this.Pi();
            ((rrEm_1)((rYB)this.id_throws[id_break[464]])).id_volatile();
            var1.id_volatile();
            return var3;
         }
      } else {
         return null;
      }
   }

   public boolean id_class(QP var1) {
      if (this.ra() instanceof rSK) {
         return id_implements[92];
      } else {
         double var2 = this.re() + (double)this.Bx();
         rfH_2 var4 = new rfH_2(this.rx(), var2, this.BO());
         xc_3 var5 = ((rYB)this.id_throws[id_break[234]]).id_byte(var4);
         return var5.id_byte() == var1 ? id_implements[93] : id_implements[94];
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
      return rnB_2.id_class(this.BG(), this.g(), var1).id_class(var1x -> var1x.id_class(this.rM()).id_class(this.rz()));
   }

   public static rjU_2 id_class(rjU_2 var0, rfl_3 var1, rRR var2, rjm_3 var3, rqJ_2<rjC_2> var4, boolean var5, boolean var6) {
      double var7 = var0.id_break;
      double var9 = var0.id_byte;
      double var11 = var0.id_protected;
      if (var9 != id_finally[75]) {
         if (!var5) {
            var9 = rjw_3.id_class(rpB_2.Y, var1, var2, var9, var3, var4.id_class());
         }

         if (var9 != id_finally[76]) {
            var1 = var1.id_protected(id_finally[77], var9, id_finally[78]);
         }
      }

      boolean var13 = Math.abs(var7) < Math.abs(var11) ? id_implements[65] : id_implements[66];
      if (var13 && var11 != id_finally[79]) {
         if (!var6) {
            var11 = rjw_3.id_class(rpB_2.Z, var1, var2, var11, var3, var4.id_class());
         }

         if (var11 != id_finally[80]) {
            var1 = var1.id_protected(id_finally[81], id_finally[82], var11);
         }
      }

      if (var7 != id_finally[83]) {
         if (!var6) {
            var7 = rjw_3.id_class(rpB_2.X, var1, var2, var7, var3, var4.id_class());
         }

         if (!var13 && var7 != id_finally[84]) {
            var1 = var1.id_protected(var7, id_finally[85], id_finally[86]);
         }
      }

      if (!var13 && var11 != id_finally[87] && !var6) {
         var11 = rjw_3.id_class(rpB_2.Z, var1, var2, var11, var3, var4.id_class());
      }

      return new rjU_2(var7, var9, var11);
   }

   public boolean id_class(an_3 var1, boolean var2) {
      for (an_3 var3 = var1; (an_3)var3.id_throws[id_break[375]] != null; var3 = (an_3)var3.id_throws[id_break[377]]) {
         if ((an_3)var3.id_throws[id_break[376]] == this) {
            return id_implements[148];
         }
      }

      if (var2 || this.id_new(var1) && var1.id_case(this)) {
         if (this.Pm()) {
            this.BH();
         }

         this.id_class(iM_2.STANDING);
         this.id_throws[id_break[378]] = var1;
         ((an_3)this.id_throws[id_break[379]]).id_extends(this);
         return id_implements[149];
      } else {
         return id_implements[150];
      }
   }

   public void id_class(byte var1) {
      if (var1 == id_private[25]) {
         kB_2.id_class(this);
      }
   }

   public float id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return var6;
   }

   public void id_class(rYB var1) {
      this.id_throws[id_break[270]] = var1;
   }

   public void id_class(float var1, rjU_2 var2) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_break[264]]).id_class(this);
      rjU_2 var3 = id_class(var2, var1, (Float)this.id_throws[id_break[265]]);
      this.id_byte(this.rv().id_throws(var3));
      Float var8 = (Float)this.id_throws[id_break[266]];
      this.id_throws[id_break[267]] = var8;
   }

   public boolean id_class(rlb_3<rXs_1> var1) {
      return (rlb_3)this.id_throws[id_break[259]] == var1 ? id_implements[99] : id_implements[100];
   }

   public boolean id_class(rfH_2 var1, xc_3 var2) {
      rjC_2 var3 = var2.id_break((rYB)this.id_throws[id_break[44]], var1, rjm_3.id_class(this));
      rjC_2 var4 = var3.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
      return rjw_3.id_byte(var4, rjw_3.id_class(this.rN()), rjN_2.id_implements);
   }

   public void id_class(rqA_2 var1, float var2, float var3) {
      if (!this.BF()) {
         ((rYB)this.id_throws[id_break[201]]).id_class(null, this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3);
      }
   }

   private void id_class(boolean var1, Set<an_3> var2) {
      for (an_3 var4 : this.Bh()) {
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

      for (int var5 = id_implements[136]; var5 < var4; var5++) {
         float var6 = var3[var5];
         var2.add(rcu_3.id_class(var6));
      }

      return var2;
   }

   public rsE_2 id_class(rpL_2 var1) {
      return this.id_class(var1, id_implements[137]);
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
      double var4 = ((rjU_2)var1.id_throws[id_break[67]]).id_break - ((rjU_2)this.id_throws[id_break[68]]).id_break;
      double var6 = ((rjU_2)var1.id_throws[id_break[69]]).id_byte - ((rjU_2)this.id_throws[id_break[70]]).id_byte;
      double var8 = ((rjU_2)var1.id_throws[id_break[71]]).id_protected - ((rjU_2)this.id_throws[id_break[72]]).id_protected;
      return var4 * var4 + var6 * var6 + var8 * var8 < var2 * var2 ? id_implements[14] : id_implements[15];
   }

   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      return ryZ_2.PASS;
   }

   public void id_class(double var1, double var3, double var5, float var7) {
      this.id_byte(new rjU_2(var1, var3, var5).id_throws((double)var7, (double)var7, (double)var7));
   }

   public boolean id_class(float var1, float var2) {
      if (this.BP()) {
         for (an_3 var4 : this.Bh()) {
            var4.id_class(var1, var2);
         }
      }

      return id_implements[70];
   }

   public rjG_2 id_class(double var1, float var3, boolean var4) {
      rjU_2 var5 = this.id_new(var3);
      rjU_2 var6 = this.id_break(var3);
      rjU_2 var7 = var5.id_break(var6.id_break * var1, var6.id_byte * var1, var6.id_protected * var1);
      return ((rYB)this.id_throws[id_break[324]]).id_class(new rjB_2(var5, var7, rjS_2.OUTLINE, var4 ? rjs_3.ANY : rjs_3.NONE, this));
   }

   public void id_class(Ko_1 var1) {
      var1.id_class(id_class[54], () -> aI_2.id_class(this.BC()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.id_class(id_class[55], (Integer)this.id_throws[id_break[471]]);
      var1.id_class(id_class[56], () -> this.g().getString());
      String var10001 = id_class[57];
      Locale var10002 = Locale.ROOT;
      String var10003 = id_class[58];
      Object[] var10004 = new Object[id_private[46]];
      var10004[id_implements[219]] = this.rx();
      var10004[id_implements[220]] = this.re();
      var10004[id_private[47]] = this.BO();
      var1.id_class(var10001, String.format(var10002, var10003, var10004));
      var1.id_class(id_class[59], Ko_1.id_class(rfU_2.id_byte(this.rx()), rfU_2.id_byte(this.re()), rfU_2.id_byte(this.BO())));
      rjU_2 var2 = this.rv();
      if (var2 != null) {
         var10001 = id_class[60];
         var10002 = Locale.ROOT;
         var10003 = id_class[61];
         var10004 = new Object[id_private[48]];
         var10004[id_implements[221]] = var2.id_break;
         var10004[id_implements[222]] = var2.id_byte;
         var10004[id_private[49]] = var2.id_protected;
         var1.id_class(var10001, String.format(var10002, var10003, var10004));
      }

      var1.id_class(id_class[62], () -> this.Bh().toString());
      var1.id_class(id_class[63], () -> this.ra().toString());
   }

   public rsE_2 id_class(rdn_3 var1, float var2) {
      if (var1.id_class()) {
         return null;
      } else if (((rYB)this.id_throws[id_break[365]]).id_continue) {
         return null;
      } else {
         rsE_2 var3 = new rsE_2((rYB)this.id_throws[id_break[366]], this.rx(), this.re() + (double)var2, this.BO(), var1);
         var3.id_private();
         ((rYB)this.id_throws[id_break[367]]).a_(var3);
         return var3;
      }
   }

   public float id_class(eX_2 var1) {
      return this.id_break(var1.id_class(), var1.id_break(), var1.id_byte());
   }

   public rjU_2 id_class(float var1) {
      return this.id_finally(var1).id_break(id_finally[205], (double)((Float)this.id_throws[id_break[564]]).floatValue() * id_finally[206], id_finally[207]);
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

      for (int var5 = id_implements[135]; var5 < var4; var5++) {
         double var6 = var3[var5];
         var2.add(rcz_3.id_class(var6));
      }

      return var2;
   }

   public void id_class(xc_3 var1) {
   }

   public static rjU_2 id_class(an_3 var0, rjU_2 var1, rfl_3 var2, rYB var3, rjm_3 var4, rqJ_2<rjC_2> var5, boolean var6, boolean var7) {
      boolean var8 = var1.id_break == id_finally[50] ? id_implements[49] : id_implements[50];
      boolean var9 = var1.id_byte == id_finally[51] ? id_implements[51] : id_implements[52];
      boolean var10 = var1.id_protected == id_finally[52] ? id_implements[53] : id_implements[54];
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         return id_class(var1, var2, var3, var4, var5, var6, var7);
      } else {
         rqJ_2 var11 = new rqJ_2<>(Stream.concat(var5.id_class(), var3.id_byte(var0, var2.id_break(var1))));
         return id_class(var1, var2, var11, var6, var7);
      }
   }

   public void id_class(rhN_2 var1) {
   }

   public rjU_2 id_class(float var1, float var2, float var3) {
      return this.id_byte(this.id_private(var2, var3), this.id_throws(var1, var3));
   }

   public boolean id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return id_implements[217];
   }

   public void id_class(rrEm_1 var1, iB_2 var2) {
   }

   public void id_class(xc_3 var1, rjU_2 var2) {
      this.id_throws[id_break[447]] = var2;
   }

   public void id_class(iM_2 var1) {
      ((rmE_2)this.id_throws[id_break[63]]).id_break((rut_3<iM_2>)id_case[id_break[64]], var1);
   }

   public static rjU_2 id_class(double var0, double var2, float var4) {
      double var5 = (var0 + var2 + id_finally[186]) / id_finally[187];
      float var7 = -rfU_2.id_class(var4 * id_protected[74]);
      float var8 = rfU_2.id_break(var4 * id_protected[75]);
      float var9 = Math.max(Math.abs(var7), Math.abs(var8));
      return new rjU_2((double)var7 * var5 / (double)var9, id_finally[188], (double)var8 * var5 / (double)var9);
   }

   public void id_class(rXQ var1, rdn_3 var2) {
   }

   public boolean id_class(rye_3 var1) {
      return this.id_throws[id_break[452]] && var1 != rye_3.id_volatile && !var1.id_synchronized() ? id_implements[207] : id_implements[208];
   }

   public rsE_2 id_class(rpL_2 var1, int var2) {
      return this.id_class(new rdn_3(var1), (float)var2);
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.id_package(var1, var3, var5);
      Float var14 = var7;
      this.id_throws[id_break[271]] = var14;
      if (var9) {
         Float var15 = (Float)this.id_throws[id_break[272]] % id_protected[41];
         this.id_throws[id_break[273]] = var15;
      }

      Float var16 = rfU_2.id_class(var8, id_protected[42], id_protected[43]);
      this.id_throws[id_break[274]] = var16;
      if (var9) {
         Float var17 = (Float)this.id_throws[id_break[275]] % id_protected[44];
         this.id_throws[id_break[276]] = var17;
      }

      Float var18 = (Float)this.id_throws[id_break[277]];
      this.id_throws[id_break[278]] = var18;
      Float var19 = (Float)this.id_throws[id_break[279]];
      this.id_throws[id_break[280]] = var19;
   }

   public rjU_2 id_class(rjU_2 var1, float var2) {
      if (var2 == id_protected[58]) {
         return new rjU_2(var1.id_break, var1.id_byte + (double)((Float)this.id_throws[id_break[315]]).floatValue(), var1.id_byte);
      } else {
         double var3 = rfU_2.id_protected((double)var2, (Double)this.id_throws[id_break[316]], this.rx());
         double var5 = rfU_2.id_protected((double)var2, (Double)this.id_throws[id_break[317]], this.re()) + (double)this.Bx();
         double var7 = rfU_2.id_protected((double)var2, (Double)this.id_throws[id_break[318]], this.BO());
         return new rjU_2(var3, var5, var7);
      }
   }

   public boolean id_class(rnM_2 var1) {
      return this.BG() != null && this.BG().id_class(var1) ? id_implements[188] : id_implements[189];
   }

   public rjG_2 id_class(rjU_2 var1, double var2, float var4, boolean var5, Predicate<xc_3> var6) {
      rjU_2 var7 = this.id_new(var4);
      rjU_2 var8 = var7.id_break(var1.id_break * var2, var1.id_byte * var2, var1.id_protected * var2);
      rjB_2 var9 = new rjB_2(var7, var8, rjS_2.OUTLINE, var5 ? rjs_3.ANY : rjs_3.NONE, this);
      var9.id_class(var6);
      return ((rYB)this.id_throws[id_break[322]]).id_break(var9);
   }

   public void id_class(rut_3<?> var1) {
      if (((rut_3)id_case[id_break[496]]).equals(var1)) {
         this.q_();
      }
   }

   public void id_class(rfl_3 var1) {
      this.id_throws[id_break[504]] = var1;
   }

   public void id_class(Rm_1 var1, rjU_2 var2) {
      rjU_2 var3 = var1.id_class(this);
      double var4 = var2.id_break - var3.id_break;
      double var6 = var2.id_byte - var3.id_byte;
      double var8 = var2.id_protected - var3.id_protected;
      double var10 = (double)rfU_2.id_class(var4 * var4 + var8 * var8);
      Float var16 = rfU_2.id_catch((float)(-(rfU_2.id_protected(var6, var10) * 180.0F / (float)Math.PI)));
      this.id_throws[16] = var16;
      Float var17 = rfU_2.id_catch((float)(rfU_2.id_protected(var8, var4) * 180.0F / (float)Math.PI) - 90.0F);
      this.id_throws[15] = var17;
      this.id_implements((Float)this.id_throws[15]);
      Float var18 = (Float)this.id_throws[16];
      this.id_throws[18] = var18;
      Float var19 = (Float)this.id_throws[15];
      this.id_throws[17] = var19;
   }

   public boolean id_class(Class<? extends an_3> var1) {
      for (an_3 var3 : this.Bh()) {
         if (var1.isAssignableFrom(var3.getClass())) {
            return id_implements[235];
         }
      }

      return id_implements[236];
   }

   public static rjU_2 id_class(rjU_2 var0, rfl_3 var1, rqJ_2<rjC_2> var2, boolean var3, boolean var4) {
      double var5 = var0.id_break;
      double var7 = var0.id_byte;
      double var9 = var0.id_protected;
      if (var7 != id_finally[53]) {
         if (!var3) {
            var7 = rjw_3.id_class(rpB_2.Y, var1, var2.id_class(), var7);
         }

         if (var7 != id_finally[54]) {
            var1 = var1.id_protected(id_finally[55], var7, id_finally[56]);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9) ? id_implements[55] : id_implements[56];
      if (var11 && var9 != id_finally[57]) {
         if (!var4) {
            var9 = rjw_3.id_class(rpB_2.Z, var1, var2.id_class(), var9);
         }

         if (var9 != id_finally[58]) {
            var1 = var1.id_protected(id_finally[59], id_finally[60], var9);
         }
      }

      if (var5 != id_finally[61]) {
         if (!var4) {
            var5 = rjw_3.id_class(rpB_2.X, var1, var2.id_class(), var5);
         }

         if (!var11 && var5 != id_finally[62]) {
            var1 = var1.id_protected(var5, id_finally[63], id_finally[64]);
         }
      }

      if (!var11 && var9 != id_finally[65] && !var4) {
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
         var3 = id_finally[148];
      }

      var3 = var3 * id_finally[149] * (Double)id_case[id_break[325]];
      return var1 < var3 * var3 ? id_implements[113] : id_implements[114];
   }

   private static rjU_2 id_class(rjU_2 var0, float var1, float var2) {
      double var3 = var0.id_catch();
      if (var3 < id_finally[121]) {
         return rjU_2.id_class;
      } else {
         rjU_2 var5 = (var3 > id_finally[122] ? var0.id_protected() : var0).id_class((double)var1);
         float var6 = rfU_2.id_class(var2 * id_protected[38]);
         float var7 = rfU_2.id_break(var2 * id_protected[39]);
         return new rjU_2(
            var5.id_break * (double)var7 - var5.id_protected * (double)var6, var5.id_byte, var5.id_protected * (double)var7 + var5.id_break * (double)var6
         );
      }
   }

   public float id_class(rqd_3 var1) {
      float var2 = rfU_2.id_catch((Float)this.id_throws[id_break[508]]);
      switch (((int[])aC_2.id_class[id_break[509]])[var1.ordinal()]) {
         case 1:
            return var2 + id_protected[70];
         case 2:
            return var2 + id_protected[71];
         case 3:
            return var2 + id_protected[72];
         default:
            return var2;
      }
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8) {
      this.id_native(var1, var3, var5);
      Float var13 = var7;
      this.id_throws[id_break[286]] = var13;
      Float var14 = var8;
      this.id_throws[id_break[287]] = var14;
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
      boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[181]]).id_private().y().id_new();
      Stream var7 = ((rYB)this.id_throws[id_break[182]]).id_class(this, var4.id_break(var1), var0 -> true);
      if (!var6) {
         rjC_2 var8 = ((rYB)this.id_throws[id_break[183]]).id_instanceof().id_byte();
         if (!rjw_3.id_byte(var8, rjw_3.id_class(var4.id_break(id_finally[66])), rjN_2.id_implements)) {
            var7 = Stream.concat(var7, Stream.of(var8));
         }
      }

      rqJ_2 var19 = new rqJ_2(var7);
      rjU_2 var9 = var1.id_catch() == id_finally[67] ? var1 : id_class(this, var1, var4, (rYB)this.id_throws[id_break[184]], var5, var19, var2, var3);
      boolean var10 = var1.id_break != var9.id_break ? id_implements[57] : id_implements[58];
      boolean var11 = var1.id_byte != var9.id_byte ? id_implements[59] : id_implements[60];
      boolean var12 = var1.id_protected != var9.id_protected ? id_implements[61] : id_implements[62];
      boolean var13 = !this.id_throws[id_break[185]] && (!var11 || !(var1.id_byte < id_finally[68])) ? id_implements[64] : id_implements[63];
      if ((Float)this.id_throws[id_break[186]] > id_protected[16] && var13 && (var10 || var12)) {
         rjU_2 var14 = new rjU_2(var1.id_break, (double)((Float)this.id_throws[id_break[187]]).floatValue(), var1.id_protected);
         rjU_2 var15 = id_class(this, var14, var4, (rYB)this.id_throws[id_break[188]], var5, var19, var2, var3);
         rjU_2 var16 = new rjU_2(id_finally[69], (double)((Float)this.id_throws[id_break[189]]).floatValue(), id_finally[70]);
         rjU_2 var17 = id_class(
            this, var16, var4.id_break(var1.id_break, id_finally[71], var1.id_protected), (rYB)this.id_throws[id_break[190]], var5, var19, var2, var3
         );
         if (var17.id_byte < (double)((Float)this.id_throws[id_break[191]]).floatValue()) {
            rjU_2 var18 = id_class(
                  this,
                  new rjU_2(var1.id_break, id_finally[72], var1.id_protected),
                  var4.id_protected(var17),
                  (rYB)this.id_throws[id_break[192]],
                  var5,
                  var19,
                  var2,
                  var3
               )
               .id_throws(var17);
            if (id_case(var18) > id_case(var15)) {
               var15 = var18;
            }
         }

         if (id_case(var15) > id_case(var9)) {
            rjU_2 var20 = new rjU_2(id_finally[73], -var15.id_byte + var1.id_byte, id_finally[74]);
            return var15.id_throws(id_class(this, var20, var4.id_protected(var15), (rYB)this.id_throws[id_break[193]], var5, var19, var2, var3));
         }
      }

      return var9;
   }

   private static rgP_2 id_class(rgP_2 var0) {
      rVi_1 var1 = var0.id_throws().id_class(var0.id_class().id_class(null));

      for (rgP_2 var3 : var0.id_protected()) {
         var1.id_class(id_class(var3));
      }

      return var1;
   }

   public float id_class(iM_2 var1, ap_3 var2) {
      return var2.id_break * id_protected[68];
   }

   public void id_class(iG_2 var1, rjU_2 var2) {
      rfl_3 var3 = this.rN();
      double var4 = this.rx();
      double var6 = this.BO();
      if ((Boolean)this.id_throws[id_break[114]]) {
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

         Boolean var32 = id_implements[29];
         this.id_throws[id_break[115]] = var32;
         Object var33 = null;
         this.id_throws[id_break[116]] = var33;
         Boolean var34 = id_implements[30];
         this.id_throws[id_break[117]] = var34;
         if (((rjU_2)this.id_throws[id_break[118]]).id_catch() > id_finally[10]) {
            var2 = var2.id_finally((rjU_2)this.id_throws[id_break[119]]);
            rjU_2 var35 = rjU_2.id_class;
            this.id_throws[id_break[120]] = var35;
            this.id_byte(rjU_2.id_class);
         }

         var2 = this.id_class(var2, var1);
         boolean var9 = id_implements[31];
         boolean var10 = id_implements[32];
         if (this == (cb_3)var8.id_class[id_break[121]]) {
            rrLz_1 var11 = rrLz_1.id_class(var2, this.Ps(), var3, var9, var10, this.id_break(var2, var9, var10));
            var9 = var11.id_class();
            var10 = var11.id_class();
            var2 = var11.id_catch();
         }

         rjU_2 var47 = this.id_class(var2, var9, var10);
         if (var47.id_catch() > id_finally[11]) {
            this.id_class(this.rN().id_protected(var47));
            this.PC();
         }

         boolean var12 = rfU_2.id_break(var2.id_break, var47.id_break) && rfU_2.id_break(var2.id_protected, var47.id_protected)
            ? id_implements[34]
            : id_implements[33];
         boolean var13 = var2.id_byte != var47.id_byte ? id_implements[35] : id_implements[36];
         if (this == (cb_3)var8.id_class[id_break[122]] && (var12 != (Boolean)this.id_throws[id_break[123]] || var13 != (Boolean)this.id_throws[id_break[124]])
            )
          {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[125]]).id_finally().id_class(rrLj_1.id_class(var12, var13));
         }

         Boolean var36 = var12;
         this.id_throws[id_break[126]] = var36;
         Boolean var37 = var13;
         this.id_throws[id_break[127]] = var37;
         Boolean var38 = this.id_throws[id_break[128]] && var2.id_byte < id_finally[12] ? id_implements[37] : id_implements[38];
         this.id_throws[id_break[129]] = var38;
         Boolean var39 = var12;
         this.id_throws[id_break[130]] = var39;
         Boolean var40 = var13;
         this.id_throws[id_break[131]] = var40;
         if (this == (cb_3)var8.id_class[id_break[132]]) {
            double var14 = this.rx() - var4;
            double var16 = this.BO() - var6;
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[133]])
               .id_finally()
               .id_class(rrLW.id_class((double)rfU_2.id_class(var14 * var14 + var16 * var16)));
         }

         rfH_2 var48 = this.BS();
         xc_3 var15 = ((rYB)this.id_throws[id_break[134]]).id_byte(var48);
         this.id_class(var47.id_byte, (Boolean)this.id_throws[id_break[135]], var15, var48);
         rjU_2 var49 = this.rv();
         if (var2.id_break != var47.id_break) {
            this.id_catch(id_finally[13], var49.id_byte, var49.id_protected);
         }

         if (var2.id_protected != var47.id_protected) {
            this.id_catch(var49.id_break, var49.id_byte, id_finally[14]);
         }

         xd_3 var17 = var15.id_break();
         if (var2.id_byte != var47.id_byte) {
            var17.id_class((rYB)this.id_throws[id_break[136]], this);
         }

         if ((Boolean)this.id_throws[id_break[137]] && !this.Pc()) {
            var17.id_class((rYB)this.id_throws[id_break[138]], var48, this);
         }

         if (this.PK() && !this.Pm()) {
            double var18 = var47.id_break;
            double var20 = var47.id_byte;
            double var22 = var47.id_protected;
            if (!var17.id_class(rls_3.F)) {
               var20 = id_finally[15];
            }

            Float var41 = (float)((double)((Float)this.id_throws[id_break[139]]).floatValue() + (double)rfU_2.id_class(id_case(var47)) * id_finally[16]);
            this.id_throws[id_break[140]] = var41;
            Float var42 = (float)(
               (double)((Float)this.id_throws[id_break[141]]).floatValue()
                  + (double)rfU_2.id_class(var18 * var18 + var20 * var20 + var22 * var22) * id_finally[17]
            );
            this.id_throws[id_break[142]] = var42;
            if ((Float)this.id_throws[id_break[143]] > (Float)this.id_throws[id_break[144]] && !var15.id_catch()) {
               Float var43 = this.rQ();
               this.id_throws[id_break[145]] = var43;
               if (!this.rT()) {
                  this.id_break(var48, var15);
               } else {
                  an_3 var24 = this.BP() && this.rU() != null ? this.rU() : this;
                  float var25 = var24 == this ? id_protected[8] : id_protected[9];
                  rjU_2 var26 = var24.rv();
                  float var27 = rfU_2.id_class(
                        var26.id_break * var26.id_break * id_finally[18]
                           + var26.id_byte * var26.id_byte
                           + var26.id_protected * var26.id_protected * id_finally[19]
                     )
                     * var25;
                  if (var27 > id_protected[10]) {
                     var27 = id_protected[11];
                  }

                  this.id_private(var27);
               }
            } else if ((Float)this.id_throws[id_break[146]] > (Float)this.id_throws[id_break[147]] && this.PJ() && var15.id_catch()) {
               Float var44 = this.id_final((Float)this.id_throws[id_break[148]]);
               this.id_throws[id_break[149]] = var44;
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
         this.id_byte(this.rv().id_throws((double)var50, id_finally[20], (double)var50));
         if (((rYB)this.id_throws[id_break[150]])
               .id_byte(this.rN().id_break(id_finally[21]))
               .noneMatch(var0 -> var0.id_class(rls_3.N) || var0.id_class(xu_3.id_instanceof))
            && (Integer)this.id_throws[id_break[151]] <= 0) {
            this.id_protected(-this.rV());
         }

         if (this.Pk() && this.Pz()) {
            this.id_class(
               rqn_3.SY,
               id_protected[12],
               id_protected[13]
                  + (((Random)this.id_throws[id_break[152]]).nextFloat() - ((Random)this.id_throws[id_break[153]]).nextFloat()) * id_protected[14]
            );
            this.id_protected(-this.rV());
         }
      }
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
   }

   public float id_class(rpa_3 var1) {
      float var2 = rfU_2.id_catch((Float)this.id_throws[id_break[510]]);
      switch (((int[])aC_2.id_class[id_break[511]])[var1.ordinal()]) {
         case 1:
            return -var2;
         case 2:
            return id_protected[73] - var2;
         default:
            return var2;
      }
   }

   public void id_class(rfH_2 var1, float var2, float var3) {
      this.id_class((double)var1.b_() + id_finally[128], (double)var1.c_(), (double)var1.d_() + id_finally[129], var2, var3);
   }

   public void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      if (var3) {
         if ((Float)this.id_throws[id_break[210]] > id_protected[21]) {
            var4.id_break().id_class((rYB)this.id_throws[id_break[211]], var5, this, (Float)this.id_throws[id_break[212]]);
         }

         Float var10 = id_protected[22];
         this.id_throws[id_break[213]] = var10;
      } else if (var1 < id_finally[96]) {
         Float var11 = (float)((double)((Float)this.id_throws[id_break[214]]).floatValue() - var1);
         this.id_throws[id_break[215]] = var11;
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
      return ((rYB)this.id_throws[id_break[323]]).id_break(new rjB_2(var1, var6, rjS_2.OUTLINE, var5 ? rjs_3.ANY : rjs_3.NONE, this));
   }

   public void rd() {
      if (this.ra() instanceof rSK) {
         Boolean var5 = id_implements[89];
         this.id_throws[id_break[223]] = var5;
      } else if (this.id_class(rlG_2.id_break, id_finally[99])) {
         if (!(Boolean)this.id_throws[id_break[224]] && !(Boolean)this.id_throws[id_break[225]]) {
            this.U();
         }

         Float var6 = id_protected[23];
         this.id_throws[id_break[226]] = var6;
         Boolean var7 = id_implements[90];
         this.id_throws[id_break[227]] = var7;
         this.rE();
      } else {
         Boolean var8 = id_implements[91];
         this.id_throws[id_break[228]] = var8;
      }
   }

   public rjU_2 m() {
      return this.id_byte((Float)this.id_throws[id_break[394]], (Float)this.id_throws[id_break[395]]);
   }

   public boolean o() {
      return id_implements[230];
   }

   public void p() {
      if (this.Py()) {
         this.id_native(this.PF() && this.rT() && !this.Pm() ? id_implements[83] : id_implements[84]);
      } else {
         this.id_native(this.PF() && this.W() && !this.Pm() ? id_implements[85] : id_implements[86]);
      }
   }

   public void rb() {
      if (!this.q()) {
         this.id_case(id_private[6]);
         this.id_break(rye_3.id_protected, id_protected[7]);
      }
   }

   public float t() {
      return id_protected[66];
   }

   @Override
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
      float var2 = var1 == this ? id_protected[24] : id_protected[25];
      rjU_2 var3 = var1.rv();
      float var4 = rfU_2.id_class(
            var3.id_break * var3.id_break * id_finally[101] + var3.id_byte * var3.id_byte + var3.id_protected * var3.id_protected * id_finally[102]
         )
         * var2;
      if (var4 > id_protected[26]) {
         var4 = id_protected[27];
      }

      if ((double)var4 < id_finally[103]) {
         this.id_class(
            this.BJ(),
            var4,
            id_protected[28] + (((Random)this.id_throws[id_break[235]]).nextFloat() - ((Random)this.id_throws[id_break[236]]).nextFloat()) * id_protected[29]
         );
      } else {
         this.id_class(
            this.Bv(),
            var4,
            id_protected[30] + (((Random)this.id_throws[id_break[237]]).nextFloat() - ((Random)this.id_throws[id_break[238]]).nextFloat()) * id_protected[31]
         );
      }

      float var5 = (float)rfU_2.id_byte(this.re());

      for (int var6 = id_implements[95]; (float)var6 < id_protected[32] + ((ap_3)this.id_throws[id_break[239]]).id_class * id_protected[33]; var6++) {
         double var7 = (((Random)this.id_throws[id_break[240]]).nextDouble() * id_finally[104] - id_finally[105])
            * (double)((ap_3)this.id_throws[id_break[241]]).id_class;
         double var9 = (((Random)this.id_throws[id_break[242]]).nextDouble() * id_finally[106] - id_finally[107])
            * (double)((ap_3)this.id_throws[id_break[243]]).id_class;
         ((rYB)this.id_throws[id_break[244]])
            .id_class(
               rLQ.id_throws,
               this.rx() + var7,
               (double)(var5 + id_protected[34]),
               this.BO() + var9,
               var3.id_break,
               var3.id_byte - ((Random)this.id_throws[id_break[245]]).nextDouble() * id_finally[108],
               var3.id_protected
            );
      }

      for (int var11 = id_implements[96]; (float)var11 < id_protected[35] + ((ap_3)this.id_throws[id_break[246]]).id_class * id_protected[36]; var11++) {
         double var12 = (((Random)this.id_throws[id_break[247]]).nextDouble() * id_finally[109] - id_finally[110])
            * (double)((ap_3)this.id_throws[id_break[248]]).id_class;
         double var13 = (((Random)this.id_throws[id_break[249]]).nextDouble() * id_finally[111] - id_finally[112])
            * (double)((ap_3)this.id_throws[id_break[250]]).id_class;
         ((rYB)this.id_throws[id_break[251]])
            .id_class(rLQ.E, this.rx() + var12, (double)(var5 + id_protected[37]), this.BO() + var13, var3.id_break, var3.id_byte, var3.id_protected);
      }
   }

   public void rf() {
      Boolean var5 = id_implements[108];
      this.id_throws[id_break[303]] = var5;
   }

   public boolean w() {
      return id_implements[184];
   }

   public rjU_2 rv() {
      return (rjU_2)this.id_throws[id_break[540]];
   }

   public boolean u() {
      return id_implements[225];
   }

   public boolean rn() {
      boolean var1 = (Boolean)this.id_throws[id_break[512]];
      Boolean var6 = id_implements[231];
      this.id_throws[id_break[513]] = var6;
      return var1;
   }

   public Set<String> y() {
      return (Set<String>)this.id_throws[id_break[50]];
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
      boolean var2 = ((rYB)this.id_throws[id_break[466]]).E() == rYB.id_throws && var1.E() == rYB.id_byte ? id_implements[210] : id_implements[211];
      boolean var3 = var1.E() == rYB.id_throws ? id_implements[212] : id_implements[213];
      if (!var2 && !var3) {
         boolean var17 = var1.E() == rYB.id_protected ? id_implements[214] : id_implements[215];
         if (((rYB)this.id_throws[id_break[467]]).E() != rYB.id_protected && !var17) {
            return null;
         } else {
            roE_2 var5 = var1.id_instanceof();
            double var6 = Math.max(id_finally[173], var5.id_throws() + id_finally[174]);
            double var8 = Math.max(id_finally[175], var5.id_case() + id_finally[176]);
            double var10 = Math.min(id_finally[177], var5.id_catch() - id_finally[178]);
            double var12 = Math.min(id_finally[179], var5.id_private() - id_finally[180]);
            double var14 = rRJ.id_class(((rYB)this.id_throws[id_break[468]]).id_default(), var1.id_default());
            rfH_2 var16 = new rfH_2(rfU_2.id_class(this.rx() * var14, var6, var10), this.re(), rfU_2.id_class(this.BO() * var14, var8, var12));
            return this.id_class(var1, var16, var17).map(var2x -> {
               xc_3 var3x = ((rYB)this.id_throws[7]).id_byte((rfH_2)this.id_throws[61]);
               rpB_2 var4x;
               rjU_2 var5x;
               if (var3x.id_break(rCT.id_char)) {
                  var4x = var3x.id_byte(rCT.id_char);
                  rqT_2 var6x = rqp_3.id_class((rfH_2)this.id_throws[61], var4x, 21, rpB_2.Y, 21, var2xx -> ((rYB)this.id_throws[7]).id_byte(var2xx) == var3x);
                  var5x = this.id_class(var4x, var6x);
               } else {
                  var4x = rpB_2.X;
                  var5x = new rjU_2(0.5, 0.0, 0.0);
               }

               return WB.id_class(var1, var2x, var4x, var5x, this.a_(this.Pb()), this.rv(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
            }).orElse(null);
         }
      } else {
         rfH_2 var4;
         if (var3) {
            var4 = rrEm_1.id_this;
         } else {
            var4 = var1.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, var1.X());
         }

         return new WP(
            new rjU_2((double)var4.b_() + id_finally[181], (double)var4.c_(), (double)var4.d_() + id_finally[182]),
            this.rv(),
            (Float)this.id_throws[id_break[469]],
            (Float)this.id_throws[id_break[470]]
         );
      }
   }

   public rjG_2 id_break(double var1, float var3, boolean var4) {
      return this.id_class(this.id_break(var3), var1, var3, var4, var0 -> {
         Popka var1x = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().q();
         return var1x == null || !var1x.aJ_();
      });
   }

   public void id_break(rhN_2 var1) {
   }

   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return id_implements[109];
      } else {
         this.rf();
         return id_implements[110];
      }
   }

   public float id_break(double var1, double var3, double var5) {
      float var7 = (float)(this.rx() - var1);
      float var8 = (float)(this.re() - var3);
      float var9 = (float)(this.BO() - var5);
      return rfU_2.id_byte(var7 * var7 + var8 * var8 + var9 * var9);
   }

   public void id_break(rgP_2 var1) {
      ((rmE_2)this.id_throws[id_break[480]]).id_break((rut_3<Optional<rgP_2>>)id_case[id_break[481]], Optional.ofNullable(var1));
   }

   public double id_break(rlb_3<rXs_1> var1) {
      return ((Object2DoubleMap)this.id_throws[id_break[530]]).getDouble(var1);
   }

   private boolean id_break(rfl_3 var1) {
      return ((rYB)this.id_throws[id_break[110]]).a_(this, var1) && !((rYB)this.id_throws[id_break[111]]).id_protected(var1)
         ? id_implements[27]
         : id_implements[28];
   }

   public void id_break(rfH_2 var1, xc_3 var2) {
      if (!var2.id_byte().id_class()) {
         xc_3 var3 = ((rYB)this.id_throws[id_break[198]]).id_byte(var1.id_final());
         zr_3 var4 = var3.id_class(xu_3.Pq) ? var3.id_package() : var2.id_package();
         this.id_class(var4.id_protected(), var4.id_class() * id_protected[17], var4.id_break());
      }
   }

   public void id_break(double var1, double var3, double var5, float var7, float var8) {
      this.id_class(var1, var3, var5, var7, var8, id_implements[105]);
   }

   private boolean id_break(rjU_2 var1, boolean var2, boolean var3) {
      rfl_3 var4 = this.rN();
      rjm_3 var5 = rjm_3.id_class(this);
      rjC_2 var6 = ((rYB)this.id_throws[id_break[154]]).id_instanceof().id_byte();
      Stream var7 = rjw_3.id_byte(var6, rjw_3.id_class(var4.id_break(id_finally[22])), rjN_2.id_implements) ? Stream.empty() : Stream.of(var6);
      Stream var8 = ((rYB)this.id_throws[id_break[155]]).id_class(this, var4.id_break(var1), var0 -> true);
      rqJ_2 var9 = new rqJ_2(Stream.concat(var8, var7));
      rjU_2 var10 = var1.id_catch() == id_finally[23] ? var1 : id_class(this, var1, var4, (rYB)this.id_throws[id_break[156]], var5, var9, var2, var3);
      boolean var11 = var1.id_break != var10.id_break ? id_implements[39] : id_implements[40];
      boolean var12 = var1.id_byte != var10.id_byte ? id_implements[41] : id_implements[42];
      boolean var13 = var1.id_protected != var10.id_protected ? id_implements[43] : id_implements[44];
      boolean var14 = !this.id_throws[id_break[157]] && (!var12 || !(var1.id_byte < id_finally[24])) ? id_implements[46] : id_implements[45];
      if ((Float)this.id_throws[id_break[158]] > id_protected[15] && var14 && (var11 || var13)) {
         rjU_2 var15 = id_class(
            this,
            new rjU_2(var1.id_break, (double)((Float)this.id_throws[id_break[159]]).floatValue(), var1.id_protected),
            var4,
            (rYB)this.id_throws[id_break[160]],
            var5,
            var9,
            var2,
            var3
         );
         rjU_2 var16 = id_class(
            this,
            new rjU_2(id_finally[25], (double)((Float)this.id_throws[id_break[161]]).floatValue(), id_finally[26]),
            var4.id_break(var1.id_break, id_finally[27], var1.id_protected),
            (rYB)this.id_throws[id_break[162]],
            var5,
            var9,
            var2,
            var3
         );
         if (var16.id_byte < (double)((Float)this.id_throws[id_break[163]]).floatValue()) {
            rjU_2 var17 = id_class(
                  this,
                  new rjU_2(var1.id_break, id_finally[28], var1.id_protected),
                  var4.id_protected(var16),
                  (rYB)this.id_throws[id_break[164]],
                  var5,
                  var9,
                  var2,
                  var3
               )
               .id_throws(var16);
            if (id_case(var17) > id_case(var15)) {
               var15 = var17;
            }
         }

         if (id_case(var15) > id_case(var10)) {
            var15.id_throws(
               id_class(
                  this,
                  new rjU_2(id_finally[29], -var15.id_byte + var1.id_byte, id_finally[30]),
                  var4.id_protected(var15),
                  (rYB)this.id_throws[id_break[165]],
                  var5,
                  var9,
                  var2,
                  var3
               )
            );
         }
      }

      return var1.id_byte != var10.id_byte && var1.id_byte < id_finally[31] ? id_implements[47] : id_implements[48];
   }

   public rjU_2 id_break(float var1) {
      return this.id_byte(this.id_case(var1), this.id_throws(var1));
   }

   public void id_break(int var1, boolean var2) {
      byte var3 = ((rmE_2)this.id_throws[id_break[429]]).<Byte>id_class((rut_3<Byte>)id_case[id_break[430]]);
      if (var2) {
         ((rmE_2)this.id_throws[id_break[431]]).id_break((rut_3<Byte>)id_case[id_break[432]], (byte)(var3 | id_implements[195] << var1));
      } else {
         ((rmE_2)this.id_throws[id_break[433]]).id_break((rut_3<Byte>)id_case[id_break[434]], (byte)(var3 & (id_implements[196] << var1 ^ id_private[33])));
      }
   }

   public double id_break(rfH_2 var1) {
      double var2 = (double)var1.b_() + id_finally[131];
      double var4 = (double)var1.c_() + id_finally[132];
      double var6 = (double)var1.d_() + id_finally[133];
      double var8 = rfU_2.id_class(this.re() + (double)this.id_byte(this.Pb()) - var4, id_finally[134], id_finally[135]);
      double var10 = rfU_2.id_class(this.rx() - var2, id_finally[136], id_finally[137]);
      double var12 = rfU_2.id_class(this.BO() - var6, id_finally[138], id_finally[139]);
      return this.id_new(id_protected[47]).id_byte(var2 + var10, var4 + var8, var6 + var12);
   }

   public double id_break(double var1) {
      return this.id_catch((id_finally[201] * ((Random)this.id_throws[id_break[546]]).nextDouble() - id_finally[202]) * var1);
   }

   public abstract void id_break(rcd_3 var1);

   public void id_throws(double var1, double var3, double var5) {
      if ((rYB)this.id_throws[id_break[490]] instanceof rrEm_1) {
         rfj_3 var7 = new rfj_3(new rfH_2(var1, var3, var5));
         ((rrEm_1)((rYB)this.id_throws[id_break[491]])).id_else().id_class(rrEl_1.id_catch, var7, id_implements[226], this.V());
         ((rYB)this.id_throws[id_break[492]]).id_throws(var7.id_break, var7.id_byte);
         this.id_case(var1, var3, var5);
      }
   }

   public float id_throws(float var1, float var2) {
      return var2 == id_protected[51] ? var1 : rfU_2.id_catch(var2, (Float)this.id_throws[id_break[307]], var1);
   }

   public float id_throws(float var1) {
      return var1 == id_protected[53]
         ? (Float)this.id_throws[id_break[309]]
         : rfU_2.id_catch(var1, (Float)this.id_throws[id_break[310]], (Float)this.id_throws[id_break[311]]);
   }

   public void id_throws(an_3 var1) {
      rcd_3 var2 = var1.id_case(new rcd_3());
      var2.id_continue(id_class[53]);
      this.id_throws(var2);
      Integer var7 = (Integer)var1.id_throws[id_break[457]];
      this.id_throws[id_break[458]] = var7;
      rfH_2 var8 = (rfH_2)var1.id_throws[id_break[459]];
      this.id_throws[id_break[460]] = var8;
   }

   public void id_throws(rcd_3 var1) {
      try {
         rcy_3 var2 = var1.id_protected(id_class[25], id_private[15]);
         rcy_3 var31 = var1.id_protected(id_class[26], id_private[16]);
         rcy_3 var32 = var1.id_protected(id_class[27], id_private[17]);
         double var5 = var31.id_catch(id_implements[127]);
         double var7 = var31.id_catch(id_implements[128]);
         double var9 = var31.id_catch(id_private[18]);
         this.id_catch(
            Math.abs(var5) > id_finally[150] ? id_finally[151] : var5,
            Math.abs(var7) > id_finally[152] ? id_finally[153] : var7,
            Math.abs(var9) > id_finally[154] ? id_finally[155] : var9
         );
         this.id_native(var2.id_catch(id_implements[129]), var2.id_catch(id_implements[130]), var2.id_catch(id_private[19]));
         Float var18 = var32.id_private(id_implements[131]);
         this.id_throws[id_break[341]] = var18;
         Float var19 = var32.id_private(id_implements[132]);
         this.id_throws[id_break[342]] = var19;
         Float var20 = (Float)this.id_throws[id_break[343]];
         this.id_throws[id_break[344]] = var20;
         Float var21 = (Float)this.id_throws[id_break[345]];
         this.id_throws[id_break[346]] = var21;
         this.id_implements((Float)this.id_throws[id_break[347]]);
         this.id_native((Float)this.id_throws[id_break[348]]);
         Float var22 = var1.id_finally(id_class[28]);
         this.id_throws[id_break[349]] = var22;
         Integer var23 = Integer.valueOf(var1.id_catch(id_class[29]));
         this.id_throws[id_break[350]] = var23;
         this.id_throws(var1.id_catch(id_class[30]));
         Boolean var24 = var1.id_new(id_class[31]);
         this.id_throws[id_break[351]] = var24;
         Boolean var25 = var1.id_new(id_class[32]);
         this.id_throws[id_break[352]] = var25;
         Integer var26 = var1.id_private(id_class[33]);
         this.id_throws[id_break[353]] = var26;
         if (var1.id_break(id_class[34])) {
            UUID var27 = var1.id_class(id_class[35]);
            this.id_throws[id_break[354]] = var27;
            String var28 = ((UUID)this.id_throws[id_break[355]]).toString();
            this.id_throws[id_break[356]] = var28;
         }

         if (!Double.isFinite(this.rx()) || !Double.isFinite(this.re()) || !Double.isFinite(this.BO())) {
            throw new IllegalStateException(id_class[46]);
         } else if (Double.isFinite((double)((Float)this.id_throws[id_break[357]]).floatValue())
            && Double.isFinite((double)((Float)this.id_throws[id_break[358]]).floatValue())) {
            this.PX();
            this.id_case((Float)this.id_throws[id_break[359]], (Float)this.id_throws[id_break[360]]);
            if (var1.id_byte(id_class[36], id_private[20])) {
               String var11 = var1.id_native(id_class[37]);

               try {
                  this.id_break(rgB_2.id_class(var11));
               } catch (Exception var29) {
                  ((Logger)id_case[id_break[361]]).warn(id_class[38], var11, var29);
               }
            }

            this.id_final(var1.id_new(id_class[39]));
            this.id_extends(var1.id_new(id_class[40]));
            this.id_finally(var1.id_new(id_class[41]));
            this.id_implements(var1.id_new(id_class[42]));
            if (var1.id_byte(id_class[43], id_private[21])) {
               ((Set)this.id_throws[id_break[362]]).clear();
               rcy_3 var33 = var1.id_protected(id_class[44], id_private[22]);
               int var12 = Math.min(var33.size(), id_break[363]);

               for (int var13 = id_implements[133]; var13 < var12; var13++) {
                  ((Set)this.id_throws[id_break[364]]).add(var33.id_implements(var13));
               }
            }

            this.id_break(var1);
            if (this.BZ()) {
               this.PX();
            }
         } else {
            throw new IllegalStateException(id_class[45]);
         }
      } catch (Throwable var30) {
         KY var3 = KY.id_class(var30, id_class[47]);
         Ko_1 var4 = var3.id_class(id_class[48]);
         this.id_class(var4);
         throw new KU(var3);
      }
   }

   public void id_throws(rjU_2 var1) {
      this.id_throws[id_break[542]] = var1;
   }

   public double id_throws(double var1) {
      return ((rjU_2)this.id_throws[id_break[553]]).id_protected + (double)this.PN() * var1;
   }

   public void id_throws(int var1) {
      ((rmE_2)this.id_throws[id_break[438]]).id_break((rut_3<Integer>)id_case[id_break[439]], var1);
   }

   public boolean id_throws(iM_2 var1) {
      return !((rYB)this.id_throws[id_break[383]]).a_(this, this.id_case(var1).id_break(id_finally[161])) ? id_implements[155] : id_implements[156];
   }

   public boolean rt() {
      return id_implements[203];
   }

   public xd_3 Pd() {
      return (xd_3)this.id_throws[id_break[575]];
   }

   public rjU_2 Ps() {
      return (rjU_2)this.id_throws[id_break[535]];
   }

   public boolean Pe() {
      return (Boolean)this.id_throws[id_break[566]];
   }

   public boolean Pc() {
      return this.h();
   }

   public boolean Po() {
      an_3 var1 = this.rU();
      if (var1 instanceof rhd_3) {
         return ((rhd_3)var1).id_char();
      } else {
         return !((rYB)this.id_throws[id_break[519]]).id_continue ? id_implements[247] : id_implements[248];
      }
   }

   public void Pi() {
      Boolean var5 = id_implements[209];
      this.id_throws[id_break[465]] = var5;
   }

   public boolean Pf() {
      return !this.rT() && !this.id_int() ? id_implements[76] : id_implements[75];
   }

   public boolean W() {
      return this.id_throws[id_break[220]] && this.rT() ? id_implements[81] : id_implements[82];
   }

   @Override
   public boolean H() {
      return id_implements[254];
   }

   public boolean R() {
      return this instanceof iB_2;
   }

   public void PD() {
      Boolean var5 = id_implements[13];
      this.id_throws[id_break[62]] = var5;
   }

   public boolean BE() {
      boolean var1 = (Boolean)this.id_throws[id_break[514]];
      Boolean var6 = id_implements[232];
      this.id_throws[id_break[515]] = var6;
      return var1;
   }

   public void id_finally(boolean var1) {
      ((rmE_2)this.id_throws[id_break[208]]).id_break((rut_3<Boolean>)id_case[id_break[209]], var1);
   }

   public boolean id_finally(int var1) {
      return (((rmE_2)this.id_throws[id_break[427]]).<Byte>id_class((rut_3<Byte>)id_case[id_break[428]]) & id_implements[192] << var1) != 0
         ? id_implements[193]
         : id_implements[194];
   }

   public boolean id_finally(double var1, double var3, double var5) {
      return this.id_break(this.rN().id_protected(var1, var3, var5));
   }

   public rjU_2 id_finally(float var1) {
      double var2 = rfU_2.id_protected((double)var1, (Double)this.id_throws[id_break[319]], this.rx());
      double var4 = rfU_2.id_protected((double)var1, (Double)this.id_throws[id_break[320]], this.re());
      double var6 = rfU_2.id_protected((double)var1, (Double)this.id_throws[id_break[321]], this.BO());
      return new rjU_2(var2, var4, var6);
   }

   public boolean id_finally(an_3 var1) {
      return id_implements[204];
   }

   public void id_catch(boolean var1) {
      Boolean var6 = var1;
      this.id_throws[id_break[454]] = var6;
   }

   public void id_catch(rjU_2 var1) {
      this.id_throws[id_break[45]] = var1;
   }

   public boolean id_catch(int var1) {
      return this.id_synchronized() >= var1 ? id_implements[251] : id_implements[252];
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
      return ((rjU_2)this.id_throws[id_break[545]]).id_break + (double)this.PN() * var1;
   }

   public rjU_2 id_catch(float var1, float var2) {
      return this.id_byte(var1 - id_protected[56], var2);
   }

   public void id_catch(an_3 var1) {
      this.id_class(var1, an_3::id_new);
   }

   public float id_extends(float var1) {
      return id_protected[76];
   }

   public void id_extends(boolean var1) {
      ((rmE_2)this.id_throws[id_break[204]]).id_break((rut_3<Boolean>)id_case[id_break[205]], var1);
   }

   public void id_extends(double var1, double var3, double var5) {
      this.id_catch(var1, var3, var5);
   }

   public String id_extends() {
      return (String)this.id_throws[id_break[572]];
   }

   public void id_extends(an_3 var1) {
      if (var1.ra() != this) {
         throw new IllegalStateException(id_class[49]);
      } else {
         if (!((rYB)this.id_throws[id_break[389]]).id_continue && var1 instanceof rhd_3 && !(this.rU() instanceof rhd_3)) {
            ((List)this.id_throws[id_break[390]]).add(id_implements[158], var1);
         } else {
            ((List)this.id_throws[id_break[391]]).add(var1);
         }
      }
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{
         LogManager.getLogger(),
         new AtomicInteger(),
         Collections.emptyList(),
         new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
         1.0,
         rmE_2.id_class(an_3.class, ruw_3.id_class),
         rmE_2.id_class(an_3.class, ruw_3.id_break),
         rmE_2.id_class(an_3.class, ruw_3.id_case),
         rmE_2.id_class(an_3.class, ruw_3.id_implements),
         rmE_2.id_class(an_3.class, ruw_3.id_implements),
         rmE_2.id_class(an_3.class, ruw_3.id_implements),
         rmE_2.id_class(an_3.class, ruw_3.id_super)
      };
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
      int var2 = var1 * id_private[7];
      if (this instanceof iB_2) {
         var2 = aM_2.id_class((iB_2)this, var2);
      }

      if ((Integer)this.id_throws[id_break[107]] < var2) {
         this.id_protected(var2);
      }
   }

   public void id_case(float var1, float var2) {
      Float var7 = var1 % id_protected[3];
      this.id_throws[id_break[73]] = var7;
      Float var8 = var2 % id_protected[4];
      this.id_throws[id_break[74]] = var8;
   }

   public static void id_case(double var0) {
      Double var6 = var0;
      id_case[id_break[479]] = var6;
   }

   public rfl_3 id_case(iM_2 var1) {
      ap_3 var2 = this.a_(var1);
      float var3 = var2.id_class / id_protected[67];
      rjU_2 var4 = new rjU_2(this.rx() - (double)var3, this.re(), this.BO() - (double)var3);
      rjU_2 var5 = new rjU_2(this.rx() + (double)var3, this.re() + (double)var2.id_break, this.BO() + (double)var3);
      return new rfl_3(var4, var5);
   }

   public boolean id_case(an_3 var1) {
      return this.Bh().size() < id_implements[159] ? id_implements[160] : id_implements[161];
   }

   public rcd_3 id_case(rcd_3 var1) {
      try {
         if ((an_3)this.id_throws[id_break[327]] != null) {
            String var10001 = id_class[5];
            double[] var10003 = new double[id_private[8]];
            var10003[id_implements[119]] = ((an_3)this.id_throws[id_break[328]]).rx();
            var10003[id_implements[120]] = this.re();
            var10003[id_private[9]] = ((an_3)this.id_throws[id_break[329]]).BO();
            var1.id_class(var10001, this.id_class(var10003));
         } else {
            String var14 = id_class[6];
            double[] var17 = new double[id_private[10]];
            var17[id_implements[121]] = this.rx();
            var17[id_implements[122]] = this.re();
            var17[id_private[11]] = this.BO();
            var1.id_class(var14, this.id_class(var17));
         }

         rjU_2 var2 = this.rv();
         String var15 = id_class[7];
         double[] var18 = new double[id_private[12]];
         var18[id_implements[123]] = var2.id_break;
         var18[id_implements[124]] = var2.id_byte;
         var18[id_private[13]] = var2.id_protected;
         var1.id_class(var15, this.id_class(var18));
         var15 = id_class[8];
         float[] var19 = new float[id_private[14]];
         var19[id_implements[125]] = (Float)this.id_throws[id_break[330]];
         var19[id_implements[126]] = (Float)this.id_throws[id_break[331]];
         var1.id_class(var15, this.id_class(var19));
         var1.id_class(id_class[9], (Float)this.id_throws[id_break[332]]);
         var1.id_class(id_class[10], (short)((Integer)this.id_throws[id_break[333]]).intValue());
         var1.id_class(id_class[11], (short)this.PA());
         var1.id_class(id_class[12], (Boolean)this.id_throws[id_break[334]]);
         var1.id_class(id_class[13], (Boolean)this.id_throws[id_break[335]]);
         var1.id_break(id_class[14], (Integer)this.id_throws[id_break[336]]);
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

         if ((Boolean)this.id_throws[id_break[337]]) {
            var1.id_class(id_class[20], (Boolean)this.id_throws[id_break[338]]);
         }

         if (!((Set)this.id_throws[id_break[339]]).isEmpty()) {
            rcy_3 var10 = new rcy_3();

            for (String var6 : (Set)this.id_throws[id_break[340]]) {
               var10.add(rca_3.id_class(var6));
            }

            var1.id_class(id_class[21], var10);
         }

         this.id_class(var1);
         if (this.BP()) {
            rcy_3 var11 = new rcy_3();

            for (an_3 var13 : this.Bh()) {
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
      rYB var8 = (rYB)this.id_throws[id_break[493]];
      if (var8 instanceof rrEm_1 var7) {
         this.id_class(var1, var3, var5, (Float)this.id_throws[id_break[494]], (Float)this.id_throws[id_break[495]]);
         this.Bu().forEach(var1x -> {
            var7.id_byte(var1x);
            Boolean var8x = true;
            var1x.id_throws[67] = var8x;

            for (an_3 var3x : (List)var1x.id_throws[3]) {
               var1x.id_class(var3x, an_3::id_private);
            }
         });
      }
   }

   public static double id_case(rjU_2 var0) {
      return var0.id_break * var0.id_break + var0.id_protected * var0.id_protected;
   }

   public float id_case(float var1) {
      return var1 == id_protected[50]
         ? (Float)this.id_throws[id_break[304]]
         : rfU_2.id_catch(var1, (Float)this.id_throws[id_break[305]], (Float)this.id_throws[id_break[306]]);
   }

   public void id_const() {
      if ((an_3)this.id_throws[id_break[386]] != null) {
         an_3 var1 = (an_3)this.id_throws[id_break[387]];
         Object var6 = null;
         this.id_throws[id_break[388]] = var6;
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
      return this == var1 ? id_implements[201] : id_implements[202];
   }

   public boolean id_else(an_3 var1) {
      for (an_3 var3 : this.Bh()) {
         if (var3.equals(var1)) {
            return id_implements[244];
         }

         if (var3.id_else(var1)) {
            return id_implements[245];
         }
      }

      return id_implements[246];
   }

   public void id_implements(double var1, double var3, double var5) {
      this.id_byte(this.rv().id_break(var1, var3, var5));
      Boolean var11 = id_implements[107];
      this.id_throws[id_break[302]] = var11;
   }

   public void id_implements(int var1) {
      Integer var6 = var1;
      this.id_throws[id_break[49]] = var6;
   }

   public boolean id_implements(String var1) {
      return ((Set)this.id_throws[id_break[51]]).size() < id_break[52] && ((Set)this.id_throws[id_break[53]]).add(var1) ? id_implements[8] : id_implements[9];
   }

   public void id_implements(boolean var1) {
      Boolean var6 = var1;
      this.id_throws[id_break[420]] = var6;
      if (!((rYB)this.id_throws[id_break[421]]).id_continue) {
         this.id_break(id_private[30], (Boolean)this.id_throws[id_break[422]]);
      }
   }

   public float id_implements(an_3 var1) {
      float var2 = (float)(this.rx() - var1.rx());
      float var3 = (float)(this.re() - var1.re());
      float var4 = (float)(this.BO() - var1.BO());
      return rfU_2.id_byte(var2 * var2 + var3 * var3 + var4 * var4);
   }

   private static void id_implements() {
      id_implements = new boolean[]{
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

   public void id_implements(float var1) {
   }

   public rjK_2 id_import() {
      return new rjK_2((Float)this.id_throws[id_break[396]], (Float)this.id_throws[id_break[397]]);
   }

   private static void id_instanceof() {
      id_private = new byte[]{
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

   public void id_new(boolean var1) {
      rjU_2 var2 = this.rv();
      double var3;
      if (var1) {
         var3 = Math.max(id_finally[166], var2.id_byte - id_finally[167]);
      } else {
         var3 = Math.min(id_finally[168], var2.id_byte + id_finally[169]);
      }

      this.id_catch(var2.id_break, var3, var2.id_protected);
      Float var9 = id_protected[63];
      this.id_throws[id_break[442]] = var9;
   }

   public rjU_2 id_new(float var1) {
      if (var1 == id_protected[57]) {
         return new rjU_2(this.rx(), this.rH(), this.BO());
      } else {
         double var2 = rfU_2.id_protected((double)var1, (Double)this.id_throws[id_break[312]], this.rx());
         double var4 = rfU_2.id_protected((double)var1, (Double)this.id_throws[id_break[313]], this.re()) + (double)this.Bx();
         double var6 = rfU_2.id_protected((double)var1, (Double)this.id_throws[id_break[314]], this.BO());
         return new rjU_2(var2, var4, var6);
      }
   }

   public boolean id_new(an_3 var1) {
      return !this.h() && this.id_throws[id_break[380]] <= 0 ? id_implements[151] : id_implements[152];
   }

   private boolean id_new() {
      return ((rYB)this.id_throws[id_break[219]]).id_byte(this.Bs()).id_class(xu_3.hM);
   }

   public void id_new(double var1, double var3, double var5) {
      this.id_volatile(var1, var3, var5);
      this.id_class(((ap_3)this.id_throws[id_break[75]]).id_class(var1, var3, var5));
   }

   public void id_package(double var1, double var3, double var5) {
      double var7 = rfU_2.id_class(var1, id_finally[124], id_finally[125]);
      double var9 = rfU_2.id_class(var5, id_finally[126], id_finally[127]);
      Double var15 = var7;
      this.id_throws[id_break[281]] = var15;
      Double var16 = var3;
      this.id_throws[id_break[282]] = var16;
      Double var17 = var9;
      this.id_throws[id_break[283]] = var17;
      this.id_new(var7, var3, var9);
   }

   private static void id_package() {
      id_catch = new int[]{16777215};
   }

   public void id_package(boolean var1) {
      this.id_break(id_private[32], var1);
   }

   public void id_package(an_3 var1) {
      if (var1.ra() == this) {
         throw new IllegalStateException(id_class[50]);
      } else {
         ((List)this.id_throws[id_break[392]]).remove(var1);
         Integer var6 = Integer.valueOf(id_private[23]);
         var1.id_throws[id_break[393]] = var6;
      }
   }

   public float id_package(float var1) {
      QY var2 = QY.id_instanceof();
      return this == (cb_3)var2.id_class[id_break[573]] ? ((Hh_1)var2.id_class[id_break[574]]).id_finally().id_class(var1) : this.Bm();
   }

   public boolean id_return(an_3 var1) {
      return this.PO() == var1.PO() ? id_implements[242] : id_implements[243];
   }

   private void id_super() {
      Boolean var14 = this.id_class(rlG_2.id_break);
      this.id_throws[id_break[229]] = var14;
      Object var15 = null;
      this.id_throws[id_break[230]] = var15;
      double var1 = this.rH() - id_finally[100];
      if (this.ra() instanceof rSK var4 && !var4.W() && var4.rN().id_throws >= var1 && var4.rN().id_break <= var1) {
         return;
      }

      rfH_2 var17 = new rfH_2(this.rx(), var1, this.BO());
      rXE var5 = ((rYB)this.id_throws[id_break[231]]).id_break(var17);

      for (rlb_3 var7 : rlG_2.id_class()) {
         if (var5.id_class(var7)) {
            double var8 = (double)((float)var17.c_() + var5.id_class((rRq_1)((rYB)this.id_throws[id_break[232]]), var17));
            if (var8 > var1) {
               this.id_throws[id_break[233]] = var7;
            }

            return;
         }
      }
   }

   public boolean id_super(an_3 var1) {
      return var1.PU() && !this.id_return(var1) ? id_implements[144] : id_implements[145];
   }

   private static void id_throw() {
      id_class = new String[]{
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

   private static void id_while() {
      id_protected = new float[]{
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
      return (List)id_case[id_break[415]];
   }

   public rjU_2 id_protected(rjU_2 var1) {
      if (var1.id_catch() <= id_finally[36]) {
         return var1;
      } else {
         long var2 = ((rYB)this.id_throws[id_break[177]]).r();
         if (var2 != (Long)this.id_throws[id_break[178]]) {
            Arrays.fill((double[])this.id_throws[id_break[179]], id_finally[37]);
            Long var10 = var2;
            this.id_throws[id_break[180]] = var10;
         }

         if (var1.id_break != id_finally[38]) {
            double var12 = this.id_class(rpB_2.X, var1.id_break);
            return Math.abs(var12) <= id_finally[39] ? rjU_2.id_class : new rjU_2(var12, id_finally[40], id_finally[41]);
         } else if (var1.id_byte != id_finally[42]) {
            double var11 = this.id_class(rpB_2.Y, var1.id_byte);
            return Math.abs(var11) <= id_finally[43] ? rjU_2.id_class : new rjU_2(id_finally[44], var11, id_finally[45]);
         } else if (var1.id_protected != id_finally[46]) {
            double var4 = this.id_class(rpB_2.Z, var1.id_protected);
            return Math.abs(var4) <= id_finally[47] ? rjU_2.id_class : new rjU_2(id_finally[48], id_finally[49], var4);
         } else {
            return rjU_2.id_class;
         }
      }
   }

   public boolean id_protected(iM_2 var1) {
      return ((rYB)this.id_throws[id_break[381]]).a_(this, this.id_case(var1).id_break(id_finally[159]));
   }

   public double id_protected(an_3 var1) {
      double var2;
      double var4;
      double var6;
      if (var1 instanceof cM_2 var8) {
         double var9 = var1.rx();
         double var11 = var1.re();
         double var13 = var1.BO();
         double var15 = (Double)var8.id_break[id_break[294]];
         double var17 = (Double)var8.id_break[id_break[295]];
         double var19 = (Double)var8.id_break[id_break[296]];
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

      double var26 = (double)(var1.PN() / id_protected[45]);
      double var10 = rfU_2.id_class(this.re() + (double)this.id_byte(this.Pb()) - var4, id_finally[130], (double)var1.Bm());
      double var12 = rfU_2.id_class(this.rx() - var2, -var26, var26);
      double var14 = rfU_2.id_class(this.BO() - var6, -var26, var26);
      return this.id_new(id_protected[46]).id_byte(var2 + var12, var4 + var10, var6 + var14);
   }

   public boolean id_protected(rcd_3 var1) {
      String var2 = this.rW();
      if (!(Boolean)this.id_throws[id_break[326]] && var2 != null) {
         var1.id_class(id_class[4], var2);
         this.id_case(var1);
         return id_implements[115];
      } else {
         return id_implements[116];
      }
   }

   public void id_protected(int var1) {
      Integer var6 = var1;
      this.id_throws[id_break[108]] = var6;
   }

   public void id_protected(rfH_2 var1) {
      if (this.rZ()) {
         this.rc();
      } else {
         if (!((rYB)this.id_throws[id_break[398]]).id_continue && !var1.equals((rfH_2)this.id_throws[id_break[399]])) {
            rfH_2 var6 = var1.id_int();
            this.id_throws[id_break[400]] = var6;
         }

         Boolean var7 = id_implements[162];
         this.id_throws[id_break[401]] = var7;
      }
   }

   public rjU_2 id_protected(float var1, float var2) {
      return this.id_catch(var2, var1);
   }

   public void id_protected(double var1, double var3, double var5) {
      if (!((rYB)this.id_throws[id_break[443]]).id_continue) {
         rfH_2 var7 = new rfH_2(var1, var3, var5);
         rjU_2 var8 = new rjU_2(var1 - (double)var7.b_(), var3 - (double)var7.c_(), var5 - (double)var7.d_());
         rfw_3 var9 = new rfw_3();
         rpr_3 var10 = rpr_3.UP;
         double var11 = id_finally[170];
         rpr_3[] var10000 = new rpr_3[id_private[35]];
         var10000[id_implements[198]] = rpr_3.NORTH;
         var10000[id_implements[199]] = rpr_3.SOUTH;
         var10000[id_private[36]] = rpr_3.WEST;
         var10000[id_private[37]] = rpr_3.EAST;
         var10000[id_private[38]] = rpr_3.UP;
         rpr_3[] var13 = var10000;
         int var14 = var13.length;

         for (int var15 = id_implements[200]; var15 < var14; var15++) {
            rpr_3 var16 = var13[var15];
            var9.id_class(var7, var16);
            if (!((rYB)this.id_throws[id_break[444]]).id_byte(var9).id_new((rYB)this.id_throws[id_break[445]], var9)) {
               double var17 = var8.id_class(var16.id_final());
               double var19 = var16.id_throws() == rpG_2.POSITIVE ? id_finally[171] - var17 : var17;
               if (var19 < var11) {
                  var11 = var19;
                  var10 = var16;
               }
            }
         }

         float var21 = ((Random)this.id_throws[id_break[446]]).nextFloat() * id_protected[64] + id_protected[65];
         float var22 = (float)var10.id_throws().id_class();
         rjU_2 var23 = this.rv().id_class(id_finally[172]);
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
      return this.id_throws((id_finally[203] * ((Random)this.id_throws[id_break[554]]).nextDouble() - id_finally[204]) * var1);
   }

   public void id_private(boolean var1) {
      rjU_2 var2 = this.rv();
      double var3;
      if (var1) {
         var3 = Math.max(id_finally[162], var2.id_byte - id_finally[163]);
      } else {
         var3 = Math.min(id_finally[164], var2.id_byte + id_finally[165]);
      }

      this.id_catch(var2.id_break, var3, var2.id_protected);
   }

   public float id_private(float var1, float var2) {
      return var2 == id_protected[52] ? var1 : rfU_2.id_catch(var2, (Float)this.id_throws[id_break[308]], var1);
   }

   public boolean id_private(String var1) {
      return ((Set)this.id_throws[id_break[54]]).remove(var1);
   }

   public void id_private(float var1) {
      this.id_class(
         this.BB(),
         var1,
         id_protected[18] + (((Random)this.id_throws[id_break[199]]).nextFloat() - ((Random)this.id_throws[id_break[200]]).nextFloat()) * id_protected[19]
      );
   }

   public void id_private(int var1) {
      Integer var6 = var1;
      this.id_throws[id_break[571]] = var6;
   }

   public void id_private(double var1, double var3, double var5) {
      this.id_class(var1, var3, var5, (Float)this.id_throws[id_break[284]], (Float)this.id_throws[id_break[285]]);
   }

   public float id_private(an_3 var1) {
      float var2 = (float)(this.rx() - var1.rx());
      float var3 = (float)(this.BO() - var1.BO());
      return rfU_2.id_byte(var2 * var2 + var3 * var3);
   }

   private void id_abstract() {
      if (this.id_throws == null) {
         this.id_throws = new Object[id_private[60]];
         Object[] var1 = this.id_throws;
         var1[id_implements[262]] = Integer.valueOf(id_implements[263]);
         var1[id_private[61]] = id_implements[264];
         var1[id_private[62]] = Integer.valueOf(id_implements[265]);
         var1[id_private[63]] = id_implements[266];
         var1[id_private[64]] = id_finally[215];
         var1[id_private[65]] = id_finally[216];
         var1[id_private[66]] = id_finally[217];
         var1[id_private[67]] = id_protected[77];
         var1[id_private[68]] = id_protected[78];
         var1[id_private[69]] = id_protected[79];
         var1[id_private[70]] = id_protected[80];
         var1[id_private[71]] = id_implements[267];
         var1[id_private[72]] = id_implements[268];
         var1[id_private[73]] = id_implements[269];
         var1[id_private[74]] = id_implements[270];
         var1[id_private[75]] = id_implements[271];
         var1[id_private[76]] = id_implements[272];
         var1[id_private[77]] = id_implements[273];
         var1[id_private[78]] = id_protected[81];
         var1[id_private[79]] = id_protected[82];
         var1[id_private[80]] = id_protected[83];
         var1[id_private[81]] = id_protected[84];
         var1[id_private[82]] = id_protected[85];
         var1[id_private[83]] = id_protected[86];
         var1[id_private[84]] = id_finally[218];
         var1[id_private[85]] = id_finally[219];
         var1[id_private[86]] = id_finally[220];
         var1[id_private[87]] = id_protected[87];
         var1[id_private[88]] = id_implements[274];
         var1[id_private[89]] = id_protected[88];
         var1[id_private[90]] = Integer.valueOf(id_implements[275]);
         var1[id_private[91]] = Integer.valueOf(id_implements[276]);
         var1[id_private[92]] = id_implements[277];
         var1[id_private[93]] = id_implements[278];
         var1[id_private[94]] = Integer.valueOf(id_implements[279]);
         var1[id_private[95]] = id_implements[280];
         var1[id_private[96]] = id_implements[281];
         var1[id_private[97]] = Integer.valueOf(id_implements[282]);
         var1[id_private[98]] = Integer.valueOf(id_implements[283]);
         var1[id_private[99]] = Integer.valueOf(id_implements[284]);
         var1[id_private[100]] = id_implements[285];
         var1[id_private[101]] = id_implements[286];
         var1[id_private[102]] = id_implements[287];
         var1[id_private[103]] = Integer.valueOf(id_implements[288]);
         var1[id_private[104]] = id_implements[289];
         var1[id_private[105]] = Integer.valueOf(id_implements[290]);
         var1[id_private[106]] = id_implements[291];
         var1[id_private[107]] = id_implements[292];
         var1[id_private[108]] = id_implements[293];
         var1[id_private[109]] = id_extends[0];
         var1[id_private[110]] = id_protected[89];
         var1[id_private[111]] = id_protected[90];
         var1[id_private[112]] = Integer.valueOf(id_implements[294]);
         var1[id_private[113]] = id_implements[295];
         var1[id_private[114]] = id_implements[296];
      }
   }

   private static void id_final() {
      id_finally = new double[]{
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

   public boolean id_final(double var1, double var3, double var5) {
      double var7 = this.rx() - var1;
      double var9 = this.re() - var3;
      double var11 = this.BO() - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.id_class(var13);
   }

   public void id_final(boolean var1) {
      ((rmE_2)this.id_throws[id_break[486]]).id_break((rut_3<Boolean>)id_case[id_break[487]], var1);
   }

   public float id_final(float var1) {
      return id_protected[20];
   }

   public boolean id_final(an_3 var1) {
      return this.id_class(var1.BG());
   }

   public void id_volatile(boolean var1) {
      this.id_break(id_implements[176], var1);
   }

   public void id_volatile(an_3 var1) {
   }

   public rjU_2 id_volatile(float var1) {
      return this.id_new(var1);
   }

   public void id_volatile(double var1, double var3, double var5) {
      if (((rjU_2)this.id_throws[id_break[555]]).id_break != var1
         || ((rjU_2)this.id_throws[id_break[556]]).id_byte != var3
         || ((rjU_2)this.id_throws[id_break[557]]).id_protected != var5) {
         rjU_2 var14 = new rjU_2(var1, var3, var5);
         this.id_throws[id_break[558]] = var14;
         int var7 = rfU_2.id_byte(var1);
         int var8 = rfU_2.id_byte(var3);
         int var9 = rfU_2.id_byte(var5);
         if (var7 != ((rfH_2)this.id_throws[id_break[559]]).b_()
            || var8 != ((rfH_2)this.id_throws[id_break[560]]).c_()
            || var9 != ((rfH_2)this.id_throws[id_break[561]]).d_()) {
            rfH_2 var15 = new rfH_2(var7, var8, var9);
            this.id_throws[id_break[562]] = var15;
         }

         Boolean var16 = id_implements[259];
         this.id_throws[id_break[563]] = var16;
      }
   }

   public boolean id_synchronized(an_3 var1) {
      for (an_3 var3 : this.Bh()) {
         if (var3.equals(var1)) {
            return id_implements[233];
         }
      }

      return id_implements[234];
   }

   public int id_synchronized() {
      return id_implements[250];
   }

   public void id_native(boolean var1) {
      this.id_break(id_private[29], var1);
   }

   public void id_native(an_3 var1) {
      this.id_class(var1.rx(), var1.re(), var1.BO(), (Float)var1.id_throws[id_break[455]], (Float)var1.id_throws[id_break[456]]);
   }

   public void id_native(double var1, double var3, double var5) {
      this.id_volatile(var1, var3, var5);
      Double var11 = var1;
      this.id_throws[id_break[288]] = var11;
      Double var12 = var3;
      this.id_throws[id_break[289]] = var12;
      Double var13 = var5;
      this.id_throws[id_break[290]] = var13;
      Double var14 = var1;
      this.id_throws[id_break[291]] = var14;
      Double var15 = var3;
      this.id_throws[id_break[292]] = var15;
      Double var16 = var5;
      this.id_throws[id_break[293]] = var16;
   }

   public void id_native(float var1) {
   }

   public boolean id_native() {
      return id_implements[7];
   }

   public rfH_2 PI() {
      return new rfH_2(
         ((rjU_2)this.id_throws[id_break[175]]).id_break, this.rN().id_break - id_finally[35], ((rjU_2)this.id_throws[id_break[176]]).id_protected
      );
   }

   public int rp() {
      return id_private[45];
   }

   public float rl() {
      float var1 = ((rYB)this.id_throws[id_break[171]]).id_byte(this.Bs()).id_break().id_int();
      float var2 = ((rYB)this.id_throws[id_break[172]]).id_byte(this.PI()).id_break().id_int();
      return (double)var1 == id_finally[33] ? var2 : var1;
   }

   public void A() {
      this.id_byte(rjU_2.id_class);
      this.id_this();
      if (this.Pm()) {
         this.ra().id_catch(this);
      }
   }

   public boolean rw() {
      return ((rmE_2)this.id_throws[id_break[206]]).<Boolean>id_class((rut_3<Boolean>)id_case[id_break[207]]);
   }

   public boolean rg() {
      return (Boolean)this.id_throws[id_break[453]];
   }

   public int ru() {
      return (Integer)this.id_throws[id_break[109]];
   }

   public boolean T() {
      return this.Pz() && !this.id_native() ? id_implements[223] : id_implements[224];
   }

   public UUID ro() {
      return (UUID)this.id_throws[id_break[475]];
   }

   public double re() {
      return ((rjU_2)this.id_throws[id_break[547]]).id_byte;
   }

   public aI_2<?> BC() {
      return (aI_2<?>)this.id_throws[id_break[47]];
   }

   @Override
   public rjU_2 rr() {
      return (rjU_2)this.id_throws[id_break[567]];
   }

   public rjU_2 rm() {
      return (rjU_2)this.id_throws[id_break[46]];
   }

   public float rq() {
      xd_3 var1 = ((rYB)this.id_throws[id_break[173]]).id_byte(this.Bs()).id_break();
      float var2 = var1.id_package();
      if (var1 != xu_3.id_try && var1 != xu_3.hM) {
         return (double)var2 == id_finally[34] ? ((rYB)this.id_throws[id_break[174]]).id_byte(this.PI()).id_break().id_package() : var2;
      } else {
         return var2;
      }
   }

   public void rc() {
      Integer var5 = this.rj();
      this.id_throws[id_break[103]] = var5;
   }

   public int ri() {
      return id_break[435];
   }

   public boolean PM() {
      ((Object2DoubleMap)this.id_throws[id_break[221]]).clear();
      this.rd();
      double var1 = ((rYB)this.id_throws[id_break[222]]).id_default().id_protected() ? id_finally[97] : id_finally[98];
      boolean var3 = this.id_class(rlG_2.id_byte, var1);
      return !this.rT() && !var3 ? id_implements[88] : id_implements[87];
   }

   public an_3 ra() {
      return (an_3)this.id_throws[id_break[520]];
   }

   public boolean PZ() {
      return !this.rT() && !this.ry() ? id_implements[72] : id_implements[71];
   }

   public boolean Pm() {
      return this.ra() != null ? id_implements[171] : id_implements[172];
   }

   public boolean ry() {
      return !this.id_throws[id_break[262]] && ((Object2DoubleMap)this.id_throws[id_break[263]]).getDouble(rlG_2.id_byte) > id_finally[120]
         ? id_implements[103]
         : id_implements[104];
   }

   public gy_3 PL() {
      return new gy_3(
         this,
         this.Ps(),
         this.id_import(),
         (rYB)this.id_throws[id_break[521]] instanceof rrEm_1 ? (rrEm_1)((rYB)this.id_throws[id_break[522]]) : null,
         this.id_synchronized(),
         this.g().getString(),
         this.L_(),
         ((rYB)this.id_throws[id_break[523]]).id_const(),
         this
      );
   }

   public boolean PJ() {
      return id_implements[68];
   }

   public PX rO() {
      return new PX((Float)this.id_throws[id_break[568]], (Float)this.id_throws[id_break[569]]);
   }

   public float rQ() {
      return (float)((int)((Float)this.id_throws[id_break[194]]).floatValue() + id_implements[67]);
   }

   public iM_2 Pb() {
      return ((rmE_2)this.id_throws[id_break[65]]).id_class((rut_3<iM_2>)id_case[id_break[66]]);
   }

   public boolean Pk() {
      return !this.rT() && !this.id_int() && !this.id_new() ? id_implements[78] : id_implements[77];
   }

   public void Pn() {
      if (this.Pm() && (Boolean)this.ra().id_throws[id_break[80]]) {
         this.BH();
      }

      if ((Integer)this.id_throws[id_break[81]] > 0) {
         Integer var5 = (Integer)this.id_throws[id_break[82]] - id_implements[16];
         this.id_throws[id_break[83]] = var5;
      }

      rjU_2 var6 = (rjU_2)this.id_throws[id_break[84]];
      this.id_throws[id_break[85]] = var6;
      Float var7 = (Float)this.id_throws[id_break[86]];
      this.id_throws[id_break[87]] = var7;
      Float var8 = (Float)this.id_throws[id_break[88]];
      this.id_throws[id_break[89]] = var8;
      Float var9 = (Float)this.id_throws[id_break[90]];
      this.id_throws[id_break[91]] = var9;
      this.PB();
      if (this.B()) {
         this.Bb();
      }

      this.PM();
      this.id_super();
      this.p();
      if (((rYB)this.id_throws[id_break[92]]).id_continue) {
         this.rE();
      } else if ((Integer)this.id_throws[id_break[93]] > 0) {
         if (this.q()) {
            this.id_protected((Integer)this.id_throws[id_break[94]] - id_private[4]);
            if ((Integer)this.id_throws[id_break[95]] < 0) {
               this.rE();
            }
         } else {
            if ((Integer)this.id_throws[id_break[96]] % id_private[5] == 0 && !this.ry()) {
               this.id_break(rye_3.id_byte, id_protected[5]);
            }

            this.id_protected((Integer)this.id_throws[id_break[97]] - id_implements[17]);
         }
      }

      if (this.ry()) {
         this.rb();
         Float var10 = (Float)this.id_throws[id_break[98]] * id_protected[6];
         this.id_throws[id_break[99]] = var10;
      }

      if (this.re() < id_finally[9]) {
         this.PQ();
      }

      if (!((rYB)this.id_throws[id_break[100]]).id_continue) {
         this.id_break(id_implements[18], this.id_throws[id_break[101]] > 0 ? id_implements[19] : id_implements[20]);
      }

      Boolean var11 = id_implements[21];
      this.id_throws[id_break[102]] = var11;
   }

   public void PC() {
      rfl_3 var1 = this.rN();
      this.id_volatile((var1.id_class + var1.id_protected) / id_finally[88], var1.id_break, (var1.id_byte + var1.id_case) / id_finally[89]);
   }

   public xc_3 Pl() {
      return ((rYB)this.id_throws[id_break[252]]).id_byte(this.BS());
   }

   public int PA() {
      return ((rmE_2)this.id_throws[id_break[436]]).<Integer>id_class((rut_3<Integer>)id_case[id_break[437]]);
   }

   public boolean Pz() {
      boolean var1 = (rYB)this.id_throws[id_break[417]] != null && ((rYB)this.id_throws[id_break[418]]).id_continue ? id_implements[166] : id_implements[167];
      return this.q() || this.id_throws[id_break[419]] <= 0 && (!var1 || !this.id_finally(id_implements[168])) ? id_implements[170] : id_implements[169];
   }

   public boolean PH() {
      return id_implements[175];
   }

   public boolean rJ() {
      return this.D();
   }

   public void rA() {
   }

   public boolean Py() {
      return this.id_finally(id_private[28]);
   }

   public boolean Pp() {
      return this.id_finally(id_private[31]);
   }

   public boolean Pq() {
      HashSet var1 = Sets.newHashSet();
      this.id_class(id_implements[238], var1);
      return var1.size() == id_implements[239] ? id_implements[240] : id_implements[241];
   }

   public rgy_3 rM() {
      return new rgy_3(rgp_3.id_byte, new rgq_3(this.BC(), this.ro(), this.g()));
   }

   public rnW_2 rC() {
      return ((rYB)this.id_throws[id_break[507]]).id_const();
   }

   public boolean rB() {
      return id_implements[218];
   }

   public boolean rG() {
      return id_implements[112];
   }

   public void rL() {
      Boolean var5 = id_implements[191];
      this.id_throws[id_break[426]] = var5;
   }

   public Collection<an_3> PP() {
      HashSet var1 = Sets.newHashSet();

      for (an_3 var3 : this.Bh()) {
         var1.add(var3);
         var3.id_class(id_implements[237], var1);
      }

      return var1;
   }

   public void PB() {
      rYB var2 = (rYB)this.id_throws[id_break[402]];
      if (var2 instanceof rrEm_1 var1) {
         int var15 = this.rR();
         if ((Boolean)this.id_throws[id_break[403]]) {
            rnW_2 var3 = var1.id_const();
            rqM_2 var4 = ((rYB)this.id_throws[id_break[404]]).E() == rYB.id_protected ? rYB.id_byte : rYB.id_protected;
            rrEm_1 var5 = var3.id_class(var4);
            if (var5 != null && var3.id_interface() && !this.Pm()) {
               int var10002 = (Integer)this.id_throws[id_break[405]];
               Integer var10 = var10002 + id_implements[163];
               this.id_throws[id_break[406]] = var10;
               if (var10002 >= var15) {
                  Integer var11 = var15;
                  this.id_throws[id_break[407]] = var11;
                  this.rc();
                  this.id_class(var5);
               }
            }

            Boolean var12 = id_implements[164];
            this.id_throws[id_break[408]] = var12;
         } else {
            if ((Integer)this.id_throws[id_break[409]] > 0) {
               Integer var13 = (Integer)this.id_throws[id_break[410]] - id_private[24];
               this.id_throws[id_break[411]] = var13;
            }

            if ((Integer)this.id_throws[id_break[412]] < 0) {
               Integer var14 = Integer.valueOf(id_implements[165]);
               this.id_throws[id_break[413]] = var14;
            }
         }

         this.a();
      }
   }

   public double Ph() {
      return this.id_byte(((Random)this.id_throws[id_break[549]]).nextDouble());
   }

   public double Pv() {
      return id_finally[157];
   }

   public boolean rk() {
      return this.h();
   }

   public boolean PF() {
      return this.id_finally(id_private[26]);
   }

   public an_3 rU() {
      return null;
   }

   public rjU_2 Pt() {
      return new rjU_2((Double)this.id_throws[id_break[536]], (Double)this.id_throws[id_break[537]], (Double)this.id_throws[id_break[538]]);
   }

   public float rX() {
      rfw_3 var1 = new rfw_3(this.rx(), id_finally[123], this.BO());
      if (((rYB)this.id_throws[id_break[268]]).id_int(var1)) {
         var1.b_(rfU_2.id_byte(this.rH()));
         return ((rYB)this.id_throws[id_break[269]]).id_native(var1);
      } else {
         return id_protected[40];
      }
   }

   public double rH() {
      return ((rjU_2)this.id_throws[id_break[550]]).id_byte + (double)((Float)this.id_throws[id_break[551]]).floatValue();
   }

   public boolean rZ() {
      return this.id_throws[id_break[104]] > 0 ? id_implements[22] : id_implements[23];
   }

   public int rj() {
      return id_break[414];
   }

   @Override
   public rgP_2 rD() {
      return ((rmE_2)this.id_throws[id_break[482]]).<Optional<rgP_2>>id_class((rut_3<Optional<rgP_2>>)id_case[id_break[483]]).orElse(null);
   }

   public double PS() {
      return (double)((ap_3)this.id_throws[id_break[374]]).id_break * id_finally[158];
   }

   public rfl_3 PE() {
      return this.rN();
   }

   public int rV() {
      return id_implements[249];
   }

   public void rE() {
      this.id_protected(id_implements[26]);
   }

   public boolean rP() {
      return this.Pb() == iM_2.SWIMMING ? id_implements[180] : id_implements[181];
   }

   public String rz() {
      return (String)this.id_throws[id_break[476]];
   }

   public String rW() {
      aI_2 var1 = this.BC();
      rqO_2 var2 = aI_2.id_class(var1);
      return var1.id_class() && var2 != null ? var2.toString() : null;
   }

   public double rI() {
      return (double)this.Bx() < id_finally[198] ? id_finally[199] : id_finally[200];
   }

   public int rR() {
      return id_implements[25];
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
      this.id_new(
         ((rjU_2)this.id_throws[id_break[76]]).id_break, ((rjU_2)this.id_throws[id_break[77]]).id_byte, ((rjU_2)this.id_throws[id_break[78]]).id_protected
      );
   }

   public rfl_3 rN() {
      return (rfl_3)this.id_throws[id_break[503]];
   }

   public void rF() {
   }

   public void Px() {
      rfl_3 var1 = this.rN();
      rfH_2 var2 = new rfH_2(var1.id_class + id_finally[90], var1.id_break + id_finally[91], var1.id_byte + id_finally[92]);
      rfH_2 var3 = new rfH_2(var1.id_protected - id_finally[93], var1.id_throws - id_finally[94], var1.id_case - id_finally[95]);
      rfw_3 var4 = new rfw_3();
      if (((rYB)this.id_throws[id_break[195]]).id_class(var2, var3)) {
         for (int var5 = var2.b_(); var5 <= var3.b_(); var5++) {
            for (int var6 = var2.c_(); var6 <= var3.c_(); var6++) {
               for (int var7 = var2.d_(); var7 <= var3.d_(); var7++) {
                  var4.id_class(var5, var6, var7);
                  xc_3 var8 = ((rYB)this.id_throws[id_break[196]]).id_byte(var4);

                  try {
                     var8.id_class((rYB)this.id_throws[id_break[197]], var4, this);
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
      return id_implements[111];
   }

   public boolean PW() {
      return this.rP() && !this.rT() ? id_implements[182] : id_implements[183];
   }

   public double rx() {
      return ((rjU_2)this.id_throws[id_break[544]]).id_break;
   }

   public void PQ() {
      this.PD();
   }

   public boolean Pu() {
      return !this.id_throws[id_break[369]] ? id_implements[140] : id_implements[141];
   }

   public boolean rT() {
      return (Boolean)this.id_throws[id_break[216]];
   }

   public float PN() {
      return ((ap_3)this.id_throws[id_break[531]]).id_class;
   }

   public rpr_3 rS() {
      return this.Pg();
   }

   public int rK() {
      rnM_2 var1 = this.BG();
      return var1 != null && var1.id_volatile().id_protected() != null ? var1.id_volatile().id_protected() : id_catch[0];
   }

   public int BN() {
      return (Integer)this.id_throws[id_break[570]];
   }

   public Iterable<rdn_3> PV() {
      return (List)id_case[id_break[416]];
   }

   public boolean PU() {
      return id_implements[146];
   }

   public boolean PK() {
      return id_implements[69];
   }

   public boolean PR() {
      return this.h();
   }

   public boolean BP() {
      return !this.Bh().isEmpty() ? id_implements[173] : id_implements[174];
   }

   public void Bn() {
      for (int var1 = ((List)this.id_throws[id_break[384]]).size() - id_implements[157]; var1 >= 0; var1--) {
         ((an_3)((List)this.id_throws[id_break[385]]).get(var1)).BH();
      }
   }

   public rqA_2 BB() {
      return rqn_3.SU;
   }

   public rmE_2 BQ() {
      return (rmE_2)this.id_throws[id_break[55]];
   }

   public boolean BZ() {
      return id_implements[134];
   }

   public boolean BF() {
      return ((rmE_2)this.id_throws[id_break[202]]).<Boolean>id_class((rut_3<Boolean>)id_case[id_break[203]]);
   }

   public double BO() {
      return ((rjU_2)this.id_throws[id_break[552]]).id_protected;
   }

   public boolean Pa() {
      return !this.rT() && !this.id_new() ? id_implements[80] : id_implements[79];
   }

   public boolean BM() {
      return !this.id_throws[id_break[368]] ? id_implements[138] : id_implements[139];
   }

   public List<an_3> Bh() {
      return (List<an_3>)(((List)this.id_throws[id_break[516]]).isEmpty() ? Collections.emptyList() : Lists.newArrayList((List)this.id_throws[id_break[517]]));
   }

   public rqA_2 BJ() {
      return rqn_3.SD;
   }

   @Override
   public boolean Bk() {
      return ((rmE_2)this.id_throws[id_break[484]]).<Optional>id_class((rut_3<Optional>)id_case[id_break[485]]).isPresent();
   }

   public rfH_2 Bs() {
      return (rfH_2)this.id_throws[id_break[539]];
   }

   public void Bb() {
      int var1 = rfU_2.id_byte(this.rx());
      int var2 = rfU_2.id_byte(this.re() - id_finally[113]);
      int var3 = rfU_2.id_byte(this.BO());
      rfH_2 var4 = new rfH_2(var1, var2, var3);
      xc_3 var5 = ((rYB)this.id_throws[id_break[253]]).id_byte(var4);
      if (var5.id_private() != xN_2.INVISIBLE) {
         rjU_2 var6 = this.rv();
         ((rYB)this.id_throws[id_break[254]])
            .id_class(
               new rLX(rLQ.id_protected, var5),
               this.rx() + (((Random)this.id_throws[id_break[255]]).nextDouble() - id_finally[114]) * (double)((ap_3)this.id_throws[id_break[256]]).id_class,
               this.re() + id_finally[115],
               this.BO() + (((Random)this.id_throws[id_break[257]]).nextDouble() - id_finally[116]) * (double)((ap_3)this.id_throws[id_break[258]]).id_class,
               var6.id_break * id_finally[117],
               id_finally[118],
               var6.id_protected * id_finally[119]
            );
      }
   }

   public rpr_3 Pg() {
      return rpr_3.id_class((double)((Float)this.id_throws[id_break[502]]).floatValue());
   }

   public float Bm() {
      return ((ap_3)this.id_throws[id_break[532]]).id_break;
   }

   public boolean Bl() {
      return id_implements[229];
   }

   public void BH() {
      this.id_const();
   }

   public static double Br() {
      return (Double)id_case[id_break[478]];
   }

   public rjU_2 BA() {
      return new rjU_2(id_finally[185], (double)this.Bx(), (double)(this.PN() * id_protected[69]));
   }

   public Stream<an_3> Bu() {
      return Stream.concat(Stream.of(this), ((List)this.id_throws[id_break[518]]).stream().flatMap(an_3::Bu));
   }

   public rjU_2 BX() {
      return (rjU_2)this.id_throws[id_break[541]];
   }

   public rfH_2 BS() {
      int var1 = rfU_2.id_byte(((rjU_2)this.id_throws[id_break[166]]).id_break);
      int var2 = rfU_2.id_byte(((rjU_2)this.id_throws[id_break[167]]).id_byte - id_finally[32]);
      int var3 = rfU_2.id_byte(((rjU_2)this.id_throws[id_break[168]]).id_protected);
      rfH_2 var4 = new rfH_2(var1, var2, var3);
      if (((rYB)this.id_throws[id_break[169]]).id_byte(var4).id_catch()) {
         rfH_2 var5 = var4.id_break();
         xc_3 var6 = ((rYB)this.id_throws[id_break[170]]).id_byte(var5);
         xd_3 var7 = var6.id_break();
         if (var7.id_class(rls_3.id_default) || var7.id_class(rls_3.id_abstract) || var7 instanceof dq_3) {
            return var5;
         }
      }

      return var4;
   }

   public boolean Pj() {
      return (rlb_3)this.id_throws[id_break[260]] != rlG_2.id_break && (rlb_3)this.id_throws[id_break[261]] != rlG_2.id_byte
         ? id_implements[102]
         : id_implements[101];
   }

   public rnM_2 BG() {
      return ((rYB)this.id_throws[id_break[423]]).id_package().id_private(this.i());
   }

   public boolean BL() {
      return (Boolean)this.id_throws[id_break[113]];
   }

   public boolean Bz() {
      if (((rYB)this.id_throws[id_break[370]]).id_continue) {
         return id_implements[142];
      } else if ((Boolean)this.id_throws[id_break[371]]) {
         return id_implements[143];
      } else {
         float var1 = ((ap_3)this.id_throws[id_break[372]]).id_class * id_protected[60];
         rfl_3 var2 = rfl_3.id_catch((double)var1, id_finally[156], (double)var1).id_protected(this.rx(), this.rH(), this.BO());
         return ((rYB)this.id_throws[id_break[373]])
            .id_break(this, var2, (var1x, var2x) -> var1x.id_final((rYB)this.id_throws[7], var2x))
            .findAny()
            .isPresent();
      }
   }

   public void Bc() {
      if ((rYB)this.id_throws[id_break[59]] != null) {
         for (double var1 = this.re(); var1 > id_finally[6] && var1 < id_finally[7]; var1 += id_finally[8]) {
            this.id_new(this.rx(), var1, this.BO());
            if (((rYB)this.id_throws[id_break[60]]).id_throws(this)) {
               break;
            }
         }

         this.id_byte(rjU_2.id_class);
         Float var7 = id_protected[2];
         this.id_throws[id_break[61]] = var7;
      }
   }

   public boolean BW() {
      return !((rYB)this.id_throws[id_break[382]]).a_(this, this.rN().id_break(id_finally[160])) ? id_implements[153] : id_implements[154];
   }

   public Iterable<rdn_3> PY() {
      return Iterables.concat(this.rs(), this.PV());
   }

   public float Bd() {
      return ((ap_3)this.id_throws[id_break[533]]).id_protected;
   }

   public float Bx() {
      return (Float)this.id_throws[id_break[505]];
   }

   public rqA_2 Bv() {
      return rqn_3.SD;
   }

   public boolean Pw() {
      return this.h();
   }

   public ap_3 a_(iM_2 var1) {
      return ((aI_2)this.id_throws[id_break[534]]).id_volatile();
   }

   public void a_(rjU_2 var1) {
      this.id_private(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public boolean a_(rhd_3 var1) {
      if (var1.id_native()) {
         return id_implements[185];
      } else {
         rnM_2 var2 = this.BG();
         return (var2 == null || var1 == null || var1.BG() != var2 || !var2.id_private()) && this.Pp() ? id_implements[186] : id_implements[187];
      }
   }

   public void a_(UUID var1) {
      this.id_throws[id_break[472]] = var1;
      String var7 = ((UUID)this.id_throws[id_break[473]]).toString();
      this.id_throws[id_break[474]] = var7;
   }

   public rsE_2 a_(rdn_3 var1) {
      return this.id_class(var1, id_protected[59]);
   }

   public rjU_2 a_(iB_2 var1) {
      return new rjU_2(this.rx(), this.rN().id_throws, this.BO());
   }

   @Override
   public rgP_2 L_() {
      return rnB_2.id_class(this.BG(), this.g(), rnO_2.values()).id_class(var1 -> var1.id_class(this.rM()).id_class(this.rz()));
   }

   public abstract void m_();

   public void q_() {
      ap_3 var1 = (ap_3)this.id_throws[id_break[497]];
      iM_2 var2 = this.Pb();
      ap_3 var3 = this.a_(var2);
      this.id_throws[id_break[498]] = var3;
      Float var11 = this.id_class(var2, var3);
      this.id_throws[id_break[499]] = var11;
      if (var3.id_class < var1.id_class) {
         double var4 = (double)var3.id_class / id_finally[183];
         this.id_class(new rfl_3(this.rx() - var4, this.re(), this.BO() - var4, this.rx() + var4, this.re() + (double)var3.id_break, this.BO() + var4));
      } else {
         rfl_3 var12 = this.rN();
         this.id_class(
            new rfl_3(
               var12.id_class,
               var12.id_break,
               var12.id_byte,
               var12.id_class + (double)var3.id_class,
               var12.id_break + (double)var3.id_break,
               var12.id_byte + (double)var3.id_class
            )
         );
         if (var3.id_class > var1.id_class && !(Boolean)this.id_throws[id_break[500]] && !((rYB)this.id_throws[id_break[501]]).id_continue) {
            float var5 = var1.id_class - var3.id_class;
            this.id_class(iG_2.SELF, new rjU_2((double)var5, id_finally[184], (double)var5));
         }
      }
   }

   public abstract ruS_2<?> p_();

   public Qs_1 r_() {
      return Qs_1.NORMAL;
   }

   public boolean Y() {
      return (Boolean)this.id_throws[id_break[565]];
   }

   public void c_(rhd_3 var1) {
   }

   public void c_(boolean var1) {
      this.id_break(id_private[27], var1);
   }

   public rgP_2 PT() {
      return ((aI_2)this.id_throws[id_break[448]]).id_implements();
   }
}
