package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rhd_3 extends iB_2 {
   public static Object[] id_protected;
   private static byte[] id_class;
   private static double[] id_break;
   private static String[] id_finally;
   private static long[] id_extends;
   private static short[] id_native;
   public Object[] id_implements;
   private static int[] id_volatile;
   private static float[] id_final;
   private static boolean[] id_package;

   @Override
   public boolean id_char() {
      return id_package[97];
   }

   private void id_char(an_3 var1) {
      var1.c_(this);
   }

   public int id_byte(Collection<rkw_3<?>> var1) {
      return id_package[107];
   }

   public boolean id_byte(xc_3 var1) {
      this.id_new();
      return this.id_class(var1, ((rhz_3)this.id_implements[id_native[172]]).id_byte());
   }

   public float id_byte(boolean var1) {
      return (float)(id_break[104] / this.id_class(iQ_2.id_private) * id_break[105]);
   }

   public void id_byte() {
      this.id_new();
      Double var13 = (Double)this.id_implements[id_native[57]];
      this.id_implements[id_native[58]] = var13;
      Double var14 = (Double)this.id_implements[id_native[59]];
      this.id_implements[id_native[60]] = var14;
      Double var15 = (Double)this.id_implements[id_native[61]];
      this.id_implements[id_native[62]] = var15;
      double var1 = this.rx() - (Double)this.id_implements[id_native[63]];
      double var3 = this.re() - (Double)this.id_implements[id_native[64]];
      double var5 = this.BO() - (Double)this.id_implements[id_native[65]];
      double var7 = id_break[8];
      if (var1 > id_break[9]) {
         Double var16 = this.rx();
         this.id_implements[id_native[66]] = var16;
         Double var17 = (Double)this.id_implements[id_native[67]];
         this.id_implements[id_native[68]] = var17;
      }

      if (var5 > id_break[10]) {
         Double var18 = this.BO();
         this.id_implements[id_native[69]] = var18;
         Double var19 = (Double)this.id_implements[id_native[70]];
         this.id_implements[id_native[71]] = var19;
      }

      if (var3 > id_break[11]) {
         Double var20 = this.re();
         this.id_implements[id_native[72]] = var20;
         Double var21 = (Double)this.id_implements[id_native[73]];
         this.id_implements[id_native[74]] = var21;
      }

      if (var1 < id_break[12]) {
         Double var22 = this.rx();
         this.id_implements[id_native[75]] = var22;
         Double var23 = (Double)this.id_implements[id_native[76]];
         this.id_implements[id_native[77]] = var23;
      }

      if (var5 < id_break[13]) {
         Double var24 = this.BO();
         this.id_implements[id_native[78]] = var24;
         Double var25 = (Double)this.id_implements[id_native[79]];
         this.id_implements[id_native[80]] = var25;
      }

      if (var3 < id_break[14]) {
         Double var26 = this.re();
         this.id_implements[id_native[81]] = var26;
         Double var27 = (Double)this.id_implements[id_native[82]];
         this.id_implements[id_native[83]] = var27;
      }

      Double var28 = (Double)this.id_implements[id_native[84]] + var1 * id_break[15];
      this.id_implements[id_native[85]] = var28;
      Double var29 = (Double)this.id_implements[id_native[86]] + var5 * id_break[16];
      this.id_implements[id_native[87]] = var29;
      Double var30 = (Double)this.id_implements[id_native[88]] + var3 * id_break[17];
      this.id_implements[id_native[89]] = var30;
   }

   @Override
   public rqA_2 id_byte(rye_3 var1) {
      if (var1 == rye_3.id_byte) {
         return rqn_3.hy;
      } else if (var1 == rye_3.id_private) {
         return rqn_3.hH;
      } else {
         return var1 == rye_3.id_else ? rqn_3.hp : rqn_3.hl;
      }
   }

   @Override
   public rqA_2 id_byte(int var1) {
      return var1 > id_class[31] ? rqn_3.hL : rqn_3.hT;
   }

   @Override
   public int id_byte(rhd_3 var1) {
      this.id_new();
      if (!((rYB)this.id_throws[id_native[343]]).B().id_break(rRu_1.id_byte) && !this.id_native()) {
         int var2 = (Integer)this.id_implements[id_native[344]] * id_class[46];
         return var2 > id_class[47] ? id_class[48] : var2;
      } else {
         return id_package[134];
      }
   }

   @Override
   public void id_byte(rye_3 var1, float var2) {
      this.id_new();
      ((rhz_3)this.id_implements[id_native[206]]).id_class(var1, var2);
   }

   private static void id_int() {
      id_finally = new String[]{
         new String("Silent"),
         new String("Silent"),
         new String("id"),
         new String("Inventory"),
         new String("SelectedItemSlot"),
         new String("SleepTimer"),
         new String("XpP"),
         new String("XpLevel"),
         new String("XpTotal"),
         new String("XpSeed"),
         new String("Score"),
         new String("EnderItems"),
         new String("EnderItems"),
         new String("ShoulderEntityLeft"),
         new String("ShoulderEntityLeft"),
         new String("ShoulderEntityRight"),
         new String("ShoulderEntityRight"),
         new String("DataVersion"),
         new String("Inventory"),
         new String("SelectedItemSlot"),
         new String("SleepTimer"),
         new String("XpP"),
         new String("XpLevel"),
         new String("XpTotal"),
         new String("XpSeed"),
         new String("Score"),
         new String("EnderItems"),
         new String("ShoulderEntityLeft"),
         new String("ShoulderEntityRight"),
         new String("celestial/cape.png")
      };
   }

   private static void id_long() {
      id_extends = new long[]{20L, 0L};
   }

   public rhd_3(rYB var1, rfH_2 var2, float var3, GameProfile var4) {
      super(aI_2.rM, var1);
      this.id_new();
      rhz_3 var9 = new rhz_3(this);
      this.id_implements[id_native[0]] = var9;
      rXz_1 var10 = new rXz_1();
      this.id_implements[id_native[1]] = var10;
      rpQ_2 var11 = new rpQ_2();
      this.id_implements[id_native[2]] = var11;
      rhx_3 var12 = new rhx_3();
      this.id_implements[id_native[3]] = var12;
      Float var13 = id_final[0];
      this.id_implements[id_native[4]] = var13;
      rdn_3 var14 = rdn_3.id_break;
      this.id_implements[id_native[5]] = var14;
      rpD_2 var15 = this.sq();
      this.id_implements[id_native[6]] = var15;
      this.a_(id_class(var4));
      this.id_implements[id_native[7]] = var4;
      rJT var17 = new rJT((rhz_3)this.id_implements[id_native[8]], !var1.id_continue ? id_package[0] : id_package[1], this);
      this.id_implements[id_native[9]] = var17;
      rJT var18 = (rJT)this.id_implements[id_native[10]];
      this.id_implements[id_native[11]] = var18;
      this.id_class((double)var2.b_() + id_break[0], (double)(var2.c_() + id_package[2]), (double)var2.d_() + id_break[1], var3, id_final[1]);
      Float var19 = id_final[2];
      this.id_private[id_native[12]] = var19;
      this.id_private(id_package[3]);
   }

   static {
      ntfClinit();
   }

   public int sp() {
      return ((rmE_2)this.id_throws[id_native[137]]).<Integer>id_class((rut_3<Integer>)id_protected[id_native[138]]);
   }

   public void J() {
   }

   public void id_this(boolean var1) {
      float var2 = id_final[101] + (float)eA_2.id_case(this) * id_final[102];
      if (var1) {
         var2 += id_final[103];
      }

      if (((Random)this.id_throws[id_native[258]]).nextFloat() < var2) {
         this.sK().id_class(rdy_3.kN, id_class[20]);
         this.id_throw();
         ((rYB)this.id_throws[id_native[259]]).id_class(this, id_class[21]);
      }
   }

   public void id_this(int var1) {
      this.id_new();
      this.id_continue(var1);
      Float var7 = (Float)this.id_implements[id_native[291]] + (float)var1 / (float)this.sn();
      this.id_implements[id_native[292]] = var7;
      Integer var8 = rfU_2.id_class((Integer)this.id_implements[id_native[293]] + var1, id_package[122], id_volatile[0]);
      this.id_implements[id_native[294]] = var8;

      while (this.id_implements[id_native[295]] < id_final[129]) {
         float var2 = (Float)this.id_implements[id_native[296]] * (float)this.sn();
         if ((Integer)this.id_implements[id_native[297]] > 0) {
            this.id_super(id_class[32]);
            Float var9 = id_final[130] + var2 / (float)this.sn();
            this.id_implements[id_native[298]] = var9;
         } else {
            this.id_super(id_class[33]);
            Float var10 = id_final[131];
            this.id_implements[id_native[299]] = var10;
         }
      }

      while (this.id_implements[id_native[300]] >= id_final[132]) {
         Float var11 = ((Float)this.id_implements[id_native[301]] - id_final[133]) * (float)this.sn();
         this.id_implements[id_native[302]] = var11;
         this.id_super(id_package[123]);
         Float var12 = (Float)this.id_implements[id_native[303]] / (float)this.sn();
         this.id_implements[id_native[304]] = var12;
      }
   }

   @Override
   public void id_this() {
      this.id_new();
      Boolean var10 = this.id_native();
      this.id_throws[id_native[25]] = var10;
      if (this.id_native()) {
         Boolean var11 = id_package[13];
         this.id_throws[id_native[26]] = var11;
      }

      if ((Integer)this.id_implements[id_native[27]] > 0) {
         Integer var12 = (Integer)this.id_implements[id_native[28]] - id_package[14];
         this.id_implements[id_native[29]] = var12;
      }

      if (this.Sc()) {
         Integer var13 = (Integer)this.id_implements[id_native[30]] + id_package[15];
         this.id_implements[id_native[31]] = var13;
         if ((Integer)this.id_implements[id_native[32]] > id_class[0]) {
            Integer var14 = Integer.valueOf(id_class[1]);
            this.id_implements[id_native[33]] = var14;
         }

         if (!((rYB)this.id_throws[id_native[34]]).id_continue && ((rYB)this.id_throws[id_native[35]]).id_strictfp()) {
            this.id_class(id_package[16], id_package[17]);
         }
      } else if ((Integer)this.id_implements[id_native[36]] > 0) {
         Integer var15 = (Integer)this.id_implements[id_native[37]] + id_package[18];
         this.id_implements[id_native[38]] = var15;
         if ((Integer)this.id_implements[id_native[39]] >= id_class[2]) {
            Integer var16 = Integer.valueOf(id_package[19]);
            this.id_implements[id_native[40]] = var16;
         }
      }

      this.id_void();
      super.id_this();
      if (!((rYB)this.id_throws[id_native[41]]).id_continue
         && (rJr_1)this.id_implements[id_native[42]] != null
         && !((rJr_1)this.id_implements[id_native[43]]).id_class(this)) {
         this.id_strictfp();
         rJT var17 = (rJT)this.id_implements[id_native[44]];
         this.id_implements[id_native[45]] = var17;
      }

      this.id_byte();
      if (!((rYB)this.id_throws[id_native[46]]).id_continue) {
         ((rpQ_2)this.id_implements[id_native[47]]).id_class(this);
         this.id_break(rlB_2.id_extends);
         if (this.BM()) {
            this.id_break(rlB_2.id_native);
         }

         if (this.Pw()) {
            this.id_break(rlB_2.id_final);
         }

         if (!this.Sc()) {
            this.id_break(rlB_2.id_volatile);
         }
      }

      double var1 = rfU_2.id_class(this.rx(), id_break[4], id_break[5]);
      double var3 = rfU_2.id_class(this.BO(), id_break[6], id_break[7]);
      if (var1 != this.rx() || var3 != this.BO()) {
         this.id_new(var1, this.re(), var3);
      }

      Integer var18 = (Integer)this.id_private[id_native[48]] + id_package[20];
      this.id_private[id_native[49]] = var18;
      rdn_3 var5 = this.ss();
      if (!rdn_3.id_break((rdn_3)this.id_implements[id_native[50]], var5)) {
         if (!rdn_3.id_protected((rdn_3)this.id_implements[id_native[51]], var5)) {
            this.sg();
         }

         rdn_3 var19 = var5.id_implements();
         this.id_implements[id_native[52]] = var19;
      }

      this.id_public();
      ((rpD_2)this.id_implements[id_native[53]]).id_class();
      this.t_();
   }

   @Override
   public String i() {
      return this.sv().getName();
   }

   public void sl() {
      this.id_continue(id_package[108]);
   }

   public void sa() {
      double var1 = (double)(-rfU_2.id_class((Float)this.id_throws[id_native[260]] * id_final[104]));
      double var3 = (double)rfU_2.id_break((Float)this.id_throws[id_native[261]] * id_final[105]);
      if ((rYB)this.id_throws[id_native[262]] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.id_throws[id_native[263]]))
            .id_class(rLQ.B, this.rx() + var1, this.id_byte(id_break[86]), this.BO() + var3, id_package[96], var1, id_break[87], var3, id_break[88]);
      }
   }

   @Override
   public rjU_2 id_class(rjU_2 var1, iG_2 var2) {
      this.id_new();
      if (!((rhx_3)this.id_implements[id_native[220]]).id_break && (var2 == iG_2.SELF || var2 == iG_2.PLAYER) && this.id_instanceof() && this.so()) {
         double var3 = var1.id_break;
         double var5 = var1.id_protected;

         while (
            var3 != id_break[38]
               && ((rYB)this.id_throws[id_native[221]]).a_(this, this.rN().id_protected(var3, (double)(-(Float)this.id_throws[id_native[222]]), id_break[39]))
         ) {
            if (var3 < id_break[40] && var3 >= id_break[41]) {
               var3 = id_break[42];
            } else if (var3 > id_break[43]) {
               var3 -= id_break[44];
            } else {
               var3 += id_break[45];
            }
         }

         while (
            var5 != id_break[46]
               && ((rYB)this.id_throws[id_native[223]]).a_(this, this.rN().id_protected(id_break[47], (double)(-(Float)this.id_throws[id_native[224]]), var5))
         ) {
            if (var5 < id_break[48] && var5 >= id_break[49]) {
               var5 = id_break[50];
            } else if (var5 > id_break[51]) {
               var5 -= id_break[52];
            } else {
               var5 += id_break[53];
            }
         }

         while (
            var3 != id_break[54]
               && var5 != id_break[55]
               && ((rYB)this.id_throws[id_native[225]]).a_(this, this.rN().id_protected(var3, (double)(-(Float)this.id_throws[id_native[226]]), var5))
         ) {
            if (var3 < id_break[56] && var3 >= id_break[57]) {
               var3 = id_break[58];
            } else if (var3 > id_break[59]) {
               var3 -= id_break[60];
            } else {
               var3 += id_break[61];
            }

            if (var5 < id_break[62] && var5 >= id_break[63]) {
               var5 = id_break[64];
            } else if (var5 > id_break[65]) {
               var5 -= id_break[66];
            } else {
               var5 += id_break[67];
            }
         }

         var1 = new rjU_2(var3, var1.id_byte, var5);
      }

      return var1;
   }

   public rsE_2 id_class(rdn_3 var1, boolean var2, boolean var3) {
      if (var1.id_class()) {
         return null;
      } else {
         if (((rYB)this.id_throws[id_native[156]]).id_continue) {
            this.id_class(rpm_3.MAIN_HAND, id_package[43]);
         }

         double var4 = this.rH() - id_break[35];
         rsE_2 var6 = new rsE_2((rYB)this.id_throws[id_native[157]], this.rx(), var4, this.BO(), var1);
         var6.id_class(id_class[13]);
         if (var3) {
            var6.id_byte(this.ro());
         }

         if (var2) {
            float var7 = ((Random)this.id_throws[id_native[158]]).nextFloat() * id_final[16];
            float var8 = ((Random)this.id_throws[id_native[159]]).nextFloat() * id_final[17];
            var6.id_catch((double)(-rfU_2.id_class(var8) * var7), id_break[36], (double)(rfU_2.id_break(var8) * var7));
         } else {
            float var14 = id_final[18];
            float var15 = rfU_2.id_class((Float)this.id_throws[id_native[160]] * id_final[19]);
            float var9 = rfU_2.id_break((Float)this.id_throws[id_native[161]] * id_final[20]);
            float var10 = rfU_2.id_class((Float)this.id_throws[id_native[162]] * id_final[21]);
            float var11 = rfU_2.id_break((Float)this.id_throws[id_native[163]] * id_final[22]);
            float var12 = ((Random)this.id_throws[id_native[164]]).nextFloat() * id_final[23];
            float var13 = id_final[24] * ((Random)this.id_throws[id_native[165]]).nextFloat();
            var6.id_catch(
               (double)(-var10 * var9 * id_final[25]) + Math.cos((double)var12) * (double)var13,
               (double)(
                  -var15 * id_final[26]
                     + id_final[27]
                     + (((Random)this.id_throws[id_native[166]]).nextFloat() - ((Random)this.id_throws[id_native[167]]).nextFloat()) * id_final[28]
               ),
               (double)(var11 * var9 * id_final[29]) + Math.sin((double)var12) * (double)var13
            );
         }

         return var6;
      }
   }

   public ryZ_2 id_class(an_3 var1, rpm_3 var2) {
      this.id_new();
      if (this.id_native()) {
         if (var1 instanceof rJZ) {
            this.id_class((rJZ)var1);
         }

         return ryZ_2.PASS;
      } else {
         rdn_3 var3 = this.id_protected(var2);
         rdn_3 var4 = var3.id_implements();
         ryZ_2 var5 = var1.id_class(this, var2);
         if (var5.id_class()) {
            if (((rhx_3)this.id_implements[id_native[215]]).id_protected && var3 == this.id_protected(var2) && var3.id_char() < var4.id_char()) {
               var3.id_throws(var4.id_char());
            }

            return var5;
         } else {
            if (!var3.id_class() && var1 instanceof iB_2) {
               if (((rhx_3)this.id_implements[id_native[216]]).id_protected) {
                  var3 = var4;
               }

               ryZ_2 var6 = var3.id_class(this, (iB_2)var1, var2);
               if (var6.id_class()) {
                  if (var3.id_class() && !((rhx_3)this.id_implements[id_native[217]]).id_protected) {
                     this.id_class(var2, rdn_3.id_break);
                  }

                  return var6;
               }
            }

            return ryZ_2.PASS;
         }
      }
   }

   public void id_class(int var1, rdf_3 var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void id_class(rdn_3 var1, rpm_3 var2) {
   }

   public float id_class(float var1, boolean var2) {
      return rfU_2.id_class(((float)((Integer)this.id_private[id_native[396]]).intValue() + var1) / this.id_byte(var2), id_final[147], id_final[148]);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      this.id_new();
      if (((rhx_3)this.id_implements[id_native[288]]).id_byte) {
         return id_package[114];
      } else {
         if (var1 >= id_final[128]) {
            this.id_class(rlB_2.id_super, (int)Math.round((double)var1 * id_break[103]));
         }

         return super.id_class(var1, var2);
      }
   }

   @Override
   public void id_class(xc_3 var1, rjU_2 var2) {
      this.id_new();
      if (!((rhx_3)this.id_implements[id_native[290]]).id_break) {
         super.id_class(var1, var2);
      }
   }

   public OptionalInt id_class(rJZ var1) {
      return OptionalInt.empty();
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      this.id_new();
      if (var1 >= 0 && var1 < ((rhz_3)this.id_implements[id_native[374]]).id_class.size()) {
         ((rhz_3)this.id_implements[id_native[375]]).id_break(var1, var2);
         return id_package[153];
      } else {
         rXQ var3;
         if (var1 == id_class[50] + rXQ.HEAD.id_break()) {
            var3 = rXQ.HEAD;
         } else if (var1 == id_class[51] + rXQ.CHEST.id_break()) {
            var3 = rXQ.CHEST;
         } else if (var1 == id_class[52] + rXQ.LEGS.id_break()) {
            var3 = rXQ.LEGS;
         } else if (var1 == id_class[53] + rXQ.FEET.id_break()) {
            var3 = rXQ.FEET;
         } else {
            var3 = null;
         }

         if (var1 == id_class[54]) {
            this.id_class(rXQ.MAINHAND, var2);
            return id_package[154];
         } else if (var1 == id_class[55]) {
            this.id_class(rXQ.OFFHAND, var2);
            return id_package[155];
         } else if (var3 == null) {
            int var4 = var1 - id_native[376];
            if (var4 >= 0 && var4 < ((rXz_1)this.id_implements[id_native[377]]).id_else()) {
               ((rXz_1)this.id_implements[id_native[378]]).id_break(var4, var2);
               return id_package[156];
            } else {
               return id_package[157];
            }
         } else {
            if (!var2.id_class()) {
               if (!(var2.id_break() instanceof rxS_2) && !(var2.id_break() instanceof rxH_2)) {
                  if (var3 != rXQ.HEAD) {
                     return id_package[158];
                  }
               } else if (is_3.id_finally(var2) != var3) {
                  return id_package[159];
               }
            }

            ((rhz_3)this.id_implements[id_native[379]]).id_break(var3.id_break() + ((rhz_3)this.id_implements[id_native[380]]).id_class.size(), var2);
            return id_package[160];
         }
      }
   }

   public void id_class(rCi_1<?> var1) {
      this.id_class(var1, id_package[105]);
   }

   @Override
   public boolean id_class(rye_3 var1) {
      if (super.id_class(var1)) {
         return id_package[50];
      } else if (var1 == rye_3.id_private) {
         return !((rYB)this.id_throws[id_native[198]]).B().id_break(rRu_1.id_try) ? id_package[51] : id_package[52];
      } else if (var1 == rye_3.id_extends) {
         return !((rYB)this.id_throws[id_native[199]]).B().id_break(rRu_1.id_instanceof) ? id_package[53] : id_package[54];
      } else if (var1.id_int()) {
         return !((rYB)this.id_throws[id_native[200]]).B().id_break(rRu_1.id_throw) ? id_package[55] : id_package[56];
      } else {
         return id_package[57];
      }
   }

   public void id_class(rqO_2[] var1) {
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_new();
      super.id_class(var1);
      var1.id_break(id_finally[17], rqu_3.id_class().getWorldVersion());
      var1.id_class(id_finally[18], ((rhz_3)this.id_implements[id_native[188]]).id_class(new rcy_3()));
      var1.id_break(id_finally[19], ((rhz_3)this.id_implements[id_native[189]]).id_protected);
      var1.id_class(id_finally[20], (short)((Integer)this.id_implements[id_native[190]]).intValue());
      var1.id_class(id_finally[21], (Float)this.id_implements[id_native[191]]);
      var1.id_break(id_finally[22], (Integer)this.id_implements[id_native[192]]);
      var1.id_break(id_finally[23], (Integer)this.id_implements[id_native[193]]);
      var1.id_break(id_finally[24], (Integer)this.id_implements[id_native[194]]);
      var1.id_break(id_finally[25], this.sp());
      ((rpQ_2)this.id_implements[id_native[195]]).id_break(var1);
      ((rhx_3)this.id_implements[id_native[196]]).id_class(var1);
      var1.id_class(id_finally[26], ((rXz_1)this.id_implements[id_native[197]]).id_byte());
      if (!this.sQ().id_case()) {
         var1.id_class(id_finally[27], this.sQ());
      }

      if (!this.sJ().id_case()) {
         var1.id_class(id_finally[28], this.sJ());
      }
   }

   public void id_class(rqO_2 var1, int var2) {
      this.id_class(rlB_2.id_implements.id_break(var1), var2);
   }

   private rVi_1 id_class(rVi_1 var1) {
      String var2 = this.sv().getName();
      return var1.id_class(var2x -> var2x.id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, "/tell " + var2 + " ")).id_class(this.rM()).id_class(var2));
   }

   public void id_class(rHj_1 var1) {
   }

   @Override
   public rdn_3 id_class(rYB var1, rdn_3 var2) {
      this.sk().id_class(var2.id_break(), var2);
      this.id_class(rlB_2.id_byte.id_break(var2.id_break()));
      var1.id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hn, rqL_2.PLAYERS, id_final[150], var1.id_int.nextFloat() * id_final[151] + id_final[152]);
      if (this instanceof rhN_2) {
         Oo_1.id_while.id_class((rhN_2)this, var2);
      }

      return super.id_class(var1, var2);
   }

   public Either<rhW_2, rqg_3> id_class(rfH_2 var1) {
      this.id_new();
      this.id_case(var1);
      Integer var6 = Integer.valueOf(id_package[98]);
      this.id_implements[id_native[268]] = var6;
      return Either.right(rqg_3.INSTANCE);
   }

   public void id_class(rOD var1, rXu_1 var2) {
   }

   @Override
   public void id_class(rqA_2 var1, float var2, float var3) {
      ((rYB)this.id_throws[id_native[92]]).id_class(this, this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3);
   }

   public void id_class(rqA_2 var1, rqL_2 var2, float var3, float var4) {
   }

   @Override
   public void id_class(an_3 var1) {
   }

   public void id_class(ryS_2 var1) {
   }

   @Override
   public void id_class(rye_3 var1, float var2) {
      if (!this.id_class(var1)) {
         var2 = this.id_protected(var1, var2);
         var2 = this.id_throws(var1, var2);
         float var3 = Math.max(var2 - this.Sd(), id_final[58]);
         this.id_return(this.Sd() - (var2 - var3));
         float var4 = var2 - var3;
         if (var4 > id_final[59] && var4 < id_final[60]) {
            this.id_class(rlB_2.id_import, Math.round(var4 * id_final[61]));
         }

         if (var3 != id_final[62]) {
            this.id_while(var1.id_catch());
            float var5 = this.Ss();
            this.id_public(this.Ss() - var3);
            this.SW().id_class(var1, var5, var3);
            if (var3 < id_final[63]) {
               this.id_class(rlB_2.id_void, Math.round(var3 * id_final[64]));
            }
         }
      }
   }

   @Override
   public void id_class(rrEm_1 var1, iB_2 var2) {
      this.id_class(rlB_2.id_catch.id_break(var2.BC()));
   }

   public boolean id_class(rhQ_2 var1) {
      return (this.BQ().<Byte>id_class((rut_3<Byte>)id_protected[id_native[373]]) & var1.id_class()) == var1.id_class() ? id_package[151] : id_package[152];
   }

   public boolean id_class(xc_3 var1, rdn_3 var2) {
      return var1.id_new() && !var2.id_break(var1) ? id_package[49] : id_package[48];
   }

   public void id_class(rRl_1 var1) {
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1461789825;
   }

   public void id_class(rHZ var1) {
   }

   public void id_class(boolean var1, boolean var2) {
      this.id_new();
      super.SQ();
      if ((rYB)this.id_throws[id_native[269]] instanceof rrEm_1 && var2) {
         ((rrEm_1)((rYB)this.id_throws[id_native[270]])).id_private();
      }

      Integer var7 = Integer.valueOf(var1 ? id_package[99] : id_class[22]);
      this.id_implements[id_native[271]] = var7;
   }

   @Override
   public void id_class(byte var1) {
      this.id_new();
      if (var1 == id_class[6]) {
         this.sP();
      } else if (var1 == id_class[7]) {
         Boolean var6 = id_package[26];
         this.id_implements[id_native[93]] = var6;
      } else if (var1 == id_class[8]) {
         Boolean var7 = id_package[27];
         this.id_implements[id_native[94]] = var7;
      } else if (var1 == id_class[9]) {
         this.id_class(rLQ.id_case);
      } else {
         super.id_class(var1);
      }
   }

   public static UUID id_class(GameProfile var0) {
      UUID var1 = var0.getId();
      if (var1 == null) {
         var1 = id_extends(var0.getName());
      }

      return var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3233494910581700795L;
   }

   public void id_class(rgP_2 var1, boolean var2) {
   }

   public void id_class(rCi_1<?> var1, int var2) {
   }

   public static Optional<rjU_2> id_class(rrEm_1 var0, rfH_2 var1, float var2, boolean var3, boolean var4) {
      xc_3 var5 = var0.id_byte(var1);
      xd_3 var6 = var5.id_break();
      if (var6 instanceof Wv_1 && var5.id_byte(Wv_1.id_volatile) > 0 && Wv_1.id_class(var0)) {
         Optional var9 = Wv_1.id_class(aI_2.rM, var0, var1);
         if (!var4 && var9.isPresent()) {
            var0.id_class(var1, var5.id_class(Wv_1.id_volatile, Integer.valueOf(var5.id_byte(Wv_1.id_volatile) - id_package[102])), id_class[23]);
         }

         return var9;
      } else if (var6 instanceof xb_3 && xb_3.id_class((rYB)var0)) {
         return xb_3.id_class(aI_2.rM, var0, var1, var2);
      } else if (!var3) {
         return Optional.empty();
      } else {
         boolean var7 = var6.id_class();
         boolean var8 = var0.id_byte(var1.id_final()).id_break().id_class();
         return var7 && var8
            ? Optional.of(new rjU_2((double)var1.b_() + id_break[89], (double)var1.c_() + id_break[90], (double)var1.d_() + id_break[91]))
            : Optional.empty();
      }
   }

   @Override
   public rdn_3 id_class(rXQ var1) {
      this.id_new();
      if (var1 == rXQ.MAINHAND) {
         return ((rhz_3)this.id_implements[id_native[349]]).id_byte();
      } else if (var1 == rXQ.OFFHAND) {
         return ((rhz_3)this.id_implements[id_native[350]]).id_byte.get(id_package[139]);
      } else {
         return var1.id_class() == rXN.ARMOR ? ((rhz_3)this.id_implements[id_native[351]]).id_break.get(var1.id_break()) : rdn_3.id_break;
      }
   }

   public void id_class(rpZ_2 var1) {
      ((rmE_2)this.id_throws[id_native[386]])
         .id_break((rut_3<Byte>)id_protected[id_native[387]], (byte)(var1 == rpZ_2.LEFT ? id_package[162] : id_package[163]));
   }

   private void id_class(rLx_1 var1) {
      for (int var2 = id_package[28]; var2 < id_class[10]; var2++) {
         double var3 = ((Random)this.id_throws[id_native[95]]).nextGaussian() * id_break[18];
         double var5 = ((Random)this.id_throws[id_native[96]]).nextGaussian() * id_break[19];
         double var7 = ((Random)this.id_throws[id_native[97]]).nextGaussian() * id_break[20];
         ((rYB)this.id_throws[id_native[98]])
            .id_class(var1, this.id_break(id_break[21]), this.Ph() + id_break[22], this.id_protected(id_break[23]), var3, var5, var7);
      }
   }

   @Override
   public rjU_2 id_class(float var1) {
      double var2 = id_break[106] * (this.Su() == rpZ_2.RIGHT ? id_break[107] : id_break[108]);
      float var4 = rfU_2.id_catch(var1 * id_final[153], (Float)this.id_throws[id_native[407]], (Float)this.id_throws[id_native[408]]) * id_final[154];
      float var5 = rfU_2.id_catch(var1, (Float)this.id_private[id_native[409]], (Float)this.id_private[id_native[410]]) * id_final[155];
      if (this.Sy() || this.Sz()) {
         rjU_2 var17 = this.id_break(var1);
         rjU_2 var7 = this.rv();
         double var18 = an_3.id_case(var7);
         double var10 = an_3.id_case(var17);
         float var12;
         if (var18 > id_break[114] && var10 > id_break[115]) {
            double var13 = (var7.id_break * var17.id_break + var7.id_protected * var17.id_protected) / Math.sqrt(var18 * var10);
            double var15 = var7.id_break * var17.id_protected - var7.id_protected * var17.id_break;
            var12 = (float)(Math.signum(var15) * Math.acos(var13));
         } else {
            var12 = id_final[156];
         }

         return this.id_finally(var1).id_throws(new rjU_2(var2, id_break[116], id_break[117]).id_byte(-var12).id_class(-var4).id_break(-var5));
      } else if (this.rP()) {
         return this.id_finally(var1).id_throws(new rjU_2(var2, id_break[109], id_break[110]).id_class(-var4).id_break(-var5));
      } else {
         double var6 = this.rN().id_byte() - id_break[111];
         double var8 = this.x() ? id_break[112] : id_break[113];
         return this.id_finally(var1).id_throws(new rjU_2(var2, var6, var8).id_break(-var5));
      }
   }

   @Override
   public void id_class(rXQ var1, rdn_3 var2) {
      this.id_new();
      if (var1 == rXQ.MAINHAND) {
         this.id_break(var2);
         ((rhz_3)this.id_implements[id_native[352]]).id_class.set(((rhz_3)this.id_implements[id_native[353]]).id_protected, var2);
      } else if (var1 == rXQ.OFFHAND) {
         this.id_break(var2);
         ((rhz_3)this.id_implements[id_native[354]]).id_byte.set(id_package[140], var2);
      } else if (var1.id_class() == rXN.ARMOR) {
         this.id_break(var2);
         ((rhz_3)this.id_implements[id_native[355]]).id_break.set(var1.id_break(), var2);
      }
   }

   public boolean id_class(rYB var1, rfH_2 var2, rRl_1 var3) {
      if (!var3.id_protected()) {
         return id_package[4];
      } else if (var3 == rRl_1.SPECTATOR) {
         return id_package[5];
      } else if (this.sD()) {
         return id_package[6];
      } else {
         rdn_3 var4 = this.ss();
         return !var4.id_class() && var4.id_class(var1.id_int(), new ryw_3(var1, var2, id_package[7])) ? id_package[9] : id_package[8];
      }
   }

   public rsE_2 id_class(rdn_3 var1, boolean var2) {
      return this.id_class(var1, id_package[42], var2);
   }

   public void id_class(ryG_2 var1) {
   }

   public boolean id_class(rfH_2 var1, rpr_3 var2, rdn_3 var3) {
      this.id_new();
      if (((rhx_3)this.id_implements[id_native[340]]).id_throws) {
         return id_package[132];
      } else {
         rfH_2 var4 = var1.id_break(var2.id_case());
         ryw_3 var5 = new ryw_3((rYB)this.id_throws[id_native[341]], var4, id_package[133]);
         return var3.id_break(((rYB)this.id_throws[id_native[342]]).id_int(), var5);
      }
   }

   public void id_class(rHm_1 var1) {
   }

   public float id_class(rdn_3 var1, xc_3 var2) {
      this.id_new();
      float var3 = ((rhz_3)this.id_implements[id_native[170]]).id_class(var1, var2);
      if (var3 > id_final[39]) {
         int var4 = eA_2.id_class(eY_2.id_this, var1);
         if (var4 > 0 && var1 != null && !var1.id_class()) {
            var3 += (float)(var4 * var4 + id_package[46]);
         }
      }

      if (rLK.id_class(this)) {
         var3 *= id_final[40] + (float)(rLK.id_break(this) + id_package[47]) * id_final[41];
      }

      if (this.id_break(rLD.id_protected)) {
         float var5 = switch (this.id_byte(rLD.id_protected).id_byte()) {
            case 0 -> id_final[42];
            case 1 -> id_final[43];
            case 2 -> id_final[44];
            default -> id_final[45];
         };
         var3 *= var5;
      }

      if (this.id_class(rlG_2.id_break) && !eA_2.id_private(this)) {
         var3 /= id_final[46];
      }

      if (!(Boolean)this.id_throws[id_native[171]]) {
         var3 /= id_final[47];
      }

      return var3;
   }

   public boolean sm() {
      this.id_new();
      return this.Sc() && this.id_implements[id_native[272]] >= id_class[24] ? id_package[103] : id_package[104];
   }

   public boolean sc() {
      this.id_new();
      return (Boolean)this.id_implements[id_native[411]];
   }

   @Override
   public void p() {
      this.id_new();
      if (((rhx_3)this.id_implements[id_native[284]]).id_break) {
         this.id_native(id_package[111]);
      } else {
         super.p();
      }
   }

   @Override
   public void id_default() {
      this.id_new();
      if ((Integer)this.id_implements[id_native[109]] > 0) {
         Integer var10 = (Integer)this.id_implements[id_native[110]] - id_package[31];
         this.id_implements[id_native[111]] = var10;
      }

      if (((rYB)this.id_throws[id_native[112]]).id_abstract() == rRO.PEACEFUL && ((rYB)this.id_throws[id_native[113]]).B().id_break(rRu_1.id_implements)) {
         if (this.Ss() < this.SK() && (Integer)this.id_throws[id_native[114]] % id_class[11] == 0) {
            this.id_protected(id_final[5]);
         }

         if (((rpQ_2)this.id_implements[id_native[115]]).id_break() && (Integer)this.id_throws[id_native[116]] % id_class[12] == 0) {
            ((rpQ_2)this.id_implements[id_native[117]]).id_class(((rpQ_2)this.id_implements[id_native[118]]).id_class() + id_package[32]);
         }
      }

      ((rhz_3)this.id_implements[id_native[119]]).id_catch();
      Float var11 = (Float)this.id_implements[id_native[120]];
      this.id_implements[id_native[121]] = var11;
      super.id_default();
      Float var12 = id_final[6];
      this.id_private[id_native[122]] = var12;
      if (this.PF()) {
         Float var13 = (float)((double)((Float)this.id_private[id_native[123]]).floatValue() + id_break[24]);
         this.id_private[id_native[124]] = var13;
      }

      this.id_super((float)this.id_class(iQ_2.id_protected));
      float var1;
      if ((Boolean)this.id_throws[id_native[125]] && !this.Sl() && !this.Py()) {
         var1 = Math.min(id_final[7], rfU_2.id_class(id_case(this.rv())));
      } else {
         var1 = id_final[8];
      }

      Float var14 = (Float)this.id_implements[id_native[126]] + (var1 - (Float)this.id_implements[id_native[127]]) * id_final[9];
      this.id_implements[id_native[128]] = var14;
      if (this.Ss() > id_final[10] && !this.id_native()) {
         rfl_3 var2;
         if (this.Pm() && !(Boolean)this.ra().id_throws[id_native[129]]) {
            var2 = this.rN().id_break(this.ra().rN()).id_byte(id_break[25], id_break[26], id_break[27]);
         } else {
            var2 = this.rN().id_byte(id_break[28], id_break[29], id_break[30]);
         }

         List var3 = ((rYB)this.id_throws[id_native[130]]).id_class(this, var2);

         for (int var4 = id_package[33]; var4 < var3.size(); var4++) {
            an_3 var5 = (an_3)var3.get(var4);
            if (!(Boolean)var5.id_throws[id_native[131]]) {
               this.id_char(var5);
            }
         }
      }

      this.id_extends(this.sQ());
      this.id_extends(this.sJ());
      if (!((rYB)this.id_throws[id_native[132]]).id_continue && ((Float)this.id_throws[id_native[133]] > id_final[11] || this.rT())
         || ((rhx_3)this.id_implements[id_native[134]]).id_break
         || this.Sc()) {
         this.sI();
      }
   }

   public rXz_1 se() {
      this.id_new();
      return (rXz_1)this.id_implements[id_native[348]];
   }

   @Override
   public rgP_2 g() {
      this.id_new();
      return new rgN_2(((GameProfile)this.id_implements[id_native[347]]).getName());
   }

   public boolean sd() {
      return this.sL() && this.sX().id_break().id_byte(this.sX()) == rkc_3.BLOCK ? id_package[170] : id_package[171];
   }

   @Override
   public void U() {
      if (!this.id_native()) {
         super.U();
      }
   }

   public boolean sj() {
      return this.sL() && this.sX().id_break().id_byte(this.sX()) == rkc_3.CROSSBOW ? id_package[174] : id_package[175];
   }

   public boolean id_void() {
      this.id_new();
      Boolean var5 = this.id_class(rlG_2.id_break);
      this.id_implements[id_native[54]] = var5;
      return (Boolean)this.id_implements[id_native[55]];
   }

   public boolean sw() {
      if (!(Boolean)this.id_throws[id_native[289]] && !this.Sy() && !this.rT() && !this.id_break(rLD.id_goto)) {
         rdn_3 var1 = this.id_class(rXQ.CHEST);
         if (var1.id_break() == rdy_3.kc && rxH_2.id_protected(var1)) {
            this.sz();
            return id_package[115];
         }
      }

      return id_package[116];
   }

   @Override
   public boolean u() {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[368]]).id_break ? id_package[149] : id_package[150];
   }

   public void sf() {
      this.id_new();

      for (int var1 = id_package[36]; var1 < ((rhz_3)this.id_implements[id_native[149]]).id_else(); var1++) {
         rdn_3 var2 = ((rhz_3)this.id_implements[id_native[150]]).id_extends(var1);
         if (!var2.id_class() && eA_2.id_throws(var2)) {
            ((rhz_3)this.id_implements[id_native[151]]).id_native(var1);
         }
      }
   }

   @Override
   public boolean id_break(xc_3 var1) {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[406]]).id_break && !super.id_break(var1) ? id_package[169] : id_package[168];
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      this.id_new();
      if (this.id_class(var1)) {
         return id_package[58];
      } else if (((rhx_3)this.id_implements[id_native[201]]).id_class && !var1.id_private()) {
         return id_package[59];
      } else {
         Integer var7 = Integer.valueOf(id_package[60]);
         this.id_private[id_native[202]] = var7;
         if (this.Sl()) {
            return id_package[61];
         } else {
            this.sI();
            if (var1.id_super()) {
               if (((rYB)this.id_throws[id_native[203]]).id_abstract() == rRO.PEACEFUL) {
                  var2 = id_final[48];
               }

               if (((rYB)this.id_throws[id_native[204]]).id_abstract() == rRO.EASY) {
                  var2 = Math.min(var2 / id_final[49] + id_final[50], var2);
               }

               if (((rYB)this.id_throws[id_native[205]]).id_abstract() == rRO.HARD) {
                  var2 = var2 * id_final[51] / id_final[52];
               }
            }

            return var2 != id_final[53] && super.id_break(var1, var2) ? id_package[62] : id_package[63];
         }
      }
   }

   @Override
   public void id_break(rdn_3 var1, int var2) {
      this.id_new();
      Integer var7 = (Integer)this.id_implements[id_native[306]] - var2;
      this.id_implements[id_native[307]] = var7;
      if ((Integer)this.id_implements[id_native[308]] < 0) {
         Integer var8 = Integer.valueOf(id_package[124]);
         this.id_implements[id_native[309]] = var8;
         Float var9 = id_final[134];
         this.id_implements[id_native[310]] = var9;
         Integer var10 = Integer.valueOf(id_package[125]);
         this.id_implements[id_native[311]] = var10;
      }

      Integer var11 = ((Random)this.id_throws[id_native[312]]).nextInt();
      this.id_implements[id_native[313]] = var11;
   }

   public void id_break(an_3 var1) {
   }

   @Override
   public void id_break(rye_3 var1) {
      super.id_break(var1);
      this.PX();
      if (!this.id_native()) {
         this.id_protected(var1);
      }

      if (var1 != null) {
         this.id_catch(
            (double)(-rfU_2.id_break(((Float)this.id_private[id_native[143]] + (Float)this.id_throws[id_native[144]]) * id_final[12]) * id_final[13]),
            id_break[31],
            (double)(-rfU_2.id_class(((Float)this.id_private[id_native[145]] + (Float)this.id_throws[id_native[146]]) * id_final[14]) * id_final[15])
         );
      } else {
         this.id_catch(id_break[32], id_break[33], id_break[34]);
      }

      this.id_break(rlB_2.id_default);
      this.id_break(rlB_2.id_implements.id_break(rlB_2.id_native));
      this.id_break(rlB_2.id_implements.id_break(rlB_2.id_volatile));
      this.rE();
      this.id_break(id_package[34], id_package[35]);
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_new();
      super.id_break(var1);
      this.a_(id_class((GameProfile)this.id_implements[id_native[173]]));
      rcy_3 var2 = var1.id_protected(id_finally[3], id_class[14]);
      ((rhz_3)this.id_implements[id_native[174]]).id_break(var2);
      ((rhz_3)this.id_implements[id_native[175]]).id_protected = var1.id_private(id_finally[4]);
      Integer var7 = Integer.valueOf(var1.id_catch(id_finally[5]));
      this.id_implements[id_native[176]] = var7;
      Float var8 = var1.id_finally(id_finally[6]);
      this.id_implements[id_native[177]] = var8;
      Integer var9 = var1.id_private(id_finally[7]);
      this.id_implements[id_native[178]] = var9;
      Integer var10 = var1.id_private(id_finally[8]);
      this.id_implements[id_native[179]] = var10;
      Integer var11 = var1.id_private(id_finally[9]);
      this.id_implements[id_native[180]] = var11;
      if ((Integer)this.id_implements[id_native[181]] == 0) {
         Integer var12 = ((Random)this.id_throws[id_native[182]]).nextInt();
         this.id_implements[id_native[183]] = var12;
      }

      this.id_break(var1.id_private(id_finally[10]));
      ((rpQ_2)this.id_implements[id_native[184]]).id_class(var1);
      ((rhx_3)this.id_implements[id_native[185]]).id_break(var1);
      this.id_byte(iQ_2.id_protected).id_class((double)((rhx_3)this.id_implements[id_native[186]]).id_break());
      if (var1.id_byte(id_finally[11], id_class[15])) {
         ((rXz_1)this.id_implements[id_native[187]]).id_class(var1.id_protected(id_finally[12], id_class[16]));
      }

      if (var1.id_byte(id_finally[13], id_class[17])) {
         this.id_catch(var1.id_int(id_finally[14]));
      }

      if (var1.id_byte(id_finally[15], id_class[18])) {
         this.id_implements(var1.id_int(id_finally[16]));
      }
   }

   public void id_break(boolean var1, boolean var2) {
      this.id_new();
      Boolean var7 = var1;
      this.id_implements[id_native[412]] = var7;
      if (var2 && var1) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[413]]).id_finally().id_class(rrnz_3.id_class(this));
      }
   }

   public void id_break(rCi_1<?> var1) {
   }

   @Override
   public float id_break(iM_2 var1, ap_3 var2) {
      switch (((int[])rhk_3.id_class[id_native[370]])[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
            return id_final[142];
         case 4:
            return id_final[143];
         default:
            return id_final[144];
      }
   }

   public int id_break(Collection<rkw_3<?>> var1) {
      return id_package[106];
   }

   public void id_break(rqO_2 var1) {
      this.id_class(rlB_2.id_implements.id_break(var1));
   }

   public void id_break(int var1) {
      ((rmE_2)this.id_throws[id_native[139]]).id_break((rut_3<Integer>)id_protected[id_native[140]], var1);
   }

   public boolean id_throws(rhd_3 var1) {
      rnM_2 var2 = this.BG();
      rnM_2 var3 = var1.BG();
      if (var2 == null) {
         return id_package[65];
      } else {
         return var2.id_class(var3) && !var2.id_catch() ? id_package[67] : id_package[66];
      }
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      rXQ var2 = is_3.id_finally(var1);
      return this.id_class(var2).id_class();
   }

   public void sx() {
      this.id_break(id_class[29], id_package[120]);
      this.id_break(id_class[30], id_package[121]);
   }

   public boolean so() {
      return !this.id_throws[id_native[227]]
            && (
               !(this.id_throws[id_native[228]] < this.id_throws[id_native[229]])
                  || ((rYB)this.id_throws[id_native[230]])
                     .a_(
                        this,
                        this.rN()
                           .id_protected(id_break[68], (double)((Float)this.id_throws[id_native[231]] - (Float)this.id_throws[id_native[232]]), id_break[69])
                     )
            )
         ? id_package[77]
         : id_package[76];
   }

   public rpQ_2 sk() {
      this.id_new();
      return (rpQ_2)this.id_implements[id_native[336]];
   }

   public GameProfile sv() {
      this.id_new();
      return (GameProfile)this.id_implements[id_native[267]];
   }

   @Override
   public void PD() {
      this.id_new();
      super.PD();
      ((rJT)this.id_implements[id_native[264]]).id_break(this);
      if ((rJr_1)this.id_implements[id_native[265]] != null) {
         ((rJr_1)this.id_implements[id_native[266]]).id_break(this);
      }
   }

   private void id_finally(rcd_3 var1) {
      if (!((rYB)this.id_throws[id_native[365]]).id_continue && !var1.id_case()) {
         aI_2.id_class(var1, (rYB)this.id_throws[id_native[366]]).ifPresent(var1x -> {
            if (var1x instanceof rOQ) {
               ((rOQ)var1x).id_break((UUID)this.id_throws[id_native[437]]);
            }

            var1x.id_new(this.rx(), this.re() + id_break[118], this.BO());
            ((rrEm_1)((rYB)this.id_throws[id_native[438]])).id_case(var1x);
         });
      }
   }

   private static void id_catch() {
      id_final = new float[]{
         -1.0F,
         0.0F,
         180.0F,
         0.0F,
         0.0F,
         1.0F,
         0.02F,
         0.1F,
         0.0F,
         0.4F,
         0.0F,
         0.5F,
         (float) (Math.PI / 180.0),
         0.1F,
         (float) (Math.PI / 180.0),
         0.1F,
         0.5F,
         (float) (Math.PI * 2),
         0.3F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI * 2),
         0.02F,
         0.3F,
         0.3F,
         0.1F,
         0.1F,
         0.3F,
         1.0F,
         1.0F,
         0.2F,
         0.3F,
         0.09F,
         0.0027F,
         8.1E-4F,
         5.0F,
         5.0F,
         1.0F,
         1.0F,
         0.2F,
         0.3F,
         0.09F,
         0.0027F,
         8.1E-4F,
         5.0F,
         5.0F,
         0.0F,
         2.0F,
         1.0F,
         3.0F,
         2.0F,
         0.0F,
         3.0F,
         0.8F,
         0.8F,
         0.4F,
         0.0F,
         0.0F,
         3.4028235E37F,
         10.0F,
         0.0F,
         3.4028235E37F,
         10.0F,
         0.5F,
         0.2F,
         0.8F,
         0.0F,
         0.0F,
         0.9F,
         1.0F,
         1.0F,
         0.0F,
         1.5F,
         0.0F,
         0.5F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         0.5F,
         (float) (Math.PI / 180.0),
         0.5F,
         1.0F,
         0.4F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         10.0F,
         2.0F,
         0.1F,
         1.0F,
         1.0F,
         0.25F,
         0.05F,
         0.75F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         0.2F,
         0.05F,
         0.0F,
         100.0F,
         0.01F,
         0.01F,
         100.0F,
         0.01F,
         0.01F,
         100.0F,
         0.01F,
         0.01F,
         100.0F,
         0.1F,
         0.01F,
         0.0F,
         0.01F,
         0.0F,
         0.01F,
         100.0F,
         100.0F,
         100.0F,
         2.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         100.0F,
         1.0F,
         30.0F,
         0.75F,
         1.0F,
         0.0F,
         0.4F,
         1.27F,
         1.62F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         0.5F,
         0.1F,
         0.9F,
         0.5F,
         (float) (Math.PI / 180.0),
         (float) (Math.PI / 180.0),
         0.0F,
         1.0F,
         0.6F,
         1.8F,
         0.6F,
         0.6F,
         0.6F,
         0.6F,
         0.6F,
         0.6F,
         0.6F,
         1.5F,
         0.2F,
         0.2F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public boolean id_catch(rdn_3 var1) {
      this.id_new();
      this.id_break(var1);
      return ((rhz_3)this.id_implements[id_native[356]]).id_throws(var1);
   }

   public void id_catch(rcd_3 var1) {
      ((rmE_2)this.id_throws[id_native[390]]).id_break((rut_3<rcd_3>)id_protected[id_native[391]], var1);
   }

   public void G() {
   }

   private void id_extends(rcd_3 var1) {
      if (var1 != null
         && (!var1.id_throws(id_finally[0]) || !var1.id_new(id_finally[1]))
         && ((rYB)this.id_throws[id_native[135]]).id_int.nextInt(id_native[136]) == 0) {
         String var2 = var1.id_native(id_finally[2]);
         aI_2.id_class(var2)
            .filter(var0 -> var0 == aI_2.X ? id_package[183] : id_package[184])
            .ifPresent(
               var1x -> {
                  if (!rMR.id_class((rYB)this.id_throws[id_native[439]], this)) {
                     ((rYB)this.id_throws[id_native[440]])
                        .id_class(
                           null,
                           this.rx(),
                           this.re(),
                           this.BO(),
                           rMR.id_class((rYB)this.id_throws[id_native[441]], ((rYB)this.id_throws[id_native[442]]).id_int),
                           this.Pr(),
                           id_final[157],
                           rMR.id_class(((rYB)this.id_throws[id_native[443]]).id_int)
                        );
                  }
               }
            );
      }
   }

   public static UUID id_extends(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public void id_case(iB_2 var1) {
      this.id_throw(var1);
   }

   @Override
   public rdn_3 id_case(rdn_3 var1) {
      this.id_new();
      if (!(var1.id_break() instanceof rkB_2)) {
         return rdn_3.id_break;
      } else {
         Predicate var2 = ((rkB_2)var1.id_break()).id_private();
         rdn_3 var3 = rkB_2.id_class(this, var2);
         if (!var3.id_class()) {
            return var3;
         } else {
            var2 = ((rkB_2)var1.id_break()).id_byte();

            for (int var4 = id_package[167]; var4 < ((rhz_3)this.id_implements[id_native[403]]).id_else(); var4++) {
               rdn_3 var5 = ((rhz_3)this.id_implements[id_native[404]]).id_extends(var4);
               if (var2.test(var5)) {
                  return var5;
               }
            }

            return ((rhx_3)this.id_implements[id_native[405]]).id_protected ? new rdn_3(rdy_3.OO) : rdn_3.id_break;
         }
      }
   }

   @Override
   public void id_const() {
      super.id_const();
      Integer var5 = Integer.valueOf(id_package[71]);
      this.id_throws[id_native[218]] = var5;
   }

   @Override
   public void id_continue(boolean var1) {
      super.id_continue(var1);
      this.id_break(rlB_2.id_interface);
      if (this.PF()) {
         this.id_while(id_final[106]);
      } else {
         this.id_while(id_final[107]);
      }
   }

   public void id_continue(double var1, double var3, double var5) {
      if (!this.Pm()) {
         if (this.Py()) {
            int var7 = Math.round(rfU_2.id_class(var1 * var1 + var3 * var3 + var5 * var5) * id_final[109]);
            if (var7 > 0) {
               this.id_class(rlB_2.id_instanceof, var7);
               this.id_while(id_final[110] * (float)var7 * id_final[111]);
            }
         } else if (this.id_class(rlG_2.id_break)) {
            int var8 = Math.round(rfU_2.id_class(var1 * var1 + var3 * var3 + var5 * var5) * id_final[112]);
            if (var8 > 0) {
               this.id_class(rlB_2.id_synchronized, var8);
               this.id_while(id_final[113] * (float)var8 * id_final[114]);
            }
         } else if (this.rT()) {
            int var9 = Math.round(rfU_2.id_class(var1 * var1 + var5 * var5) * id_final[115]);
            if (var9 > 0) {
               this.id_class(rlB_2.id_continue, var9);
               this.id_while(id_final[116] * (float)var9 * id_final[117]);
            }
         } else if (this.o_()) {
            if (var3 > id_break[101]) {
               this.id_class(rlB_2.id_this, (int)Math.round(var3 * id_break[102]));
            }
         } else if ((Boolean)this.id_throws[id_native[287]]) {
            int var10 = Math.round(rfU_2.id_class(var1 * var1 + var5 * var5) * id_final[118]);
            if (var10 > 0) {
               if (this.PF()) {
                  this.id_class(rlB_2.id_new, var10);
                  this.id_while(id_final[119] * (float)var10 * id_final[120]);
               } else if (this.x()) {
                  this.id_class(rlB_2.id_int, var10);
                  this.id_while(id_final[121] * (float)var10 * id_final[122]);
               } else {
                  this.id_class(rlB_2.id_package, var10);
                  this.id_while(id_final[123] * (float)var10 * id_final[124]);
               }
            }
         } else if (this.Sy()) {
            int var11 = Math.round(rfU_2.id_class(var1 * var1 + var3 * var3 + var5 * var5) * id_final[125]);
            this.id_class(rlB_2.id_try, var11);
         } else {
            int var12 = Math.round(rfU_2.id_class(var1 * var1 + var5 * var5) * id_final[126]);
            if (var12 > id_class[27]) {
               this.id_class(rlB_2.id_else, var12);
            }
         }
      }
   }

   private static void id_continue() {
      Object[] var0 = new Object[9];
      var0[0] = ap_3.id_break(0.6F, 1.8F);
      var0[1] = ImmutableMap.builder()
         .put(iM_2.STANDING, var0[0])
         .put(iM_2.SLEEPING, new ap_3(0.2F, 0.2F, true))
         .put(iM_2.FALL_FLYING, ap_3.id_break(0.6F, 0.6F))
         .put(iM_2.SWIMMING, ap_3.id_break(0.6F, 0.6F))
         .put(iM_2.SPIN_ATTACK, ap_3.id_break(0.6F, 0.6F))
         .put(iM_2.CROUCHING, ap_3.id_break(0.6F, 1.5F))
         .put(iM_2.DYING, ap_3.id_byte(0.2F, 0.2F))
         .build();
      var0[2] = rmE_2.id_class(rhd_3.class, ruw_3.id_byte);
      var0[3] = rmE_2.id_class(rhd_3.class, ruw_3.id_break);
      var0[4] = rmE_2.id_class(rhd_3.class, ruw_3.id_class);
      var0[5] = rmE_2.id_class(rhd_3.class, ruw_3.id_class);
      var0[6] = rmE_2.id_class(rhd_3.class, ruw_3.id_int);
      var0[7] = rmE_2.id_class(rhd_3.class, ruw_3.id_int);
      var0[8] = new rqO_2(id_finally[29]);
      id_protected = var0;
   }

   public void id_continue(int var1) {
      int var2 = this.sp();
      ((rmE_2)this.id_throws[id_native[141]]).id_break((rut_3<Integer>)id_protected[id_native[142]], var2 + var1);
   }

   public boolean id_else(boolean var1) {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[337]]).id_class && !var1 && !((rpQ_2)this.id_implements[id_native[338]]).id_break()
         ? id_package[129]
         : id_package[128];
   }

   @Override
   public void id_else(float var1) {
      if (((rdn_3)this.id_private[id_native[207]]).id_break() == rdy_3.kN) {
         if (!((rYB)this.id_throws[id_native[208]]).id_continue) {
            this.id_class(rlB_2.id_byte.id_break(((rdn_3)this.id_private[id_native[209]]).id_break()));
         }

         if (var1 >= id_final[54]) {
            int var2 = id_package[68] + rfU_2.id_protected(var1);
            rpm_3 var3 = this.P();
            ((rdn_3)this.id_private[id_native[210]]).id_class(var2, this, var1x -> var1x.id_byte(var3));
            if (((rdn_3)this.id_private[id_native[211]]).id_class()) {
               if (var3 == rpm_3.MAIN_HAND) {
                  this.id_class(rXQ.MAINHAND, rdn_3.id_break);
               } else {
                  this.id_class(rXQ.OFFHAND, rdn_3.id_break);
               }

               rdn_3 var8 = rdn_3.id_break;
               this.id_private[id_native[212]] = var8;
               this.id_class(rqn_3.JP, id_final[55], id_final[56] + ((rYB)this.id_throws[id_native[213]]).id_int.nextFloat() * id_final[57]);
            }
         }
      }
   }

   private static void id_else() {
      id_package = new boolean[]{
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
         false,
         false,
         true,
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
         false,
         true,
         true,
         false,
         true,
         false,
         false,
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
         true,
         false,
         false,
         false,
         true,
         true,
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
         false,
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
         true,
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
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
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
         false,
         false,
         true,
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
         false,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   public void id_implements(rcd_3 var1) {
      ((rmE_2)this.id_throws[id_native[394]]).id_break((rut_3<rcd_3>)id_protected[id_native[395]], var1);
   }

   public abstract boolean id_implements();

   public boolean id_instanceof() {
      return this.h();
   }

   private void id_new() {
      if (this.id_implements == null) {
         this.id_implements = new Object[id_class[65]];
         Object[] var1 = this.id_implements;
         var1[id_package[188]] = id_extends[1];
         var1[id_class[66]] = Integer.valueOf(id_package[189]);
         var1[id_class[67]] = id_final[170];
         var1[id_class[68]] = id_final[171];
         var1[id_class[69]] = Integer.valueOf(id_package[190]);
         var1[id_class[70]] = id_break[119];
         var1[id_class[71]] = id_break[120];
         var1[id_class[72]] = id_break[121];
         var1[id_class[73]] = id_break[122];
         var1[id_class[74]] = id_break[123];
         var1[id_class[75]] = id_break[124];
         var1[id_class[76]] = Integer.valueOf(id_package[191]);
         var1[id_class[77]] = id_package[192];
         var1[id_class[78]] = Integer.valueOf(id_package[193]);
         var1[id_class[79]] = Integer.valueOf(id_package[194]);
         var1[id_class[80]] = id_final[172];
         var1[id_class[81]] = Integer.valueOf(id_package[195]);
         var1[id_class[82]] = Integer.valueOf(id_package[196]);
         var1[id_class[83]] = id_final[173];
         var1[id_class[84]] = id_package[197];
         var1[id_class[85]] = id_package[198];
      }
   }

   private static void id_package() {
      id_volatile = new int[]{Integer.MAX_VALUE};
   }

   @Override
   public void id_return(float var1) {
      if (var1 < id_final[145]) {
         var1 = id_final[146];
      }

      this.BQ().id_break((rut_3<Float>)id_protected[id_native[371]], var1);
   }

   private void id_super(double var1, double var3, double var5) {
      if (this.Pm()) {
         int var7 = Math.round(rfU_2.id_class(var1 * var1 + var3 * var3 + var5 * var5) * id_final[127]);
         if (var7 > 0) {
            an_3 var8 = this.ra();
            if (var8 instanceof rsJ_2) {
               this.id_class(rlB_2.id_return, var7);
            } else if (var8 instanceof rSK) {
               this.id_class(rlB_2.id_public, var7);
            } else if (var8 instanceof rMo_1) {
               this.id_class(rlB_2.id_goto, var7);
            } else if (var8 instanceof rOD) {
               this.id_class(rlB_2.id_while, var7);
            } else if (var8 instanceof rOk_1) {
               this.id_class(rlB_2.id_throw, var7);
            }
         }
      }
   }

   public void id_super(int var1) {
      this.id_new();
      Integer var7 = (Integer)this.id_implements[id_native[314]] + var1;
      this.id_implements[id_native[315]] = var7;
      if ((Integer)this.id_implements[id_native[316]] < 0) {
         Integer var8 = Integer.valueOf(id_package[126]);
         this.id_implements[id_native[317]] = var8;
         Float var9 = id_final[135];
         this.id_implements[id_native[318]] = var9;
         Integer var10 = Integer.valueOf(id_package[127]);
         this.id_implements[id_native[319]] = var10;
      }

      if (var1 > 0
         && (Integer)this.id_implements[id_native[320]] % id_class[34] == 0
         && (float)((Integer)this.id_implements[id_native[321]]).intValue() < (float)((Integer)this.id_throws[id_native[322]]).intValue() - id_final[136]) {
         float var2 = this.id_implements[id_native[323]] > id_class[35]
            ? id_final[137]
            : (float)((Integer)this.id_implements[id_native[324]]).intValue() / id_final[138];
         ((rYB)this.id_throws[id_native[325]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hq, this.Pr(), var2 * id_final[139], id_final[140]);
         Integer var11 = (Integer)this.id_throws[id_native[326]];
         this.id_implements[id_native[327]] = var11;
      }
   }

   private static void id_super() {
      id_class = new byte[]{
         100,
         100,
         110,
         80,
         10,
         20,
         9,
         23,
         22,
         43,
         5,
         20,
         10,
         40,
         10,
         9,
         10,
         10,
         10,
         4,
         100,
         30,
         100,
         3,
         100,
         2,
         7,
         25,
         7,
         7,
         7,
         4,
         -1,
         -1,
         5,
         30,
         30,
         112,
         30,
         9,
         15,
         37,
         15,
         5,
         7,
         2,
         7,
         100,
         100,
         2,
         100,
         100,
         100,
         100,
         98,
         99,
         2,
         10,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         31,
         6,
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
         19,
         20,
         21,
         22,
         23,
         24,
         26,
         30,
         9
      };
   }

   public void id_throw(an_3 var1) {
      if (var1.rt() && !var1.id_finally(this)) {
         float var2 = (float)this.id_class(iQ_2.id_case);
         float var3;
         if (var1 instanceof iB_2) {
            var3 = eA_2.id_class(this.ss(), ((iB_2)var1).sG());
         } else {
            var3 = eA_2.id_class(this.ss(), aL_2.id_class);
         }

         float var4 = this.id_class(id_final[65], id_package[78]);
         var2 *= id_final[66] + var4 * var4 * id_final[67];
         var3 *= var4;
         this.sg();
         if (var2 > id_final[68] || var3 > id_final[69]) {
            boolean var5 = var4 > id_final[70] ? id_package[79] : id_package[80];
            boolean var6 = id_package[81];
            int var7 = id_package[82];
            var7 += eA_2.id_break(this);
            if (this.PF() && var5) {
               ((rYB)this.id_throws[id_native[233]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hu, this.Pr(), id_final[71], id_final[72]);
               var7++;
               var6 = id_package[83];
            }

            boolean var8 = var5
                  && this.id_throws[id_native[234]] > id_final[73]
                  && !this.id_throws[id_native[235]]
                  && !this.o_()
                  && !this.rT()
                  && !this.id_break(rLD.id_package)
                  && !this.Pm()
                  && var1 instanceof iB_2
               ? id_package[84]
               : id_package[85];
            var8 = var8 && !this.PF() ? id_package[86] : id_package[87];
            if (var8) {
               var2 *= id_final[74];
            }

            var2 += var3;
            boolean var9 = id_package[88];
            double var10 = (double)((Float)this.id_throws[id_native[236]] - (Float)this.id_throws[id_native[237]]);
            if (var5 && !var8 && !var6 && (Boolean)this.id_throws[id_native[238]] && var10 < (double)this.sB()) {
               rdn_3 var12 = this.id_protected(rpm_3.MAIN_HAND);
               if (var12.id_break() instanceof rkx_3) {
                  var9 = id_package[89];
               }
            }

            float var31 = id_final[75];
            boolean var13 = id_package[90];
            int var14 = eA_2.id_byte(this);
            if (var1 instanceof iB_2) {
               var31 = ((iB_2)var1).Ss();
               if (var14 > 0 && !var1.Pz()) {
                  var13 = id_package[91];
                  var1.id_case(id_package[92]);
               }
            }

            rjU_2 var15 = var1.rv();
            boolean var16 = var1.id_break(rye_3.id_class(this), var2);
            if (var16) {
               if (var7 > 0) {
                  if (var1 instanceof iB_2) {
                     ((iB_2)var1)
                        .id_class(
                           (float)var7 * id_final[76],
                           (double)rfU_2.id_class((Float)this.id_throws[id_native[239]] * id_final[77]),
                           (double)(-rfU_2.id_break((Float)this.id_throws[id_native[240]] * id_final[78]))
                        );
                  } else {
                     var1.id_implements(
                        (double)(-rfU_2.id_class((Float)this.id_throws[id_native[241]] * id_final[79]) * (float)var7 * id_final[80]),
                        id_break[70],
                        (double)(rfU_2.id_break((Float)this.id_throws[id_native[242]] * id_final[81]) * (float)var7 * id_final[82])
                     );
                  }

                  if (this == (cb_3)QY.id_instanceof().id_class[id_native[243]]) {
                     rrFt_1 var17 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[244]])
                        .id_finally()
                        .id_class(rrFt_1.id_class(id_break[71], id_package[93]));
                     if (!var17.id_byte()) {
                        double var18 = var17.id_class();
                        this.id_byte(this.rv().id_throws(var18, id_break[72], var18));
                        this.c_(var17.id_break());
                     }
                  } else {
                     this.id_byte(this.rv().id_throws(id_break[73], id_break[74], id_break[75]));
                     this.c_(id_package[94]);
                  }
               }

               if (var9) {
                  float var32 = id_final[83] + eA_2.id_class(this) * var2;

                  for (iB_2 var19 : ((rYB)this.id_throws[id_native[245]]).id_class(iB_2.class, var1.rN().id_byte(id_break[76], id_break[77], id_break[78]))) {
                     if (var19 != this
                        && var19 != var1
                        && !this.id_final(var19)
                        && (!(var19 instanceof rSY) || !((rSY)var19).id_implements())
                        && this.id_int(var19) < id_break[79]) {
                        var19.id_class(
                           id_final[84],
                           (double)rfU_2.id_class((Float)this.id_throws[id_native[246]] * id_final[85]),
                           (double)(-rfU_2.id_break((Float)this.id_throws[id_native[247]] * id_final[86]))
                        );
                        var19.id_break(rye_3.id_class(this), var32);
                     }
                  }

                  ((rYB)this.id_throws[id_native[248]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hv, this.Pr(), id_final[87], id_final[88]);
                  this.sa();
               }

               if (var1 instanceof rhN_2 && (Boolean)var1.id_throws[id_native[249]]) {
                  ((rhN_2)var1).id_class.id_class(new rvc_3(var1));
                  Boolean var25 = id_package[95];
                  var1.id_throws[id_native[250]] = var25;
                  var1.id_byte(var15);
               }

               if (var8) {
                  ((rYB)this.id_throws[id_native[251]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hc, this.Pr(), id_final[89], id_final[90]);
                  this.id_class(var1);
               }

               if (!var8 && !var9) {
                  if (var5) {
                     ((rYB)this.id_throws[id_native[252]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hZ, this.Pr(), id_final[91], id_final[92]);
                  } else {
                     ((rYB)this.id_throws[id_native[253]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hF, this.Pr(), id_final[93], id_final[94]);
                  }
               }

               if (var3 > id_final[95]) {
                  this.id_break(var1);
               }

               this.id_try(var1);
               if (var1 instanceof iB_2) {
                  eA_2.id_class((iB_2)var1, this);
               }

               eA_2.id_break(this, var1);
               rdn_3 var33 = this.ss();
               Object var35 = var1;
               if (var1 instanceof rSm_1) {
                  var35 = ((rSm_1)var1).id_class;
               }

               if (!((rYB)this.id_throws[id_native[254]]).id_continue && !var33.id_class() && var35 instanceof iB_2) {
                  var33.id_class((iB_2)var35, this);
                  if (var33.id_class()) {
                     this.id_class(rpm_3.MAIN_HAND, rdn_3.id_break);
                  }
               }

               if (var1 instanceof iB_2) {
                  float var36 = var31 - ((iB_2)var1).Ss();
                  this.id_class(rlB_2.id_abstract, Math.round(var36 * id_final[96]));
                  if (var14 > 0) {
                     var1.id_case(var14 * id_class[19]);
                  }

                  if ((rYB)this.id_throws[id_native[255]] instanceof rrEm_1 && var36 > id_final[97]) {
                     int var20 = (int)((double)var36 * id_break[80]);
                     ((rrEm_1)((rYB)this.id_throws[id_native[256]]))
                        .id_class(
                           rLQ.id_private, var1.rx(), var1.id_byte(id_break[81]), var1.BO(), var20, id_break[82], id_break[83], id_break[84], id_break[85]
                        );
                  }
               }

               this.id_while(id_final[98]);
            } else {
               ((rYB)this.id_throws[id_native[257]]).id_class(null, this.rx(), this.re(), this.BO(), rqn_3.hm, this.Pr(), id_final[99], id_final[100]);
               if (var13) {
                  var1.rE();
               }
            }
         }
      }
   }

   public void id_while(float var1) {
      this.id_new();
      if (!((rhx_3)this.id_implements[id_native[333]]).id_class && !((rYB)this.id_throws[id_native[334]]).id_continue) {
         ((rpQ_2)this.id_implements[id_native[335]]).id_class(var1);
      }
   }

   @Override
   public Iterable<rdn_3> rs() {
      rdn_3[] var10000 = new rdn_3[id_class[49]];
      var10000[id_package[141]] = this.ss();
      var10000[id_package[142]] = this.Sn();
      return Lists.newArrayList(var10000);
   }

   private void id_public() {
      rdn_3 var1 = this.id_class(rXQ.HEAD);
      if (var1.id_break() == rdy_3.Os && !this.id_class(rlG_2.id_break)) {
         this.id_break(new rLY(rLD.id_volatile, id_native[56], id_package[21], id_package[22], id_package[23], id_package[24]));
      }
   }

   @Override
   public void id_protected(iB_2 var1) {
      super.id_protected(var1);
      if (var1.ss().id_break() instanceof rxM_2) {
         this.id_this(id_package[64]);
      }
   }

   public boolean id_protected(boolean var1) {
      this.id_new();
      return this.id_class(
               ((rhz_3)this.id_implements[id_native[152]])
                  .id_class(
                     ((rhz_3)this.id_implements[id_native[153]]).id_protected,
                     var1 && !((rhz_3)this.id_implements[id_native[154]]).id_byte().id_class()
                        ? ((rhz_3)this.id_implements[id_native[155]]).id_byte().id_char()
                        : id_package[37]
                  ),
               id_package[38],
               id_package[39]
            )
            != null
         ? id_package[40]
         : id_package[41];
   }

   public float id_protected(xc_3 var1) {
      this.id_new();
      float var2 = ((rhz_3)this.id_implements[id_native[168]]).id_class(var1);
      if (var2 > id_final[30]) {
         int var3 = eA_2.id_case(this);
         rdn_3 var4 = this.ss();
         if (var3 > 0 && !var4.id_class()) {
            var2 += (float)(var3 * var3 + id_package[44]);
         }
      }

      if (rLK.id_class(this)) {
         var2 *= id_final[31] + (float)(rLK.id_break(this) + id_package[45]) * id_final[32];
      }

      if (this.id_break(rLD.id_protected)) {
         float var5 = switch (this.id_byte(rLD.id_protected).id_byte()) {
            case 0 -> id_final[33];
            case 1 -> id_final[34];
            case 2 -> id_final[35];
            default -> id_final[36];
         };
         var2 *= var5;
      }

      if (this.id_class(rlG_2.id_break) && !eA_2.id_private(this)) {
         var2 /= id_final[37];
      }

      if (!(Boolean)this.id_throws[id_native[169]]) {
         var2 /= id_final[38];
      }

      return var2;
   }

   @Override
   public void id_protected(int var1) {
      this.id_new();
      super.id_protected(((rhx_3)this.id_implements[id_native[383]]).id_class ? Math.min(var1, id_package[161]) : var1);
   }

   public void id_protected(rhd_3 var1) {
      this.id_new();
      Float var6 = (Float)var1.id_throws[id_native[414]];
      this.id_throws[id_native[415]] = var6;
      Float var7 = (Float)var1.id_throws[id_native[416]];
      this.id_throws[id_native[417]] = var7;
      Float var8 = (Float)var1.id_throws[id_native[418]];
      this.id_throws[id_native[419]] = var8;
      Float var9 = (Float)var1.id_throws[id_native[420]];
      this.id_throws[id_native[421]] = var9;
      an_3 var10 = (an_3)var1.id_throws[id_native[422]];
      this.id_throws[id_native[423]] = var10;
      rhx_3 var11 = (rhx_3)var1.id_implements[id_native[424]];
      this.id_implements[id_native[425]] = var11;
      Float var12 = (Float)var1.id_throws[id_native[426]];
      this.id_throws[id_native[427]] = var12;
      Float var13 = (Float)var1.id_throws[id_native[428]];
      this.id_throws[id_native[429]] = var13;
      Boolean var14 = (Boolean)var1.id_implements[id_native[430]];
      this.id_implements[id_native[431]] = var14;
      this.id_throws(var1.PA());
      this.id_byte(var1.rv());
      this.id_throws(var1.BX());
      this.id_class(
         var1.rx(),
         var1.re(),
         var1.BO(),
         (Float)var1.id_throws[id_native[432]],
         (Float)var1.id_throws[id_native[433]],
         (Integer)var1.id_private[id_native[434]],
         id_package[182]
      );
      this.id_class(var1.rx(), var1.re(), var1.BO(), (Float)var1.id_throws[id_native[435]], (Float)var1.id_throws[id_native[436]]);
   }

   public boolean id_private(rfH_2 var1) {
      return !((rYB)this.id_throws[id_native[285]]).id_byte(var1).id_final((rYB)this.id_throws[id_native[286]], var1) ? id_package[112] : id_package[113];
   }

   public boolean id_private(rcd_3 var1) {
      this.id_new();
      if (this.Pm() || !(Boolean)this.id_throws[id_native[358]] || this.rT()) {
         return id_package[146];
      } else if (this.sQ().id_case()) {
         this.id_catch(var1);
         Long var6 = ((rYB)this.id_throws[id_native[359]]).r();
         this.id_implements[id_native[360]] = var6;
         return id_package[143];
      } else if (this.sJ().id_case()) {
         this.id_implements(var1);
         Long var7 = ((rYB)this.id_throws[id_native[361]]).r();
         this.id_implements[id_native[362]] = var7;
         return id_package[144];
      } else {
         return id_package[145];
      }
   }

   @Override
   public void id_private(rjU_2 var1) {
      this.id_new();
      double var2 = this.rx();
      double var4 = this.re();
      double var6 = this.BO();
      if (this.Py() && !this.Pm()) {
         rrLk_1 var8 = rrLk_1.id_break(this.m().id_byte);
         if (this == (cb_3)QY.id_instanceof().id_class[id_native[274]]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[275]]).id_finally().id_class(var8);
         }

         double var9 = var8.id_class();
         double var11 = var9 < id_break[92] ? id_break[93] : id_break[94];
         if (var9 <= id_break[95]
            || (Boolean)this.id_private[id_native[276]]
            || !((rYB)this.id_throws[id_native[277]]).id_byte(new rfH_2(this.rx(), this.re() + id_break[96] - id_break[97], this.BO())).id_volatile().id_byte()
            )
          {
            rjU_2 var13 = this.rv();
            this.id_byte(var13.id_break(id_break[98], (var9 - var13.id_byte) * var11, id_break[99]));
         }
      }

      if (((rhx_3)this.id_implements[id_native[278]]).id_break && !this.Pm()) {
         double var21 = this.rv().id_byte;
         float var10 = (Float)this.id_private[id_native[279]];
         Float var18 = ((rhx_3)this.id_implements[id_native[280]]).id_class() * (float)(this.PF() ? id_class[25] : id_package[109]);
         this.id_private[id_native[281]] = var18;
         super.id_private(var1);
         rjU_2 var22 = this.rv();
         this.id_catch(var22.id_break, var21 * id_break[100], var22.id_protected);
         Float var19 = var10;
         this.id_private[id_native[282]] = var19;
         Float var20 = id_final[108];
         this.id_throws[id_native[283]] = var20;
         this.id_break(id_class[26], id_package[110]);
      } else {
         super.id_private(var1);
      }

      this.id_continue(this.rx() - var2, this.re() - var4, this.BO() - var6);
   }

   private static void id_private() {
      id_break = new double[]{
         0.5,
         0.5,
         1.0,
         0.1F,
         -2.9999999E7,
         2.9999999E7,
         -2.9999999E7,
         2.9999999E7,
         10.0,
         10.0,
         10.0,
         10.0,
         -10.0,
         -10.0,
         -10.0,
         0.25,
         0.25,
         0.25,
         0.02,
         0.02,
         0.02,
         1.0,
         1.0,
         1.0,
         0.005999999865889549,
         1.0,
         0.0,
         1.0,
         1.0,
         0.5,
         1.0,
         0.1F,
         0.0,
         0.1,
         0.0,
         0.3F,
         0.2F,
         -0.35,
         0.0,
         0.0,
         0.05,
         -0.05,
         0.0,
         0.0,
         0.05,
         0.05,
         0.0,
         0.0,
         0.05,
         -0.05,
         0.0,
         0.0,
         0.05,
         0.05,
         0.0,
         0.0,
         0.05,
         -0.05,
         0.0,
         0.0,
         0.05,
         0.05,
         0.05,
         -0.05,
         0.0,
         0.0,
         0.05,
         0.05,
         0.0,
         0.0,
         0.1,
         0.6,
         1.0,
         0.6,
         1.0,
         0.6,
         1.0,
         0.25,
         1.0,
         9.0,
         0.5,
         0.5,
         0.1,
         0.0,
         0.1,
         0.2,
         0.5,
         0.0,
         0.0,
         0.5,
         0.1,
         0.5,
         -0.2,
         0.085,
         0.06,
         0.0,
         1.0,
         0.1,
         0.0,
         0.0,
         0.6,
         0.0,
         100.0,
         100.0,
         1.0,
         20.0,
         0.22,
         -1.0,
         1.0,
         0.2,
         -0.15,
         1.0,
         -0.2,
         0.07,
         0.0,
         0.0,
         -0.11,
         0.85,
         0.7F,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0,
         0.0
      };
   }

   private static void id_final() {
      id_native = new short[]{
         1,
         2,
         5,
         18,
         24,
         27,
         28,
         25,
         1,
         3,
         3,
         4,
         38,
         49,
         2,
         49,
         3,
         49,
         4,
         49,
         5,
         49,
         6,
         49,
         7,
         38,
         20,
         9,
         9,
         9,
         16,
         16,
         16,
         16,
         7,
         7,
         16,
         16,
         16,
         16,
         16,
         7,
         4,
         4,
         3,
         4,
         7,
         5,
         16,
         16,
         27,
         27,
         27,
         28,
         17,
         17,
         200,
         13,
         10,
         14,
         11,
         15,
         12,
         13,
         14,
         15,
         13,
         13,
         10,
         15,
         15,
         12,
         14,
         14,
         11,
         13,
         13,
         10,
         15,
         15,
         12,
         14,
         14,
         11,
         13,
         13,
         15,
         15,
         14,
         14,
         18,
         18,
         7,
         26,
         26,
         40,
         40,
         40,
         7,
         3,
         4,
         8,
         7,
         8,
         13,
         15,
         25,
         16,
         26,
         6,
         6,
         6,
         7,
         7,
         41,
         5,
         41,
         5,
         5,
         1,
         8,
         7,
         29,
         29,
         29,
         20,
         8,
         8,
         8,
         27,
         7,
         27,
         7,
         31,
         18,
         7,
         200,
         49,
         3,
         49,
         3,
         49,
         3,
         12,
         15,
         12,
         15,
         7,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         7,
         7,
         40,
         40,
         16,
         16,
         15,
         15,
         40,
         40,
         40,
         40,
         1,
         20,
         1,
         20,
         1,
         25,
         1,
         1,
         16,
         21,
         19,
         20,
         22,
         22,
         40,
         22,
         5,
         18,
         18,
         2,
         1,
         1,
         16,
         21,
         19,
         20,
         22,
         5,
         18,
         2,
         7,
         7,
         7,
         18,
         33,
         7,
         7,
         7,
         1,
         61,
         7,
         61,
         61,
         61,
         61,
         7,
         18,
         18,
         18,
         18,
         4,
         18,
         18,
         7,
         37,
         7,
         37,
         7,
         37,
         20,
         31,
         37,
         7,
         31,
         37,
         7,
         31,
         20,
         29,
         28,
         20,
         15,
         15,
         15,
         15,
         57,
         0,
         7,
         15,
         15,
         7,
         25,
         25,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         40,
         7,
         15,
         15,
         7,
         7,
         3,
         4,
         4,
         25,
         16,
         7,
         7,
         16,
         16,
         16,
         57,
         0,
         41,
         7,
         18,
         29,
         18,
         29,
         29,
         31,
         18,
         7,
         7,
         20,
         18,
         20,
         18,
         21,
         21,
         20,
         20,
         21,
         21,
         19,
         21,
         21,
         21,
         21,
         21,
         21,
         21,
         22,
         19,
         19,
         19,
         19,
         21,
         20,
         40,
         22,
         19,
         19,
         19,
         19,
         21,
         20,
         19,
         23,
         41,
         19,
         19,
         7,
         41,
         23,
         19,
         19,
         19,
         19,
         19,
         18,
         7,
         5,
         5,
         18,
         5,
         18,
         18,
         7,
         7,
         7,
         19,
         18,
         20,
         25,
         2,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         20,
         7,
         0,
         7,
         0,
         0,
         7,
         7,
         7,
         18,
         18,
         7,
         0,
         2,
         2,
         4,
         1,
         1,
         200,
         2,
         2,
         1,
         1,
         26,
         26,
         18,
         49,
         5,
         49,
         5,
         49,
         6,
         49,
         6,
         49,
         7,
         49,
         7,
         16,
         16,
         28,
         18,
         18,
         1,
         0,
         1,
         1,
         18,
         18,
         16,
         18,
         24,
         23,
         30,
         30,
         0,
         15,
         15,
         16,
         16,
         17,
         17,
         18,
         18,
         5,
         5,
         18,
         18,
         31,
         31,
         37,
         37,
         17,
         17,
         15,
         16,
         45,
         15,
         16,
         63,
         7,
         7,
         7,
         7,
         7,
         7
      };
   }

   public void id_synchronized(boolean var1) {
      this.id_new();
      Boolean var6 = var1;
      this.id_implements[id_native[382]] = var6;
   }

   @Override
   public abstract boolean id_native();

   public static String id_native(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 121, -75, 56, -64, -116, -12, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_strictfp() {
      this.id_new();
      rJT var5 = (rJT)this.id_implements[id_native[99]];
      this.id_implements[id_native[100]] = var5;
   }

   public rns_3 st() {
      return ((rYB)this.id_throws[id_native[369]]).id_package();
   }

   public void sz() {
      this.id_break(id_class[28], id_package[119]);
   }

   @Override
   public boolean sr() {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[219]]).id_break ? id_package[74] : id_package[75];
   }

   @Override
   public void A() {
      this.id_new();
      if (this.sT() && this.Pm()) {
         this.BH();
         this.id_volatile(id_package[29]);
      } else {
         double var1 = this.rx();
         double var3 = this.re();
         double var5 = this.BO();
         super.A();
         Float var11 = (Float)this.id_implements[id_native[101]];
         this.id_implements[id_native[102]] = var11;
         Float var12 = id_final[4];
         this.id_implements[id_native[103]] = var12;
         this.id_super(this.rx() - var1, this.re() - var3, this.BO() - var5);
      }
   }

   public int sn() {
      this.id_new();
      if ((Integer)this.id_implements[id_native[328]] >= id_class[36]) {
         return id_class[37] + ((Integer)this.id_implements[id_native[329]] - id_class[38]) * id_class[39];
      } else {
         return this.id_implements[id_native[330]] >= id_class[40]
            ? id_class[41] + ((Integer)this.id_implements[id_native[331]] - id_class[42]) * id_class[43]
            : id_class[44] + (Integer)this.id_implements[id_native[332]] * id_class[45];
      }
   }

   @Override
   public void Q() {
      super.Q();
      this.Sg();
      Float var5 = (Float)this.id_throws[id_native[105]];
      this.id_private[id_native[106]] = var5;
      Float var6 = (Float)this.id_throws[id_native[107]];
      this.id_private[id_native[108]] = var6;
   }

   @Override
   public float rq() {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[399]]).id_break && !this.Sy() ? super.rq() : id_final[149];
   }

   public rpD_2 sq() {
      return new rpD_2();
   }

   @Override
   public boolean SG() {
      return id_package[135];
   }

   @Override
   public boolean rJ() {
      return id_package[136];
   }

   @Override
   public boolean Py() {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[367]]).id_break && !this.id_native() && super.Py() ? id_package[147] : id_package[148];
   }

   @Override
   public double Pv() {
      return id_break[37];
   }

   @Override
   public int rj() {
      return id_class[4];
   }

   @Override
   public int rV() {
      return id_class[5];
   }

   @Override
   public int rR() {
      this.id_new();
      return ((rhx_3)this.id_implements[id_native[91]]).id_class ? id_package[25] : id_class[3];
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.PLAYERS;
   }

   @Override
   public Iterable<rdn_3> PV() {
      this.id_new();
      return ((rhz_3)this.id_implements[id_native[357]]).id_break;
   }

   @Override
   public boolean PK() {
      this.id_new();
      return ((rhx_3)this.id_implements[id_native[345]]).id_break || this.id_throws[id_native[346]] && this.Pw() ? id_package[138] : id_package[137];
   }

   @Override
   public ImmutableList<iM_2> BV() {
      return ImmutableList.of(iM_2.STANDING, iM_2.CROUCHING, iM_2.SWIMMING);
   }

   @Override
   public boolean BK() {
      return !super.BK() && !this.Sc() ? id_package[73] : id_package[72];
   }

   @Override
   public rqA_2 BB() {
      return rqn_3.hI;
   }

   @Override
   public rqA_2 BJ() {
      return rqn_3.ht;
   }

   @Override
   public boolean Be() {
      this.id_new();
      return !((rhx_3)this.id_implements[id_native[214]]).id_break && super.Be() ? id_package[69] : id_package[70];
   }

   @Override
   public rqA_2 Bt() {
      return rqn_3.hC;
   }

   @Override
   public void Bc() {
      this.id_class(iM_2.STANDING);
      super.Bc();
      this.id_public(this.SK());
      Integer var5 = Integer.valueOf(id_package[30]);
      this.id_private[id_native[104]] = var5;
   }

   @Override
   public rqA_2 Bv() {
      return rqn_3.hw;
   }

   @Override
   public float sB() {
      return (float)this.id_class(iQ_2.id_protected);
   }

   public rcd_3 sJ() {
      return ((rmE_2)this.id_throws[id_native[392]]).id_class((rut_3<rcd_3>)id_protected[id_native[393]]);
   }

   public static iz_3 sy() {
      return iB_2.SD().id_class(iQ_2.id_case, id_break[2]).id_class(iQ_2.id_protected, id_break[3]).id_class(iQ_2.id_private).id_class(iQ_2.id_extends);
   }

   public boolean sN() {
      return this.h();
   }

   public boolean sL() {
      return this.id_return();
   }

   public int sH() {
      this.id_new();
      return (Integer)this.id_implements[id_native[305]];
   }

   public boolean sT() {
      return this.h();
   }

   public void sI() {
      this.id_new();
      if ((Long)this.id_implements[id_native[363]] + id_extends[0] < ((rYB)this.id_throws[id_native[364]]).r()) {
         this.id_finally(this.sQ());
         this.id_catch(new rcd_3());
         this.id_finally(this.sJ());
         this.id_implements(new rcd_3());
      }
   }

   @Override
   public void Sx() {
      this.id_new();
      super.Sx();
      if (!((rYB)this.id_throws[id_native[147]]).B().id_break(rRu_1.id_byte)) {
         this.sf();
         ((rhz_3)this.id_implements[id_native[148]]).id_private();
      }
   }

   public boolean sV() {
      return this.sL() && this.sX().id_break().id_byte(this.sX()) == rkc_3.EAT ? id_package[178] : id_package[179];
   }

   @Override
   public rpZ_2 Su() {
      return ((rmE_2)this.id_throws[id_native[384]]).<Byte>id_class((rut_3<Byte>)id_protected[id_native[385]]) == 0 ? rpZ_2.LEFT : rpZ_2.RIGHT;
   }

   public int su() {
      this.id_new();
      return (Integer)this.id_implements[id_native[273]];
   }

   public boolean sW() {
      this.id_new();
      return (Boolean)this.id_implements[id_native[381]];
   }

   @Override
   public float Sd() {
      return this.BQ().<Float>id_class((rut_3<Float>)id_protected[id_native[372]]);
   }

   @Override
   public void SQ() {
      this.id_class(id_package[100], id_package[101]);
   }

   public rcd_3 sQ() {
      return ((rmE_2)this.id_throws[id_native[388]]).id_class((rut_3<rcd_3>)id_protected[id_native[389]]);
   }

   public boolean sZ() {
      return this.sL() && this.sX().id_break().id_byte(this.sX()) == rkc_3.DRINK ? id_package[180] : id_package[181];
   }

   public boolean sF() {
      return this.sL() && this.sX().id_break().id_byte(this.sX()) == rkc_3.SPEAR ? id_package[176] : id_package[177];
   }

   public boolean sA() {
      return this.Ss() > id_final[141] && this.Ss() < this.SK() ? id_package[130] : id_package[131];
   }

   public boolean sC() {
      return !this.rT() && !this.id_break(rLD.id_goto) ? id_package[117] : id_package[118];
   }

   public void sg() {
      Integer var5 = Integer.valueOf(id_package[164]);
      this.id_private[id_native[397]] = var5;
   }

   public boolean sD() {
      this.id_new();
      return ((rhx_3)this.id_implements[id_native[339]]).id_throws;
   }

   public boolean sR() {
      return this.sL() && this.sX().id_break().id_byte(this.sX()) == rkc_3.BOW ? id_package[172] : id_package[173];
   }

   public float sY() {
      return (float)this.id_class(iQ_2.id_extends);
   }

   public rpD_2 sK() {
      this.id_new();
      return (rpD_2)this.id_implements[id_native[398]];
   }

   public boolean sU() {
      this.id_new();
      return ((rhx_3)this.id_implements[id_native[400]]).id_protected && this.id_synchronized() >= id_class[56] ? id_package[165] : id_package[166];
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return (ap_3)((Map)id_protected[id_native[401]]).getOrDefault(var1, (ap_3)id_protected[id_native[402]]);
   }

   @Override
   public rgP_2 L_() {
      return this.id_class(rnB_2.id_class(this.BG(), this.g(), rnO_2.values()));
   }

   @Override
   public void m_() {
      super.m_();
      ((rmE_2)this.id_throws[id_native[13]]).id_class((rut_3<Float>)id_protected[id_native[14]], id_final[3]);
      ((rmE_2)this.id_throws[id_native[15]]).id_class((rut_3<Integer>)id_protected[id_native[16]], Integer.valueOf(id_package[10]));
      ((rmE_2)this.id_throws[id_native[17]]).id_class((rut_3<Byte>)id_protected[id_native[18]], Byte.valueOf(id_package[11]));
      ((rmE_2)this.id_throws[id_native[19]]).id_class((rut_3<Byte>)id_protected[id_native[20]], Byte.valueOf(id_package[12]));
      ((rmE_2)this.id_throws[id_native[21]]).id_class((rut_3<rcd_3>)id_protected[id_native[22]], new rcd_3());
      ((rmE_2)this.id_throws[id_native[23]]).id_class((rut_3<rcd_3>)id_protected[id_native[24]], new rcd_3());
   }

   public void t_() {
      this.id_new();
      if (this.id_protected(iM_2.SWIMMING)) {
         iM_2 var1;
         if (this.Sy()) {
            var1 = iM_2.FALL_FLYING;
         } else if (this.Sc()) {
            var1 = iM_2.SLEEPING;
         } else if (this.Py()) {
            var1 = iM_2.SWIMMING;
         } else if (this.Sz()) {
            var1 = iM_2.SPIN_ATTACK;
         } else if (this.h() && !((rhx_3)this.id_implements[id_native[90]]).id_break) {
            var1 = iM_2.CROUCHING;
         } else {
            var1 = iM_2.STANDING;
         }

         iM_2 var2;
         if (this.id_native() || this.Pm() || this.id_protected(var1)) {
            var2 = var1;
         } else if (this.id_protected(iM_2.CROUCHING)) {
            var2 = iM_2.CROUCHING;
         } else {
            var2 = iM_2.SWIMMING;
         }

         this.id_class(var2);
      }
   }
}
