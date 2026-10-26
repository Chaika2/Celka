package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public abstract class iB_2 extends an_3 {
   public static Object[] id_catch;
   public Object[] id_private;
   private static String[] id_class;
   private static boolean[] id_break;
   private static double[] id_protected;
   private static float[] id_implements;
   private static byte[] id_finally;
   private static long[] id_extends;
   private static short[] id_native;

   private boolean id_char() {
      this.id_private();
      int var1 = this.SH();
      rxK_2 var2 = ((rdn_3)this.id_private[61]).id_break().id_this();
      boolean var3 = var2 != null && var2.id_throws() ? true : false;
      var3 |= var1 <= ((rdn_3)this.id_private[61]).id_extends() - 7 ? true : false;
      return var3 && var1 % 4 == 0 ? true : false;
   }

   public boolean id_byte(rXQ var1) {
      return !this.id_class(var1).id_class() ? true : false;
   }

   public rqA_2 id_byte(rdn_3 var1) {
      return var1.id_float();
   }

   public void id_byte(rlb_3<rXs_1> var1) {
      this.id_byte((rjU_2)this.rv().id_break((double)0.0F, (double)0.04F, (double)0.0F));
   }

   public int id_byte(rhd_3 var1) {
      return false;
   }

   public void id_byte(rpm_3 var1) {
      this.id_break(var1 == rpm_3.MAIN_HAND ? rXQ.MAINHAND : rXQ.OFFHAND);
   }

   public void id_byte(rLY var1) {
      this.id_private();
      if (this.id_throws(var1)) {
         rLY var2 = (rLY)((Map)this.id_private[2]).put(var1.id_class(), var1);
         if (var2 == null) {
            this.id_protected(var1);
         } else {
            this.id_class(var1, true);
         }
      }

   }

   public rLY id_byte(rLR var1) {
      this.id_private();
      return (rLY)((Map)this.id_private[2]).get(var1);
   }

   private float id_byte(float var1) {
      this.id_private();
      return (Boolean)this.id_throws[20] ? this.sB() * (0.21600002F / (var1 * var1 * var1)) : (Float)this.id_private[29];
   }

   public rqA_2 id_byte(rye_3 var1) {
      return rqn_3.So;
   }

   private void id_byte(rXQ var1, rdn_3 var2) {
      this.id_private();
      ((rqs_3)this.id_private[4]).set(var1.id_break(), var2);
   }

   public rqA_2 id_byte(int var1) {
      return var1 > 4 ? rqn_3.SI : rqn_3.SK;
   }

   public void id_byte(rye_3 var1, float var2) {
   }

   public void id_byte(an_3 var1) {
      if (!this.Sc()) {
         super.id_byte(var1);
      }

   }

   public void id_byte(int var1, boolean var2) {
      int var3 = (Byte)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[3]);
      if (var2) {
         var3 |= var1;
      } else {
         var3 &= var1 ^ -1;
      }

      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[3], (byte)var3);
   }

   private boolean id_byte(rfH_2 var1, xc_3 var2) {
      if (!(Boolean)var2.id_byte(zv_3.id_volatile)) {
         return false;
      } else {
         xc_3 var3 = ((rYB)this.id_throws[7]).id_byte(var1.id_break());
         return var3.id_class(xu_3.PJ) && var3.id_byte(kc_3.id_volatile) == var2.id_byte(zv_3.p) ? true : false;
      }
   }

   public ic_3 id_byte(iJ_2 var1) {
      return this.BT().id_class(var1);
   }

   public void id_int(boolean var1) {
      this.id_private();
      super.id_int(var1);
      if (var1) {
         Optional var6 = Optional.empty();
         this.id_private[66] = var6;
      }

   }

   public void id_int(int var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[7], var1);
   }

   private static void id_int() {
      id_finally = new byte[]{2, 4, 20, -20, 8, 100, 5, 20, 20, 4, 9, 10, 9, 10, 99, 8, 7, 99, 99, 99, 10, 15, 5, 16, 8, 20, 10, 100, 100, 29, 33, 36, 37, 44, 2, 100, 35, 5, 5, 3, 3, 4, 10, 5, 25, 6, 2, -1, 3, 33, 36, 37, 44, 20, 10, 10, 10, 7, 20, 30, 20, 30, 20, 6, 6, 55, 7, 20, 7, 4, 4, 4, 4, 2, 5, 7, 4, -1, 2, 2, 16, 7, 46, 3, 47, 48, 49, 50, 52, 51, 47, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10, 80, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 55, 57, 58, 59, 60, 62, 63, 64, 68, 69, 70, 71, 73, 74, 75, 76, 77, 78, 79, 11};
   }

   private Map<rXQ, rdn_3> id_long() {
      EnumMap var1 = null;
      rXQ[] var2 = rXQ.values();
      int var3 = var2.length;

      for(int var4 = false; var4 < var3; ++var4) {
         rXQ var5 = var2[var4];
         rdn_3 var6;
         switch (((int[])iS_2.id_class[0])[var5.id_class().ordinal()]) {
            case 1:
               var6 = this.id_protected(var5);
               break;
            case 2:
               var6 = this.id_case(var5);
               break;
            default:
               continue;
         }

         rdn_3 var7 = this.id_class(var5);
         if (!rdn_3.id_break(var7, var6)) {
            if (var1 == null) {
               var1 = Maps.newEnumMap(rXQ.class);
            }

            var1.put(var5, var7);
            if (!var6.id_class()) {
               this.BT().id_class(var6.id_class(var5));
            }

            if (!var7.id_class()) {
               this.BT().id_break(var7.id_class(var5));
            }
         }
      }

      return var1;
   }

   private static void id_float() {
      id_class = new String[]{new String("memories"), new String("Soul speed boost"), new String("Health"), new String("HurtTime"), new String("HurtByTimestamp"), new String("DeathTime"), new String("AbsorptionAmount"), new String("Attributes"), new String("ActiveEffects"), new String("FallFlying"), new String("AbsorptionAmount"), new String("Attributes"), new String("Attributes"), new String("ActiveEffects"), new String("ActiveEffects"), new String("Health"), new String("Health"), new String("HurtTime"), new String("DeathTime"), new String("HurtByTimestamp"), new String("Team"), new String("Team"), new String("Unable to add mob to team \"{}\" (that team probably doesn't exist)"), new String("FallFlying"), new String("SleepingX"), new String("SleepingY"), new String("SleepingZ"), new String("SleepingX"), new String("SleepingY"), new String("SleepingZ"), new String("Brain"), new String("Brain"), new String("Brain"), new String("SleepingX"), new String("SleepingY"), new String("SleepingZ"), new String("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), new String("87f46a96-686f-4796-b035-22e16ee9e038"), new String("Sprinting speed boost")};
   }

   public iB_2(aI_2<? extends iB_2> var1, rYB var2) {
      super(var1, var2);
      this.id_private();
      ryR_2 var8 = new ryR_2(this);
      this.id_private[1] = var8;
      HashMap var9 = Maps.newHashMap();
      this.id_private[2] = var9;
      rqs_3 var10 = rqs_3.id_class(2, rdn_3.id_break);
      this.id_private[3] = var10;
      rqs_3 var11 = rqs_3.id_class(4, rdn_3.id_break);
      this.id_private[4] = var11;
      Integer var12 = 20;
      this.id_private[20] = var12;
      Float var13 = 0.02F;
      this.id_private[29] = var13;
      Boolean var14 = true;
      this.id_private[53] = var14;
      rdn_3 var15 = rdn_3.id_break;
      this.id_private[61] = var15;
      Optional var16 = Optional.empty();
      this.id_private[66] = var16;
      ik_3 var17 = new ik_3(iN_2.id_class(var1));
      this.id_private[0] = var17;
      this.id_public(this.SK());
      Boolean var18 = true;
      this.id_throws[2] = var18;
      Float var19 = (float)((Math.random() + (double)1.0F) * (double)0.01F);
      this.id_private[22] = var19;
      this.PX();
      Float var20 = (float)Math.random() * 12398.0F;
      this.id_private[21] = var20;
      Float var21 = (float)(Math.random() * (double)((float)Math.PI * 2F));
      this.id_throws[15] = var21;
      Float var22 = (Float)this.id_throws[15];
      this.id_private[25] = var22;
      Float var23 = (Float)this.id_throws[16];
      this.id_private[26] = var23;
      Float var24 = 0.6F;
      this.id_throws[37] = var24;
      rcf_3 var3 = rcf_3.id_class;
      iZ_2 var25 = this.id_class(new Dynamic(var3, (rcZ_2)var3.createMap(ImmutableMap.of(var3.id_class(id_class[0]), (rcZ_2)var3.emptyMap()))));
      this.id_private[72] = var25;
   }

   static {
      ntfClinit();
   }

   public void id_this() {
      this.id_private();
      super.id_this();
      this.id_final();
      this.id_void();
      Boolean var17 = false;
      this.id_private[75] = var17;

      for(rdn_3 var3 : this.PV()) {
         if (!var3.id_class()) {
            Boolean var18 = true;
            this.id_private[75] = var18;
         }
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         int var39 = this.BY();
         if (var39 > 0) {
            if ((Integer)this.id_private[8] <= 0) {
               Integer var19 = 20 * (30 - var39);
               this.id_private[8] = var19;
            }

            Integer var20 = (Integer)this.id_private[8] - 1;
            this.id_private[8] = var20;
            if ((Integer)this.id_private[8] <= 0) {
               this.id_int(var39 - 1);
            }
         }

         int var41 = this.SM();
         if (var41 > 0) {
            if ((Integer)this.id_private[9] <= 0) {
               Integer var21 = 20 * (30 - var41);
               this.id_private[9] = var21;
            }

            Integer var22 = (Integer)this.id_private[9] - 1;
            this.id_private[9] = var22;
            if ((Integer)this.id_private[9] <= 0) {
               this.id_package(var41 - 1);
            }
         }

         this.id_else();
         if ((Integer)this.id_throws[41] % 20 == 0) {
            this.SW().id_throws();
         }

         if (!(Boolean)this.id_throws[65]) {
            boolean var4 = this.id_break(rLD.id_public);
            if (this.id_finally(6) != var4) {
               this.id_break(6, var4);
            }
         }

         if (this.Sc() && !this.id_goto()) {
            this.SQ();
         }
      }

      this.id_default();
      double var40 = this.rx() - (Double)this.id_throws[8];
      double var42 = this.BO() - (Double)this.id_throws[10];
      float var6 = (float)(var40 * var40 + var42 * var42);
      float var7 = (Float)this.id_private[23];
      float var8 = 0.0F;
      Float var23 = (Float)this.id_private[35];
      this.id_private[34] = var23;
      float var9 = 0.0F;
      float var10 = this.id_switch().id_throws();
      if (var6 > 0.0025000002F) {
         var9 = 1.0F;
         var8 = (float)Math.sqrt((double)var6) * 3.0F;
         float var11 = (float)rfU_2.id_protected(var42, var40) * (180F / (float)Math.PI) - 90.0F;
         float var12 = rfU_2.id_throws(rfU_2.id_catch(var10) - var11);
         if (95.0F < var12 && var12 < 265.0F) {
            var7 = var11 - 180.0F;
         } else {
            var7 = var11;
         }
      }

      if ((Float)this.id_private[15] > 0.0F) {
         var7 = var10;
      }

      if (!(Boolean)this.id_throws[20]) {
         var9 = 0.0F;
      }

      Float var24 = (Float)this.id_private[35] + (var9 - (Float)this.id_private[35]) * 0.3F;
      this.id_private[35] = var24;

      Float var25;
      for(var8 = this.id_break(var7, var8, var10); (Float)this.id_throws[15] - (Float)this.id_throws[17] < -180.0F; this.id_throws[17] = var25) {
         var25 = (Float)this.id_throws[17] - 360.0F;
      }

      while((Float)this.id_throws[15] - (Float)this.id_throws[17] >= 180.0F) {
         Float var26 = (Float)this.id_throws[17] + 360.0F;
         this.id_throws[17] = var26;
      }

      while((Float)this.id_private[23] - (Float)this.id_private[24] < -180.0F) {
         Float var27 = (Float)this.id_private[24] - 360.0F;
         this.id_private[24] = var27;
      }

      while((Float)this.id_private[23] - (Float)this.id_private[24] >= 180.0F) {
         Float var28 = (Float)this.id_private[24] + 360.0F;
         this.id_private[24] = var28;
      }

      while((Float)this.id_throws[16] - (Float)this.id_throws[18] < -180.0F) {
         Float var29 = (Float)this.id_throws[18] - 360.0F;
         this.id_throws[18] = var29;
      }

      while((Float)this.id_throws[16] - (Float)this.id_throws[18] >= 180.0F) {
         Float var30 = (Float)this.id_throws[18] + 360.0F;
         this.id_throws[18] = var30;
      }

      while((Float)this.id_private[26] - (Float)this.id_private[28] < -180.0F) {
         Float var31 = (Float)this.id_private[28] - 360.0F;
         this.id_private[28] = var31;
      }

      while((Float)this.id_private[26] - (Float)this.id_private[28] >= 180.0F) {
         Float var32 = (Float)this.id_private[28] + 360.0F;
         this.id_private[28] = var32;
      }

      while((Float)this.id_private[25] - (Float)this.id_private[27] < -180.0F) {
         Float var33 = (Float)this.id_private[27] - 360.0F;
         this.id_private[27] = var33;
      }

      while((Float)this.id_private[25] - (Float)this.id_private[27] >= 180.0F) {
         Float var34 = (Float)this.id_private[27] + 360.0F;
         this.id_private[27] = var34;
      }

      Float var35 = (Float)this.id_private[36] + var8;
      this.id_private[36] = var35;
      if (this.Sy()) {
         Integer var36 = (Integer)this.id_private[64] + 1;
         this.id_private[64] = var36;
      } else {
         Integer var37 = Integer.valueOf(0);
         this.id_private[64] = var37;
      }

      if (this.Sc()) {
         Float var38 = 0.0F;
         this.id_throws[16] = var38;
      }

   }

   public float id_this(float var1) {
      this.id_private();
      return rfU_2.id_catch(var1, (float)(Integer)this.id_private[62], (float)(Integer)this.id_private[63]);
   }

   public Map<rLR, rLY> sb() {
      this.id_private();
      return (Map)this.id_private[2];
   }

   public float f() {
      return ((rrnJ_2)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnJ_2.id_class(this, super.f()))).id_break();
   }

   public float id_interface() {
      return this.id_break(rLD.id_protected) ? (float)(6 + (1 + this.id_byte(rLD.id_protected).id_byte()) * 2) : 6.0F;
   }

   public abstract void id_class(rXQ var1, rdn_3 var2);

   public void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      if (!this.rT()) {
         this.rd();
      }

      if (!((rYB)this.id_throws[7]).id_continue && var3 && (Float)this.id_throws[31] > 0.0F) {
         this.SI();
         this.Ba();
      }

      if (!((rYB)this.id_throws[7]).id_continue && (Float)this.id_throws[31] > 3.0F && var3) {
         float var6 = (float)rfU_2.id_case((Float)this.id_throws[31] - 3.0F);
         if (!var4.id_catch()) {
            double var7 = Math.min((double)(0.2F + var6 / 15.0F), (double)2.5F);
            int var9 = (int)((double)150.0F * var7);
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(new rLX(rLQ.id_protected, var4), this.rx(), this.re(), this.BO(), var9, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.15F);
         }
      }

      super.id_class(var1, var3, var4, var5);
   }

   public boolean id_class(aI_2<?> var1) {
      return true;
   }

   public void id_class(rye_3 var1, int var2, boolean var3) {
   }

   private void id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      rdb_3 var4 = var1.id_break();
      if (var4.id_super()) {
         for(Pair var6 : var4.id_this().id_case()) {
            if (!var2.id_continue && var6.getFirst() != null && var2.id_int.nextFloat() < (Float)var6.getSecond()) {
               var3.id_break(new rLY((rLY)var6.getFirst()));
            }
         }
      }

   }

   public void id_class(iB_2 var1, boolean var2) {
      this.id_private();
      Float var14 = (Float)var1.id_private[18];
      var1.id_private[17] = var14;
      double var3 = var1.rx() - (Double)var1.id_throws[8];
      double var5 = var2 ? var1.re() - (Double)var1.id_throws[9] : (double)0.0F;
      double var7 = var1.BO() - (Double)var1.id_throws[10];
      float var9 = rfU_2.id_class(var3 * var3 + var5 * var5 + var7 * var7) * 4.0F;
      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      Float var15 = (Float)var1.id_private[18] + (var9 - (Float)var1.id_private[18]) * 0.4F;
      var1.id_private[18] = var15;
      Float var16 = (Float)var1.id_private[19] + (Float)var1.id_private[18];
      var1.id_private[19] = var16;
   }

   private void id_class(rfH_2 var1) {
      this.id_new((double)var1.b_() + (double)0.5F, (double)var1.c_() + (double)0.6875F, (double)var1.d_() + (double)0.5F);
   }

   private void id_class(Map<rXQ, rdn_3> var1) {
      ArrayList var2 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2x, var3) -> {
         rdn_3 var4 = var3.id_implements();
         var2.add(Pair.of(var2x, var4));
         switch (((int[])iS_2.id_class[0])[var2x.id_class().ordinal()]) {
            case 1 -> this.id_break(var2x, var4);
            case 2 -> this.id_byte(var2x, var4);
         }

      });
      ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(this, new rvO_2(this.V(), var2));
   }

   private void id_class(an_3 var1) {
      rjU_2 var2;
      if (!(Boolean)var1.id_throws[27] && !((rYB)this.id_throws[7]).id_byte(var1.Bs()).id_break().id_class(rls_3.Q)) {
         var2 = var1.a_(this);
      } else {
         var2 = new rjU_2(var1.rx(), var1.re() + (double)var1.Bm(), var1.BO());
      }

      this.id_case(var2.id_break, var2.id_byte, var2.id_protected);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 264932232715356110L;
   }

   public void id_class(rsE_2 var1) {
      rhd_3 var2 = var1.id_case() != null ? ((rYB)this.id_throws[7]).id_class(var1.id_case()) : null;
      if (var2 instanceof rhN_2) {
         Oo_1.id_strictfp.id_class((rhN_2)var2, var1.id_protected(), this);
      }

   }

   public void id_class(an_3 var1, int var2) {
      if (!(Boolean)var1.id_throws[27] && !((rYB)this.id_throws[7]).id_continue && (var1 instanceof rsE_2 || var1 instanceof rhm_3 || var1 instanceof rsP_2)) {
         ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(var1, new rZe_1(var1.V(), this.V(), var2));
      }

   }

   public static boolean id_class(Collection<rLY> var0) {
      for(rLY var2 : var0) {
         if (!var2.id_protected()) {
            return false;
         }
      }

      return true;
   }

   public void id_class(rye_3 var1, float var2) {
      if (!this.id_class(var1)) {
         var2 = this.id_protected(var1, var2);
         var2 = this.id_throws(var1, var2);
         float var3 = Math.max(var2 - this.Sd(), 0.0F);
         this.id_return(this.Sd() - (var2 - var3));
         float var4 = var2 - var3;
         if (var4 > 0.0F && var4 < 3.4028235E37F && var1.id_extends() instanceof rhN_2) {
            ((rhN_2)var1.id_extends()).id_class(rlB_2.id_long, Math.round(var4 * 10.0F));
         }

         if (var3 != 0.0F) {
            float var5 = this.Ss();
            this.id_public(var5 - var3);
            this.SW().id_class(var1, var5, var3);
            this.id_return(this.Sd() - var3);
         }
      }

   }

   public boolean id_class(Predicate<rdb_3> var1) {
      return !var1.test(this.ss().id_break()) && !var1.test(this.Sn().id_break()) ? false : true;
   }

   public abstract rdn_3 id_class(rXQ var1);

   public rdn_3 id_class(rYB var1, rdn_3 var2) {
      if (var2.id_long()) {
         var1.id_class((rhd_3)null, this.rx(), this.re(), this.BO(), this.id_protected(var2), rqL_2.NEUTRAL, 1.0F, 1.0F + (var1.id_int.nextFloat() - var1.id_int.nextFloat()) * 0.4F);
         this.id_class(var2, var1, this);
         if (!(this instanceof rhd_3) || !((rhx_3)((rhd_3)this).id_implements[18]).id_protected) {
            var2.id_catch(true);
         }
      }

      return var2;
   }

   public boolean id_class(float var1, float var2) {
      boolean var3 = super.id_class(var1, var2);
      int var4 = this.id_implements(var1, var2);
      if (var4 > 0) {
         this.id_class(this.id_byte(var4), 1.0F, 1.0F);
         this.sM();
         this.id_break(rye_3.id_extends, (float)var4);
         return true;
      } else {
         return var3;
      }
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.id_private();
      Double var15 = var1;
      this.id_private[46] = var15;
      Double var16 = var3;
      this.id_private[47] = var16;
      Double var17 = var5;
      this.id_private[48] = var17;
      Double var18 = (double)var7;
      this.id_private[49] = var18;
      Double var19 = (double)var8;
      this.id_private[50] = var19;
      Integer var20 = var9;
      this.id_private[45] = var20;
   }

   public void id_class(Rm_1 var1, rjU_2 var2) {
      this.id_private();
      super.id_class(var1, var2);
      Float var7 = (Float)this.id_private[25];
      this.id_private[27] = var7;
      Float var8 = (Float)this.id_private[25];
      this.id_private[23] = var8;
      Float var9 = (Float)this.id_private[23];
      this.id_private[24] = var9;
   }

   public rLY id_class(rLR var1) {
      this.id_private();
      return (rLY)((Map)this.id_private[2]).remove(var1);
   }

   public boolean id_class(rXs_1 var1) {
      return false;
   }

   public boolean id_class(rrTR var1) {
      rjU_2 var2 = new rjU_2(this.rx(), this.rH(), this.BO());
      rjU_2 var3 = var1.rr();
      rjU_2 var10000 = new rjU_2;
      double var10002 = var3.id_break;
      double var10003 = var3.id_byte;
      float var10004;
      if (var1 instanceof an_3 var5) {
         var10004 = var5.Bx();
      } else {
         var10004 = 0.0F;
      }

      var10000.<init>(var10002, var10003 + (double)var10004, var3.id_protected);
      rjU_2 var4 = var10000;
      return ((rYB)this.id_throws[7]).id_class(new rjB_2(var2, var4, rjS_2.COLLIDER, rjs_3.NONE, this)).id_byte() == rjM_2.MISS ? true : false;
   }

   public boolean id_class(rdb_3 var1) {
      return this.id_class((Predicate)((var1x) -> var1x == var1 ? true : false));
   }

   public void id_class(rLY var1) {
      this.id_private();
      Boolean var6 = true;
      this.id_private[53] = var6;
      if (!((rYB)this.id_throws[7]).id_continue) {
         var1.id_class().id_class(this, this.BT(), var1.id_byte());
      }

      rrLo_1.id_class(this, var1);
   }

   public rjU_2 id_class(rpB_2 var1, rqT_2 var2) {
      return id_implements(super.id_class(var1, var2));
   }

   public void id_class(rpm_3 var1, rdn_3 var2) {
      if (var1 == rpm_3.MAIN_HAND) {
         this.id_class(rXQ.MAINHAND, var2);
      } else {
         if (var1 != rpm_3.OFF_HAND) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.id_class(rXQ.OFFHAND, var2);
      }

   }

   public void id_class(rut_3<?> var1) {
      this.id_private();
      super.id_class(var1);
      if (((rut_3)id_catch[9]).equals(var1)) {
         if (((rYB)this.id_throws[7]).id_continue) {
            this.Bg().ifPresent(this::id_class);
         }
      } else if (((rut_3)id_catch[3]).equals(var1) && ((rYB)this.id_throws[7]).id_continue) {
         if (this.id_return() && ((rdn_3)this.id_private[61]).id_class()) {
            rdn_3 var6 = this.id_protected(this.P());
            this.id_private[61] = var6;
            if (!((rdn_3)this.id_private[61]).id_class()) {
               Integer var7 = (Integer)this.id_private[63];
               this.id_private[62] = var7;
               Integer var8 = ((rdn_3)this.id_private[61]).id_extends();
               this.id_private[63] = var8;
            }
         } else if (!this.id_return() && !((rdn_3)this.id_private[61]).id_class()) {
            rdn_3 var9 = rdn_3.id_break;
            this.id_private[61] = var9;
            Integer var10 = (Integer)this.id_private[63];
            this.id_private[62] = var10;
            Integer var11 = Integer.valueOf(0);
            this.id_private[63] = var11;
         }
      }

   }

   public rzP_2 id_class(boolean var1, rye_3 var2) {
      this.id_private();
      rzP_2 var3 = (new rzP_2((rrEm_1)((rYB)this.id_throws[7]))).id_class((Random)this.id_throws[40]).id_class(rzQ_2.id_class, this).id_class(rzQ_2.id_case, this.Ps()).id_class(rzQ_2.id_byte, var2).id_break(rzQ_2.id_protected, var2.id_extends()).id_break(rzQ_2.id_throws, var2.id_finally());
      if (var1 && (rhd_3)this.id_private[30] != null) {
         var3 = var3.id_class(rzQ_2.id_break, (rhd_3)this.id_private[30]).id_class(((rhd_3)this.id_private[30]).sY());
      }

      return var3;
   }

   public double id_class(iJ_2 var1) {
      return this.BT().id_byte(var1);
   }

   public void id_class(rye_3 var1, boolean var2) {
      rqO_2 var3 = this.By();
      rzL_2 var4 = ((rYB)this.id_throws[7]).id_const().o().id_class(var3);
      rzP_2 var5 = this.id_class(var2, var1);
      var4.id_break(var5.id_class(rzz_3.id_case), this::a_);
   }

   public float id_class(iM_2 var1, ap_3 var2) {
      return var1 == iM_2.SLEEPING ? 0.2F : this.id_break(var1, var2);
   }

   public void id_class(rcd_3 var1) {
      this.id_private();
      var1.id_class(id_class[2], this.Ss());
      var1.id_class(id_class[3], (short)(Integer)this.id_private[10]);
      var1.id_break(id_class[4], (Integer)this.id_private[55]);
      var1.id_class(id_class[5], (short)(Integer)this.id_private[13]);
      var1.id_class(id_class[6], this.Sd());
      var1.id_class(id_class[7], this.BT().id_byte());
      if (!((Map)this.id_private[2]).isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for(rLY var4 : ((Map)this.id_private[2]).values()) {
            var2.add(var4.id_class(new rcd_3()));
         }

         var1.id_class(id_class[8], var2);
      }

      var1.id_class(id_class[9], this.Sy());
      this.Bg().ifPresent((var1x) -> {
         var1.id_break(id_class[33], var1x.b_());
         var1.id_break(id_class[34], var1x.c_());
         var1.id_break(id_class[35], var1x.d_());
      });
      DataResult var5 = ((iZ_2)this.id_private[72]).id_class(rcf_3.id_class);
      Logger var10001 = (Logger)id_case[0];
      Objects.requireNonNull(var10001);
      var5.resultOrPartial(var10001::error).ifPresent((var1x) -> var1.id_class(id_class[32], var1x));
   }

   public void id_class(rpm_3 var1, boolean var2) {
      this.id_private();
      if (!(Boolean)this.id_private[5] || (float)(Integer)this.id_private[7] >= this.id_interface() / 2.0F || (Integer)this.id_private[7] < 0) {
         Integer var9 = -1;
         this.id_private[7] = var9;
         Boolean var10 = true;
         this.id_private[5] = var10;
         this.id_private[6] = var1;
         if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            rZj_1 var3 = new rZj_1(this, var1 == rpm_3.MAIN_HAND ? false : 3);
            rrEN var4 = ((rrEm_1)((rYB)this.id_throws[7])).id_else();
            if (var2) {
               var4.id_class(this, var3);
            } else {
               var4.id_break(this, var3);
            }
         }
      }

   }

   public iZ_2<?> id_class(Dynamic<?> var1) {
      return this.SV().id_class(var1);
   }

   public void id_class(rpm_3 var1) {
      this.id_class(var1, false);
   }

   public void id_class(byte var1) {
      this.id_private();
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var2 = var1 == 33 ? true : false;
            boolean var3 = var1 == 36 ? true : false;
            boolean var4 = var1 == 37 ? true : false;
            boolean var5 = var1 == 44 ? true : false;
            Float var26 = 1.5F;
            this.id_private[18] = var26;
            Integer var27 = 20;
            this.id_throws[47] = var27;
            Integer var28 = 10;
            this.id_private[11] = var28;
            Integer var29 = (Integer)this.id_private[11];
            this.id_private[10] = var29;
            Float var30 = 0.0F;
            this.id_private[12] = var30;
            if (var2) {
               this.id_class(rqn_3.dG, this.Si(), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
            }

            rye_3 var6;
            if (var4) {
               var6 = rye_3.id_byte;
            } else if (var3) {
               var6 = rye_3.id_private;
            } else if (var5) {
               var6 = rye_3.id_else;
            } else {
               var6 = rye_3.id_final;
            }

            rqA_2 var7 = this.id_byte(var6);
            if (var7 != null) {
               this.id_class(var7, this.Si(), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
            }

            this.id_break(rye_3.id_final, 0.0F);
            break;
         case 3:
            rqA_2 var8 = this.Bt();
            if (var8 != null) {
               this.id_class(var8, this.Si(), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
            }

            if (!(this instanceof rhd_3)) {
               this.id_public(0.0F);
               this.id_break(rye_3.id_final);
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 34:
         case 35:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 45:
         case 53:
         default:
            super.id_class(var1);
            break;
         case 29:
            this.id_class(rqn_3.Jr, 1.0F, 0.8F + ((rYB)this.id_throws[7]).id_int.nextFloat() * 0.4F);
            break;
         case 30:
            this.id_class(rqn_3.JP, 0.8F, 0.8F + ((rYB)this.id_throws[7]).id_int.nextFloat() * 0.4F);
            break;
         case 46:
            short var9 = 128;

            for(int var10 = false; var10 < 128; ++var10) {
               double var11 = (double)var10 / (double)127.0F;
               float var13 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 0.2F;
               float var14 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 0.2F;
               float var15 = (((Random)this.id_throws[40]).nextFloat() - 0.5F) * 0.2F;
               double var16 = rfU_2.id_protected(var11, (Double)this.id_throws[8], this.rx()) + (((Random)this.id_throws[40]).nextDouble() - (double)0.5F) * (double)this.PN() * (double)2.0F;
               double var18 = rfU_2.id_protected(var11, (Double)this.id_throws[9], this.re()) + ((Random)this.id_throws[40]).nextDouble() * (double)this.Bm();
               double var20 = rfU_2.id_protected(var11, (Double)this.id_throws[10], this.BO()) + (((Random)this.id_throws[40]).nextDouble() - (double)0.5F) * (double)this.PN() * (double)2.0F;
               ((rYB)this.id_throws[7]).id_class(rLQ.id_transient, var16, var18, var20, (double)var13, (double)var14, (double)var15);
            }
            break;
         case 47:
            this.id_catch(this.id_class(rXQ.MAINHAND));
            break;
         case 48:
            this.id_catch(this.id_class(rXQ.OFFHAND));
            break;
         case 49:
            this.id_catch(this.id_class(rXQ.HEAD));
            break;
         case 50:
            this.id_catch(this.id_class(rXQ.CHEST));
            break;
         case 51:
            this.id_catch(this.id_class(rXQ.LEGS));
            break;
         case 52:
            this.id_catch(this.id_class(rXQ.FEET));
            break;
         case 54:
            kB_2.id_break(this);
            break;
         case 55:
            this.id_implements();
      }

   }

   public void id_class(float var1, double var2, double var4) {
      var1 = (float)((double)var1 * ((double)1.0F - this.id_class(iQ_2.id_byte)));
      if (!(var1 <= 0.0F)) {
         Boolean var12 = true;
         this.id_throws[57] = var12;
         rjU_2 var6 = this.rv();
         rjU_2 var7 = (new rjU_2(var2, (double)0.0F, var4)).id_protected().id_class((double)var1);
         this.id_catch(var6.id_break / (double)2.0F - var7.id_break, (Boolean)this.id_throws[20] ? Math.min(0.4, var6.id_byte / (double)2.0F + (double)var1) : var6.id_byte, var6.id_protected / (double)2.0F - var7.id_protected);
      }

   }

   public void id_class(rfl_3 var1, rfl_3 var2) {
      this.id_private();
      rfl_3 var3 = var1.id_break(var2);
      List var4 = ((rYB)this.id_throws[7]).id_class(this, var3);
      if (!var4.isEmpty()) {
         for(int var5 = false; var5 < var4.size(); ++var5) {
            an_3 var6 = (an_3)var4.get(var5);
            if (var6 instanceof iB_2) {
               this.id_case((iB_2)var6);
               Integer var11 = Integer.valueOf(0);
               this.id_private[69] = var11;
               this.id_byte((rjU_2)this.rv().id_class(-0.2));
               break;
            }
         }
      } else if ((Boolean)this.id_throws[23]) {
         Integer var12 = Integer.valueOf(0);
         this.id_private[69] = var12;
      }

      if (!((rYB)this.id_throws[7]).id_continue && (Integer)this.id_private[69] <= 0) {
         this.id_byte(4, false);
      }

   }

   public void id_class(float var1, int var2) {
      this.id_private();
      Double var7 = (double)var1;
      this.id_private[51] = var7;
      Integer var8 = var2;
      this.id_private[52] = var8;
   }

   public void id_class(iB_2 var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         boolean var2 = false;
         if (var1 instanceof rSN) {
            if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
               rfH_2 var3 = this.Bs();
               xc_3 var4 = xu_3.ry.id_continue();
               if (((rYB)this.id_throws[7]).id_byte(var3).id_catch() && var4.id_class((rYB)this.id_throws[7], var3)) {
                  ((rYB)this.id_throws[7]).id_class(var3, var4, 3);
                  var2 = true;
               }
            }

            if (!var2) {
               rsE_2 var5 = new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), new rdn_3(rdy_3.rF));
               ((rYB)this.id_throws[7]).a_(var5);
            }
         }
      }

   }

   public boolean id_class(double var1, double var3, double var5, boolean var7) {
      double var8 = this.rx();
      double var10 = this.re();
      double var12 = this.BO();
      double var14 = var3;
      boolean var16 = false;
      rfH_2 var17 = new rfH_2(var1, var3, var5);
      rYB var18 = (rYB)this.id_throws[7];
      if (var18.id_int(var17)) {
         boolean var19 = false;

         while(!var19 && var17.c_() > 0) {
            rfH_2 var20 = var17.id_break();
            xc_3 var21 = var18.id_byte(var20);
            if (var21.id_byte().id_byte()) {
               var19 = true;
            } else {
               var14 -= (double)1.0F;
               var17 = var20;
            }
         }

         if (var19) {
            this.id_case(var1, var14, var5);
            if (var18.id_throws(this) && !var18.id_protected(this.rN())) {
               var16 = true;
            }
         }
      }

      if (!var16) {
         this.id_case(var8, var10, var12);
         return false;
      } else {
         if (var7) {
            var18.id_class(this, 46);
         }

         if (this instanceof aA_2) {
            ((aA_2)this).id_public().id_final();
         }

         return true;
      }
   }

   public void id_class(rdn_3 var1, int var2) {
      if (!var1.id_class() && this.id_return()) {
         if (var1.id_native() == rkc_3.DRINK) {
            this.id_class(this.id_byte(var1), 0.5F, ((rYB)this.id_throws[7]).id_int.nextFloat() * 0.1F + 0.9F);
         }

         if (var1.id_native() == rkc_3.EAT) {
            this.id_break(var1, var2);
            this.id_class(this.id_protected(var1), 0.5F + 0.5F * (float)((Random)this.id_throws[40]).nextInt(2), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
         }
      }

   }

   public boolean id_class(iB_2 var1, ay_3 var2) {
      return var2.id_class(this, var1);
   }

   public void id_class(rfH_2 var1, boolean var2) {
   }

   public void id_class(rLY var1, boolean var2) {
      this.id_private();
      Boolean var8 = true;
      this.id_private[53] = var8;
      if (var2 && !((rYB)this.id_throws[7]).id_continue) {
         rLR var3 = var1.id_class();
         var3.id_class(this, this.BT(), var1.id_byte());
         var3.id_break(this, this.BT(), var1.id_byte());
      }

      rrLI.id_break(this, var1, var2);
   }

   public rjU_2 id_class(double var1, boolean var3, rjU_2 var4) {
      if (!this.rw() && !this.PF()) {
         double var5;
         if (var3 && Math.abs(var4.id_byte - 0.005) >= 0.003 && Math.abs(var4.id_byte - var1 / (double)16.0F) < 0.003) {
            var5 = -0.003;
         } else {
            var5 = var4.id_byte - var1 / (double)16.0F;
         }

         return new rjU_2(var4.id_break, var5, var4.id_protected);
      } else {
         return var4;
      }
   }

   public void id_default() {
      this.id_private();
      if ((Integer)this.id_private[59] > 0) {
         Integer var17 = (Integer)this.id_private[59] - 1;
         this.id_private[59] = var17;
      }

      if (this.id_return()) {
         Integer var18 = (Integer)this.id_private[73] + 1;
         this.id_private[73] = var18;
      } else {
         Integer var19 = Integer.valueOf(0);
         this.id_private[73] = var19;
      }

      if (this.BL()) {
         Integer var20 = Integer.valueOf(0);
         this.id_private[77] = var20;
         Integer var21 = (Integer)this.id_private[76] + 1;
         this.id_private[76] = var21;
      } else {
         Integer var22 = Integer.valueOf(0);
         this.id_private[76] = var22;
         Integer var23 = (Integer)this.id_private[77] + 1;
         this.id_private[77] = var23;
      }

      if (this.Po()) {
         Integer var24 = Integer.valueOf(0);
         this.id_private[45] = var24;
         this.id_byte(this.rx(), this.re(), this.BO());
      }

      if ((Integer)this.id_private[45] > 0) {
         double var1 = this.rx() + ((Double)this.id_private[46] - this.rx()) / (double)(Integer)this.id_private[45];
         double var3 = this.re() + ((Double)this.id_private[47] - this.re()) / (double)(Integer)this.id_private[45];
         double var5 = this.BO() + ((Double)this.id_private[48] - this.BO()) / (double)(Integer)this.id_private[45];
         double var7 = rfU_2.id_case((Double)this.id_private[49] - (double)(Float)this.id_throws[15]);
         Float var25 = (float)((double)(Float)this.id_throws[15] + var7 / (double)(Integer)this.id_private[45]);
         this.id_throws[15] = var25;
         Float var26 = (float)((double)(Float)this.id_throws[16] + ((Double)this.id_private[50] - (double)(Float)this.id_throws[16]) / (double)(Integer)this.id_private[45]);
         this.id_throws[16] = var26;
         Integer var27 = (Integer)this.id_private[45] - 1;
         this.id_private[45] = var27;
         this.id_new(var1, var3, var5);
         this.id_case((Float)this.id_throws[15], (Float)this.id_throws[16]);
      } else if (!this.id_try()) {
         this.id_byte((rjU_2)this.rv().id_class(0.98));
      }

      if ((Integer)this.id_private[52] > 0) {
         Float var28 = (float)((double)(Float)this.id_private[25] + rfU_2.id_case((Double)this.id_private[51] - (double)(Float)this.id_private[25]) / (double)(Integer)this.id_private[52]);
         this.id_private[25] = var28;
         Integer var29 = (Integer)this.id_private[52] - 1;
         this.id_private[52] = var29;
      }

      rjU_2 var37 = this.rv();
      double var2 = var37.id_break;
      double var4 = var37.id_byte;
      double var6 = var37.id_protected;
      if (Math.abs(var37.id_break) < 0.003) {
         var2 = (double)0.0F;
      }

      if (Math.abs(var37.id_byte) < 0.003) {
         var4 = (double)0.0F;
      }

      if (Math.abs(var37.id_protected) < 0.003) {
         var6 = (double)0.0F;
      }

      this.id_catch(var2, var4, var6);
      if (this.BK()) {
         Boolean var30 = false;
         this.id_private[41] = var30;
         Float var31 = 0.0F;
         this.id_private[42] = var31;
         Float var32 = 0.0F;
         this.id_private[44] = var32;
      } else if (this.id_try()) {
         this.Q();
      }

      if ((Boolean)this.id_private[41] && this.sr()) {
         double var8;
         if (this.ry()) {
            var8 = this.id_break((rlb_3)rlG_2.id_byte);
         } else {
            var8 = this.id_break((rlb_3)rlG_2.id_break);
         }

         boolean var10 = this.rT() && var8 > (double)0.0F ? true : false;
         double var11 = this.rI();
         if (!var10 || (Boolean)this.id_throws[20] && !(var8 > var11)) {
            if (!this.ry() || (Boolean)this.id_throws[20] && !(var8 > var11)) {
               if (((Boolean)this.id_throws[20] || var10 && var8 <= var11) && (Integer)this.id_private[59] == 0) {
                  this.id_continue(true);
               }
            } else {
               this.id_byte((rlb_3)rlG_2.id_byte);
            }
         } else {
            this.id_byte((rlb_3)rlG_2.id_break);
         }
      } else {
         Integer var33 = Integer.valueOf(0);
         this.id_private[59] = var33;
      }

      Float var34 = (Float)this.id_private[42] * 0.98F;
      this.id_private[42] = var34;
      Float var35 = (Float)this.id_private[44] * 0.98F;
      this.id_private[44] = var35;
      this.id_super();
      rfl_3 var38 = this.rN();
      this.id_private(new rjU_2((double)(Float)this.id_private[42], (double)(Float)this.id_private[43], (double)(Float)this.id_private[44]));
      if ((Integer)this.id_private[69] > 0) {
         Integer var36 = (Integer)this.id_private[69] - 1;
         this.id_private[69] = var36;
         this.id_class(var38, this.rN());
      }

      this.SS();
      if (!((rYB)this.id_throws[7]).id_continue && this.BU() && this.Pk()) {
         this.id_break(rye_3.id_private, 1.0F);
      }

   }

   public float t() {
      this.id_private();
      return (Float)this.id_private[25];
   }

   public void j() {
      this.id_break(rye_3.id_volatile, Float.MAX_VALUE);
   }

   public rdn_3 ss() {
      return this.id_class(rXQ.MAINHAND);
   }

   public void rf() {
      Boolean var5 = ((Random)this.id_throws[40]).nextDouble() >= this.id_class(iQ_2.id_byte) ? true : false;
      this.id_throws[25] = var5;
   }

   private void id_void() {
      this.id_private();
      Float var5 = (Float)this.id_private[70];
      this.id_private[71] = var5;
      if (this.rP()) {
         Float var6 = Math.min(1.0F, (Float)this.id_private[70] + 0.09F);
         this.id_private[70] = var6;
      } else {
         Float var7 = Math.max(0.0F, (Float)this.id_private[70] - 0.09F);
         this.id_private[70] = var7;
      }

   }

   public void sh() {
   }

   public float id_break(float var1, float var2, float var3) {
      this.id_private();
      float var4 = rfU_2.id_catch(var1 - (Float)this.id_private[23]);
      Float var11 = (Float)this.id_private[23] + var4 * 0.3F;
      this.id_private[23] = var11;
      float var5 = rfU_2.id_catch(var3 - (Float)this.id_private[23]);
      boolean var6 = !(var5 < -90.0F) && !(var5 >= 90.0F) ? false : true;
      if (var5 < -75.0F) {
         var5 = -75.0F;
      }

      if (var5 >= 75.0F) {
         var5 = 75.0F;
      }

      Float var12 = var3 - var5;
      this.id_private[23] = var12;
      if (var5 * var5 > 2500.0F) {
         Float var13 = (Float)this.id_private[23] + var5 * 0.2F;
         this.id_private[23] = var13;
      }

      if (var6) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void id_break(rXQ var1) {
      ((rYB)this.id_throws[7]).id_class(this, id_throws(var1));
   }

   private void id_break(rXQ var1, rdn_3 var2) {
      this.id_private();
      ((rqs_3)this.id_private[3]).set(var1.id_break(), var2);
   }

   public void id_break(rye_3 var1) {
      this.id_private();
      if (!(Boolean)this.id_throws[27] && !(Boolean)this.id_private[32]) {
         an_3 var2 = var1.id_extends();
         iB_2 var3 = this.Sh();
         if ((Integer)this.id_private[39] >= 0 && var3 != null) {
            var3.id_class(this, (Integer)this.id_private[39], var1);
         }

         if (this.Sc()) {
            this.SQ();
         }

         Boolean var8 = true;
         this.id_private[32] = var8;
         this.SW().id_throws();
         if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            if (var2 != null) {
               var2.id_class((rrEm_1)((rYB)this.id_throws[7]), this);
            }

            this.id_protected(var1);
            this.id_class(var3);
         }

         ((rYB)this.id_throws[7]).id_class(this, 3);
         this.id_class(iM_2.DYING);
      }

   }

   public void id_break(rhd_3 var1) {
      this.id_private();
      this.id_private[30] = var1;
      Integer var7 = (Integer)this.id_throws[41];
      this.id_private[31] = var7;
   }

   private void id_break(rdn_3 var1, int var2) {
      for(int var3 = false; var3 < var2; ++var3) {
         rjU_2 var4 = new rjU_2(((double)((Random)this.id_throws[40]).nextFloat() - (double)0.5F) * 0.1, Math.random() * 0.1 + 0.1, (double)0.0F);
         var4 = var4.id_class(-(Float)this.id_throws[16] * ((float)Math.PI / 180F));
         var4 = var4.id_break(-(Float)this.id_throws[15] * ((float)Math.PI / 180F));
         double var5 = (double)(-((Random)this.id_throws[40]).nextFloat()) * 0.6 - 0.3;
         rjU_2 var7 = new rjU_2(((double)((Random)this.id_throws[40]).nextFloat() - (double)0.5F) * 0.3, var5, 0.6);
         var7 = var7.id_class(-(Float)this.id_throws[16] * ((float)Math.PI / 180F));
         var7 = var7.id_break(-(Float)this.id_throws[15] * ((float)Math.PI / 180F));
         var7 = var7.id_break(this.rx(), this.rH(), this.BO());
         ((rYB)this.id_throws[7]).id_class(new rLk_1(rLQ.id_void, var1), var7.id_break, var7.id_byte, var7.id_protected, var4.id_break, var4.id_byte + 0.05, var4.id_protected);
      }

   }

   public float id_break(iM_2 var1, ap_3 var2) {
      return super.id_class(var1, var2);
   }

   public rjU_2 id_break(rjU_2 var1, float var2) {
      this.id_private();
      this.id_class(this.id_byte(var2), var1);
      this.id_byte((rjU_2)this.id_finally(this.rv()));
      this.id_class((iG_2)iG_2.SELF, (rjU_2)this.rv());
      rjU_2 var3 = this.rv();
      if (((Boolean)this.id_throws[23] || (Boolean)this.id_private[41]) && this.o_()) {
         var3 = new rjU_2(var3.id_break, 0.2, var3.id_protected);
      }

      return var3;
   }

   public boolean id_break(rLY var1) {
      this.id_private();
      if (!this.id_throws(var1)) {
         return false;
      } else {
         rLY var2 = (rLY)((Map)this.id_private[2]).get(var1.id_class());
         if (var2 == null) {
            ((Map)this.id_private[2]).put(var1.id_class(), var1);
            this.id_protected(var1);
            return true;
         } else if (var2.id_break(var1)) {
            this.id_class(var2, true);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean id_break(rye_3 var1, float var2) {
      this.id_private();
      if (this.id_class(var1)) {
         return false;
      } else if (((rYB)this.id_throws[7]).id_continue) {
         return false;
      } else if (this.Sl()) {
         return false;
      } else if (var1.id_int() && this.id_break(rLD.id_native)) {
         return false;
      } else {
         if (this.Sc() && !((rYB)this.id_throws[7]).id_continue) {
            this.SQ();
         }

         Integer var16 = Integer.valueOf(0);
         this.id_private[33] = var16;
         float var3 = var2;
         if ((var1 == rye_3.id_new || var1 == rye_3.id_continue) && !this.id_class(rXQ.HEAD).id_class()) {
            this.id_class(rXQ.HEAD).id_class((int)(var2 * 4.0F + ((Random)this.id_throws[40]).nextFloat() * var2 * 2.0F), this, (var0) -> var0.id_break(rXQ.HEAD));
            var2 *= 0.75F;
         }

         boolean var4 = false;
         float var5 = 0.0F;
         if (var2 > 0.0F && this.id_case(var1)) {
            this.id_else(var2);
            var5 = var2;
            var2 = 0.0F;
            if (!var1.id_break()) {
               an_3 var6 = var1.id_finally();
               if (var6 instanceof iB_2) {
                  this.id_protected((iB_2)var6);
               }
            }

            var4 = true;
         }

         Float var17 = 1.5F;
         this.id_private[18] = var17;
         boolean var33 = true;
         if ((float)(Integer)this.id_throws[47] > 10.0F) {
            if (var2 <= (Float)this.id_private[40]) {
               return false;
            }

            this.id_class(var1, var2 - (Float)this.id_private[40]);
            Float var18 = var2;
            this.id_private[40] = var18;
            var33 = false;
         } else {
            Float var19 = var2;
            this.id_private[40] = var19;
            Integer var20 = 20;
            this.id_throws[47] = var20;
            this.id_class(var1, var2);
            Integer var21 = 10;
            this.id_private[11] = var21;
            Integer var22 = (Integer)this.id_private[11];
            this.id_private[10] = var22;
         }

         Float var23 = 0.0F;
         this.id_private[12] = var23;
         an_3 var7 = var1.id_extends();
         if (var7 != null) {
            if (var7 instanceof iB_2) {
               this.id_break((iB_2)var7);
            }

            if (var7 instanceof rhd_3) {
               Integer var24 = 100;
               this.id_private[31] = var24;
               rhd_3 var25 = (rhd_3)var7;
               this.id_private[30] = var25;
            } else if (var7 instanceof rOH) {
               rOH var8 = (rOH)var7;
               if (var8.sZ()) {
                  Integer var26 = 100;
                  this.id_private[31] = var26;
                  iB_2 var9 = var8.sF();
                  if (var9 != null && var9.BC() == aI_2.rM) {
                     rhd_3 var27 = (rhd_3)var9;
                     this.id_private[30] = var27;
                  } else {
                     Object var28 = null;
                     this.id_private[30] = var28;
                  }
               }
            }
         }

         if (var33) {
            if (var4) {
               ((rYB)this.id_throws[7]).id_class(this, 29);
            } else if (var1 instanceof rpX_2 && ((rpX_2)var1).id_goto()) {
               ((rYB)this.id_throws[7]).id_class(this, 33);
            } else {
               byte var34;
               if (var1 == rye_3.id_private) {
                  var34 = 36;
               } else if (var1.id_int()) {
                  var34 = 37;
               } else if (var1 == rye_3.id_else) {
                  var34 = 44;
               } else {
                  var34 = 2;
               }

               ((rYB)this.id_throws[7]).id_class(this, var34);
            }

            if (var1 != rye_3.id_private && (!var4 || var2 > 0.0F)) {
               this.rf();
            }

            if (var7 != null) {
               double var35 = var7.rx() - this.rx();

               double var10;
               for(var10 = var7.BO() - this.BO(); var35 * var35 + var10 * var10 < 1.0E-4; var10 = (Math.random() - Math.random()) * 0.01) {
                  var35 = (Math.random() - Math.random()) * 0.01;
               }

               Float var29 = (float)(rfU_2.id_protected(var10, var35) * (double)(180F / (float)Math.PI) - (double)(Float)this.id_throws[15]);
               this.id_private[12] = var29;
               this.id_class(0.4F, var35, var10);
            } else {
               Float var30 = (float)((int)(Math.random() * (double)2.0F) * 180);
               this.id_private[12] = var30;
            }
         }

         if (this.Sl()) {
            if (!this.id_catch(var1)) {
               rqA_2 var36 = this.Bt();
               if (var33 && var36 != null) {
                  this.id_class(var36, this.Si(), this.SN());
               }

               this.id_break(var1);
            }
         } else if (var33) {
            this.id_throws(var1);
         }

         boolean var37 = var4 && !(var2 > 0.0F) ? false : true;
         if (var37) {
            this.id_private[67] = var1;
            Long var32 = ((rYB)this.id_throws[7]).r();
            this.id_private[68] = var32;
         }

         if (this instanceof rhN_2) {
            Oo_1.id_private.id_class((rhN_2)this, var1, var3, var2, var4);
            if (var5 > 0.0F && var5 < 3.4028235E37F) {
               ((rhN_2)this).id_class(rlB_2.id_static, Math.round(var5 * 10.0F));
            }
         }

         if (var7 instanceof rhN_2) {
            Oo_1.id_catch.id_class((rhN_2)var7, this, var1, var3, var2, var4);
         }

         return var37;
      }
   }

   public double id_break(iJ_2 var1) {
      return this.BT().id_protected(var1);
   }

   public void id_break(rpm_3 var1) {
      this.id_private();
      rdn_3 var2 = this.id_protected(var1);
      if (!var2.id_class() && !this.id_return()) {
         this.id_private[61] = var2;
         Integer var8 = (Integer)this.id_private[63];
         this.id_private[62] = var8;
         Integer var9 = var2.id_extends();
         this.id_private[63] = var9;
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_byte(true, true);
            this.id_byte(2, var1 == rpm_3.OFF_HAND ? true : false);
         }
      }

   }

   private void id_break(Map<rXQ, rdn_3> var1) {
      rdn_3 var2 = (rdn_3)var1.get(rXQ.MAINHAND);
      rdn_3 var3 = (rdn_3)var1.get(rXQ.OFFHAND);
      if (var2 != null && var3 != null && rdn_3.id_break(var2, this.id_protected(rXQ.OFFHAND)) && rdn_3.id_break(var3, this.id_protected(rXQ.MAINHAND))) {
         ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(this, new rvQ_2(this, 55));
         var1.remove(rXQ.MAINHAND);
         var1.remove(rXQ.OFFHAND);
         this.id_break(rXQ.MAINHAND, var2.id_implements());
         this.id_break(rXQ.OFFHAND, var3.id_implements());
      }

   }

   public boolean id_break(xc_3 var1) {
      return var1.id_catch() && !this.Sy() ? false : true;
   }

   public void id_break(rdn_3 var1) {
      if (!var1.id_class()) {
         rqA_2 var2 = rqn_3.id_default;
         rdb_3 var3 = var1.id_break();
         if (var3 instanceof rxS_2) {
            var2 = ((rxS_2)var3).id_throws().id_break();
         } else if (var3 == rdy_3.kc) {
            var2 = rqn_3.id_short;
         }

         this.id_class(var2, 1.0F, 1.0F);
      }

   }

   public void id_break(rcd_3 var1) {
      this.id_private();
      this.id_return(var1.id_finally(id_class[10]));
      if (var1.id_byte(id_class[11], 9) && (rYB)this.id_throws[7] != null && !((rYB)this.id_throws[7]).id_continue) {
         this.BT().id_class(var1.id_protected(id_class[12], 10));
      }

      if (var1.id_byte(id_class[13], 9)) {
         rcy_3 var2 = var1.id_protected(id_class[14], 10);

         for(int var3 = false; var3 < var2.size(); ++var3) {
            rcd_3 var4 = var2.id_class(var3);
            rLY var5 = rLY.id_break(var4);
            if (var5 != null) {
               ((Map)this.id_private[2]).put(var5.id_class(), var5);
            }
         }
      }

      if (var1.id_byte(id_class[15], 99)) {
         this.id_public(var1.id_finally(id_class[16]));
      }

      Integer var10 = var1.id_catch(id_class[17]);
      this.id_private[10] = var10;
      Integer var11 = var1.id_catch(id_class[18]);
      this.id_private[13] = var11;
      Integer var12 = var1.id_private(id_class[19]);
      this.id_private[55] = var12;
      if (var1.id_byte(id_class[20], 8)) {
         String var14 = var1.id_native(id_class[21]);
         rnB_2 var16 = ((rYB)this.id_throws[7]).id_package().id_throws(var14);
         boolean var17 = var16 != null && ((rYB)this.id_throws[7]).id_package().id_class(this.rz(), var16) ? true : false;
         if (!var17) {
            ((Logger)id_case[0]).warn(id_class[22], var14);
         }
      }

      if (var1.id_new(id_class[23])) {
         this.id_break(7, true);
      }

      if (var1.id_byte(id_class[24], 99) && var1.id_byte(id_class[25], 99) && var1.id_byte(id_class[26], 99)) {
         rfH_2 var15 = new rfH_2(var1.id_private(id_class[27]), var1.id_private(id_class[28]), var1.id_private(id_class[29]));
         this.id_catch(var15);
         ((rmE_2)this.id_throws[49]).id_break((rut_3)id_case[11], iM_2.SLEEPING);
         if (!(Boolean)this.id_throws[48]) {
            this.id_class(var15);
         }
      }

      if (var1.id_byte(id_class[30], 10)) {
         iZ_2 var13 = this.id_class(new Dynamic(rcf_3.id_class, var1.id_byte(id_class[31])));
         this.id_private[72] = var13;
      }

   }

   public boolean id_break(rLR var1) {
      this.id_private();
      return ((Map)this.id_private[2]).containsKey(var1);
   }

   public void id_break(iB_2 var1) {
      this.id_private();
      this.id_private[54] = var1;
      Integer var7 = (Integer)this.id_throws[41];
      this.id_private[55] = var7;
   }

   public void id_throws(iB_2 var1) {
      var1.id_class(0.5F, var1.rx() - this.rx(), var1.BO() - this.BO());
   }

   public void id_throws(rfH_2 var1) {
      int var2 = eA_2.id_class(eY_2.id_finally, this);
      if (var2 > 0) {
         eD_2.id_class(this, (rYB)this.id_throws[7], var1, var2);
      }

      if (this.id_break(this.Pl())) {
         this.SI();
      }

      this.Ba();
   }

   public void id_throws(rye_3 var1) {
      rqA_2 var2 = this.id_byte(var1);
      if (var2 != null) {
         this.id_class(var2, this.Si(), this.SN());
      }

   }

   private static byte id_throws(rXQ var0) {
      switch (((int[])iS_2.id_class[1])[var0.ordinal()]) {
         case 1 -> {
            return 47;
         }
         case 2 -> {
            return 48;
         }
         case 3 -> {
            return 49;
         }
         case 4 -> {
            return 50;
         }
         case 5 -> {
            return 52;
         }
         case 6 -> {
            return 51;
         }
         default -> {
            return 47;
         }
      }
   }

   public float id_throws(rye_3 var1, float var2) {
      if (var1.id_implements()) {
         return var2;
      } else {
         if (this.id_break(rLD.id_extends) && var1 != rye_3.id_volatile) {
            int var3 = (this.id_byte(rLD.id_extends).id_byte() + 1) * 5;
            int var4 = 25 - var3;
            float var5 = var2 * (float)var4;
            float var6 = var2;
            var2 = Math.max(var5 / 25.0F, 0.0F);
            float var7 = var6 - var2;
            if (var7 > 0.0F && var7 < 3.4028235E37F) {
               if (this instanceof rhN_2) {
                  ((rhN_2)this).id_class(rlB_2.id_short, Math.round(var7 * 10.0F));
               } else if (var1.id_extends() instanceof rhN_2) {
                  ((rhN_2)var1.id_extends()).id_class(rlB_2.id_float, Math.round(var7 * 10.0F));
               }
            }
         }

         if (var2 <= 0.0F) {
            return 0.0F;
         } else {
            int var8 = eA_2.id_class(this.PV(), var1);
            if (var8 > 0) {
               var2 = ryg_3.id_class(var2, (float)var8);
            }

            return var2;
         }
      }
   }

   public float id_throws(float var1) {
      this.id_private();
      return var1 == 1.0F ? (Float)this.id_private[25] : rfU_2.id_catch(var1, (Float)this.id_private[27], (Float)this.id_private[25]);
   }

   public boolean id_throws(rLY var1) {
      if (this.sG() != aL_2.id_break) {
         return true;
      } else {
         rLR var2 = var1.id_class();
         return var2 != rLD.id_finally && var2 != rLD.id_super ? true : false;
      }
   }

   public boolean id_throws(rdn_3 var1) {
      return false;
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_static();
      id_float();
      id_public();
      id_continue();
      id_package();
      id_new();
      id_int();
      id_instanceof();
   }

   public void Sm() {
      this.id_byte((rjU_2)this.rv().id_break((double)0.0F, (double)-0.04F, (double)0.0F));
   }

   public boolean Sc() {
      return this.Bg().isPresent();
   }

   public void Sk() {
      this.id_private();
      Iterator var1 = ((Map)this.id_private[2]).keySet().iterator();

      try {
         while(var1.hasNext()) {
            rLR var2 = (rLR)var1.next();
            rLY var3 = (rLY)((Map)this.id_private[2]).get(var2);
            if (!var3.id_class(this, () -> this.id_class(var3, true))) {
               if (!((rYB)this.id_throws[7]).id_continue) {
                  var1.remove();
                  this.id_class(var3);
               }
            } else if (var3.id_break() % 600 == 0) {
               this.id_class(var3, false);
            }
         }
      } catch (ConcurrentModificationException var17) {
      }

      if ((Boolean)this.id_private[53]) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.SA();
         }

         Boolean var14 = false;
         this.id_private[53] = var14;
      }

      Integer var15 = (Integer)this.id_private[79];
      this.id_private[78] = var15;
      Integer var16 = (Integer)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[5]);
      this.id_private[79] = var16;
      boolean var18 = (Boolean)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[6]);
      if ((Integer)this.id_private[79] > 0) {
         boolean var19;
         if (this.Pp()) {
            var19 = ((Random)this.id_throws[40]).nextInt(15) == 0 ? true : false;
         } else {
            var19 = ((Random)this.id_throws[40]).nextBoolean();
         }

         if (var18) {
            var19 &= ((Random)this.id_throws[40]).nextInt(5) == 0 ? true : false;
         }

         if (var19 && (Integer)this.id_private[79] > 0) {
            double var4 = (double)((Integer)this.id_private[79] >> 16 & 255) / (double)255.0F;
            double var6 = (double)((Integer)this.id_private[79] >> 8 & 255) / (double)255.0F;
            double var8 = (double)((Integer)this.id_private[79] & 255) / (double)255.0F;
            ((rYB)this.id_throws[7]).id_class(var18 ? rLQ.id_class : rLQ.id_else, this.id_break((double)0.5F), this.Ph(), this.id_protected((double)0.5F), var4, var6, var8);
         }
      } else if (((rYB)this.id_throws[7]).id_continue && this != (cb_3)QY.id_instanceof().id_class[57] && !((Map)this.id_private[2]).isEmpty() && (Integer)this.id_private[78] > 0) {
         Iterator var20 = ((Map)this.id_private[2]).values().iterator();

         while(var20.hasNext()) {
            rLY var21 = (rLY)var20.next();
            this.id_class(var21);
            var20.remove();
         }
      }

   }

   public Collection<rLY> So() {
      this.id_private();
      return ((Map)this.id_private[2]).values();
   }

   public rpm_3 P() {
      return ((Byte)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[3]) & 2) > 0 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
   }

   public int BD() {
      this.id_private();
      return (Integer)this.id_private[64];
   }

   private rjU_2 id_finally(rjU_2 var1) {
      if (this.o_()) {
         Float var12 = 0.0F;
         this.id_throws[31] = var12;
         double var2 = rfU_2.id_class(var1.id_break, (double)-0.15F, (double)0.15F);
         double var4 = rfU_2.id_class(var1.id_protected, (double)-0.15F, (double)0.15F);
         double var6 = Math.max(var1.id_byte, (double)-0.15F);
         if (var6 < (double)0.0F && !this.sS().id_class(xu_3.hU) && this.id_transient() && this instanceof rhd_3) {
            var6 = (double)0.0F;
         }

         var1 = new rjU_2(var2, var6, var4);
      }

      return var1;
   }

   public static String id_finally(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 77, -82, -81, 24, 125, -59, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_catch(rfH_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[9], Optional.of(var1));
   }

   private void id_catch(rdn_3 var1) {
      if (!var1.id_class()) {
         if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.Eg, this.Pr(), 0.8F, 0.8F + ((rYB)this.id_throws[7]).id_int.nextFloat() * 0.4F, false);
         }

         this.id_break(var1, 5);
      }

   }

   private boolean id_catch(rye_3 var1) {
      if (var1.id_private()) {
         return false;
      } else {
         rdn_3 var2 = null;
         rpm_3[] var3 = rpm_3.values();
         int var4 = var3.length;

         for(int var5 = false; var5 < var4; ++var5) {
            rpm_3 var6 = var3[var5];
            rdn_3 var7 = this.id_protected(var6);
            if (var7.id_break() == rdy_3.kL) {
               var2 = var7.id_implements();
               var7.id_catch(true);
               break;
            }
         }

         if (var2 != null) {
            if (this instanceof rhN_2) {
               rhN_2 var8 = (rhN_2)this;
               var8.id_class(rlB_2.id_byte.id_break(rdy_3.kL));
               Oo_1.id_instanceof.id_class(var8, var2);
            }

            this.id_public(1.0F);
            this.SY();
            this.id_break(new rLY(rLD.id_finally, 900, true));
            this.id_break(new rLY(rLD.id_synchronized, 100, true));
            this.id_break(new rLY(rLD.id_native, 800, false));
            ((rYB)this.id_throws[7]).id_class(this, 35);
         }

         return var2 != null ? true : false;
      }
   }

   public rfl_3 id_catch(iM_2 var1) {
      ap_3 var2 = this.a_(var1);
      return new rfl_3((double)(-var2.id_class / 2.0F), (double)0.0F, (double)(-var2.id_class / 2.0F), (double)(var2.id_class / 2.0F), (double)var2.id_break, (double)(var2.id_class / 2.0F));
   }

   public boolean id_catch(iB_2 var1) {
      return true;
   }

   public boolean id_extends(int var1) {
      this.id_private();
      if (this.id_return() && !((rdn_3)this.id_private[61]).id_class()) {
         rdb_3 var2 = ((rdn_3)this.id_private[61]).id_break();
         if (var2.id_byte((rdn_3)this.id_private[61]) != rkc_3.BLOCK) {
            return false;
         } else {
            return var2.id_break((rdn_3)this.id_private[61]) - (Integer)this.id_private[63] >= var1 ? true : false;
         }
      } else {
         return false;
      }
   }

   private boolean id_goto() {
      return (Boolean)this.Bg().map((var1) -> ((rYB)this.id_throws[7]).id_byte(var1).id_break() instanceof xb_3).orElse(false);
   }

   public float id_goto(float var1) {
      this.id_private();
      float var2 = (Float)this.id_private[15] - (Float)this.id_private[14];
      if (var2 < 0.0F) {
         var2 += 1.0F;
      }

      return (Float)this.id_private[14] + var2 * var1;
   }

   public double id_goto(an_3 var1) {
      double var2 = (double)1.0F;
      if (this.Pw()) {
         var2 *= 0.8;
      }

      if (this.Pp()) {
         float var4 = this.Bp();
         if (var4 < 0.1F) {
            var4 = 0.1F;
         }

         var2 *= 0.7 * (double)var4;
      }

      if (var1 != null) {
         rdn_3 var7 = this.id_class(rXQ.HEAD);
         rdb_3 var5 = var7.id_break();
         aI_2 var6 = var1.BC();
         if (var6 == aI_2.A && var5 == rdy_3.dh || var6 == aI_2.rs && var5 == rdy_3.dx || var6 == aI_2.id_volatile && var5 == rdy_3.dd) {
            var2 *= (double)0.5F;
         }
      }

      return var2;
   }

   public rdn_3 id_case(rdn_3 var1) {
      return rdn_3.id_break;
   }

   private boolean id_case(rye_3 var1) {
      an_3 var2 = var1.id_finally();
      boolean var3 = false;
      if (var2 instanceof rhm_3 var4) {
         if (var4.id_package() > 0) {
            var3 = true;
         }
      }

      if (!var1.id_case() && this.id_extends(5) && !var3) {
         rjU_2 var7 = var1.id_return();
         if (var7 != null) {
            rjU_2 var5 = this.id_break(1.0F);
            rjU_2 var6 = var7.id_class(this.Ps()).id_protected();
            var6 = new rjU_2(var6.id_break, (double)0.0F, var6.id_protected);
            return var6.id_break(var5) < (double)0.0F ? true : false;
         }
      }

      return false;
   }

   public void id_case(rfH_2 var1) {
      if (this.Pm()) {
         this.BH();
      }

      xc_3 var2 = ((rYB)this.id_throws[7]).id_byte(var1);
      if (var2.id_break() instanceof xb_3) {
         ((rYB)this.id_throws[7]).id_class(var1, (xc_3)var2.id_class(xb_3.id_final, true), 3);
      }

      this.id_class(iM_2.SLEEPING);
      this.id_class(var1);
      this.id_catch(var1);
      this.id_byte((rjU_2)rjU_2.id_class);
      Boolean var7 = true;
      this.id_throws[57] = var7;
   }

   private rdn_3 id_case(rXQ var1) {
      this.id_private();
      return (rdn_3)((rqs_3)this.id_private[4]).get(var1.id_break());
   }

   public void id_case(iB_2 var1) {
   }

   private static void id_continue() {
      id_native = new short[]{1, 2, 3, 4, 20, 29, 53, 61, 66, 0, 2, 22, 21, 15, 15, 25, 16, 26, 37, 72, 72, 49, 3, 49, 5, 49, 6, 49, 7, 49, 8, 49, 4, 49, 9, 7, 31, 7, 31, 31, 7, 71, 70, 15, 14, 48, 7, 7, 7, 7, 7, 18, 7, 40, 40, 40, 40, 40, 40, 7, 7, 7, 65, 65, 10, 10, 10, 47, 47, 47, 31, 31, 31, 30, 56, 56, 56, 54, 54, 41, 55, 36, 37, 23, 24, 25, 27, 15, 17, 16, 18, 26, 28, 41, 7, 40, 40, 40, 40, 40, 7, 1, 1, 1, 7, 13, 13, 13, 40, 40, 40, 7, 40, 40, 54, 55, 30, 41, 31, 54, 41, 55, 56, 57, 56, 56, 41, 57, 33, 33, 10, 55, 13, 2, 2, 72, 0, 7, 7, 2, 10, 13, 55, 7, 7, 0, 49, 11, 48, 72, 2, 2, 7, 600, 53, 7, 53, 79, 78, 49, 5, 79, 49, 6, 79, 40, 40, 40, 79, 79, 255, 79, 255, 79, 255, 7, 7, 57, 2, 78, 2, 2, 2, 49, 6, 49, 5, 49, 6, 49, 5, 7, 2, 2, 2, 2, 2, 2, 2, 2, 2, 53, 7, 53, 7, 53, 7, 49, 4, 49, 4, 7, 7, 33, 40, 18, 47, 40, 40, 40, 40, 47, 11, 11, 10, 12, 31, 30, 31, 30, 30, 7, 7, 7, 15, 12, 180, 12, 67, 7, 68, 900, 800, 7, 7, 68, 67, 67, 7, 7, 27, 32, 39, 39, 32, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 31, 7, 7, 31, 7, 30, 7, 7, 7, 7, 40, 30, 30, 30, 57, 20, 66, 66, 66, 66, 7, 7, 27, 27, 13, 7, 11, 11, 10, 12, 1, 1, 1, 30, 30, 54, 54, 49, 7, 49, 7, 49, 8, 49, 8, 5, 7, 7, 7, 5, 6, 7, 7, 18, 47, 11, 11, 10, 12, 40, 40, 40, 40, 40, 40, 7, 7, 128, 128, 40, 40, 40, 8, 40, 9, 40, 10, 40, 7, 5, 7, 7, 7, 7, 5, 7, 7, 15, 0, 0, 2, 2, 40, 40, 40, 40, 27, 7, 0, 57, 57, 59, 31, 7, 57, 0, 20, 23, 23, 23, 31, 23, 7, 20, 7, 7, 20, 0, 31, 7, 7, 18, 17, 8, 9, 10, 18, 18, 18, 19, 18, 19, 23, 41, 31, 20, 29, 58, 58, 75, 75, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 41, 65, 8, 10, 23, 35, 34, 15, 20, 35, 35, 35, 15, 17, 17, 17, 15, 17, 17, 17, 23, 24, 24, 24, 23, 24, 24, 24, 16, 18, 18, 18, 16, 18, 18, 18, 26, 28, 28, 28, 26, 28, 28, 28, 25, 27, 27, 27, 25, 27, 27, 27, 36, 36, 64, 64, 64, 16, 0, 7, 7, 4, 4, 3, 3, 23, 23, 23, 23, 23, 23, 23, 59, 59, 59, 73, 73, 73, 77, 76, 76, 76, 77, 77, 45, 45, 46, 45, 47, 45, 48, 45, 49, 15, 15, 45, 15, 16, 50, 16, 45, 16, 45, 45, 15, 16, 52, 25, 51, 25, 52, 25, 52, 52, 41, 42, 44, 41, 20, 20, 20, 59, 59, 42, 42, 44, 44, 42, 43, 44, 69, 69, 69, 7, 20, 7, 64, 7, 7, 7, 40, 7, 69, 23, 69, 7, 69, 69, 7, 49, 3, 7, 35, 34, 35, 31, 46, 47, 48, 49, 50, 45, 51, 52, 41, 7, 27, 7, 7, 7, 7, 25, 27, 25, 15, 14, 14, 7, 27, 40, 25, 25, 25, 23, 60, 60, 53, 49, 3, 49, 3, 61, 61, 61, 63, 62, 63, 61, 61, 7, 61, 63, 62, 63, 63, 7, 61, 61, 61, 70, 71, 70, 70, 70, 70, 49, 3, 49, 3, 61, 63, 62, 63, 7, 9, 7, 3, 7, 61, 61, 61, 63, 62, 61, 63, 61, 61, 63, 62, 63, 25, 27, 25, 23, 23, 24, 7, 40, 40, 40, 40, 16, 15, 40, 40, 16, 15, 7, 61, 61, 61, 61, 7, 61, 61, 63, 62, 63, 61, 73, 61, 61, 7, 61, 7, 61, 63, 62, 63, 73, 61, 61, 61, 61, 63, 64, 7, 10, 49, 9, 49, 9, 49, 9, 7, 7, 57, 7, 7, 18, 1, 7, 57, 57, 51, 15, 57, 57, 51, 16, 0, 76, 77, 7, 7, 7, 15, 15, 16, 7, 0};
   }

   private static int id_continue(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -995155577;
   }

   public void id_continue(boolean var1) {
      this.id_private();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(this);
      float var2;
      float var3;
      int var4;
      if (var1 && this == (cb_3)QY.id_instanceof().id_class[57]) {
         rrAS var5 = rrAS.id_class(this.sO(), 10, 0.2F);
         if (var5.id_byte()) {
            return;
         }

         var2 = var5.id_protected();
         var3 = var5.id_class();
         var4 = var5.id_break();
      } else {
         var2 = this.sO();
         var3 = 0.2F;
         var4 = 10;
      }

      float var14 = this.ST();
      if (this.id_break(rLD.id_private)) {
         var14 += 0.1F * (float)(this.id_byte(rLD.id_private).id_byte() + 1);
      }

      rjU_2 var6 = this.rv();
      this.id_catch(var6.id_break, (double)var14, var6.id_protected);
      if (this.PF()) {
         float var7 = var2 * ((float)Math.PI / 180F);
         this.id_byte((rjU_2)this.rv().id_break((double)(-rfU_2.id_class(var7) * var3), (double)0.0F, (double)(rfU_2.id_break(var7) * var3)));
      }

      Boolean var12 = true;
      this.id_throws[57] = var12;
      Integer var13 = var4;
      this.id_private[59] = var13;
   }

   private void id_else() {
      Map var1 = this.id_long();
      if (var1 != null) {
         this.id_break(var1);
         if (!var1.isEmpty()) {
            this.id_class(var1);
         }
      }

   }

   public void id_else(float var1) {
   }

   public void id_implements(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_private[25] = var6;
   }

   public int id_implements(float var1, float var2) {
      rLY var3 = this.id_byte(rLD.id_private);
      float var4 = var3 == null ? 0.0F : (float)(var3.id_byte() + 1);
      return rfU_2.id_case((var1 - 3.0F - var4) * var2);
   }

   public static rjU_2 id_implements(rjU_2 var0) {
      return new rjU_2(var0.id_break, var0.id_byte, (double)0.0F);
   }

   private void id_implements() {
      rdn_3 var1 = this.id_class(rXQ.OFFHAND);
      this.id_class(rXQ.OFFHAND, this.id_class(rXQ.MAINHAND));
      this.id_class(rXQ.MAINHAND, var1);
   }

   private static void id_instanceof() {
      Object[] var0 = new Object[11];
      var0[0] = UUID.fromString(id_class[36]);
      var0[1] = UUID.fromString(id_class[37]);
      var0[2] = new ix_3((UUID)var0[0], id_class[38], (double)0.3F, (id_3)Enum.valueOf(id_3.class, "MULTIPLY_TOTAL"));
      var0[3] = rmE_2.id_class(iB_2.class, ruw_3.id_class);
      var0[4] = rmE_2.id_class(iB_2.class, ruw_3.id_byte);
      var0[5] = rmE_2.id_class(iB_2.class, ruw_3.id_break);
      var0[6] = rmE_2.id_class(iB_2.class, ruw_3.id_implements);
      var0[7] = rmE_2.id_class(iB_2.class, ruw_3.id_break);
      var0[8] = rmE_2.id_class(iB_2.class, ruw_3.id_break);
      var0[9] = rmE_2.id_class(iB_2.class, ruw_3.id_volatile);
      var0[10] = ap_3.id_byte(-1.0842022E-19F, -1.0842022E-19F);
      id_catch = var0;
   }

   public void id_instanceof(an_3 var1) {
      var1.id_byte((an_3)this);
   }

   public int id_new(int var1) {
      return Math.min(var1 + 4, this.ri());
   }

   private static void id_new() {
      id_protected = new double[]{(double)1.0F, (double)0.01F, (double)((float)Math.PI * 2F), (double)2.5F, (double)150.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.15F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.5F, 0.1, (double)0.5F, -0.2, 0.1, -0.2, 0.02, 0.02, 0.02, (double)1.0F, (double)1.0F, (double)255.0F, (double)255.0F, (double)255.0F, (double)0.5F, (double)0.5F, (double)1.0F, 0.8, 0.7, (double)0.5F, 1.0E-4, 0.01, 0.01, (double)(180F / (float)Math.PI), (double)2.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)0.0F, (double)2.0F, 0.4, (double)2.0F, (double)2.0F, (double)0.2F, (double)127.0F, (double)0.5F, (double)2.0F, (double)0.5F, (double)2.0F, (double)0.0F, (double)0.0F, (double)-0.04F, (double)0.0F, (double)0.0F, (double)0.04F, (double)0.0F, 0.08, (double)0.0F, 0.01, 0.2, (double)0.8F, (double)0.6F, (double)0.3F, (double)0.5F, (double)0.8F, (double)0.5F, (double)0.5F, (double)0.0F, (double)4.0F, (double)0.0F, (double)0.6F, (double)0.3F, (double)-0.5F, (double)1.0F, 0.4, (double)0.0F, (double)-1.0F, (double)0.75F, (double)0.0F, (double)0.0F, (double)0.0F, -0.1, (double)0.0F, 0.04, 3.2, (double)0.0F, 0.1, (double)0.0F, 0.1, (double)0.99F, (double)0.98F, (double)0.99F, (double)10.0F, (double)3.0F, 0.05, 0.2, (double)0.0F, -0.1, (double)0.0F, (double)0.98F, (double)0.0F, 0.2, 0.005, 0.003, (double)16.0F, 0.003, -0.003, (double)16.0F, (double)-0.15F, (double)0.15F, (double)-0.15F, (double)0.15F, (double)-0.15F, (double)0.0F, (double)0.0F, 0.98, 0.003, (double)0.0F, 0.003, (double)0.0F, 0.003, (double)0.0F, (double)0.0F, -0.2, (double)0.0F, (double)0.5F, 0.1, 0.1, 0.1, (double)0.0F, 0.6, 0.3, (double)0.5F, 0.3, 0.6, 0.05, (double)1.0F, (double)0.0F, (double)0.5F, (double)0.6875F, (double)0.5F, (double)0.5F, (double)0.5F, (double)0.5F, (double)(180F / (float)Math.PI), (double)90.0F, (double)0.5F, 0.1, (double)0.5F, (double)0.3F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F, (double)0.0F};
   }

   public void id_package(int var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[8], var1);
   }

   private static void id_package() {
      id_implements = new float[]{0.02F, 12398.0F, 0.6F, Float.MAX_VALUE, 1.0F, 0.0F, 3.0F, 3.0F, 0.2F, 15.0F, 1.0F, 2.0F, 0.4F, 0.9F, 0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.03F, 1.0F, 0.35F, 0.04F, 0.5F, 1.0F, 1.0F, 1.0F, 0.1F, 0.1F, 0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 0.75F, 0.0F, 0.0F, 0.0F, 1.5F, 10.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 3.4028235E37F, 10.0F, 0.5F, 1.0F, 1.0F, 0.8F, 0.8F, 0.4F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 3.0F, 0.5F, 0.75F, 0.0F, 25.0F, 0.0F, 0.0F, 3.4028235E37F, 10.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.4028235E37F, 10.0F, 0.0F, 6.0F, 2.0F, 1.5F, 0.0F, 0.2F, 1.0F, 0.2F, 1.0F, 0.0F, 0.2F, 1.0F, 0.0F, 1.0F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.5F, 0.2F, 0.5F, 0.2F, 0.5F, 0.2F, 4.0F, 0.0F, 1.0F, 0.2F, 1.5F, 0.2F, 1.0F, 0.42F, 0.2F, 0.2F, 0.1F, ((float)Math.PI / 180F), 0.8F, 0.0F, 0.9F, 0.54600006F, 0.02F, 0.02F, 3.0F, 3.0F, 0.5F, 0.0F, 3.0F, 3.0F, 0.96F, 0.02F, 1.0F, ((float)Math.PI / 180F), 0.0F, 0.0F, 1.0F, 1.0F, 0.91F, 0.91F, 0.0F, 4.0F, 1.0F, 1.0F, 0.4F, 0.0F, 0.21600002F, 0.0F, 0.0F, 0.0025000002F, 1.0F, 3.0F, (180F / (float)Math.PI), 90.0F, 95.0F, 265.0F, 180.0F, 0.0F, 0.0F, 0.3F, -180.0F, 360.0F, 180.0F, 360.0F, -180.0F, 360.0F, 180.0F, 360.0F, -180.0F, 360.0F, 180.0F, 360.0F, -180.0F, 360.0F, 180.0F, 360.0F, -180.0F, 360.0F, 180.0F, 360.0F, 0.0F, 0.3F, -90.0F, 90.0F, -75.0F, -75.0F, 75.0F, 75.0F, 2500.0F, 0.2F, -1.0F, 0.0F, 0.0F, 0.98F, 0.98F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.09F, 0.0F, 0.09F, 0.5F, 0.1F, 0.9F, 0.5F, 0.5F, 0.2F, 1.0F, ((float)Math.PI / 180F), ((float)Math.PI / 180F), ((float)Math.PI / 180F), ((float)Math.PI / 180F), 2.0F, 2.0F, 2.0F, 2.0F, 0.2F, 1.0F, 1.0F, 0.4F, 0.0F, 0.2F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public boolean id_return() {
      return ((Byte)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[3]) & true) > 0 ? true : false;
   }

   public void id_return(float var1) {
      this.id_private();
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      Float var6 = var1;
      this.id_private[60] = var6;
   }

   public void id_super(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_private[58] = var6;
   }

   public void id_super(boolean var1) {
      this.id_private();
      Boolean var6 = var1;
      this.id_private[41] = var6;
   }

   private void id_super() {
      this.id_private();
      boolean var1 = this.id_finally(7);
      if (var1 && !(Boolean)this.id_throws[20] && !this.Pm() && !this.id_break(rLD.id_goto)) {
         rdn_3 var2 = this.id_class(rXQ.CHEST);
         if (var2.id_break() == rdy_3.kc && rxH_2.id_protected(var2)) {
            var1 = true;
            if (!((rYB)this.id_throws[7]).id_continue && ((Integer)this.id_private[64] + 1) % 20 == 0) {
               var2.id_class(true, this, (var0) -> var0.id_break(rXQ.CHEST));
            }
         } else {
            var1 = false;
         }
      } else {
         var1 = false;
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_break(7, var1);
      }

   }

   public PX id_switch() {
      return this.rO();
   }

   public void id_throw() {
      this.id_private();
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_byte(true, false);
      }

      rdn_3 var5 = rdn_3.id_break;
      this.id_private[61] = var5;
      Integer var6 = (Integer)this.id_private[63];
      this.id_private[62] = var6;
      Integer var7 = Integer.valueOf(0);
      this.id_private[63] = var7;
      Integer var8 = Integer.valueOf(0);
      this.id_private[73] = var8;
   }

   public void id_try(an_3 var1) {
      this.id_private();
      if (var1 instanceof iB_2 var6) {
         this.id_private[56] = var6;
      } else {
         Object var7 = null;
         this.id_private[56] = var7;
      }

      Integer var8 = (Integer)this.id_throws[41];
      this.id_private[57] = var8;
   }

   public boolean id_try() {
      return !((rYB)this.id_throws[7]).id_continue ? true : false;
   }

   public boolean id_while() {
      return (Integer)this.id_throws[41] % 5 == 0 && this.rv().id_break != (double)0.0F && this.rv().id_protected != (double)0.0F && !this.id_native() && eA_2.id_finally(this) && this.Be() ? true : false;
   }

   public boolean id_while(an_3 var1) {
      rjU_2 var2 = new rjU_2(this.rx(), this.rH(), this.BO());
      rjU_2 var3 = new rjU_2(var1.rx(), var1.rH(), var1.BO());
      return ((rYB)this.id_throws[7]).id_class(new rjB_2(var2, var3, rjS_2.COLLIDER, rjs_3.NONE, this)).id_byte() == rjM_2.MISS ? true : false;
   }

   private static void id_static() {
      id_break = new boolean[]{true, true, true, false, false, false, false, false, true, false, true, true, false, false, false, true, true, true, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, true, false, false, false, true, false, true, false, false, true, false, true, false, false, true, false, true, false, false, false, false, true, false, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, false, false, false, false, false, false, false, true, true, false, false, true, false, false, false, true, true, true, false, true, false, false, true, true, false, false, false, true, false, true, false, true, false, true, false, true, true, false, true, false, false, true, false, true, false, true, true, true, true, false, true, false, true, false, true, false, true, false, true, false, false, true, false, false, false, true, false, true, false, false, false, true, true, false, true, false, false, true, false, false, true, true, true, true, true, true, false, false, true, false, true, true, false, false, true, false, true, false, true, true, false, true, false, true, false, true, false, true, true, true, false, false, true, false, false, true, false, false, false, false, false, true, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, true, true, false, true, true, false, true, false, true, false, true, true, true, false, false, false, false, true, false, false, false, false, true, false, false, true, false, false, false, true, true, false, true, true, true, false, true, true, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
   }

   public void id_public(float var1) {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[4], rfU_2.id_class(var1, 0.0F, this.SK()));
   }

   private static void id_public() {
      id_extends = new long[]{40L, 0L};
   }

   public boolean id_public(an_3 var1) {
      this.id_try(var1);
      return false;
   }

   private rdn_3 id_protected(rXQ var1) {
      this.id_private();
      return (rdn_3)((rqs_3)this.id_private[3]).get(var1.id_break());
   }

   public void id_protected(float var1) {
      float var2 = this.Ss();
      if (var2 > 0.0F) {
         this.id_public(var2 + var1);
      }

   }

   public boolean id_protected(rLR var1) {
      rLY var2 = this.id_class(var1);
      if (var2 != null) {
         this.id_class(var2);
         return true;
      } else {
         return false;
      }
   }

   public void id_protected(rLY var1) {
      this.id_private();
      Boolean var6 = true;
      this.id_private[53] = var6;
      if (!((rYB)this.id_throws[7]).id_continue) {
         var1.id_class().id_break(this, this.BT(), var1.id_byte());
      }

      rrLC.id_break(this, var1);
   }

   public void id_protected(iB_2 var1) {
      var1.id_throws(this);
   }

   public float id_protected(rye_3 var1, float var2) {
      if (!var1.id_case()) {
         this.id_byte(var1, var2);
         var2 = ryg_3.id_class(var2, (float)this.Bq(), (float)this.id_class(iQ_2.id_finally));
      }

      return var2;
   }

   public void id_protected(rye_3 var1) {
      this.id_private();
      an_3 var2 = var1.id_extends();
      int var3;
      if (var2 instanceof rhd_3) {
         var3 = eA_2.id_catch((iB_2)var2);
      } else {
         var3 = false;
      }

      boolean var4 = (Integer)this.id_private[31] > 0 ? true : false;
      if (this.SX() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws)) {
         this.id_class(var1, var4);
         this.id_class(var1, var3, var4);
      }

      this.Sx();
      this.Sf();
   }

   public rdn_3 id_protected(rpm_3 var1) {
      if (var1 == rpm_3.MAIN_HAND) {
         return this.id_class(rXQ.MAINHAND);
      } else if (var1 == rpm_3.OFF_HAND) {
         return this.id_class(rXQ.OFFHAND);
      } else {
         throw new IllegalArgumentException("Invalid hand " + var1);
      }
   }

   public rqA_2 id_protected(rdn_3 var1) {
      return var1.id_void();
   }

   private void id_private() {
      if (this.id_private == null) {
         this.id_private = new Object[80];
         Object[] var1 = this.id_private;
         var1[5] = false;
         var1[7] = Integer.valueOf(0);
         var1[8] = Integer.valueOf(0);
         var1[9] = Integer.valueOf(0);
         var1[10] = Integer.valueOf(0);
         var1[11] = Integer.valueOf(0);
         var1[12] = 0.0F;
         var1[13] = Integer.valueOf(0);
         var1[14] = 0.0F;
         var1[15] = 0.0F;
         var1[16] = Integer.valueOf(0);
         var1[17] = 0.0F;
         var1[18] = 0.0F;
         var1[19] = 0.0F;
         var1[20] = 20;
         var1[21] = 0.0F;
         var1[22] = 0.0F;
         var1[23] = 0.0F;
         var1[24] = 0.0F;
         var1[25] = 0.0F;
         var1[26] = 0.0F;
         var1[27] = 0.0F;
         var1[28] = 0.0F;
         var1[29] = 0.0F;
         var1[31] = Integer.valueOf(0);
         var1[32] = false;
         var1[33] = Integer.valueOf(0);
         var1[34] = 0.0F;
         var1[35] = 0.0F;
         var1[36] = 0.0F;
         var1[37] = 0.0F;
         var1[38] = 0.0F;
         var1[39] = Integer.valueOf(0);
         var1[40] = 0.0F;
         var1[41] = false;
         var1[42] = 0.0F;
         var1[43] = 0.0F;
         var1[44] = 0.0F;
         var1[45] = Integer.valueOf(0);
         var1[46] = (double)0.0F;
         var1[47] = (double)0.0F;
         var1[48] = (double)0.0F;
         var1[49] = (double)0.0F;
         var1[50] = (double)0.0F;
         var1[51] = (double)0.0F;
         var1[52] = Integer.valueOf(0);
         var1[53] = false;
         var1[55] = Integer.valueOf(0);
         var1[57] = Integer.valueOf(0);
         var1[58] = 0.0F;
         var1[59] = Integer.valueOf(0);
         var1[60] = 0.0F;
         var1[62] = Integer.valueOf(0);
         var1[63] = Integer.valueOf(0);
         var1[64] = Integer.valueOf(0);
         var1[68] = 0L;
         var1[69] = Integer.valueOf(0);
         var1[70] = 0.0F;
         var1[71] = 0.0F;
         var1[73] = Integer.valueOf(0);
         var1[74] = Integer.valueOf(0);
         var1[75] = false;
         var1[76] = Integer.valueOf(0);
         var1[77] = Integer.valueOf(0);
         var1[78] = Integer.valueOf(0);
         var1[79] = Integer.valueOf(0);
      }

   }

   public void id_private(rjU_2 var1) {
      if (this.id_try() || this.Po()) {
         double var2 = 0.08;
         boolean var4 = this.rv().id_byte <= (double)0.0F ? true : false;
         if (var4 && this.id_break(rLD.id_instanceof)) {
            var2 = 0.01;
            Float var25 = 0.0F;
            this.id_throws[31] = var25;
         }

         rXE var5 = ((rYB)this.id_throws[7]).id_break(this.Bs());
         if (this.rT() && this.sr() && !this.id_class(var5.id_class())) {
            double var31 = this.re();
            int var36 = eA_2.id_throws(this);
            float var38 = 0.9F;
            float var39 = 0.54600006F;
            float var40 = 0.02F;
            if (this == (cb_3)QY.id_instanceof().id_class[57]) {
               rrLd_1 var41 = (rrLd_1)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLd_1.id_class(0.02F, var36));
               var40 = var41.id_break();
               var36 = var41.id_class();
            }

            float var42 = this.PF() ? var38 : this.Bf();
            float var43 = var40;
            float var14 = (float)var36;
            if (var14 > 3.0F) {
               var14 = 3.0F;
            }

            if (!(Boolean)this.id_throws[20]) {
               var14 *= 0.5F;
            }

            if (var14 > 0.0F) {
               var42 += (var39 - var42) * var14 / 3.0F;
               var43 = var40 + (this.sB() - var40) * var14 / 3.0F;
            }

            if (this.id_break(rLD.id_interface)) {
               var42 = 0.96F;
            }

            this.id_class(var43, var1);
            this.id_class((iG_2)iG_2.SELF, (rjU_2)this.rv());
            rjU_2 var45 = this.rv();
            if ((Boolean)this.id_throws[23] && this.o_()) {
               var45 = new rjU_2(var45.id_break, 0.2, var45.id_protected);
            }

            this.id_byte((rjU_2)var45.id_throws((double)var42, (double)0.8F, (double)var42));
            rjU_2 var48 = this.id_class(var2, var4, this.rv());
            this.id_byte((rjU_2)var48);
            if ((Boolean)this.id_throws[23] && this.id_finally(var48.id_break, var48.id_byte + (double)0.6F - this.re() + var31, var48.id_protected)) {
               this.id_catch(var48.id_break, (double)0.3F, var48.id_protected);
            }
         } else if (this.ry() && this.sr() && !this.id_class(var5.id_class())) {
            double var30 = this.re();
            this.id_class(0.02F, var1);
            this.id_class((iG_2)iG_2.SELF, (rjU_2)this.rv());
            if (this.id_break((rlb_3)rlG_2.id_byte) <= this.rI()) {
               this.id_byte((rjU_2)this.rv().id_throws((double)0.5F, (double)0.8F, (double)0.5F));
               rjU_2 var34 = this.id_class(var2, var4, this.rv());
               this.id_byte((rjU_2)var34);
            } else {
               this.id_byte((rjU_2)this.rv().id_class((double)0.5F));
            }

            if (!this.rw()) {
               this.id_byte((rjU_2)this.rv().id_break((double)0.0F, -var2 / (double)4.0F, (double)0.0F));
            }

            rjU_2 var35 = this.rv();
            if ((Boolean)this.id_throws[23] && this.id_finally(var35.id_break, var35.id_byte + (double)0.6F - this.re() + var30, var35.id_protected)) {
               this.id_catch(var35.id_break, (double)0.3F, var35.id_protected);
            }
         } else if (this.Sy()) {
            rjU_2 var6 = this.rv();
            if (var6.id_byte > (double)-0.5F) {
               Float var26 = 1.0F;
               this.id_throws[31] = var26;
            }

            rjU_2 var7 = this.m();
            float var8 = this.Bo() * ((float)Math.PI / 180F);
            double var9 = Math.sqrt(var7.id_break * var7.id_break + var7.id_protected * var7.id_protected);
            double var11 = Math.sqrt(id_case((rjU_2)var6));
            double var13 = var7.id_case();
            float var15 = rfU_2.id_break(var8);
            var15 = (float)((double)var15 * (double)var15 * Math.min((double)1.0F, var13 / 0.4));
            var6 = this.rv().id_break((double)0.0F, var2 * ((double)-1.0F + (double)var15 * (double)0.75F), (double)0.0F);
            if (var6.id_byte < (double)0.0F && var9 > (double)0.0F) {
               double var16 = var6.id_byte * -0.1 * (double)var15;
               var6 = var6.id_break(var7.id_break * var16 / var9, var16, var7.id_protected * var16 / var9);
            }

            if (var8 < 0.0F && var9 > (double)0.0F) {
               double var46 = var11 * (double)(-rfU_2.id_class(var8)) * 0.04;
               var6 = var6.id_break(-var7.id_break * var46 / var9, var46 * 3.2, -var7.id_protected * var46 / var9);
            }

            if (var9 > (double)0.0F) {
               var6 = var6.id_break((var7.id_break / var9 * var11 - var6.id_break) * 0.1, (double)0.0F, (var7.id_protected / var9 * var11 - var6.id_protected) * 0.1);
            }

            this.id_byte((rjU_2)var6.id_throws((double)0.99F, (double)0.98F, (double)0.99F));
            this.id_class((iG_2)iG_2.SELF, (rjU_2)this.rv());
            if ((Boolean)this.id_throws[23] && !((rYB)this.id_throws[7]).id_continue) {
               double var47 = Math.sqrt(id_case((rjU_2)this.rv()));
               double var18 = var11 - var47;
               float var20 = (float)(var18 * (double)10.0F - (double)3.0F);
               if (var20 > 0.0F) {
                  this.id_class(this.id_byte((int)var20), 1.0F, 1.0F);
                  this.id_break(rye_3.id_native, var20);
               }
            }

            if ((Boolean)this.id_throws[20] && !((rYB)this.id_throws[7]).id_continue) {
               this.id_break(7, false);
            }
         } else {
            rfH_2 var29 = this.PI();
            float var32 = ((rYB)this.id_throws[7]).id_byte(var29).id_break().id_final();
            float var33 = (Boolean)this.id_throws[20] ? var32 * 0.91F : 0.91F;
            rjU_2 var37 = this.id_break(var1, var32);
            double var10 = var37.id_byte;
            if (this.id_break(rLD.id_goto)) {
               double var12 = 0.05;
               if (this instanceof cb_3) {
                  var12 = ((rrAs_1)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAs_1.id_class(this.id_byte(rLD.id_goto), var12))).id_break();
               }

               var10 += (var12 * (double)(this.id_byte(rLD.id_goto).id_byte() + 1) - var37.id_byte) * 0.2;
               Float var27 = 0.0F;
               this.id_throws[31] = var27;
            } else if (((rYB)this.id_throws[7]).id_continue && !((rYB)this.id_throws[7]).id_int(var29)) {
               if (this.re() > (double)0.0F) {
                  var10 = -0.1;
               } else {
                  var10 = (double)0.0F;
               }
            } else if (!this.rw()) {
               var10 -= var2;
            }

            this.id_catch(var37.id_break * (double)var33, var10 * (double)0.98F, var37.id_protected * (double)var33);
         }
      }

      this.id_class(this, this instanceof rMm_1);
   }

   private void id_final() {
      this.id_private();
      if (this.id_return()) {
         rpm_3 var1 = this.P();
         rdn_3 var2 = this.id_protected(var1);
         if (!((rdn_3)this.id_private[61]).id_class() && !rdn_3.id_protected(var2, (rdn_3)this.id_private[61])) {
            this.id_throw();
         } else {
            if (((rdn_3)this.id_private[61]).id_class()) {
               Integer var7 = (Integer)this.id_private[63];
               this.id_private[62] = var7;
               Integer var8 = var2.id_extends();
               this.id_private[63] = var8;
            }

            this.id_private[61] = var2;
            ((rdn_3)this.id_private[61]).id_break((rYB)this.id_throws[7], this, this.SH());
            if (this.id_char()) {
               this.id_class((rdn_3)((rdn_3)this.id_private[61]), 5);
            }

            Integer var10 = (Integer)this.id_private[63];
            this.id_private[62] = var10;
            int var10002 = (Integer)this.id_private[63] - 1;
            Integer var11 = var10002;
            this.id_private[63] = var11;
            if (var10002 == 0 && !((rYB)this.id_throws[7]).id_continue && !((rdn_3)this.id_private[61]).id_volatile()) {
               this.sP();
            }
         }
      }

   }

   public int id_final(int var1) {
      int var2 = eA_2.id_protected(this);
      return var2 > 0 && ((Random)this.id_throws[40]).nextInt(var2 + 1) > 0 ? var1 : var1 - 1;
   }

   public boolean id_transient() {
      return this.h();
   }

   public void id_volatile(int var1) {
      this.id_private();
      Integer var6 = var1;
      this.id_private[69] = var6;
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_byte(4, true);
      }

   }

   public float id_synchronized(float var1) {
      this.id_private();
      return rfU_2.id_catch(var1, (Float)this.id_private[71], (Float)this.id_private[70]);
   }

   public void id_native(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_private[23] = var6;
   }

   public void id_native(int var1) {
      this.id_private();
      Integer var6 = var1;
      this.id_private[33] = var6;
   }

   public boolean sr() {
      return true;
   }

   public void A() {
      this.id_private();
      super.A();
      Float var5 = (Float)this.id_private[35];
      this.id_private[34] = var5;
      Float var6 = 0.0F;
      this.id_private[35] = var6;
      Float var7 = 0.0F;
      this.id_throws[31] = var7;
   }

   public int SH() {
      this.id_private();
      return (Integer)this.id_private[63];
   }

   public void Q() {
   }

   public float rq() {
      return this.Be() && eA_2.id_class(eY_2.id_native, this) > 0 ? 1.0F : super.rq();
   }

   public boolean SG() {
      return false;
   }

   public void Pn() {
      this.id_private();
      Float var15 = (Float)this.id_private[15];
      this.id_private[14] = var15;
      if ((Boolean)this.id_throws[48]) {
         this.Bg().ifPresent(this::id_class);
      }

      if (this.id_while()) {
         this.Sv();
      }

      super.Pn();
      boolean var1 = this instanceof rhd_3;
      if (this.BM()) {
         if (this.Bz()) {
            this.id_break(rye_3.id_case, 1.0F);
         } else if (var1 && !((rYB)this.id_throws[7]).id_instanceof().id_class(this.rN())) {
            double var2 = ((rYB)this.id_throws[7]).id_instanceof().id_class(this) + ((rYB)this.id_throws[7]).id_instanceof().id_final();
            if (var2 < (double)0.0F) {
               double var4 = ((rYB)this.id_throws[7]).id_instanceof().id_package();
               if (var4 > (double)0.0F) {
                  this.id_break(rye_3.id_case, (float)Math.max(true, rfU_2.id_byte(-var2 * var4)));
               }
            }
         }
      }

      if (this.q() || ((rYB)this.id_throws[7]).id_continue) {
         this.rE();
      }

      boolean var28 = var1 && ((rhx_3)((rhd_3)this).id_implements[18]).id_class ? true : false;
      if (this.BM()) {
         if (this.id_class(rlG_2.id_break) && !((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.rH(), this.BO())).id_class(xu_3.hM)) {
            if (!this.SO() && !rLK.id_byte(this) && !var28) {
               this.id_throws(this.id_final(this.PA()));
               if (this.PA() == -20) {
                  this.id_throws(false);
                  rjU_2 var3 = this.rv();

                  for(int var30 = false; var30 < 8; ++var30) {
                     double var5 = ((Random)this.id_throws[40]).nextDouble() - ((Random)this.id_throws[40]).nextDouble();
                     double var7 = ((Random)this.id_throws[40]).nextDouble() - ((Random)this.id_throws[40]).nextDouble();
                     double var9 = ((Random)this.id_throws[40]).nextDouble() - ((Random)this.id_throws[40]).nextDouble();
                     ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, this.rx() + var5, this.re() + var7, this.BO() + var9, var3.id_break, var3.id_byte, var3.id_protected);
                  }

                  this.id_break(rye_3.id_private, 2.0F);
               }
            }

            if (!((rYB)this.id_throws[7]).id_continue && this.Pm() && this.ra() != null && !this.ra().PH()) {
               this.BH();
            }
         } else if (this.PA() < this.ri()) {
            this.id_throws(this.id_new(this.PA()));
         }

         if (!((rYB)this.id_throws[7]).id_continue) {
            rfH_2 var29 = this.Bs();
            if (!com.google.common.base.Objects.equal((rfH_2)this.id_private[65], var29)) {
               this.id_private[65] = var29;
               this.id_throws(var29);
            }
         }
      }

      if (this.BM() && this.Pk()) {
         this.rE();
      }

      if ((Integer)this.id_private[10] > 0) {
         Integer var17 = (Integer)this.id_private[10] - 1;
         this.id_private[10] = var17;
      }

      if ((Integer)this.id_throws[47] > 0 && !(this instanceof rhN_2)) {
         Integer var18 = (Integer)this.id_throws[47] - 1;
         this.id_throws[47] = var18;
      }

      if (this.Sl()) {
         this.St();
      }

      if ((Integer)this.id_private[31] > 0) {
         Integer var19 = (Integer)this.id_private[31] - 1;
         this.id_private[31] = var19;
      } else {
         Object var20 = null;
         this.id_private[30] = var20;
      }

      if ((iB_2)this.id_private[56] != null && !((iB_2)this.id_private[56]).BM()) {
         Object var21 = null;
         this.id_private[56] = var21;
      }

      if ((iB_2)this.id_private[54] != null) {
         if (!((iB_2)this.id_private[54]).BM()) {
            this.id_break((iB_2)null);
         } else if ((Integer)this.id_throws[41] - (Integer)this.id_private[55] > 100) {
            this.id_break((iB_2)null);
         }
      }

      this.Sk();
      Float var22 = (Float)this.id_private[36];
      this.id_private[37] = var22;
      Float var23 = (Float)this.id_private[23];
      this.id_private[24] = var23;
      Float var24 = (Float)this.id_private[25];
      this.id_private[27] = var24;
      Float var25 = (Float)this.id_throws[15];
      this.id_throws[17] = var25;
      Float var26 = (Float)this.id_throws[16];
      this.id_throws[18] = var26;
      Float var27 = (Float)this.id_private[26];
      this.id_private[28] = var27;
   }

   public boolean PH() {
      return false;
   }

   public boolean rJ() {
      return this.D();
   }

   public boolean rG() {
      return this.BM() && !this.id_native() && !this.o_() ? true : false;
   }

   public rfl_3 PE() {
      return this.id_class(rXQ.HEAD).id_break() == rdy_3.dk ? this.rN().id_byte((double)0.5F, (double)0.5F, (double)0.5F) : super.PE();
   }

   public boolean rP() {
      return !super.rP() && (this.Sy() || this.Pb() != iM_2.FALL_FLYING) ? false : true;
   }

   public void rF() {
      this.id_private();
      Integer var5 = 10;
      this.id_private[11] = var5;
      Integer var6 = (Integer)this.id_private[11];
      this.id_private[10] = var6;
      Float var7 = 0.0F;
      this.id_private[12] = var7;
   }

   public boolean rY() {
      return !(Boolean)this.id_throws[27] ? true : false;
   }

   public void PQ() {
      this.id_break(rye_3.id_volatile, 4.0F);
   }

   public boolean Pu() {
      this.id_private();
      return !(Boolean)this.id_throws[27] && (Integer)this.id_private[13] == 0 ? true : false;
   }

   public int Bj() {
      this.id_private();
      return (Integer)this.id_private[77];
   }

   public abstract Iterable<rdn_3> PV();

   public boolean BR() {
      return this.sG() == aL_2.id_break ? true : false;
   }

   public ImmutableList<iM_2> BV() {
      return ImmutableList.of(iM_2.STANDING);
   }

   public int BY() {
      return (Integer)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[7]);
   }

   public boolean BK() {
      return this.Sl();
   }

   public rpr_3 Bi() {
      rfH_2 var1 = (rfH_2)this.Bg().orElse((Object)null);
      return var1 != null ? xb_3.id_class((rYB)this.id_throws[7], var1) : null;
   }

   public iB_2 Sr() {
      this.id_private();
      return (iB_2)this.id_private[54];
   }

   public float Bp() {
      Iterable var1 = this.PV();
      int var2 = false;
      int var3 = false;

      for(rdn_3 var5 : var1) {
         if (!var5.id_class()) {
            ++var3;
         }

         ++var2;
      }

      return var2 > 0 ? (float)var3 / (float)var2 : 0.0F;
   }

   public void Bw() {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[6], false);
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[5], Integer.valueOf(0));
   }

   public boolean BM() {
      return !(Boolean)this.id_throws[27] && this.Ss() > 0.0F ? true : false;
   }

   public Optional<rfH_2> Bg() {
      return (Optional)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[9]);
   }

   public boolean Be() {
      return ((rYB)this.id_throws[7]).id_byte(this.PI()).id_class(rls_3.Z);
   }

   public void Ba() {
      if (!this.Pl().id_catch()) {
         int var1 = eA_2.id_class(eY_2.id_native, this);
         if (var1 > 0 && this.Be()) {
            ic_3 var2 = this.id_byte(iQ_2.id_protected);
            if (var2 == null) {
               return;
            }

            var2.id_break(new ix_3((UUID)id_catch[1], id_class[1], (double)(0.03F * (1.0F + (float)var1 * 0.35F)), id_3.ADDITION));
            if (this.Sa().nextFloat() < 0.04F) {
               rdn_3 var3 = this.id_class(rXQ.FEET);
               var3.id_class(true, this, (var0) -> var0.id_break(rXQ.FEET));
            }
         }
      }

   }

   public Optional<rfH_2> SP() {
      this.id_private();
      return (Optional)this.id_private[66];
   }

   public float Ss() {
      return (Float)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[4]);
   }

   public void BH() {
      an_3 var1 = this.ra();
      super.BH();
      if (var1 != null && var1 != this.ra() && !((rYB)this.id_throws[7]).id_continue) {
         this.id_class(var1);
      }

   }

   public rqA_2 Bt() {
      return rqn_3.Sj;
   }

   public int BI() {
      this.id_private();
      return (Integer)this.id_private[33];
   }

   public float Bf() {
      return 0.8F;
   }

   public boolean BU() {
      return false;
   }

   public boolean Bz() {
      return !this.Sc() && super.Bz() ? true : false;
   }

   public float Bo() {
      QY var1 = QY.id_instanceof();
      if (this == (cb_3)var1.id_class[57]) {
         t_1 var2 = (t_1)((cb_3)var1.id_class[57]).id_break[51];
         if (var2 != null) {
            return var2.id_class().id_protected();
         }
      }

      return (Float)this.id_throws[16];
   }

   public rqO_2 By() {
      return this.BC().id_finally();
   }

   public ik_3 BT() {
      this.id_private();
      return (ik_3)this.id_private[0];
   }

   public int Bq() {
      return rfU_2.id_byte(this.id_class(iQ_2.id_implements));
   }

   public void SB() {
      ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[9], Optional.empty());
   }

   public void SS() {
      List var1 = ((rYB)this.id_throws[7]).id_break(this, this.rN(), rpJ_2.id_class(this));
      if (!var1.isEmpty()) {
         int var2 = ((rYB)this.id_throws[7]).B().id_byte(rRu_1.id_super);
         if (var2 > 0 && var1.size() > var2 - 1 && ((Random)this.id_throws[40]).nextInt(4) == 0) {
            int var3 = false;

            for(int var4 = false; var4 < var1.size(); ++var4) {
               if (!((an_3)var1.get(var4)).Pm()) {
                  ++var3;
               }
            }

            if (var3 > var2 - 1) {
               this.id_break(rye_3.id_catch, 6.0F);
            }
         }

         for(int var5 = false; var5 < var1.size(); ++var5) {
            an_3 var6 = (an_3)var1.get(var5);
            this.id_instanceof(var6);
         }
      }

   }

   public void Sf() {
      this.id_private();
      if (!((rYB)this.id_throws[7]).id_continue && (this.SG() || (Integer)this.id_private[31] > 0 && this.Sp() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws))) {
         int var1 = this.id_byte((rhd_3)this.id_private[30]);

         while(var1 > 0) {
            int var2 = rsP_2.id_class(var1);
            var1 -= var2;
            ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), var2));
         }
      }

   }

   public boolean Sy() {
      return this.id_finally(7);
   }

   public void Sj() {
   }

   public float sB() {
      this.id_private();
      return (Float)this.id_private[58];
   }

   public void sE() {
      this.id_private();
      Boolean var5 = true;
      this.id_private[53] = var5;
   }

   public rdn_3 sX() {
      this.id_private();
      return (rdn_3)this.id_private[61];
   }

   public boolean Sp() {
      return !this.n_() ? true : false;
   }

   public float SN() {
      return this.n_() ? (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.5F : (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F;
   }

   public float sO() {
      QY var1 = QY.id_instanceof();
      if (this == (cb_3)var1.id_class[57]) {
         t_1 var2 = (t_1)((cb_3)var1.id_class[57]).id_break[51];
         if (var2 != null) {
            return var2.id_class().id_throws();
         }
      }

      return (Float)this.id_throws[15];
   }

   public void SC() {
      this.id_private();
      if (!((rdn_3)this.id_private[61]).id_class()) {
         ((rdn_3)this.id_private[61]).id_class((rYB)this.id_throws[7], this, this.SH());
         if (((rdn_3)this.id_private[61]).id_volatile()) {
            this.id_final();
         }
      }

      this.id_throw();
   }

   public float ST() {
      return 0.42F * this.rl();
   }

   public Random Sa() {
      return (Random)this.id_throws[40];
   }

   public void sM() {
      if (!this.BF()) {
         int var1 = rfU_2.id_byte(this.rx());
         int var2 = rfU_2.id_byte(this.re() - (double)0.2F);
         int var3 = rfU_2.id_byte(this.BO());
         xc_3 var4 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(var1, var2, var3));
         if (!var4.id_catch()) {
            zr_3 var5 = var4.id_package();
            this.id_class(var5.id_catch(), var5.id_class() * 0.5F, var5.id_break() * 0.75F);
         }
      }

   }

   public boolean SL() {
      return true;
   }

   public iZ_2<?> SF() {
      this.id_private();
      return (iZ_2)this.id_private[72];
   }

   public aL_2 sG() {
      return aL_2.id_class;
   }

   public float SR() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public iB_2 Sh() {
      this.id_private();
      if (((ryR_2)this.id_private[1]).id_byte() != null) {
         return ((ryR_2)this.id_private[1]).id_byte();
      } else if ((rhd_3)this.id_private[30] != null) {
         return (rhd_3)this.id_private[30];
      } else {
         return (iB_2)this.id_private[54] != null ? (iB_2)this.id_private[54] : null;
      }
   }

   public int SE() {
      this.id_private();
      return (Integer)this.id_private[57];
   }

   public boolean SX() {
      return !this.n_() ? true : false;
   }

   public void Sx() {
   }

   public rye_3 SJ() {
      this.id_private();
      if (((rYB)this.id_throws[7]).r() - (Long)this.id_private[68] > 40L) {
         Object var5 = null;
         this.id_private[67] = var5;
      }

      return (rye_3)this.id_private[67];
   }

   public void St() {
      this.id_private();
      Integer var12 = (Integer)this.id_private[13] + 1;
      this.id_private[13] = var12;
      if ((Integer)this.id_private[13] == 20) {
         this.PD();

         for(int var1 = false; var1 < 20; ++var1) {
            double var2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var4 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var6 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_boolean, this.id_break((double)1.0F), this.Ph(), this.id_protected((double)1.0F), var2, var4, var6);
         }
      }

   }

   public abstract rpZ_2 Su();

   public void SI() {
      ic_3 var1 = this.id_byte(iQ_2.id_protected);
      if (var1 != null && var1.id_class((UUID)id_catch[1]) != null) {
         var1.id_break((UUID)id_catch[1]);
      }

   }

   public float SK() {
      return (float)this.id_class(iQ_2.id_class);
   }

   public rdn_3 Sn() {
      return this.id_class(rXQ.OFFHAND);
   }

   public boolean Sz() {
      return ((Byte)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[3]) & 4) != 0 ? true : false;
   }

   public int SU() {
      this.id_private();
      return this.id_return() ? ((rdn_3)this.id_private[61]).id_extends() - this.SH() : false;
   }

   public ryR_2 SW() {
      this.id_private();
      return (ryR_2)this.id_private[1];
   }

   public int SM() {
      return (Integer)((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[8]);
   }

   public int Sw() {
      this.id_private();
      return (Integer)this.id_private[73];
   }

   public boolean Sq() {
      return true;
   }

   public boolean SY() {
      this.id_private();
      if (((rYB)this.id_throws[7]).id_continue) {
         return false;
      } else {
         Iterator var1 = ((Map)this.id_private[2]).values().iterator();

         boolean var2;
         for(var2 = false; var1.hasNext(); var2 = true) {
            this.id_class((rLY)var1.next());
            var1.remove();
         }

         return var2;
      }
   }

   public void SA() {
      this.id_private();
      if (((Map)this.id_private[2]).isEmpty()) {
         this.Bw();
         this.id_package(false);
      } else {
         Collection var1 = ((Map)this.id_private[2]).values();
         ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[6], id_class(var1));
         ((rmE_2)this.id_throws[49]).id_break((rut_3)id_catch[5], rAB.id_class(var1));
         this.id_package(this.id_break(rLD.id_final));
      }

   }

   public float Sd() {
      this.id_private();
      return (Float)this.id_private[60];
   }

   public iB_2 SZ() {
      this.id_private();
      return (iB_2)this.id_private[56];
   }

   public void Sg() {
      this.id_private();
      float var1 = this.id_interface();
      if ((Boolean)this.id_private[5]) {
         Integer var6 = (Integer)this.id_private[7] + 1;
         this.id_private[7] = var6;
         if ((float)(Integer)this.id_private[7] >= var1) {
            Integer var7 = Integer.valueOf(0);
            this.id_private[7] = var7;
            Boolean var8 = false;
            this.id_private[5] = var8;
         }
      } else {
         Integer var9 = Integer.valueOf(0);
         this.id_private[7] = var9;
      }

      Float var10 = (float)(Integer)this.id_private[7] / var1;
      this.id_private[15] = var10;
   }

   public static iz_3 SD() {
      return iW_2.id_class().id_class(iQ_2.id_class).id_class(iQ_2.id_byte).id_class(iQ_2.id_protected).id_class(iQ_2.id_implements).id_class(iQ_2.id_finally);
   }

   public int Se() {
      this.id_private();
      return (Integer)this.id_private[76];
   }

   public boolean SO() {
      return this.sG() == aL_2.id_break ? true : false;
   }

   public void SQ() {
      Optional var10000 = this.Bg();
      rYB var10001 = (rYB)this.id_throws[7];
      Objects.requireNonNull(var10001);
      var10000.filter(var10001::id_int).ifPresent((var1x) -> {
         xc_3 var2 = ((rYB)this.id_throws[7]).id_byte(var1x);
         if (var2.id_break() instanceof xb_3) {
            ((rYB)this.id_throws[7]).id_class(var1x, (xc_3)var2.id_class(xb_3.id_final, false), 3);
            rjU_2 var3 = (rjU_2)xb_3.id_class(this.BC(), (rYB)this.id_throws[7], var1x, (Float)this.id_throws[15]).orElseGet(() -> {
               rfH_2 var1xx = var1x.id_final();
               return new rjU_2((double)var1xx.b_() + (double)0.5F, (double)var1xx.c_() + 0.1, (double)var1xx.d_() + (double)0.5F);
            });
            rjU_2 var4 = rjU_2.id_protected((rja_3)var1x).id_protected(var3).id_protected();
            float var5 = (float)rfU_2.id_case(rfU_2.id_protected(var4.id_protected, var4.id_break) * (double)(180F / (float)Math.PI) - (double)90.0F);
            this.id_new(var3.id_break, var3.id_byte, var3.id_protected);
            Float var10 = var5;
            this.id_throws[15] = var10;
            Float var11 = 0.0F;
            this.id_throws[16] = var11;
         }

      });
      rjU_2 var1 = this.Ps();
      this.id_class(iM_2.STANDING);
      this.id_new(var1.id_break, var1.id_byte, var1.id_protected);
      this.SB();
   }

   public iF_2<?> SV() {
      return iZ_2.id_class(ImmutableList.of(), ImmutableList.of());
   }

   public xc_3 sS() {
      return ((rYB)this.id_throws[7]).id_byte(this.Bs());
   }

   public float Si() {
      return 1.0F;
   }

   public void sP() {
      this.id_private();
      rpm_3 var1 = this.P();
      if (!((rdn_3)this.id_private[61]).equals(this.id_protected(var1))) {
         this.SC();
      } else if (!((rdn_3)this.id_private[61]).id_class() && this.id_return()) {
         this.id_class((rdn_3)((rdn_3)this.id_private[61]), 16);
         rdn_3 var2 = ((rdn_3)this.id_private[61]).id_class((rYB)this.id_throws[7], this);
         if (var2 != (rdn_3)this.id_private[61]) {
            this.id_class(var1, var2);
         }

         this.id_throw();
      }

   }

   public int Sb() {
      this.id_private();
      return (Integer)this.id_private[55];
   }

   public boolean Sl() {
      return this.Ss() <= 0.0F ? true : false;
   }

   public void Sv() {
      rjU_2 var1 = this.rv();
      ((rYB)this.id_throws[7]).id_class(rLQ.id_throw, this.rx() + (((Random)this.id_throws[40]).nextDouble() - (double)0.5F) * (double)this.PN(), this.re() + 0.1, this.BO() + (((Random)this.id_throws[40]).nextDouble() - (double)0.5F) * (double)this.PN(), var1.id_break * -0.2, 0.1, var1.id_protected * -0.2);
      float var2 = ((Random)this.id_throws[40]).nextFloat() * 0.4F + ((Random)this.id_throws[40]).nextFloat() > 0.9F ? 0.6F : 0.0F;
      this.id_class(rqn_3.xE, var2, 0.6F + ((Random)this.id_throws[40]).nextFloat() * 0.4F);
   }

   public ap_3 a_(iM_2 var1) {
      return var1 == iM_2.SLEEPING ? (ap_3)id_catch[10] : super.a_(var1).id_class(this.SR());
   }

   public void m_() {
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[3], Byte.valueOf(0));
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[5], Integer.valueOf(0));
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[6], false);
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[7], Integer.valueOf(0));
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[8], Integer.valueOf(0));
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[4], 1.0F);
      ((rmE_2)this.id_throws[49]).id_class((rut_3)id_catch[9], Optional.empty());
   }

   public ruS_2<?> p_() {
      return new rFh_1(this);
   }

   public boolean n_() {
      return false;
   }

   public float u_() {
      return this.Ss();
   }

   public boolean o_() {
      this.id_private();
      if (this.id_native()) {
         return false;
      } else {
         rfH_2 var1 = this.Bs();
         xc_3 var2 = this.sS();
         xd_3 var3 = var2.id_break();
         if (var3.id_class(rls_3.F)) {
            Optional var8 = Optional.of(var1);
            this.id_private[66] = var8;
            return true;
         } else if (var3 instanceof zv_3 && this.id_byte(var1, var2)) {
            Optional var9 = Optional.of(var1);
            this.id_private[66] = var9;
            return true;
         } else {
            return false;
         }
      }
   }

   public void c_(boolean var1) {
      super.c_(var1);
      ic_3 var2 = this.id_byte(iQ_2.id_protected);
      if (var2.id_class((UUID)id_catch[0]) != null) {
         var2.id_protected((ix_3)id_catch[2]);
      }

      if (var1) {
         var2.id_break((ix_3)id_catch[2]);
      }

   }
}
