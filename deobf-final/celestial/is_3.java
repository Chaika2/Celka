package celestial;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public abstract class is_3 extends iB_2 {
   private static final rut_3<Byte> class_ = rmE_2.class_(is_3.class, ruw_3.class_);
   public int implements_;
   protected int finally_;
   protected rPR extends_;
   protected rPY native_;
   protected rPg_1 volatile_;
   private final rPf_1 break_;
   protected rLy_1 final_;
   protected final rBz_1 package_;
   protected final rBz_1 int_;
   private iB_2 protected_;
   private final ih_3 super_;
   private final rqs_3<rdn_3> this_ = rqs_3.class_(2, rdn_3.break_);
   protected final float[] new_ = new float[2];
   private final rqs_3<rdn_3> else_ = rqs_3.class_(4, rdn_3.break_);
   protected final float[] continue_ = new float[4];
   private boolean synchronized_;
   private boolean return_;
   private final Map<rLp_1, Float> public_ = Maps.newEnumMap(rLp_1.class);
   private rqO_2 goto_;
   private long while_;
   private an_3 try_;
   private int instanceof_;
   private rcd_3 throw_;
   private rfH_2 interface_ = rfH_2.protected_;
   private float char_ = -1.0F;

   protected boolean boolean_() {
      return false;
   }

   public int char_() {
      return 80;
   }

   private ryZ_2 byte_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.df && this.protected_(var1)) {
         this.break_(var1, true);
         var3.catch_(1);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         if (var3.break_() == rdy_3.dj) {
            ryZ_2 var4 = var3.class_(var1, this, var2);
            if (var4.class_()) {
               return var4;
            }
         }

         if (var3.break_() instanceof rkO_2) {
            if ((rYB)this.throws_[7] instanceof rrEm_1) {
               rkO_2 var6 = (rkO_2)var3.break_();
               Optional var5 = var6.class_(var1, this, (aI_2<? extends is_3>)this.BC(), (rrEm_1)((rYB)this.throws_[7]), this.Ps(), var3);
               var5.ifPresent(var2x -> this.class_(var1, var2x));
               return var5.isPresent() ? ryZ_2.SUCCESS : ryZ_2.PASS;
            } else {
               return ryZ_2.CONSUME;
            }
         } else {
            return ryZ_2.PASS;
         }
      }
   }

   public void byte_(boolean var1) {
      this.synchronized_ = var1;
   }

   public void byte_(iB_2 var1) {
      this.protected_ = var1;
      rrxr_3.class_(rrxr_3.rE, this, var1);
   }

   @Override
   protected int byte_(rhd_3 var1) {
      if (this.finally_ > 0) {
         int var2 = this.finally_;

         for (int var3 = 0; var3 < this.else_.size(); var3++) {
            if (!this.else_.get(var3).class_() && this.continue_[var3] <= 1.0F) {
               var2 += 1 + ((Random)this.throws_[40]).nextInt(3);
            }
         }

         for (int var4 = 0; var4 < this.this_.size(); var4++) {
            if (!this.this_.get(var4).class_() && this.new_[var4] <= 1.0F) {
               var2 += 1 + ((Random)this.throws_[40]).nextInt(3);
            }
         }

         return var2;
      } else {
         return this.finally_;
      }
   }

   @Override
   protected void byte_(rlb_3<rXs_1> var1) {
      if (this.public_().new_()) {
         super.byte_(var1);
      } else {
         this.byte_(this.rv().break_(0.0, 0.3, 0.0));
      }
   }

   public static boolean byte_(rXQ var0, rdn_3 var1) {
      rXQ var2 = finally_(var1);
      return var2 == var0 || var2 == rXQ.MAINHAND && var0 == rXQ.OFFHAND || var2 == rXQ.OFFHAND && var0 == rXQ.MAINHAND;
   }

   private float byte_(float var1, float var2, float var3) {
      float var4 = rfU_2.catch_(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   private List byte_(rYB var1) {
      rYB var2 = this.e();
      if (var2 instanceof gm_3 var4) {
         return var4.continue_();
      } else {
         return var2 instanceof rrEm_1 var3 ? var3.continue_() : null;
      }
   }

   @Override
   protected boolean int_() {
      return false;
   }

   public void long_() {
      rqA_2 var1 = this.static_();
      if (var1 != null) {
         this.class_(var1, this.Si(), this.SN());
      }
   }

   public void float_() {
      if (((rYB)this.throws_[7]).continue_) {
         for (int var1 = 0; var1 < 20; var1++) {
            double var2 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var4 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var6 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var8 = 10.0;
            ((rYB)this.throws_[7])
               .class_(rLQ.boolean_, this.catch_(1.0) - var2 * 10.0, this.Ph() - var4 * 10.0, this.protected_(1.0) - var6 * 10.0, var2, var4, var6);
         }
      } else {
         ((rYB)this.throws_[7]).class_(this, (byte)20);
      }
   }

   protected void double_() {
   }

   protected is_3(aI_2<? extends is_3> var1, rYB var2) {
      super(var1, var2);
      this.package_ = new rBz_1();
      this.int_ = new rBz_1();
      this.extends_ = new rPR(this);
      this.native_ = new rPY(this);
      this.volatile_ = new rPg_1(this);
      this.break_ = this.new_();
      this.final_ = this.break_(var2);
      this.super_ = new ih_3(this);
      Arrays.fill(this.continue_, 0.085F);
      Arrays.fill(this.new_, 0.085F);
      if (var2 != null && !var2.continue_) {
         this.final_();
      }
   }

   protected boolean F() {
      if (((rYB)this.throws_[7]).strictfp_() && !((rYB)this.throws_[7]).continue_) {
         float var1 = this.rX();
         rfH_2 var2 = this.ra() instanceof rSK
            ? new rfH_2(this.rx(), (double)Math.round(this.re()), this.BO()).final_()
            : new rfH_2(this.rx(), (double)Math.round(this.re()), this.BO());
         if (var1 > 0.5F && ((Random)this.throws_[40]).nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && ((rYB)this.throws_[7]).case_(var2)) {
            return true;
         }
      }

      return false;
   }

   public rfH_2 J() {
      return this.interface_;
   }

   public int S() {
      return 75;
   }

   public boolean Z() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 2) != 0;
   }

   @Override
   public void this_() {
      if (rrbb_3.rO() && this.n()) {
         this.sJ();
      } else {
         super.this_();
         if (!((rYB)this.throws_[7]).continue_) {
            this.private_();
            if ((Integer)this.throws_[41] % 5 == 0) {
               this.void_();
            }
         }
      }
   }

   public void b() {
      this.return_ = true;
   }

   public int s() {
      return 10;
   }

   public boolean c() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 1) != 0;
   }

   private boolean n() {
      if (this.n_()) {
         return false;
      } else if ((Integer)this.private_[10] > 0) {
         return false;
      } else if ((Integer)this.throws_[41] < 20) {
         return false;
      } else {
         List var1 = this.byte_(this.e());
         if (var1 == null) {
            return false;
         } else if (var1.size() != 1) {
            return false;
         } else {
            an_3 var2 = (an_3)var1.get(0);
            double var3 = Math.max(Math.abs(this.rx() - var2.rx()) - 16.0, 0.0);
            double var5 = Math.max(Math.abs(this.BO() - var2.BO()) - 16.0, 0.0);
            double var7 = var3 * var3 + var5 * var5;
            return !this.class_(var7);
         }
      }
   }

   public float d() {
      return this.char_;
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);

      for (rXQ var7 : rXQ.values()) {
         rdn_3 var8 = this.class_(var7);
         float var9 = this.throws_(var7);
         boolean var10 = var9 > 1.0F;
         if (!var8.class_() && !eA_2.throws_(var8) && (var3 || var10) && Math.max(((Random)this.throws_[40]).nextFloat() - (float)var2 * 0.01F, 0.0F) < var9) {
            if (!var10 && var8.throws_()) {
               var8.break_(var8.private_() - ((Random)this.throws_[40]).nextInt(1 + ((Random)this.throws_[40]).nextInt(Math.max(var8.private_() - 3, 1))));
            }

            this.a_(var8);
            this.class_(var7, rdn_3.break_);
         }
      }
   }

   protected void class_(rRh_1 var1) {
      if (((Random)this.throws_[40]).nextFloat() < 0.15F * var1.byte_()) {
         int var2 = ((Random)this.throws_[40]).nextInt(2);
         float var3 = ((rYB)this.throws_[7]).abstract_() == rRO.HARD ? 0.1F : 0.25F;
         if (((Random)this.throws_[40]).nextFloat() < 0.095F) {
            var2++;
         }

         if (((Random)this.throws_[40]).nextFloat() < 0.095F) {
            var2++;
         }

         if (((Random)this.throws_[40]).nextFloat() < 0.095F) {
            var2++;
         }

         boolean var4 = true;

         for (rXQ var8 : rXQ.values()) {
            if (var8.class_() == rXN.ARMOR) {
               rdn_3 var9 = this.class_(var8);
               if (!var4 && ((Random)this.throws_[40]).nextFloat() < var3) {
                  break;
               }

               var4 = false;
               if (var9.class_()) {
                  rdb_3 var10 = class_(var8, var2);
                  if (var10 != null) {
                     this.class_(var8, new rdn_3(var10));
                  }
               }
            }
         }
      }
   }

   public static rdb_3 class_(rXQ var0, int var1) {
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

   protected void class_(float var1, rXQ var2) {
      rdn_3 var3 = this.class_(var2);
      if (!var3.class_() && ((Random)this.throws_[40]).nextFloat() < 0.5F * var1) {
         this.class_(var2, eA_2.class_((Random)this.throws_[40], var3, (int)(5.0F + var1 * (float)((Random)this.throws_[40]).nextInt(18)), false));
      }
   }

   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.byte_(iQ_2.break_).byte_(new ix_3("Random spawn bonus", ((Random)this.throws_[40]).nextGaussian() * 0.05, id_3.MULTIPLY_BASE));
      if (((Random)this.throws_[40]).nextFloat() < 0.05F) {
         this.throws_(true);
      } else {
         this.throws_(false);
      }

      return var4;
   }

   public boolean class_(rRR var1) {
      return !var1.protected_(this.rN()) && var1.protected_(this);
   }

   public boolean class_(rRg_1 var1, iO_2 var2) {
      return true;
   }

   public static boolean class_(aI_2<? extends is_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      rfH_2 var5 = var3.break_();
      return var2 == iO_2.SPAWNER || var1.byte_(var5).class_(var1, var5, var0);
   }

   public void class_(an_3 var1, float var2, float var3) {
      double var4 = var1.rx() - this.rx();
      double var6 = var1.BO() - this.BO();
      double var8;
      if (var1 instanceof iB_2 var10) {
         var8 = var10.rH() - this.rH();
      } else {
         var8 = (var1.rN().break_ + var1.rN().throws_) / 2.0 - this.rH();
      }

      double var20 = (double)rfU_2.class_(var4 * var4 + var6 * var6);
      float var12 = (float)(rfU_2.protected_(var6, var4) * 180.0F / (float)Math.PI) - 90.0F;
      float var13 = (float)(-(rfU_2.protected_(var8, var20) * 180.0F / (float)Math.PI));
      Float var18 = this.byte_((Float)this.throws_[16], var13, var3);
      this.throws_[16] = var18;
      Float var19 = this.byte_((Float)this.throws_[15], var12, var2);
      this.throws_[15] = var19;
   }

   @Override
   public rdn_3 class_(rXQ var1) {
      switch (var1.class_()) {
         case HAND:
            return this.this_.get(var1.break_());
         case ARMOR:
            return this.else_.get(var1.break_());
         default:
            return rdn_3.break_;
      }
   }

   @Override
   public void class_(rXQ var1, rdn_3 var2) {
      switch (var1.class_()) {
         case HAND:
            this.this_.set(var1.break_(), var2);
            break;
         case ARMOR:
            this.else_.set(var1.break_(), var2);
      }
   }

   public <T extends is_3> T class_(aI_2<T> var1, boolean var2) {
      if ((Boolean)this.throws_[27]) {
         return null;
      } else {
         is_3 var3 = (is_3)var1.class_((rYB)this.throws_[7]);
         var3.native_(this);
         var3.class_(this.n_());
         var3.protected_(this.c());
         if (this.Bk()) {
            var3.break_(this.rD());
            var3.final_(this.D());
         }

         if (this.O()) {
            var3.b();
         }

         var3.catch_(this.rg());
         if (var2) {
            var3.byte_(this.M());

            for (rXQ var7 : rXQ.values()) {
               rdn_3 var8 = this.class_(var7);
               if (!var8.class_()) {
                  var3.class_(var7, var8.implements_());
                  var3.class_(var7, this.throws_(var7));
                  var8.throws_(0);
               }
            }
         }

         ((rYB)this.throws_[7]).a_(var3);
         if (this.Pm()) {
            an_3 var9 = this.ra();
            this.BH();
            var3.class_(var9, true);
         }

         this.PD();
         return (T)var3;
      }
   }

   public void class_(boolean var1, boolean var2) {
      if (this.try_ != null) {
         Boolean var7 = false;
         this.throws_[6] = var7;
         if (!(this.try_ instanceof rhd_3)) {
            an_3 var10000 = this.try_;
            Boolean var8 = false;
            var10000.throws_[6] = var8;
         }

         this.try_ = null;
         this.throw_ = null;
         if (!((rYB)this.throws_[7]).continue_ && var2) {
            this.class_(rdy_3.df);
         }

         if (!((rYB)this.throws_[7]).continue_ && var1 && (rYB)this.throws_[7] instanceof rrEm_1) {
            ((rrEm_1)((rYB)this.throws_[7])).else_().break_(this, new rvA_2(this, (an_3)null));
         }
      }
   }

   @Override
   public boolean class_(an_3 var1, boolean var2) {
      boolean var3 = super.class_(var1, var2);
      if (var3 && this.z()) {
         this.class_(true, true);
      }

      return var3;
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      rXQ var3;
      if (var1 == 98) {
         var3 = rXQ.MAINHAND;
      } else if (var1 == 99) {
         var3 = rXQ.OFFHAND;
      } else if (var1 == 100 + rXQ.HEAD.break_()) {
         var3 = rXQ.HEAD;
      } else if (var1 == 100 + rXQ.CHEST.break_()) {
         var3 = rXQ.CHEST;
      } else if (var1 == 100 + rXQ.LEGS.break_()) {
         var3 = rXQ.LEGS;
      } else {
         if (var1 != 100 + rXQ.FEET.break_()) {
            return false;
         }

         var3 = rXQ.FEET;
      }

      if (!var2.class_() && !byte_(var3, var2) && var3 != rXQ.HEAD) {
         return false;
      } else {
         this.class_(var3, var2);
         return true;
      }
   }

   public void class_(boolean var1) {
   }

   private void class_(rhd_3 var1, rdn_3 var2, rdn_3 var3) {
      if (!var2.class_() && !var3.class_() && var2.break_() instanceof rxM_2 && var3.break_() == rdy_3.kN) {
         float var4 = 0.25F + (float)eA_2.case_(this) * 0.05F;
         if (((Random)this.throws_[40]).nextFloat() < var4) {
            var1.sK().class_(rdy_3.kN, 100);
            ((rYB)this.throws_[7]).class_(var1, (byte)30);
         }
      }
   }

   public void class_(rXQ var1, float var2) {
      switch (var1.class_()) {
         case HAND:
            this.new_[var1.break_()] = var2;
            break;
         case ARMOR:
            this.continue_[var1.break_()] = var2;
      }
   }

   public void class_(rLp_1 var1, float var2) {
      this.public_.put(var1, var2);
   }

   @Override
   public final ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      if (!this.BM()) {
         return ryZ_2.PASS;
      } else if (this.N() == var1) {
         this.class_(true, !((rhx_3)var1.implements_[18]).protected_);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         ryZ_2 var3 = this.byte_(var1, var2);
         if (var3.class_()) {
            return var3;
         } else {
            var3 = this.break_(var1, var2);
            return var3.class_() ? var3 : super.class_(var1, var2);
         }
      }
   }

   public float class_(rLp_1 var1) {
      is_3 var2;
      if (this.ra() instanceof is_3 && ((is_3)this.ra()).int_()) {
         var2 = (is_3)this.ra();
      } else {
         var2 = this;
      }

      Float var3 = var2.public_.get(var1);
      return var3 == null ? var1.class_() : var3;
   }

   protected void class_(rhd_3 var1, is_3 var2) {
   }

   public void class_(rfH_2 var1, int var2) {
      this.interface_ = var1;
      this.char_ = (float)var2;
   }

   public boolean class_(rkB_2 var1) {
      return false;
   }

   @Override
   protected void class_(rye_3 var1, boolean var2) {
      super.class_(var1, var2);
      this.goto_ = null;
   }

   @Override
   protected rzP_2 class_(boolean var1, rye_3 var2) {
      return super.class_(var1, var2).class_(this.while_, (Random)this.throws_[40]);
   }

   protected boolean class_(rdn_3 var1, rdn_3 var2) {
      if (var2.class_()) {
         return true;
      } else if (var1.break_() instanceof rkx_3) {
         if (!(var2.break_() instanceof rkx_3)) {
            return true;
         } else {
            rkx_3 var6 = (rkx_3)var1.break_();
            rkx_3 var8 = (rkx_3)var2.break_();
            return var6.catch_() != var8.catch_() ? var6.catch_() > var8.catch_() : this.break_(var1, var2);
         }
      } else if (var1.break_() instanceof rxQ_2 && var2.break_() instanceof rxQ_2) {
         return this.break_(var1, var2);
      } else if (var1.break_() instanceof rxm_3 && var2.break_() instanceof rxm_3) {
         return this.break_(var1, var2);
      } else if (var1.break_() instanceof rxS_2) {
         if (eA_2.protected_(var2)) {
            return false;
         } else if (!(var2.break_() instanceof rxS_2)) {
            return true;
         } else {
            rxS_2 var5 = (rxS_2)var1.break_();
            rxS_2 var7 = (rxS_2)var2.break_();
            if (var5.catch_() != var7.catch_()) {
               return var5.catch_() > var7.catch_();
            } else {
               return var5.private_() != var7.private_() ? var5.private_() > var7.private_() : this.break_(var1, var2);
            }
         }
      } else {
         if (var1.break_() instanceof rkQ_2) {
            if (var2.break_() instanceof rxJ_2) {
               return true;
            }

            if (var2.break_() instanceof rkQ_2) {
               rkQ_2 var3 = (rkQ_2)var1.break_();
               rkQ_2 var4 = (rkQ_2)var2.break_();
               if (var3.catch_() != var4.catch_()) {
                  return var3.catch_() > var4.catch_();
               }

               return this.break_(var1, var2);
            }
         }

         return false;
      }
   }

   @Override
   public boolean class_(aI_2<?> var1) {
      return var1 != aI_2.interface_;
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 20) {
         this.float_();
      } else {
         super.class_(var1);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("CanPickUpLoot", this.M());
      var1.class_("PersistenceRequired", this.return_);
      rcy_3 var2 = new rcy_3();

      for (rdn_3 var4 : this.else_) {
         rcd_3 var5 = new rcd_3();
         if (!var4.class_()) {
            var4.break_(var5);
         }

         var2.add(var5);
      }

      var1.class_("ArmorItems", var2);
      rcy_3 var10 = new rcy_3();

      for (rdn_3 var13 : this.this_) {
         rcd_3 var6 = new rcd_3();
         if (!var13.class_()) {
            var13.break_(var6);
         }

         var10.add(var6);
      }

      var1.class_("HandItems", var10);
      rcy_3 var12 = new rcy_3();

      for (float var8 : this.continue_) {
         var12.add(rcu_3.class_(var8));
      }

      var1.class_("ArmorDropChances", var12);
      rcy_3 var15 = new rcy_3();

      for (float var9 : this.new_) {
         var15.add(rcu_3.class_(var9));
      }

      var1.class_("HandDropChances", var15);
      if (this.try_ != null) {
         rcd_3 var18 = new rcd_3();
         if (this.try_ instanceof iB_2) {
            UUID var20 = this.try_.ro();
            var18.class_("UUID", var20);
         } else if (this.try_ instanceof rsS_2) {
            rfH_2 var21 = ((rsS_2)this.try_).implements_();
            var18.break_("X", var21.b_());
            var18.break_("Y", var21.c_());
            var18.break_("Z", var21.d_());
         }

         var1.class_("Leash", var18);
      } else if (this.throw_ != null) {
         var1.class_("Leash", this.throw_.catch_());
      }

      var1.class_("LeftHanded", this.Z());
      if (this.goto_ != null) {
         var1.class_("DeathLootTable", this.goto_.toString());
         if (this.while_ != 0L) {
            var1.class_("DeathLootTableSeed", this.while_);
         }
      }

      if (this.c()) {
         var1.class_("NoAI", this.c());
      }
   }

   public boolean k() {
      return this.char_ != -1.0F;
   }

   @Override
   public void default_() {
      super.default_();
      boolean var1 = ((rYB)this.throws_[7]).B().break_(rRu_1.break_);
      if (rrxr_3.g.byte_()) {
         var1 = rrxr_3.break_(rrxr_3.g, (rYB)this.throws_[7], this);
      }

      if (!((rYB)this.throws_[7]).continue_ && this.M() && this.BM() && !(Boolean)this.private_[32] && var1) {
         for (rsE_2 var3 : ((rYB)this.throws_[7]).class_(rsE_2.class, this.rN().byte_(1.0, 0.0, 1.0))) {
            if (!(Boolean)var3.throws_[27] && !var3.protected_().class_() && !var3.package_() && this.implements_(var3.protected_())) {
               this.break_(var3);
            }
         }
      }
   }

   public boolean v() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 4) != 0;
   }

   protected rqO_2 short_() {
      return super.By();
   }

   public boolean z() {
      return this.try_ != null;
   }

   @Override
   protected void void_() {
      boolean var1 = !(this.rU() instanceof is_3);
      boolean var2 = !(this.ra() instanceof rSK);
      this.package_.class_(rBW.MOVE, var1);
      this.package_.class_(rBW.JUMP, var1 && var2);
      this.package_.class_(rBW.LOOK, var1);
   }

   public int r() {
      return 40;
   }

   public an_3 N() {
      if (this.try_ == null && this.instanceof_ != 0 && ((rYB)this.throws_[7]).continue_) {
         this.try_ = ((rYB)this.throws_[7]).break_(this.instanceof_);
      }

      return this.try_;
   }

   public void break_(an_3 var1, boolean var2) {
      this.try_ = var1;
      this.throw_ = null;
      Boolean var7 = true;
      this.throws_[6] = var7;
      if (!(this.try_ instanceof rhd_3)) {
         an_3 var10000 = this.try_;
         Boolean var8 = true;
         var10000.throws_[6] = var8;
      }

      if (!((rYB)this.throws_[7]).continue_ && var2 && (rYB)this.throws_[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.throws_[7])).else_().break_(this, new rvA_2(this, this.try_));
      }

      if (this.Pm()) {
         this.BH();
      }
   }

   protected void break_(rsE_2 var1) {
      rdn_3 var2 = var1.protected_();
      if (this.catch_(var2)) {
         this.class_(var1);
         this.class_(var1, var2.char_());
         var1.PD();
      }
   }

   protected void break_(rRh_1 var1) {
      float var2 = var1.byte_();
      this.instanceof_(var2);

      for (rXQ var6 : rXQ.values()) {
         if (var6.class_() == rXN.ARMOR) {
            this.class_(var2, var6);
         }
      }
   }

   @Override
   protected float break_(float var1, float var2, float var3) {
      this.break_.class_();
      return var2;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("CanPickUpLoot", 1)) {
         this.byte_(var1.new_("CanPickUpLoot"));
      }

      this.return_ = var1.new_("PersistenceRequired");
      if (var1.byte_("ArmorItems", 9)) {
         rcy_3 var2 = var1.protected_("ArmorItems", 10);

         for (int var3 = 0; var3 < this.else_.size(); var3++) {
            this.else_.set(var3, rdn_3.class_(var2.class_(var3)));
         }
      }

      if (var1.byte_("HandItems", 9)) {
         rcy_3 var4 = var1.protected_("HandItems", 10);

         for (int var7 = 0; var7 < this.this_.size(); var7++) {
            this.this_.set(var7, rdn_3.class_(var4.class_(var7)));
         }
      }

      if (var1.byte_("ArmorDropChances", 9)) {
         rcy_3 var5 = var1.protected_("ArmorDropChances", 5);

         for (int var8 = 0; var8 < var5.size(); var8++) {
            this.continue_[var8] = var5.private_(var8);
         }
      }

      if (var1.byte_("HandDropChances", 9)) {
         rcy_3 var6 = var1.protected_("HandDropChances", 5);

         for (int var9 = 0; var9 < var6.size(); var9++) {
            this.new_[var9] = var6.private_(var9);
         }
      }

      if (var1.byte_("Leash", 10)) {
         this.throw_ = var1.int_("Leash");
      }

      this.throws_(var1.new_("LeftHanded"));
      if (var1.byte_("DeathLootTable", 8)) {
         this.goto_ = new rqO_2(var1.native_("DeathLootTable"));
         this.while_ = var1.implements_("DeathLootTableSeed");
      }

      this.protected_(var1.new_("NoAI"));
   }

   protected rLy_1 break_(rYB var1) {
      return new rLA(this, var1);
   }

   @Override
   protected void break_(rXQ var1, rdn_3 var2) {
      this.class_(var1, var2);
      this.protected_(var1);
      this.return_ = true;
   }

   public boolean break_(rdn_3 var1, rdn_3 var2) {
      if (var1.catch_() >= var2.catch_() && (!var1.final_() || var2.final_())) {
         return var1.final_() && var2.final_()
            ? var1.package_().protected_().stream().anyMatch(var0 -> !var0.equals("Damage"))
               && !var2.package_().protected_().stream().anyMatch(var0 -> !var0.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean break_(rLp_1 var1) {
      return var1 != rLp_1.DANGER_FIRE && var1 != rLp_1.DANGER_CACTUS && var1 != rLp_1.DANGER_OTHER && var1 != rLp_1.WALKABLE_DOOR;
   }

   protected ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      return ryZ_2.PASS;
   }

   public void throws_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      ((rmE_2)this.throws_[49]).break_(class_, var1 ? (byte)(var2 | 2) : (byte)(var2 & -3));
   }

   @Override
   protected void throws_(rye_3 var1) {
      this.implements_();
      super.throws_(var1);
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      rXQ var2 = finally_(var1);
      return this.class_(var2).class_() && this.M();
   }

   protected float throws_(rXQ var1) {
      return switch (var1.class_()) {
         case HAND -> this.new_[var1.break_()];
         case ARMOR -> this.continue_[var1.break_()];
         default -> 0.0F;
      };
   }

   private void L() {
      if (this.throw_ != null && (rYB)this.throws_[7] instanceof rrEm_1) {
         if (this.throw_.break_("UUID")) {
            UUID var1 = this.throw_.class_("UUID");
            an_3 var2 = ((rrEm_1)((rYB)this.throws_[7])).break_(var1);
            if (var2 != null) {
               this.break_(var2, true);
               return;
            }
         } else if (this.throw_.byte_("X", 99) && this.throw_.byte_("Y", 99) && this.throw_.byte_("Z", 99)) {
            rfH_2 var3 = new rfH_2(this.throw_.private_("X"), this.throw_.private_("Y"), this.throw_.private_("Z"));
            this.break_(rsM_2.class_((rYB)this.throws_[7], var3), true);
            return;
         }

         if ((Integer)this.throws_[41] > 100) {
            this.class_(rdy_3.df);
            this.throw_ = null;
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
      this.class_(true, false);
   }

   public boolean M() {
      return this.synchronized_;
   }

   public static rXQ finally_(rdn_3 var0) {
      rdb_3 var1 = var0.break_();
      if (var1 != xu_3.Br.case_() && (!(var1 instanceof rxJ_2) || !(((rxJ_2)var1).catch_() instanceof JU))) {
         if (var1 instanceof rxS_2) {
            return ((rxS_2)var1).byte_();
         } else if (var1 == rdy_3.kc) {
            return rXQ.CHEST;
         } else {
            return var0.break_() == rdy_3.kN ? rXQ.OFFHAND : rXQ.MAINHAND;
         }
      } else {
         return rXQ.HEAD;
      }
   }

   public boolean catch_(rdn_3 var1) {
      rXQ var2 = finally_(var1);
      rdn_3 var3 = this.class_(var2);
      boolean var4 = this.class_(var1, var3);
      if (var4 && this.private_(var1)) {
         double var5 = (double)this.throws_(var2);
         if (!var3.class_() && (double)Math.max(((Random)this.throws_[40]).nextFloat() - 0.1F, 0.0F) < var5) {
            this.a_(var3);
         }

         this.break_(var2, var1);
         this.break_(var1);
         return true;
      } else {
         return false;
      }
   }

   public void catch_(float var1) {
      Float var6 = var1;
      this.private_[44] = var6;
   }

   @Override
   public boolean catch_(iB_2 var1) {
      return var1.BC() == aI_2.rM && ((rhx_3)((rhd_3)var1).implements_[18]).class_ ? false : super.catch_(var1);
   }

   public boolean G() {
      return false;
   }

   public boolean O() {
      return this.return_;
   }

   public ih_3 goto_() {
      return this.super_;
   }

   public void case_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      ((rmE_2)this.throws_[49]).break_(class_, var1 ? (byte)(var2 | 4) : (byte)(var2 & -5));
   }

   public boolean continue_(int var1) {
      return false;
   }

   public rPR continue_() {
      return this.extends_;
   }

   public rPg_1 else_() {
      return this.volatile_;
   }

   protected void for_() {
      ruP_2.class_((rYB)this.throws_[7], this, this.package_);
   }

   private void implements_() {
      this.implements_ = -this.char_();
   }

   public boolean implements_(rdn_3 var1) {
      return this.private_(var1);
   }

   public void instanceof_() {
   }

   protected void instanceof_(float var1) {
      if (!this.ss().class_() && ((Random)this.throws_[40]).nextFloat() < 0.25F * var1) {
         this.class_(rXQ.MAINHAND, eA_2.class_((Random)this.throws_[40], this.ss(), (int)(5.0F + var1 * (float)((Random)this.throws_[40]).nextInt(18)), false));
      }
   }

   protected rPf_1 new_() {
      return new rPf_1(this);
   }

   public static iz_3 package_() {
      return iB_2.SD().class_(iQ_2.break_, 16.0).class_(iQ_2.catch_);
   }

   public void super_(int var1) {
      this.instanceof_ = var1;
      this.class_(false, false);
   }

   public rPY super_() {
      if (this.Pm() && this.ra() instanceof is_3) {
         is_3 var1 = (is_3)this.ra();
         return var1.super_();
      } else {
         return this.native_;
      }
   }

   @Override
   public void super_(float var1) {
      super.super_(var1);
      this.catch_(var1);
   }

   public void try_(float var1) {
      Float var6 = var1;
      this.private_[42] = var6;
   }

   @Override
   public boolean try_() {
      return super.try_() && !this.c();
   }

   public void while_(float var1) {
      Float var6 = var1;
      this.private_[43] = var6;
   }

   @Override
   public Iterable<rdn_3> rs() {
      return this.this_;
   }

   protected rqA_2 static_() {
      return null;
   }

   public rLy_1 public_() {
      if (this.Pm() && this.ra() instanceof is_3) {
         is_3 var1 = (is_3)this.ra();
         return var1.public_();
      } else {
         return this.final_;
      }
   }

   @Override
   public boolean public_(an_3 var1) {
      float var2 = (float)this.class_(iQ_2.case_);
      float var3 = (float)this.class_(iQ_2.catch_);
      if (var1 instanceof iB_2) {
         var2 += eA_2.class_(this.ss(), ((iB_2)var1).sG());
         var3 += (float)eA_2.break_(this);
      }

      int var4 = eA_2.byte_(this);
      if (var4 > 0) {
         var1.case_(var4 * 4);
      }

      boolean var5 = var1.break_(rye_3.byte_(this), var2);
      if (var5) {
         if (var3 > 0.0F && var1 instanceof iB_2) {
            ((iB_2)var1)
               .class_(
                  var3 * 0.5F,
                  (double)rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)),
                  (double)(-rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)))
               );
            this.byte_(this.rv().throws_(0.6, 1.0, 0.6));
         }

         if (var1 instanceof rhd_3 var6) {
            this.class_(var6, this.ss(), var6.return_() ? var6.sX() : rdn_3.break_);
         }

         this.class_(this, var1);
         this.try_(var1);
      }

      return var5;
   }

   public void protected_(rXQ var1) {
      switch (var1.class_()) {
         case HAND:
            this.new_[var1.break_()] = 2.0F;
            break;
         case ARMOR:
            this.continue_[var1.break_()] = 2.0F;
      }
   }

   public boolean protected_(rhd_3 var1) {
      return !this.z() && !(this instanceof rEK);
   }

   public void protected_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      ((rmE_2)this.throws_[49]).break_(class_, var1 ? (byte)(var2 | 1) : (byte)(var2 & -2));
   }

   public boolean private_(rfH_2 var1) {
      return this.char_ == -1.0F ? true : this.interface_.private_(var1) < (double)(this.char_ * this.char_);
   }

   @Override
   protected void private_() {
      if (this.throw_ != null) {
         this.L();
      }

      if (this.try_ != null && (!this.BM() || !this.try_.BM())) {
         this.class_(true, true);
      }
   }

   public boolean private_(double var1) {
      return true;
   }

   public boolean private_(rdn_3 var1) {
      return true;
   }

   @Override
   protected void final_() {
   }

   public boolean strictfp_() {
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
         var1 -= (3 - ((rYB)this.throws_[7]).abstract_().class_()) * 4;
         if (var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   public boolean X() {
      return this.private_(this.Bs());
   }

   @Override
   protected final void Q() {
      Integer var5 = (Integer)this.private_[33] + 1;
      this.private_[33] = var5;
      this.super_.class_();
      this.int_.class_();
      this.package_.class_();
      this.final_.class_();
      this.double_();
      this.native_.class_();
      this.extends_.class_();
      this.volatile_.break_();
      this.for_();
   }

   public iB_2 I_() {
      return this.protected_;
   }

   @Override
   public void Pn() {
      super.Pn();
      if (this.BM() && ((Random)this.throws_[40]).nextInt(1000) < this.implements_++) {
         this.implements_();
         this.long_();
      }
   }

   @Override
   public void rA() {
      if (((rYB)this.throws_[7]).abstract_() == rRO.PEACEFUL && this.boolean_()) {
         this.PD();
      } else if (!this.O() && !this.strictfp_()) {
         rhd_3 var1 = ((rYB)this.throws_[7]).class_(this, -1.0);
         if (var1 != null) {
            double var2 = var1.int_(this);
            int var4 = this.BC().throws_().case_();
            int var5 = var4 * var4;
            if (var2 > (double)var5 && this.private_(var2)) {
               this.PD();
            }

            int var6 = this.BC().throws_().catch_();
            int var7 = var6 * var6;
            if ((Integer)this.private_[33] > 600 && ((Random)this.throws_[40]).nextInt(800) == 0 && var2 > (double)var7 && this.private_(var2)) {
               this.PD();
            } else if (var2 < (double)var7) {
               Integer var12 = 0;
               this.private_[33] = var12;
            }
         }
      } else {
         Integer var13 = 0;
         this.private_[33] = var13;
      }
   }

   @Override
   public Iterable<rdn_3> PV() {
      return this.else_;
   }

   @Override
   public final rqO_2 By() {
      return this.goto_ == null ? this.short_() : this.goto_;
   }

   private void sJ() {
      Integer var7 = (Integer)this.private_[33] + 1;
      this.private_[33] = var7;
      if (this instanceof rEi_1) {
         float var1 = this.rX();
         boolean var2 = this instanceof rEB;
         if (var1 > 0.5F || var2) {
            Integer var8 = (Integer)this.private_[33] + 2;
            this.private_[33] = var8;
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
      ((rmE_2)this.throws_[49]).class_(class_, (byte)0);
   }
}
