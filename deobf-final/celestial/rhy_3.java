package celestial;

import java.util.OptionalInt;
import java.util.Random;

public class rhy_3 extends rhf_3 implements ai_3 {
   private static final rut_3<rdn_3> class_ = rmE_2.class_(rhy_3.class, ruw_3.catch_);
   private static final rut_3<OptionalInt> break_ = rmE_2.class_(rhy_3.class, ruw_3.continue_);
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rhy_3.class, ruw_3.implements_);
   private int catch_;
   private int private_;
   private iB_2 implements_;

   public rhy_3(rYB var1, rdn_3 var2, an_3 var3, double var4, double var6, double var8, boolean var10) {
      this(var1, var2, var4, var6, var8, var10);
      this.break_(var3);
   }

   public rhy_3(rYB var1, rdn_3 var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      ((rmE_2)this.throws_[49]).break_(protected_, var9);
   }

   public rhy_3(rYB var1, rdn_3 var2, iB_2 var3) {
      this(var1, var3, var3.rx(), var3.re(), var3.BO(), var2);
      ((rmE_2)this.throws_[49]).break_(break_, OptionalInt.of(var3.V()));
      this.implements_ = var3;
   }

   public rhy_3(aI_2<? extends rhy_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rhy_3(rYB var1, double var2, double var4, double var6, rdn_3 var8) {
      super(aI_2.instanceof_, var1);
      this.catch_ = 0;
      this.new_(var2, var4, var6);
      byte var9 = 1;
      if (!var8.class_() && var8.final_()) {
         ((rmE_2)this.throws_[49]).break_(class_, var8.implements_());
         var9 += var8.class_("Fireworks").case_("Flight");
      }

      this.catch_(((Random)this.throws_[40]).nextGaussian() * 0.001, 0.05, ((Random)this.throws_[40]).nextGaussian() * 0.001);
      this.private_ = 10 * var9 + ((Random)this.throws_[40]).nextInt(6) + ((Random)this.throws_[40]).nextInt(7);
   }

   public rhy_3(rYB var1, an_3 var2, double var3, double var5, double var7, rdn_3 var9) {
      this(var1, var3, var5, var7, var9);
      this.break_(var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.private_()) {
         if (this.implements_ == null) {
            ((rmE_2)this.throws_[49]).class_(break_).ifPresent(var1x -> {
               an_3 var2x = ((rYB)this.throws_[7]).break_(var1x);
               if (var2x instanceof iB_2) {
                  this.implements_ = (iB_2)var2x;
               }
            });
         }

         if (this.implements_ != null) {
            if (this.implements_.Sy()) {
               rjU_2 var1 = this.implements_.m();
               rjU_2 var2 = this.implements_.rv();
               rrLJ var3 = rrLJ.class_(this.implements_, 1.5, 1.5, 1.5);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
               if (!var3.byte_()) {
                  double var4 = var3.protected_();
                  double var6 = var3.break_();
                  double var8 = var3.throws_();
                  this.implements_
                     .byte_(
                        var2.break_(
                           var1.break_ * 0.1 + (var1.break_ * var4 - var2.break_) * 0.5,
                           var1.byte_ * 0.1 + (var1.byte_ * var6 - var2.byte_) * 0.5,
                           var1.protected_ * 0.1 + (var1.protected_ * var8 - var2.protected_) * 0.5
                        )
                     );
               }
            }

            this.new_(this.implements_.rx(), this.implements_.re(), this.implements_.BO());
            this.byte_(this.implements_.rv());
         }
      } else {
         if (!this.protected_()) {
            double var15 = this.throws_[23] ? 1.0 : 1.15;
            this.byte_(this.rv().throws_(var15, 1.0, var15).break_(0.0, 0.04, 0.0));
         }

         rjU_2 var16 = this.rv();
         this.class_(iG_2.SELF, var16);
         this.byte_(var16);
      }

      rjG_2 var17 = rhj_3.class_(this, this::class_);
      if (!(Boolean)this.throws_[38]) {
         this.class_(var17);
         Boolean var14 = true;
         this.throws_[57] = var14;
      }

      this.return_();
      if (this.catch_ == 0 && !this.BF()) {
         ((rYB)this.throws_[7]).class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.Sh, rqL_2.AMBIENT, 3.0F, 1.0F);
      }

      this.catch_++;
      if (((rYB)this.throws_[7]).continue_ && this.catch_ % 2 < 2) {
         ((rYB)this.throws_[7])
            .class_(
               rLQ.goto_,
               this.rx(),
               this.re() - 0.3,
               this.BO(),
               ((Random)this.throws_[40]).nextGaussian() * 0.05,
               -this.rv().byte_ * 0.5,
               ((Random)this.throws_[40]).nextGaussian() * 0.05
            );
      }

      if (!((rYB)this.throws_[7]).continue_ && this.catch_ > this.private_) {
         this.throws_();
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Life", this.catch_);
      var1.break_("LifeTime", this.private_);
      rdn_3 var2 = ((rmE_2)this.throws_[49]).class_(class_);
      if (!var2.class_()) {
         var1.class_("FireworksItem", var2.break_(new rcd_3()));
      }

      var1.class_("ShotAtAngle", ((rmE_2)this.throws_[49]).class_(protected_));
   }

   @Override
   protected void class_(rff_3 var1) {
      rfH_2 var2 = new rfH_2(var1.class_());
      ((rYB)this.throws_[7]).byte_(var2).class_((rYB)this.throws_[7], var2, this);
      if (!((rYB)this.throws_[7]).import_() && this.case_()) {
         this.throws_();
      }

      super.class_(var1);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 17 && ((rYB)this.throws_[7]).continue_) {
         if (!this.case_()) {
            for (int var2 = 0; var2 < ((Random)this.throws_[40]).nextInt(3) + 2; var2++) {
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.boolean_,
                     this.rx(),
                     this.re(),
                     this.BO(),
                     ((Random)this.throws_[40]).nextGaussian() * 0.05,
                     0.005,
                     ((Random)this.throws_[40]).nextGaussian() * 0.05
                  );
            }
         } else {
            rdn_3 var5 = ((rmE_2)this.throws_[49]).class_(class_);
            rcd_3 var3 = var5.class_() ? null : var5.break_("Fireworks");
            rjU_2 var4 = this.rv();
            ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), var4.break_, var4.byte_, var4.protected_, var3);
         }
      }

      super.class_(var1);
   }

   @Override
   public rdn_3 class_() {
      rdn_3 var1 = ((rmE_2)this.throws_[49]).class_(class_);
      return var1.class_() ? new rdn_3(rdy_3.dc) : var1;
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         this.throws_();
      }
   }

   @Override
   public boolean class_(double var1) {
      return var1 < 4096.0 && !this.private_();
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.catch_ = var1.private_("Life");
      this.private_ = var1.private_("LifeTime");
      rdn_3 var2 = rdn_3.class_(var1.int_("FireworksItem"));
      if (!var2.class_()) {
         ((rmE_2)this.throws_[49]).break_(class_, var2);
      }

      if (var1.throws_("ShotAtAngle")) {
         ((rmE_2)this.throws_[49]).break_(protected_, var1.new_("ShotAtAngle"));
      }
   }

   private void throws_() {
      ((rYB)this.throws_[7]).class_(this, (byte)17);
      this.catch_();
      this.PD();
   }

   @Override
   public boolean rt() {
      return false;
   }

   private void catch_() {
      float var1 = 0.0F;
      rdn_3 var2 = ((rmE_2)this.throws_[49]).class_(class_);
      rcd_3 var3 = var2.class_() ? null : var2.break_("Fireworks");
      rcy_3 var4 = var3 != null ? var3.protected_("Explosions", 10) : null;
      if (var4 != null && !var4.isEmpty()) {
         var1 = 5.0F + (float)(var4.size() * 2);
      }

      if (var1 > 0.0F) {
         if (this.implements_ != null) {
            this.implements_.break_(rye_3.class_(this, this.else_()), 5.0F + (float)(var4.size() * 2));
         }

         double var5 = 5.0;
         rjU_2 var7 = this.Ps();

         for (iB_2 var9 : ((rYB)this.throws_[7]).class_(iB_2.class, this.rN().class_(5.0))) {
            if (var9 != this.implements_ && !(this.int_(var9) > 25.0)) {
               boolean var10 = false;

               for (int var11 = 0; var11 < 2; var11++) {
                  rjU_2 var12 = new rjU_2(var9.rx(), var9.byte_(0.5 * (double)var11), var9.BO());
                  rff_3 var13 = ((rYB)this.throws_[7]).class_(new rjB_2(var7, var12, rjS_2.COLLIDER, rjs_3.NONE, this));
                  if (var13.byte_() == rjM_2.MISS) {
                     var10 = true;
                     break;
                  }
               }

               if (var10) {
                  float var14 = var1 * (float)Math.sqrt((5.0 - (double)this.implements_(var9)) / 5.0);
                  var9.break_(rye_3.class_(this, this.else_()), var14);
               }
            }
         }
      }
   }

   private boolean case_() {
      rdn_3 var1 = ((rmE_2)this.throws_[49]).class_(class_);
      rcd_3 var2 = var1.class_() ? null : var1.break_("Fireworks");
      rcy_3 var3 = var2 != null ? var2.protected_("Explosions", 10) : null;
      return var3 != null && !var3.isEmpty();
   }

   @Override
   public boolean protected_() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   private boolean private_() {
      return ((rmE_2)this.throws_[49]).class_(break_).isPresent();
   }

   @Override
   public boolean final_(double var1, double var3, double var5) {
      return super.final_(var1, var3, var5) && !this.private_();
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(class_, rdn_3.break_);
      ((rmE_2)this.throws_[49]).class_(break_, OptionalInt.empty());
      ((rmE_2)this.throws_[49]).class_(protected_, false);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
