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
   public static Object[] protected_;
   private static byte[] class_;
   private static double[] break_;
   private static String[] finally_;
   private static long[] extends_;
   private static short[] native_;
   public Object[] implements_;
   private static int[] volatile_;
   private static float[] final_;
   private static boolean[] package_;

   @Override
   public boolean char_() {
      return false;
   }

   private void char_(an_3 var1) {
      var1.c_(this);
   }

   public int byte_(Collection<rkw_3<?>> var1) {
      return 0;
   }

   public boolean byte_(xc_3 var1) {
      this.new_();
      return this.class_(var1, ((rhz_3)this.implements_[1]).byte_());
   }

   public float byte_(boolean var1) {
      return (float)(1.0 / this.class_(iQ_2.private_) * 20.0);
   }

   public void byte_() {
      this.new_();
      Double var13 = (Double)this.implements_[13];
      this.implements_[10] = var13;
      Double var14 = (Double)this.implements_[14];
      this.implements_[11] = var14;
      Double var15 = (Double)this.implements_[15];
      this.implements_[12] = var15;
      double var1 = this.rx() - (Double)this.implements_[13];
      double var3 = this.re() - (Double)this.implements_[14];
      double var5 = this.BO() - (Double)this.implements_[15];
      double var7 = 10.0;
      if (var1 > 10.0) {
         Double var16 = this.rx();
         this.implements_[13] = var16;
         Double var17 = (Double)this.implements_[13];
         this.implements_[10] = var17;
      }

      if (var5 > 10.0) {
         Double var18 = this.BO();
         this.implements_[15] = var18;
         Double var19 = (Double)this.implements_[15];
         this.implements_[12] = var19;
      }

      if (var3 > 10.0) {
         Double var20 = this.re();
         this.implements_[14] = var20;
         Double var21 = (Double)this.implements_[14];
         this.implements_[11] = var21;
      }

      if (var1 < -10.0) {
         Double var22 = this.rx();
         this.implements_[13] = var22;
         Double var23 = (Double)this.implements_[13];
         this.implements_[10] = var23;
      }

      if (var5 < -10.0) {
         Double var24 = this.BO();
         this.implements_[15] = var24;
         Double var25 = (Double)this.implements_[15];
         this.implements_[12] = var25;
      }

      if (var3 < -10.0) {
         Double var26 = this.re();
         this.implements_[14] = var26;
         Double var27 = (Double)this.implements_[14];
         this.implements_[11] = var27;
      }

      Double var28 = (Double)this.implements_[13] + var1 * 0.25;
      this.implements_[13] = var28;
      Double var29 = (Double)this.implements_[15] + var5 * 0.25;
      this.implements_[15] = var29;
      Double var30 = (Double)this.implements_[14] + var3 * 0.25;
      this.implements_[14] = var30;
   }

   @Override
   public rqA_2 byte_(rye_3 var1) {
      if (var1 == rye_3.byte_) {
         return rqn_3.hy;
      } else if (var1 == rye_3.private_) {
         return rqn_3.hH;
      } else {
         return var1 == rye_3.else_ ? rqn_3.hp : rqn_3.hl;
      }
   }

   @Override
   public rqA_2 byte_(int var1) {
      return var1 > 4 ? rqn_3.hL : rqn_3.hT;
   }

   @Override
   public int byte_(rhd_3 var1) {
      this.new_();
      if (!((rYB)this.throws_[7]).B().break_(rRu_1.byte_) && !this.native_()) {
         int var2 = (Integer)this.implements_[19] * 7;
         return var2 > 100 ? 100 : var2;
      } else {
         return package_[134];
      }
   }

   @Override
   public void byte_(rye_3 var1, float var2) {
      this.new_();
      ((rhz_3)this.implements_[1]).class_(var1, var2);
   }

   private static void int_() {
      finally_ = new String[]{
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

   private static void long_() {
      extends_ = new long[]{20L, 0L};
   }

   public rhd_3(rYB var1, rfH_2 var2, float var3, GameProfile var4) {
      super(aI_2.rM, var1);
      this.new_();
      rhz_3 var9 = new rhz_3(this);
      this.implements_[1] = var9;
      rXz_1 var10 = new rXz_1();
      this.implements_[2] = var10;
      rpQ_2 var11 = new rpQ_2();
      this.implements_[5] = var11;
      rhx_3 var12 = new rhx_3();
      this.implements_[18] = var12;
      Float var13 = -1.0F;
      this.implements_[24] = var13;
      rdn_3 var14 = rdn_3.break_;
      this.implements_[27] = var14;
      rpD_2 var15 = this.sq();
      this.implements_[28] = var15;
      this.a_(class_(var4));
      this.implements_[25] = var4;
      rJT var17 = new rJT((rhz_3)this.implements_[1], !var1.continue_ ? true : package_[1], this);
      this.implements_[3] = var17;
      rJT var18 = (rJT)this.implements_[3];
      this.implements_[4] = var18;
      this.class_((double)var2.b_() + 0.5, (double)(var2.c_() + 1), (double)var2.d_() + 0.5, var3, 0.0F);
      Float var19 = 180.0F;
      this.private_[38] = var19;
      this.private_(1);
   }

   static {
      ntfClinit();
   }

   public int sp() {
      return ((rmE_2)this.throws_[49]).<Integer>class_((rut_3<Integer>)protected_[3]);
   }

   public void J() {
   }

   public void this_(boolean var1) {
      float var2 = 0.25F + (float)eA_2.case_(this) * 0.05F;
      if (var1) {
         var2 += 0.75F;
      }

      if (((Random)this.throws_[40]).nextFloat() < var2) {
         this.sK().class_(rdy_3.kN, 100);
         this.throw_();
         ((rYB)this.throws_[7]).class_(this, (byte)30);
      }
   }

   public void this_(int var1) {
      this.new_();
      this.continue_(var1);
      Float var7 = (Float)this.implements_[21] + (float)var1 / (float)this.sn();
      this.implements_[21] = var7;
      Integer var8 = rfU_2.class_((Integer)this.implements_[20] + var1, 0, Integer.MAX_VALUE);
      this.implements_[20] = var8;

      while (this.implements_[21] < 0.0F) {
         float var2 = (Float)this.implements_[21] * (float)this.sn();
         if ((Integer)this.implements_[19] > 0) {
            this.super_(-1);
            Float var9 = 1.0F + var2 / (float)this.sn();
            this.implements_[21] = var9;
         } else {
            this.super_(-1);
            Float var10 = 0.0F;
            this.implements_[21] = var10;
         }
      }

      while (this.implements_[21] >= 1.0F) {
         Float var11 = ((Float)this.implements_[21] - 1.0F) * (float)this.sn();
         this.implements_[21] = var11;
         this.super_(1);
         Float var12 = (Float)this.implements_[21] / (float)this.sn();
         this.implements_[21] = var12;
      }
   }

   @Override
   public void this_() {
      this.new_();
      Boolean var10 = this.native_();
      this.throws_[38] = var10;
      if (this.native_()) {
         Boolean var11 = false;
         this.throws_[20] = var11;
      }

      if ((Integer)this.implements_[9] > 0) {
         Integer var12 = (Integer)this.implements_[9] - 1;
         this.implements_[9] = var12;
      }

      if (this.Sc()) {
         Integer var13 = (Integer)this.implements_[16] + 1;
         this.implements_[16] = var13;
         if ((Integer)this.implements_[16] > 100) {
            Integer var14 = 100;
            this.implements_[16] = var14;
         }

         if (!((rYB)this.throws_[7]).continue_ && ((rYB)this.throws_[7]).strictfp_()) {
            this.class_(false, true);
         }
      } else if ((Integer)this.implements_[16] > 0) {
         Integer var15 = (Integer)this.implements_[16] + 1;
         this.implements_[16] = var15;
         if ((Integer)this.implements_[16] >= 110) {
            Integer var16 = 0;
            this.implements_[16] = var16;
         }
      }

      this.void_();
      super.this_();
      if (!((rYB)this.throws_[7]).continue_ && (rJr_1)this.implements_[4] != null && !((rJr_1)this.implements_[4]).class_(this)) {
         this.strictfp_();
         rJT var17 = (rJT)this.implements_[3];
         this.implements_[4] = var17;
      }

      this.byte_();
      if (!((rYB)this.throws_[7]).continue_) {
         ((rpQ_2)this.implements_[5]).class_(this);
         this.break_(rlB_2.extends_);
         if (this.BM()) {
            this.break_(rlB_2.native_);
         }

         if (this.Pw()) {
            this.break_(rlB_2.final_);
         }

         if (!this.Sc()) {
            this.break_(rlB_2.volatile_);
         }
      }

      double var1 = rfU_2.class_(this.rx(), -2.9999999E7, 2.9999999E7);
      double var3 = rfU_2.class_(this.BO(), -2.9999999E7, 2.9999999E7);
      if (var1 != this.rx() || var3 != this.BO()) {
         this.new_(var1, this.re(), var3);
      }

      Integer var18 = (Integer)this.private_[16] + 1;
      this.private_[16] = var18;
      rdn_3 var5 = this.ss();
      if (!rdn_3.break_((rdn_3)this.implements_[27], var5)) {
         if (!rdn_3.protected_((rdn_3)this.implements_[27], var5)) {
            this.sg();
         }

         rdn_3 var19 = var5.implements_();
         this.implements_[27] = var19;
      }

      this.public_();
      ((rpD_2)this.implements_[28]).class_();
      this.t_();
   }

   @Override
   public String i() {
      return this.sv().getName();
   }

   public void sl() {
      this.continue_(true);
   }

   public void sa() {
      double var1 = (double)(-rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)));
      double var3 = (double)rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.throws_[7])).class_(rLQ.B, this.rx() + var1, this.byte_(0.5), this.BO() + var3, 0, var1, 0.0, var3, 0.0);
      }
   }

   @Override
   public rjU_2 class_(rjU_2 var1, iG_2 var2) {
      this.new_();
      if (!((rhx_3)this.implements_[18]).break_ && (var2 == iG_2.SELF || var2 == iG_2.PLAYER) && this.instanceof_() && this.so()) {
         double var3 = var1.break_;
         double var5 = var1.protected_;

         while (var3 != 0.0 && ((rYB)this.throws_[7]).a_(this, this.rN().protected_(var3, (double)(-(Float)this.throws_[37]), 0.0))) {
            if (var3 < 0.05 && var3 >= -0.05) {
               var3 = 0.0;
            } else if (var3 > 0.0) {
               var3 -= 0.05;
            } else {
               var3 += 0.05;
            }
         }

         while (var5 != 0.0 && ((rYB)this.throws_[7]).a_(this, this.rN().protected_(0.0, (double)(-(Float)this.throws_[37]), var5))) {
            if (var5 < 0.05 && var5 >= -0.05) {
               var5 = 0.0;
            } else if (var5 > 0.0) {
               var5 -= 0.05;
            } else {
               var5 += 0.05;
            }
         }

         while (var3 != 0.0 && var5 != 0.0 && ((rYB)this.throws_[7]).a_(this, this.rN().protected_(var3, (double)(-(Float)this.throws_[37]), var5))) {
            if (var3 < 0.05 && var3 >= -0.05) {
               var3 = 0.0;
            } else if (var3 > 0.0) {
               var3 -= 0.05;
            } else {
               var3 += 0.05;
            }

            if (var5 < 0.05 && var5 >= -0.05) {
               var5 = 0.0;
            } else if (var5 > 0.0) {
               var5 -= 0.05;
            } else {
               var5 += 0.05;
            }
         }

         var1 = new rjU_2(var3, var1.byte_, var5);
      }

      return var1;
   }

   public rsE_2 class_(rdn_3 var1, boolean var2, boolean var3) {
      if (var1.class_()) {
         return null;
      } else {
         if (((rYB)this.throws_[7]).continue_) {
            this.class_(rpm_3.MAIN_HAND, false);
         }

         double var4 = this.rH() - 0.3F;
         rsE_2 var6 = new rsE_2((rYB)this.throws_[7], this.rx(), var4, this.BO(), var1);
         var6.class_(40);
         if (var3) {
            var6.byte_(this.ro());
         }

         if (var2) {
            float var7 = ((Random)this.throws_[40]).nextFloat() * 0.5F;
            float var8 = ((Random)this.throws_[40]).nextFloat() * (float) (Math.PI * 2);
            var6.catch_((double)(-rfU_2.class_(var8) * var7), 0.2F, (double)(rfU_2.break_(var8) * var7));
         } else {
            float var14 = final_[18];
            float var15 = rfU_2.class_((Float)this.throws_[16] * (float) (Math.PI / 180.0));
            float var9 = rfU_2.break_((Float)this.throws_[16] * (float) (Math.PI / 180.0));
            float var10 = rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
            float var11 = rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0));
            float var12 = ((Random)this.throws_[40]).nextFloat() * (float) (Math.PI * 2);
            float var13 = 0.02F * ((Random)this.throws_[40]).nextFloat();
            var6.catch_(
               (double)(-var10 * var9 * 0.3F) + Math.cos((double)var12) * (double)var13,
               (double)(-var15 * 0.3F + 0.1F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.1F),
               (double)(var11 * var9 * 0.3F) + Math.sin((double)var12) * (double)var13
            );
         }

         return var6;
      }
   }

   public ryZ_2 class_(an_3 var1, rpm_3 var2) {
      this.new_();
      if (this.native_()) {
         if (var1 instanceof rJZ) {
            this.class_((rJZ)var1);
         }

         return ryZ_2.PASS;
      } else {
         rdn_3 var3 = this.protected_(var2);
         rdn_3 var4 = var3.implements_();
         ryZ_2 var5 = var1.class_(this, var2);
         if (var5.class_()) {
            if (((rhx_3)this.implements_[18]).protected_ && var3 == this.protected_(var2) && var3.char_() < var4.char_()) {
               var3.throws_(var4.char_());
            }

            return var5;
         } else {
            if (!var3.class_() && var1 instanceof iB_2) {
               if (((rhx_3)this.implements_[18]).protected_) {
                  var3 = var4;
               }

               ryZ_2 var6 = var3.class_(this, (iB_2)var1, var2);
               if (var6.class_()) {
                  if (var3.class_() && !((rhx_3)this.implements_[18]).protected_) {
                     this.class_(var2, rdn_3.break_);
                  }

                  return var6;
               }
            }

            return ryZ_2.PASS;
         }
      }
   }

   public void class_(int var1, rdf_3 var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void class_(rdn_3 var1, rpm_3 var2) {
   }

   public float class_(float var1, boolean var2) {
      return rfU_2.class_(((float)((Integer)this.private_[16]).intValue() + var1) / this.byte_(var2), 0.0F, 1.0F);
   }

   @Override
   public boolean class_(float var1, float var2) {
      this.new_();
      if (((rhx_3)this.implements_[18]).byte_) {
         return false;
      } else {
         if (var1 >= 2.0F) {
            this.class_(rlB_2.super_, (int)Math.round((double)var1 * 100.0));
         }

         return super.class_(var1, var2);
      }
   }

   @Override
   public void class_(xc_3 var1, rjU_2 var2) {
      this.new_();
      if (!((rhx_3)this.implements_[18]).break_) {
         super.class_(var1, var2);
      }
   }

   public OptionalInt class_(rJZ var1) {
      return OptionalInt.empty();
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      this.new_();
      if (var1 >= 0 && var1 < ((rhz_3)this.implements_[1]).class_.size()) {
         ((rhz_3)this.implements_[1]).break_(var1, var2);
         return true;
      } else {
         rXQ var3;
         if (var1 == 100 + rXQ.HEAD.break_()) {
            var3 = rXQ.HEAD;
         } else if (var1 == 100 + rXQ.CHEST.break_()) {
            var3 = rXQ.CHEST;
         } else if (var1 == 100 + rXQ.LEGS.break_()) {
            var3 = rXQ.LEGS;
         } else if (var1 == 100 + rXQ.FEET.break_()) {
            var3 = rXQ.FEET;
         } else {
            var3 = null;
         }

         if (var1 == 98) {
            this.class_(rXQ.MAINHAND, var2);
            return true;
         } else if (var1 == 99) {
            this.class_(rXQ.OFFHAND, var2);
            return true;
         } else if (var3 == null) {
            int var4 = var1 - 200;
            if (var4 >= 0 && var4 < ((rXz_1)this.implements_[2]).else_()) {
               ((rXz_1)this.implements_[2]).break_(var4, var2);
               return true;
            } else {
               return package_[157];
            }
         } else {
            if (!var2.class_()) {
               if (!(var2.break_() instanceof rxS_2) && !(var2.break_() instanceof rxH_2)) {
                  if (var3 != rXQ.HEAD) {
                     return false;
                  }
               } else if (is_3.finally_(var2) != var3) {
                  return false;
               }
            }

            ((rhz_3)this.implements_[1]).break_(var3.break_() + ((rhz_3)this.implements_[1]).class_.size(), var2);
            return true;
         }
      }
   }

   public void class_(rCi_1<?> var1) {
      this.class_(var1, 1);
   }

   @Override
   public boolean class_(rye_3 var1) {
      if (super.class_(var1)) {
         return true;
      } else if (var1 == rye_3.private_) {
         return !((rYB)this.throws_[7]).B().break_(rRu_1.try_) ? true : package_[52];
      } else if (var1 == rye_3.extends_) {
         return !((rYB)this.throws_[7]).B().break_(rRu_1.instanceof_) ? true : package_[54];
      } else if (var1.int_()) {
         return !((rYB)this.throws_[7]).B().break_(rRu_1.throw_) ? true : package_[56];
      } else {
         return package_[57];
      }
   }

   public void class_(rqO_2[] var1) {
   }

   @Override
   public void class_(rcd_3 var1) {
      this.new_();
      super.class_(var1);
      var1.break_("DataVersion", rqu_3.class_().getWorldVersion());
      var1.class_("Inventory", ((rhz_3)this.implements_[1]).class_(new rcy_3()));
      var1.break_("SelectedItemSlot", ((rhz_3)this.implements_[1]).protected_);
      var1.class_("SleepTimer", (short)((Integer)this.implements_[16]).intValue());
      var1.class_("XpP", (Float)this.implements_[21]);
      var1.break_("XpLevel", (Integer)this.implements_[19]);
      var1.break_("XpTotal", (Integer)this.implements_[20]);
      var1.break_("XpSeed", (Integer)this.implements_[22]);
      var1.break_("Score", this.sp());
      ((rpQ_2)this.implements_[5]).break_(var1);
      ((rhx_3)this.implements_[18]).class_(var1);
      var1.class_("EnderItems", ((rXz_1)this.implements_[2]).byte_());
      if (!this.sQ().case_()) {
         var1.class_("ShoulderEntityLeft", this.sQ());
      }

      if (!this.sJ().case_()) {
         var1.class_("ShoulderEntityRight", this.sJ());
      }
   }

   public void class_(rqO_2 var1, int var2) {
      this.class_(rlB_2.implements_.break_(var1), var2);
   }

   private rVi_1 class_(rVi_1 var1) {
      String var2 = this.sv().getName();
      return var1.class_(var2x -> var2x.class_(new rgl_3(rgH_2.SUGGEST_COMMAND, "/tell " + var2 + " ")).class_(this.rM()).class_(var2));
   }

   public void class_(rHj_1 var1) {
   }

   @Override
   public rdn_3 class_(rYB var1, rdn_3 var2) {
      this.sk().class_(var2.break_(), var2);
      this.class_(rlB_2.byte_.break_(var2.break_()));
      var1.class_(null, this.rx(), this.re(), this.BO(), rqn_3.hn, rqL_2.PLAYERS, 0.5F, var1.int_.nextFloat() * 0.1F + 0.9F);
      if (this instanceof rhN_2) {
         Oo_1.while_.class_((rhN_2)this, var2);
      }

      return super.class_(var1, var2);
   }

   public Either<rhW_2, rqg_3> class_(rfH_2 var1) {
      this.new_();
      this.case_(var1);
      Integer var6 = 0;
      this.implements_[16] = var6;
      return Either.right(rqg_3.INSTANCE);
   }

   public void class_(rOD var1, rXu_1 var2) {
   }

   @Override
   public void class_(rqA_2 var1, float var2, float var3) {
      ((rYB)this.throws_[7]).class_(this, this.rx(), this.re(), this.BO(), var1, this.Pr(), var2, var3);
   }

   public void class_(rqA_2 var1, rqL_2 var2, float var3, float var4) {
   }

   @Override
   public void class_(an_3 var1) {
   }

   public void class_(ryS_2 var1) {
   }

   @Override
   public void class_(rye_3 var1, float var2) {
      if (!this.class_(var1)) {
         var2 = this.protected_(var1, var2);
         var2 = this.throws_(var1, var2);
         float var3 = Math.max(var2 - this.Sd(), 0.0F);
         this.return_(this.Sd() - (var2 - var3));
         float var4 = var2 - var3;
         if (var4 > 0.0F && var4 < 3.4028235E37F) {
            this.class_(rlB_2.import_, Math.round(var4 * 10.0F));
         }

         if (var3 != 0.0F) {
            this.while_(var1.catch_());
            float var5 = this.Ss();
            this.public_(this.Ss() - var3);
            this.SW().class_(var1, var5, var3);
            if (var3 < 3.4028235E37F) {
               this.class_(rlB_2.void_, Math.round(var3 * 10.0F));
            }
         }
      }
   }

   @Override
   public void class_(rrEm_1 var1, iB_2 var2) {
      this.class_(rlB_2.catch_.break_(var2.BC()));
   }

   public boolean class_(rhQ_2 var1) {
      return (this.BQ().<Byte>class_((rut_3<Byte>)protected_[4]) & var1.class_()) == var1.class_() ? true : package_[152];
   }

   public boolean class_(xc_3 var1, rdn_3 var2) {
      return var1.new_() && !var2.break_(var1) ? package_[49] : package_[48];
   }

   public void class_(rRl_1 var1) {
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1461789825;
   }

   public void class_(rHZ var1) {
   }

   public void class_(boolean var1, boolean var2) {
      this.new_();
      super.SQ();
      if ((rYB)this.throws_[7] instanceof rrEm_1 && var2) {
         ((rrEm_1)((rYB)this.throws_[7])).private_();
      }

      Integer var7 = Integer.valueOf(var1 ? 0 : class_[22]);
      this.implements_[16] = var7;
   }

   @Override
   public void class_(byte var1) {
      this.new_();
      if (var1 == 9) {
         this.sP();
      } else if (var1 == 23) {
         Boolean var6 = false;
         this.implements_[26] = var6;
      } else if (var1 == 22) {
         Boolean var7 = true;
         this.implements_[26] = var7;
      } else if (var1 == 43) {
         this.class_(rLQ.case_);
      } else {
         super.class_(var1);
      }
   }

   public static UUID class_(GameProfile var0) {
      UUID var1 = var0.getId();
      if (var1 == null) {
         var1 = extends_(var0.getName());
      }

      return var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3233494910581700795L;
   }

   public void class_(rgP_2 var1, boolean var2) {
   }

   public void class_(rCi_1<?> var1, int var2) {
   }

   public static Optional<rjU_2> class_(rrEm_1 var0, rfH_2 var1, float var2, boolean var3, boolean var4) {
      xc_3 var5 = var0.byte_(var1);
      xd_3 var6 = var5.break_();
      if (var6 instanceof Wv_1 && var5.byte_(Wv_1.volatile_) > 0 && Wv_1.class_(var0)) {
         Optional var9 = Wv_1.class_(aI_2.rM, var0, var1);
         if (!var4 && var9.isPresent()) {
            var0.class_(var1, var5.class_(Wv_1.volatile_, Integer.valueOf(var5.byte_(Wv_1.volatile_) - 1)), 3);
         }

         return var9;
      } else if (var6 instanceof xb_3 && xb_3.class_((rYB)var0)) {
         return xb_3.class_(aI_2.rM, var0, var1, var2);
      } else if (!var3) {
         return Optional.empty();
      } else {
         boolean var7 = var6.class_();
         boolean var8 = var0.byte_(var1.final_()).break_().class_();
         return var7 && var8 ? Optional.of(new rjU_2((double)var1.b_() + 0.5, (double)var1.c_() + 0.1, (double)var1.d_() + 0.5)) : Optional.empty();
      }
   }

   @Override
   public rdn_3 class_(rXQ var1) {
      this.new_();
      if (var1 == rXQ.MAINHAND) {
         return ((rhz_3)this.implements_[1]).byte_();
      } else if (var1 == rXQ.OFFHAND) {
         return ((rhz_3)this.implements_[1]).byte_.get(0);
      } else {
         return var1.class_() == rXN.ARMOR ? ((rhz_3)this.implements_[1]).break_.get(var1.break_()) : rdn_3.break_;
      }
   }

   public void class_(rpZ_2 var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Byte>)protected_[5], (byte)(var1 == rpZ_2.LEFT ? 0 : package_[163]));
   }

   private void class_(rLx_1 var1) {
      for (int var2 = 0; var2 < 5; var2++) {
         double var3 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var5 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var7 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         ((rYB)this.throws_[7]).class_(var1, this.break_(1.0), this.Ph() + 1.0, this.protected_(1.0), var3, var5, var7);
      }
   }

   @Override
   public rjU_2 class_(float var1) {
      double var2 = 0.22 * (this.Su() == rpZ_2.RIGHT ? -1.0 : break_[108]);
      float var4 = rfU_2.catch_(var1 * 0.5F, (Float)this.throws_[16], (Float)this.throws_[18]) * (float) (Math.PI / 180.0);
      float var5 = rfU_2.catch_(var1, (Float)this.private_[24], (Float)this.private_[23]) * (float) (Math.PI / 180.0);
      if (this.Sy() || this.Sz()) {
         rjU_2 var17 = this.break_(var1);
         rjU_2 var7 = this.rv();
         double var18 = an_3.case_(var7);
         double var10 = an_3.case_(var17);
         float var12;
         if (var18 > 0.0 && var10 > 0.0) {
            double var13 = (var7.break_ * var17.break_ + var7.protected_ * var17.protected_) / Math.sqrt(var18 * var10);
            double var15 = var7.break_ * var17.protected_ - var7.protected_ * var17.break_;
            var12 = (float)(Math.signum(var15) * Math.acos(var13));
         } else {
            var12 = final_[156];
         }

         return this.finally_(var1).throws_(new rjU_2(var2, -0.11, 0.85).byte_(-var12).class_(-var4).break_(-var5));
      } else if (this.rP()) {
         return this.finally_(var1).throws_(new rjU_2(var2, 0.2, -0.15).class_(-var4).break_(-var5));
      } else {
         double var6 = this.rN().byte_() - 1.0;
         double var8 = this.x() ? -0.2 : break_[113];
         return this.finally_(var1).throws_(new rjU_2(var2, var6, var8).break_(-var5));
      }
   }

   @Override
   public void class_(rXQ var1, rdn_3 var2) {
      this.new_();
      if (var1 == rXQ.MAINHAND) {
         this.break_(var2);
         ((rhz_3)this.implements_[1]).class_.set(((rhz_3)this.implements_[1]).protected_, var2);
      } else if (var1 == rXQ.OFFHAND) {
         this.break_(var2);
         ((rhz_3)this.implements_[1]).byte_.set(0, var2);
      } else if (var1.class_() == rXN.ARMOR) {
         this.break_(var2);
         ((rhz_3)this.implements_[1]).break_.set(var1.break_(), var2);
      }
   }

   public boolean class_(rYB var1, rfH_2 var2, rRl_1 var3) {
      if (!var3.protected_()) {
         return false;
      } else if (var3 == rRl_1.SPECTATOR) {
         return true;
      } else if (this.sD()) {
         return false;
      } else {
         rdn_3 var4 = this.ss();
         return !var4.class_() && var4.class_(var1.int_(), new ryw_3(var1, var2, false)) ? package_[9] : package_[8];
      }
   }

   public rsE_2 class_(rdn_3 var1, boolean var2) {
      return this.class_(var1, false, var2);
   }

   public void class_(ryG_2 var1) {
   }

   public boolean class_(rfH_2 var1, rpr_3 var2, rdn_3 var3) {
      this.new_();
      if (((rhx_3)this.implements_[18]).throws_) {
         return true;
      } else {
         rfH_2 var4 = var1.break_(var2.case_());
         ryw_3 var5 = new ryw_3((rYB)this.throws_[7], var4, false);
         return var3.break_(((rYB)this.throws_[7]).int_(), var5);
      }
   }

   public void class_(rHm_1 var1) {
   }

   public float class_(rdn_3 var1, xc_3 var2) {
      this.new_();
      float var3 = ((rhz_3)this.implements_[1]).class_(var1, var2);
      if (var3 > 1.0F) {
         int var4 = eA_2.class_(eY_2.this_, var1);
         if (var4 > 0 && var1 != null && !var1.class_()) {
            var3 += (float)(var4 * var4 + 1);
         }
      }

      if (rLK.class_(this)) {
         var3 *= 1.0F + (float)(rLK.break_(this) + 1) * 0.2F;
      }

      if (this.break_(rLD.protected_)) {
         float var5 = switch (this.byte_(rLD.protected_).byte_()) {
            case 0 -> final_[42];
            case 1 -> final_[43];
            case 2 -> final_[44];
            default -> final_[45];
         };
         var3 *= var5;
      }

      if (this.class_(rlG_2.break_) && !eA_2.private_(this)) {
         var3 /= 5.0F;
      }

      if (!(Boolean)this.throws_[20]) {
         var3 /= 5.0F;
      }

      return var3;
   }

   public boolean sm() {
      this.new_();
      return this.Sc() && this.implements_[16] >= 100 ? true : package_[104];
   }

   public boolean sc() {
      this.new_();
      return (Boolean)this.implements_[30];
   }

   @Override
   public void p() {
      this.new_();
      if (((rhx_3)this.implements_[18]).break_) {
         this.native_(false);
      } else {
         super.p();
      }
   }

   @Override
   public void default_() {
      this.new_();
      if ((Integer)this.implements_[6] > 0) {
         Integer var10 = (Integer)this.implements_[6] - 1;
         this.implements_[6] = var10;
      }

      if (((rYB)this.throws_[7]).abstract_() == rRO.PEACEFUL && ((rYB)this.throws_[7]).B().break_(rRu_1.implements_)) {
         if (this.Ss() < this.SK() && (Integer)this.throws_[41] % 20 == 0) {
            this.protected_(1.0F);
         }

         if (((rpQ_2)this.implements_[5]).break_() && (Integer)this.throws_[41] % 10 == 0) {
            ((rpQ_2)this.implements_[5]).class_(((rpQ_2)this.implements_[5]).class_() + 1);
         }
      }

      ((rhz_3)this.implements_[1]).catch_();
      Float var11 = (Float)this.implements_[8];
      this.implements_[7] = var11;
      super.default_();
      Float var12 = 0.02F;
      this.private_[29] = var12;
      if (this.PF()) {
         Float var13 = (float)((double)((Float)this.private_[29]).floatValue() + 0.005999999865889549);
         this.private_[29] = var13;
      }

      this.super_((float)this.class_(iQ_2.protected_));
      float var1;
      if ((Boolean)this.throws_[20] && !this.Sl() && !this.Py()) {
         var1 = Math.min(0.1F, rfU_2.class_(case_(this.rv())));
      } else {
         var1 = final_[8];
      }

      Float var14 = (Float)this.implements_[8] + (var1 - (Float)this.implements_[8]) * 0.4F;
      this.implements_[8] = var14;
      if (this.Ss() > 0.0F && !this.native_()) {
         rfl_3 var2;
         if (this.Pm() && !(Boolean)this.ra().throws_[27]) {
            var2 = this.rN().break_(this.ra().rN()).byte_(1.0, 0.0, 1.0);
         } else {
            var2 = this.rN().byte_(1.0, 0.5, 1.0);
         }

         List var3 = ((rYB)this.throws_[7]).class_(this, var2);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            an_3 var5 = (an_3)var3.get(var4);
            if (!(Boolean)var5.throws_[27]) {
               this.char_(var5);
            }
         }
      }

      this.extends_(this.sQ());
      this.extends_(this.sJ());
      if (!((rYB)this.throws_[7]).continue_ && ((Float)this.throws_[31] > 0.5F || this.rT()) || ((rhx_3)this.implements_[18]).break_ || this.Sc()) {
         this.sI();
      }
   }

   public rXz_1 se() {
      this.new_();
      return (rXz_1)this.implements_[2];
   }

   @Override
   public rgP_2 g() {
      this.new_();
      return new rgN_2(((GameProfile)this.implements_[25]).getName());
   }

   public boolean sd() {
      return this.sL() && this.sX().break_().byte_(this.sX()) == rkc_3.BLOCK ? true : package_[171];
   }

   @Override
   public void U() {
      if (!this.native_()) {
         super.U();
      }
   }

   public boolean sj() {
      return this.sL() && this.sX().break_().byte_(this.sX()) == rkc_3.CROSSBOW ? true : package_[175];
   }

   public boolean void_() {
      this.new_();
      Boolean var5 = this.class_(rlG_2.break_);
      this.implements_[17] = var5;
      return (Boolean)this.implements_[17];
   }

   public boolean sw() {
      if (!(Boolean)this.throws_[20] && !this.Sy() && !this.rT() && !this.break_(rLD.goto_)) {
         rdn_3 var1 = this.class_(rXQ.CHEST);
         if (var1.break_() == rdy_3.kc && rxH_2.protected_(var1)) {
            this.sz();
            return true;
         }
      }

      return package_[116];
   }

   @Override
   public boolean u() {
      this.new_();
      return !((rhx_3)this.implements_[18]).break_ ? true : package_[150];
   }

   public void sf() {
      this.new_();

      for (int var1 = 0; var1 < ((rhz_3)this.implements_[1]).else_(); var1++) {
         rdn_3 var2 = ((rhz_3)this.implements_[1]).extends_(var1);
         if (!var2.class_() && eA_2.throws_(var2)) {
            ((rhz_3)this.implements_[1]).native_(var1);
         }
      }
   }

   @Override
   public boolean break_(xc_3 var1) {
      this.new_();
      return !((rhx_3)this.implements_[18]).break_ && !super.break_(var1) ? package_[169] : package_[168];
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      this.new_();
      if (this.class_(var1)) {
         return false;
      } else if (((rhx_3)this.implements_[18]).class_ && !var1.private_()) {
         return false;
      } else {
         Integer var7 = 0;
         this.private_[33] = var7;
         if (this.Sl()) {
            return false;
         } else {
            this.sI();
            if (var1.super_()) {
               if (((rYB)this.throws_[7]).abstract_() == rRO.PEACEFUL) {
                  var2 = 0.0F;
               }

               if (((rYB)this.throws_[7]).abstract_() == rRO.EASY) {
                  var2 = Math.min(var2 / 2.0F + 1.0F, var2);
               }

               if (((rYB)this.throws_[7]).abstract_() == rRO.HARD) {
                  var2 = var2 * 3.0F / 2.0F;
               }
            }

            return var2 != 0.0F && super.break_(var1, var2) ? true : package_[63];
         }
      }
   }

   @Override
   public void break_(rdn_3 var1, int var2) {
      this.new_();
      Integer var7 = (Integer)this.implements_[19] - var2;
      this.implements_[19] = var7;
      if ((Integer)this.implements_[19] < 0) {
         Integer var8 = 0;
         this.implements_[19] = var8;
         Float var9 = 0.0F;
         this.implements_[21] = var9;
         Integer var10 = 0;
         this.implements_[20] = var10;
      }

      Integer var11 = ((Random)this.throws_[40]).nextInt();
      this.implements_[22] = var11;
   }

   public void break_(an_3 var1) {
   }

   @Override
   public void break_(rye_3 var1) {
      super.break_(var1);
      this.PX();
      if (!this.native_()) {
         this.protected_(var1);
      }

      if (var1 != null) {
         this.catch_(
            (double)(-rfU_2.break_(((Float)this.private_[12] + (Float)this.throws_[15]) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-rfU_2.class_(((Float)this.private_[12] + (Float)this.throws_[15]) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.catch_(0.0, 0.1, 0.0);
      }

      this.break_(rlB_2.default_);
      this.break_(rlB_2.implements_.break_(rlB_2.native_));
      this.break_(rlB_2.implements_.break_(rlB_2.volatile_));
      this.rE();
      this.break_(0, false);
   }

   @Override
   public void break_(rcd_3 var1) {
      this.new_();
      super.break_(var1);
      this.a_(class_((GameProfile)this.implements_[25]));
      rcy_3 var2 = var1.protected_("Inventory", 10);
      ((rhz_3)this.implements_[1]).break_(var2);
      ((rhz_3)this.implements_[1]).protected_ = var1.private_("SelectedItemSlot");
      Integer var7 = Integer.valueOf(var1.catch_("SleepTimer"));
      this.implements_[16] = var7;
      Float var8 = var1.finally_("XpP");
      this.implements_[21] = var8;
      Integer var9 = var1.private_("XpLevel");
      this.implements_[19] = var9;
      Integer var10 = var1.private_("XpTotal");
      this.implements_[20] = var10;
      Integer var11 = var1.private_("XpSeed");
      this.implements_[22] = var11;
      if ((Integer)this.implements_[22] == 0) {
         Integer var12 = ((Random)this.throws_[40]).nextInt();
         this.implements_[22] = var12;
      }

      this.break_(var1.private_("Score"));
      ((rpQ_2)this.implements_[5]).class_(var1);
      ((rhx_3)this.implements_[18]).break_(var1);
      this.byte_(iQ_2.protected_).class_((double)((rhx_3)this.implements_[18]).break_());
      if (var1.byte_("EnderItems", 9)) {
         ((rXz_1)this.implements_[2]).class_(var1.protected_("EnderItems", 10));
      }

      if (var1.byte_("ShoulderEntityLeft", 10)) {
         this.catch_(var1.int_("ShoulderEntityLeft"));
      }

      if (var1.byte_("ShoulderEntityRight", 10)) {
         this.implements_(var1.int_("ShoulderEntityRight"));
      }
   }

   public void break_(boolean var1, boolean var2) {
      this.new_();
      Boolean var7 = var1;
      this.implements_[30] = var7;
      if (var2 && var1) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnz_3.class_(this));
      }
   }

   public void break_(rCi_1<?> var1) {
   }

   @Override
   public float break_(iM_2 var1, ap_3 var2) {
      switch (((int[])rhk_3.class_[0])[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
            return final_[142];
         case 4:
            return final_[143];
         default:
            return final_[144];
      }
   }

   public int break_(Collection<rkw_3<?>> var1) {
      return 0;
   }

   public void break_(rqO_2 var1) {
      this.class_(rlB_2.implements_.break_(var1));
   }

   public void break_(int var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)protected_[3], var1);
   }

   public boolean throws_(rhd_3 var1) {
      rnM_2 var2 = this.BG();
      rnM_2 var3 = var1.BG();
      if (var2 == null) {
         return true;
      } else {
         return var2.class_(var3) && !var2.catch_() ? package_[67] : package_[66];
      }
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      rXQ var2 = is_3.finally_(var1);
      return this.class_(var2).class_();
   }

   public void sx() {
      this.break_(7, true);
      this.break_(7, false);
   }

   public boolean so() {
      return !this.throws_[20]
            && (
               !(this.throws_[31] < this.throws_[37])
                  || ((rYB)this.throws_[7]).a_(this, this.rN().protected_(0.0, (double)((Float)this.throws_[31] - (Float)this.throws_[37]), 0.0))
            )
         ? package_[77]
         : package_[76];
   }

   public rpQ_2 sk() {
      this.new_();
      return (rpQ_2)this.implements_[5];
   }

   public GameProfile sv() {
      this.new_();
      return (GameProfile)this.implements_[25];
   }

   @Override
   public void PD() {
      this.new_();
      super.PD();
      ((rJT)this.implements_[3]).break_(this);
      if ((rJr_1)this.implements_[4] != null) {
         ((rJr_1)this.implements_[4]).break_(this);
      }
   }

   private void finally_(rcd_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && !var1.case_()) {
         aI_2.class_(var1, (rYB)this.throws_[7]).ifPresent(var1x -> {
            if (var1x instanceof rOQ) {
               ((rOQ)var1x).break_((UUID)this.throws_[63]);
            }

            var1x.new_(this.rx(), this.re() + 0.7F, this.BO());
            ((rrEm_1)((rYB)this.throws_[7])).case_(var1x);
         });
      }
   }

   private static void catch_() {
      final_ = new float[]{
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

   public boolean catch_(rdn_3 var1) {
      this.new_();
      this.break_(var1);
      return ((rhz_3)this.implements_[1]).throws_(var1);
   }

   public void catch_(rcd_3 var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<rcd_3>)protected_[6], var1);
   }

   public void G() {
   }

   private void extends_(rcd_3 var1) {
      if (var1 != null && (!var1.throws_("Silent") || !var1.new_("Silent")) && ((rYB)this.throws_[7]).int_.nextInt(200) == 0) {
         String var2 = var1.native_("id");
         aI_2.class_(var2)
            .filter(var0 -> var0 == aI_2.X ? true : package_[184])
            .ifPresent(
               var1x -> {
                  if (!rMR.class_((rYB)this.throws_[7], this)) {
                     ((rYB)this.throws_[7])
                        .class_(
                           null,
                           this.rx(),
                           this.re(),
                           this.BO(),
                           rMR.class_((rYB)this.throws_[7], ((rYB)this.throws_[7]).int_),
                           this.Pr(),
                           1.0F,
                           rMR.class_(((rYB)this.throws_[7]).int_)
                        );
                  }
               }
            );
      }
   }

   public static UUID extends_(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public void case_(iB_2 var1) {
      this.throw_(var1);
   }

   @Override
   public rdn_3 case_(rdn_3 var1) {
      this.new_();
      if (!(var1.break_() instanceof rkB_2)) {
         return rdn_3.break_;
      } else {
         Predicate var2 = ((rkB_2)var1.break_()).private_();
         rdn_3 var3 = rkB_2.class_(this, var2);
         if (!var3.class_()) {
            return var3;
         } else {
            var2 = ((rkB_2)var1.break_()).byte_();

            for (int var4 = 0; var4 < ((rhz_3)this.implements_[1]).else_(); var4++) {
               rdn_3 var5 = ((rhz_3)this.implements_[1]).extends_(var4);
               if (var2.test(var5)) {
                  return var5;
               }
            }

            return ((rhx_3)this.implements_[18]).protected_ ? new rdn_3(rdy_3.OO) : rdn_3.break_;
         }
      }
   }

   @Override
   public void const_() {
      super.const_();
      Integer var5 = 0;
      this.throws_[4] = var5;
   }

   @Override
   public void continue_(boolean var1) {
      super.continue_(var1);
      this.break_(rlB_2.interface_);
      if (this.PF()) {
         this.while_(0.2F);
      } else {
         this.while_(0.05F);
      }
   }

   public void continue_(double var1, double var3, double var5) {
      if (!this.Pm()) {
         if (this.Py()) {
            int var7 = Math.round(rfU_2.class_(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var7 > 0) {
               this.class_(rlB_2.instanceof_, var7);
               this.while_(0.01F * (float)var7 * 0.01F);
            }
         } else if (this.class_(rlG_2.break_)) {
            int var8 = Math.round(rfU_2.class_(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var8 > 0) {
               this.class_(rlB_2.synchronized_, var8);
               this.while_(0.01F * (float)var8 * 0.01F);
            }
         } else if (this.rT()) {
            int var9 = Math.round(rfU_2.class_(var1 * var1 + var5 * var5) * 100.0F);
            if (var9 > 0) {
               this.class_(rlB_2.continue_, var9);
               this.while_(0.01F * (float)var9 * 0.01F);
            }
         } else if (this.o_()) {
            if (var3 > 0.0) {
               this.class_(rlB_2.this_, (int)Math.round(var3 * 100.0));
            }
         } else if ((Boolean)this.throws_[20]) {
            int var10 = Math.round(rfU_2.class_(var1 * var1 + var5 * var5) * 100.0F);
            if (var10 > 0) {
               if (this.PF()) {
                  this.class_(rlB_2.new_, var10);
                  this.while_(0.1F * (float)var10 * 0.01F);
               } else if (this.x()) {
                  this.class_(rlB_2.int_, var10);
                  this.while_(0.0F * (float)var10 * 0.01F);
               } else {
                  this.class_(rlB_2.package_, var10);
                  this.while_(0.0F * (float)var10 * 0.01F);
               }
            }
         } else if (this.Sy()) {
            int var11 = Math.round(rfU_2.class_(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            this.class_(rlB_2.try_, var11);
         } else {
            int var12 = Math.round(rfU_2.class_(var1 * var1 + var5 * var5) * 100.0F);
            if (var12 > 25) {
               this.class_(rlB_2.else_, var12);
            }
         }
      }
   }

   private static void continue_() {
      Object[] var0 = new Object[9];
      var0[0] = ap_3.break_(0.6F, 1.8F);
      var0[1] = ImmutableMap.builder()
         .put(iM_2.STANDING, var0[0])
         .put(iM_2.SLEEPING, new ap_3(0.2F, 0.2F, true))
         .put(iM_2.FALL_FLYING, ap_3.break_(0.6F, 0.6F))
         .put(iM_2.SWIMMING, ap_3.break_(0.6F, 0.6F))
         .put(iM_2.SPIN_ATTACK, ap_3.break_(0.6F, 0.6F))
         .put(iM_2.CROUCHING, ap_3.break_(0.6F, 1.5F))
         .put(iM_2.DYING, ap_3.byte_(0.2F, 0.2F))
         .build();
      var0[2] = rmE_2.class_(rhd_3.class, ruw_3.byte_);
      var0[3] = rmE_2.class_(rhd_3.class, ruw_3.break_);
      var0[4] = rmE_2.class_(rhd_3.class, ruw_3.class_);
      var0[5] = rmE_2.class_(rhd_3.class, ruw_3.class_);
      var0[6] = rmE_2.class_(rhd_3.class, ruw_3.int_);
      var0[7] = rmE_2.class_(rhd_3.class, ruw_3.int_);
      var0[8] = new rqO_2("celestial/cape.png");
      protected_ = var0;
   }

   public void continue_(int var1) {
      int var2 = this.sp();
      ((rmE_2)this.throws_[49]).break_((rut_3<Integer>)protected_[3], var2 + var1);
   }

   public boolean else_(boolean var1) {
      this.new_();
      return !((rhx_3)this.implements_[18]).class_ && !var1 && !((rpQ_2)this.implements_[5]).break_() ? package_[129] : package_[128];
   }

   @Override
   public void else_(float var1) {
      if (((rdn_3)this.private_[61]).break_() == rdy_3.kN) {
         if (!((rYB)this.throws_[7]).continue_) {
            this.class_(rlB_2.byte_.break_(((rdn_3)this.private_[61]).break_()));
         }

         if (var1 >= 3.0F) {
            int var2 = 1 + rfU_2.protected_(var1);
            rpm_3 var3 = this.P();
            ((rdn_3)this.private_[61]).class_(var2, this, var1x -> var1x.byte_(var3));
            if (((rdn_3)this.private_[61]).class_()) {
               if (var3 == rpm_3.MAIN_HAND) {
                  this.class_(rXQ.MAINHAND, rdn_3.break_);
               } else {
                  this.class_(rXQ.OFFHAND, rdn_3.break_);
               }

               rdn_3 var8 = rdn_3.break_;
               this.private_[61] = var8;
               this.class_(rqn_3.JP, 0.8F, 0.8F + ((rYB)this.throws_[7]).int_.nextFloat() * 0.4F);
            }
         }
      }
   }

   private static void else_() {
      package_ = new boolean[]{
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

   public void implements_(rcd_3 var1) {
      ((rmE_2)this.throws_[49]).break_((rut_3<rcd_3>)protected_[7], var1);
   }

   public abstract boolean implements_();

   public boolean instanceof_() {
      return this.h();
   }

   private void new_() {
      if (this.implements_ == null) {
         this.implements_ = new Object[31];
         Object[] var1 = this.implements_;
         var1[0] = 0L;
         var1[6] = 0;
         var1[7] = 0.0F;
         var1[8] = 0.0F;
         var1[9] = 0;
         var1[10] = 0.0;
         var1[11] = 0.0;
         var1[12] = 0.0;
         var1[13] = 0.0;
         var1[14] = 0.0;
         var1[15] = 0.0;
         var1[16] = 0;
         var1[17] = false;
         var1[19] = 0;
         var1[20] = 0;
         var1[21] = 0.0F;
         var1[22] = 0;
         var1[23] = 0;
         var1[24] = 0.0F;
         var1[26] = false;
         var1[30] = false;
      }
   }

   private static void package_() {
      volatile_ = new int[]{Integer.MAX_VALUE};
   }

   @Override
   public void return_(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.BQ().break_((rut_3<Float>)protected_[2], var1);
   }

   private void super_(double var1, double var3, double var5) {
      if (this.Pm()) {
         int var7 = Math.round(rfU_2.class_(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var7 > 0) {
            an_3 var8 = this.ra();
            if (var8 instanceof rsJ_2) {
               this.class_(rlB_2.return_, var7);
            } else if (var8 instanceof rSK) {
               this.class_(rlB_2.public_, var7);
            } else if (var8 instanceof rMo_1) {
               this.class_(rlB_2.goto_, var7);
            } else if (var8 instanceof rOD) {
               this.class_(rlB_2.while_, var7);
            } else if (var8 instanceof rOk_1) {
               this.class_(rlB_2.throw_, var7);
            }
         }
      }
   }

   public void super_(int var1) {
      this.new_();
      Integer var7 = (Integer)this.implements_[19] + var1;
      this.implements_[19] = var7;
      if ((Integer)this.implements_[19] < 0) {
         Integer var8 = 0;
         this.implements_[19] = var8;
         Float var9 = 0.0F;
         this.implements_[21] = var9;
         Integer var10 = 0;
         this.implements_[20] = var10;
      }

      if (var1 > 0
         && (Integer)this.implements_[19] % 5 == 0
         && (float)((Integer)this.implements_[23]).intValue() < (float)((Integer)this.throws_[41]).intValue() - 100.0F) {
         float var2 = this.implements_[19] > 30 ? 1.0F : (float)((Integer)this.implements_[19]).intValue() / 30.0F;
         ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hq, this.Pr(), var2 * 0.75F, 1.0F);
         Integer var11 = (Integer)this.throws_[41];
         this.implements_[23] = var11;
      }
   }

   private static void super_() {
      class_ = new byte[]{
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

   public void throw_(an_3 var1) {
      if (var1.rt() && !var1.finally_(this)) {
         float var2 = (float)this.class_(iQ_2.case_);
         float var3;
         if (var1 instanceof iB_2) {
            var3 = eA_2.class_(this.ss(), ((iB_2)var1).sG());
         } else {
            var3 = eA_2.class_(this.ss(), aL_2.class_);
         }

         float var4 = this.class_(0.5F, false);
         var2 *= 0.2F + var4 * var4 * 0.8F;
         var3 *= var4;
         this.sg();
         if (var2 > 0.0F || var3 > 0.0F) {
            boolean var5 = var4 > 0.9F ? true : package_[80];
            boolean var6 = false;
            int var7 = 0;
            var7 += eA_2.break_(this);
            if (this.PF() && var5) {
               ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hu, this.Pr(), 1.0F, 1.0F);
               var7++;
               var6 = true;
            }

            boolean var8 = var5
                  && this.throws_[31] > 0.0F
                  && !this.throws_[20]
                  && !this.o_()
                  && !this.rT()
                  && !this.break_(rLD.package_)
                  && !this.Pm()
                  && var1 instanceof iB_2
               ? true
               : package_[85];
            var8 = var8 && !this.PF() ? true : package_[87];
            if (var8) {
               var2 *= 1.5F;
            }

            var2 += var3;
            boolean var9 = false;
            double var10 = (double)((Float)this.throws_[29] - (Float)this.throws_[28]);
            if (var5 && !var8 && !var6 && (Boolean)this.throws_[20] && var10 < (double)this.sB()) {
               rdn_3 var12 = this.protected_(rpm_3.MAIN_HAND);
               if (var12.break_() instanceof rkx_3) {
                  var9 = true;
               }
            }

            float var31 = final_[75];
            boolean var13 = false;
            int var14 = eA_2.byte_(this);
            if (var1 instanceof iB_2) {
               var31 = ((iB_2)var1).Ss();
               if (var14 > 0 && !var1.Pz()) {
                  var13 = true;
                  var1.case_(1);
               }
            }

            rjU_2 var15 = var1.rv();
            boolean var16 = var1.break_(rye_3.class_(this), var2);
            if (var16) {
               if (var7 > 0) {
                  if (var1 instanceof iB_2) {
                     ((iB_2)var1)
                        .class_(
                           (float)var7 * 0.5F,
                           (double)rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)),
                           (double)(-rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)))
                        );
                  } else {
                     var1.implements_(
                        (double)(-rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * (float)var7 * 0.5F),
                        0.1,
                        (double)(rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * (float)var7 * 0.5F)
                     );
                  }

                  if (this == (cb_3)QY.instanceof_().class_[57]) {
                     rrFt_1 var17 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrFt_1.class_(0.6, false));
                     if (!var17.byte_()) {
                        double var18 = var17.class_();
                        this.byte_(this.rv().throws_(var18, 1.0, var18));
                        this.c_(var17.break_());
                     }
                  } else {
                     this.byte_(this.rv().throws_(0.6, 1.0, 0.6));
                     this.c_(false);
                  }
               }

               if (var9) {
                  float var32 = 1.0F + eA_2.class_(this) * var2;

                  for (iB_2 var19 : ((rYB)this.throws_[7]).class_(iB_2.class, var1.rN().byte_(1.0, 0.25, 1.0))) {
                     if (var19 != this
                        && var19 != var1
                        && !this.final_(var19)
                        && (!(var19 instanceof rSY) || !((rSY)var19).implements_())
                        && this.int_(var19) < 9.0) {
                        var19.class_(
                           0.4F,
                           (double)rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)),
                           (double)(-rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)))
                        );
                        var19.break_(rye_3.class_(this), var32);
                     }
                  }

                  ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hv, this.Pr(), 1.0F, 1.0F);
                  this.sa();
               }

               if (var1 instanceof rhN_2 && (Boolean)var1.throws_[25]) {
                  ((rhN_2)var1).class_.class_(new rvc_3(var1));
                  Boolean var25 = false;
                  var1.throws_[25] = var25;
                  var1.byte_(var15);
               }

               if (var8) {
                  ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hc, this.Pr(), 1.0F, 1.0F);
                  this.class_(var1);
               }

               if (!var8 && !var9) {
                  if (var5) {
                     ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hZ, this.Pr(), 1.0F, 1.0F);
                  } else {
                     ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hF, this.Pr(), 1.0F, 1.0F);
                  }
               }

               if (var3 > 0.0F) {
                  this.break_(var1);
               }

               this.try_(var1);
               if (var1 instanceof iB_2) {
                  eA_2.class_((iB_2)var1, this);
               }

               eA_2.break_(this, var1);
               rdn_3 var33 = this.ss();
               Object var35 = var1;
               if (var1 instanceof rSm_1) {
                  var35 = ((rSm_1)var1).class_;
               }

               if (!((rYB)this.throws_[7]).continue_ && !var33.class_() && var35 instanceof iB_2) {
                  var33.class_((iB_2)var35, this);
                  if (var33.class_()) {
                     this.class_(rpm_3.MAIN_HAND, rdn_3.break_);
                  }
               }

               if (var1 instanceof iB_2) {
                  float var36 = var31 - ((iB_2)var1).Ss();
                  this.class_(rlB_2.abstract_, Math.round(var36 * 10.0F));
                  if (var14 > 0) {
                     var1.case_(var14 * 4);
                  }

                  if ((rYB)this.throws_[7] instanceof rrEm_1 && var36 > 2.0F) {
                     int var20 = (int)((double)var36 * 0.5);
                     ((rrEm_1)((rYB)this.throws_[7])).class_(rLQ.private_, var1.rx(), var1.byte_(0.5), var1.BO(), var20, 0.1, 0.0, 0.1, 0.2);
                  }
               }

               this.while_(0.1F);
            } else {
               ((rYB)this.throws_[7]).class_(null, this.rx(), this.re(), this.BO(), rqn_3.hm, this.Pr(), 1.0F, 1.0F);
               if (var13) {
                  var1.rE();
               }
            }
         }
      }
   }

   public void while_(float var1) {
      this.new_();
      if (!((rhx_3)this.implements_[18]).class_ && !((rYB)this.throws_[7]).continue_) {
         ((rpQ_2)this.implements_[5]).class_(var1);
      }
   }

   @Override
   public Iterable<rdn_3> rs() {
      return Lists.newArrayList(new rdn_3[]{this.ss(), this.Sn()});
   }

   private void public_() {
      rdn_3 var1 = this.class_(rXQ.HEAD);
      if (var1.break_() == rdy_3.Os && !this.class_(rlG_2.break_)) {
         this.break_(new rLY(rLD.volatile_, 200, 0, false, false, true));
      }
   }

   @Override
   public void protected_(iB_2 var1) {
      super.protected_(var1);
      if (var1.ss().break_() instanceof rxM_2) {
         this.this_(true);
      }
   }

   public boolean protected_(boolean var1) {
      this.new_();
      return this.class_(
               ((rhz_3)this.implements_[1])
                  .class_(
                     ((rhz_3)this.implements_[1]).protected_,
                     var1 && !((rhz_3)this.implements_[1]).byte_().class_() ? ((rhz_3)this.implements_[1]).byte_().char_() : package_[37]
                  ),
               false,
               true
            )
            != null
         ? true
         : package_[41];
   }

   public float protected_(xc_3 var1) {
      this.new_();
      float var2 = ((rhz_3)this.implements_[1]).class_(var1);
      if (var2 > 1.0F) {
         int var3 = eA_2.case_(this);
         rdn_3 var4 = this.ss();
         if (var3 > 0 && !var4.class_()) {
            var2 += (float)(var3 * var3 + 1);
         }
      }

      if (rLK.class_(this)) {
         var2 *= 1.0F + (float)(rLK.break_(this) + 1) * 0.2F;
      }

      if (this.break_(rLD.protected_)) {
         float var5 = switch (this.byte_(rLD.protected_).byte_()) {
            case 0 -> final_[33];
            case 1 -> final_[34];
            case 2 -> final_[35];
            default -> final_[36];
         };
         var2 *= var5;
      }

      if (this.class_(rlG_2.break_) && !eA_2.private_(this)) {
         var2 /= 5.0F;
      }

      if (!(Boolean)this.throws_[20]) {
         var2 /= 5.0F;
      }

      return var2;
   }

   @Override
   public void protected_(int var1) {
      this.new_();
      super.protected_(((rhx_3)this.implements_[18]).class_ ? Math.min(var1, 1) : var1);
   }

   public void protected_(rhd_3 var1) {
      this.new_();
      Float var6 = (Float)var1.throws_[15];
      this.throws_[15] = var6;
      Float var7 = (Float)var1.throws_[16];
      this.throws_[16] = var7;
      Float var8 = (Float)var1.throws_[17];
      this.throws_[17] = var8;
      Float var9 = (Float)var1.throws_[18];
      this.throws_[18] = var9;
      an_3 var10 = (an_3)var1.throws_[5];
      this.throws_[5] = var10;
      rhx_3 var11 = (rhx_3)var1.implements_[18];
      this.implements_[18] = var11;
      Float var12 = (Float)var1.throws_[31];
      this.throws_[31] = var12;
      Float var13 = (Float)var1.throws_[37];
      this.throws_[37] = var13;
      Boolean var14 = (Boolean)var1.implements_[17];
      this.implements_[17] = var14;
      this.throws_(var1.PA());
      this.byte_(var1.rv());
      this.throws_(var1.BX());
      this.class_(var1.rx(), var1.re(), var1.BO(), (Float)var1.throws_[15], (Float)var1.throws_[16], (Integer)var1.private_[45], false);
      this.class_(var1.rx(), var1.re(), var1.BO(), (Float)var1.throws_[15], (Float)var1.throws_[16]);
   }

   public boolean private_(rfH_2 var1) {
      return !((rYB)this.throws_[7]).byte_(var1).final_((rYB)this.throws_[7], var1) ? true : package_[113];
   }

   public boolean private_(rcd_3 var1) {
      this.new_();
      if (this.Pm() || !(Boolean)this.throws_[20] || this.rT()) {
         return package_[146];
      } else if (this.sQ().case_()) {
         this.catch_(var1);
         Long var6 = ((rYB)this.throws_[7]).r();
         this.implements_[0] = var6;
         return true;
      } else if (this.sJ().case_()) {
         this.implements_(var1);
         Long var7 = ((rYB)this.throws_[7]).r();
         this.implements_[0] = var7;
         return true;
      } else {
         return package_[145];
      }
   }

   @Override
   public void private_(rjU_2 var1) {
      this.new_();
      double var2 = this.rx();
      double var4 = this.re();
      double var6 = this.BO();
      if (this.Py() && !this.Pm()) {
         rrLk_1 var8 = rrLk_1.break_(this.m().byte_);
         if (this == (cb_3)QY.instanceof_().class_[57]) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var8);
         }

         double var9 = var8.class_();
         double var11 = var9 < -0.2 ? 0.085 : break_[94];
         if (var9 <= 0.0
            || (Boolean)this.private_[41]
            || !((rYB)this.throws_[7]).byte_(new rfH_2(this.rx(), this.re() + 1.0 - 0.1, this.BO())).volatile_().byte_()) {
            rjU_2 var13 = this.rv();
            this.byte_(var13.break_(0.0, (var9 - var13.byte_) * var11, 0.0));
         }
      }

      if (((rhx_3)this.implements_[18]).break_ && !this.Pm()) {
         double var21 = this.rv().byte_;
         float var10 = (Float)this.private_[29];
         Float var18 = ((rhx_3)this.implements_[18]).class_() * (float)(this.PF() ? 2 : package_[109]);
         this.private_[29] = var18;
         super.private_(var1);
         rjU_2 var22 = this.rv();
         this.catch_(var22.break_, var21 * 0.6, var22.protected_);
         Float var19 = var10;
         this.private_[29] = var19;
         Float var20 = 0.0F;
         this.throws_[31] = var20;
         this.break_(7, false);
      } else {
         super.private_(var1);
      }

      this.continue_(this.rx() - var2, this.re() - var4, this.BO() - var6);
   }

   private static void private_() {
      break_ = new double[]{
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

   private static void final_() {
      native_ = new short[]{
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

   public void synchronized_(boolean var1) {
      this.new_();
      Boolean var6 = var1;
      this.implements_[26] = var6;
   }

   @Override
   public abstract boolean native_();

   public static String native_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 121, -75, 56, -64, -116, -12, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void strictfp_() {
      this.new_();
      rJT var5 = (rJT)this.implements_[3];
      this.implements_[4] = var5;
   }

   public rns_3 st() {
      return ((rYB)this.throws_[7]).package_();
   }

   public void sz() {
      this.break_(7, true);
   }

   @Override
   public boolean sr() {
      this.new_();
      return !((rhx_3)this.implements_[18]).break_ ? true : package_[75];
   }

   @Override
   public void A() {
      this.new_();
      if (this.sT() && this.Pm()) {
         this.BH();
         this.volatile_(false);
      } else {
         double var1 = this.rx();
         double var3 = this.re();
         double var5 = this.BO();
         super.A();
         Float var11 = (Float)this.implements_[8];
         this.implements_[7] = var11;
         Float var12 = 0.0F;
         this.implements_[8] = var12;
         this.super_(this.rx() - var1, this.re() - var3, this.BO() - var5);
      }
   }

   public int sn() {
      this.new_();
      if ((Integer)this.implements_[19] >= 30) {
         return 112 + ((Integer)this.implements_[19] - 30) * 9;
      } else {
         return this.implements_[19] >= 15 ? 37 + ((Integer)this.implements_[19] - 15) * 5 : class_[44] + (Integer)this.implements_[19] * 2;
      }
   }

   @Override
   public void Q() {
      super.Q();
      this.Sg();
      Float var5 = (Float)this.throws_[15];
      this.private_[25] = var5;
      Float var6 = (Float)this.throws_[16];
      this.private_[26] = var6;
   }

   @Override
   public float rq() {
      this.new_();
      return !((rhx_3)this.implements_[18]).break_ && !this.Sy() ? super.rq() : final_[149];
   }

   public rpD_2 sq() {
      return new rpD_2();
   }

   @Override
   public boolean SG() {
      return true;
   }

   @Override
   public boolean rJ() {
      return true;
   }

   @Override
   public boolean Py() {
      this.new_();
      return !((rhx_3)this.implements_[18]).break_ && !this.native_() && super.Py() ? true : package_[148];
   }

   @Override
   public double Pv() {
      return -0.35;
   }

   @Override
   public int rj() {
      return 10;
   }

   @Override
   public int rV() {
      return 20;
   }

   @Override
   public int rR() {
      this.new_();
      return ((rhx_3)this.implements_[18]).class_ ? 1 : class_[3];
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.PLAYERS;
   }

   @Override
   public Iterable<rdn_3> PV() {
      this.new_();
      return ((rhz_3)this.implements_[1]).break_;
   }

   @Override
   public boolean PK() {
      this.new_();
      return ((rhx_3)this.implements_[18]).break_ || this.throws_[20] && this.Pw() ? package_[138] : package_[137];
   }

   @Override
   public ImmutableList<iM_2> BV() {
      return ImmutableList.of(iM_2.STANDING, iM_2.CROUCHING, iM_2.SWIMMING);
   }

   @Override
   public boolean BK() {
      return !super.BK() && !this.Sc() ? package_[73] : package_[72];
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
      this.new_();
      return !((rhx_3)this.implements_[18]).break_ && super.Be() ? true : package_[70];
   }

   @Override
   public rqA_2 Bt() {
      return rqn_3.hC;
   }

   @Override
   public void Bc() {
      this.class_(iM_2.STANDING);
      super.Bc();
      this.public_(this.SK());
      Integer var5 = 0;
      this.private_[13] = var5;
   }

   @Override
   public rqA_2 Bv() {
      return rqn_3.hw;
   }

   @Override
   public float sB() {
      return (float)this.class_(iQ_2.protected_);
   }

   public rcd_3 sJ() {
      return ((rmE_2)this.throws_[49]).class_((rut_3<rcd_3>)protected_[7]);
   }

   public static iz_3 sy() {
      return iB_2.SD().class_(iQ_2.case_, 1.0).class_(iQ_2.protected_, 0.1F).class_(iQ_2.private_).class_(iQ_2.extends_);
   }

   public boolean sN() {
      return this.h();
   }

   public boolean sL() {
      return this.return_();
   }

   public int sH() {
      this.new_();
      return (Integer)this.implements_[22];
   }

   public boolean sT() {
      return this.h();
   }

   public void sI() {
      this.new_();
      if ((Long)this.implements_[0] + 20L < ((rYB)this.throws_[7]).r()) {
         this.finally_(this.sQ());
         this.catch_(new rcd_3());
         this.finally_(this.sJ());
         this.implements_(new rcd_3());
      }
   }

   @Override
   public void Sx() {
      this.new_();
      super.Sx();
      if (!((rYB)this.throws_[7]).B().break_(rRu_1.byte_)) {
         this.sf();
         ((rhz_3)this.implements_[1]).private_();
      }
   }

   public boolean sV() {
      return this.sL() && this.sX().break_().byte_(this.sX()) == rkc_3.EAT ? true : package_[179];
   }

   @Override
   public rpZ_2 Su() {
      return ((rmE_2)this.throws_[49]).<Byte>class_((rut_3<Byte>)protected_[5]) == 0 ? rpZ_2.LEFT : rpZ_2.RIGHT;
   }

   public int su() {
      this.new_();
      return (Integer)this.implements_[16];
   }

   public boolean sW() {
      this.new_();
      return (Boolean)this.implements_[26];
   }

   @Override
   public float Sd() {
      return this.BQ().<Float>class_((rut_3<Float>)protected_[2]);
   }

   @Override
   public void SQ() {
      this.class_(true, true);
   }

   public rcd_3 sQ() {
      return ((rmE_2)this.throws_[49]).class_((rut_3<rcd_3>)protected_[6]);
   }

   public boolean sZ() {
      return this.sL() && this.sX().break_().byte_(this.sX()) == rkc_3.DRINK ? true : package_[181];
   }

   public boolean sF() {
      return this.sL() && this.sX().break_().byte_(this.sX()) == rkc_3.SPEAR ? true : package_[177];
   }

   public boolean sA() {
      return this.Ss() > 0.0F && this.Ss() < this.SK() ? true : package_[131];
   }

   public boolean sC() {
      return !this.rT() && !this.break_(rLD.goto_) ? true : package_[118];
   }

   public void sg() {
      Integer var5 = 0;
      this.private_[16] = var5;
   }

   public boolean sD() {
      this.new_();
      return ((rhx_3)this.implements_[18]).throws_;
   }

   public boolean sR() {
      return this.sL() && this.sX().break_().byte_(this.sX()) == rkc_3.BOW ? true : package_[173];
   }

   public float sY() {
      return (float)this.class_(iQ_2.extends_);
   }

   public rpD_2 sK() {
      this.new_();
      return (rpD_2)this.implements_[28];
   }

   public boolean sU() {
      this.new_();
      return ((rhx_3)this.implements_[18]).protected_ && this.synchronized_() >= 2 ? true : package_[166];
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return (ap_3)((Map)protected_[1]).getOrDefault(var1, (ap_3)protected_[0]);
   }

   @Override
   public rgP_2 L_() {
      return this.class_(rnB_2.class_(this.BG(), this.g(), rnO_2.values()));
   }

   @Override
   public void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_((rut_3<Float>)protected_[2], 0.0F);
      ((rmE_2)this.throws_[49]).class_((rut_3<Integer>)protected_[3], 0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Byte>)protected_[4], (byte)0);
      ((rmE_2)this.throws_[49]).class_((rut_3<Byte>)protected_[5], (byte)1);
      ((rmE_2)this.throws_[49]).class_((rut_3<rcd_3>)protected_[6], new rcd_3());
      ((rmE_2)this.throws_[49]).class_((rut_3<rcd_3>)protected_[7], new rcd_3());
   }

   public void t_() {
      this.new_();
      if (this.protected_(iM_2.SWIMMING)) {
         iM_2 var1;
         if (this.Sy()) {
            var1 = iM_2.FALL_FLYING;
         } else if (this.Sc()) {
            var1 = iM_2.SLEEPING;
         } else if (this.Py()) {
            var1 = iM_2.SWIMMING;
         } else if (this.Sz()) {
            var1 = iM_2.SPIN_ATTACK;
         } else if (this.h() && !((rhx_3)this.implements_[18]).break_) {
            var1 = iM_2.CROUCHING;
         } else {
            var1 = iM_2.STANDING;
         }

         iM_2 var2;
         if (this.native_() || this.Pm() || this.protected_(var1)) {
            var2 = var1;
         } else if (this.protected_(iM_2.CROUCHING)) {
            var2 = iM_2.CROUCHING;
         } else {
            var2 = iM_2.SWIMMING;
         }

         this.class_(var2);
      }
   }
}
