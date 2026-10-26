package celestial;

import java.util.Random;
import java.util.function.Predicate;

public class rGx_1 extends rEB {
   private static final Predicate<an_3> protected_ = var0 -> var0.BM() && !(var0 instanceof rGx_1);
   private int super_;
   private int this_;
   private int else_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Xd;
   }

   public rGx_1(aI_2<? extends rGx_1> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.throws_[37] = var7;
      this.finally_ = 20;
   }

   @Override
   public int S() {
      return 45;
   }

   private void sl() {
      if (this.BM()) {
         for (an_3 var2 : ((rYB)this.throws_[7]).class_(iB_2.class, this.rN().class_(4.0), protected_)) {
            if (!(var2 instanceof rsi_3)) {
               var2.break_(rye_3.byte_(this), 6.0F);
            }

            this.class_(var2);
         }

         rjU_2 var9 = this.rN().case_();

         for (int var10 = 0; var10 < 40; var10++) {
            double var3 = ((Random)this.throws_[40]).nextGaussian() * 0.2;
            double var5 = ((Random)this.throws_[40]).nextGaussian() * 0.2;
            double var7 = ((Random)this.throws_[40]).nextGaussian() * 0.2;
            ((rYB)this.throws_[7]).class_(rLQ.boolean_, var9.break_, var9.byte_, var9.protected_, var3, var5, var7);
         }
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 4) {
         this.super_ = 10;
         this.class_(rqn_3.XX, 1.0F, 1.0F);
      } else if (var1 == 39) {
         this.this_ = 40;
      }

      super.class_(var1);
   }

   @Override
   public void class_(int var1, boolean var2) {
   }

   @Override
   public boolean class_(rRR var1) {
      return !var1.protected_(this.rN());
   }

   private void class_(an_3 var1) {
      double var2 = var1.rx() - this.rx();
      double var4 = var1.BO() - this.BO();
      double var6 = Math.max(var2 * var2 + var4 * var4, 0.001);
      var1.implements_(var2 / var6 * 4.0, 0.2, var4 / var6 * 4.0);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("AttackTick", this.super_);
      var1.break_("StunTick", this.this_);
      var1.break_("RoarTick", this.else_);
   }

   public int sc() {
      return this.this_;
   }

   @Override
   public void default_() {
      super.default_();
      if (this.BM()) {
         if (this.BK()) {
            this.byte_(iQ_2.protected_).class_(0.0);
         } else {
            double var1 = this.I_() != null ? 0.35 : 0.3;
            double var3 = this.byte_(iQ_2.protected_).break_();
            this.byte_(iQ_2.protected_).class_(rfU_2.protected_(0.1, var3, var1));
         }

         if ((Boolean)this.throws_[23] && ((rYB)this.throws_[7]).B().break_(rRu_1.break_)) {
            boolean var7 = false;
            rfl_3 var2 = this.rN().class_(0.2);

            for (rfH_2 var4 : rfH_2.break_(
               rfU_2.byte_(var2.class_),
               rfU_2.byte_(var2.break_),
               rfU_2.byte_(var2.byte_),
               rfU_2.byte_(var2.protected_),
               rfU_2.byte_(var2.throws_),
               rfU_2.byte_(var2.case_)
            )) {
               xc_3 var5 = ((rYB)this.throws_[7]).byte_(var4);
               xd_3 var6 = var5.break_();
               if (var6 instanceof kZ_2) {
                  var7 = ((rYB)this.throws_[7]).class_(var4, true, this) || var7;
               }
            }

            if (!var7 && (Boolean)this.throws_[20]) {
               this.continue_(false);
            }
         }

         if (this.else_ > 0) {
            this.else_--;
            if (this.else_ == 10) {
               this.sl();
            }
         }

         if (this.super_ > 0) {
            this.super_--;
         }

         if (this.this_ > 0) {
            this.this_--;
            this.sC();
            if (this.this_ == 0) {
               this.class_(rqn_3.Xz, 1.0F, 1.0F);
               this.else_ = 20;
            }
         }
      }
   }

   @Override
   protected void void_() {
      boolean var1 = !(this.rU() instanceof is_3) || this.rU().BC().class_(rlE_2.byte_);
      boolean var2 = !(this.ra() instanceof rSK);
      this.package_.class_(rBW.MOVE, var1);
      this.package_.class_(rBW.JUMP, var1 && var2);
      this.package_.class_(rBW.LOOK, var1);
      this.package_.class_(rBW.TARGET, var1);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.Xk, 0.15F, 1.0F);
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rGk_1(this, var1);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.super_ = var1.private_("AttackTick");
      this.this_ = var1.private_("StunTick");
      this.else_ = var1.private_("RoarTick");
   }

   @Override
   protected void throws_(iB_2 var1) {
      if (this.else_ == 0) {
         if (((Random)this.throws_[40]).nextDouble() < 0.5) {
            this.this_ = 40;
            this.class_(rqn_3.XW, 1.0F, 1.0F);
            ((rYB)this.throws_[7]).class_(this, (byte)39);
            var1.byte_(this);
         } else {
            this.class_(var1);
         }

         Boolean var6 = true;
         var1.throws_[25] = var6;
      }
   }

   public static iz_3 throws_() {
      return rEi_1.sm()
         .class_(iQ_2.class_, 100.0)
         .class_(iQ_2.protected_, 0.3)
         .class_(iQ_2.byte_, 0.75)
         .class_(iQ_2.case_, 12.0)
         .class_(iQ_2.catch_, 1.5)
         .class_(iQ_2.break_, 32.0);
   }

   @Override
   public boolean G() {
      return !this.c() && this.rU() instanceof iB_2;
   }

   @Override
   public boolean while_(an_3 var1) {
      return this.this_ <= 0 && this.else_ <= 0 ? super.while_(var1) : false;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Xh;
   }

   @Override
   public boolean public_(an_3 var1) {
      this.super_ = 10;
      ((rYB)this.throws_[7]).class_(this, (byte)4);
      this.class_(rqn_3.XX, 1.0F, 1.0F);
      return super.public_(var1);
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(4, new rGd_1(this));
      this.package_.class_(5, new rSk_1(this, 0.4));
      this.package_.class_(6, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(10, new rBA(this, is_3.class, 8.0F));
      this.int_.class_(2, new rBc_1(this, rEB.class).class_());
      this.int_.class_(3, new rBI<>(this, rhd_3.class, true));
      this.int_.class_(4, new rBI<>(this, rsy_3.class, true));
      this.int_.class_(4, new rBI<>(this, rMZ.class, true));
   }

   public int sn() {
      return this.else_;
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   public double PS() {
      return 2.1;
   }

   @Override
   protected boolean BK() {
      return super.BK() || this.super_ > 0 || this.this_ > 0 || this.else_ > 0;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Xx;
   }

   public int sN() {
      return this.super_;
   }

   @Override
   public boolean su() {
      return false;
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.XJ;
   }

   private void sC() {
      if (((Random)this.throws_[40]).nextInt(6) == 0) {
         double var1 = this.rx()
            - (double)this.PN() * Math.sin((double)((Float)this.private_[23] * (float) (Math.PI / 180.0)))
            + (((Random)this.throws_[40]).nextDouble() * 0.6 - 0.3);
         double var3 = this.re() + (double)this.Bm() - 0.3;
         double var5 = this.BO()
            + (double)this.PN() * Math.cos((double)((Float)this.private_[23] * (float) (Math.PI / 180.0)))
            + (((Random)this.throws_[40]).nextDouble() * 0.6 - 0.3);
         ((rYB)this.throws_[7]).class_(rLQ.else_, var1, var3, var5, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }
}
