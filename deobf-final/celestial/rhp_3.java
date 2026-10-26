package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class rhp_3 extends rhf_3 {
   private final Random class_ = new Random();
   private boolean break_;
   private int protected_;
   private static final rut_3<Integer> catch_ = rmE_2.class_(rhp_3.class, ruw_3.break_);
   private static final rut_3<Boolean> private_ = rmE_2.class_(rhp_3.class, ruw_3.implements_);
   private int implements_;
   private int finally_;
   private int extends_;
   private int native_;
   private float volatile_;
   private boolean final_ = true;
   private an_3 package_;
   private rhT_2 int_ = rhT_2.FLYING;
   private final int new_;
   private final int continue_;

   private boolean byte_(rhd_3 var1) {
      rdn_3 var2 = var1.ss();
      rdn_3 var3 = var1.Sn();
      boolean var4 = var2.break_() == rdy_3.Xd;
      boolean var5 = var3.break_() == rdy_3.Xd;
      if (!(Boolean)var1.throws_[27] && var1.BM() && (var4 || var5) && !(this.int_(var1) > 1024.0)) {
         return false;
      } else {
         this.PD();
         return true;
      }
   }

   private rhp_3(rYB var1, rhd_3 var2, int var3, int var4) {
      super(aI_2.rO, var1);
      Boolean var9 = true;
      this.throws_[56] = var9;
      this.break_(var2);
      var2.implements_[29] = this;
      this.new_ = Math.max(0, var3);
      this.continue_ = Math.max(0, var4);
   }

   public rhp_3(rhd_3 var1, rYB var2, int var3, int var4) {
      this(var2, var1, var3, var4);
      float var5 = (Float)var1.throws_[16];
      float var6 = (Float)var1.throws_[15];
      float var7 = rfU_2.break_(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var8 = rfU_2.class_(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var9 = -rfU_2.break_(-var5 * (float) (Math.PI / 180.0));
      float var10 = rfU_2.class_(-var5 * (float) (Math.PI / 180.0));
      double var11 = var1.rx() - (double)var8 * 0.3;
      double var13 = var1.rH();
      double var15 = var1.BO() - (double)var7 * 0.3;
      this.class_(var11, var13, var15, var6, var5);
      rjU_2 var17 = new rjU_2((double)(-var8), (double)rfU_2.class_(-(var10 / var9), -5.0F, 5.0F), (double)(-var7));
      double var18 = var17.case_();
      var17 = var17.throws_(
         0.6 / var18 + 0.5 + ((Random)this.throws_[40]).nextGaussian() * 0.0045,
         0.6 / var18 + 0.5 + ((Random)this.throws_[40]).nextGaussian() * 0.0045,
         0.6 / var18 + 0.5 + ((Random)this.throws_[40]).nextGaussian() * 0.0045
      );
      this.byte_(var17);
      Float var24 = (float)(rfU_2.protected_(var17.break_, var17.protected_) * 180.0F / (float)Math.PI);
      this.throws_[15] = var24;
      Float var25 = (float)(rfU_2.protected_(var17.byte_, (double)rfU_2.class_(case_(var17))) * 180.0F / (float)Math.PI);
      this.throws_[16] = var25;
      Float var26 = (Float)this.throws_[15];
      this.throws_[17] = var26;
      Float var27 = (Float)this.throws_[16];
      this.throws_[18] = var27;
   }

   public rhp_3(rYB var1, rhd_3 var2, double var3, double var5, double var7) {
      this(var1, var2, 0, 0);
      this.new_(var3, var5, var7);
      Double var13 = this.rx();
      this.throws_[8] = var13;
      Double var14 = this.re();
      this.throws_[9] = var14;
      Double var15 = this.BO();
      this.throws_[10] = var15;
   }

   @Override
   public boolean I() {
      return false;
   }

   @Override
   public void this_() {
      this.class_.setSeed(this.ro().getLeastSignificantBits() ^ ((rYB)this.throws_[7]).r());
      super.this_();
      rhd_3 var1 = this.case_();
      if (var1 == null) {
         this.PD();
      } else if (((rYB)this.throws_[7]).continue_ || !this.byte_(var1)) {
         if ((Boolean)this.throws_[20]) {
            this.implements_++;
            if (this.implements_ >= 1200) {
               this.PD();
               return;
            }
         } else {
            this.implements_ = 0;
         }

         float var2 = 0.0F;
         rfH_2 var3 = this.Bs();
         rXE var4 = ((rYB)this.throws_[7]).break_(var3);
         if (var4.class_(rlG_2.break_)) {
            var2 = var4.class_((rRq_1)((rYB)this.throws_[7]), var3);
         }

         boolean var5 = var2 > 0.0F;
         if (this.int_ == rhT_2.FLYING) {
            if (this.package_ != null) {
               this.byte_(rjU_2.class_);
               this.int_ = rhT_2.HOOKED_IN_ENTITY;
               return;
            }

            if (var5) {
               this.byte_(this.rv().throws_(0.3, 0.2, 0.3));
               this.int_ = rhT_2.BOBBING;
               return;
            }

            this.final_();
         } else {
            if (this.int_ == rhT_2.HOOKED_IN_ENTITY) {
               if (this.package_ != null) {
                  if ((Boolean)this.package_.throws_[27]) {
                     this.package_ = null;
                     this.int_ = rhT_2.FLYING;
                  } else {
                     this.new_(this.package_.rx(), this.package_.byte_(0.8), this.package_.BO());
                  }
               }

               return;
            }

            if (this.int_ == rhT_2.BOBBING) {
               rjU_2 var6 = this.rv();
               double var7 = this.re() + var6.byte_ - (double)var3.c_() - (double)var2;
               if (Math.abs(var7) < 0.01) {
                  var7 += Math.signum(var7) * 0.1;
               }

               this.catch_(var6.break_ * 0.9, var6.byte_ - var7 * (double)((Random)this.throws_[40]).nextFloat() * 0.2, var6.protected_ * 0.9);
               if (this.finally_ <= 0 && this.native_ <= 0) {
                  this.final_ = true;
               } else {
                  this.final_ = this.final_ && this.protected_ < 10 && this.throws_(var3);
               }

               if (var5) {
                  this.protected_ = Math.max(0, this.protected_ - 1);
                  if (this.break_) {
                     this.byte_(this.rv().break_(0.0, -0.1 * (double)this.class_.nextFloat() * (double)this.class_.nextFloat(), 0.0));
                  }

                  if (!((rYB)this.throws_[7]).continue_) {
                     this.class_(var3);
                  }
               } else {
                  this.protected_ = Math.min(10, this.protected_ + 1);
               }
            }
         }

         if (!var4.class_(rlG_2.break_)) {
            this.byte_(this.rv().break_(0.0, -0.03, 0.0));
         }

         this.class_(iG_2.SELF, this.rv());
         this.return_();
         if (this.int_ == rhT_2.FLYING && ((Boolean)this.throws_[20] || (Boolean)this.throws_[23])) {
            this.byte_(rjU_2.class_);
         }

         double var9 = 0.92;
         this.byte_(this.rv().class_(0.92));
         this.PX();
      }
   }

   private void class_(rfH_2 var1) {
      rrEm_1 var2 = (rrEm_1)((rYB)this.throws_[7]);
      int var3 = 1;
      rfH_2 var4 = var1.final_();
      if (((Random)this.throws_[40]).nextFloat() < 0.25F && ((rYB)this.throws_[7]).while_(var4)) {
         var3++;
      }

      if (((Random)this.throws_[40]).nextFloat() < 0.5F && !((rYB)this.throws_[7]).case_(var4)) {
         var3--;
      }

      if (this.finally_ > 0) {
         this.finally_--;
         if (this.finally_ <= 0) {
            this.extends_ = 0;
            this.native_ = 0;
            this.BQ().break_(private_, false);
         }
      } else if (this.native_ > 0) {
         this.native_ -= var3;
         if (this.native_ > 0) {
            this.volatile_ = (float)((double)this.volatile_ + ((Random)this.throws_[40]).nextGaussian() * 4.0);
            float var5 = this.volatile_ * (float) (Math.PI / 180.0);
            float var6 = rfU_2.class_(var5);
            float var7 = rfU_2.break_(var5);
            double var8 = this.rx() + (double)(var6 * (float)this.native_ * 0.1F);
            double var10 = (double)((float)rfU_2.byte_(this.re()) + 1.0F);
            double var12 = this.BO() + (double)(var7 * (float)this.native_ * 0.1F);
            xc_3 var14 = var2.byte_(new rfH_2(var8, var10 - 1.0, var12));
            if (var14.class_(xu_3.try_)) {
               if (((Random)this.throws_[40]).nextFloat() < 0.15F) {
                  var2.class_(rLQ.throws_, var8, var10 - 0.1F, var12, 1, (double)var6, 0.1, (double)var7, 0.0);
               }

               float var15 = var6 * 0.04F;
               float var16 = var7 * 0.04F;
               var2.class_(rLQ.while_, var8, var10, var12, 0, (double)var16, 0.01, (double)(-var15), 1.0);
               var2.class_(rLQ.while_, var8, var10, var12, 0, (double)(-var16), 0.01, (double)var15, 1.0);
            }
         } else {
            this.class_(rqn_3.SQ, 0.25F, 1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.4F);
            double var17 = this.re() + 0.5;
            var2.class_(rLQ.throws_, this.rx(), var17, this.BO(), (int)(1.0F + this.PN() * 20.0F), (double)this.PN(), 0.0, (double)this.PN(), 0.2F);
            var2.class_(rLQ.while_, this.rx(), var17, this.BO(), (int)(1.0F + this.PN() * 20.0F), (double)this.PN(), 0.0, (double)this.PN(), 0.2F);
            this.finally_ = rfU_2.class_((Random)this.throws_[40], 20, 40);
            this.BQ().break_(private_, true);
         }
      } else if (this.extends_ > 0) {
         this.extends_ -= var3;
         float var18 = 0.15F;
         if (this.extends_ < 20) {
            var18 = (float)((double)var18 + (double)(20 - this.extends_) * 0.05);
         } else if (this.extends_ < 40) {
            var18 = (float)((double)var18 + (double)(40 - this.extends_) * 0.02);
         } else if (this.extends_ < 60) {
            var18 = (float)((double)var18 + (double)(60 - this.extends_) * 0.01);
         }

         if (((Random)this.throws_[40]).nextFloat() < var18) {
            float var19 = rfU_2.class_((Random)this.throws_[40], 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float var20 = rfU_2.class_((Random)this.throws_[40], 25.0F, 60.0F);
            double var21 = this.rx() + (double)(rfU_2.class_(var19) * var20 * 0.1F);
            double var22 = (double)((float)rfU_2.byte_(this.re()) + 1.0F);
            double var23 = this.BO() + (double)(rfU_2.break_(var19) * var20 * 0.1F);
            xc_3 var24 = var2.byte_(new rfH_2(var21, var22 - 1.0, var23));
            if (var24.class_(xu_3.try_)) {
               var2.class_(rLQ.E, var21, var22, var23, 2 + ((Random)this.throws_[40]).nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.extends_ <= 0) {
            this.volatile_ = rfU_2.class_((Random)this.throws_[40], 0.0F, 360.0F);
            this.native_ = rfU_2.class_((Random)this.throws_[40], 20, 80);
         }
      } else {
         this.extends_ = rfU_2.class_((Random)this.throws_[40], 100, 600);
         this.extends_ = this.extends_ - this.continue_ * 20 * 5;
      }
   }

   private rht_3 class_(rfH_2 var1, rfH_2 var2) {
      return rfH_2.break_(var1, var2).map(this::case_).reduce((var0, var1x) -> var0 == var1x ? var0 : rht_3.INVALID).orElse(rht_3.INVALID);
   }

   @Override
   protected void class_(rff_3 var1) {
      super.class_(var1);
      this.byte_(this.rv().protected_().class_(var1.class_(this)));
   }

   @Override
   public void class_(rcd_3 var1) {
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 31 && ((rYB)this.throws_[7]).continue_ && this.package_ instanceof rhd_3 && ((rhd_3)this.package_).char_()) {
         this.throws_();
      }

      super.class_(var1);
   }

   @Override
   public void class_(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (catch_.equals(var1)) {
         int var2 = this.BQ().class_(catch_);
         this.package_ = var2 > 0 ? ((rYB)this.throws_[7]).break_(var2 - 1) : null;
      }

      if (private_.equals(var1)) {
         this.break_ = this.BQ().class_(private_);
         if (this.break_) {
            this.catch_(this.rv().break_, (double)(-0.4F * rfU_2.class_(this.class_, 0.6F, 1.0F)), this.rv().protected_);
         }
      }

      super.class_(var1);
   }

   @Override
   protected boolean class_(an_3 var1) {
      return super.class_(var1) || var1.BM() && var1 instanceof rsE_2;
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         this.package_ = var1.class_();
         this.package_();
      }
   }

   @Override
   public boolean class_(double var1) {
      double var3 = 64.0;
      return var1 < 4096.0;
   }

   @Override
   public void break_(rcd_3 var1) {
   }

   public int break_(rdn_3 var1) {
      rhd_3 var2 = this.case_();
      if (!((rYB)this.throws_[7]).continue_ && var2 != null) {
         int var3 = 0;
         if (this.package_ != null) {
            this.throws_();
            Oo_1.interface_.class_((rhN_2)var2, var1, this, Collections.emptyList());
            ((rYB)this.throws_[7]).class_(this, (byte)31);
            var3 = this.package_ instanceof rsE_2 ? 3 : 5;
         } else if (this.finally_ > 0) {
            rzP_2 var4 = new rzP_2((rrEm_1)((rYB)this.throws_[7]))
               .class_(rzQ_2.case_, this.Ps())
               .class_(rzQ_2.implements_, var1)
               .class_(rzQ_2.class_, this)
               .class_((Random)this.throws_[40])
               .class_((float)this.new_ + var2.sY());
            rzL_2 var5 = ((rYB)this.throws_[7]).const_().o().class_(rzl_3.J);
            List var6 = var5.class_(var4.class_(rzz_3.throws_));
            Oo_1.interface_.class_((rhN_2)var2, var1, this, var6);

            for (rdn_3 var8 : var6) {
               rsE_2 var9 = new rsE_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), var8);
               double var10 = var2.rx() - this.rx();
               double var12 = var2.re() - this.re();
               double var14 = var2.BO() - this.BO();
               double var16 = 0.1;
               var9.catch_(var10 * 0.1, var12 * 0.1 + Math.sqrt(Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14)) * 0.08, var14 * 0.1);
               ((rYB)this.throws_[7]).a_(var9);
               ((rYB)var2.throws_[7])
                  .a_(new rsP_2((rYB)var2.throws_[7], var2.rx(), var2.re() + 0.5, var2.BO() + 0.5, ((Random)this.throws_[40]).nextInt(6) + 1));
               if (var8.break_().class_(rlc_3.switch_)) {
                  var2.class_(rlB_2.transient_, 1);
               }
            }

            var3 = 1;
         }

         if ((Boolean)this.throws_[20]) {
            var3 = 2;
         }

         this.PD();
         return var3;
      } else {
         return 0;
      }
   }

   private boolean throws_(rfH_2 var1) {
      rht_3 var2 = rht_3.INVALID;

      for (int var3 = -1; var3 <= 2; var3++) {
         rht_3 var4 = this.class_(var1.break_(-2, var3, -2), var1.break_(2, var3, 2));
         switch (var4) {
            case INVALID:
               return false;
            case ABOVE_WATER:
               if (var2 == rht_3.INVALID) {
                  return false;
               }
               break;
            case INSIDE_WATER:
               if (var2 == rht_3.ABOVE_WATER) {
                  return false;
               }
         }

         var2 = var4;
      }

      return true;
   }

   protected void throws_() {
      an_3 var1 = this.else_();
      if (var1 != null) {
         rjU_2 var2 = new rjU_2(var1.rx() - this.rx(), var1.re() - this.re(), var1.BO() - this.BO()).class_(0.1);
         this.package_.byte_(this.package_.rv().throws_(var2));
      }
   }

   @Override
   public void PD() {
      super.PD();
      rhd_3 var1 = this.case_();
      if (var1 != null) {
         Object var6 = null;
         var1.implements_[29] = var6;
      }
   }

   public an_3 catch_() {
      return this.package_;
   }

   public rhd_3 case_() {
      an_3 var1 = this.else_();
      return var1 instanceof rhd_3 ? (rhd_3)var1 : null;
   }

   private rht_3 case_(rfH_2 var1) {
      xc_3 var2 = ((rYB)this.throws_[7]).byte_(var1);
      if (!var2.catch_() && !var2.class_(xu_3.Sr)) {
         rXE var3 = var2.volatile_();
         return var3.class_(rlG_2.break_) && var3.break_() && var2.extends_((rYB)this.throws_[7], var1).break_() ? rht_3.INSIDE_WATER : rht_3.INVALID;
      } else {
         return rht_3.ABOVE_WATER;
      }
   }

   public boolean implements_() {
      return this.break_;
   }

   private void package_() {
      this.BQ().break_(catch_, this.package_.V() + 1);
   }

   @Override
   public boolean protected_() {
      return this.final_;
   }

   public rhT_2 private_() {
      return this.int_;
   }

   private void final_() {
      rjG_2 var1 = rhj_3.class_(this, this::class_);
      this.class_(var1);
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      this.BQ().class_(catch_, 0);
      this.BQ().class_(private_, false);
   }

   @Override
   public ruS_2<?> p_() {
      an_3 var1 = this.else_();
      return new rFJ(this, var1 == null ? this.V() : var1.V());
   }
}
