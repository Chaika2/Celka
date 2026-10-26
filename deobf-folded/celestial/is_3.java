package celestial;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public abstract class is_3 extends iB_2 {
   private static final rut_3<Byte> id_class = rmE_2.id_class(is_3.class, ruw_3.id_class);
   public int id_implements;
   protected int id_finally;
   protected rPR id_extends;
   protected rPY id_native;
   protected rPg_1 id_volatile;
   private final rPf_1 id_break;
   protected rLy_1 id_final;
   protected final rBz_1 id_package;
   protected final rBz_1 id_int;
   private iB_2 id_protected;
   private final ih_3 id_super;
   private final rqs_3<rdn_3> id_this = rqs_3.id_class(2, rdn_3.id_break);
   protected final float[] id_new = new float[2];
   private final rqs_3<rdn_3> id_else = rqs_3.id_class(4, rdn_3.id_break);
   protected final float[] id_continue = new float[4];
   private boolean id_synchronized;
   private boolean id_return;
   private final Map<rLp_1, Float> id_public = Maps.newEnumMap(rLp_1.class);
   private rqO_2 id_goto;
   private long id_while;
   private an_3 id_try;
   private int id_instanceof;
   private rcd_3 id_throw;
   private rfH_2 id_interface = rfH_2.id_protected;
   private float id_char = -1.0F;

   protected boolean id_boolean() {
      return false;
   }

   public int id_char() {
      return 80;
   }

   private ryZ_2 id_byte(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.df && this.id_protected(var1)) {
         this.id_break(var1, true);
         var3.id_catch(1);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         if (var3.id_break() == rdy_3.dj) {
            ryZ_2 var4 = var3.id_class(var1, this, var2);
            if (var4.id_class()) {
               return var4;
            }
         }

         if (var3.id_break() instanceof rkO_2) {
            if ((rYB)this.id_throws[7] instanceof rrEm_1) {
               rkO_2 var6 = (rkO_2)var3.id_break();
               Optional var5 = var6.id_class(var1, this, (aI_2<? extends is_3>)this.BC(), (rrEm_1)((rYB)this.id_throws[7]), this.Ps(), var3);
               var5.ifPresent(var2x -> this.id_class(var1, var2x));
               return var5.isPresent() ? ryZ_2.SUCCESS : ryZ_2.PASS;
            } else {
               return ryZ_2.CONSUME;
            }
         } else {
            return ryZ_2.PASS;
         }
      }
   }

   public void id_byte(boolean var1) {
      this.id_synchronized = var1;
   }

   public void id_byte(iB_2 var1) {
      this.id_protected = var1;
      rrxr_3.id_class(rrxr_3.rE, this, var1);
   }

   @Override
   protected int id_byte(rhd_3 var1) {
      if (this.id_finally > 0) {
         int var2 = this.id_finally;

         for (int var3 = 0; var3 < this.id_else.size(); var3++) {
            if (!this.id_else.get(var3).id_class() && this.id_continue[var3] <= 1.0F) {
               var2 += 1 + ((Random)this.id_throws[40]).nextInt(3);
            }
         }

         for (int var4 = 0; var4 < this.id_this.size(); var4++) {
            if (!this.id_this.get(var4).id_class() && this.id_new[var4] <= 1.0F) {
               var2 += 1 + ((Random)this.id_throws[40]).nextInt(3);
            }
         }

         return var2;
      } else {
         return this.id_finally;
      }
   }

   @Override
   protected void id_byte(rlb_3<rXs_1> var1) {
      if (this.id_public().id_new()) {
         super.id_byte(var1);
      } else {
         this.id_byte(this.rv().id_break(0.0, 0.3, 0.0));
      }
   }

   public static boolean id_byte(rXQ var0, rdn_3 var1) {
      rXQ var2 = id_finally(var1);
      return var2 == var0 || var2 == rXQ.MAINHAND && var0 == rXQ.OFFHAND || var2 == rXQ.OFFHAND && var0 == rXQ.MAINHAND;
   }

   private float id_byte(float var1, float var2, float var3) {
      float var4 = rfU_2.id_catch(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   private List id_byte(rYB var1) {
      rYB var2 = this.e();
      if (var2 instanceof gm_3 var4) {
         return var4.id_continue();
      } else {
         return var2 instanceof rrEm_1 var3 ? var3.id_continue() : null;
      }
   }

   @Override
   protected boolean id_int() {
      return false;
   }

   public void id_long() {
      rqA_2 var1 = this.id_static();
      if (var1 != null) {
         this.id_class(var1, this.Si(), this.SN());
      }
   }

   public void id_float() {
      if (((rYB)this.id_throws[7]).id_continue) {
         for (int var1 = 0; var1 < 20; var1++) {
            double var2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var4 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var6 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var8 = 10.0;
            ((rYB)this.id_throws[7])
               .id_class(rLQ.id_boolean, this.id_catch(1.0) - var2 * 10.0, this.Ph() - var4 * 10.0, this.id_protected(1.0) - var6 * 10.0, var2, var4, var6);
         }
      } else {
         ((rYB)this.id_throws[7]).id_class(this, (byte)20);
      }
   }

   protected void id_double() {
   }

   protected is_3(aI_2<? extends is_3> var1, rYB var2) {
      super(var1, var2);
      this.id_package = new rBz_1();
      this.id_int = new rBz_1();
      this.id_extends = new rPR(this);
      this.id_native = new rPY(this);
      this.id_volatile = new rPg_1(this);
      this.id_break = this.id_new();
      this.id_final = this.id_break(var2);
      this.id_super = new ih_3(this);
      Arrays.fill(this.id_continue, 0.085F);
      Arrays.fill(this.id_new, 0.085F);
      if (var2 != null && !var2.id_continue) {
         this.id_final();
      }
   }

   protected boolean F() {
      if (((rYB)this.id_throws[7]).id_strictfp() && !((rYB)this.id_throws[7]).id_continue) {
         float var1 = this.rX();
         rfH_2 var2 = this.ra() instanceof rSK
            ? new rfH_2(this.rx(), (double)Math.round(this.re()), this.BO()).id_final()
            : new rfH_2(this.rx(), (double)Math.round(this.re()), this.BO());
         if (var1 > 0.5F && ((Random)this.id_throws[40]).nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && ((rYB)this.id_throws[7]).id_case(var2)) {
            return true;
         }
      }

      return false;
   }

   public rfH_2 J() {
      return this.id_interface;
   }

   public int S() {
      return 75;
   }

   public boolean Z() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 2) != 0;
   }

   @Override
   public void id_this() {
      if (rrbb_3.rO() && this.n()) {
         this.sJ();
      } else {
         super.id_this();
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_private();
            if ((Integer)this.id_throws[41] % 5 == 0) {
               this.id_void();
            }
         }
      }
   }

   public void b() {
      this.id_return = true;
   }

   public int s() {
      return 10;
   }

   public boolean c() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
   }

   private boolean n() {
      if (this.n_()) {
         return false;
      } else if ((Integer)this.id_private[10] > 0) {
         return false;
      } else if ((Integer)this.id_throws[41] < 20) {
         return false;
      } else {
         List var1 = this.id_byte(this.e());
         if (var1 == null) {
            return false;
         } else if (var1.size() != 1) {
            return false;
         } else {
            an_3 var2 = (an_3)var1.get(0);
            double var3 = Math.max(Math.abs(this.rx() - var2.rx()) - 16.0, 0.0);
            double var5 = Math.max(Math.abs(this.BO() - var2.BO()) - 16.0, 0.0);
            double var7 = var3 * var3 + var5 * var5;
            return !this.id_class(var7);
         }
      }
   }

   public float d() {
      return this.id_char;
   }

   @Override
   protected void id_class(rye_3 var1, int var2, boolean var3) {
      super.id_class(var1, var2, var3);

      for (rXQ var7 : rXQ.values()) {
         rdn_3 var8 = this.id_class(var7);
         float var9 = this.id_throws(var7);
         boolean var10 = var9 > 1.0F;
         if (!var8.id_class()
            && !eA_2.id_throws(var8)
            && (var3 || var10)
            && Math.max(((Random)this.id_throws[40]).nextFloat() - (float)var2 * 0.01F, 0.0F) < var9) {
            if (!var10 && var8.id_throws()) {
               var8.id_break(
                  var8.id_private() - ((Random)this.id_throws[40]).nextInt(1 + ((Random)this.id_throws[40]).nextInt(Math.max(var8.id_private() - 3, 1)))
               );
            }

            this.a_(var8);
            this.id_class(var7, rdn_3.id_break);
         }
      }
   }

   protected void id_class(rRh_1 var1) {
      if (((Random)this.id_throws[40]).nextFloat() < 0.15F * var1.id_byte()) {
         int var2 = ((Random)this.id_throws[40]).nextInt(2);
         float var3 = ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD ? 0.1F : 0.25F;
         if (((Random)this.id_throws[40]).nextFloat() < 0.095F) {
            var2++;
         }

         if (((Random)this.id_throws[40]).nextFloat() < 0.095F) {
            var2++;
         }

         if (((Random)this.id_throws[40]).nextFloat() < 0.095F) {
            var2++;
         }

         boolean var4 = true;

         for (rXQ var8 : rXQ.values()) {
            if (var8.id_class() == rXN.ARMOR) {
               rdn_3 var9 = this.id_class(var8);
               if (!var4 && ((Random)this.id_throws[40]).nextFloat() < var3) {
                  break;
               }

               var4 = false;
               if (var9.id_class()) {
                  rdb_3 var10 = id_class(var8, var2);
                  if (var10 != null) {
                     this.id_class(var8, new rdn_3(var10));
                  }
               }
            }
         }
      }
   }

   public static rdb_3 id_class(rXQ var0, int var1) {
      switch (var0) {
         case HEAD:
            if (var1 == 0) {
               return rdy_3.hs;
            } else if (var1 == 1) {
               return rdy_3.hc;
            } else if (var1 == 2) {
               return rdy_3.hM;
            } else if (var1 == 3) {
               return rdy_3.hJ;
            } else if (var1 == 4) {
               return rdy_3.hW;
            }
         case CHEST:
            if (var1 == 0) {
               return rdy_3.hE;
            } else if (var1 == 1) {
               return rdy_3.hu;
            } else if (var1 == 2) {
               return rdy_3.hO;
            } else if (var1 == 3) {
               return rdy_3.hx;
            } else if (var1 == 4) {
               return rdy_3.hz;
            }
         case LEGS:
            if (var1 == 0) {
               return rdy_3.hG;
            } else if (var1 == 1) {
               return rdy_3.hm;
            } else if (var1 == 2) {
               return rdy_3.hh;
            } else if (var1 == 3) {
               return rdy_3.hd;
            } else if (var1 == 4) {
               return rdy_3.hQ;
            }
         case FEET:
            if (var1 == 0) {
               return rdy_3.hb;
            } else if (var1 == 1) {
               return rdy_3.hZ;
            } else if (var1 == 2) {
               return rdy_3.hX;
            } else if (var1 == 3) {
               return rdy_3.hk;
            } else if (var1 == 4) {
               return rdy_3.hN;
            }
         default:
            return null;
      }
   }

   protected void id_class(float var1, rXQ var2) {
      rdn_3 var3 = this.id_class(var2);
      if (!var3.id_class() && ((Random)this.id_throws[40]).nextFloat() < 0.5F * var1) {
         this.id_class(var2, eA_2.id_class((Random)this.id_throws[40], var3, (int)(5.0F + var1 * (float)((Random)this.id_throws[40]).nextInt(18)), false));
      }
   }

   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_byte(iQ_2.id_break).id_byte(new ix_3("Random spawn bonus", ((Random)this.id_throws[40]).nextGaussian() * 0.05, id_3.MULTIPLY_BASE));
      if (((Random)this.id_throws[40]).nextFloat() < 0.05F) {
         this.id_throws(true);
      } else {
         this.id_throws(false);
      }

      return var4;
   }

   public boolean id_class(rRR var1) {
      return !var1.id_protected(this.rN()) && var1.id_protected(this);
   }

   public boolean id_class(rRg_1 var1, iO_2 var2) {
      return true;
   }

   public static boolean id_class(aI_2<? extends is_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      rfH_2 var5 = var3.id_break();
      return var2 == iO_2.SPAWNER || var1.id_byte(var5).id_class(var1, var5, var0);
   }

   public void id_class(an_3 var1, float var2, float var3) {
      double var4 = var1.rx() - this.rx();
      double var6 = var1.BO() - this.BO();
      double var8;
      if (var1 instanceof iB_2 var10) {
         var8 = var10.rH() - this.rH();
      } else {
         var8 = (var1.rN().id_break + var1.rN().id_throws) / 2.0 - this.rH();
      }

      double var20 = (double)rfU_2.id_class(var4 * var4 + var6 * var6);
      float var12 = (float)(rfU_2.id_protected(var6, var4) * 180.0F / (float)Math.PI) - 90.0F;
      float var13 = (float)(-(rfU_2.id_protected(var8, var20) * 180.0F / (float)Math.PI));
      Float var18 = this.id_byte((Float)this.id_throws[16], var13, var3);
      this.id_throws[16] = var18;
      Float var19 = this.id_byte((Float)this.id_throws[15], var12, var2);
      this.id_throws[15] = var19;
   }

   @Override
   public rdn_3 id_class(rXQ var1) {
      switch (var1.id_class()) {
         case HAND:
            return this.id_this.get(var1.id_break());
         case ARMOR:
            return this.id_else.get(var1.id_break());
         default:
            return rdn_3.id_break;
      }
   }

   @Override
   public void id_class(rXQ var1, rdn_3 var2) {
      switch (var1.id_class()) {
         case HAND:
            this.id_this.set(var1.id_break(), var2);
            break;
         case ARMOR:
            this.id_else.set(var1.id_break(), var2);
      }
   }

   public <T extends is_3> T id_class(aI_2<T> var1, boolean var2) {
      if ((Boolean)this.id_throws[27]) {
         return null;
      } else {
         is_3 var3 = (is_3)var1.id_class((rYB)this.id_throws[7]);
         var3.id_native(this);
         var3.id_class(this.n_());
         var3.id_protected(this.c());
         if (this.Bk()) {
            var3.id_break(this.rD());
            var3.id_final(this.D());
         }

         if (this.O()) {
            var3.b();
         }

         var3.id_catch(this.rg());
         if (var2) {
            var3.id_byte(this.M());

            for (rXQ var7 : rXQ.values()) {
               rdn_3 var8 = this.id_class(var7);
               if (!var8.id_class()) {
                  var3.id_class(var7, var8.id_implements());
                  var3.id_class(var7, this.id_throws(var7));
                  var8.id_throws(0);
               }
            }
         }

         ((rYB)this.id_throws[7]).a_(var3);
         if (this.Pm()) {
            an_3 var9 = this.ra();
            this.BH();
            var3.id_class(var9, true);
         }

         this.PD();
         return (T)var3;
      }
   }

   public void id_class(boolean var1, boolean var2) {
      if (this.id_try != null) {
         Boolean var7 = false;
         this.id_throws[6] = var7;
         if (!(this.id_try instanceof rhd_3)) {
            an_3 var10000 = this.id_try;
            Boolean var8 = false;
            var10000.id_throws[6] = var8;
         }

         this.id_try = null;
         this.id_throw = null;
         if (!((rYB)this.id_throws[7]).id_continue && var2) {
            this.id_class(rdy_3.df);
         }

         if (!((rYB)this.id_throws[7]).id_continue && var1 && (rYB)this.id_throws[7] instanceof rrEm_1) {
            ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(this, new rvA_2(this, (an_3)null));
         }
      }
   }

   @Override
   public boolean id_class(an_3 var1, boolean var2) {
      boolean var3 = super.id_class(var1, var2);
      if (var3 && this.z()) {
         this.id_class(true, true);
      }

      return var3;
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      rXQ var3;
      if (var1 == 98) {
         var3 = rXQ.MAINHAND;
      } else if (var1 == 99) {
         var3 = rXQ.OFFHAND;
      } else if (var1 == 100 + rXQ.HEAD.id_break()) {
         var3 = rXQ.HEAD;
      } else if (var1 == 100 + rXQ.CHEST.id_break()) {
         var3 = rXQ.CHEST;
      } else if (var1 == 100 + rXQ.LEGS.id_break()) {
         var3 = rXQ.LEGS;
      } else {
         if (var1 != 100 + rXQ.FEET.id_break()) {
            return false;
         }

         var3 = rXQ.FEET;
      }

      if (!var2.id_class() && !id_byte(var3, var2) && var3 != rXQ.HEAD) {
         return false;
      } else {
         this.id_class(var3, var2);
         return true;
      }
   }

   public void id_class(boolean var1) {
   }

   private void id_class(rhd_3 var1, rdn_3 var2, rdn_3 var3) {
      if (!var2.id_class() && !var3.id_class() && var2.id_break() instanceof rxM_2 && var3.id_break() == rdy_3.kN) {
         float var4 = 0.25F + (float)eA_2.id_case(this) * 0.05F;
         if (((Random)this.id_throws[40]).nextFloat() < var4) {
            var1.sK().id_class(rdy_3.kN, 100);
            ((rYB)this.id_throws[7]).id_class(var1, (byte)30);
         }
      }
   }

   public void id_class(rXQ var1, float var2) {
      switch (var1.id_class()) {
         case HAND:
            this.id_new[var1.id_break()] = var2;
            break;
         case ARMOR:
            this.id_continue[var1.id_break()] = var2;
      }
   }

   public void id_class(rLp_1 var1, float var2) {
      this.id_public.put(var1, var2);
   }

   @Override
   public final ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      if (!this.BM()) {
         return ryZ_2.PASS;
      } else if (this.N() == var1) {
         this.id_class(true, !((rhx_3)var1.id_implements[18]).id_protected);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         ryZ_2 var3 = this.id_byte(var1, var2);
         if (var3.id_class()) {
            return var3;
         } else {
            var3 = this.id_break(var1, var2);
            return var3.id_class() ? var3 : super.id_class(var1, var2);
         }
      }
   }

   public float id_class(rLp_1 var1) {
      is_3 var2;
      if (this.ra() instanceof is_3 && ((is_3)this.ra()).id_int()) {
         var2 = (is_3)this.ra();
      } else {
         var2 = this;
      }

      Float var3 = var2.id_public.get(var1);
      return var3 == null ? var1.id_class() : var3;
   }

   protected void id_class(rhd_3 var1, is_3 var2) {
   }

   public void id_class(rfH_2 var1, int var2) {
      this.id_interface = var1;
      this.id_char = (float)var2;
   }

   public boolean id_class(rkB_2 var1) {
      return false;
   }

   @Override
   protected void id_class(rye_3 var1, boolean var2) {
      super.id_class(var1, var2);
      this.id_goto = null;
   }

   @Override
   protected rzP_2 id_class(boolean var1, rye_3 var2) {
      return super.id_class(var1, var2).id_class(this.id_while, (Random)this.id_throws[40]);
   }

   protected boolean id_class(rdn_3 var1, rdn_3 var2) {
      if (var2.id_class()) {
         return true;
      } else if (var1.id_break() instanceof rkx_3) {
         if (!(var2.id_break() instanceof rkx_3)) {
            return true;
         } else {
            rkx_3 var6 = (rkx_3)var1.id_break();
            rkx_3 var8 = (rkx_3)var2.id_break();
            return var6.id_catch() != var8.id_catch() ? var6.id_catch() > var8.id_catch() : this.id_break(var1, var2);
         }
      } else if (var1.id_break() instanceof rxQ_2 && var2.id_break() instanceof rxQ_2) {
         return this.id_break(var1, var2);
      } else if (var1.id_break() instanceof rxm_3 && var2.id_break() instanceof rxm_3) {
         return this.id_break(var1, var2);
      } else if (var1.id_break() instanceof rxS_2) {
         if (eA_2.id_protected(var2)) {
            return false;
         } else if (!(var2.id_break() instanceof rxS_2)) {
            return true;
         } else {
            rxS_2 var5 = (rxS_2)var1.id_break();
            rxS_2 var7 = (rxS_2)var2.id_break();
            if (var5.id_catch() != var7.id_catch()) {
               return var5.id_catch() > var7.id_catch();
            } else {
               return var5.id_private() != var7.id_private() ? var5.id_private() > var7.id_private() : this.id_break(var1, var2);
            }
         }
      } else {
         if (var1.id_break() instanceof rkQ_2) {
            if (var2.id_break() instanceof rxJ_2) {
               return true;
            }

            if (var2.id_break() instanceof rkQ_2) {
               rkQ_2 var3 = (rkQ_2)var1.id_break();
               rkQ_2 var4 = (rkQ_2)var2.id_break();
               if (var3.id_catch() != var4.id_catch()) {
                  return var3.id_catch() > var4.id_catch();
               }

               return this.id_break(var1, var2);
            }
         }

         return false;
      }
   }

   @Override
   public boolean id_class(aI_2<?> var1) {
      return var1 != aI_2.id_interface;
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 20) {
         this.id_float();
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("CanPickUpLoot", this.M());
      var1.id_class("PersistenceRequired", this.id_return);
      rcy_3 var2 = new rcy_3();

      for (rdn_3 var4 : this.id_else) {
         rcd_3 var5 = new rcd_3();
         if (!var4.id_class()) {
            var4.id_break(var5);
         }

         var2.add(var5);
      }

      var1.id_class("ArmorItems", var2);
      rcy_3 var10 = new rcy_3();

      for (rdn_3 var13 : this.id_this) {
         rcd_3 var6 = new rcd_3();
         if (!var13.id_class()) {
            var13.id_break(var6);
         }

         var10.add(var6);
      }

      var1.id_class("HandItems", var10);
      rcy_3 var12 = new rcy_3();

      for (float var8 : this.id_continue) {
         var12.add(rcu_3.id_class(var8));
      }

      var1.id_class("ArmorDropChances", var12);
      rcy_3 var15 = new rcy_3();

      for (float var9 : this.id_new) {
         var15.add(rcu_3.id_class(var9));
      }

      var1.id_class("HandDropChances", var15);
      if (this.id_try != null) {
         rcd_3 var18 = new rcd_3();
         if (this.id_try instanceof iB_2) {
            UUID var20 = this.id_try.ro();
            var18.id_class("UUID", var20);
         } else if (this.id_try instanceof rsS_2) {
            rfH_2 var21 = ((rsS_2)this.id_try).id_implements();
            var18.id_break("X", var21.b_());
            var18.id_break("Y", var21.c_());
            var18.id_break("Z", var21.d_());
         }

         var1.id_class("Leash", var18);
      } else if (this.id_throw != null) {
         var1.id_class("Leash", this.id_throw.id_catch());
      }

      var1.id_class("LeftHanded", this.Z());
      if (this.id_goto != null) {
         var1.id_class("DeathLootTable", this.id_goto.toString());
         if (this.id_while != 0L) {
            var1.id_class("DeathLootTableSeed", this.id_while);
         }
      }

      if (this.c()) {
         var1.id_class("NoAI", this.c());
      }
   }

   public boolean k() {
      return this.id_char != -1.0F;
   }

   @Override
   public void id_default() {
      super.id_default();
      boolean var1 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break);
      if (rrxr_3.g.id_byte()) {
         var1 = rrxr_3.id_break(rrxr_3.g, (rYB)this.id_throws[7], this);
      }

      if (!((rYB)this.id_throws[7]).id_continue && this.M() && this.BM() && !(Boolean)this.id_private[32] && var1) {
         for (rsE_2 var3 : ((rYB)this.id_throws[7]).id_class(rsE_2.class, this.rN().id_byte(1.0, 0.0, 1.0))) {
            if (!(Boolean)var3.id_throws[27] && !var3.id_protected().id_class() && !var3.id_package() && this.id_implements(var3.id_protected())) {
               this.id_break(var3);
            }
         }
      }
   }

   public boolean v() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 4) != 0;
   }

   protected rqO_2 id_short() {
      return super.By();
   }

   public boolean z() {
      return this.id_try != null;
   }

   @Override
   protected void id_void() {
      boolean var1 = !(this.rU() instanceof is_3);
      boolean var2 = !(this.ra() instanceof rSK);
      this.id_package.id_class(rBW.MOVE, var1);
      this.id_package.id_class(rBW.JUMP, var1 && var2);
      this.id_package.id_class(rBW.LOOK, var1);
   }

   public int r() {
      return 40;
   }

   public an_3 N() {
      if (this.id_try == null && this.id_instanceof != 0 && ((rYB)this.id_throws[7]).id_continue) {
         this.id_try = ((rYB)this.id_throws[7]).id_break(this.id_instanceof);
      }

      return this.id_try;
   }

   public void id_break(an_3 var1, boolean var2) {
      this.id_try = var1;
      this.id_throw = null;
      Boolean var7 = true;
      this.id_throws[6] = var7;
      if (!(this.id_try instanceof rhd_3)) {
         an_3 var10000 = this.id_try;
         Boolean var8 = true;
         var10000.id_throws[6] = var8;
      }

      if (!((rYB)this.id_throws[7]).id_continue && var2 && (rYB)this.id_throws[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.id_throws[7])).id_else().id_break(this, new rvA_2(this, this.id_try));
      }

      if (this.Pm()) {
         this.BH();
      }
   }

   protected void id_break(rsE_2 var1) {
      rdn_3 var2 = var1.id_protected();
      if (this.id_catch(var2)) {
         this.id_class(var1);
         this.id_class(var1, var2.id_char());
         var1.PD();
      }
   }

   protected void id_break(rRh_1 var1) {
      float var2 = var1.id_byte();
      this.id_instanceof(var2);

      for (rXQ var6 : rXQ.values()) {
         if (var6.id_class() == rXN.ARMOR) {
            this.id_class(var2, var6);
         }
      }
   }

   @Override
   protected float id_break(float var1, float var2, float var3) {
      this.id_break.id_class();
      return var2;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("CanPickUpLoot", 1)) {
         this.id_byte(var1.id_new("CanPickUpLoot"));
      }

      this.id_return = var1.id_new("PersistenceRequired");
      if (var1.id_byte("ArmorItems", 9)) {
         rcy_3 var2 = var1.id_protected("ArmorItems", 10);

         for (int var3 = 0; var3 < this.id_else.size(); var3++) {
            this.id_else.set(var3, rdn_3.id_class(var2.id_class(var3)));
         }
      }

      if (var1.id_byte("HandItems", 9)) {
         rcy_3 var4 = var1.id_protected("HandItems", 10);

         for (int var7 = 0; var7 < this.id_this.size(); var7++) {
            this.id_this.set(var7, rdn_3.id_class(var4.id_class(var7)));
         }
      }

      if (var1.id_byte("ArmorDropChances", 9)) {
         rcy_3 var5 = var1.id_protected("ArmorDropChances", 5);

         for (int var8 = 0; var8 < var5.size(); var8++) {
            this.id_continue[var8] = var5.id_private(var8);
         }
      }

      if (var1.id_byte("HandDropChances", 9)) {
         rcy_3 var6 = var1.id_protected("HandDropChances", 5);

         for (int var9 = 0; var9 < var6.size(); var9++) {
            this.id_new[var9] = var6.id_private(var9);
         }
      }

      if (var1.id_byte("Leash", 10)) {
         this.id_throw = var1.id_int("Leash");
      }

      this.id_throws(var1.id_new("LeftHanded"));
      if (var1.id_byte("DeathLootTable", 8)) {
         this.id_goto = new rqO_2(var1.id_native("DeathLootTable"));
         this.id_while = var1.id_implements("DeathLootTableSeed");
      }

      this.id_protected(var1.id_new("NoAI"));
   }

   protected rLy_1 id_break(rYB var1) {
      return new rLA(this, var1);
   }

   @Override
   protected void id_break(rXQ var1, rdn_3 var2) {
      this.id_class(var1, var2);
      this.id_protected(var1);
      this.id_return = true;
   }

   public boolean id_break(rdn_3 var1, rdn_3 var2) {
      if (var1.id_catch() >= var2.id_catch() && (!var1.id_final() || var2.id_final())) {
         return var1.id_final() && var2.id_final()
            ? var1.id_package().id_protected().stream().anyMatch(var0 -> !var0.equals("Damage"))
               && !var2.id_package().id_protected().stream().anyMatch(var0 -> !var0.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean id_break(rLp_1 var1) {
      return var1 != rLp_1.DANGER_FIRE && var1 != rLp_1.DANGER_CACTUS && var1 != rLp_1.DANGER_OTHER && var1 != rLp_1.WALKABLE_DOOR;
   }

   protected ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      return ryZ_2.PASS;
   }

   public void id_throws(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1 ? (byte)(var2 | 2) : (byte)(var2 & -3));
   }

   @Override
   protected void id_throws(rye_3 var1) {
      this.id_implements();
      super.id_throws(var1);
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      rXQ var2 = id_finally(var1);
      return this.id_class(var2).id_class() && this.M();
   }

   protected float id_throws(rXQ var1) {
      return switch (var1.id_class()) {
         case HAND -> this.id_new[var1.id_break()];
         case ARMOR -> this.id_continue[var1.id_break()];
         default -> 0.0F;
      };
   }

   private void L() {
      if (this.id_throw != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
         if (this.id_throw.id_break("UUID")) {
            UUID var1 = this.id_throw.id_class("UUID");
            an_3 var2 = ((rrEm_1)((rYB)this.id_throws[7])).id_break(var1);
            if (var2 != null) {
               this.id_break(var2, true);
               return;
            }
         } else if (this.id_throw.id_byte("X", 99) && this.id_throw.id_byte("Y", 99) && this.id_throw.id_byte("Z", 99)) {
            rfH_2 var3 = new rfH_2(this.id_throw.id_private("X"), this.id_throw.id_private("Y"), this.id_throw.id_private("Z"));
            this.id_break(rsM_2.id_class((rYB)this.id_throws[7], var3), true);
            return;
         }

         if ((Integer)this.id_throws[41] > 100) {
            this.id_class(rdy_3.df);
            this.id_throw = null;
         }
      }
   }

   @Override
   public boolean Po() {
      return this.G() && super.Po();
   }

   @Override
   protected void Pi() {
      super.Pi();
      this.id_class(true, false);
   }

   public boolean M() {
      return this.id_synchronized;
   }

   public static rXQ id_finally(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      if (var1 != xu_3.Br.id_case() && (!(var1 instanceof rxJ_2) || !(((rxJ_2)var1).id_catch() instanceof JU))) {
         if (var1 instanceof rxS_2) {
            return ((rxS_2)var1).id_byte();
         } else if (var1 == rdy_3.kc) {
            return rXQ.CHEST;
         } else {
            return var0.id_break() == rdy_3.kN ? rXQ.OFFHAND : rXQ.MAINHAND;
         }
      } else {
         return rXQ.HEAD;
      }
   }

   public boolean id_catch(rdn_3 var1) {
      rXQ var2 = id_finally(var1);
      rdn_3 var3 = this.id_class(var2);
      boolean var4 = this.id_class(var1, var3);
      if (var4 && this.id_private(var1)) {
         double var5 = (double)this.id_throws(var2);
         if (!var3.id_class() && (double)Math.max(((Random)this.id_throws[40]).nextFloat() - 0.1F, 0.0F) < var5) {
            this.a_(var3);
         }

         this.id_break(var2, var1);
         this.id_break(var1);
         return true;
      } else {
         return false;
      }
   }

   public void id_catch(float var1) {
      Float var6 = var1;
      this.id_private[44] = var6;
   }

   @Override
   public boolean id_catch(iB_2 var1) {
      return var1.BC() == aI_2.rM && ((rhx_3)((rhd_3)var1).id_implements[18]).id_class ? false : super.id_catch(var1);
   }

   public boolean G() {
      return false;
   }

   public boolean O() {
      return this.id_return;
   }

   public ih_3 id_goto() {
      return this.id_super;
   }

   public void id_case(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1 ? (byte)(var2 | 4) : (byte)(var2 & -5));
   }

   public boolean id_continue(int var1) {
      return false;
   }

   public rPR id_continue() {
      return this.id_extends;
   }

   public rPg_1 id_else() {
      return this.id_volatile;
   }

   protected void id_for() {
      ruP_2.id_class((rYB)this.id_throws[7], this, this.id_package);
   }

   private void id_implements() {
      this.id_implements = -this.id_char();
   }

   public boolean id_implements(rdn_3 var1) {
      return this.id_private(var1);
   }

   public void id_instanceof() {
   }

   protected void id_instanceof(float var1) {
      if (!this.ss().id_class() && ((Random)this.id_throws[40]).nextFloat() < 0.25F * var1) {
         this.id_class(
            rXQ.MAINHAND, eA_2.id_class((Random)this.id_throws[40], this.ss(), (int)(5.0F + var1 * (float)((Random)this.id_throws[40]).nextInt(18)), false)
         );
      }
   }

   protected rPf_1 id_new() {
      return new rPf_1(this);
   }

   public static iz_3 id_package() {
      return iB_2.SD().id_class(iQ_2.id_break, 16.0).id_class(iQ_2.id_catch);
   }

   public void id_super(int var1) {
      this.id_instanceof = var1;
      this.id_class(false, false);
   }

   public rPY id_super() {
      if (this.Pm() && this.ra() instanceof is_3) {
         is_3 var1 = (is_3)this.ra();
         return var1.id_super();
      } else {
         return this.id_native;
      }
   }

   @Override
   public void id_super(float var1) {
      super.id_super(var1);
      this.id_catch(var1);
   }

   public void id_try(float var1) {
      Float var6 = var1;
      this.id_private[42] = var6;
   }

   @Override
   public boolean id_try() {
      return super.id_try() && !this.c();
   }

   public void id_while(float var1) {
      Float var6 = var1;
      this.id_private[43] = var6;
   }

   @Override
   public Iterable<rdn_3> rs() {
      return this.id_this;
   }

   protected rqA_2 id_static() {
      return null;
   }

   public rLy_1 id_public() {
      if (this.Pm() && this.ra() instanceof is_3) {
         is_3 var1 = (is_3)this.ra();
         return var1.id_public();
      } else {
         return this.id_final;
      }
   }

   @Override
   public boolean id_public(an_3 var1) {
      float var2 = (float)this.id_class(iQ_2.id_case);
      float var3 = (float)this.id_class(iQ_2.id_catch);
      if (var1 instanceof iB_2) {
         var2 += eA_2.id_class(this.ss(), ((iB_2)var1).sG());
         var3 += (float)eA_2.id_break(this);
      }

      int var4 = eA_2.id_byte(this);
      if (var4 > 0) {
         var1.id_case(var4 * 4);
      }

      boolean var5 = var1.id_break(rye_3.id_byte(this), var2);
      if (var5) {
         if (var3 > 0.0F && var1 instanceof iB_2) {
            ((iB_2)var1)
               .id_class(
                  var3 * 0.5F,
                  (double)rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0)),
                  (double)(-rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0)))
               );
            this.id_byte(this.rv().id_throws(0.6, 1.0, 0.6));
         }

         if (var1 instanceof rhd_3 var6) {
            this.id_class(var6, this.ss(), var6.id_return() ? var6.sX() : rdn_3.id_break);
         }

         this.id_class(this, var1);
         this.id_try(var1);
      }

      return var5;
   }

   public void id_protected(rXQ var1) {
      switch (var1.id_class()) {
         case HAND:
            this.id_new[var1.id_break()] = 2.0F;
            break;
         case ARMOR:
            this.id_continue[var1.id_break()] = 2.0F;
      }
   }

   public boolean id_protected(rhd_3 var1) {
      return !this.z() && !(this instanceof rEK);
   }

   public void id_protected(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1 ? (byte)(var2 | 1) : (byte)(var2 & -2));
   }

   public boolean id_private(rfH_2 var1) {
      return this.id_char == -1.0F ? true : this.id_interface.id_private(var1) < (double)(this.id_char * this.id_char);
   }

   @Override
   protected void id_private() {
      if (this.id_throw != null) {
         this.L();
      }

      if (this.id_try != null && (!this.BM() || !this.id_try.BM())) {
         this.id_class(true, true);
      }
   }

   public boolean id_private(double var1) {
      return true;
   }

   public boolean id_private(rdn_3 var1) {
      return true;
   }

   @Override
   protected void id_final() {
   }

   public boolean id_strictfp() {
      return this.Pm();
   }

   public int E() {
      return 4;
   }

   @Override
   public int rp() {
      if (this.I_() == null) {
         return 3;
      } else {
         int var1 = (int)(this.Ss() - this.SK() * 0.33F);
         var1 -= (3 - ((rYB)this.id_throws[7]).id_abstract().id_class()) * 4;
         if (var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   public boolean X() {
      return this.id_private(this.Bs());
   }

   @Override
   protected final void Q() {
      Integer var5 = (Integer)this.id_private[33] + 1;
      this.id_private[33] = var5;
      this.id_super.id_class();
      this.id_int.id_class();
      this.id_package.id_class();
      this.id_final.id_class();
      this.id_double();
      this.id_native.id_class();
      this.id_extends.id_class();
      this.id_volatile.id_break();
      this.id_for();
   }

   public iB_2 I_() {
      return this.id_protected;
   }

   @Override
   public void Pn() {
      super.Pn();
      if (this.BM() && ((Random)this.id_throws[40]).nextInt(1000) < this.id_implements++) {
         this.id_implements();
         this.id_long();
      }
   }

   @Override
   public void rA() {
      if (((rYB)this.id_throws[7]).id_abstract() == rRO.PEACEFUL && this.id_boolean()) {
         this.PD();
      } else if (!this.O() && !this.id_strictfp()) {
         rhd_3 var1 = ((rYB)this.id_throws[7]).id_class(this, -1.0);
         if (var1 != null) {
            double var2 = var1.id_int(this);
            int var4 = this.BC().id_throws().id_case();
            int var5 = var4 * var4;
            if (var2 > (double)var5 && this.id_private(var2)) {
               this.PD();
            }

            int var6 = this.BC().id_throws().id_catch();
            int var7 = var6 * var6;
            if ((Integer)this.id_private[33] > 600 && ((Random)this.id_throws[40]).nextInt(800) == 0 && var2 > (double)var7 && this.id_private(var2)) {
               this.PD();
            } else if (var2 < (double)var7) {
               Integer var12 = 0;
               this.id_private[33] = var12;
            }
         }
      } else {
         Integer var13 = 0;
         this.id_private[33] = var13;
      }
   }

   @Override
   public Iterable<rdn_3> PV() {
      return this.id_else;
   }

   @Override
   public final rqO_2 By() {
      return this.id_goto == null ? this.id_short() : this.id_goto;
   }

   private void sJ() {
      Integer var7 = (Integer)this.id_private[33] + 1;
      this.id_private[33] = var7;
      if (this instanceof rEi_1) {
         float var1 = this.rX();
         boolean var2 = this instanceof rEB;
         if (var1 > 0.5F || var2) {
            Integer var8 = (Integer)this.id_private[33] + 2;
            this.id_private[33] = var8;
         }
      }
   }

   @Override
   public rpZ_2 Su() {
      return this.Z() ? rpZ_2.LEFT : rpZ_2.RIGHT;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
   }
}
