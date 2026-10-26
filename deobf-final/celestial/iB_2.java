package celestial;

import com.google.common.base.Objects;
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
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public abstract class iB_2 extends an_3 {
   public static Object[] catch_;
   public Object[] private_;
   private static String[] class_;
   private static boolean[] break_;
   private static double[] protected_;
   private static float[] implements_;
   private static byte[] finally_;
   private static long[] extends_;
   private static short[] native_;

   private boolean char_() {
      this.private_();
      int var1 = this.SH();
      rxK_2 var2 = ((rdn_3)this.private_[61]).break_().this_();
      boolean var3 = var2 != null && var2.throws_() ? true : break_[214];
      var3 |= var1 <= ((rdn_3)this.private_[61]).extends_() - 7 ? true : break_[216];
      return var3 && var1 % 4 == 0 ? true : break_[218];
   }

   public boolean byte_(rXQ var1) {
      return !this.class_(var1).class_() ? true : break_[140];
   }

   public rqA_2 byte_(rdn_3 var1) {
      return var1.float_();
   }

   public void byte_(rlb_3<rXs_1> var1) {
      this.byte_(this.rv().break_(0.0, 0.04F, 0.0));
   }

   public int byte_(rhd_3 var1) {
      return 0;
   }

   public void byte_(rpm_3 var1) {
      this.break_(var1 == rpm_3.MAIN_HAND ? rXQ.MAINHAND : rXQ.OFFHAND);
   }

   public void byte_(rLY var1) {
      this.private_();
      if (this.throws_(var1)) {
         rLY var2 = ((Map)this.private_[2]).put(var1.class_(), var1);
         if (var2 == null) {
            this.protected_(var1);
         } else {
            this.class_(var1, true);
         }
      }
   }

   public rLY byte_(rLR var1) {
      this.private_();
      return (rLY)((Map)this.private_[2]).get(var1);
   }

   private float byte_(float var1) {
      this.private_();
      return this.throws_[20] ? this.sB() * (0.21600002F / (var1 * var1 * var1)) : (Float)this.private_[29];
   }

   public rqA_2 byte_(rye_3 var1) {
      return rqn_3.So;
   }

   private void byte_(rXQ var1, rdn_3 var2) {
      this.private_();
      ((rqs_3)this.private_[4]).set(var1.break_(), var2);
   }

   public rqA_2 byte_(int var1) {
      return var1 > 4 ? rqn_3.SI : rqn_3.SK;
   }

   public void byte_(rye_3 var1, float var2) {
   }

   @Override
   public void byte_(an_3 var1) {
      if (!this.Sc()) {
         super.byte_(var1);
      }
   }

   public void byte_(int var1, boolean var2) {
      int var3 = ((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)catch_[3]);
      if (var2) {
         var3 |= var1;
      } else {
         var3 &= ~var1;
      }

      ((rmE_2)this.throws_[49]).break_((rut_3<Byte>)catch_[3], (byte)var3);
   }

   private boolean byte_(rfH_2 var1, xc_3 var2) {
      if (!var2.byte_(zv_3.volatile_)) {
         return break_[112];
      } else {
         xc_3 var3 = ((rYB)this.throws_[7]).byte_(var1.break_());
         return var3.class_(xu_3.PJ) && var3.byte_(kc_3.volatile_) == var2.byte_(zv_3.p) ? true : break_[111];
      }
   }

   public ic_3 byte_(iJ_2 var1) {
      return this.BT().class_(var1);
   }

   @Override
   public void int_(boolean var1) {
      this.private_();
      super.int_(var1);
      if (var1) {
         Optional var6 = Optional.empty();
         this.private_[66] = var6;
      }
   }

   public void int_(int var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)catch_[7], var1);
   }

   private static void int_() {
      finally_ = new byte[]{
         2,
         4,
         20,
         -20,
         8,
         100,
         5,
         20,
         20,
         4,
         9,
         10,
         9,
         10,
         99,
         8,
         7,
         99,
         99,
         99,
         10,
         15,
         5,
         16,
         8,
         20,
         10,
         100,
         100,
         29,
         33,
         36,
         37,
         44,
         2,
         100,
         35,
         5,
         5,
         3,
         3,
         4,
         10,
         5,
         25,
         6,
         2,
         -1,
         3,
         33,
         36,
         37,
         44,
         20,
         10,
         10,
         10,
         7,
         20,
         30,
         20,
         30,
         20,
         6,
         6,
         55,
         7,
         20,
         7,
         4,
         4,
         4,
         4,
         2,
         5,
         7,
         4,
         -1,
         2,
         2,
         16,
         7,
         46,
         3,
         47,
         48,
         49,
         50,
         52,
         51,
         47,
         3,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         80,
         5,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         52,
         53,
         55,
         57,
         58,
         59,
         60,
         62,
         63,
         64,
         68,
         69,
         70,
         71,
         73,
         74,
         75,
         76,
         77,
         78,
         79,
         11
      };
   }

   private Map<rXQ, rdn_3> long_() {
      EnumMap var1 = null;

      for (rXQ var5 : rXQ.values()) {
         rdn_3 var6;
         switch (((int[])iS_2.class_[0])[var5.class_().ordinal()]) {
            case 1:
               var6 = this.protected_(var5);
               break;
            case 2:
               var6 = this.case_(var5);
               break;
            default:
               continue;
         }

         rdn_3 var7 = this.class_(var5);
         if (!rdn_3.break_(var7, var6)) {
            if (var1 == null) {
               var1 = Maps.newEnumMap(rXQ.class);
            }

            var1.put(var5, var7);
            if (!var6.class_()) {
               this.BT().class_(var6.class_(var5));
            }

            if (!var7.class_()) {
               this.BT().break_(var7.class_(var5));
            }
         }
      }

      return var1;
   }

   private static void float_() {
      class_ = new String[]{
         new String("memories"),
         new String("Soul speed boost"),
         new String("Health"),
         new String("HurtTime"),
         new String("HurtByTimestamp"),
         new String("DeathTime"),
         new String("AbsorptionAmount"),
         new String("Attributes"),
         new String("ActiveEffects"),
         new String("FallFlying"),
         new String("AbsorptionAmount"),
         new String("Attributes"),
         new String("Attributes"),
         new String("ActiveEffects"),
         new String("ActiveEffects"),
         new String("Health"),
         new String("Health"),
         new String("HurtTime"),
         new String("DeathTime"),
         new String("HurtByTimestamp"),
         new String("Team"),
         new String("Team"),
         new String("Unable to add mob to team \"{}\" (that team probably doesn't exist)"),
         new String("FallFlying"),
         new String("SleepingX"),
         new String("SleepingY"),
         new String("SleepingZ"),
         new String("SleepingX"),
         new String("SleepingY"),
         new String("SleepingZ"),
         new String("Brain"),
         new String("Brain"),
         new String("Brain"),
         new String("SleepingX"),
         new String("SleepingY"),
         new String("SleepingZ"),
         new String("662A6B8D-DA3E-4C1C-8813-96EA6097278D"),
         new String("87f46a96-686f-4796-b035-22e16ee9e038"),
         new String("Sprinting speed boost")
      };
   }

   public iB_2(aI_2<? extends iB_2> var1, rYB var2) {
      super(var1, var2);
      this.private_();
      ryR_2 var8 = new ryR_2(this);
      this.private_[1] = var8;
      HashMap var9 = Maps.newHashMap();
      this.private_[2] = var9;
      rqs_3 var10 = rqs_3.class_(2, rdn_3.break_);
      this.private_[3] = var10;
      rqs_3 var11 = rqs_3.class_(4, rdn_3.break_);
      this.private_[4] = var11;
      Integer var12 = 20;
      this.private_[20] = var12;
      Float var13 = 0.02F;
      this.private_[29] = var13;
      Boolean var14 = true;
      this.private_[53] = var14;
      rdn_3 var15 = rdn_3.break_;
      this.private_[61] = var15;
      Optional var16 = Optional.empty();
      this.private_[66] = var16;
      ik_3 var17 = new ik_3(iN_2.class_(var1));
      this.private_[0] = var17;
      this.public_(this.SK());
      Boolean var18 = true;
      this.throws_[2] = var18;
      Float var19 = (float)((Math.random() + 1.0) * 0.01F);
      this.private_[22] = var19;
      this.PX();
      Float var20 = (float)Math.random() * 12398.0F;
      this.private_[21] = var20;
      Float var21 = (float)(Math.random() * (float) (Math.PI * 2));
      this.throws_[15] = var21;
      Float var22 = (Float)this.throws_[15];
      this.private_[25] = var22;
      Float var23 = (Float)this.throws_[16];
      this.private_[26] = var23;
      Float var24 = 0.6F;
      this.throws_[37] = var24;
      rcf_3 var3 = rcf_3.class_;
      iZ_2 var25 = this.class_(new Dynamic(var3, (rcZ_2)var3.createMap(ImmutableMap.of(var3.class_("memories"), (rcZ_2)var3.emptyMap()))));
      this.private_[72] = var25;
   }

   static {
      ntfClinit();
   }

   @Override
   public void this_() {
      this.private_();
      super.this_();
      this.final_();
      this.void_();
      Boolean var17 = false;
      this.private_[75] = var17;

      for (rdn_3 var3 : this.PV()) {
         if (!var3.class_()) {
            Boolean var18 = true;
            this.private_[75] = var18;
         }
      }

      if (!((rYB)this.throws_[7]).continue_) {
         int var39 = this.BY();
         if (var39 > 0) {
            if ((Integer)this.private_[8] <= 0) {
               Integer var19 = 20 * (30 - var39);
               this.private_[8] = var19;
            }

            Integer var20 = (Integer)this.private_[8] - 1;
            this.private_[8] = var20;
            if ((Integer)this.private_[8] <= 0) {
               this.int_(var39 - 1);
            }
         }

         int var41 = this.SM();
         if (var41 > 0) {
            if ((Integer)this.private_[9] <= 0) {
               Integer var21 = 20 * (30 - var41);
               this.private_[9] = var21;
            }

            Integer var22 = (Integer)this.private_[9] - 1;
            this.private_[9] = var22;
            if ((Integer)this.private_[9] <= 0) {
               this.package_(var41 - 1);
            }
         }

         this.else_();
         if ((Integer)this.throws_[41] % 20 == 0) {
            this.SW().throws_();
         }

         if (!(Boolean)this.throws_[65]) {
            boolean var4 = this.break_(rLD.public_);
            if (this.finally_(6) != var4) {
               this.break_(6, var4);
            }
         }

         if (this.Sc() && !this.goto_()) {
            this.SQ();
         }
      }

      this.default_();
      double var40 = this.rx() - (Double)this.throws_[8];
      double var42 = this.BO() - (Double)this.throws_[10];
      float var6 = (float)(var40 * var40 + var42 * var42);
      float var7 = (Float)this.private_[23];
      float var8 = 0.0F;
      Float var23 = (Float)this.private_[35];
      this.private_[34] = var23;
      float var9 = 0.0F;
      float var10 = this.switch_().throws_();
      if (var6 > 0.0025000002F) {
         var9 = 1.0F;
         var8 = (float)Math.sqrt((double)var6) * 3.0F;
         float var11 = (float)rfU_2.protected_(var42, var40) * (180.0F / (float)Math.PI) - 90.0F;
         float var12 = rfU_2.throws_(rfU_2.catch_(var10) - var11);
         if (95.0F < var12 && var12 < 265.0F) {
            var7 = var11 - 180.0F;
         } else {
            var7 = var11;
         }
      }

      if ((Float)this.private_[15] > 0.0F) {
         var7 = var10;
      }

      if (!(Boolean)this.throws_[20]) {
         var9 = 0.0F;
      }

      Float var24 = (Float)this.private_[35] + (var9 - (Float)this.private_[35]) * 0.3F;
      this.private_[35] = var24;
      var8 = this.break_(var7, var8, var10);

      while (this.throws_[15] - this.throws_[17] < -180.0F) {
         Float var25 = (Float)this.throws_[17] - 360.0F;
         this.throws_[17] = var25;
      }

      while (this.throws_[15] - this.throws_[17] >= 180.0F) {
         Float var26 = (Float)this.throws_[17] + 360.0F;
         this.throws_[17] = var26;
      }

      while (this.private_[23] - this.private_[24] < -180.0F) {
         Float var27 = (Float)this.private_[24] - 360.0F;
         this.private_[24] = var27;
      }

      while (this.private_[23] - this.private_[24] >= 180.0F) {
         Float var28 = (Float)this.private_[24] + 360.0F;
         this.private_[24] = var28;
      }

      while (this.throws_[16] - this.throws_[18] < -180.0F) {
         Float var29 = (Float)this.throws_[18] - 360.0F;
         this.throws_[18] = var29;
      }

      while (this.throws_[16] - this.throws_[18] >= 180.0F) {
         Float var30 = (Float)this.throws_[18] + 360.0F;
         this.throws_[18] = var30;
      }

      while (this.private_[26] - this.private_[28] < -180.0F) {
         Float var31 = (Float)this.private_[28] - 360.0F;
         this.private_[28] = var31;
      }

      while (this.private_[26] - this.private_[28] >= 180.0F) {
         Float var32 = (Float)this.private_[28] + 360.0F;
         this.private_[28] = var32;
      }

      while (this.private_[25] - this.private_[27] < -180.0F) {
         Float var33 = (Float)this.private_[27] - 360.0F;
         this.private_[27] = var33;
      }

      while (this.private_[25] - this.private_[27] >= 180.0F) {
         Float var34 = (Float)this.private_[27] + 360.0F;
         this.private_[27] = var34;
      }

      Float var35 = (Float)this.private_[36] + var8;
      this.private_[36] = var35;
      if (this.Sy()) {
         Integer var36 = (Integer)this.private_[64] + 1;
         this.private_[64] = var36;
      } else {
         Integer var37 = 0;
         this.private_[64] = var37;
      }

      if (this.Sc()) {
         Float var38 = 0.0F;
         this.throws_[16] = var38;
      }
   }

   public float this_(float var1) {
      this.private_();
      return rfU_2.catch_(var1, (float)((Integer)this.private_[62]).intValue(), (float)((Integer)this.private_[63]).intValue());
   }

   public Map<rLR, rLY> sb() {
      this.private_();
      return (Map<rLR, rLY>)this.private_[2];
   }

   @Override
   public float f() {
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnJ_2.class_(this, super.f())).break_();
   }

   public float interface_() {
      return this.break_(rLD.protected_) ? (float)(6 + (1 + this.byte_(rLD.protected_).byte_()) * 2) : implements_[75];
   }

   @Override
   public abstract void class_(rXQ var1, rdn_3 var2);

   @Override
   public void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      if (!this.rT()) {
         this.rd();
      }

      if (!((rYB)this.throws_[7]).continue_ && var3 && (Float)this.throws_[31] > 0.0F) {
         this.SI();
         this.Ba();
      }

      if (!((rYB)this.throws_[7]).continue_ && (Float)this.throws_[31] > 3.0F && var3) {
         float var6 = (float)rfU_2.case_((Float)this.throws_[31] - 3.0F);
         if (!var4.catch_()) {
            double var7 = Math.min((double)(0.2F + var6 / 15.0F), 2.5);
            int var9 = (int)(150.0 * var7);
            ((rrEm_1)((rYB)this.throws_[7])).class_(new rLX(rLQ.protected_, var4), this.rx(), this.re(), this.BO(), var9, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.class_(var1, var3, var4, var5);
   }

   public boolean class_(aI_2<?> var1) {
      return true;
   }

   public void class_(rye_3 var1, int var2, boolean var3) {
   }

   private void class_(rdn_3 var1, rYB var2, iB_2 var3) {
      rdb_3 var4 = var1.break_();
      if (var4.super_()) {
         for (Pair var6 : var4.this_().case_()) {
            if (!var2.continue_ && var6.getFirst() != null && var2.int_.nextFloat() < (Float)var6.getSecond()) {
               var3.break_(new rLY((rLY)var6.getFirst()));
            }
         }
      }
   }

   public void class_(iB_2 var1, boolean var2) {
      this.private_();
      Float var14 = (Float)var1.private_[18];
      var1.private_[17] = var14;
      double var3 = var1.rx() - (Double)var1.throws_[8];
      double var5 = var2 ? var1.re() - (Double)var1.throws_[9] : protected_[103];
      double var7 = var1.BO() - (Double)var1.throws_[10];
      float var9 = rfU_2.class_(var3 * var3 + var5 * var5 + var7 * var7) * 4.0F;
      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      Float var15 = (Float)var1.private_[18] + (var9 - (Float)var1.private_[18]) * 0.4F;
      var1.private_[18] = var15;
      Float var16 = (Float)var1.private_[19] + (Float)var1.private_[18];
      var1.private_[19] = var16;
   }

   private void class_(rfH_2 var1) {
      this.new_((double)var1.b_() + 0.5, (double)var1.c_() + 0.6875, (double)var1.d_() + 0.5);
   }

   private void class_(Map<rXQ, rdn_3> var1) {
      ArrayList var2 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2x, var3) -> {
         rdn_3 var4 = var3.implements_();
         var2.add(Pair.of(var2x, var4));
         switch (((int[])iS_2.class_[0])[var2x.class_().ordinal()]) {
            case 1:
               this.break_(var2x, var4);
               break;
            case 2:
               this.byte_(var2x, var4);
         }
      });
      ((rrEm_1)((rYB)this.throws_[7])).else_().break_(this, new rvO_2(this.V(), var2));
   }

   private void class_(an_3 var1) {
      rjU_2 var2;
      if (!(Boolean)var1.throws_[27] && !((rYB)this.throws_[7]).byte_(var1.Bs()).break_().class_(rls_3.Q)) {
         var2 = var1.a_(this);
      } else {
         var2 = new rjU_2(var1.rx(), var1.re() + (double)var1.Bm(), var1.BO());
      }

      this.case_(var2.break_, var2.byte_, var2.protected_);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 264932232715356110L;
   }

   public void class_(rsE_2 var1) {
      rhd_3 var2 = var1.case_() != null ? ((rYB)this.throws_[7]).class_(var1.case_()) : null;
      if (var2 instanceof rhN_2) {
         Oo_1.strictfp_.class_((rhN_2)var2, var1.protected_(), this);
      }
   }

   public void class_(an_3 var1, int var2) {
      if (!(Boolean)var1.throws_[27] && !((rYB)this.throws_[7]).continue_ && (var1 instanceof rsE_2 || var1 instanceof rhm_3 || var1 instanceof rsP_2)) {
         ((rrEm_1)((rYB)this.throws_[7])).else_().break_(var1, new rZe_1(var1.V(), this.V(), var2));
      }
   }

   public static boolean class_(Collection<rLY> var0) {
      for (rLY var2 : var0) {
         if (!var2.protected_()) {
            return false;
         }
      }

      return break_[49];
   }

   public void class_(rye_3 var1, float var2) {
      if (!this.class_(var1)) {
         var2 = this.protected_(var1, var2);
         var2 = this.throws_(var1, var2);
         float var3 = Math.max(var2 - this.Sd(), 0.0F);
         this.return_(this.Sd() - (var2 - var3));
         float var4 = var2 - var3;
         if (var4 > 0.0F && var4 < 3.4028235E37F && var1.extends_() instanceof rhN_2) {
            ((rhN_2)var1.extends_()).class_(rlB_2.long_, Math.round(var4 * 10.0F));
         }

         if (var3 != 0.0F) {
            float var5 = this.Ss();
            this.public_(var5 - var3);
            this.SW().class_(var1, var5, var3);
            this.return_(this.Sd() - var3);
         }
      }
   }

   public boolean class_(Predicate<rdb_3> var1) {
      return !var1.test(this.ss().break_()) && !var1.test(this.Sn().break_()) ? break_[138] : break_[137];
   }

   public abstract rdn_3 class_(rXQ var1);

   public rdn_3 class_(rYB var1, rdn_3 var2) {
      if (var2.long_()) {
         var1.class_(
            null, this.rx(), this.re(), this.BO(), this.protected_(var2), rqL_2.NEUTRAL, 1.0F, 1.0F + (var1.int_.nextFloat() - var1.int_.nextFloat()) * 0.4F
         );
         this.class_(var2, var1, this);
         if (!(this instanceof rhd_3) || !((rhx_3)((rhd_3)this).implements_[18]).protected_) {
            var2.catch_(1);
         }
      }

      return var2;
   }

   @Override
   public boolean class_(float var1, float var2) {
      boolean var3 = super.class_(var1, var2);
      int var4 = this.implements_(var1, var2);
      if (var4 > 0) {
         this.class_(this.byte_(var4), 1.0F, 1.0F);
         this.sM();
         this.break_(rye_3.extends_, (float)var4);
         return true;
      } else {
         return var3;
      }
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.private_();
      Double var15 = var1;
      this.private_[46] = var15;
      Double var16 = var3;
      this.private_[47] = var16;
      Double var17 = var5;
      this.private_[48] = var17;
      Double var18 = (double)var7;
      this.private_[49] = var18;
      Double var19 = (double)var8;
      this.private_[50] = var19;
      Integer var20 = var9;
      this.private_[45] = var20;
   }

   @Override
   public void class_(Rm_1 var1, rjU_2 var2) {
      this.private_();
      super.class_(var1, var2);
      Float var7 = (Float)this.private_[25];
      this.private_[27] = var7;
      Float var8 = (Float)this.private_[25];
      this.private_[23] = var8;
      Float var9 = (Float)this.private_[23];
      this.private_[24] = var9;
   }

   public rLY class_(rLR var1) {
      this.private_();
      return (rLY)((Map)this.private_[2]).remove(var1);
   }

   public boolean class_(rXs_1 var1) {
      return false;
   }

   public boolean class_(rrTR var1) {
      rjU_2 var2 = new rjU_2(this.rx(), this.rH(), this.BO());
      rjU_2 var3 = var1.rr();
      rjU_2 var4 = new rjU_2(var3.break_, var3.byte_ + (double)(var1 instanceof an_3 var5 ? var5.Bx() : implements_[192]), var3.protected_);
      return ((rYB)this.throws_[7]).class_(new rjB_2(var2, var4, rjS_2.COLLIDER, rjs_3.NONE, this)).byte_() == rjM_2.MISS ? true : break_[199];
   }

   public boolean class_(rdb_3 var1) {
      return this.class_((Predicate<rdb_3>)(var1x -> var1x == var1 ? true : break_[253]));
   }

   public void class_(rLY var1) {
      this.private_();
      Boolean var6 = true;
      this.private_[53] = var6;
      if (!((rYB)this.throws_[7]).continue_) {
         var1.class_().class_(this, this.BT(), var1.byte_());
      }

      rrLo_1.class_(this, var1);
   }

   @Override
   public rjU_2 class_(rpB_2 var1, rqT_2 var2) {
      return implements_(super.class_(var1, var2));
   }

   public void class_(rpm_3 var1, rdn_3 var2) {
      if (var1 == rpm_3.MAIN_HAND) {
         this.class_(rXQ.MAINHAND, var2);
      } else {
         if (var1 != rpm_3.OFF_HAND) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.class_(rXQ.OFFHAND, var2);
      }
   }

   @Override
   public void class_(rut_3<?> var1) {
      this.private_();
      super.class_(var1);
      if (((rut_3)catch_[9]).equals(var1)) {
         if (((rYB)this.throws_[7]).continue_) {
            this.Bg().ifPresent(this::class_);
         }
      } else if (((rut_3)catch_[3]).equals(var1) && ((rYB)this.throws_[7]).continue_) {
         if (this.return_() && ((rdn_3)this.private_[61]).class_()) {
            rdn_3 var6 = this.protected_(this.P());
            this.private_[61] = var6;
            if (!((rdn_3)this.private_[61]).class_()) {
               Integer var7 = (Integer)this.private_[63];
               this.private_[62] = var7;
               Integer var8 = ((rdn_3)this.private_[61]).extends_();
               this.private_[63] = var8;
            }
         } else if (!this.return_() && !((rdn_3)this.private_[61]).class_()) {
            rdn_3 var9 = rdn_3.break_;
            this.private_[61] = var9;
            Integer var10 = (Integer)this.private_[63];
            this.private_[62] = var10;
            Integer var11 = 0;
            this.private_[63] = var11;
         }
      }
   }

   public rzP_2 class_(boolean var1, rye_3 var2) {
      this.private_();
      rzP_2 var3 = new rzP_2((rrEm_1)((rYB)this.throws_[7]))
         .class_((Random)this.throws_[40])
         .class_(rzQ_2.class_, this)
         .class_(rzQ_2.case_, this.Ps())
         .class_(rzQ_2.byte_, var2)
         .break_(rzQ_2.protected_, var2.extends_())
         .break_(rzQ_2.throws_, var2.finally_());
      if (var1 && (rhd_3)this.private_[30] != null) {
         var3 = var3.class_(rzQ_2.break_, (rhd_3)this.private_[30]).class_(((rhd_3)this.private_[30]).sY());
      }

      return var3;
   }

   public double class_(iJ_2 var1) {
      return this.BT().byte_(var1);
   }

   public void class_(rye_3 var1, boolean var2) {
      rqO_2 var3 = this.By();
      rzL_2 var4 = ((rYB)this.throws_[7]).const_().o().class_(var3);
      rzP_2 var5 = this.class_(var2, var1);
      var4.break_(var5.class_(rzz_3.case_), this::a_);
   }

   @Override
   public float class_(iM_2 var1, ap_3 var2) {
      return var1 == iM_2.SLEEPING ? 0.2F : this.break_(var1, var2);
   }

   @Override
   public void class_(rcd_3 var1) {
      this.private_();
      var1.class_("Health", this.Ss());
      var1.class_("HurtTime", (short)((Integer)this.private_[10]).intValue());
      var1.break_("HurtByTimestamp", (Integer)this.private_[55]);
      var1.class_("DeathTime", (short)((Integer)this.private_[13]).intValue());
      var1.class_("AbsorptionAmount", this.Sd());
      var1.class_("Attributes", this.BT().byte_());
      if (!((Map)this.private_[2]).isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (rLY var4 : ((Map)this.private_[2]).values()) {
            var2.add(var4.class_(new rcd_3()));
         }

         var1.class_("ActiveEffects", var2);
      }

      var1.class_("FallFlying", this.Sy());
      this.Bg().ifPresent(var1x -> {
         var1.break_("SleepingX", var1x.b_());
         var1.break_("SleepingY", var1x.c_());
         var1.break_("SleepingZ", var1x.d_());
      });
      DataResult var5 = ((iZ_2)this.private_[72]).class_(rcf_3.class_);
      var5.resultOrPartial(((Logger)case_[0])::error).ifPresent(var1x -> var1.class_("Brain", var1x));
   }

   public void class_(rpm_3 var1, boolean var2) {
      this.private_();
      if (!(Boolean)this.private_[5] || (float)((Integer)this.private_[7]).intValue() >= this.interface_() / 2.0F || (Integer)this.private_[7] < 0) {
         Integer var9 = -1;
         this.private_[7] = var9;
         Boolean var10 = true;
         this.private_[5] = var10;
         this.private_[6] = var1;
         if ((rYB)this.throws_[7] instanceof rrEm_1) {
            rZj_1 var3 = new rZj_1(this, var1 == rpm_3.MAIN_HAND ? 0 : finally_[48]);
            rrEN var4 = ((rrEm_1)((rYB)this.throws_[7])).else_();
            if (var2) {
               var4.class_(this, var3);
            } else {
               var4.break_(this, var3);
            }
         }
      }
   }

   public iZ_2<?> class_(Dynamic<?> var1) {
      return this.SV().class_(var1);
   }

   public void class_(rpm_3 var1) {
      this.class_(var1, false);
   }

   @Override
   public void class_(byte var1) {
      this.private_();
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var2 = var1 == 33 ? true : break_[125];
            boolean var3 = var1 == 36 ? true : break_[127];
            boolean var4 = var1 == 37 ? true : break_[129];
            boolean var5 = var1 == 44 ? true : break_[131];
            Float var26 = 1.5F;
            this.private_[18] = var26;
            Integer var27 = 20;
            this.throws_[47] = var27;
            Integer var28 = 10;
            this.private_[11] = var28;
            Integer var29 = (Integer)this.private_[11];
            this.private_[10] = var29;
            Float var30 = 0.0F;
            this.private_[12] = var30;
            if (var2) {
               this.class_(rqn_3.dG, this.Si(), (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
            }

            rye_3 var6;
            if (var4) {
               var6 = rye_3.byte_;
            } else if (var3) {
               var6 = rye_3.private_;
            } else if (var5) {
               var6 = rye_3.else_;
            } else {
               var6 = rye_3.final_;
            }

            rqA_2 var7 = this.byte_(var6);
            if (var7 != null) {
               this.class_(var7, this.Si(), (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
            }

            this.break_(rye_3.final_, 0.0F);
            break;
         case 3:
            rqA_2 var8 = this.Bt();
            if (var8 != null) {
               this.class_(var8, this.Si(), (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
            }

            if (!(this instanceof rhd_3)) {
               this.public_(0.0F);
               this.break_(rye_3.final_);
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
            super.class_(var1);
            break;
         case 29:
            this.class_(rqn_3.Jr, 1.0F, 0.8F + ((rYB)this.throws_[7]).int_.nextFloat() * 0.4F);
            break;
         case 30:
            this.class_(rqn_3.JP, 0.8F, 0.8F + ((rYB)this.throws_[7]).int_.nextFloat() * 0.4F);
            break;
         case 46:
            short var9 = native_[332];

            for (int var10 = 0; var10 < 128; var10++) {
               double var11 = (double)var10 / 127.0;
               float var13 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 0.2F;
               float var14 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 0.2F;
               float var15 = (((Random)this.throws_[40]).nextFloat() - 0.5F) * 0.2F;
               double var16 = rfU_2.protected_(var11, (Double)this.throws_[8], this.rx())
                  + (((Random)this.throws_[40]).nextDouble() - 0.5) * (double)this.PN() * 2.0;
               double var18 = rfU_2.protected_(var11, (Double)this.throws_[9], this.re()) + ((Random)this.throws_[40]).nextDouble() * (double)this.Bm();
               double var20 = rfU_2.protected_(var11, (Double)this.throws_[10], this.BO())
                  + (((Random)this.throws_[40]).nextDouble() - 0.5) * (double)this.PN() * 2.0;
               ((rYB)this.throws_[7]).class_(rLQ.transient_, var16, var18, var20, (double)var13, (double)var14, (double)var15);
            }
            break;
         case 47:
            this.catch_(this.class_(rXQ.MAINHAND));
            break;
         case 48:
            this.catch_(this.class_(rXQ.OFFHAND));
            break;
         case 49:
            this.catch_(this.class_(rXQ.HEAD));
            break;
         case 50:
            this.catch_(this.class_(rXQ.CHEST));
            break;
         case 51:
            this.catch_(this.class_(rXQ.LEGS));
            break;
         case 52:
            this.catch_(this.class_(rXQ.FEET));
            break;
         case 54:
            kB_2.break_(this);
            break;
         case 55:
            this.implements_();
      }
   }

   public void class_(float var1, double var2, double var4) {
      var1 = (float)((double)var1 * (1.0 - this.class_(iQ_2.byte_)));
      if (!(var1 <= 0.0F)) {
         Boolean var12 = true;
         this.throws_[57] = var12;
         rjU_2 var6 = this.rv();
         rjU_2 var7 = new rjU_2(var2, 0.0, var4).protected_().class_((double)var1);
         this.catch_(
            var6.break_ / 2.0 - var7.break_,
            this.throws_[20] ? Math.min(0.4, var6.byte_ / 2.0 + (double)var1) : var6.byte_,
            var6.protected_ / 2.0 - var7.protected_
         );
      }
   }

   public void class_(rfl_3 var1, rfl_3 var2) {
      this.private_();
      rfl_3 var3 = var1.break_(var2);
      List var4 = ((rYB)this.throws_[7]).class_(this, var3);
      if (!var4.isEmpty()) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            an_3 var6 = (an_3)var4.get(var5);
            if (var6 instanceof iB_2) {
               this.case_((iB_2)var6);
               Integer var11 = 0;
               this.private_[69] = var11;
               this.byte_(this.rv().class_(-0.2));
               break;
            }
         }
      } else if ((Boolean)this.throws_[23]) {
         Integer var12 = 0;
         this.private_[69] = var12;
      }

      if (!((rYB)this.throws_[7]).continue_ && (Integer)this.private_[69] <= 0) {
         this.byte_(4, false);
      }
   }

   @Override
   public void class_(float var1, int var2) {
      this.private_();
      Double var7 = (double)var1;
      this.private_[51] = var7;
      Integer var8 = var2;
      this.private_[52] = var8;
   }

   public void class_(iB_2 var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         boolean var2 = false;
         if (var1 instanceof rSN) {
            if (((rYB)this.throws_[7]).B().break_(rRu_1.break_)) {
               rfH_2 var3 = this.Bs();
               xc_3 var4 = xu_3.ry.continue_();
               if (((rYB)this.throws_[7]).byte_(var3).catch_() && var4.class_((rRR)((rYB)this.throws_[7]), var3)) {
                  ((rYB)this.throws_[7]).class_(var3, var4, 3);
                  var2 = true;
               }
            }

            if (!var2) {
               rsE_2 var5 = new rsE_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), new rdn_3(rdy_3.rF));
               ((rYB)this.throws_[7]).a_(var5);
            }
         }
      }
   }

   public boolean class_(double var1, double var3, double var5, boolean var7) {
      double var8 = this.rx();
      double var10 = this.re();
      double var12 = this.BO();
      double var14 = var3;
      boolean var16 = false;
      rfH_2 var17 = new rfH_2(var1, var3, var5);
      rYB var18 = (rYB)this.throws_[7];
      if (var18.int_(var17)) {
         boolean var19 = false;

         while (!var19 && var17.c_() > 0) {
            rfH_2 var20 = var17.break_();
            xc_3 var21 = var18.byte_(var20);
            if (var21.byte_().byte_()) {
               var19 = true;
            } else {
               var14--;
               var17 = var20;
            }
         }

         if (var19) {
            this.case_(var1, var14, var5);
            if (var18.throws_(this) && !var18.protected_(this.rN())) {
               var16 = true;
            }
         }
      }

      if (!var16) {
         this.case_(var8, var10, var12);
         return false;
      } else {
         if (var7) {
            var18.class_(this, (byte)46);
         }

         if (this instanceof aA_2) {
            ((aA_2)this).public_().final_();
         }

         return break_[241];
      }
   }

   public void class_(rdn_3 var1, int var2) {
      if (!var1.class_() && this.return_()) {
         if (var1.native_() == rkc_3.DRINK) {
            this.class_(this.byte_(var1), 0.5F, ((rYB)this.throws_[7]).int_.nextFloat() * 0.1F + 0.9F);
         }

         if (var1.native_() == rkc_3.EAT) {
            this.break_(var1, var2);
            this.class_(
               this.protected_(var1),
               0.5F + 0.5F * (float)((Random)this.throws_[40]).nextInt(2),
               (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F
            );
         }
      }
   }

   public boolean class_(iB_2 var1, ay_3 var2) {
      return var2.class_(this, var1);
   }

   public void class_(rfH_2 var1, boolean var2) {
   }

   public void class_(rLY var1, boolean var2) {
      this.private_();
      Boolean var8 = true;
      this.private_[53] = var8;
      if (var2 && !((rYB)this.throws_[7]).continue_) {
         rLR var3 = var1.class_();
         var3.class_(this, this.BT(), var1.byte_());
         var3.break_(this, this.BT(), var1.byte_());
      }

      rrLI.break_(this, var1, var2);
   }

   public rjU_2 class_(double var1, boolean var3, rjU_2 var4) {
      if (!this.rw() && !this.PF()) {
         double var5;
         if (var3 && Math.abs(var4.byte_ - 0.005) >= 0.003 && Math.abs(var4.byte_ - var1 / 16.0) < 0.003) {
            var5 = -0.003;
         } else {
            var5 = var4.byte_ - var1 / 16.0;
         }

         return new rjU_2(var4.break_, var5, var4.protected_);
      } else {
         return var4;
      }
   }

   public void default_() {
      this.private_();
      if ((Integer)this.private_[59] > 0) {
         Integer var17 = (Integer)this.private_[59] - 1;
         this.private_[59] = var17;
      }

      if (this.return_()) {
         Integer var18 = (Integer)this.private_[73] + 1;
         this.private_[73] = var18;
      } else {
         Integer var19 = 0;
         this.private_[73] = var19;
      }

      if (this.BL()) {
         Integer var20 = 0;
         this.private_[77] = var20;
         Integer var21 = (Integer)this.private_[76] + 1;
         this.private_[76] = var21;
      } else {
         Integer var22 = 0;
         this.private_[76] = var22;
         Integer var23 = (Integer)this.private_[77] + 1;
         this.private_[77] = var23;
      }

      if (this.Po()) {
         Integer var24 = 0;
         this.private_[45] = var24;
         this.byte_(this.rx(), this.re(), this.BO());
      }

      if ((Integer)this.private_[45] > 0) {
         double var1 = this.rx() + ((Double)this.private_[46] - this.rx()) / (double)((Integer)this.private_[45]).intValue();
         double var3 = this.re() + ((Double)this.private_[47] - this.re()) / (double)((Integer)this.private_[45]).intValue();
         double var5 = this.BO() + ((Double)this.private_[48] - this.BO()) / (double)((Integer)this.private_[45]).intValue();
         double var7 = rfU_2.case_((Double)this.private_[49] - (double)((Float)this.throws_[15]).floatValue());
         Float var25 = (float)((double)((Float)this.throws_[15]).floatValue() + var7 / (double)((Integer)this.private_[45]).intValue());
         this.throws_[15] = var25;
         Float var26 = (float)(
            (double)((Float)this.throws_[16]).floatValue()
               + ((Double)this.private_[50] - (double)((Float)this.throws_[16]).floatValue()) / (double)((Integer)this.private_[45]).intValue()
         );
         this.throws_[16] = var26;
         Integer var27 = (Integer)this.private_[45] - 1;
         this.private_[45] = var27;
         this.new_(var1, var3, var5);
         this.case_((Float)this.throws_[15], (Float)this.throws_[16]);
      } else if (!this.try_()) {
         this.byte_(this.rv().class_(0.98));
      }

      if ((Integer)this.private_[52] > 0) {
         Float var28 = (float)(
            (double)((Float)this.private_[25]).floatValue()
               + rfU_2.case_((Double)this.private_[51] - (double)((Float)this.private_[25]).floatValue()) / (double)((Integer)this.private_[52]).intValue()
         );
         this.private_[25] = var28;
         Integer var29 = (Integer)this.private_[52] - 1;
         this.private_[52] = var29;
      }

      rjU_2 var37 = this.rv();
      double var2 = var37.break_;
      double var4 = var37.byte_;
      double var6 = var37.protected_;
      if (Math.abs(var37.break_) < 0.003) {
         var2 = 0.0;
      }

      if (Math.abs(var37.byte_) < 0.003) {
         var4 = 0.0;
      }

      if (Math.abs(var37.protected_) < 0.003) {
         var6 = 0.0;
      }

      this.catch_(var2, var4, var6);
      if (this.BK()) {
         Boolean var30 = false;
         this.private_[41] = var30;
         Float var31 = 0.0F;
         this.private_[42] = var31;
         Float var32 = 0.0F;
         this.private_[44] = var32;
      } else if (this.try_()) {
         this.Q();
      }

      if ((Boolean)this.private_[41] && this.sr()) {
         double var8;
         if (this.ry()) {
            var8 = this.break_(rlG_2.byte_);
         } else {
            var8 = this.break_(rlG_2.break_);
         }

         boolean var10 = this.rT() && var8 > 0.0 ? true : break_[174];
         double var11 = this.rI();
         if (!var10 || (Boolean)this.throws_[20] && !(var8 > var11)) {
            if (!this.ry() || (Boolean)this.throws_[20] && !(var8 > var11)) {
               if (((Boolean)this.throws_[20] || var10 && var8 <= var11) && (Integer)this.private_[59] == 0) {
                  this.continue_(true);
               }
            } else {
               this.byte_(rlG_2.byte_);
            }
         } else {
            this.byte_(rlG_2.break_);
         }
      } else {
         Integer var33 = 0;
         this.private_[59] = var33;
      }

      Float var34 = (Float)this.private_[42] * 0.98F;
      this.private_[42] = var34;
      Float var35 = (Float)this.private_[44] * 0.98F;
      this.private_[44] = var35;
      this.super_();
      rfl_3 var38 = this.rN();
      this.private_(
         new rjU_2(
            (double)((Float)this.private_[42]).floatValue(), (double)((Float)this.private_[43]).floatValue(), (double)((Float)this.private_[44]).floatValue()
         )
      );
      if ((Integer)this.private_[69] > 0) {
         Integer var36 = (Integer)this.private_[69] - 1;
         this.private_[69] = var36;
         this.class_(var38, this.rN());
      }

      this.SS();
      if (!((rYB)this.throws_[7]).continue_ && this.BU() && this.Pk()) {
         this.break_(rye_3.private_, 1.0F);
      }
   }

   @Override
   public float t() {
      this.private_();
      return (Float)this.private_[25];
   }

   @Override
   public void j() {
      this.break_(rye_3.volatile_, Float.MAX_VALUE);
   }

   public rdn_3 ss() {
      return this.class_(rXQ.MAINHAND);
   }

   @Override
   public void rf() {
      Boolean var5 = ((Random)this.throws_[40]).nextDouble() >= this.class_(iQ_2.byte_) ? true : break_[207];
      this.throws_[25] = var5;
   }

   private void void_() {
      this.private_();
      Float var5 = (Float)this.private_[70];
      this.private_[71] = var5;
      if (this.rP()) {
         Float var6 = Math.min(1.0F, (Float)this.private_[70] + 0.09F);
         this.private_[70] = var6;
      } else {
         Float var7 = Math.max(0.0F, (Float)this.private_[70] - 0.09F);
         this.private_[70] = var7;
      }
   }

   public void sh() {
   }

   public float break_(float var1, float var2, float var3) {
      this.private_();
      float var4 = rfU_2.catch_(var1 - (Float)this.private_[23]);
      Float var11 = (Float)this.private_[23] + var4 * 0.3F;
      this.private_[23] = var11;
      float var5 = rfU_2.catch_(var3 - (Float)this.private_[23]);
      boolean var6 = !(var5 < -90.0F) && !(var5 >= 90.0F) ? break_[161] : break_[160];
      if (var5 < -75.0F) {
         var5 = -75.0F;
      }

      if (var5 >= 75.0F) {
         var5 = 75.0F;
      }

      Float var12 = var3 - var5;
      this.private_[23] = var12;
      if (var5 * var5 > 2500.0F) {
         Float var13 = (Float)this.private_[23] + var5 * 0.2F;
         this.private_[23] = var13;
      }

      if (var6) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void break_(rXQ var1) {
      ((rYB)this.throws_[7]).class_(this, throws_(var1));
   }

   private void break_(rXQ var1, rdn_3 var2) {
      this.private_();
      ((rqs_3)this.private_[3]).set(var1.break_(), var2);
   }

   public void break_(rye_3 var1) {
      this.private_();
      if (!(Boolean)this.throws_[27] && !(Boolean)this.private_[32]) {
         an_3 var2 = var1.extends_();
         iB_2 var3 = this.Sh();
         if ((Integer)this.private_[39] >= 0 && var3 != null) {
            var3.class_(this, (Integer)this.private_[39], var1);
         }

         if (this.Sc()) {
            this.SQ();
         }

         Boolean var8 = true;
         this.private_[32] = var8;
         this.SW().throws_();
         if ((rYB)this.throws_[7] instanceof rrEm_1) {
            if (var2 != null) {
               var2.class_((rrEm_1)((rYB)this.throws_[7]), this);
            }

            this.protected_(var1);
            this.class_(var3);
         }

         ((rYB)this.throws_[7]).class_(this, (byte)3);
         this.class_(iM_2.DYING);
      }
   }

   public void break_(rhd_3 var1) {
      this.private_();
      this.private_[30] = var1;
      Integer var7 = (Integer)this.throws_[41];
      this.private_[31] = var7;
   }

   private void break_(rdn_3 var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         rjU_2 var4 = new rjU_2(((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         var4 = var4.class_(-(Float)this.throws_[16] * (float) (Math.PI / 180.0));
         var4 = var4.break_(-(Float)this.throws_[15] * (float) (Math.PI / 180.0));
         double var5 = (double)(-((Random)this.throws_[40]).nextFloat()) * 0.6 - 0.3;
         rjU_2 var7 = new rjU_2(((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 0.3, var5, 0.6);
         var7 = var7.class_(-(Float)this.throws_[16] * (float) (Math.PI / 180.0));
         var7 = var7.break_(-(Float)this.throws_[15] * (float) (Math.PI / 180.0));
         var7 = var7.break_(this.rx(), this.rH(), this.BO());
         ((rYB)this.throws_[7]).class_(new rLk_1(rLQ.void_, var1), var7.break_, var7.byte_, var7.protected_, var4.break_, var4.byte_ + 0.05, var4.protected_);
      }
   }

   public float break_(iM_2 var1, ap_3 var2) {
      return super.class_(var1, var2);
   }

   public rjU_2 break_(rjU_2 var1, float var2) {
      this.private_();
      this.class_(this.byte_(var2), var1);
      this.byte_(this.finally_(this.rv()));
      this.class_(iG_2.SELF, this.rv());
      rjU_2 var3 = this.rv();
      if (((Boolean)this.throws_[23] || (Boolean)this.private_[41]) && this.o_()) {
         var3 = new rjU_2(var3.break_, 0.2, var3.protected_);
      }

      return var3;
   }

   public boolean break_(rLY var1) {
      this.private_();
      if (!this.throws_(var1)) {
         return false;
      } else {
         rLY var2 = (rLY)((Map)this.private_[2]).get(var1.class_());
         if (var2 == null) {
            ((Map)this.private_[2]).put(var1.class_(), var1);
            this.protected_(var1);
            return true;
         } else if (var2.break_(var1)) {
            this.class_(var2, true);
            return true;
         } else {
            return break_[59];
         }
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      this.private_();
      if (this.class_(var1)) {
         return false;
      } else if (((rYB)this.throws_[7]).continue_) {
         return false;
      } else if (this.Sl()) {
         return false;
      } else if (var1.int_() && this.break_(rLD.native_)) {
         return false;
      } else {
         if (this.Sc() && !((rYB)this.throws_[7]).continue_) {
            this.SQ();
         }

         Integer var16 = 0;
         this.private_[33] = var16;
         float var3 = var2;
         if ((var1 == rye_3.new_ || var1 == rye_3.continue_) && !this.class_(rXQ.HEAD).class_()) {
            this.class_(rXQ.HEAD).class_((int)(var2 * 4.0F + ((Random)this.throws_[40]).nextFloat() * var2 * 2.0F), this, var0 -> var0.break_(rXQ.HEAD));
            var2 *= 0.75F;
         }

         boolean var4 = break_[78];
         float var5 = 0.0F;
         if (var2 > 0.0F && this.case_(var1)) {
            this.else_(var2);
            var5 = var2;
            var2 = 0.0F;
            if (!var1.break_()) {
               an_3 var6 = var1.finally_();
               if (var6 instanceof iB_2) {
                  this.protected_((iB_2)var6);
               }
            }

            var4 = break_[79];
         }

         Float var17 = 1.5F;
         this.private_[18] = var17;
         boolean var33 = true;
         if ((float)((Integer)this.throws_[47]).intValue() > 10.0F) {
            if (var2 <= (Float)this.private_[40]) {
               return false;
            }

            this.class_(var1, var2 - (Float)this.private_[40]);
            Float var18 = var2;
            this.private_[40] = var18;
            var33 = false;
         } else {
            Float var19 = var2;
            this.private_[40] = var19;
            Integer var20 = 20;
            this.throws_[47] = var20;
            this.class_(var1, var2);
            Integer var21 = 10;
            this.private_[11] = var21;
            Integer var22 = (Integer)this.private_[11];
            this.private_[10] = var22;
         }

         Float var23 = 0.0F;
         this.private_[12] = var23;
         an_3 var7 = var1.extends_();
         if (var7 != null) {
            if (var7 instanceof iB_2) {
               this.break_((iB_2)var7);
            }

            if (var7 instanceof rhd_3) {
               Integer var24 = 100;
               this.private_[31] = var24;
               rhd_3 var25 = (rhd_3)var7;
               this.private_[30] = var25;
            } else if (var7 instanceof rOH var8 && var8.sZ()) {
               Integer var26 = 100;
               this.private_[31] = var26;
               iB_2 var9 = var8.sF();
               if (var9 != null && var9.BC() == aI_2.rM) {
                  rhd_3 var27 = (rhd_3)var9;
                  this.private_[30] = var27;
               } else {
                  Object var28 = null;
                  this.private_[30] = var28;
               }
            }
         }

         if (var33) {
            if (var4) {
               ((rYB)this.throws_[7]).class_(this, (byte)29);
            } else if (var1 instanceof rpX_2 && ((rpX_2)var1).goto_()) {
               ((rYB)this.throws_[7]).class_(this, (byte)33);
            } else {
               byte var34;
               if (var1 == rye_3.private_) {
                  var34 = 36;
               } else if (var1.int_()) {
                  var34 = 37;
               } else if (var1 == rye_3.else_) {
                  var34 = 44;
               } else {
                  var34 = finally_[34];
               }

               ((rYB)this.throws_[7]).class_(this, var34);
            }

            if (var1 != rye_3.private_ && (!var4 || var2 > 0.0F)) {
               this.rf();
            }

            if (var7 != null) {
               double var35 = var7.rx() - this.rx();

               double var10;
               for (var10 = var7.BO() - this.BO(); var35 * var35 + var10 * var10 < 1.0E-4; var10 = (Math.random() - Math.random()) * 0.01) {
                  var35 = (Math.random() - Math.random()) * 0.01;
               }

               Float var29 = (float)(rfU_2.protected_(var10, var35) * 180.0F / (float)Math.PI - (double)((Float)this.throws_[15]).floatValue());
               this.private_[12] = var29;
               this.class_(0.4F, var35, var10);
            } else {
               Float var30 = (float)((int)(Math.random() * 2.0) * 180);
               this.private_[12] = var30;
            }
         }

         if (this.Sl()) {
            if (!this.catch_(var1)) {
               rqA_2 var36 = this.Bt();
               if (var33 && var36 != null) {
                  this.class_(var36, this.Si(), this.SN());
               }

               this.break_(var1);
            }
         } else if (var33) {
            this.throws_(var1);
         }

         boolean var37 = var4 && !(var2 > 0.0F) ? break_[84] : break_[83];
         if (var37) {
            this.private_[67] = var1;
            Long var32 = ((rYB)this.throws_[7]).r();
            this.private_[68] = var32;
         }

         if (this instanceof rhN_2) {
            Oo_1.private_.class_((rhN_2)this, var1, var3, var2, var4);
            if (var5 > 0.0F && var5 < 3.4028235E37F) {
               ((rhN_2)this).class_(rlB_2.static_, Math.round(var5 * 10.0F));
            }
         }

         if (var7 instanceof rhN_2) {
            Oo_1.catch_.class_((rhN_2)var7, this, var1, var3, var2, var4);
         }

         return var37;
      }
   }

   public double break_(iJ_2 var1) {
      return this.BT().protected_(var1);
   }

   public void break_(rpm_3 var1) {
      this.private_();
      rdn_3 var2 = this.protected_(var1);
      if (!var2.class_() && !this.return_()) {
         this.private_[61] = var2;
         Integer var8 = (Integer)this.private_[63];
         this.private_[62] = var8;
         Integer var9 = var2.extends_();
         this.private_[63] = var9;
         if (!((rYB)this.throws_[7]).continue_) {
            this.byte_(1, true);
            this.byte_(2, var1 == rpm_3.OFF_HAND ? true : break_[222]);
         }
      }
   }

   private void break_(Map<rXQ, rdn_3> var1) {
      rdn_3 var2 = (rdn_3)var1.get(rXQ.MAINHAND);
      rdn_3 var3 = (rdn_3)var1.get(rXQ.OFFHAND);
      if (var2 != null && var3 != null && rdn_3.break_(var2, this.protected_(rXQ.OFFHAND)) && rdn_3.break_(var3, this.protected_(rXQ.MAINHAND))) {
         ((rrEm_1)((rYB)this.throws_[7])).else_().break_(this, new rvQ_2(this, (byte)55));
         var1.remove(rXQ.MAINHAND);
         var1.remove(rXQ.OFFHAND);
         this.break_(rXQ.MAINHAND, var2.implements_());
         this.break_(rXQ.OFFHAND, var3.implements_());
      }
   }

   public boolean break_(xc_3 var1) {
      return var1.catch_() && !this.Sy() ? break_[21] : break_[20];
   }

   public void break_(rdn_3 var1) {
      if (!var1.class_()) {
         rqA_2 var2 = rqn_3.default_;
         rdb_3 var3 = var1.break_();
         if (var3 instanceof rxS_2) {
            var2 = ((rxS_2)var3).throws_().break_();
         } else if (var3 == rdy_3.kc) {
            var2 = rqn_3.short_;
         }

         this.class_(var2, 1.0F, 1.0F);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      this.private_();
      this.return_(var1.finally_("AbsorptionAmount"));
      if (var1.byte_("Attributes", 9) && (rYB)this.throws_[7] != null && !((rYB)this.throws_[7]).continue_) {
         this.BT().class_(var1.protected_("Attributes", 10));
      }

      if (var1.byte_("ActiveEffects", 9)) {
         rcy_3 var2 = var1.protected_("ActiveEffects", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.class_(var3);
            rLY var5 = rLY.break_(var4);
            if (var5 != null) {
               ((Map)this.private_[2]).put(var5.class_(), var5);
            }
         }
      }

      if (var1.byte_("Health", 99)) {
         this.public_(var1.finally_("Health"));
      }

      Integer var10 = Integer.valueOf(var1.catch_("HurtTime"));
      this.private_[10] = var10;
      Integer var11 = Integer.valueOf(var1.catch_("DeathTime"));
      this.private_[13] = var11;
      Integer var12 = var1.private_("HurtByTimestamp");
      this.private_[55] = var12;
      if (var1.byte_("Team", 8)) {
         String var14 = var1.native_("Team");
         rnB_2 var16 = ((rYB)this.throws_[7]).package_().throws_(var14);
         boolean var17 = var16 != null && ((rYB)this.throws_[7]).package_().class_(this.rz(), var16) ? true : break_[38];
         if (!var17) {
            ((Logger)case_[0]).warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", var14);
         }
      }

      if (var1.new_("FallFlying")) {
         this.break_(7, true);
      }

      if (var1.byte_("SleepingX", 99) && var1.byte_("SleepingY", 99) && var1.byte_("SleepingZ", 99)) {
         rfH_2 var15 = new rfH_2(var1.private_("SleepingX"), var1.private_("SleepingY"), var1.private_("SleepingZ"));
         this.catch_(var15);
         ((rmE_2)this.throws_[49]).break_((rut_3<iM_2>)case_[11], iM_2.SLEEPING);
         if (!(Boolean)this.throws_[48]) {
            this.class_(var15);
         }
      }

      if (var1.byte_("Brain", 10)) {
         iZ_2 var13 = this.class_(new Dynamic(rcf_3.class_, var1.byte_("Brain")));
         this.private_[72] = var13;
      }
   }

   public boolean break_(rLR var1) {
      this.private_();
      return ((Map)this.private_[2]).containsKey(var1);
   }

   public void break_(iB_2 var1) {
      this.private_();
      this.private_[54] = var1;
      Integer var7 = (Integer)this.throws_[41];
      this.private_[55] = var7;
   }

   public void throws_(iB_2 var1) {
      var1.class_(0.5F, var1.rx() - this.rx(), var1.BO() - this.BO());
   }

   public void throws_(rfH_2 var1) {
      int var2 = eA_2.class_(eY_2.finally_, this);
      if (var2 > 0) {
         eD_2.class_(this, (rYB)this.throws_[7], var1, var2);
      }

      if (this.break_(this.Pl())) {
         this.SI();
      }

      this.Ba();
   }

   public void throws_(rye_3 var1) {
      rqA_2 var2 = this.byte_(var1);
      if (var2 != null) {
         this.class_(var2, this.Si(), this.SN());
      }
   }

   private static byte throws_(rXQ var0) {
      switch (((int[])iS_2.class_[1])[var0.ordinal()]) {
         case 1:
            return finally_[84];
         case 2:
            return finally_[85];
         case 3:
            return finally_[86];
         case 4:
            return finally_[87];
         case 5:
            return finally_[88];
         case 6:
            return finally_[89];
         default:
            return finally_[90];
      }
   }

   public float throws_(rye_3 var1, float var2) {
      if (var1.implements_()) {
         return var2;
      } else {
         if (this.break_(rLD.extends_) && var1 != rye_3.volatile_) {
            int var3 = (this.byte_(rLD.extends_).byte_() + 1) * 5;
            int var4 = 25 - var3;
            float var5 = var2 * (float)var4;
            float var6 = var2;
            var2 = Math.max(var5 / 25.0F, 0.0F);
            float var7 = var6 - var2;
            if (var7 > 0.0F && var7 < 3.4028235E37F) {
               if (this instanceof rhN_2) {
                  ((rhN_2)this).class_(rlB_2.short_, Math.round(var7 * 10.0F));
               } else if (var1.extends_() instanceof rhN_2) {
                  ((rhN_2)var1.extends_()).class_(rlB_2.float_, Math.round(var7 * 10.0F));
               }
            }
         }

         if (var2 <= 0.0F) {
            return 0.0F;
         } else {
            int var8 = eA_2.class_(this.PV(), var1);
            if (var8 > 0) {
               var2 = ryg_3.class_(var2, (float)var8);
            }

            return var2;
         }
      }
   }

   @Override
   public float throws_(float var1) {
      this.private_();
      return var1 == 1.0F ? (Float)this.private_[25] : rfU_2.catch_(var1, (Float)this.private_[27], (Float)this.private_[25]);
   }

   public boolean throws_(rLY var1) {
      if (this.sG() != aL_2.break_) {
         return break_[62];
      } else {
         rLR var2 = var1.class_();
         return var2 != rLD.finally_ && var2 != rLD.super_ ? true : break_[61];
      }
   }

   public boolean throws_(rdn_3 var1) {
      return false;
   }

   public void Sm() {
      this.byte_(this.rv().break_(0.0, -0.04F, 0.0));
   }

   public boolean Sc() {
      return this.Bg().isPresent();
   }

   public void Sk() {
      this.private_();
      Iterator var1 = ((Map)this.private_[2]).keySet().iterator();

      try {
         while (var1.hasNext()) {
            rLR var2 = (rLR)var1.next();
            rLY var3 = (rLY)((Map)this.private_[native_[151]]).get(var2);
            if (!var3.class_(this, () -> this.class_(var3, true))) {
               if (!((rYB)this.throws_[native_[152]]).continue_) {
                  var1.remove();
                  this.class_(var3);
               }
            } else if (var3.break_() % native_[153] == 0) {
               this.class_(var3, break_[40]);
            }
         }
      } catch (ConcurrentModificationException var17) {
      }

      if ((Boolean)this.private_[53]) {
         if (!((rYB)this.throws_[7]).continue_) {
            this.SA();
         }

         Boolean var14 = false;
         this.private_[53] = var14;
      }

      Integer var15 = (Integer)this.private_[79];
      this.private_[78] = var15;
      Integer var16 = ((rmE_2)this.throws_[49]).<Integer>class_((rut_3<Integer>)catch_[5]);
      this.private_[79] = var16;
      boolean var18 = ((rmE_2)this.throws_[49]).<Boolean>class_((rut_3<Boolean>)catch_[6]);
      if ((Integer)this.private_[79] > 0) {
         boolean var19;
         if (this.Pp()) {
            var19 = ((Random)this.throws_[40]).nextInt(15) == 0 ? true : break_[43];
         } else {
            var19 = ((Random)this.throws_[40]).nextBoolean();
         }

         if (var18) {
            var19 &= ((Random)this.throws_[40]).nextInt(5) == 0 ? true : break_[45];
         }

         if (var19 && (Integer)this.private_[79] > 0) {
            double var4 = (double)((Integer)this.private_[79] >> 16 & 0xFF) / 255.0;
            double var6 = (double)((Integer)this.private_[79] >> 8 & 0xFF) / 255.0;
            double var8 = (double)((Integer)this.private_[79] & 0xFF) / 255.0;
            ((rYB)this.throws_[7]).class_(var18 ? rLQ.class_ : rLQ.else_, this.break_(0.5), this.Ph(), this.protected_(0.5), var4, var6, var8);
         }
      } else if (((rYB)this.throws_[7]).continue_
         && this != (cb_3)QY.instanceof_().class_[57]
         && !((Map)this.private_[2]).isEmpty()
         && (Integer)this.private_[78] > 0) {
         Iterator var20 = ((Map)this.private_[2]).values().iterator();

         while (var20.hasNext()) {
            rLY var21 = (rLY)var20.next();
            this.class_(var21);
            var20.remove();
         }
      }
   }

   public Collection<rLY> So() {
      this.private_();
      return ((Map)this.private_[2]).values();
   }

   public rpm_3 P() {
      return (((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)catch_[3]) & 2) > 0 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
   }

   public int BD() {
      this.private_();
      return (Integer)this.private_[64];
   }

   private rjU_2 finally_(rjU_2 var1) {
      if (this.o_()) {
         Float var12 = 0.0F;
         this.throws_[31] = var12;
         double var2 = rfU_2.class_(var1.break_, -0.15F, 0.15F);
         double var4 = rfU_2.class_(var1.protected_, -0.15F, 0.15F);
         double var6 = Math.max(var1.byte_, -0.15F);
         if (var6 < 0.0 && !this.sS().class_(xu_3.hU) && this.transient_() && this instanceof rhd_3) {
            var6 = 0.0;
         }

         var1 = new rjU_2(var2, var6, var4);
      }

      return var1;
   }

   public static String finally_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 77, -82, -81, 24, 125, -59, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void catch_(rfH_2 var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Optional<rfH_2>>)catch_[9], Optional.of(var1));
   }

   private void catch_(rdn_3 var1) {
      if (!var1.class_()) {
         if (!this.BF()) {
            ((rYB)this.throws_[7])
               .class_(this.rx(), this.re(), this.BO(), rqn_3.Eg, this.Pr(), 0.8F, 0.8F + ((rYB)this.throws_[7]).int_.nextFloat() * 0.4F, false);
         }

         this.break_(var1, 5);
      }
   }

   private boolean catch_(rye_3 var1) {
      if (var1.private_()) {
         return false;
      } else {
         rdn_3 var2 = null;

         for (rpm_3 var6 : rpm_3.values()) {
            rdn_3 var7 = this.protected_(var6);
            if (var7.break_() == rdy_3.kL) {
               var2 = var7.implements_();
               var7.catch_(1);
               break;
            }
         }

         if (var2 != null) {
            if (this instanceof rhN_2 var8) {
               var8.class_(rlB_2.byte_.break_(rdy_3.kL));
               Oo_1.instanceof_.class_(var8, var2);
            }

            this.public_(1.0F);
            this.SY();
            this.break_(new rLY(rLD.finally_, 900, 1));
            this.break_(new rLY(rLD.synchronized_, 100, 1));
            this.break_(new rLY(rLD.native_, 800, 0));
            ((rYB)this.throws_[7]).class_(this, (byte)35);
         }

         return var2 != null ? true : break_[92];
      }
   }

   public rfl_3 catch_(iM_2 var1) {
      ap_3 var2 = this.a_(var1);
      return new rfl_3(
         (double)(-var2.class_ / 2.0F), 0.0, (double)(-var2.class_ / 2.0F), (double)(var2.class_ / 2.0F), (double)var2.break_, (double)(var2.class_ / 2.0F)
      );
   }

   public boolean catch_(iB_2 var1) {
      return true;
   }

   public boolean extends_(int var1) {
      this.private_();
      if (this.return_() && !((rdn_3)this.private_[61]).class_()) {
         rdb_3 var2 = ((rdn_3)this.private_[61]).break_();
         if (var2.byte_((rdn_3)this.private_[61]) != rkc_3.BLOCK) {
            return false;
         } else {
            return var2.break_((rdn_3)this.private_[61]) - this.private_[63] >= var1 ? true : break_[232];
         }
      } else {
         return break_[233];
      }
   }

   private boolean goto_() {
      return this.Bg().map(var1 -> ((rYB)this.throws_[7]).byte_(var1).break_() instanceof xb_3).orElse(false);
   }

   public float goto_(float var1) {
      this.private_();
      float var2 = (Float)this.private_[15] - (Float)this.private_[14];
      if (var2 < 0.0F) {
         var2++;
      }

      return (Float)this.private_[14] + var2 * var1;
   }

   public double goto_(an_3 var1) {
      double var2 = 1.0;
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
         rdn_3 var7 = this.class_(rXQ.HEAD);
         rdb_3 var5 = var7.break_();
         aI_2 var6 = var1.BC();
         if (var6 == aI_2.A && var5 == rdy_3.dh || var6 == aI_2.rs && var5 == rdy_3.dx || var6 == aI_2.volatile_ && var5 == rdy_3.dd) {
            var2 *= 0.5;
         }
      }

      return var2;
   }

   public rdn_3 case_(rdn_3 var1) {
      return rdn_3.break_;
   }

   private boolean case_(rye_3 var1) {
      an_3 var2 = var1.finally_();
      boolean var3 = false;
      if (var2 instanceof rhm_3 var4 && var4.package_() > 0) {
         var3 = true;
      }

      if (!var1.case_() && this.extends_(5) && !var3) {
         rjU_2 var7 = var1.return_();
         if (var7 != null) {
            rjU_2 var5 = this.break_(1.0F);
            rjU_2 var6 = var7.class_(this.Ps()).protected_();
            var6 = new rjU_2(var6.break_, 0.0, var6.protected_);
            return var6.break_(var5) < 0.0 ? true : break_[96];
         }
      }

      return break_[97];
   }

   public void case_(rfH_2 var1) {
      if (this.Pm()) {
         this.BH();
      }

      xc_3 var2 = ((rYB)this.throws_[7]).byte_(var1);
      if (var2.break_() instanceof xb_3) {
         ((rYB)this.throws_[7]).class_(var1, var2.class_(xb_3.final_, Boolean.valueOf(true)), 3);
      }

      this.class_(iM_2.SLEEPING);
      this.class_(var1);
      this.catch_(var1);
      this.byte_(rjU_2.class_);
      Boolean var7 = true;
      this.throws_[57] = var7;
   }

   private rdn_3 case_(rXQ var1) {
      this.private_();
      return (rdn_3)((rqs_3)this.private_[4]).get(var1.break_());
   }

   public void case_(iB_2 var1) {
   }

   private static void continue_() {
      native_ = new short[]{
         1,
         2,
         3,
         4,
         20,
         29,
         53,
         61,
         66,
         0,
         2,
         22,
         21,
         15,
         15,
         25,
         16,
         26,
         37,
         72,
         72,
         49,
         3,
         49,
         5,
         49,
         6,
         49,
         7,
         49,
         8,
         49,
         4,
         49,
         9,
         7,
         31,
         7,
         31,
         31,
         7,
         71,
         70,
         15,
         14,
         48,
         7,
         7,
         7,
         7,
         7,
         18,
         7,
         40,
         40,
         40,
         40,
         40,
         40,
         7,
         7,
         7,
         65,
         65,
         10,
         10,
         10,
         47,
         47,
         47,
         31,
         31,
         31,
         30,
         56,
         56,
         56,
         54,
         54,
         41,
         55,
         36,
         37,
         23,
         24,
         25,
         27,
         15,
         17,
         16,
         18,
         26,
         28,
         41,
         7,
         40,
         40,
         40,
         40,
         40,
         7,
         1,
         1,
         1,
         7,
         13,
         13,
         13,
         40,
         40,
         40,
         7,
         40,
         40,
         54,
         55,
         30,
         41,
         31,
         54,
         41,
         55,
         56,
         57,
         56,
         56,
         41,
         57,
         33,
         33,
         10,
         55,
         13,
         2,
         2,
         72,
         0,
         7,
         7,
         2,
         10,
         13,
         55,
         7,
         7,
         0,
         49,
         11,
         48,
         72,
         2,
         2,
         7,
         600,
         53,
         7,
         53,
         79,
         78,
         49,
         5,
         79,
         49,
         6,
         79,
         40,
         40,
         40,
         79,
         79,
         255,
         79,
         255,
         79,
         255,
         7,
         7,
         57,
         2,
         78,
         2,
         2,
         2,
         49,
         6,
         49,
         5,
         49,
         6,
         49,
         5,
         7,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         53,
         7,
         53,
         7,
         53,
         7,
         49,
         4,
         49,
         4,
         7,
         7,
         33,
         40,
         18,
         47,
         40,
         40,
         40,
         40,
         47,
         11,
         11,
         10,
         12,
         31,
         30,
         31,
         30,
         30,
         7,
         7,
         7,
         15,
         12,
         180,
         12,
         67,
         7,
         68,
         900,
         800,
         7,
         7,
         68,
         67,
         67,
         7,
         7,
         27,
         32,
         39,
         39,
         32,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         31,
         7,
         7,
         31,
         7,
         30,
         7,
         7,
         7,
         7,
         40,
         30,
         30,
         30,
         57,
         20,
         66,
         66,
         66,
         66,
         7,
         7,
         27,
         27,
         13,
         7,
         11,
         11,
         10,
         12,
         1,
         1,
         1,
         30,
         30,
         54,
         54,
         49,
         7,
         49,
         7,
         49,
         8,
         49,
         8,
         5,
         7,
         7,
         7,
         5,
         6,
         7,
         7,
         18,
         47,
         11,
         11,
         10,
         12,
         40,
         40,
         40,
         40,
         40,
         40,
         7,
         7,
         128,
         128,
         40,
         40,
         40,
         8,
         40,
         9,
         40,
         10,
         40,
         7,
         5,
         7,
         7,
         7,
         7,
         5,
         7,
         7,
         15,
         0,
         0,
         2,
         2,
         40,
         40,
         40,
         40,
         27,
         7,
         0,
         57,
         57,
         59,
         31,
         7,
         57,
         0,
         20,
         23,
         23,
         23,
         31,
         23,
         7,
         20,
         7,
         7,
         20,
         0,
         31,
         7,
         7,
         18,
         17,
         8,
         9,
         10,
         18,
         18,
         18,
         19,
         18,
         19,
         23,
         41,
         31,
         20,
         29,
         58,
         58,
         75,
         75,
         7,
         8,
         8,
         8,
         8,
         8,
         9,
         9,
         9,
         9,
         9,
         41,
         65,
         8,
         10,
         23,
         35,
         34,
         15,
         20,
         35,
         35,
         35,
         15,
         17,
         17,
         17,
         15,
         17,
         17,
         17,
         23,
         24,
         24,
         24,
         23,
         24,
         24,
         24,
         16,
         18,
         18,
         18,
         16,
         18,
         18,
         18,
         26,
         28,
         28,
         28,
         26,
         28,
         28,
         28,
         25,
         27,
         27,
         27,
         25,
         27,
         27,
         27,
         36,
         36,
         64,
         64,
         64,
         16,
         0,
         7,
         7,
         4,
         4,
         3,
         3,
         23,
         23,
         23,
         23,
         23,
         23,
         23,
         59,
         59,
         59,
         73,
         73,
         73,
         77,
         76,
         76,
         76,
         77,
         77,
         45,
         45,
         46,
         45,
         47,
         45,
         48,
         45,
         49,
         15,
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
         41,
         42,
         44,
         41,
         20,
         20,
         20,
         59,
         59,
         42,
         42,
         44,
         44,
         42,
         43,
         44,
         69,
         69,
         69,
         7,
         20,
         7,
         64,
         7,
         7,
         7,
         40,
         7,
         69,
         23,
         69,
         7,
         69,
         69,
         7,
         49,
         3,
         7,
         35,
         34,
         35,
         31,
         46,
         47,
         48,
         49,
         50,
         45,
         51,
         52,
         41,
         7,
         27,
         7,
         7,
         7,
         7,
         25,
         27,
         25,
         15,
         14,
         14,
         7,
         27,
         40,
         25,
         25,
         25,
         23,
         60,
         60,
         53,
         49,
         3,
         49,
         3,
         61,
         61,
         61,
         63,
         62,
         63,
         61,
         61,
         7,
         61,
         63,
         62,
         63,
         63,
         7,
         61,
         61,
         61,
         70,
         71,
         70,
         70,
         70,
         70,
         49,
         3,
         49,
         3,
         61,
         63,
         62,
         63,
         7,
         9,
         7,
         3,
         7,
         61,
         61,
         61,
         63,
         62,
         61,
         63,
         61,
         61,
         63,
         62,
         63,
         25,
         27,
         25,
         23,
         23,
         24,
         7,
         40,
         40,
         40,
         40,
         16,
         15,
         40,
         40,
         16,
         15,
         7,
         61,
         61,
         61,
         61,
         7,
         61,
         61,
         63,
         62,
         63,
         61,
         73,
         61,
         61,
         7,
         61,
         7,
         61,
         63,
         62,
         63,
         73,
         61,
         61,
         61,
         61,
         63,
         64,
         7,
         10,
         49,
         9,
         49,
         9,
         49,
         9,
         7,
         7,
         57,
         7,
         7,
         18,
         1,
         7,
         57,
         57,
         51,
         15,
         57,
         57,
         51,
         16,
         0,
         76,
         77,
         7,
         7,
         7,
         15,
         15,
         16,
         7,
         0
      };
   }

   private static int continue_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -995155577;
   }

   public void continue_(boolean var1) {
      this.private_();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(this);
      float var2;
      float var3;
      int var4;
      if (var1 && this == (cb_3)QY.instanceof_().class_[57]) {
         rrAS var5 = rrAS.class_(this.sO(), 10, 0.2F);
         if (var5.byte_()) {
            return;
         }

         var2 = var5.protected_();
         var3 = var5.class_();
         var4 = var5.break_();
      } else {
         var2 = this.sO();
         var3 = 0.2F;
         var4 = 10;
      }

      float var14 = this.ST();
      if (this.break_(rLD.private_)) {
         var14 += 0.1F * (float)(this.byte_(rLD.private_).byte_() + 1);
      }

      rjU_2 var6 = this.rv();
      this.catch_(var6.break_, (double)var14, var6.protected_);
      if (this.PF()) {
         float var7 = var2 * (float) (Math.PI / 180.0);
         this.byte_(this.rv().break_((double)(-rfU_2.class_(var7) * var3), 0.0, (double)(rfU_2.break_(var7) * var3)));
      }

      Boolean var12 = true;
      this.throws_[57] = var12;
      Integer var13 = var4;
      this.private_[59] = var13;
   }

   private void else_() {
      Map var1 = this.long_();
      if (var1 != null) {
         this.break_(var1);
         if (!var1.isEmpty()) {
            this.class_(var1);
         }
      }
   }

   public void else_(float var1) {
   }

   @Override
   public void implements_(float var1) {
      this.private_();
      Float var6 = var1;
      this.private_[25] = var6;
   }

   public int implements_(float var1, float var2) {
      rLY var3 = this.byte_(rLD.private_);
      float var4 = var3 == null ? 0.0F : (float)(var3.byte_() + 1);
      return rfU_2.case_((var1 - 3.0F - var4) * var2);
   }

   public static rjU_2 implements_(rjU_2 var0) {
      return new rjU_2(var0.break_, var0.byte_, 0.0);
   }

   private void implements_() {
      rdn_3 var1 = this.class_(rXQ.OFFHAND);
      this.class_(rXQ.OFFHAND, this.class_(rXQ.MAINHAND));
      this.class_(rXQ.MAINHAND, var1);
   }

   private static void instanceof_() {
      Object[] var0 = new Object[11];
      var0[0] = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
      var0[1] = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
      var0[2] = new ix_3((UUID)var0[0], "Sprinting speed boost", 0.3F, Enum.valueOf(id_3.class, "MULTIPLY_TOTAL"));
      var0[3] = rmE_2.class_(iB_2.class, ruw_3.class_);
      var0[4] = rmE_2.class_(iB_2.class, ruw_3.byte_);
      var0[5] = rmE_2.class_(iB_2.class, ruw_3.break_);
      var0[6] = rmE_2.class_(iB_2.class, ruw_3.implements_);
      var0[7] = rmE_2.class_(iB_2.class, ruw_3.break_);
      var0[8] = rmE_2.class_(iB_2.class, ruw_3.break_);
      var0[9] = rmE_2.class_(iB_2.class, ruw_3.volatile_);
      var0[10] = ap_3.byte_(-1.0842022E-19F, -1.0842022E-19F);
      catch_ = var0;
   }

   public void instanceof_(an_3 var1) {
      var1.byte_(this);
   }

   public int new_(int var1) {
      return Math.min(var1 + 4, this.ri());
   }

   private static void new_() {
      protected_ = new double[]{
         1.0,
         0.01F,
         (float) (Math.PI * 2),
         2.5,
         150.0,
         0.0,
         0.0,
         0.0,
         0.15F,
         0.0,
         0.0,
         0.0,
         0.0,
         0.5,
         0.1,
         0.5,
         -0.2,
         0.1,
         -0.2,
         0.02,
         0.02,
         0.02,
         1.0,
         1.0,
         255.0,
         255.0,
         255.0,
         0.5,
         0.5,
         1.0,
         0.8,
         0.7,
         0.5,
         1.0E-4,
         0.01,
         0.01,
         180.0F / (float)Math.PI,
         2.0,
         0.0,
         0.0,
         1.0,
         0.0,
         2.0,
         0.4,
         2.0,
         2.0,
         0.2F,
         127.0,
         0.5,
         2.0,
         0.5,
         2.0,
         0.0,
         0.0,
         -0.04F,
         0.0,
         0.0,
         0.04F,
         0.0,
         0.08,
         0.0,
         0.01,
         0.2,
         0.8F,
         0.6F,
         0.3F,
         0.5,
         0.8F,
         0.5,
         0.5,
         0.0,
         4.0,
         0.0,
         0.6F,
         0.3F,
         -0.5,
         1.0,
         0.4,
         0.0,
         -1.0,
         0.75,
         0.0,
         0.0,
         0.0,
         -0.1,
         0.0,
         0.04,
         3.2,
         0.0,
         0.1,
         0.0,
         0.1,
         0.99F,
         0.98F,
         0.99F,
         10.0,
         3.0,
         0.05,
         0.2,
         0.0,
         -0.1,
         0.0,
         0.98F,
         0.0,
         0.2,
         0.005,
         0.003,
         16.0,
         0.003,
         -0.003,
         16.0,
         -0.15F,
         0.15F,
         -0.15F,
         0.15F,
         -0.15F,
         0.0,
         0.0,
         0.98,
         0.003,
         0.0,
         0.003,
         0.0,
         0.003,
         0.0,
         0.0,
         -0.2,
         0.0,
         0.5,
         0.1,
         0.1,
         0.1,
         0.0,
         0.6,
         0.3,
         0.5,
         0.3,
         0.6,
         0.05,
         1.0,
         0.0,
         0.5,
         0.6875,
         0.5,
         0.5,
         0.5,
         0.5,
         180.0F / (float)Math.PI,
         90.0,
         0.5,
         0.1,
         0.5,
         0.3F,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0
      };
   }

   public void package_(int var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)catch_[8], var1);
   }

   private static void package_() {
      implements_ = new float[]{
         0.02F,
         12398.0F,
         0.6F,
         Float.MAX_VALUE,
         1.0F,
         0.0F,
         3.0F,
         3.0F,
         0.2F,
         15.0F,
         1.0F,
         2.0F,
         0.4F,
         0.9F,
         0.6F,
         0.0F,
         0.6F,
         0.4F,
         1.0F,
         0.03F,
         1.0F,
         0.35F,
         0.04F,
         0.5F,
         1.0F,
         1.0F,
         1.0F,
         0.1F,
         0.1F,
         0.0F,
         0.0F,
         0.0F,
         4.0F,
         2.0F,
         0.75F,
         0.0F,
         0.0F,
         0.0F,
         1.5F,
         10.0F,
         0.0F,
         0.0F,
         0.4F,
         0.0F,
         0.0F,
         3.4028235E37F,
         10.0F,
         0.5F,
         1.0F,
         1.0F,
         0.8F,
         0.8F,
         0.4F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         3.0F,
         0.5F,
         0.75F,
         0.0F,
         25.0F,
         0.0F,
         0.0F,
         3.4028235E37F,
         10.0F,
         10.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         3.4028235E37F,
         10.0F,
         0.0F,
         6.0F,
         2.0F,
         1.5F,
         0.0F,
         0.2F,
         1.0F,
         0.2F,
         1.0F,
         0.0F,
         0.2F,
         1.0F,
         0.0F,
         1.0F,
         0.8F,
         0.4F,
         0.8F,
         0.8F,
         0.4F,
         0.5F,
         0.2F,
         0.5F,
         0.2F,
         0.5F,
         0.2F,
         4.0F,
         0.0F,
         1.0F,
         0.2F,
         1.5F,
         0.2F,
         1.0F,
         0.42F,
         0.2F,
         0.2F,
         0.1F,
         (float) (Math.PI / 180.0),
         0.8F,
         0.0F,
         0.9F,
         0.54600006F,
         0.02F,
         0.02F,
         3.0F,
         3.0F,
         0.5F,
         0.0F,
         3.0F,
         3.0F,
         0.96F,
         0.02F,
         1.0F,
         (float) (Math.PI / 180.0),
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         0.91F,
         0.91F,
         0.0F,
         4.0F,
         1.0F,
         1.0F,
         0.4F,
         0.0F,
         0.21600002F,
         0.0F,
         0.0F,
         0.0025000002F,
         1.0F,
         3.0F,
         180.0F / (float)Math.PI,
         90.0F,
         95.0F,
         265.0F,
         180.0F,
         0.0F,
         0.0F,
         0.3F,
         -180.0F,
         360.0F,
         180.0F,
         360.0F,
         -180.0F,
         360.0F,
         180.0F,
         360.0F,
         -180.0F,
         360.0F,
         180.0F,
         360.0F,
         -180.0F,
         360.0F,
         180.0F,
         360.0F,
         -180.0F,
         360.0F,
         180.0F,
         360.0F,
         0.0F,
         0.3F,
         -90.0F,
         90.0F,
         -75.0F,
         -75.0F,
         75.0F,
         75.0F,
         2500.0F,
         0.2F,
         -1.0F,
         0.0F,
         0.0F,
         0.98F,
         0.98F,
         1.0F,
         6.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         0.09F,
         0.0F,
         0.09F,
         0.5F,
         0.1F,
         0.9F,
         0.5F,
         0.5F,
         0.2F,
         1.0F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         0.2F,
         1.0F,
         1.0F,
         0.4F,
         0.0F,
         0.2F,
         0.2F,
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

   public boolean return_() {
      return (((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)catch_[3]) & 1) > 0 ? true : break_[211];
   }

   public void return_(float var1) {
      this.private_();
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      Float var6 = var1;
      this.private_[60] = var6;
   }

   public void super_(float var1) {
      this.private_();
      Float var6 = var1;
      this.private_[58] = var6;
   }

   public void super_(boolean var1) {
      this.private_();
      Boolean var6 = var1;
      this.private_[41] = var6;
   }

   private void super_() {
      this.private_();
      boolean var1 = this.finally_(7);
      if (var1 && !(Boolean)this.throws_[20] && !this.Pm() && !this.break_(rLD.goto_)) {
         rdn_3 var2 = this.class_(rXQ.CHEST);
         if (var2.break_() == rdy_3.kc && rxH_2.protected_(var2)) {
            var1 = true;
            if (!((rYB)this.throws_[7]).continue_ && ((Integer)this.private_[64] + 1) % 20 == 0) {
               var2.class_(1, this, var0 -> var0.break_(rXQ.CHEST));
            }
         } else {
            var1 = break_[182];
         }
      } else {
         var1 = break_[183];
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.break_(7, var1);
      }
   }

   public PX switch_() {
      return this.rO();
   }

   public void throw_() {
      this.private_();
      if (!((rYB)this.throws_[7]).continue_) {
         this.byte_(1, false);
      }

      rdn_3 var5 = rdn_3.break_;
      this.private_[61] = var5;
      Integer var6 = (Integer)this.private_[63];
      this.private_[62] = var6;
      Integer var7 = 0;
      this.private_[63] = var7;
      Integer var8 = 0;
      this.private_[73] = var8;
   }

   public void try_(an_3 var1) {
      this.private_();
      if (var1 instanceof iB_2 var6) {
         this.private_[56] = var6;
      } else {
         Object var7 = null;
         this.private_[56] = var7;
      }

      Integer var8 = (Integer)this.throws_[41];
      this.private_[57] = var8;
   }

   public boolean try_() {
      return !((rYB)this.throws_[7]).continue_ ? true : break_[201];
   }

   public boolean while_() {
      return this.throws_[41] % 5 == 0 && this.rv().break_ != 0.0 && this.rv().protected_ != 0.0 && !this.native_() && eA_2.finally_(this) && this.Be()
         ? true
         : break_[19];
   }

   public boolean while_(an_3 var1) {
      rjU_2 var2 = new rjU_2(this.rx(), this.rH(), this.BO());
      rjU_2 var3 = new rjU_2(var1.rx(), var1.rH(), var1.BO());
      return ((rYB)this.throws_[7]).class_(new rjB_2(var2, var3, rjS_2.COLLIDER, rjs_3.NONE, this)).byte_() == rjM_2.MISS ? true : break_[197];
   }

   private static void static_() {
      break_ = new boolean[]{
         true,
         true,
         true,
         false,
         false,
         false,
         false,
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
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
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
         true,
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
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
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
         false,
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
         false,
         true,
         false,
         true,
         false,
         true,
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
         true,
         false,
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
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
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
         false,
         true,
         false,
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
         false
      };
   }

   public void public_(float var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Float>)catch_[4], rfU_2.class_(var1, 0.0F, this.SK()));
   }

   private static void public_() {
      extends_ = new long[]{40L, 0L};
   }

   public boolean public_(an_3 var1) {
      this.try_(var1);
      return false;
   }

   private rdn_3 protected_(rXQ var1) {
      this.private_();
      return (rdn_3)((rqs_3)this.private_[3]).get(var1.break_());
   }

   public void protected_(float var1) {
      float var2 = this.Ss();
      if (var2 > 0.0F) {
         this.public_(var2 + var1);
      }
   }

   public boolean protected_(rLR var1) {
      rLY var2 = this.class_(var1);
      if (var2 != null) {
         this.class_(var2);
         return true;
      } else {
         return break_[67];
      }
   }

   public void protected_(rLY var1) {
      this.private_();
      Boolean var6 = true;
      this.private_[53] = var6;
      if (!((rYB)this.throws_[7]).continue_) {
         var1.class_().break_(this, this.BT(), var1.byte_());
      }

      rrLC.break_(this, var1);
   }

   public void protected_(iB_2 var1) {
      var1.throws_(this);
   }

   public float protected_(rye_3 var1, float var2) {
      if (!var1.case_()) {
         this.byte_(var1, var2);
         var2 = ryg_3.class_(var2, (float)this.Bq(), (float)this.class_(iQ_2.finally_));
      }

      return var2;
   }

   public void protected_(rye_3 var1) {
      this.private_();
      an_3 var2 = var1.extends_();
      int var3;
      if (var2 instanceof rhd_3) {
         var3 = eA_2.catch_((iB_2)var2);
      } else {
         var3 = break_[102];
      }

      boolean var4 = this.private_[31] > 0 ? true : break_[104];
      if (this.SX() && ((rYB)this.throws_[7]).B().break_(rRu_1.throws_)) {
         this.class_(var1, var4);
         this.class_(var1, var3, var4);
      }

      this.Sx();
      this.Sf();
   }

   public rdn_3 protected_(rpm_3 var1) {
      if (var1 == rpm_3.MAIN_HAND) {
         return this.class_(rXQ.MAINHAND);
      } else if (var1 == rpm_3.OFF_HAND) {
         return this.class_(rXQ.OFFHAND);
      } else {
         throw new IllegalArgumentException("Invalid hand " + var1);
      }
   }

   public rqA_2 protected_(rdn_3 var1) {
      return var1.void_();
   }

   private void private_() {
      if (this.private_ == null) {
         this.private_ = new Object[80];
         Object[] var1 = this.private_;
         var1[5] = false;
         var1[7] = 0;
         var1[8] = 0;
         var1[9] = 0;
         var1[10] = 0;
         var1[11] = 0;
         var1[12] = 0.0F;
         var1[13] = 0;
         var1[14] = 0.0F;
         var1[15] = 0.0F;
         var1[16] = 0;
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
         var1[31] = 0;
         var1[32] = false;
         var1[33] = 0;
         var1[34] = 0.0F;
         var1[35] = 0.0F;
         var1[36] = 0.0F;
         var1[37] = 0.0F;
         var1[38] = 0.0F;
         var1[39] = 0;
         var1[40] = 0.0F;
         var1[41] = false;
         var1[42] = 0.0F;
         var1[43] = 0.0F;
         var1[44] = 0.0F;
         var1[45] = 0;
         var1[46] = 0.0;
         var1[47] = 0.0;
         var1[48] = 0.0;
         var1[49] = 0.0;
         var1[50] = 0.0;
         var1[51] = 0.0;
         var1[52] = 0;
         var1[53] = false;
         var1[55] = 0;
         var1[57] = 0;
         var1[58] = 0.0F;
         var1[59] = 0;
         var1[60] = 0.0F;
         var1[62] = 0;
         var1[63] = 0;
         var1[64] = 0;
         var1[68] = 0L;
         var1[69] = 0;
         var1[70] = 0.0F;
         var1[71] = 0.0F;
         var1[73] = 0;
         var1[74] = 0;
         var1[75] = false;
         var1[76] = 0;
         var1[77] = 0;
         var1[78] = 0;
         var1[79] = 0;
      }
   }

   public void private_(rjU_2 var1) {
      if (this.try_() || this.Po()) {
         double var2 = protected_[59];
         boolean var4 = this.rv().byte_ <= 0.0 ? true : break_[147];
         if (var4 && this.break_(rLD.instanceof_)) {
            var2 = 0.01;
            Float var25 = 0.0F;
            this.throws_[31] = var25;
         }

         rXE var5 = ((rYB)this.throws_[7]).break_(this.Bs());
         if (this.rT() && this.sr() && !this.class_(var5.class_())) {
            double var31 = this.re();
            int var36 = eA_2.throws_(this);
            float var38 = 0.9F;
            float var39 = 0.54600006F;
            float var40 = 0.02F;
            if (this == (cb_3)QY.instanceof_().class_[57]) {
               rrLd_1 var41 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLd_1.class_(0.02F, var36));
               var40 = var41.break_();
               var36 = var41.class_();
            }

            float var42 = this.PF() ? var38 : this.Bf();
            float var43 = var40;
            float var14 = (float)var36;
            if (var14 > 3.0F) {
               var14 = 3.0F;
            }

            if (!(Boolean)this.throws_[20]) {
               var14 *= 0.5F;
            }

            if (var14 > 0.0F) {
               var42 += (var39 - var42) * var14 / 3.0F;
               var43 = var40 + (this.sB() - var40) * var14 / 3.0F;
            }

            if (this.break_(rLD.interface_)) {
               var42 = 0.96F;
            }

            this.class_(var43, var1);
            this.class_(iG_2.SELF, this.rv());
            rjU_2 var45 = this.rv();
            if ((Boolean)this.throws_[23] && this.o_()) {
               var45 = new rjU_2(var45.break_, 0.2, var45.protected_);
            }

            this.byte_(var45.throws_((double)var42, 0.8F, (double)var42));
            rjU_2 var48 = this.class_(var2, var4, this.rv());
            this.byte_(var48);
            if ((Boolean)this.throws_[23] && this.finally_(var48.break_, var48.byte_ + 0.6F - this.re() + var31, var48.protected_)) {
               this.catch_(var48.break_, 0.3F, var48.protected_);
            }
         } else if (this.ry() && this.sr() && !this.class_(var5.class_())) {
            double var30 = this.re();
            this.class_(0.02F, var1);
            this.class_(iG_2.SELF, this.rv());
            if (this.break_(rlG_2.byte_) <= this.rI()) {
               this.byte_(this.rv().throws_(0.5, 0.8F, 0.5));
               rjU_2 var34 = this.class_(var2, var4, this.rv());
               this.byte_(var34);
            } else {
               this.byte_(this.rv().class_(0.5));
            }

            if (!this.rw()) {
               this.byte_(this.rv().break_(0.0, -var2 / 4.0, 0.0));
            }

            rjU_2 var35 = this.rv();
            if ((Boolean)this.throws_[23] && this.finally_(var35.break_, var35.byte_ + 0.6F - this.re() + var30, var35.protected_)) {
               this.catch_(var35.break_, 0.3F, var35.protected_);
            }
         } else if (this.Sy()) {
            rjU_2 var6 = this.rv();
            if (var6.byte_ > -0.5) {
               Float var26 = 1.0F;
               this.throws_[31] = var26;
            }

            rjU_2 var7 = this.m();
            float var8 = this.Bo() * (float) (Math.PI / 180.0);
            double var9 = Math.sqrt(var7.break_ * var7.break_ + var7.protected_ * var7.protected_);
            double var11 = Math.sqrt(case_(var6));
            double var13 = var7.case_();
            float var15 = rfU_2.break_(var8);
            var15 = (float)((double)var15 * (double)var15 * Math.min(1.0, var13 / 0.4));
            var6 = this.rv().break_(0.0, var2 * (-1.0 + (double)var15 * 0.75), 0.0);
            if (var6.byte_ < 0.0 && var9 > 0.0) {
               double var16 = var6.byte_ * -0.1 * (double)var15;
               var6 = var6.break_(var7.break_ * var16 / var9, var16, var7.protected_ * var16 / var9);
            }

            if (var8 < 0.0F && var9 > 0.0) {
               double var46 = var11 * (double)(-rfU_2.class_(var8)) * 0.04;
               var6 = var6.break_(-var7.break_ * var46 / var9, var46 * 3.2, -var7.protected_ * var46 / var9);
            }

            if (var9 > 0.0) {
               var6 = var6.break_((var7.break_ / var9 * var11 - var6.break_) * 0.1, 0.0, (var7.protected_ / var9 * var11 - var6.protected_) * 0.1);
            }

            this.byte_(var6.throws_(0.99F, 0.98F, 0.99F));
            this.class_(iG_2.SELF, this.rv());
            if ((Boolean)this.throws_[23] && !((rYB)this.throws_[7]).continue_) {
               double var47 = Math.sqrt(case_(this.rv()));
               double var18 = var11 - var47;
               float var20 = (float)(var18 * 10.0 - 3.0);
               if (var20 > 0.0F) {
                  this.class_(this.byte_((int)var20), 1.0F, 1.0F);
                  this.break_(rye_3.native_, var20);
               }
            }

            if ((Boolean)this.throws_[20] && !((rYB)this.throws_[7]).continue_) {
               this.break_(7, false);
            }
         } else {
            rfH_2 var29 = this.PI();
            float var32 = ((rYB)this.throws_[7]).byte_(var29).break_().final_();
            float var33 = this.throws_[20] ? var32 * 0.91F : implements_[132];
            rjU_2 var37 = this.break_(var1, var32);
            double var10 = var37.byte_;
            if (this.break_(rLD.goto_)) {
               double var12 = 0.05;
               if (this instanceof cb_3) {
                  var12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAs_1.class_(this.byte_(rLD.goto_), var12)).break_();
               }

               var10 += (var12 * (double)(this.byte_(rLD.goto_).byte_() + 1) - var37.byte_) * 0.2;
               Float var27 = 0.0F;
               this.throws_[31] = var27;
            } else if (((rYB)this.throws_[7]).continue_ && !((rYB)this.throws_[7]).int_(var29)) {
               if (this.re() > 0.0) {
                  var10 = -0.1;
               } else {
                  var10 = protected_[101];
               }
            } else if (!this.rw()) {
               var10 -= var2;
            }

            this.catch_(var37.break_ * (double)var33, var10 * 0.98F, var37.protected_ * (double)var33);
         }
      }

      this.class_(this, this instanceof rMm_1);
   }

   private void final_() {
      this.private_();
      if (this.return_()) {
         rpm_3 var1 = this.P();
         rdn_3 var2 = this.protected_(var1);
         if (!((rdn_3)this.private_[61]).class_() && !rdn_3.protected_(var2, (rdn_3)this.private_[61])) {
            this.throw_();
         } else {
            if (((rdn_3)this.private_[61]).class_()) {
               Integer var7 = (Integer)this.private_[63];
               this.private_[62] = var7;
               Integer var8 = var2.extends_();
               this.private_[63] = var8;
            }

            this.private_[61] = var2;
            ((rdn_3)this.private_[61]).break_((rYB)this.throws_[7], this, this.SH());
            if (this.char_()) {
               this.class_((rdn_3)this.private_[61], 5);
            }

            Integer var10 = (Integer)this.private_[63];
            this.private_[62] = var10;
            int var10002 = (Integer)this.private_[63] - 1;
            Integer var11 = var10002;
            this.private_[63] = var11;
            if (var10002 == 0 && !((rYB)this.throws_[7]).continue_ && !((rdn_3)this.private_[61]).volatile_()) {
               this.sP();
            }
         }
      }
   }

   public int final_(int var1) {
      int var2 = eA_2.protected_(this);
      return var2 > 0 && ((Random)this.throws_[40]).nextInt(var2 + 1) > 0 ? var1 : var1 - 1;
   }

   public boolean transient_() {
      return this.h();
   }

   public void volatile_(int var1) {
      this.private_();
      Integer var6 = var1;
      this.private_[69] = var6;
      if (!((rYB)this.throws_[7]).continue_) {
         this.byte_(4, true);
      }
   }

   public float synchronized_(float var1) {
      this.private_();
      return rfU_2.catch_(var1, (Float)this.private_[71], (Float)this.private_[70]);
   }

   @Override
   public void native_(float var1) {
      this.private_();
      Float var6 = var1;
      this.private_[23] = var6;
   }

   public void native_(int var1) {
      this.private_();
      Integer var6 = var1;
      this.private_[33] = var6;
   }

   public boolean sr() {
      return true;
   }

   @Override
   public void A() {
      this.private_();
      super.A();
      Float var5 = (Float)this.private_[35];
      this.private_[34] = var5;
      Float var6 = 0.0F;
      this.private_[35] = var6;
      Float var7 = 0.0F;
      this.throws_[31] = var7;
   }

   public int SH() {
      this.private_();
      return (Integer)this.private_[63];
   }

   public void Q() {
   }

   @Override
   public float rq() {
      return this.Be() && eA_2.class_(eY_2.native_, this) > 0 ? 1.0F : super.rq();
   }

   public boolean SG() {
      return false;
   }

   @Override
   public void Pn() {
      this.private_();
      Float var15 = (Float)this.private_[15];
      this.private_[14] = var15;
      if ((Boolean)this.throws_[48]) {
         this.Bg().ifPresent(this::class_);
      }

      if (this.while_()) {
         this.Sv();
      }

      super.Pn();
      boolean var1 = this instanceof rhd_3;
      if (this.BM()) {
         if (this.Bz()) {
            this.break_(rye_3.case_, 1.0F);
         } else if (var1 && !((rYB)this.throws_[7]).instanceof_().class_(this.rN())) {
            double var2 = ((rYB)this.throws_[7]).instanceof_().class_(this) + ((rYB)this.throws_[7]).instanceof_().final_();
            if (var2 < 0.0) {
               double var4 = ((rYB)this.throws_[7]).instanceof_().package_();
               if (var4 > 0.0) {
                  this.break_(rye_3.case_, (float)Math.max(1, rfU_2.byte_(-var2 * var4)));
               }
            }
         }
      }

      if (this.q() || ((rYB)this.throws_[7]).continue_) {
         this.rE();
      }

      boolean var28 = var1 && ((rhx_3)((rhd_3)this).implements_[18]).class_ ? true : break_[12];
      if (this.BM()) {
         if (this.class_(rlG_2.break_) && !((rYB)this.throws_[7]).byte_(new rfH_2(this.rx(), this.rH(), this.BO())).class_(xu_3.hM)) {
            if (!this.SO() && !rLK.byte_(this) && !var28) {
               this.throws_(this.final_(this.PA()));
               if (this.PA() == -20) {
                  this.throws_(0);
                  rjU_2 var3 = this.rv();

                  for (int var30 = 0; var30 < 8; var30++) {
                     double var5 = ((Random)this.throws_[40]).nextDouble() - ((Random)this.throws_[40]).nextDouble();
                     double var7 = ((Random)this.throws_[40]).nextDouble() - ((Random)this.throws_[40]).nextDouble();
                     double var9 = ((Random)this.throws_[40]).nextDouble() - ((Random)this.throws_[40]).nextDouble();
                     ((rYB)this.throws_[7]).class_(rLQ.throws_, this.rx() + var5, this.re() + var7, this.BO() + var9, var3.break_, var3.byte_, var3.protected_);
                  }

                  this.break_(rye_3.private_, 2.0F);
               }
            }

            if (!((rYB)this.throws_[7]).continue_ && this.Pm() && this.ra() != null && !this.ra().PH()) {
               this.BH();
            }
         } else if (this.PA() < this.ri()) {
            this.throws_(this.new_(this.PA()));
         }

         if (!((rYB)this.throws_[7]).continue_) {
            rfH_2 var29 = this.Bs();
            if (!Objects.equal((rfH_2)this.private_[65], var29)) {
               this.private_[65] = var29;
               this.throws_(var29);
            }
         }
      }

      if (this.BM() && this.Pk()) {
         this.rE();
      }

      if ((Integer)this.private_[10] > 0) {
         Integer var17 = (Integer)this.private_[10] - 1;
         this.private_[10] = var17;
      }

      if ((Integer)this.throws_[47] > 0 && !(this instanceof rhN_2)) {
         Integer var18 = (Integer)this.throws_[47] - 1;
         this.throws_[47] = var18;
      }

      if (this.Sl()) {
         this.St();
      }

      if ((Integer)this.private_[31] > 0) {
         Integer var19 = (Integer)this.private_[31] - 1;
         this.private_[31] = var19;
      } else {
         Object var20 = null;
         this.private_[30] = var20;
      }

      if ((iB_2)this.private_[56] != null && !((iB_2)this.private_[56]).BM()) {
         Object var21 = null;
         this.private_[56] = var21;
      }

      if ((iB_2)this.private_[54] != null) {
         if (!((iB_2)this.private_[54]).BM()) {
            this.break_(null);
         } else if ((Integer)this.throws_[41] - (Integer)this.private_[55] > 100) {
            this.break_(null);
         }
      }

      this.Sk();
      Float var22 = (Float)this.private_[36];
      this.private_[37] = var22;
      Float var23 = (Float)this.private_[23];
      this.private_[24] = var23;
      Float var24 = (Float)this.private_[25];
      this.private_[27] = var24;
      Float var25 = (Float)this.throws_[15];
      this.throws_[17] = var25;
      Float var26 = (Float)this.throws_[16];
      this.throws_[18] = var26;
      Float var27 = (Float)this.private_[26];
      this.private_[28] = var27;
   }

   @Override
   public boolean PH() {
      return false;
   }

   @Override
   public boolean rJ() {
      return this.D();
   }

   @Override
   public boolean rG() {
      return this.BM() && !this.native_() && !this.o_() ? true : break_[205];
   }

   @Override
   public rfl_3 PE() {
      return this.class_(rXQ.HEAD).break_() == rdy_3.dk ? this.rN().byte_(0.5, 0.5, 0.5) : super.PE();
   }

   @Override
   public boolean rP() {
      return !super.rP() && (this.Sy() || this.Pb() != iM_2.FALL_FLYING) ? break_[235] : break_[234];
   }

   @Override
   public void rF() {
      this.private_();
      Integer var5 = 10;
      this.private_[11] = var5;
      Integer var6 = (Integer)this.private_[11];
      this.private_[10] = var6;
      Float var7 = 0.0F;
      this.private_[12] = var7;
   }

   @Override
   public boolean rY() {
      return !this.throws_[27] ? true : break_[203];
   }

   @Override
   public void PQ() {
      this.break_(rye_3.volatile_, 4.0F);
   }

   @Override
   public boolean Pu() {
      this.private_();
      return !this.throws_[27] && this.private_[13] == 0 ? true : break_[116];
   }

   public int Bj() {
      this.private_();
      return (Integer)this.private_[77];
   }

   @Override
   public abstract Iterable<rdn_3> PV();

   public boolean BR() {
      return this.sG() == aL_2.break_ ? true : break_[65];
   }

   public ImmutableList<iM_2> BV() {
      return ImmutableList.of(iM_2.STANDING);
   }

   public int BY() {
      return ((rmE_2)this.throws_[49]).<Integer>class_((rut_3<Integer>)catch_[7]);
   }

   public boolean BK() {
      return this.Sl();
   }

   public rpr_3 Bi() {
      rfH_2 var1 = this.Bg().orElse(null);
      return var1 != null ? xb_3.class_((rYB)this.throws_[7], var1) : null;
   }

   public iB_2 Sr() {
      this.private_();
      return (iB_2)this.private_[54];
   }

   public float Bp() {
      Iterable var1 = this.PV();
      int var2 = 0;
      int var3 = 0;

      for (rdn_3 var5 : var1) {
         if (!var5.class_()) {
            var3++;
         }

         var2++;
      }

      return var2 > 0 ? (float)var3 / (float)var2 : implements_[100];
   }

   public void Bw() {
      ((rmE_2)this.throws_[49]).break_((rut_3<Boolean>)catch_[6], false);
      ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)catch_[5], 0);
   }

   @Override
   public boolean BM() {
      return !this.throws_[27] && this.Ss() > 0.0F ? true : break_[114];
   }

   public Optional<rfH_2> Bg() {
      return ((rmE_2)this.throws_[49]).class_((rut_3<Optional<rfH_2>>)catch_[9]);
   }

   public boolean Be() {
      return ((rYB)this.throws_[7]).byte_(this.PI()).class_(rls_3.Z);
   }

   public void Ba() {
      if (!this.Pl().catch_()) {
         int var1 = eA_2.class_(eY_2.native_, this);
         if (var1 > 0 && this.Be()) {
            ic_3 var2 = this.byte_(iQ_2.protected_);
            if (var2 == null) {
               return;
            }

            var2.break_(new ix_3((UUID)catch_[1], "Soul speed boost", (double)(0.03F * (1.0F + (float)var1 * 0.35F)), id_3.ADDITION));
            if (this.Sa().nextFloat() < 0.04F) {
               rdn_3 var3 = this.class_(rXQ.FEET);
               var3.class_(1, this, var0 -> var0.break_(rXQ.FEET));
            }
         }
      }
   }

   public Optional<rfH_2> SP() {
      this.private_();
      return (Optional<rfH_2>)this.private_[66];
   }

   public float Ss() {
      return ((rmE_2)this.throws_[49]).<Float>class_((rut_3<Float>)catch_[4]);
   }

   @Override
   public void BH() {
      an_3 var1 = this.ra();
      super.BH();
      if (var1 != null && var1 != this.ra() && !((rYB)this.throws_[7]).continue_) {
         this.class_(var1);
      }
   }

   public rqA_2 Bt() {
      return rqn_3.Sj;
   }

   public int BI() {
      this.private_();
      return (Integer)this.private_[33];
   }

   public float Bf() {
      return 0.8F;
   }

   public boolean BU() {
      return false;
   }

   @Override
   public boolean Bz() {
      return !this.Sc() && super.Bz() ? true : break_[249];
   }

   public float Bo() {
      QY var1 = QY.instanceof_();
      if (this == (cb_3)var1.class_[57]) {
         t_1 var2 = (t_1)((cb_3)var1.class_[57]).break_[51];
         if (var2 != null) {
            return var2.class_().protected_();
         }
      }

      return (Float)this.throws_[16];
   }

   public rqO_2 By() {
      return this.BC().finally_();
   }

   public ik_3 BT() {
      this.private_();
      return (ik_3)this.private_[0];
   }

   public int Bq() {
      return rfU_2.byte_(this.class_(iQ_2.implements_));
   }

   public void SB() {
      ((rmE_2)this.throws_[49]).break_((rut_3<Optional>)catch_[9], Optional.empty());
   }

   public void SS() {
      List var1 = ((rYB)this.throws_[7]).break_(this, this.rN(), rpJ_2.class_(this));
      if (!var1.isEmpty()) {
         int var2 = ((rYB)this.throws_[7]).B().byte_(rRu_1.super_);
         if (var2 > 0 && var1.size() > var2 - 1 && ((Random)this.throws_[40]).nextInt(4) == 0) {
            int var3 = 0;

            for (int var4 = 0; var4 < var1.size(); var4++) {
               if (!((an_3)var1.get(var4)).Pm()) {
                  var3++;
               }
            }

            if (var3 > var2 - 1) {
               this.break_(rye_3.catch_, 6.0F);
            }
         }

         for (int var5 = break_[188]; var5 < var1.size(); var5++) {
            an_3 var6 = (an_3)var1.get(var5);
            this.instanceof_(var6);
         }
      }
   }

   public void Sf() {
      this.private_();
      if (!((rYB)this.throws_[7]).continue_ && (this.SG() || (Integer)this.private_[31] > 0 && this.Sp() && ((rYB)this.throws_[7]).B().break_(rRu_1.throws_))) {
         int var1 = this.byte_((rhd_3)this.private_[30]);

         while (var1 > 0) {
            int var2 = rsP_2.class_(var1);
            var1 -= var2;
            ((rYB)this.throws_[7]).a_(new rsP_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), var2));
         }
      }
   }

   public boolean Sy() {
      return this.finally_(7);
   }

   public void Sj() {
   }

   public float sB() {
      this.private_();
      return (Float)this.private_[58];
   }

   public void sE() {
      this.private_();
      Boolean var5 = true;
      this.private_[53] = var5;
   }

   public rdn_3 sX() {
      this.private_();
      return (rdn_3)this.private_[61];
   }

   public boolean Sp() {
      return !this.n_() ? true : break_[29];
   }

   public float SN() {
      return this.n_()
         ? (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.5F
         : (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F;
   }

   public float sO() {
      QY var1 = QY.instanceof_();
      if (this == (cb_3)var1.class_[57]) {
         t_1 var2 = (t_1)((cb_3)var1.class_[57]).break_[51];
         if (var2 != null) {
            return var2.class_().throws_();
         }
      }

      return (Float)this.throws_[15];
   }

   public void SC() {
      this.private_();
      if (!((rdn_3)this.private_[61]).class_()) {
         ((rdn_3)this.private_[61]).class_((rYB)this.throws_[7], this, this.SH());
         if (((rdn_3)this.private_[61]).volatile_()) {
            this.final_();
         }
      }

      this.throw_();
   }

   public float ST() {
      return 0.42F * this.rl();
   }

   public Random Sa() {
      return (Random)this.throws_[40];
   }

   public void sM() {
      if (!this.BF()) {
         int var1 = rfU_2.byte_(this.rx());
         int var2 = rfU_2.byte_(this.re() - 0.2F);
         int var3 = rfU_2.byte_(this.BO());
         xc_3 var4 = ((rYB)this.throws_[7]).byte_(new rfH_2(var1, var2, var3));
         if (!var4.catch_()) {
            zr_3 var5 = var4.package_();
            this.class_(var5.catch_(), var5.class_() * 0.5F, var5.break_() * 0.75F);
         }
      }
   }

   public boolean SL() {
      return true;
   }

   public iZ_2<?> SF() {
      this.private_();
      return (iZ_2<?>)this.private_[72];
   }

   public aL_2 sG() {
      return aL_2.class_;
   }

   public float SR() {
      return this.n_() ? 0.5F : implements_[24];
   }

   public iB_2 Sh() {
      this.private_();
      if (((ryR_2)this.private_[1]).byte_() != null) {
         return ((ryR_2)this.private_[1]).byte_();
      } else if ((rhd_3)this.private_[30] != null) {
         return (rhd_3)this.private_[30];
      } else {
         return (iB_2)this.private_[54] != null ? (iB_2)this.private_[54] : null;
      }
   }

   public int SE() {
      this.private_();
      return (Integer)this.private_[57];
   }

   public boolean SX() {
      return !this.n_() ? true : break_[31];
   }

   public void Sx() {
   }

   public rye_3 SJ() {
      this.private_();
      if (((rYB)this.throws_[7]).r() - (Long)this.private_[68] > 40L) {
         Object var5 = null;
         this.private_[67] = var5;
      }

      return (rye_3)this.private_[67];
   }

   public void St() {
      this.private_();
      Integer var12 = (Integer)this.private_[13] + 1;
      this.private_[13] = var12;
      if ((Integer)this.private_[13] == 20) {
         this.PD();

         for (int var1 = 0; var1 < 20; var1++) {
            double var2 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var4 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var6 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            ((rYB)this.throws_[7]).class_(rLQ.boolean_, this.break_(1.0), this.Ph(), this.protected_(1.0), var2, var4, var6);
         }
      }
   }

   public abstract rpZ_2 Su();

   public void SI() {
      ic_3 var1 = this.byte_(iQ_2.protected_);
      if (var1 != null && var1.class_((UUID)catch_[1]) != null) {
         var1.break_((UUID)catch_[1]);
      }
   }

   public float SK() {
      return (float)this.class_(iQ_2.class_);
   }

   public rdn_3 Sn() {
      return this.class_(rXQ.OFFHAND);
   }

   public boolean Sz() {
      return (((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)catch_[3]) & 4) != 0 ? true : break_[195];
   }

   public int SU() {
      this.private_();
      return this.return_() ? ((rdn_3)this.private_[61]).extends_() - this.SH() : break_[225];
   }

   public ryR_2 SW() {
      this.private_();
      return (ryR_2)this.private_[1];
   }

   public int SM() {
      return ((rmE_2)this.throws_[49]).<Integer>class_((rut_3<Integer>)catch_[8]);
   }

   public int Sw() {
      this.private_();
      return (Integer)this.private_[73];
   }

   public boolean Sq() {
      return true;
   }

   public boolean SY() {
      this.private_();
      if (((rYB)this.throws_[7]).continue_) {
         return false;
      } else {
         Iterator var1 = ((Map)this.private_[2]).values().iterator();

         boolean var2;
         for (var2 = false; var1.hasNext(); var2 = true) {
            this.class_((rLY)var1.next());
            var1.remove();
         }

         return var2;
      }
   }

   public void SA() {
      this.private_();
      if (((Map)this.private_[2]).isEmpty()) {
         this.Bw();
         this.package_(false);
      } else {
         Collection var1 = ((Map)this.private_[2]).values();
         ((rmE_2)this.throws_[49]).break_((rut_3<Boolean>)catch_[6], class_(var1));
         ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)catch_[5], rAB.class_(var1));
         this.package_(this.break_(rLD.final_));
      }
   }

   public float Sd() {
      this.private_();
      return (Float)this.private_[60];
   }

   public iB_2 SZ() {
      this.private_();
      return (iB_2)this.private_[56];
   }

   public void Sg() {
      this.private_();
      float var1 = this.interface_();
      if ((Boolean)this.private_[5]) {
         Integer var6 = (Integer)this.private_[7] + 1;
         this.private_[7] = var6;
         if ((float)((Integer)this.private_[7]).intValue() >= var1) {
            Integer var7 = 0;
            this.private_[7] = var7;
            Boolean var8 = false;
            this.private_[5] = var8;
         }
      } else {
         Integer var9 = 0;
         this.private_[7] = var9;
      }

      Float var10 = (float)((Integer)this.private_[7]).intValue() / var1;
      this.private_[15] = var10;
   }

   public static iz_3 SD() {
      return iW_2.class_().class_(iQ_2.class_).class_(iQ_2.byte_).class_(iQ_2.protected_).class_(iQ_2.implements_).class_(iQ_2.finally_);
   }

   public int Se() {
      this.private_();
      return (Integer)this.private_[76];
   }

   public boolean SO() {
      return this.sG() == aL_2.break_ ? true : break_[9];
   }

   public void SQ() {
      this.Bg().filter(((rYB)this.throws_[7])::int_).ifPresent(var1x -> {
         xc_3 var2 = ((rYB)this.throws_[7]).byte_(var1x);
         if (var2.break_() instanceof xb_3) {
            ((rYB)this.throws_[7]).class_(var1x, var2.class_(xb_3.final_, Boolean.valueOf(false)), 3);
            rjU_2 var3 = xb_3.class_(this.BC(), (rYB)this.throws_[7], var1x, (Float)this.throws_[15]).orElseGet(() -> {
               rfH_2 var1xx = var1x.final_();
               return new rjU_2((double)var1xx.b_() + 0.5, (double)var1xx.c_() + 0.1, (double)var1xx.d_() + 0.5);
            });
            rjU_2 var4 = rjU_2.protected_(var1x).protected_(var3).protected_();
            float var5 = (float)rfU_2.case_(rfU_2.protected_(var4.protected_, var4.break_) * 180.0F / (float)Math.PI - 90.0);
            this.new_(var3.break_, var3.byte_, var3.protected_);
            Float var10 = var5;
            this.throws_[15] = var10;
            Float var11 = 0.0F;
            this.throws_[16] = var11;
         }
      });
      rjU_2 var1 = this.Ps();
      this.class_(iM_2.STANDING);
      this.new_(var1.break_, var1.byte_, var1.protected_);
      this.SB();
   }

   public iF_2<?> SV() {
      return iZ_2.class_(ImmutableList.of(), ImmutableList.of());
   }

   public xc_3 sS() {
      return ((rYB)this.throws_[7]).byte_(this.Bs());
   }

   public float Si() {
      return 1.0F;
   }

   public void sP() {
      this.private_();
      rpm_3 var1 = this.P();
      if (!((rdn_3)this.private_[61]).equals(this.protected_(var1))) {
         this.SC();
      } else if (!((rdn_3)this.private_[61]).class_() && this.return_()) {
         this.class_((rdn_3)this.private_[61], 16);
         rdn_3 var2 = ((rdn_3)this.private_[61]).class_((rYB)this.throws_[7], this);
         if (var2 != (rdn_3)this.private_[61]) {
            this.class_(var1, var2);
         }

         this.throw_();
      }
   }

   public int Sb() {
      this.private_();
      return (Integer)this.private_[55];
   }

   public boolean Sl() {
      return this.Ss() <= 0.0F ? true : break_[72];
   }

   public void Sv() {
      rjU_2 var1 = this.rv();
      ((rYB)this.throws_[7])
         .class_(
            rLQ.throw_,
            this.rx() + (((Random)this.throws_[40]).nextDouble() - 0.5) * (double)this.PN(),
            this.re() + 0.1,
            this.BO() + (((Random)this.throws_[40]).nextDouble() - 0.5) * (double)this.PN(),
            var1.break_ * -0.2,
            0.1,
            var1.protected_ * -0.2
         );
      float var2 = ((Random)this.throws_[40]).nextFloat() * 0.4F + ((Random)this.throws_[40]).nextFloat() > 0.9F ? 0.6F : implements_[15];
      this.class_(rqn_3.xE, var2, 0.6F + ((Random)this.throws_[40]).nextFloat() * 0.4F);
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return var1 == iM_2.SLEEPING ? (ap_3)catch_[10] : super.a_(var1).class_(this.SR());
   }

   @Override
   public void m_() {
      ((rmE_2)this.throws_[49]).class_((rut_3<Byte>)catch_[3], (byte)0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Integer>)catch_[5], 0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Boolean>)catch_[6], false);
      ((rmE_2)this.throws_[49]).class_((rut_3<Integer>)catch_[7], 0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Integer>)catch_[8], 0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Float>)catch_[4], 1.0F);
      ((rmE_2)this.throws_[49]).class_((rut_3<Optional>)catch_[9], Optional.empty());
   }

   @Override
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
      this.private_();
      if (this.native_()) {
         return false;
      } else {
         rfH_2 var1 = this.Bs();
         xc_3 var2 = this.sS();
         xd_3 var3 = var2.break_();
         if (var3.class_(rls_3.F)) {
            Optional var8 = Optional.of(var1);
            this.private_[66] = var8;
            return true;
         } else if (var3 instanceof zv_3 && this.byte_(var1, var2)) {
            Optional var9 = Optional.of(var1);
            this.private_[66] = var9;
            return true;
         } else {
            return break_[109];
         }
      }
   }

   @Override
   public void c_(boolean var1) {
      super.c_(var1);
      ic_3 var2 = this.byte_(iQ_2.protected_);
      if (var2.class_((UUID)catch_[0]) != null) {
         var2.protected_((ix_3)catch_[2]);
      }

      if (var1) {
         var2.break_((ix_3)catch_[2]);
      }
   }
}
