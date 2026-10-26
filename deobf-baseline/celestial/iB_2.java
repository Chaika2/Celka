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
      rxK_2 var2 = ((rdn_3)this.id_private[id_native[624]]).id_break().id_this();
      boolean var3 = var2 != null && var2.id_throws() ? id_break[213] : id_break[214];
      var3 |= var1 <= ((rdn_3)this.id_private[id_native[625]]).id_extends() - id_finally[75] ? id_break[215] : id_break[216];
      return var3 && var1 % id_finally[76] == 0 ? id_break[217] : id_break[218];
   }

   public boolean id_byte(rXQ var1) {
      return !this.id_class(var1).id_class() ? id_break[139] : id_break[140];
   }

   public rqA_2 id_byte(rdn_3 var1) {
      return var1.id_float();
   }

   public void id_byte(rlb_3<rXs_1> var1) {
      this.id_byte(this.rv().id_break(id_protected[56], id_protected[57], id_protected[58]));
   }

   public int id_byte(rhd_3 var1) {
      return id_break[34];
   }

   public void id_byte(rpm_3 var1) {
      this.id_break(var1 == rpm_3.MAIN_HAND ? rXQ.MAINHAND : rXQ.OFFHAND);
   }

   public void id_byte(rLY var1) {
      this.id_private();
      if (this.id_throws(var1)) {
         rLY var2 = ((Map)this.id_private[id_native[199]]).put(var1.id_class(), var1);
         if (var2 == null) {
            this.id_protected(var1);
         } else {
            this.id_class(var1, id_break[63]);
         }
      }
   }

   public rLY id_byte(rLR var1) {
      this.id_private();
      return (rLY)((Map)this.id_private[id_native[196]]).get(var1);
   }

   private float id_byte(float var1) {
      this.id_private();
      return this.id_throws[id_native[400]] ? this.sB() * (id_implements[139] / (var1 * var1 * var1)) : (Float)this.id_private[id_native[401]];
   }

   public rqA_2 id_byte(rye_3 var1) {
      return rqn_3.So;
   }

   private void id_byte(rXQ var1, rdn_3 var2) {
      this.id_private();
      ((rqs_3)this.id_private[id_native[479]]).set(var1.id_break(), var2);
   }

   public rqA_2 id_byte(int var1) {
      return var1 > id_finally[41] ? rqn_3.SI : rqn_3.SK;
   }

   public void id_byte(rye_3 var1, float var2) {
   }

   @Override
   public void id_byte(an_3 var1) {
      if (!this.Sc()) {
         super.id_byte(var1);
      }
   }

   public void id_byte(int var1, boolean var2) {
      int var3 = ((rmE_2)this.id_throws[id_native[632]]).<Byte>id_class((rut_3<Byte>)id_catch[id_native[633]]);
      if (var2) {
         var3 |= var1;
      } else {
         var3 &= var1 ^ id_finally[77];
      }

      ((rmE_2)this.id_throws[id_native[634]]).id_break((rut_3<Byte>)id_catch[id_native[635]], (byte)var3);
   }

   private boolean id_byte(rfH_2 var1, xc_3 var2) {
      if (!var2.id_byte(zv_3.id_volatile)) {
         return id_break[112];
      } else {
         xc_3 var3 = ((rYB)this.id_throws[id_native[286]]).id_byte(var1.id_break());
         return var3.id_class(xu_3.PJ) && var3.id_byte(kc_3.id_volatile) == var2.id_byte(zv_3.p) ? id_break[110] : id_break[111];
      }
   }

   public ic_3 id_byte(iJ_2 var1) {
      return this.BT().id_class(var1);
   }

   @Override
   public void id_int(boolean var1) {
      this.id_private();
      super.id_int(var1);
      if (var1) {
         Optional var6 = Optional.empty();
         this.id_private[id_native[281]] = var6;
      }
   }

   public void id_int(int var1) {
      ((rmE_2)this.id_throws[id_native[304]]).id_break((rut_3<Integer>)id_catch[id_native[305]], var1);
   }

   private static void id_int() {
      id_finally = new byte[]{
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

   private Map<rXQ, rdn_3> id_long() {
      EnumMap var1 = null;
      rXQ[] var2 = rXQ.values();
      int var3 = var2.length;

      for (int var4 = id_break[159]; var4 < var3; var4++) {
         rXQ var5 = var2[var4];
         rdn_3 var6;
         switch (((int[])iS_2.id_class[id_native[475]])[var5.id_class().ordinal()]) {
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
      id_class = new String[]{
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
      this.id_private();
      ryR_2 var8 = new ryR_2(this);
      this.id_private[id_native[0]] = var8;
      HashMap var9 = Maps.newHashMap();
      this.id_private[id_native[1]] = var9;
      rqs_3 var10 = rqs_3.id_class(id_finally[0], rdn_3.id_break);
      this.id_private[id_native[2]] = var10;
      rqs_3 var11 = rqs_3.id_class(id_finally[1], rdn_3.id_break);
      this.id_private[id_native[3]] = var11;
      Integer var12 = Integer.valueOf(id_finally[2]);
      this.id_private[id_native[4]] = var12;
      Float var13 = id_implements[0];
      this.id_private[id_native[5]] = var13;
      Boolean var14 = id_break[0];
      this.id_private[id_native[6]] = var14;
      rdn_3 var15 = rdn_3.id_break;
      this.id_private[id_native[7]] = var15;
      Optional var16 = Optional.empty();
      this.id_private[id_native[8]] = var16;
      ik_3 var17 = new ik_3(iN_2.id_class(var1));
      this.id_private[id_native[9]] = var17;
      this.id_public(this.SK());
      Boolean var18 = id_break[1];
      this.id_throws[id_native[10]] = var18;
      Float var19 = (float)((Math.random() + id_protected[0]) * id_protected[1]);
      this.id_private[id_native[11]] = var19;
      this.PX();
      Float var20 = (float)Math.random() * id_implements[1];
      this.id_private[id_native[12]] = var20;
      Float var21 = (float)(Math.random() * id_protected[2]);
      this.id_throws[id_native[13]] = var21;
      Float var22 = (Float)this.id_throws[id_native[14]];
      this.id_private[id_native[15]] = var22;
      Float var23 = (Float)this.id_throws[id_native[16]];
      this.id_private[id_native[17]] = var23;
      Float var24 = id_implements[2];
      this.id_throws[id_native[18]] = var24;
      rcf_3 var3 = rcf_3.id_class;
      iZ_2 var25 = this.id_class(new Dynamic(var3, (rcZ_2)var3.createMap(ImmutableMap.of(var3.id_class(id_class[0]), (rcZ_2)var3.emptyMap()))));
      this.id_private[id_native[19]] = var25;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_this() {
      this.id_private();
      super.id_this();
      this.id_final();
      this.id_void();
      Boolean var17 = id_break[151];
      this.id_private[id_native[404]] = var17;

      for (rdn_3 var3 : this.PV()) {
         if (!var3.id_class()) {
            Boolean var18 = id_break[152];
            this.id_private[id_native[405]] = var18;
         }
      }

      if (!((rYB)this.id_throws[id_native[406]]).id_continue) {
         int var39 = this.BY();
         if (var39 > 0) {
            if ((Integer)this.id_private[id_native[407]] <= 0) {
               Integer var19 = id_finally[58] * (id_finally[59] - var39);
               this.id_private[id_native[408]] = var19;
            }

            Integer var20 = (Integer)this.id_private[id_native[409]] - id_break[153];
            this.id_private[id_native[410]] = var20;
            if ((Integer)this.id_private[id_native[411]] <= 0) {
               this.id_int(var39 - id_break[154]);
            }
         }

         int var41 = this.SM();
         if (var41 > 0) {
            if ((Integer)this.id_private[id_native[412]] <= 0) {
               Integer var21 = id_finally[60] * (id_finally[61] - var41);
               this.id_private[id_native[413]] = var21;
            }

            Integer var22 = (Integer)this.id_private[id_native[414]] - id_break[155];
            this.id_private[id_native[415]] = var22;
            if ((Integer)this.id_private[id_native[416]] <= 0) {
               this.id_package(var41 - id_break[156]);
            }
         }

         this.id_else();
         if ((Integer)this.id_throws[id_native[417]] % id_finally[62] == 0) {
            this.SW().id_throws();
         }

         if (!(Boolean)this.id_throws[id_native[418]]) {
            boolean var4 = this.id_break(rLD.id_public);
            if (this.id_finally(id_finally[63]) != var4) {
               this.id_break(id_finally[64], var4);
            }
         }

         if (this.Sc() && !this.id_goto()) {
            this.SQ();
         }
      }

      this.id_default();
      double var40 = this.rx() - (Double)this.id_throws[id_native[419]];
      double var42 = this.BO() - (Double)this.id_throws[id_native[420]];
      float var6 = (float)(var40 * var40 + var42 * var42);
      float var7 = (Float)this.id_private[id_native[421]];
      float var8 = id_implements[140];
      Float var23 = (Float)this.id_private[id_native[422]];
      this.id_private[id_native[423]] = var23;
      float var9 = id_implements[141];
      float var10 = this.id_switch().id_throws();
      if (var6 > id_implements[142]) {
         var9 = id_implements[143];
         var8 = (float)Math.sqrt((double)var6) * id_implements[144];
         float var11 = (float)rfU_2.id_protected(var42, var40) * id_implements[145] - id_implements[146];
         float var12 = rfU_2.id_throws(rfU_2.id_catch(var10) - var11);
         if (id_implements[147] < var12 && var12 < id_implements[148]) {
            var7 = var11 - id_implements[149];
         } else {
            var7 = var11;
         }
      }

      if ((Float)this.id_private[id_native[424]] > id_implements[150]) {
         var7 = var10;
      }

      if (!(Boolean)this.id_throws[id_native[425]]) {
         var9 = id_implements[151];
      }

      Float var24 = (Float)this.id_private[id_native[426]] + (var9 - (Float)this.id_private[id_native[427]]) * id_implements[152];
      this.id_private[id_native[428]] = var24;
      var8 = this.id_break(var7, var8, var10);

      while (this.id_throws[id_native[429]] - this.id_throws[id_native[430]] < id_implements[153]) {
         Float var25 = (Float)this.id_throws[id_native[431]] - id_implements[154];
         this.id_throws[id_native[432]] = var25;
      }

      while (this.id_throws[id_native[433]] - this.id_throws[id_native[434]] >= id_implements[155]) {
         Float var26 = (Float)this.id_throws[id_native[435]] + id_implements[156];
         this.id_throws[id_native[436]] = var26;
      }

      while (this.id_private[id_native[437]] - this.id_private[id_native[438]] < id_implements[157]) {
         Float var27 = (Float)this.id_private[id_native[439]] - id_implements[158];
         this.id_private[id_native[440]] = var27;
      }

      while (this.id_private[id_native[441]] - this.id_private[id_native[442]] >= id_implements[159]) {
         Float var28 = (Float)this.id_private[id_native[443]] + id_implements[160];
         this.id_private[id_native[444]] = var28;
      }

      while (this.id_throws[id_native[445]] - this.id_throws[id_native[446]] < id_implements[161]) {
         Float var29 = (Float)this.id_throws[id_native[447]] - id_implements[162];
         this.id_throws[id_native[448]] = var29;
      }

      while (this.id_throws[id_native[449]] - this.id_throws[id_native[450]] >= id_implements[163]) {
         Float var30 = (Float)this.id_throws[id_native[451]] + id_implements[164];
         this.id_throws[id_native[452]] = var30;
      }

      while (this.id_private[id_native[453]] - this.id_private[id_native[454]] < id_implements[165]) {
         Float var31 = (Float)this.id_private[id_native[455]] - id_implements[166];
         this.id_private[id_native[456]] = var31;
      }

      while (this.id_private[id_native[457]] - this.id_private[id_native[458]] >= id_implements[167]) {
         Float var32 = (Float)this.id_private[id_native[459]] + id_implements[168];
         this.id_private[id_native[460]] = var32;
      }

      while (this.id_private[id_native[461]] - this.id_private[id_native[462]] < id_implements[169]) {
         Float var33 = (Float)this.id_private[id_native[463]] - id_implements[170];
         this.id_private[id_native[464]] = var33;
      }

      while (this.id_private[id_native[465]] - this.id_private[id_native[466]] >= id_implements[171]) {
         Float var34 = (Float)this.id_private[id_native[467]] + id_implements[172];
         this.id_private[id_native[468]] = var34;
      }

      Float var35 = (Float)this.id_private[id_native[469]] + var8;
      this.id_private[id_native[470]] = var35;
      if (this.Sy()) {
         Integer var36 = (Integer)this.id_private[id_native[471]] + id_break[157];
         this.id_private[id_native[472]] = var36;
      } else {
         Integer var37 = Integer.valueOf(id_break[158]);
         this.id_private[id_native[473]] = var37;
      }

      if (this.Sc()) {
         Float var38 = id_implements[173];
         this.id_throws[id_native[474]] = var38;
      }
   }

   public float id_this(float var1) {
      this.id_private();
      return rfU_2.id_catch(var1, (float)((Integer)this.id_private[id_native[683]]).intValue(), (float)((Integer)this.id_private[id_native[684]]).intValue());
   }

   public Map<rLR, rLY> sb() {
      this.id_private();
      return (Map<rLR, rLY>)this.id_private[id_native[194]];
   }

   @Override
   public float f() {
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[727]]).id_finally().id_class(rrnJ_2.id_class(this, super.f())).id_break();
   }

   public float id_interface() {
      return this.id_break(rLD.id_protected)
         ? (float)(id_finally[45] + (id_break[120] + this.id_byte(rLD.id_protected).id_byte()) * id_finally[46])
         : id_implements[75];
   }

   @Override
   public abstract void id_class(rXQ var1, rdn_3 var2);

   @Override
   public void id_class(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
      if (!this.rT()) {
         this.rd();
      }

      if (!((rYB)this.id_throws[id_native[35]]).id_continue && var3 && (Float)this.id_throws[id_native[36]] > id_implements[5]) {
         this.SI();
         this.Ba();
      }

      if (!((rYB)this.id_throws[id_native[37]]).id_continue && (Float)this.id_throws[id_native[38]] > id_implements[6] && var3) {
         float var6 = (float)rfU_2.id_case((Float)this.id_throws[id_native[39]] - id_implements[7]);
         if (!var4.id_catch()) {
            double var7 = Math.min((double)(id_implements[8] + var6 / id_implements[9]), id_protected[3]);
            int var9 = (int)(id_protected[4] * var7);
            ((rrEm_1)((rYB)this.id_throws[id_native[40]]))
               .id_class(
                  new rLX(rLQ.id_protected, var4), this.rx(), this.re(), this.BO(), var9, id_protected[5], id_protected[6], id_protected[7], id_protected[8]
               );
         }
      }

      super.id_class(var1, var3, var4, var5);
   }

   public boolean id_class(aI_2<?> var1) {
      return id_break[2];
   }

   public void id_class(rye_3 var1, int var2, boolean var3) {
   }

   private void id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      rdb_3 var4 = var1.id_break();
      if (var4.id_super()) {
         for (Pair var6 : var4.id_this().id_case()) {
            if (!var2.id_continue && var6.getFirst() != null && var2.id_int.nextFloat() < (Float)var6.getSecond()) {
               var3.id_break(new rLY((rLY)var6.getFirst()));
            }
         }
      }
   }

   public void id_class(iB_2 var1, boolean var2) {
      this.id_private();
      Float var14 = (Float)var1.id_private[id_native[386]];
      var1.id_private[id_native[387]] = var14;
      double var3 = var1.rx() - (Double)var1.id_throws[id_native[388]];
      double var5 = var2 ? var1.re() - (Double)var1.id_throws[id_native[389]] : id_protected[103];
      double var7 = var1.BO() - (Double)var1.id_throws[id_native[390]];
      float var9 = rfU_2.id_class(var3 * var3 + var5 * var5 + var7 * var7) * id_implements[134];
      if (var9 > id_implements[135]) {
         var9 = id_implements[136];
      }

      Float var15 = (Float)var1.id_private[id_native[391]] + (var9 - (Float)var1.id_private[id_native[392]]) * id_implements[137];
      var1.id_private[id_native[393]] = var15;
      Float var16 = (Float)var1.id_private[id_native[394]] + (Float)var1.id_private[id_native[395]];
      var1.id_private[id_native[396]] = var16;
   }

   private void id_class(rfH_2 var1) {
      this.id_new((double)var1.b_() + id_protected[141], (double)var1.c_() + id_protected[142], (double)var1.d_() + id_protected[143]);
   }

   private void id_class(Map<rXQ, rdn_3> var1) {
      ArrayList var2 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2x, var3) -> {
         rdn_3 var4 = var3.id_implements();
         var2.add(Pair.of(var2x, var4));
         switch (((int[])iS_2.id_class[id_native[737]])[var2x.id_class().ordinal()]) {
            case 1:
               this.id_break(var2x, var4);
               break;
            case 2:
               this.id_byte(var2x, var4);
         }
      });
      ((rrEm_1)((rYB)this.id_throws[id_native[477]])).id_else().id_break(this, new rvO_2(this.V(), var2));
   }

   private void id_class(an_3 var1) {
      rjU_2 var2;
      if (!(Boolean)var1.id_throws[id_native[361]] && !((rYB)this.id_throws[id_native[362]]).id_byte(var1.Bs()).id_break().id_class(rls_3.Q)) {
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
      rhd_3 var2 = var1.id_case() != null ? ((rYB)this.id_throws[id_native[582]]).id_class(var1.id_case()) : null;
      if (var2 instanceof rhN_2) {
         Oo_1.id_strictfp.id_class((rhN_2)var2, var1.id_protected(), this);
      }
   }

   public void id_class(an_3 var1, int var2) {
      if (!(Boolean)var1.id_throws[id_native[583]]
         && !((rYB)this.id_throws[id_native[584]]).id_continue
         && (var1 instanceof rsE_2 || var1 instanceof rhm_3 || var1 instanceof rsP_2)) {
         ((rrEm_1)((rYB)this.id_throws[id_native[585]])).id_else().id_break(var1, new rZe_1(var1.V(), this.V(), var2));
      }
   }

   public static boolean id_class(Collection<rLY> var0) {
      for (rLY var2 : var0) {
         if (!var2.id_protected()) {
            return id_break[48];
         }
      }

      return id_break[49];
   }

   public void id_class(rye_3 var1, float var2) {
      if (!this.id_class(var1)) {
         var2 = this.id_protected(var1, var2);
         var2 = this.id_throws(var1, var2);
         float var3 = Math.max(var2 - this.Sd(), id_implements[70]);
         this.id_return(this.Sd() - (var2 - var3));
         float var4 = var2 - var3;
         if (var4 > id_implements[71] && var4 < id_implements[72] && var1.id_extends() instanceof rhN_2) {
            ((rhN_2)var1.id_extends()).id_class(rlB_2.id_long, Math.round(var4 * id_implements[73]));
         }

         if (var3 != id_implements[74]) {
            float var5 = this.Ss();
            this.id_public(var5 - var3);
            this.SW().id_class(var1, var5, var3);
            this.id_return(this.Sd() - var3);
         }
      }
   }

   public boolean id_class(Predicate<rdb_3> var1) {
      return !var1.test(this.ss().id_break()) && !var1.test(this.Sn().id_break()) ? id_break[138] : id_break[137];
   }

   public abstract rdn_3 id_class(rXQ var1);

   public rdn_3 id_class(rYB var1, rdn_3 var2) {
      if (var2.id_long()) {
         var1.id_class(
            null,
            this.rx(),
            this.re(),
            this.BO(),
            this.id_protected(var2),
            rqL_2.NEUTRAL,
            id_implements[218],
            id_implements[219] + (var1.id_int.nextFloat() - var1.id_int.nextFloat()) * id_implements[220]
         );
         this.id_class(var2, var1, this);
         if (!(this instanceof rhd_3) || !((rhx_3)((rhd_3)this).id_implements[id_native[716]]).id_protected) {
            var2.id_catch(id_break[250]);
         }
      }

      return var2;
   }

   @Override
   public boolean id_class(float var1, float var2) {
      boolean var3 = super.id_class(var1, var2);
      int var4 = this.id_implements(var1, var2);
      if (var4 > 0) {
         this.id_class(this.id_byte(var4), id_implements[55], id_implements[56]);
         this.sM();
         this.id_break(rye_3.id_extends, (float)var4);
         return id_break[117];
      } else {
         return var3;
      }
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.id_private();
      Double var15 = var1;
      this.id_private[id_native[573]] = var15;
      Double var16 = var3;
      this.id_private[id_native[574]] = var16;
      Double var17 = var5;
      this.id_private[id_native[575]] = var17;
      Double var18 = (double)var7;
      this.id_private[id_native[576]] = var18;
      Double var19 = (double)var8;
      this.id_private[id_native[577]] = var19;
      Integer var20 = var9;
      this.id_private[id_native[578]] = var20;
   }

   @Override
   public void id_class(Rm_1 var1, rjU_2 var2) {
      this.id_private();
      super.id_class(var1, var2);
      Float var7 = (Float)this.id_private[id_native[657]];
      this.id_private[id_native[658]] = var7;
      Float var8 = (Float)this.id_private[id_native[659]];
      this.id_private[id_native[660]] = var8;
      Float var9 = (Float)this.id_private[id_native[661]];
      this.id_private[id_native[662]] = var9;
   }

   public rLY id_class(rLR var1) {
      this.id_private();
      return (rLY)((Map)this.id_private[id_native[200]]).remove(var1);
   }

   public boolean id_class(rXs_1 var1) {
      return id_break[145];
   }

   public boolean id_class(rrTR var1) {
      rjU_2 var2 = new rjU_2(this.rx(), this.rH(), this.BO());
      rjU_2 var3 = var1.rr();
      rjU_2 var4 = new rjU_2(var3.id_break, var3.id_byte + (double)(var1 instanceof an_3 var5 ? var5.Bx() : id_implements[192]), var3.id_protected);
      return ((rYB)this.id_throws[id_native[587]]).id_class(new rjB_2(var2, var4, rjS_2.COLLIDER, rjs_3.NONE, this)).id_byte() == rjM_2.MISS
         ? id_break[198]
         : id_break[199];
   }

   public boolean id_class(rdb_3 var1) {
      return this.id_class((Predicate<rdb_3>)(var1x -> var1x == var1 ? id_break[252] : id_break[253]));
   }

   public void id_class(rLY var1) {
      this.id_private();
      Boolean var6 = id_break[70];
      this.id_private[id_native[205]] = var6;
      if (!((rYB)this.id_throws[id_native[206]]).id_continue) {
         var1.id_class().id_class(this, this.BT(), var1.id_byte());
      }

      rrLo_1.id_class(this, var1);
   }

   @Override
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

   @Override
   public void id_class(rut_3<?> var1) {
      this.id_private();
      super.id_class(var1);
      if (((rut_3)id_catch[id_native[641]]).equals(var1)) {
         if (((rYB)this.id_throws[id_native[642]]).id_continue) {
            this.Bg().ifPresent(this::id_class);
         }
      } else if (((rut_3)id_catch[id_native[643]]).equals(var1) && ((rYB)this.id_throws[id_native[644]]).id_continue) {
         if (this.id_return() && ((rdn_3)this.id_private[id_native[645]]).id_class()) {
            rdn_3 var6 = this.id_protected(this.P());
            this.id_private[id_native[646]] = var6;
            if (!((rdn_3)this.id_private[id_native[647]]).id_class()) {
               Integer var7 = (Integer)this.id_private[id_native[648]];
               this.id_private[id_native[649]] = var7;
               Integer var8 = ((rdn_3)this.id_private[id_native[650]]).id_extends();
               this.id_private[id_native[651]] = var8;
            }
         } else if (!this.id_return() && !((rdn_3)this.id_private[id_native[652]]).id_class()) {
            rdn_3 var9 = rdn_3.id_break;
            this.id_private[id_native[653]] = var9;
            Integer var10 = (Integer)this.id_private[id_native[654]];
            this.id_private[id_native[655]] = var10;
            Integer var11 = Integer.valueOf(id_break[223]);
            this.id_private[id_native[656]] = var11;
         }
      }
   }

   public rzP_2 id_class(boolean var1, rye_3 var2) {
      this.id_private();
      rzP_2 var3 = new rzP_2((rrEm_1)((rYB)this.id_throws[id_native[274]]))
         .id_class((Random)this.id_throws[id_native[275]])
         .id_class(rzQ_2.id_class, this)
         .id_class(rzQ_2.id_case, this.Ps())
         .id_class(rzQ_2.id_byte, var2)
         .id_break(rzQ_2.id_protected, var2.id_extends())
         .id_break(rzQ_2.id_throws, var2.id_finally());
      if (var1 && (rhd_3)this.id_private[id_native[276]] != null) {
         var3 = var3.id_class(rzQ_2.id_break, (rhd_3)this.id_private[id_native[277]]).id_class(((rhd_3)this.id_private[id_native[278]]).sY());
      }

      return var3;
   }

   public double id_class(iJ_2 var1) {
      return this.BT().id_byte(var1);
   }

   public void id_class(rye_3 var1, boolean var2) {
      rqO_2 var3 = this.By();
      rzL_2 var4 = ((rYB)this.id_throws[id_native[273]]).id_const().o().id_class(var3);
      rzP_2 var5 = this.id_class(var2, var1);
      var4.id_break(var5.id_class(rzz_3.id_case), this::a_);
   }

   @Override
   public float id_class(iM_2 var1, ap_3 var2) {
      return var1 == iM_2.SLEEPING ? id_implements[217] : this.id_break(var1, var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_private();
      var1.id_class(id_class[2], this.Ss());
      var1.id_class(id_class[3], (short)((Integer)this.id_private[id_native[130]]).intValue());
      var1.id_break(id_class[4], (Integer)this.id_private[id_native[131]]);
      var1.id_class(id_class[5], (short)((Integer)this.id_private[id_native[132]]).intValue());
      var1.id_class(id_class[6], this.Sd());
      var1.id_class(id_class[7], this.BT().id_byte());
      if (!((Map)this.id_private[id_native[133]]).isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (rLY var4 : ((Map)this.id_private[id_native[134]]).values()) {
            var2.add(var4.id_class(new rcd_3()));
         }

         var1.id_class(id_class[8], var2);
      }

      var1.id_class(id_class[9], this.Sy());
      this.Bg().ifPresent(var1x -> {
         var1.id_break(id_class[33], var1x.b_());
         var1.id_break(id_class[34], var1x.c_());
         var1.id_break(id_class[35], var1x.d_());
      });
      DataResult var5 = ((iZ_2)this.id_private[id_native[135]]).id_class(rcf_3.id_class);
      var5.resultOrPartial(((Logger)id_case[id_native[136]])::error).ifPresent(var1x -> var1.id_class(id_class[32], var1x));
   }

   public void id_class(rpm_3 var1, boolean var2) {
      this.id_private();
      if (!(Boolean)this.id_private[id_native[310]]
         || (float)((Integer)this.id_private[id_native[311]]).intValue() >= this.id_interface() / id_implements[76]
         || (Integer)this.id_private[id_native[312]] < 0) {
         Integer var9 = Integer.valueOf(id_finally[47]);
         this.id_private[id_native[313]] = var9;
         Boolean var10 = id_break[122];
         this.id_private[id_native[314]] = var10;
         this.id_private[id_native[315]] = var1;
         if ((rYB)this.id_throws[id_native[316]] instanceof rrEm_1) {
            rZj_1 var3 = new rZj_1(this, var1 == rpm_3.MAIN_HAND ? id_break[123] : id_finally[48]);
            rrEN var4 = ((rrEm_1)((rYB)this.id_throws[id_native[317]])).id_else();
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
      this.id_class(var1, id_break[121]);
   }

   @Override
   public void id_class(byte var1) {
      this.id_private();
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var2 = var1 == id_finally[49] ? id_break[124] : id_break[125];
            boolean var3 = var1 == id_finally[50] ? id_break[126] : id_break[127];
            boolean var4 = var1 == id_finally[51] ? id_break[128] : id_break[129];
            boolean var5 = var1 == id_finally[52] ? id_break[130] : id_break[131];
            Float var26 = id_implements[77];
            this.id_private[id_native[318]] = var26;
            Integer var27 = Integer.valueOf(id_finally[53]);
            this.id_throws[id_native[319]] = var27;
            Integer var28 = Integer.valueOf(id_finally[54]);
            this.id_private[id_native[320]] = var28;
            Integer var29 = (Integer)this.id_private[id_native[321]];
            this.id_private[id_native[322]] = var29;
            Float var30 = id_implements[78];
            this.id_private[id_native[323]] = var30;
            if (var2) {
               this.id_class(
                  rqn_3.dG,
                  this.Si(),
                  (((Random)this.id_throws[id_native[324]]).nextFloat() - ((Random)this.id_throws[id_native[325]]).nextFloat()) * id_implements[79]
                     + id_implements[80]
               );
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
               this.id_class(
                  var7,
                  this.Si(),
                  (((Random)this.id_throws[id_native[326]]).nextFloat() - ((Random)this.id_throws[id_native[327]]).nextFloat()) * id_implements[81]
                     + id_implements[82]
               );
            }

            this.id_break(rye_3.id_final, id_implements[83]);
            break;
         case 3:
            rqA_2 var8 = this.Bt();
            if (var8 != null) {
               this.id_class(
                  var8,
                  this.Si(),
                  (((Random)this.id_throws[id_native[328]]).nextFloat() - ((Random)this.id_throws[id_native[329]]).nextFloat()) * id_implements[84]
                     + id_implements[85]
               );
            }

            if (!(this instanceof rhd_3)) {
               this.id_public(id_implements[86]);
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
            this.id_class(rqn_3.Jr, id_implements[87], id_implements[88] + ((rYB)this.id_throws[id_native[330]]).id_int.nextFloat() * id_implements[89]);
            break;
         case 30:
            this.id_class(rqn_3.JP, id_implements[90], id_implements[91] + ((rYB)this.id_throws[id_native[331]]).id_int.nextFloat() * id_implements[92]);
            break;
         case 46:
            short var9 = id_native[332];

            for (int var10 = id_break[132]; var10 < id_native[333]; var10++) {
               double var11 = (double)var10 / id_protected[47];
               float var13 = (((Random)this.id_throws[id_native[334]]).nextFloat() - id_implements[93]) * id_implements[94];
               float var14 = (((Random)this.id_throws[id_native[335]]).nextFloat() - id_implements[95]) * id_implements[96];
               float var15 = (((Random)this.id_throws[id_native[336]]).nextFloat() - id_implements[97]) * id_implements[98];
               double var16 = rfU_2.id_protected(var11, (Double)this.id_throws[id_native[337]], this.rx())
                  + (((Random)this.id_throws[id_native[338]]).nextDouble() - id_protected[48]) * (double)this.PN() * id_protected[49];
               double var18 = rfU_2.id_protected(var11, (Double)this.id_throws[id_native[339]], this.re())
                  + ((Random)this.id_throws[id_native[340]]).nextDouble() * (double)this.Bm();
               double var20 = rfU_2.id_protected(var11, (Double)this.id_throws[id_native[341]], this.BO())
                  + (((Random)this.id_throws[id_native[342]]).nextDouble() - id_protected[50]) * (double)this.PN() * id_protected[51];
               ((rYB)this.id_throws[id_native[343]]).id_class(rLQ.id_transient, var16, var18, var20, (double)var13, (double)var14, (double)var15);
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
      var1 = (float)((double)var1 * (id_protected[40] - this.id_class(iQ_2.id_byte)));
      if (!(var1 <= id_implements[53])) {
         Boolean var12 = id_break[105];
         this.id_throws[id_native[279]] = var12;
         rjU_2 var6 = this.rv();
         rjU_2 var7 = new rjU_2(var2, id_protected[41], var4).id_protected().id_class((double)var1);
         this.id_catch(
            var6.id_break / id_protected[42] - var7.id_break,
            this.id_throws[id_native[280]] ? Math.min(id_protected[43], var6.id_byte / id_protected[44] + (double)var1) : var6.id_byte,
            var6.id_protected / id_protected[45] - var7.id_protected
         );
      }
   }

   public void id_class(rfl_3 var1, rfl_3 var2) {
      this.id_private();
      rfl_3 var3 = var1.id_break(var2);
      List var4 = ((rYB)this.id_throws[id_native[558]]).id_class(this, var3);
      if (!var4.isEmpty()) {
         for (int var5 = id_break[189]; var5 < var4.size(); var5++) {
            an_3 var6 = (an_3)var4.get(var5);
            if (var6 instanceof iB_2) {
               this.id_case((iB_2)var6);
               Integer var11 = Integer.valueOf(id_break[190]);
               this.id_private[id_native[559]] = var11;
               this.id_byte(this.rv().id_class(id_protected[126]));
               break;
            }
         }
      } else if ((Boolean)this.id_throws[id_native[560]]) {
         Integer var12 = Integer.valueOf(id_break[191]);
         this.id_private[id_native[561]] = var12;
      }

      if (!((rYB)this.id_throws[id_native[562]]).id_continue && (Integer)this.id_private[id_native[563]] <= 0) {
         this.id_byte(id_finally[70], id_break[192]);
      }
   }

   @Override
   public void id_class(float var1, int var2) {
      this.id_private();
      Double var7 = (double)var1;
      this.id_private[id_native[579]] = var7;
      Integer var8 = var2;
      this.id_private[id_native[580]] = var8;
   }

   public void id_class(iB_2 var1) {
      if (!((rYB)this.id_throws[id_native[258]]).id_continue) {
         boolean var2 = id_break[100];
         if (var1 instanceof rSN) {
            if (((rYB)this.id_throws[id_native[259]]).B().id_break(rRu_1.id_break)) {
               rfH_2 var3 = this.Bs();
               xc_3 var4 = xu_3.ry.id_continue();
               if (((rYB)this.id_throws[id_native[260]]).id_byte(var3).id_catch() && var4.id_class((rRR)((rYB)this.id_throws[id_native[261]]), var3)) {
                  ((rYB)this.id_throws[id_native[262]]).id_class(var3, var4, id_finally[40]);
                  var2 = id_break[101];
               }
            }

            if (!var2) {
               rsE_2 var5 = new rsE_2((rYB)this.id_throws[id_native[263]], this.rx(), this.re(), this.BO(), new rdn_3(rdy_3.rF));
               ((rYB)this.id_throws[id_native[264]]).a_(var5);
            }
         }
      }
   }

   public boolean id_class(double var1, double var3, double var5, boolean var7) {
      double var8 = this.rx();
      double var10 = this.re();
      double var12 = this.BO();
      double var14 = var3;
      boolean var16 = id_break[236];
      rfH_2 var17 = new rfH_2(var1, var3, var5);
      rYB var18 = (rYB)this.id_throws[id_native[703]];
      if (var18.id_int(var17)) {
         boolean var19 = id_break[237];

         while (!var19 && var17.c_() > 0) {
            rfH_2 var20 = var17.id_break();
            xc_3 var21 = var18.id_byte(var20);
            if (var21.id_byte().id_byte()) {
               var19 = id_break[238];
            } else {
               var14 -= id_protected[139];
               var17 = var20;
            }
         }

         if (var19) {
            this.id_case(var1, var14, var5);
            if (var18.id_throws(this) && !var18.id_protected(this.rN())) {
               var16 = id_break[239];
            }
         }
      }

      if (!var16) {
         this.id_case(var8, var10, var12);
         return id_break[240];
      } else {
         if (var7) {
            var18.id_class(this, id_finally[82]);
         }

         if (this instanceof aA_2) {
            ((aA_2)this).id_public().id_final();
         }

         return id_break[241];
      }
   }

   public void id_class(rdn_3 var1, int var2) {
      if (!var1.id_class() && this.id_return()) {
         if (var1.id_native() == rkc_3.DRINK) {
            this.id_class(
               this.id_byte(var1), id_implements[202], ((rYB)this.id_throws[id_native[663]]).id_int.nextFloat() * id_implements[203] + id_implements[204]
            );
         }

         if (var1.id_native() == rkc_3.EAT) {
            this.id_break(var1, var2);
            this.id_class(
               this.id_protected(var1),
               id_implements[205] + id_implements[206] * (float)((Random)this.id_throws[id_native[664]]).nextInt(id_finally[79]),
               (((Random)this.id_throws[id_native[665]]).nextFloat() - ((Random)this.id_throws[id_native[666]]).nextFloat()) * id_implements[207]
                  + id_implements[208]
            );
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
      Boolean var8 = id_break[69];
      this.id_private[id_native[203]] = var8;
      if (var2 && !((rYB)this.id_throws[id_native[204]]).id_continue) {
         rLR var3 = var1.id_class();
         var3.id_class(this, this.BT(), var1.id_byte());
         var3.id_break(this, this.BT(), var1.id_byte());
      }

      rrLI.id_break(this, var1, var2);
   }

   public rjU_2 id_class(double var1, boolean var3, rjU_2 var4) {
      if (!this.rw() && !this.PF()) {
         double var5;
         if (var3 && Math.abs(var4.id_byte - id_protected[105]) >= id_protected[106] && Math.abs(var4.id_byte - var1 / id_protected[107]) < id_protected[108]) {
            var5 = id_protected[109];
         } else {
            var5 = var4.id_byte - var1 / id_protected[110];
         }

         return new rjU_2(var4.id_break, var5, var4.id_protected);
      } else {
         return var4;
      }
   }

   public void id_default() {
      this.id_private();
      if ((Integer)this.id_private[id_native[489]] > 0) {
         Integer var17 = (Integer)this.id_private[id_native[490]] - id_break[162];
         this.id_private[id_native[491]] = var17;
      }

      if (this.id_return()) {
         Integer var18 = (Integer)this.id_private[id_native[492]] + id_break[163];
         this.id_private[id_native[493]] = var18;
      } else {
         Integer var19 = Integer.valueOf(id_break[164]);
         this.id_private[id_native[494]] = var19;
      }

      if (this.BL()) {
         Integer var20 = Integer.valueOf(id_break[165]);
         this.id_private[id_native[495]] = var20;
         Integer var21 = (Integer)this.id_private[id_native[496]] + id_break[166];
         this.id_private[id_native[497]] = var21;
      } else {
         Integer var22 = Integer.valueOf(id_break[167]);
         this.id_private[id_native[498]] = var22;
         Integer var23 = (Integer)this.id_private[id_native[499]] + id_break[168];
         this.id_private[id_native[500]] = var23;
      }

      if (this.Po()) {
         Integer var24 = Integer.valueOf(id_break[169]);
         this.id_private[id_native[501]] = var24;
         this.id_byte(this.rx(), this.re(), this.BO());
      }

      if ((Integer)this.id_private[id_native[502]] > 0) {
         double var1 = this.rx() + ((Double)this.id_private[id_native[503]] - this.rx()) / (double)((Integer)this.id_private[id_native[504]]).intValue();
         double var3 = this.re() + ((Double)this.id_private[id_native[505]] - this.re()) / (double)((Integer)this.id_private[id_native[506]]).intValue();
         double var5 = this.BO() + ((Double)this.id_private[id_native[507]] - this.BO()) / (double)((Integer)this.id_private[id_native[508]]).intValue();
         double var7 = rfU_2.id_case((Double)this.id_private[id_native[509]] - (double)((Float)this.id_throws[id_native[510]]).floatValue());
         Float var25 = (float)(
            (double)((Float)this.id_throws[id_native[511]]).floatValue() + var7 / (double)((Integer)this.id_private[id_native[512]]).intValue()
         );
         this.id_throws[id_native[513]] = var25;
         Float var26 = (float)(
            (double)((Float)this.id_throws[id_native[514]]).floatValue()
               + ((Double)this.id_private[id_native[515]] - (double)((Float)this.id_throws[id_native[516]]).floatValue())
                  / (double)((Integer)this.id_private[id_native[517]]).intValue()
         );
         this.id_throws[id_native[518]] = var26;
         Integer var27 = (Integer)this.id_private[id_native[519]] - id_break[170];
         this.id_private[id_native[520]] = var27;
         this.id_new(var1, var3, var5);
         this.id_case((Float)this.id_throws[id_native[521]], (Float)this.id_throws[id_native[522]]);
      } else if (!this.id_try()) {
         this.id_byte(this.rv().id_class(id_protected[118]));
      }

      if ((Integer)this.id_private[id_native[523]] > 0) {
         Float var28 = (float)(
            (double)((Float)this.id_private[id_native[524]]).floatValue()
               + rfU_2.id_case((Double)this.id_private[id_native[525]] - (double)((Float)this.id_private[id_native[526]]).floatValue())
                  / (double)((Integer)this.id_private[id_native[527]]).intValue()
         );
         this.id_private[id_native[528]] = var28;
         Integer var29 = (Integer)this.id_private[id_native[529]] - id_break[171];
         this.id_private[id_native[530]] = var29;
      }

      rjU_2 var37 = this.rv();
      double var2 = var37.id_break;
      double var4 = var37.id_byte;
      double var6 = var37.id_protected;
      if (Math.abs(var37.id_break) < id_protected[119]) {
         var2 = id_protected[120];
      }

      if (Math.abs(var37.id_byte) < id_protected[121]) {
         var4 = id_protected[122];
      }

      if (Math.abs(var37.id_protected) < id_protected[123]) {
         var6 = id_protected[124];
      }

      this.id_catch(var2, var4, var6);
      if (this.BK()) {
         Boolean var30 = id_break[172];
         this.id_private[id_native[531]] = var30;
         Float var31 = id_implements[184];
         this.id_private[id_native[532]] = var31;
         Float var32 = id_implements[185];
         this.id_private[id_native[533]] = var32;
      } else if (this.id_try()) {
         this.Q();
      }

      if ((Boolean)this.id_private[id_native[534]] && this.sr()) {
         double var8;
         if (this.ry()) {
            var8 = this.id_break(rlG_2.id_byte);
         } else {
            var8 = this.id_break(rlG_2.id_break);
         }

         boolean var10 = this.rT() && var8 > id_protected[125] ? id_break[173] : id_break[174];
         double var11 = this.rI();
         if (!var10 || (Boolean)this.id_throws[id_native[535]] && !(var8 > var11)) {
            if (!this.ry() || (Boolean)this.id_throws[id_native[536]] && !(var8 > var11)) {
               if (((Boolean)this.id_throws[id_native[537]] || var10 && var8 <= var11) && (Integer)this.id_private[id_native[538]] == 0) {
                  this.id_continue(id_break[175]);
               }
            } else {
               this.id_byte(rlG_2.id_byte);
            }
         } else {
            this.id_byte(rlG_2.id_break);
         }
      } else {
         Integer var33 = Integer.valueOf(id_break[176]);
         this.id_private[id_native[539]] = var33;
      }

      Float var34 = (Float)this.id_private[id_native[540]] * id_implements[186];
      this.id_private[id_native[541]] = var34;
      Float var35 = (Float)this.id_private[id_native[542]] * id_implements[187];
      this.id_private[id_native[543]] = var35;
      this.id_super();
      rfl_3 var38 = this.rN();
      this.id_private(
         new rjU_2(
            (double)((Float)this.id_private[id_native[544]]).floatValue(),
            (double)((Float)this.id_private[id_native[545]]).floatValue(),
            (double)((Float)this.id_private[id_native[546]]).floatValue()
         )
      );
      if ((Integer)this.id_private[id_native[547]] > 0) {
         Integer var36 = (Integer)this.id_private[id_native[548]] - id_break[177];
         this.id_private[id_native[549]] = var36;
         this.id_class(var38, this.rN());
      }

      this.SS();
      if (!((rYB)this.id_throws[id_native[550]]).id_continue && this.BU() && this.Pk()) {
         this.id_break(rye_3.id_private, id_implements[188]);
      }
   }

   @Override
   public float t() {
      this.id_private();
      return (Float)this.id_private[id_native[598]];
   }

   @Override
   public void j() {
      this.id_break(rye_3.id_volatile, id_implements[3]);
   }

   public rdn_3 ss() {
      return this.id_class(rXQ.MAINHAND);
   }

   @Override
   public void rf() {
      Boolean var5 = ((Random)this.id_throws[id_native[596]]).nextDouble() >= this.id_class(iQ_2.id_byte) ? id_break[206] : id_break[207];
      this.id_throws[id_native[597]] = var5;
   }

   private void id_void() {
      this.id_private();
      Float var5 = (Float)this.id_private[id_native[626]];
      this.id_private[id_native[627]] = var5;
      if (this.rP()) {
         Float var6 = Math.min(id_implements[198], (Float)this.id_private[id_native[628]] + id_implements[199]);
         this.id_private[id_native[629]] = var6;
      } else {
         Float var7 = Math.max(id_implements[200], (Float)this.id_private[id_native[630]] - id_implements[201]);
         this.id_private[id_native[631]] = var7;
      }
   }

   public void sh() {
   }

   public float id_break(float var1, float var2, float var3) {
      this.id_private();
      float var4 = rfU_2.id_catch(var1 - (Float)this.id_private[id_native[482]]);
      Float var11 = (Float)this.id_private[id_native[483]] + var4 * id_implements[174];
      this.id_private[id_native[484]] = var11;
      float var5 = rfU_2.id_catch(var3 - (Float)this.id_private[id_native[485]]);
      boolean var6 = !(var5 < id_implements[175]) && !(var5 >= id_implements[176]) ? id_break[161] : id_break[160];
      if (var5 < id_implements[177]) {
         var5 = id_implements[178];
      }

      if (var5 >= id_implements[179]) {
         var5 = id_implements[180];
      }

      Float var12 = var3 - var5;
      this.id_private[id_native[486]] = var12;
      if (var5 * var5 > id_implements[181]) {
         Float var13 = (Float)this.id_private[id_native[487]] + var5 * id_implements[182];
         this.id_private[id_native[488]] = var13;
      }

      if (var6) {
         var2 *= id_implements[183];
      }

      return var2;
   }

   public void id_break(rXQ var1) {
      ((rYB)this.id_throws[id_native[718]]).id_class(this, id_throws(var1));
   }

   private void id_break(rXQ var1, rdn_3 var2) {
      this.id_private();
      ((rqs_3)this.id_private[id_native[481]]).set(var1.id_break(), var2);
   }

   public void id_break(rye_3 var1) {
      this.id_private();
      if (!(Boolean)this.id_throws[id_native[250]] && !(Boolean)this.id_private[id_native[251]]) {
         an_3 var2 = var1.id_extends();
         iB_2 var3 = this.Sh();
         if ((Integer)this.id_private[id_native[252]] >= 0 && var3 != null) {
            var3.id_class(this, (Integer)this.id_private[id_native[253]], var1);
         }

         if (this.Sc()) {
            this.SQ();
         }

         Boolean var8 = id_break[99];
         this.id_private[id_native[254]] = var8;
         this.SW().id_throws();
         if ((rYB)this.id_throws[id_native[255]] instanceof rrEm_1) {
            if (var2 != null) {
               var2.id_class((rrEm_1)((rYB)this.id_throws[id_native[256]]), this);
            }

            this.id_protected(var1);
            this.id_class(var3);
         }

         ((rYB)this.id_throws[id_native[257]]).id_class(this, id_finally[39]);
         this.id_class(iM_2.DYING);
      }
   }

   public void id_break(rhd_3 var1) {
      this.id_private();
      this.id_private[id_native[116]] = var1;
      Integer var7 = (Integer)this.id_throws[id_native[117]];
      this.id_private[id_native[118]] = var7;
   }

   private void id_break(rdn_3 var1, int var2) {
      for (int var3 = id_break[224]; var3 < var2; var3++) {
         rjU_2 var4 = new rjU_2(
            ((double)((Random)this.id_throws[id_native[667]]).nextFloat() - id_protected[128]) * id_protected[129],
            Math.random() * id_protected[130] + id_protected[131],
            id_protected[132]
         );
         var4 = var4.id_class(-(Float)this.id_throws[id_native[668]] * id_implements[209]);
         var4 = var4.id_break(-(Float)this.id_throws[id_native[669]] * id_implements[210]);
         double var5 = (double)(-((Random)this.id_throws[id_native[670]]).nextFloat()) * id_protected[133] - id_protected[134];
         rjU_2 var7 = new rjU_2(((double)((Random)this.id_throws[id_native[671]]).nextFloat() - id_protected[135]) * id_protected[136], var5, id_protected[137]);
         var7 = var7.id_class(-(Float)this.id_throws[id_native[672]] * id_implements[211]);
         var7 = var7.id_break(-(Float)this.id_throws[id_native[673]] * id_implements[212]);
         var7 = var7.id_break(this.rx(), this.rH(), this.BO());
         ((rYB)this.id_throws[id_native[674]])
            .id_class(
               new rLk_1(rLQ.id_void, var1), var7.id_break, var7.id_byte, var7.id_protected, var4.id_break, var4.id_byte + id_protected[138], var4.id_protected
            );
      }
   }

   public float id_break(iM_2 var1, ap_3 var2) {
      return super.id_class(var1, var2);
   }

   public rjU_2 id_break(rjU_2 var1, float var2) {
      this.id_private();
      this.id_class(this.id_byte(var2), var1);
      this.id_byte(this.id_finally(this.rv()));
      this.id_class(iG_2.SELF, this.rv());
      rjU_2 var3 = this.rv();
      if (((Boolean)this.id_throws[id_native[397]] || (Boolean)this.id_private[id_native[398]]) && this.o_()) {
         var3 = new rjU_2(var3.id_break, id_protected[104], var3.id_protected);
      }

      return var3;
   }

   public boolean id_break(rLY var1) {
      this.id_private();
      if (!this.id_throws(var1)) {
         return id_break[55];
      } else {
         rLY var2 = (rLY)((Map)this.id_private[id_native[197]]).get(var1.id_class());
         if (var2 == null) {
            ((Map)this.id_private[id_native[198]]).put(var1.id_class(), var1);
            this.id_protected(var1);
            return id_break[56];
         } else if (var2.id_break(var1)) {
            this.id_class(var2, id_break[57]);
            return id_break[58];
         } else {
            return id_break[59];
         }
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      this.id_private();
      if (this.id_class(var1)) {
         return id_break[73];
      } else if (((rYB)this.id_throws[id_native[211]]).id_continue) {
         return id_break[74];
      } else if (this.Sl()) {
         return id_break[75];
      } else if (var1.id_int() && this.id_break(rLD.id_native)) {
         return id_break[76];
      } else {
         if (this.Sc() && !((rYB)this.id_throws[id_native[212]]).id_continue) {
            this.SQ();
         }

         Integer var16 = Integer.valueOf(id_break[77]);
         this.id_private[id_native[213]] = var16;
         float var3 = var2;
         if ((var1 == rye_3.id_new || var1 == rye_3.id_continue) && !this.id_class(rXQ.HEAD).id_class()) {
            this.id_class(rXQ.HEAD)
               .id_class(
                  (int)(var2 * id_implements[32] + ((Random)this.id_throws[id_native[214]]).nextFloat() * var2 * id_implements[33]),
                  this,
                  var0 -> var0.id_break(rXQ.HEAD)
               );
            var2 *= id_implements[34];
         }

         boolean var4 = id_break[78];
         float var5 = id_implements[35];
         if (var2 > id_implements[36] && this.id_case(var1)) {
            this.id_else(var2);
            var5 = var2;
            var2 = id_implements[37];
            if (!var1.id_break()) {
               an_3 var6 = var1.id_finally();
               if (var6 instanceof iB_2) {
                  this.id_protected((iB_2)var6);
               }
            }

            var4 = id_break[79];
         }

         Float var17 = id_implements[38];
         this.id_private[id_native[215]] = var17;
         boolean var33 = id_break[80];
         if ((float)((Integer)this.id_throws[id_native[216]]).intValue() > id_implements[39]) {
            if (var2 <= (Float)this.id_private[id_native[217]]) {
               return id_break[81];
            }

            this.id_class(var1, var2 - (Float)this.id_private[id_native[218]]);
            Float var18 = var2;
            this.id_private[id_native[219]] = var18;
            var33 = id_break[82];
         } else {
            Float var19 = var2;
            this.id_private[id_native[220]] = var19;
            Integer var20 = Integer.valueOf(id_finally[25]);
            this.id_throws[id_native[221]] = var20;
            this.id_class(var1, var2);
            Integer var21 = Integer.valueOf(id_finally[26]);
            this.id_private[id_native[222]] = var21;
            Integer var22 = (Integer)this.id_private[id_native[223]];
            this.id_private[id_native[224]] = var22;
         }

         Float var23 = id_implements[40];
         this.id_private[id_native[225]] = var23;
         an_3 var7 = var1.id_extends();
         if (var7 != null) {
            if (var7 instanceof iB_2) {
               this.id_break((iB_2)var7);
            }

            if (var7 instanceof rhd_3) {
               Integer var24 = Integer.valueOf(id_finally[27]);
               this.id_private[id_native[226]] = var24;
               rhd_3 var25 = (rhd_3)var7;
               this.id_private[id_native[227]] = var25;
            } else if (var7 instanceof rOH var8 && var8.sZ()) {
               Integer var26 = Integer.valueOf(id_finally[28]);
               this.id_private[id_native[228]] = var26;
               iB_2 var9 = var8.sF();
               if (var9 != null && var9.BC() == aI_2.rM) {
                  rhd_3 var27 = (rhd_3)var9;
                  this.id_private[id_native[229]] = var27;
               } else {
                  Object var28 = null;
                  this.id_private[id_native[230]] = var28;
               }
            }
         }

         if (var33) {
            if (var4) {
               ((rYB)this.id_throws[id_native[231]]).id_class(this, id_finally[29]);
            } else if (var1 instanceof rpX_2 && ((rpX_2)var1).id_goto()) {
               ((rYB)this.id_throws[id_native[232]]).id_class(this, id_finally[30]);
            } else {
               byte var34;
               if (var1 == rye_3.id_private) {
                  var34 = id_finally[31];
               } else if (var1.id_int()) {
                  var34 = id_finally[32];
               } else if (var1 == rye_3.id_else) {
                  var34 = id_finally[33];
               } else {
                  var34 = id_finally[34];
               }

               ((rYB)this.id_throws[id_native[233]]).id_class(this, var34);
            }

            if (var1 != rye_3.id_private && (!var4 || var2 > id_implements[41])) {
               this.rf();
            }

            if (var7 != null) {
               double var35 = var7.rx() - this.rx();

               double var10;
               for (var10 = var7.BO() - this.BO(); var35 * var35 + var10 * var10 < id_protected[33]; var10 = (Math.random() - Math.random()) * id_protected[35]) {
                  var35 = (Math.random() - Math.random()) * id_protected[34];
               }

               Float var29 = (float)(rfU_2.id_protected(var10, var35) * id_protected[36] - (double)((Float)this.id_throws[id_native[234]]).floatValue());
               this.id_private[id_native[235]] = var29;
               this.id_class(id_implements[42], var35, var10);
            } else {
               Float var30 = (float)((int)(Math.random() * id_protected[37]) * id_native[236]);
               this.id_private[id_native[237]] = var30;
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

         boolean var37 = var4 && !(var2 > id_implements[43]) ? id_break[84] : id_break[83];
         if (var37) {
            this.id_private[id_native[238]] = var1;
            Long var32 = ((rYB)this.id_throws[id_native[239]]).r();
            this.id_private[id_native[240]] = var32;
         }

         if (this instanceof rhN_2) {
            Oo_1.id_private.id_class((rhN_2)this, var1, var3, var2, var4);
            if (var5 > id_implements[44] && var5 < id_implements[45]) {
               ((rhN_2)this).id_class(rlB_2.id_static, Math.round(var5 * id_implements[46]));
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
         this.id_private[id_native[636]] = var2;
         Integer var8 = (Integer)this.id_private[id_native[637]];
         this.id_private[id_native[638]] = var8;
         Integer var9 = var2.id_extends();
         this.id_private[id_native[639]] = var9;
         if (!((rYB)this.id_throws[id_native[640]]).id_continue) {
            this.id_byte(id_break[219], id_break[220]);
            this.id_byte(id_finally[78], var1 == rpm_3.OFF_HAND ? id_break[221] : id_break[222]);
         }
      }
   }

   private void id_break(Map<rXQ, rdn_3> var1) {
      rdn_3 var2 = (rdn_3)var1.get(rXQ.MAINHAND);
      rdn_3 var3 = (rdn_3)var1.get(rXQ.OFFHAND);
      if (var2 != null && var3 != null && rdn_3.id_break(var2, this.id_protected(rXQ.OFFHAND)) && rdn_3.id_break(var3, this.id_protected(rXQ.MAINHAND))) {
         ((rrEm_1)((rYB)this.id_throws[id_native[476]])).id_else().id_break(this, new rvQ_2(this, id_finally[65]));
         var1.remove(rXQ.MAINHAND);
         var1.remove(rXQ.OFFHAND);
         this.id_break(rXQ.MAINHAND, var2.id_implements());
         this.id_break(rXQ.OFFHAND, var3.id_implements());
      }
   }

   public boolean id_break(xc_3 var1) {
      return var1.id_catch() && !this.Sy() ? id_break[21] : id_break[20];
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

         this.id_class(var2, id_implements[25], id_implements[26]);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_private();
      this.id_return(var1.id_finally(id_class[10]));
      if (var1.id_byte(id_class[11], id_finally[10]) && (rYB)this.id_throws[id_native[137]] != null && !((rYB)this.id_throws[id_native[138]]).id_continue) {
         this.BT().id_class(var1.id_protected(id_class[12], id_finally[11]));
      }

      if (var1.id_byte(id_class[13], id_finally[12])) {
         rcy_3 var2 = var1.id_protected(id_class[14], id_finally[13]);

         for (int var3 = id_break[36]; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.id_class(var3);
            rLY var5 = rLY.id_break(var4);
            if (var5 != null) {
               ((Map)this.id_private[id_native[139]]).put(var5.id_class(), var5);
            }
         }
      }

      if (var1.id_byte(id_class[15], id_finally[14])) {
         this.id_public(var1.id_finally(id_class[16]));
      }

      Integer var10 = Integer.valueOf(var1.id_catch(id_class[17]));
      this.id_private[id_native[140]] = var10;
      Integer var11 = Integer.valueOf(var1.id_catch(id_class[18]));
      this.id_private[id_native[141]] = var11;
      Integer var12 = var1.id_private(id_class[19]);
      this.id_private[id_native[142]] = var12;
      if (var1.id_byte(id_class[20], id_finally[15])) {
         String var14 = var1.id_native(id_class[21]);
         rnB_2 var16 = ((rYB)this.id_throws[id_native[143]]).id_package().id_throws(var14);
         boolean var17 = var16 != null && ((rYB)this.id_throws[id_native[144]]).id_package().id_class(this.rz(), var16) ? id_break[37] : id_break[38];
         if (!var17) {
            ((Logger)id_case[id_native[145]]).warn(id_class[22], var14);
         }
      }

      if (var1.id_new(id_class[23])) {
         this.id_break(id_finally[16], id_break[39]);
      }

      if (var1.id_byte(id_class[24], id_finally[17]) && var1.id_byte(id_class[25], id_finally[18]) && var1.id_byte(id_class[26], id_finally[19])) {
         rfH_2 var15 = new rfH_2(var1.id_private(id_class[27]), var1.id_private(id_class[28]), var1.id_private(id_class[29]));
         this.id_catch(var15);
         ((rmE_2)this.id_throws[id_native[146]]).id_break((rut_3<iM_2>)id_case[id_native[147]], iM_2.SLEEPING);
         if (!(Boolean)this.id_throws[id_native[148]]) {
            this.id_class(var15);
         }
      }

      if (var1.id_byte(id_class[30], id_finally[20])) {
         iZ_2 var13 = this.id_class(new Dynamic(rcf_3.id_class, var1.id_byte(id_class[31])));
         this.id_private[id_native[149]] = var13;
      }
   }

   public boolean id_break(rLR var1) {
      this.id_private();
      return ((Map)this.id_private[id_native[195]]).containsKey(var1);
   }

   public void id_break(iB_2 var1) {
      this.id_private();
      this.id_private[id_native[119]] = var1;
      Integer var7 = (Integer)this.id_throws[id_native[120]];
      this.id_private[id_native[121]] = var7;
   }

   public void id_throws(iB_2 var1) {
      var1.id_class(id_implements[47], var1.rx() - this.rx(), var1.BO() - this.BO());
   }

   public void id_throws(rfH_2 var1) {
      int var2 = eA_2.id_class(eY_2.id_finally, this);
      if (var2 > 0) {
         eD_2.id_class(this, (rYB)this.id_throws[id_native[104]], var1, var2);
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
      switch (((int[])iS_2.id_class[id_native[717]])[var0.ordinal()]) {
         case 1:
            return id_finally[84];
         case 2:
            return id_finally[85];
         case 3:
            return id_finally[86];
         case 4:
            return id_finally[87];
         case 5:
            return id_finally[88];
         case 6:
            return id_finally[89];
         default:
            return id_finally[90];
      }
   }

   public float id_throws(rye_3 var1, float var2) {
      if (var1.id_implements()) {
         return var2;
      } else {
         if (this.id_break(rLD.id_extends) && var1 != rye_3.id_volatile) {
            int var3 = (this.id_byte(rLD.id_extends).id_byte() + id_break[119]) * id_finally[43];
            int var4 = id_finally[44] - var3;
            float var5 = var2 * (float)var4;
            float var6 = var2;
            var2 = Math.max(var5 / id_implements[62], id_implements[63]);
            float var7 = var6 - var2;
            if (var7 > id_implements[64] && var7 < id_implements[65]) {
               if (this instanceof rhN_2) {
                  ((rhN_2)this).id_class(rlB_2.id_short, Math.round(var7 * id_implements[66]));
               } else if (var1.id_extends() instanceof rhN_2) {
                  ((rhN_2)var1.id_extends()).id_class(rlB_2.id_float, Math.round(var7 * id_implements[67]));
               }
            }
         }

         if (var2 <= id_implements[68]) {
            return id_implements[69];
         } else {
            int var8 = eA_2.id_class(this.PV(), var1);
            if (var8 > 0) {
               var2 = ryg_3.id_class(var2, (float)var8);
            }

            return var2;
         }
      }
   }

   @Override
   public float id_throws(float var1) {
      this.id_private();
      return var1 == id_implements[193]
         ? (Float)this.id_private[id_native[588]]
         : rfU_2.id_catch(var1, (Float)this.id_private[id_native[589]], (Float)this.id_private[id_native[590]]);
   }

   public boolean id_throws(rLY var1) {
      if (this.sG() != aL_2.id_break) {
         return id_break[62];
      } else {
         rLR var2 = var1.id_class();
         return var2 != rLD.id_finally && var2 != rLD.id_super ? id_break[60] : id_break[61];
      }
   }

   public boolean id_throws(rdn_3 var1) {
      return id_break[244];
   }

   public void Sm() {
      this.id_byte(this.rv().id_break(id_protected[53], id_protected[54], id_protected[55]));
   }

   public boolean Sc() {
      return this.Bg().isPresent();
   }

   public void Sk() {
      this.id_private();
      Iterator var1 = ((Map)this.id_private[id_native[150]]).keySet().iterator();

      try {
         while (var1.hasNext()) {
            rLR var2 = (rLR)var1.next();
            rLY var3 = (rLY)((Map)this.id_private[id_native[151]]).get(var2);
            if (!var3.id_class(this, () -> this.id_class(var3, id_break[254]))) {
               if (!((rYB)this.id_throws[id_native[152]]).id_continue) {
                  var1.remove();
                  this.id_class(var3);
               }
            } else if (var3.id_break() % id_native[153] == 0) {
               this.id_class(var3, id_break[40]);
            }
         }
      } catch (ConcurrentModificationException var17) {
      }

      if ((Boolean)this.id_private[id_native[154]]) {
         if (!((rYB)this.id_throws[id_native[155]]).id_continue) {
            this.SA();
         }

         Boolean var14 = id_break[41];
         this.id_private[id_native[156]] = var14;
      }

      Integer var15 = (Integer)this.id_private[id_native[157]];
      this.id_private[id_native[158]] = var15;
      Integer var16 = ((rmE_2)this.id_throws[id_native[159]]).<Integer>id_class((rut_3<Integer>)id_catch[id_native[160]]);
      this.id_private[id_native[161]] = var16;
      boolean var18 = ((rmE_2)this.id_throws[id_native[162]]).<Boolean>id_class((rut_3<Boolean>)id_catch[id_native[163]]);
      if ((Integer)this.id_private[id_native[164]] > 0) {
         boolean var19;
         if (this.Pp()) {
            var19 = ((Random)this.id_throws[id_native[165]]).nextInt(id_finally[21]) == 0 ? id_break[42] : id_break[43];
         } else {
            var19 = ((Random)this.id_throws[id_native[166]]).nextBoolean();
         }

         if (var18) {
            var19 &= ((Random)this.id_throws[id_native[167]]).nextInt(id_finally[22]) == 0 ? id_break[44] : id_break[45];
         }

         if (var19 && (Integer)this.id_private[id_native[168]] > 0) {
            double var4 = (double)((Integer)this.id_private[id_native[169]] >> id_finally[23] & id_native[170]) / id_protected[24];
            double var6 = (double)((Integer)this.id_private[id_native[171]] >> id_finally[24] & id_native[172]) / id_protected[25];
            double var8 = (double)((Integer)this.id_private[id_native[173]] & id_native[174]) / id_protected[26];
            ((rYB)this.id_throws[id_native[175]])
               .id_class(var18 ? rLQ.id_class : rLQ.id_else, this.id_break(id_protected[27]), this.Ph(), this.id_protected(id_protected[28]), var4, var6, var8);
         }
      } else if (((rYB)this.id_throws[id_native[176]]).id_continue
         && this != (cb_3)QY.id_instanceof().id_class[id_native[177]]
         && !((Map)this.id_private[id_native[178]]).isEmpty()
         && (Integer)this.id_private[id_native[179]] > 0) {
         Iterator var20 = ((Map)this.id_private[id_native[180]]).values().iterator();

         while (var20.hasNext()) {
            rLY var21 = (rLY)var20.next();
            this.id_class(var21);
            var20.remove();
         }
      }
   }

   public Collection<rLY> So() {
      this.id_private();
      return ((Map)this.id_private[id_native[193]]).values();
   }

   public rpm_3 P() {
      return (((rmE_2)this.id_throws[id_native[606]]).<Byte>id_class((rut_3<Byte>)id_catch[id_native[607]]) & id_finally[73]) > 0
         ? rpm_3.OFF_HAND
         : rpm_3.MAIN_HAND;
   }

   public int BD() {
      this.id_private();
      return (Integer)this.id_private[id_native[702]];
   }

   private rjU_2 id_finally(rjU_2 var1) {
      if (this.o_()) {
         Float var12 = id_implements[138];
         this.id_throws[id_native[399]] = var12;
         double var2 = rfU_2.id_class(var1.id_break, id_protected[111], id_protected[112]);
         double var4 = rfU_2.id_class(var1.id_protected, id_protected[113], id_protected[114]);
         double var6 = Math.max(var1.id_byte, id_protected[115]);
         if (var6 < id_protected[116] && !this.sS().id_class(xu_3.hU) && this.id_transient() && this instanceof rhd_3) {
            var6 = id_protected[117];
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
      ((rmE_2)this.id_throws[id_native[707]]).id_break((rut_3<Optional<rfH_2>>)id_catch[id_native[708]], Optional.of(var1));
   }

   private void id_catch(rdn_3 var1) {
      if (!var1.id_class()) {
         if (!this.BF()) {
            ((rYB)this.id_throws[id_native[248]])
               .id_class(
                  this.rx(),
                  this.re(),
                  this.BO(),
                  rqn_3.Eg,
                  this.Pr(),
                  id_implements[50],
                  id_implements[51] + ((rYB)this.id_throws[id_native[249]]).id_int.nextFloat() * id_implements[52],
                  id_break[98]
               );
         }

         this.id_break(var1, id_finally[38]);
      }
   }

   private boolean id_catch(rye_3 var1) {
      if (var1.id_private()) {
         return id_break[85];
      } else {
         rdn_3 var2 = null;
         rpm_3[] var3 = rpm_3.values();
         int var4 = var3.length;

         for (int var5 = id_break[86]; var5 < var4; var5++) {
            rpm_3 var6 = var3[var5];
            rdn_3 var7 = this.id_protected(var6);
            if (var7.id_break() == rdy_3.kL) {
               var2 = var7.id_implements();
               var7.id_catch(id_break[87]);
               break;
            }
         }

         if (var2 != null) {
            if (this instanceof rhN_2 var8) {
               var8.id_class(rlB_2.id_byte.id_break(rdy_3.kL));
               Oo_1.id_instanceof.id_class(var8, var2);
            }

            this.id_public(id_implements[48]);
            this.SY();
            this.id_break(new rLY(rLD.id_finally, id_native[241], id_break[88]));
            this.id_break(new rLY(rLD.id_synchronized, id_finally[35], id_break[89]));
            this.id_break(new rLY(rLD.id_native, id_native[242], id_break[90]));
            ((rYB)this.id_throws[id_native[243]]).id_class(this, id_finally[36]);
         }

         return var2 != null ? id_break[91] : id_break[92];
      }
   }

   public rfl_3 id_catch(iM_2 var1) {
      ap_3 var2 = this.a_(var1);
      return new rfl_3(
         (double)(-var2.id_class / id_implements[213]),
         id_protected[140],
         (double)(-var2.id_class / id_implements[214]),
         (double)(var2.id_class / id_implements[215]),
         (double)var2.id_break,
         (double)(var2.id_class / id_implements[216])
      );
   }

   public boolean id_catch(iB_2 var1) {
      return id_break[47];
   }

   public boolean id_extends(int var1) {
      this.id_private();
      if (this.id_return() && !((rdn_3)this.id_private[id_native[697]]).id_class()) {
         rdb_3 var2 = ((rdn_3)this.id_private[id_native[698]]).id_break();
         if (var2.id_byte((rdn_3)this.id_private[id_native[699]]) != rkc_3.BLOCK) {
            return id_break[230];
         } else {
            return var2.id_break((rdn_3)this.id_private[id_native[700]]) - this.id_private[id_native[701]] >= var1 ? id_break[231] : id_break[232];
         }
      } else {
         return id_break[233];
      }
   }

   private boolean id_goto() {
      return this.Bg().map(var1 -> ((rYB)this.id_throws[id_native[736]]).id_byte(var1).id_break() instanceof xb_3).orElse(id_break[247]);
   }

   public float id_goto(float var1) {
      this.id_private();
      float var2 = (Float)this.id_private[id_native[591]] - (Float)this.id_private[id_native[592]];
      if (var2 < id_implements[194]) {
         var2 += id_implements[195];
      }

      return (Float)this.id_private[id_native[593]] + var2 * var1;
   }

   public double id_goto(an_3 var1) {
      double var2 = id_protected[29];
      if (this.Pw()) {
         var2 *= id_protected[30];
      }

      if (this.Pp()) {
         float var4 = this.Bp();
         if (var4 < id_implements[27]) {
            var4 = id_implements[28];
         }

         var2 *= id_protected[31] * (double)var4;
      }

      if (var1 != null) {
         rdn_3 var7 = this.id_class(rXQ.HEAD);
         rdb_3 var5 = var7.id_break();
         aI_2 var6 = var1.BC();
         if (var6 == aI_2.A && var5 == rdy_3.dh || var6 == aI_2.rs && var5 == rdy_3.dx || var6 == aI_2.id_volatile && var5 == rdy_3.dd) {
            var2 *= id_protected[32];
         }
      }

      return var2;
   }

   public rdn_3 id_case(rdn_3 var1) {
      return rdn_3.id_break;
   }

   private boolean id_case(rye_3 var1) {
      an_3 var2 = var1.id_finally();
      boolean var3 = id_break[93];
      if (var2 instanceof rhm_3 var4 && var4.id_package() > 0) {
         var3 = id_break[94];
      }

      if (!var1.id_case() && this.id_extends(id_finally[37]) && !var3) {
         rjU_2 var7 = var1.id_return();
         if (var7 != null) {
            rjU_2 var5 = this.id_break(id_implements[49]);
            rjU_2 var6 = var7.id_class(this.Ps()).id_protected();
            var6 = new rjU_2(var6.id_break, id_protected[38], var6.id_protected);
            return var6.id_break(var5) < id_protected[39] ? id_break[95] : id_break[96];
         }
      }

      return id_break[97];
   }

   public void id_case(rfH_2 var1) {
      if (this.Pm()) {
         this.BH();
      }

      xc_3 var2 = ((rYB)this.id_throws[id_native[711]]).id_byte(var1);
      if (var2.id_break() instanceof xb_3) {
         ((rYB)this.id_throws[id_native[712]]).id_class(var1, var2.id_class(xb_3.id_final, Boolean.valueOf(id_break[245])), id_finally[83]);
      }

      this.id_class(iM_2.SLEEPING);
      this.id_class(var1);
      this.id_catch(var1);
      this.id_byte(rjU_2.id_class);
      Boolean var7 = id_break[246];
      this.id_throws[id_native[713]] = var7;
   }

   private rdn_3 id_case(rXQ var1) {
      this.id_private();
      return (rdn_3)((rqs_3)this.id_private[id_native[478]]).get(var1.id_break());
   }

   public void id_case(iB_2 var1) {
   }

   private static void id_continue() {
      id_native = new short[]{
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

   private static int id_continue(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -995155577;
   }

   public void id_continue(boolean var1) {
      this.id_private();
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_native[363]]).id_class(this);
      float var2;
      float var3;
      int var4;
      if (var1 && this == (cb_3)QY.id_instanceof().id_class[id_native[364]]) {
         rrAS var5 = rrAS.id_class(this.sO(), id_finally[55], id_implements[107]);
         if (var5.id_byte()) {
            return;
         }

         var2 = var5.id_protected();
         var3 = var5.id_class();
         var4 = var5.id_break();
      } else {
         var2 = this.sO();
         var3 = id_implements[108];
         var4 = id_finally[56];
      }

      float var14 = this.ST();
      if (this.id_break(rLD.id_private)) {
         var14 += id_implements[109] * (float)(this.id_byte(rLD.id_private).id_byte() + id_break[143]);
      }

      rjU_2 var6 = this.rv();
      this.id_catch(var6.id_break, (double)var14, var6.id_protected);
      if (this.PF()) {
         float var7 = var2 * id_implements[110];
         this.id_byte(this.rv().id_break((double)(-rfU_2.id_class(var7) * var3), id_protected[52], (double)(rfU_2.id_break(var7) * var3)));
      }

      Boolean var12 = id_break[144];
      this.id_throws[id_native[365]] = var12;
      Integer var13 = var4;
      this.id_private[id_native[366]] = var13;
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

   @Override
   public void id_implements(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_private[id_native[599]] = var6;
   }

   public int id_implements(float var1, float var2) {
      rLY var3 = this.id_byte(rLD.id_private);
      float var4 = var3 == null ? id_implements[57] : (float)(var3.id_byte() + id_break[118]);
      return rfU_2.id_case((var1 - id_implements[58] - var4) * var2);
   }

   public static rjU_2 id_implements(rjU_2 var0) {
      return new rjU_2(var0.id_break, var0.id_byte, id_protected[127]);
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
      var0[2] = new ix_3((UUID)var0[0], id_class[38], 0.3F, Enum.valueOf(id_3.class, "MULTIPLY_TOTAL"));
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
      var1.id_byte(this);
   }

   public int id_new(int var1) {
      return Math.min(var1 + id_finally[9], this.ri());
   }

   private static void id_new() {
      id_protected = new double[]{
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

   public void id_package(int var1) {
      ((rmE_2)this.id_throws[id_native[308]]).id_break((rut_3<Integer>)id_catch[id_native[309]], var1);
   }

   private static void id_package() {
      id_implements = new float[]{
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

   public boolean id_return() {
      return (((rmE_2)this.id_throws[id_native[604]]).<Byte>id_class((rut_3<Byte>)id_catch[id_native[605]]) & id_break[209]) > 0
         ? id_break[210]
         : id_break[211];
   }

   public void id_return(float var1) {
      this.id_private();
      if (var1 < id_implements[196]) {
         var1 = id_implements[197];
      }

      Float var6 = var1;
      this.id_private[id_native[602]] = var6;
   }

   public void id_super(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_private[id_native[403]] = var6;
   }

   public void id_super(boolean var1) {
      this.id_private();
      Boolean var6 = var1;
      this.id_private[id_native[581]] = var6;
   }

   private void id_super() {
      this.id_private();
      boolean var1 = this.id_finally(id_finally[66]);
      if (var1 && !(Boolean)this.id_throws[id_native[551]] && !this.Pm() && !this.id_break(rLD.id_goto)) {
         rdn_3 var2 = this.id_class(rXQ.CHEST);
         if (var2.id_break() == rdy_3.kc && rxH_2.id_protected(var2)) {
            var1 = id_break[179];
            if (!((rYB)this.id_throws[id_native[552]]).id_continue && ((Integer)this.id_private[id_native[553]] + id_break[180]) % id_finally[67] == 0) {
               var2.id_class(id_break[181], this, var0 -> var0.id_break(rXQ.CHEST));
            }
         } else {
            var1 = id_break[182];
         }
      } else {
         var1 = id_break[183];
      }

      if (!((rYB)this.id_throws[id_native[554]]).id_continue) {
         this.id_break(id_finally[68], var1);
      }
   }

   public PX id_switch() {
      return this.rO();
   }

   public void id_throw() {
      this.id_private();
      if (!((rYB)this.id_throws[id_native[691]]).id_continue) {
         this.id_byte(id_break[226], id_break[227]);
      }

      rdn_3 var5 = rdn_3.id_break;
      this.id_private[id_native[692]] = var5;
      Integer var6 = (Integer)this.id_private[id_native[693]];
      this.id_private[id_native[694]] = var6;
      Integer var7 = Integer.valueOf(id_break[228]);
      this.id_private[id_native[695]] = var7;
      Integer var8 = Integer.valueOf(id_break[229]);
      this.id_private[id_native[696]] = var8;
   }

   public void id_try(an_3 var1) {
      this.id_private();
      if (var1 instanceof iB_2 var6) {
         this.id_private[id_native[124]] = var6;
      } else {
         Object var7 = null;
         this.id_private[id_native[125]] = var7;
      }

      Integer var8 = (Integer)this.id_throws[id_native[126]];
      this.id_private[id_native[127]] = var8;
   }

   public boolean id_try() {
      return !((rYB)this.id_throws[id_native[594]]).id_continue ? id_break[200] : id_break[201];
   }

   public boolean id_while() {
      return this.id_throws[id_native[93]] % id_finally[6] == 0
            && this.rv().id_break != id_protected[11]
            && this.rv().id_protected != id_protected[12]
            && !this.id_native()
            && eA_2.id_finally(this)
            && this.Be()
         ? id_break[18]
         : id_break[19];
   }

   public boolean id_while(an_3 var1) {
      rjU_2 var2 = new rjU_2(this.rx(), this.rH(), this.BO());
      rjU_2 var3 = new rjU_2(var1.rx(), var1.rH(), var1.BO());
      return ((rYB)this.id_throws[id_native[586]]).id_class(new rjB_2(var2, var3, rjS_2.COLLIDER, rjs_3.NONE, this)).id_byte() == rjM_2.MISS
         ? id_break[196]
         : id_break[197];
   }

   private static void id_static() {
      id_break = new boolean[]{
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

   public void id_public(float var1) {
      ((rmE_2)this.id_throws[id_native[209]]).id_break((rut_3<Float>)id_catch[id_native[210]], rfU_2.id_class(var1, id_implements[30], this.SK()));
   }

   private static void id_public() {
      id_extends = new long[]{40L, 0L};
   }

   public boolean id_public(an_3 var1) {
      this.id_try(var1);
      return id_break[150];
   }

   private rdn_3 id_protected(rXQ var1) {
      this.id_private();
      return (rdn_3)((rqs_3)this.id_private[id_native[480]]).get(var1.id_break());
   }

   public void id_protected(float var1) {
      float var2 = this.Ss();
      if (var2 > id_implements[29]) {
         this.id_public(var2 + var1);
      }
   }

   public boolean id_protected(rLR var1) {
      rLY var2 = this.id_class(var1);
      if (var2 != null) {
         this.id_class(var2);
         return id_break[66];
      } else {
         return id_break[67];
      }
   }

   public void id_protected(rLY var1) {
      this.id_private();
      Boolean var6 = id_break[68];
      this.id_private[id_native[201]] = var6;
      if (!((rYB)this.id_throws[id_native[202]]).id_continue) {
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
         var3 = id_break[102];
      }

      boolean var4 = this.id_private[id_native[265]] > 0 ? id_break[103] : id_break[104];
      if (this.SX() && ((rYB)this.id_throws[id_native[266]]).B().id_break(rRu_1.id_throws)) {
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
         this.id_private = new Object[id_finally[101]];
         Object[] var1 = this.id_private;
         var1[id_finally[102]] = id_break[258];
         var1[id_finally[103]] = Integer.valueOf(id_break[259]);
         var1[id_finally[104]] = Integer.valueOf(id_break[260]);
         var1[id_finally[105]] = Integer.valueOf(id_break[261]);
         var1[id_finally[106]] = Integer.valueOf(id_break[262]);
         var1[id_finally[107]] = Integer.valueOf(id_break[263]);
         var1[id_finally[108]] = id_implements[224];
         var1[id_finally[109]] = Integer.valueOf(id_break[264]);
         var1[id_finally[110]] = id_implements[225];
         var1[id_finally[111]] = id_implements[226];
         var1[id_finally[112]] = Integer.valueOf(id_break[265]);
         var1[id_finally[113]] = id_implements[227];
         var1[id_finally[114]] = id_implements[228];
         var1[id_finally[115]] = id_implements[229];
         var1[id_finally[116]] = Integer.valueOf(id_finally[117]);
         var1[id_finally[118]] = id_implements[230];
         var1[id_finally[119]] = id_implements[231];
         var1[id_finally[120]] = id_implements[232];
         var1[id_finally[121]] = id_implements[233];
         var1[id_finally[122]] = id_implements[234];
         var1[id_finally[123]] = id_implements[235];
         var1[id_finally[124]] = id_implements[236];
         var1[id_finally[125]] = id_implements[237];
         var1[id_finally[126]] = id_implements[238];
         var1[id_finally[127]] = Integer.valueOf(id_break[266]);
         var1[id_finally[128]] = id_break[267];
         var1[id_finally[129]] = Integer.valueOf(id_break[268]);
         var1[id_finally[130]] = id_implements[239];
         var1[id_finally[131]] = id_implements[240];
         var1[id_finally[132]] = id_implements[241];
         var1[id_finally[133]] = id_implements[242];
         var1[id_finally[134]] = id_implements[243];
         var1[id_finally[135]] = Integer.valueOf(id_break[269]);
         var1[id_finally[136]] = id_implements[244];
         var1[id_finally[137]] = id_break[270];
         var1[id_finally[138]] = id_implements[245];
         var1[id_finally[139]] = id_implements[246];
         var1[id_finally[140]] = id_implements[247];
         var1[id_finally[141]] = Integer.valueOf(id_break[271]);
         var1[id_finally[142]] = id_protected[153];
         var1[id_finally[143]] = id_protected[154];
         var1[id_finally[144]] = id_protected[155];
         var1[id_finally[145]] = id_protected[156];
         var1[id_finally[146]] = id_protected[157];
         var1[id_finally[147]] = id_protected[158];
         var1[id_finally[148]] = Integer.valueOf(id_break[272]);
         var1[id_finally[149]] = id_break[273];
         var1[id_finally[150]] = Integer.valueOf(id_break[274]);
         var1[id_finally[151]] = Integer.valueOf(id_break[275]);
         var1[id_finally[152]] = id_implements[248];
         var1[id_finally[153]] = Integer.valueOf(id_break[276]);
         var1[id_finally[154]] = id_implements[249];
         var1[id_finally[155]] = Integer.valueOf(id_break[277]);
         var1[id_finally[156]] = Integer.valueOf(id_break[278]);
         var1[id_finally[157]] = Integer.valueOf(id_break[279]);
         var1[id_finally[158]] = id_extends[1];
         var1[id_finally[159]] = Integer.valueOf(id_break[280]);
         var1[id_finally[160]] = id_implements[250];
         var1[id_finally[161]] = id_implements[251];
         var1[id_finally[162]] = Integer.valueOf(id_break[281]);
         var1[id_finally[163]] = Integer.valueOf(id_break[282]);
         var1[id_finally[164]] = id_break[283];
         var1[id_finally[165]] = Integer.valueOf(id_break[284]);
         var1[id_finally[166]] = Integer.valueOf(id_break[285]);
         var1[id_finally[167]] = Integer.valueOf(id_break[286]);
         var1[id_finally[168]] = Integer.valueOf(id_break[287]);
      }
   }

   public void id_private(rjU_2 var1) {
      if (this.id_try() || this.Po()) {
         double var2 = id_protected[59];
         boolean var4 = this.rv().id_byte <= id_protected[60] ? id_break[146] : id_break[147];
         if (var4 && this.id_break(rLD.id_instanceof)) {
            var2 = id_protected[61];
            Float var25 = id_implements[112];
            this.id_throws[id_native[367]] = var25;
         }

         rXE var5 = ((rYB)this.id_throws[id_native[368]]).id_break(this.Bs());
         if (this.rT() && this.sr() && !this.id_class(var5.id_class())) {
            double var31 = this.re();
            int var36 = eA_2.id_throws(this);
            float var38 = id_implements[113];
            float var39 = id_implements[114];
            float var40 = id_implements[115];
            if (this == (cb_3)QY.id_instanceof().id_class[id_native[369]]) {
               rrLd_1 var41 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[370]])
                  .id_finally()
                  .id_class(rrLd_1.id_class(id_implements[116], var36));
               var40 = var41.id_break();
               var36 = var41.id_class();
            }

            float var42 = this.PF() ? var38 : this.Bf();
            float var43 = var40;
            float var14 = (float)var36;
            if (var14 > id_implements[117]) {
               var14 = id_implements[118];
            }

            if (!(Boolean)this.id_throws[id_native[371]]) {
               var14 *= id_implements[119];
            }

            if (var14 > id_implements[120]) {
               var42 += (var39 - var42) * var14 / id_implements[121];
               var43 = var40 + (this.sB() - var40) * var14 / id_implements[122];
            }

            if (this.id_break(rLD.id_interface)) {
               var42 = id_implements[123];
            }

            this.id_class(var43, var1);
            this.id_class(iG_2.SELF, this.rv());
            rjU_2 var45 = this.rv();
            if ((Boolean)this.id_throws[id_native[372]] && this.o_()) {
               var45 = new rjU_2(var45.id_break, id_protected[62], var45.id_protected);
            }

            this.id_byte(var45.id_throws((double)var42, id_protected[63], (double)var42));
            rjU_2 var48 = this.id_class(var2, var4, this.rv());
            this.id_byte(var48);
            if ((Boolean)this.id_throws[id_native[373]]
               && this.id_finally(var48.id_break, var48.id_byte + id_protected[64] - this.re() + var31, var48.id_protected)) {
               this.id_catch(var48.id_break, id_protected[65], var48.id_protected);
            }
         } else if (this.ry() && this.sr() && !this.id_class(var5.id_class())) {
            double var30 = this.re();
            this.id_class(id_implements[124], var1);
            this.id_class(iG_2.SELF, this.rv());
            if (this.id_break(rlG_2.id_byte) <= this.rI()) {
               this.id_byte(this.rv().id_throws(id_protected[66], id_protected[67], id_protected[68]));
               rjU_2 var34 = this.id_class(var2, var4, this.rv());
               this.id_byte(var34);
            } else {
               this.id_byte(this.rv().id_class(id_protected[69]));
            }

            if (!this.rw()) {
               this.id_byte(this.rv().id_break(id_protected[70], -var2 / id_protected[71], id_protected[72]));
            }

            rjU_2 var35 = this.rv();
            if ((Boolean)this.id_throws[id_native[374]]
               && this.id_finally(var35.id_break, var35.id_byte + id_protected[73] - this.re() + var30, var35.id_protected)) {
               this.id_catch(var35.id_break, id_protected[74], var35.id_protected);
            }
         } else if (this.Sy()) {
            rjU_2 var6 = this.rv();
            if (var6.id_byte > id_protected[75]) {
               Float var26 = id_implements[125];
               this.id_throws[id_native[375]] = var26;
            }

            rjU_2 var7 = this.m();
            float var8 = this.Bo() * id_implements[126];
            double var9 = Math.sqrt(var7.id_break * var7.id_break + var7.id_protected * var7.id_protected);
            double var11 = Math.sqrt(id_case(var6));
            double var13 = var7.id_case();
            float var15 = rfU_2.id_break(var8);
            var15 = (float)((double)var15 * (double)var15 * Math.min(id_protected[76], var13 / id_protected[77]));
            var6 = this.rv().id_break(id_protected[78], var2 * (id_protected[79] + (double)var15 * id_protected[80]), id_protected[81]);
            if (var6.id_byte < id_protected[82] && var9 > id_protected[83]) {
               double var16 = var6.id_byte * id_protected[84] * (double)var15;
               var6 = var6.id_break(var7.id_break * var16 / var9, var16, var7.id_protected * var16 / var9);
            }

            if (var8 < id_implements[127] && var9 > id_protected[85]) {
               double var46 = var11 * (double)(-rfU_2.id_class(var8)) * id_protected[86];
               var6 = var6.id_break(-var7.id_break * var46 / var9, var46 * id_protected[87], -var7.id_protected * var46 / var9);
            }

            if (var9 > id_protected[88]) {
               var6 = var6.id_break(
                  (var7.id_break / var9 * var11 - var6.id_break) * id_protected[89],
                  id_protected[90],
                  (var7.id_protected / var9 * var11 - var6.id_protected) * id_protected[91]
               );
            }

            this.id_byte(var6.id_throws(id_protected[92], id_protected[93], id_protected[94]));
            this.id_class(iG_2.SELF, this.rv());
            if ((Boolean)this.id_throws[id_native[376]] && !((rYB)this.id_throws[id_native[377]]).id_continue) {
               double var47 = Math.sqrt(id_case(this.rv()));
               double var18 = var11 - var47;
               float var20 = (float)(var18 * id_protected[95] - id_protected[96]);
               if (var20 > id_implements[128]) {
                  this.id_class(this.id_byte((int)var20), id_implements[129], id_implements[130]);
                  this.id_break(rye_3.id_native, var20);
               }
            }

            if ((Boolean)this.id_throws[id_native[378]] && !((rYB)this.id_throws[id_native[379]]).id_continue) {
               this.id_break(id_finally[57], id_break[148]);
            }
         } else {
            rfH_2 var29 = this.PI();
            float var32 = ((rYB)this.id_throws[id_native[380]]).id_byte(var29).id_break().id_final();
            float var33 = this.id_throws[id_native[381]] ? var32 * id_implements[131] : id_implements[132];
            rjU_2 var37 = this.id_break(var1, var32);
            double var10 = var37.id_byte;
            if (this.id_break(rLD.id_goto)) {
               double var12 = id_protected[97];
               if (this instanceof cb_3) {
                  var12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[382]])
                     .id_finally()
                     .id_class(rrAs_1.id_class(this.id_byte(rLD.id_goto), var12))
                     .id_break();
               }

               var10 += (var12 * (double)(this.id_byte(rLD.id_goto).id_byte() + id_break[149]) - var37.id_byte) * id_protected[98];
               Float var27 = id_implements[133];
               this.id_throws[id_native[383]] = var27;
            } else if (((rYB)this.id_throws[id_native[384]]).id_continue && !((rYB)this.id_throws[id_native[385]]).id_int(var29)) {
               if (this.re() > id_protected[99]) {
                  var10 = id_protected[100];
               } else {
                  var10 = id_protected[101];
               }
            } else if (!this.rw()) {
               var10 -= var2;
            }

            this.id_catch(var37.id_break * (double)var33, var10 * id_protected[102], var37.id_protected * (double)var33);
         }
      }

      this.id_class(this, this instanceof rMm_1);
   }

   private void id_final() {
      this.id_private();
      if (this.id_return()) {
         rpm_3 var1 = this.P();
         rdn_3 var2 = this.id_protected(var1);
         if (!((rdn_3)this.id_private[id_native[608]]).id_class() && !rdn_3.id_protected(var2, (rdn_3)this.id_private[id_native[609]])) {
            this.id_throw();
         } else {
            if (((rdn_3)this.id_private[id_native[610]]).id_class()) {
               Integer var7 = (Integer)this.id_private[id_native[611]];
               this.id_private[id_native[612]] = var7;
               Integer var8 = var2.id_extends();
               this.id_private[id_native[613]] = var8;
            }

            this.id_private[id_native[614]] = var2;
            ((rdn_3)this.id_private[id_native[615]]).id_break((rYB)this.id_throws[id_native[616]], this, this.SH());
            if (this.id_char()) {
               this.id_class((rdn_3)this.id_private[id_native[617]], id_finally[74]);
            }

            Integer var10 = (Integer)this.id_private[id_native[618]];
            this.id_private[id_native[619]] = var10;
            int var10002 = (Integer)this.id_private[id_native[620]] - id_break[212];
            Integer var11 = var10002;
            this.id_private[id_native[621]] = var11;
            if (var10002 == 0 && !((rYB)this.id_throws[id_native[622]]).id_continue && !((rdn_3)this.id_private[id_native[623]]).id_volatile()) {
               this.sP();
            }
         }
      }
   }

   public int id_final(int var1) {
      int var2 = eA_2.id_protected(this);
      return var2 > 0 && ((Random)this.id_throws[id_native[112]]).nextInt(var2 + id_break[32]) > 0 ? var1 : var1 - id_break[33];
   }

   public boolean id_transient() {
      return this.h();
   }

   public void id_volatile(int var1) {
      this.id_private();
      Integer var6 = var1;
      this.id_private[id_native[564]] = var6;
      if (!((rYB)this.id_throws[id_native[565]]).id_continue) {
         this.id_byte(id_finally[71], id_break[193]);
      }
   }

   public float id_synchronized(float var1) {
      this.id_private();
      return rfU_2.id_catch(var1, (Float)this.id_private[id_native[41]], (Float)this.id_private[id_native[42]]);
   }

   @Override
   public void id_native(float var1) {
      this.id_private();
      Float var6 = var1;
      this.id_private[id_native[600]] = var6;
   }

   public void id_native(int var1) {
      this.id_private();
      Integer var6 = var1;
      this.id_private[id_native[129]] = var6;
   }

   public boolean sr() {
      return id_break[24];
   }

   @Override
   public void A() {
      this.id_private();
      super.A();
      Float var5 = (Float)this.id_private[id_native[569]];
      this.id_private[id_native[570]] = var5;
      Float var6 = id_implements[190];
      this.id_private[id_native[571]] = var6;
      Float var7 = id_implements[191];
      this.id_throws[id_native[572]] = var7;
   }

   public int SH() {
      this.id_private();
      return (Integer)this.id_private[id_native[682]];
   }

   public void Q() {
   }

   @Override
   public float rq() {
      return this.Be() && eA_2.id_class(eY_2.id_native, this) > 0 ? id_implements[18] : super.rq();
   }

   public boolean SG() {
      return id_break[35];
   }

   @Override
   public void Pn() {
      this.id_private();
      Float var15 = (Float)this.id_private[id_native[43]];
      this.id_private[id_native[44]] = var15;
      if ((Boolean)this.id_throws[id_native[45]]) {
         this.Bg().ifPresent(this::id_class);
      }

      if (this.id_while()) {
         this.Sv();
      }

      super.Pn();
      boolean var1 = this instanceof rhd_3;
      if (this.BM()) {
         if (this.Bz()) {
            this.id_break(rye_3.id_case, id_implements[10]);
         } else if (var1 && !((rYB)this.id_throws[id_native[46]]).id_instanceof().id_class(this.rN())) {
            double var2 = ((rYB)this.id_throws[id_native[47]]).id_instanceof().id_class(this) + ((rYB)this.id_throws[id_native[48]]).id_instanceof().id_final();
            if (var2 < id_protected[9]) {
               double var4 = ((rYB)this.id_throws[id_native[49]]).id_instanceof().id_package();
               if (var4 > id_protected[10]) {
                  this.id_break(rye_3.id_case, (float)Math.max(id_break[10], rfU_2.id_byte(-var2 * var4)));
               }
            }
         }
      }

      if (this.q() || ((rYB)this.id_throws[id_native[50]]).id_continue) {
         this.rE();
      }

      boolean var28 = var1 && ((rhx_3)((rhd_3)this).id_implements[id_native[51]]).id_class ? id_break[11] : id_break[12];
      if (this.BM()) {
         if (this.id_class(rlG_2.id_break) && !((rYB)this.id_throws[id_native[52]]).id_byte(new rfH_2(this.rx(), this.rH(), this.BO())).id_class(xu_3.hM)) {
            if (!this.SO() && !rLK.id_byte(this) && !var28) {
               this.id_throws(this.id_final(this.PA()));
               if (this.PA() == id_finally[3]) {
                  this.id_throws(id_break[13]);
                  rjU_2 var3 = this.rv();

                  for (int var30 = id_break[14]; var30 < id_finally[4]; var30++) {
                     double var5 = ((Random)this.id_throws[id_native[53]]).nextDouble() - ((Random)this.id_throws[id_native[54]]).nextDouble();
                     double var7 = ((Random)this.id_throws[id_native[55]]).nextDouble() - ((Random)this.id_throws[id_native[56]]).nextDouble();
                     double var9 = ((Random)this.id_throws[id_native[57]]).nextDouble() - ((Random)this.id_throws[id_native[58]]).nextDouble();
                     ((rYB)this.id_throws[id_native[59]])
                        .id_class(rLQ.id_throws, this.rx() + var5, this.re() + var7, this.BO() + var9, var3.id_break, var3.id_byte, var3.id_protected);
                  }

                  this.id_break(rye_3.id_private, id_implements[11]);
               }
            }

            if (!((rYB)this.id_throws[id_native[60]]).id_continue && this.Pm() && this.ra() != null && !this.ra().PH()) {
               this.BH();
            }
         } else if (this.PA() < this.ri()) {
            this.id_throws(this.id_new(this.PA()));
         }

         if (!((rYB)this.id_throws[id_native[61]]).id_continue) {
            rfH_2 var29 = this.Bs();
            if (!Objects.equal((rfH_2)this.id_private[id_native[62]], var29)) {
               this.id_private[id_native[63]] = var29;
               this.id_throws(var29);
            }
         }
      }

      if (this.BM() && this.Pk()) {
         this.rE();
      }

      if ((Integer)this.id_private[id_native[64]] > 0) {
         Integer var17 = (Integer)this.id_private[id_native[65]] - id_break[15];
         this.id_private[id_native[66]] = var17;
      }

      if ((Integer)this.id_throws[id_native[67]] > 0 && !(this instanceof rhN_2)) {
         Integer var18 = (Integer)this.id_throws[id_native[68]] - id_break[16];
         this.id_throws[id_native[69]] = var18;
      }

      if (this.Sl()) {
         this.St();
      }

      if ((Integer)this.id_private[id_native[70]] > 0) {
         Integer var19 = (Integer)this.id_private[id_native[71]] - id_break[17];
         this.id_private[id_native[72]] = var19;
      } else {
         Object var20 = null;
         this.id_private[id_native[73]] = var20;
      }

      if ((iB_2)this.id_private[id_native[74]] != null && !((iB_2)this.id_private[id_native[75]]).BM()) {
         Object var21 = null;
         this.id_private[id_native[76]] = var21;
      }

      if ((iB_2)this.id_private[id_native[77]] != null) {
         if (!((iB_2)this.id_private[id_native[78]]).BM()) {
            this.id_break(null);
         } else if ((Integer)this.id_throws[id_native[79]] - (Integer)this.id_private[id_native[80]] > id_finally[5]) {
            this.id_break(null);
         }
      }

      this.Sk();
      Float var22 = (Float)this.id_private[id_native[81]];
      this.id_private[id_native[82]] = var22;
      Float var23 = (Float)this.id_private[id_native[83]];
      this.id_private[id_native[84]] = var23;
      Float var24 = (Float)this.id_private[id_native[85]];
      this.id_private[id_native[86]] = var24;
      Float var25 = (Float)this.id_throws[id_native[87]];
      this.id_throws[id_native[88]] = var25;
      Float var26 = (Float)this.id_throws[id_native[89]];
      this.id_throws[id_native[90]] = var26;
      Float var27 = (Float)this.id_private[id_native[91]];
      this.id_private[id_native[92]] = var27;
   }

   @Override
   public boolean PH() {
      return id_break[25];
   }

   @Override
   public boolean rJ() {
      return this.D();
   }

   @Override
   public boolean rG() {
      return this.BM() && !this.id_native() && !this.o_() ? id_break[204] : id_break[205];
   }

   @Override
   public rfl_3 PE() {
      return this.id_class(rXQ.HEAD).id_break() == rdy_3.dk ? this.rN().id_byte(id_protected[144], id_protected[145], id_protected[146]) : super.PE();
   }

   @Override
   public boolean rP() {
      return !super.rP() && (this.Sy() || this.Pb() != iM_2.FALL_FLYING) ? id_break[235] : id_break[234];
   }

   @Override
   public void rF() {
      this.id_private();
      Integer var5 = Integer.valueOf(id_finally[42]);
      this.id_private[id_native[291]] = var5;
      Integer var6 = (Integer)this.id_private[id_native[292]];
      this.id_private[id_native[293]] = var6;
      Float var7 = id_implements[61];
      this.id_private[id_native[294]] = var7;
   }

   @Override
   public boolean rY() {
      return !this.id_throws[id_native[595]] ? id_break[202] : id_break[203];
   }

   @Override
   public void PQ() {
      this.id_break(rye_3.id_volatile, id_implements[99]);
   }

   @Override
   public boolean Pu() {
      this.id_private();
      return !this.id_throws[id_native[288]] && this.id_private[id_native[289]] == 0 ? id_break[115] : id_break[116];
   }

   public int Bj() {
      this.id_private();
      return (Integer)this.id_private[id_native[729]];
   }

   @Override
   public abstract Iterable<rdn_3> PV();

   public boolean BR() {
      return this.sG() == aL_2.id_break ? id_break[64] : id_break[65];
   }

   public ImmutableList<iM_2> BV() {
      return ImmutableList.of(iM_2.STANDING);
   }

   public int BY() {
      return ((rmE_2)this.id_throws[id_native[302]]).<Integer>id_class((rut_3<Integer>)id_catch[id_native[303]]);
   }

   public boolean BK() {
      return this.Sl();
   }

   public rpr_3 Bi() {
      rfH_2 var1 = this.Bg().orElse(null);
      return var1 != null ? xb_3.id_class((rYB)this.id_throws[id_native[715]], var1) : null;
   }

   public iB_2 Sr() {
      this.id_private();
      return (iB_2)this.id_private[id_native[114]];
   }

   public float Bp() {
      Iterable var1 = this.PV();
      int var2 = id_break[141];
      int var3 = id_break[142];

      for (rdn_3 var5 : var1) {
         if (!var5.id_class()) {
            var3++;
         }

         var2++;
      }

      return var2 > 0 ? (float)var3 / (float)var2 : id_implements[100];
   }

   public void Bw() {
      ((rmE_2)this.id_throws[id_native[187]]).id_break((rut_3<Boolean>)id_catch[id_native[188]], id_break[50]);
      ((rmE_2)this.id_throws[id_native[189]]).id_break((rut_3<Integer>)id_catch[id_native[190]], Integer.valueOf(id_break[51]));
   }

   @Override
   public boolean BM() {
      return !this.id_throws[id_native[287]] && this.Ss() > id_implements[54] ? id_break[113] : id_break[114];
   }

   public Optional<rfH_2> Bg() {
      return ((rmE_2)this.id_throws[id_native[705]]).id_class((rut_3<Optional<rfH_2>>)id_catch[id_native[706]]);
   }

   public boolean Be() {
      return ((rYB)this.id_throws[id_native[100]]).id_byte(this.PI()).id_class(rls_3.Z);
   }

   public void Ba() {
      if (!this.Pl().id_catch()) {
         int var1 = eA_2.id_class(eY_2.id_native, this);
         if (var1 > 0 && this.Be()) {
            ic_3 var2 = this.id_byte(iQ_2.id_protected);
            if (var2 == null) {
               return;
            }

            var2.id_break(
               new ix_3(
                  (UUID)id_catch[id_native[103]],
                  id_class[1],
                  (double)(id_implements[19] * (id_implements[20] + (float)var1 * id_implements[21])),
                  id_3.ADDITION
               )
            );
            if (this.Sa().nextFloat() < id_implements[22]) {
               rdn_3 var3 = this.id_class(rXQ.FEET);
               var3.id_class(id_break[22], this, var0 -> var0.id_break(rXQ.FEET));
            }
         }
      }
   }

   public Optional<rfH_2> SP() {
      this.id_private();
      return (Optional<rfH_2>)this.id_private[id_native[282]];
   }

   public float Ss() {
      return ((rmE_2)this.id_throws[id_native[207]]).<Float>id_class((rut_3<Float>)id_catch[id_native[208]]);
   }

   @Override
   public void BH() {
      an_3 var1 = this.ra();
      super.BH();
      if (var1 != null && var1 != this.ra() && !((rYB)this.id_throws[id_native[568]]).id_continue) {
         this.id_class(var1);
      }
   }

   public rqA_2 Bt() {
      return rqn_3.Sj;
   }

   public int BI() {
      this.id_private();
      return (Integer)this.id_private[id_native[128]];
   }

   public float Bf() {
      return id_implements[111];
   }

   public boolean BU() {
      return id_break[178];
   }

   @Override
   public boolean Bz() {
      return !this.Sc() && super.Bz() ? id_break[248] : id_break[249];
   }

   public float Bo() {
      QY var1 = QY.id_instanceof();
      if (this == (cb_3)var1.id_class[id_native[723]]) {
         t_1 var2 = (t_1)((cb_3)var1.id_class[id_native[724]]).id_break[id_native[725]];
         if (var2 != null) {
            return var2.id_class().id_protected();
         }
      }

      return (Float)this.id_throws[id_native[726]];
   }

   public rqO_2 By() {
      return this.BC().id_finally();
   }

   public ik_3 BT() {
      this.id_private();
      return (ik_3)this.id_private[id_native[353]];
   }

   public int Bq() {
      return rfU_2.id_byte(this.id_class(iQ_2.id_implements));
   }

   public void SB() {
      ((rmE_2)this.id_throws[id_native[709]]).id_break((rut_3<Optional>)id_catch[id_native[710]], Optional.empty());
   }

   public void SS() {
      List var1 = ((rYB)this.id_throws[id_native[555]]).id_break(this, this.rN(), rpJ_2.id_class(this));
      if (!var1.isEmpty()) {
         int var2 = ((rYB)this.id_throws[id_native[556]]).B().id_byte(rRu_1.id_super);
         if (var2 > 0 && var1.size() > var2 - id_break[184] && ((Random)this.id_throws[id_native[557]]).nextInt(id_finally[69]) == 0) {
            int var3 = id_break[185];

            for (int var4 = id_break[186]; var4 < var1.size(); var4++) {
               if (!((an_3)var1.get(var4)).Pm()) {
                  var3++;
               }
            }

            if (var3 > var2 - id_break[187]) {
               this.id_break(rye_3.id_catch, id_implements[189]);
            }
         }

         for (int var5 = id_break[188]; var5 < var1.size(); var5++) {
            an_3 var6 = (an_3)var1.get(var5);
            this.id_instanceof(var6);
         }
      }
   }

   public void Sf() {
      this.id_private();
      if (!((rYB)this.id_throws[id_native[267]]).id_continue
         && (this.SG() || (Integer)this.id_private[id_native[268]] > 0 && this.Sp() && ((rYB)this.id_throws[id_native[269]]).B().id_break(rRu_1.id_throws))) {
         int var1 = this.id_byte((rhd_3)this.id_private[id_native[270]]);

         while (var1 > 0) {
            int var2 = rsP_2.id_class(var1);
            var1 -= var2;
            ((rYB)this.id_throws[id_native[271]]).a_(new rsP_2((rYB)this.id_throws[id_native[272]], this.rx(), this.re(), this.BO(), var2));
         }
      }
   }

   public boolean Sy() {
      return this.id_finally(id_finally[81]);
   }

   public void Sj() {
   }

   public float sB() {
      this.id_private();
      return (Float)this.id_private[id_native[402]];
   }

   public void sE() {
      this.id_private();
      Boolean var5 = id_break[208];
      this.id_private[id_native[603]] = var5;
   }

   public rdn_3 sX() {
      this.id_private();
      return (rdn_3)this.id_private[id_native[681]];
   }

   public boolean Sp() {
      return !this.n_() ? id_break[28] : id_break[29];
   }

   public float SN() {
      return this.n_()
         ? (((Random)this.id_throws[id_native[357]]).nextFloat() - ((Random)this.id_throws[id_native[358]]).nextFloat()) * id_implements[102]
            + id_implements[103]
         : (((Random)this.id_throws[id_native[359]]).nextFloat() - ((Random)this.id_throws[id_native[360]]).nextFloat()) * id_implements[104]
            + id_implements[105];
   }

   public float sO() {
      QY var1 = QY.id_instanceof();
      if (this == (cb_3)var1.id_class[id_native[719]]) {
         t_1 var2 = (t_1)((cb_3)var1.id_class[id_native[720]]).id_break[id_native[721]];
         if (var2 != null) {
            return var2.id_class().id_throws();
         }
      }

      return (Float)this.id_throws[id_native[722]];
   }

   public void SC() {
      this.id_private();
      if (!((rdn_3)this.id_private[id_native[687]]).id_class()) {
         ((rdn_3)this.id_private[id_native[688]]).id_class((rYB)this.id_throws[id_native[689]], this, this.SH());
         if (((rdn_3)this.id_private[id_native[690]]).id_volatile()) {
            this.id_final();
         }
      }

      this.id_throw();
   }

   public float ST() {
      return id_implements[106] * this.rl();
   }

   public Random Sa() {
      return (Random)this.id_throws[id_native[113]];
   }

   public void sM() {
      if (!this.BF()) {
         int var1 = rfU_2.id_byte(this.rx());
         int var2 = rfU_2.id_byte(this.re() - id_protected[46]);
         int var3 = rfU_2.id_byte(this.BO());
         xc_3 var4 = ((rYB)this.id_throws[id_native[290]]).id_byte(new rfH_2(var1, var2, var3));
         if (!var4.id_catch()) {
            zr_3 var5 = var4.id_package();
            this.id_class(var5.id_catch(), var5.id_class() * id_implements[59], var5.id_break() * id_implements[60]);
         }
      }
   }

   public boolean SL() {
      return id_break[242];
   }

   public iZ_2<?> SF() {
      this.id_private();
      return (iZ_2<?>)this.id_private[id_native[20]];
   }

   public aL_2 sG() {
      return aL_2.id_class;
   }

   public float SR() {
      return this.n_() ? id_implements[23] : id_implements[24];
   }

   public iB_2 Sh() {
      this.id_private();
      if (((ryR_2)this.id_private[id_native[296]]).id_byte() != null) {
         return ((ryR_2)this.id_private[id_native[297]]).id_byte();
      } else if ((rhd_3)this.id_private[id_native[298]] != null) {
         return (rhd_3)this.id_private[id_native[299]];
      } else {
         return (iB_2)this.id_private[id_native[300]] != null ? (iB_2)this.id_private[id_native[301]] : null;
      }
   }

   public int SE() {
      this.id_private();
      return (Integer)this.id_private[id_native[123]];
   }

   public boolean SX() {
      return !this.n_() ? id_break[30] : id_break[31];
   }

   public void Sx() {
   }

   public rye_3 SJ() {
      this.id_private();
      if (((rYB)this.id_throws[id_native[244]]).r() - (Long)this.id_private[id_native[245]] > id_extends[0]) {
         Object var5 = null;
         this.id_private[id_native[246]] = var5;
      }

      return (rye_3)this.id_private[id_native[247]];
   }

   public void St() {
      this.id_private();
      Integer var12 = (Integer)this.id_private[id_native[105]] + id_break[26];
      this.id_private[id_native[106]] = var12;
      if ((Integer)this.id_private[id_native[107]] == id_finally[7]) {
         this.PD();

         for (int var1 = id_break[27]; var1 < id_finally[8]; var1++) {
            double var2 = ((Random)this.id_throws[id_native[108]]).nextGaussian() * id_protected[19];
            double var4 = ((Random)this.id_throws[id_native[109]]).nextGaussian() * id_protected[20];
            double var6 = ((Random)this.id_throws[id_native[110]]).nextGaussian() * id_protected[21];
            ((rYB)this.id_throws[id_native[111]])
               .id_class(rLQ.id_boolean, this.id_break(id_protected[22]), this.Ph(), this.id_protected(id_protected[23]), var2, var4, var6);
         }
      }
   }

   public abstract rpZ_2 Su();

   public void SI() {
      ic_3 var1 = this.id_byte(iQ_2.id_protected);
      if (var1 != null && var1.id_class((UUID)id_catch[id_native[101]]) != null) {
         var1.id_break((UUID)id_catch[id_native[102]]);
      }
   }

   public float SK() {
      return (float)this.id_class(iQ_2.id_class);
   }

   public rdn_3 Sn() {
      return this.id_class(rXQ.OFFHAND);
   }

   public boolean Sz() {
      return (((rmE_2)this.id_throws[id_native[566]]).<Byte>id_class((rut_3<Byte>)id_catch[id_native[567]]) & id_finally[72]) != 0
         ? id_break[194]
         : id_break[195];
   }

   public int SU() {
      this.id_private();
      return this.id_return() ? ((rdn_3)this.id_private[id_native[685]]).id_extends() - this.SH() : id_break[225];
   }

   public ryR_2 SW() {
      this.id_private();
      return (ryR_2)this.id_private[id_native[295]];
   }

   public int SM() {
      return ((rmE_2)this.id_throws[id_native[306]]).<Integer>id_class((rut_3<Integer>)id_catch[id_native[307]]);
   }

   public int Sw() {
      this.id_private();
      return (Integer)this.id_private[id_native[686]];
   }

   public boolean Sq() {
      return id_break[243];
   }

   public boolean SY() {
      this.id_private();
      if (((rYB)this.id_throws[id_native[191]]).id_continue) {
         return id_break[52];
      } else {
         Iterator var1 = ((Map)this.id_private[id_native[192]]).values().iterator();

         boolean var2;
         for (var2 = id_break[53]; var1.hasNext(); var2 = id_break[54]) {
            this.id_class((rLY)var1.next());
            var1.remove();
         }

         return var2;
      }
   }

   public void SA() {
      this.id_private();
      if (((Map)this.id_private[id_native[181]]).isEmpty()) {
         this.Bw();
         this.id_package(id_break[46]);
      } else {
         Collection var1 = ((Map)this.id_private[id_native[182]]).values();
         ((rmE_2)this.id_throws[id_native[183]]).id_break((rut_3<Boolean>)id_catch[id_native[184]], id_class(var1));
         ((rmE_2)this.id_throws[id_native[185]]).id_break((rut_3<Integer>)id_catch[id_native[186]], rAB.id_class(var1));
         this.id_package(this.id_break(rLD.id_final));
      }
   }

   public float Sd() {
      this.id_private();
      return (Float)this.id_private[id_native[601]];
   }

   public iB_2 SZ() {
      this.id_private();
      return (iB_2)this.id_private[id_native[122]];
   }

   public void Sg() {
      this.id_private();
      float var1 = this.id_interface();
      if ((Boolean)this.id_private[id_native[344]]) {
         Integer var6 = (Integer)this.id_private[id_native[345]] + id_break[133];
         this.id_private[id_native[346]] = var6;
         if ((float)((Integer)this.id_private[id_native[347]]).intValue() >= var1) {
            Integer var7 = Integer.valueOf(id_break[134]);
            this.id_private[id_native[348]] = var7;
            Boolean var8 = id_break[135];
            this.id_private[id_native[349]] = var8;
         }
      } else {
         Integer var9 = Integer.valueOf(id_break[136]);
         this.id_private[id_native[350]] = var9;
      }

      Float var10 = (float)((Integer)this.id_private[id_native[351]]).intValue() / var1;
      this.id_private[id_native[352]] = var10;
   }

   public static iz_3 SD() {
      return iW_2.id_class().id_class(iQ_2.id_class).id_class(iQ_2.id_byte).id_class(iQ_2.id_protected).id_class(iQ_2.id_implements).id_class(iQ_2.id_finally);
   }

   public int Se() {
      this.id_private();
      return (Integer)this.id_private[id_native[728]];
   }

   public boolean SO() {
      return this.sG() == aL_2.id_break ? id_break[8] : id_break[9];
   }

   public void SQ() {
      this.Bg().filter(((rYB)this.id_throws[id_native[714]])::id_int).ifPresent(var1x -> {
         xc_3 var2 = ((rYB)this.id_throws[id_native[730]]).id_byte(var1x);
         if (var2.id_break() instanceof xb_3) {
            ((rYB)this.id_throws[id_native[731]]).id_class(var1x, var2.id_class(xb_3.id_final, Boolean.valueOf(id_break[251])), id_finally[91]);
            rjU_2 var3 = xb_3.id_class(this.BC(), (rYB)this.id_throws[id_native[732]], var1x, (Float)this.id_throws[id_native[733]]).orElseGet(() -> {
               rfH_2 var1xx = var1x.id_final();
               return new rjU_2((double)var1xx.b_() + id_protected[149], (double)var1xx.c_() + id_protected[150], (double)var1xx.d_() + id_protected[151]);
            });
            rjU_2 var4 = rjU_2.id_protected(var1x).id_protected(var3).id_protected();
            float var5 = (float)rfU_2.id_case(rfU_2.id_protected(var4.id_protected, var4.id_break) * id_protected[147] - id_protected[148]);
            this.id_new(var3.id_break, var3.id_byte, var3.id_protected);
            Float var10 = var5;
            this.id_throws[id_native[734]] = var10;
            Float var11 = id_implements[221];
            this.id_throws[id_native[735]] = var11;
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
      return ((rYB)this.id_throws[id_native[285]]).id_byte(this.Bs());
   }

   public float Si() {
      return id_implements[101];
   }

   public void sP() {
      this.id_private();
      rpm_3 var1 = this.P();
      if (!((rdn_3)this.id_private[id_native[675]]).equals(this.id_protected(var1))) {
         this.SC();
      } else if (!((rdn_3)this.id_private[id_native[676]]).id_class() && this.id_return()) {
         this.id_class((rdn_3)this.id_private[id_native[677]], id_finally[80]);
         rdn_3 var2 = ((rdn_3)this.id_private[id_native[678]]).id_class((rYB)this.id_throws[id_native[679]], this);
         if (var2 != (rdn_3)this.id_private[id_native[680]]) {
            this.id_class(var1, var2);
         }

         this.id_throw();
      }
   }

   public int Sb() {
      this.id_private();
      return (Integer)this.id_private[id_native[115]];
   }

   public boolean Sl() {
      return this.Ss() <= id_implements[31] ? id_break[71] : id_break[72];
   }

   public void Sv() {
      rjU_2 var1 = this.rv();
      ((rYB)this.id_throws[id_native[94]])
         .id_class(
            rLQ.id_throw,
            this.rx() + (((Random)this.id_throws[id_native[95]]).nextDouble() - id_protected[13]) * (double)this.PN(),
            this.re() + id_protected[14],
            this.BO() + (((Random)this.id_throws[id_native[96]]).nextDouble() - id_protected[15]) * (double)this.PN(),
            var1.id_break * id_protected[16],
            id_protected[17],
            var1.id_protected * id_protected[18]
         );
      float var2 = ((Random)this.id_throws[id_native[97]]).nextFloat() * id_implements[12] + ((Random)this.id_throws[id_native[98]]).nextFloat()
            > id_implements[13]
         ? id_implements[14]
         : id_implements[15];
      this.id_class(rqn_3.xE, var2, id_implements[16] + ((Random)this.id_throws[id_native[99]]).nextFloat() * id_implements[17]);
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return var1 == iM_2.SLEEPING ? (ap_3)id_catch[id_native[704]] : super.a_(var1).id_class(this.SR());
   }

   @Override
   public void m_() {
      ((rmE_2)this.id_throws[id_native[21]]).id_class((rut_3<Byte>)id_catch[id_native[22]], Byte.valueOf(id_break[3]));
      ((rmE_2)this.id_throws[id_native[23]]).id_class((rut_3<Integer>)id_catch[id_native[24]], Integer.valueOf(id_break[4]));
      ((rmE_2)this.id_throws[id_native[25]]).id_class((rut_3<Boolean>)id_catch[id_native[26]], id_break[5]);
      ((rmE_2)this.id_throws[id_native[27]]).id_class((rut_3<Integer>)id_catch[id_native[28]], Integer.valueOf(id_break[6]));
      ((rmE_2)this.id_throws[id_native[29]]).id_class((rut_3<Integer>)id_catch[id_native[30]], Integer.valueOf(id_break[7]));
      ((rmE_2)this.id_throws[id_native[31]]).id_class((rut_3<Float>)id_catch[id_native[32]], id_implements[4]);
      ((rmE_2)this.id_throws[id_native[33]]).id_class((rut_3<Optional>)id_catch[id_native[34]], Optional.empty());
   }

   @Override
   public ruS_2<?> p_() {
      return new rFh_1(this);
   }

   public boolean n_() {
      return id_break[23];
   }

   public float u_() {
      return this.Ss();
   }

   public boolean o_() {
      this.id_private();
      if (this.id_native()) {
         return id_break[106];
      } else {
         rfH_2 var1 = this.Bs();
         xc_3 var2 = this.sS();
         xd_3 var3 = var2.id_break();
         if (var3.id_class(rls_3.F)) {
            Optional var8 = Optional.of(var1);
            this.id_private[id_native[283]] = var8;
            return id_break[107];
         } else if (var3 instanceof zv_3 && this.id_byte(var1, var2)) {
            Optional var9 = Optional.of(var1);
            this.id_private[id_native[284]] = var9;
            return id_break[108];
         } else {
            return id_break[109];
         }
      }
   }

   @Override
   public void c_(boolean var1) {
      super.c_(var1);
      ic_3 var2 = this.id_byte(iQ_2.id_protected);
      if (var2.id_class((UUID)id_catch[id_native[354]]) != null) {
         var2.id_protected((ix_3)id_catch[id_native[355]]);
      }

      if (var1) {
         var2.id_break((ix_3)id_catch[id_native[356]]);
      }
   }
}
