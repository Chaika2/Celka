package celestial;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rGi_1 extends rEB implements aa_3 {
   private static final UUID protected_ = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final ix_3 super_ = new ix_3(protected_, "Drinking speed penalty", -0.25, id_3.ADDITION);
   private static final rut_3<Boolean> this_ = rmE_2.class_(rGi_1.class, ruw_3.implements_);
   private int else_;
   private rBw_1<rEB> synchronized_;
   private rSh_1<rhd_3> return_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.kK;
   }

   public rGi_1(aI_2<? extends rGi_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 15) {
         for (int var2 = 0; var2 < ((Random)this.throws_[40]).nextInt(35) + 10; var2++) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.G,
                  this.rx() + ((Random)this.throws_[40]).nextGaussian() * 0.13F,
                  this.rN().throws_ + 0.5 + ((Random)this.throws_[40]).nextGaussian() * 0.13F,
                  this.BO() + ((Random)this.throws_[40]).nextGaussian() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      } else {
         super.class_(var1);
      }
   }

   @Override
   public void class_(int var1, boolean var2) {
   }

   @Override
   public void default_() {
      if (!((rYB)this.throws_[7]).continue_ && this.BM()) {
         this.synchronized_.private_();
         if (this.synchronized_.catch_() <= 0) {
            this.return_.class_(true);
         } else {
            this.return_.class_(false);
         }

         if (this.throws_()) {
            if (this.else_-- <= 0) {
               this.public_(false);
               rdn_3 var5 = this.ss();
               this.class_(rXQ.MAINHAND, rdn_3.break_);
               if (var5.break_() == rdy_3.JA) {
                  List var6 = rAB.class_(var5);
                  if (var6 != null) {
                     for (rLY var4 : var6) {
                        this.break_(new rLY(var4));
                     }
                  }
               }

               this.byte_(iQ_2.protected_).protected_(super_);
            }
         } else {
            rLi_1 var1 = null;
            if (((Random)this.throws_[40]).nextFloat() < 0.15F && this.class_(rlG_2.break_) && !this.break_(rLD.volatile_)) {
               var1 = rAS.public_;
            } else if (((Random)this.throws_[40]).nextFloat() < 0.15F && (this.Pz() || this.SJ() != null && this.SJ().int_()) && !this.break_(rLD.native_)) {
               var1 = rAS.volatile_;
            } else if (((Random)this.throws_[40]).nextFloat() < 0.05F && this.Ss() < this.SK()) {
               var1 = rAS.while_;
            } else if (((Random)this.throws_[40]).nextFloat() < 0.5F && this.I_() != null && !this.break_(rLD.class_) && this.I_().int_(this) > 121.0) {
               var1 = rAS.package_;
            }

            if (var1 != null) {
               this.class_(rXQ.MAINHAND, rAB.class_(new rdn_3(rdy_3.JA), var1));
               this.else_ = this.ss().extends_();
               this.public_(true);
               if (!this.BF()) {
                  ((rYB)this.throws_[7])
                     .class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.ko, this.Pr(), 1.0F, 0.8F + ((Random)this.throws_[40]).nextFloat() * 0.4F);
               }

               ic_3 var2 = this.byte_(iQ_2.protected_);
               var2.protected_(super_);
               var2.break_(super_);
            }
         }

         if (((Random)this.throws_[40]).nextFloat() < 7.5E-4F) {
            ((rYB)this.throws_[7]).class_(this, (byte)15);
         }
      }

      super.default_();
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 1.62F;
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      if (!this.throws_()) {
         rjU_2 var3 = var1.rv();
         double var4 = var1.rx() + var3.break_ - this.rx();
         double var6 = var1.rH() - 1.1F - this.re();
         double var8 = var1.BO() + var3.protected_ - this.BO();
         float var10 = rfU_2.class_(var4 * var4 + var8 * var8);
         rLi_1 var11 = rAS.instanceof_;
         if (var1 instanceof rEB) {
            if (var1.Ss() <= 4.0F) {
               var11 = rAS.while_;
            } else {
               var11 = rAS.long_;
            }

            this.byte_((iB_2)null);
         } else if (var10 >= 8.0F && !var1.break_(rLD.break_)) {
            var11 = rAS.continue_;
         } else if (var1.Ss() >= 8.0F && !var1.break_(rLD.super_)) {
            var11 = rAS.interface_;
         } else if (var10 <= 3.0F && !var1.break_(rLD.continue_) && ((Random)this.throws_[40]).nextFloat() < 0.25F) {
            var11 = rAS.default_;
         }

         rhI_2 var12 = new rhI_2((rYB)this.throws_[7], this);
         var12.break_(rAB.class_(new rdn_3(rdy_3.kk), var11));
         Float var17 = (Float)var12.throws_[16] - -20.0F;
         var12.throws_[16] = var17;
         var12.byte_(var4, var6 + (double)(var10 * 0.2F), var8, 0.75F, 8.0F);
         if (!this.BF()) {
            ((rYB)this.throws_[7])
               .class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.kD, this.Pr(), 1.0F, 0.8F + ((Random)this.throws_[40]).nextFloat() * 0.4F);
         }

         ((rYB)this.throws_[7]).a_(var12);
      }
   }

   @Override
   protected float throws_(rye_3 var1, float var2) {
      var2 = super.throws_(var1, var2);
      if (var1.extends_() == this) {
         var2 = 0.0F;
      }

      if (var1.this_()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   public boolean throws_() {
      return this.BQ().class_(this_);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.kg;
   }

   public void public_(boolean var1) {
      this.BQ().break_(this_, var1);
   }

   @Override
   protected void final_() {
      super.final_();
      this.synchronized_ = new rBw_1<>(this, rEB.class, true, var1 -> var1 != null && this.sd() && var1.BC() != aI_2.a);
      this.return_ = new rSh_1<>(this, rhd_3.class, 10, true, false, (Predicate<iB_2>)null);
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(2, new rBe_1(this, 1.0, 60, 10.0F));
      this.package_.class_(2, new rSk_1(this, 1.0));
      this.package_.class_(3, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(3, new rBC(this));
      this.int_.class_(1, new rBc_1(this, rEB.class));
      this.int_.class_(2, this.synchronized_);
      this.int_.class_(3, this.return_);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kY;
   }

   public static iz_3 sN() {
      return rEi_1.sm().class_(iQ_2.class_, 26.0).class_(iQ_2.protected_, 0.25);
   }

   @Override
   public boolean su() {
      return false;
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.kR;
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().class_(this_, false);
   }
}
