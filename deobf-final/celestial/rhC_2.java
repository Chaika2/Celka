package celestial;

import java.util.Random;
import java.util.UUID;

public class rhC_2 extends an_3 {
   private int class_;
   private boolean break_;
   private int protected_ = 22;
   private boolean catch_;
   private iB_2 private_;
   private UUID implements_;

   private void byte_(iB_2 var1) {
      iB_2 var2 = this.protected_();
      if (var1.BM() && !var1.rg() && var1 != var2) {
         if (var2 == null) {
            var1.break_(rye_3.package_, 6.0F);
         } else {
            if (var2.final_(var1)) {
               return;
            }

            var1.break_(rye_3.byte_(this, var2), 6.0F);
         }
      }
   }

   public float byte_(float var1) {
      if (!this.catch_) {
         return 0.0F;
      } else {
         int var2 = this.protected_ - 2;
         return var2 <= 0 ? 1.0F : 1.0F - ((float)var2 - var1) / 20.0F;
      }
   }

   public rhC_2(rYB var1, double var2, double var4, double var6, float var8, int var9, iB_2 var10) {
      this(aI_2.public_, var1);
      this.class_ = var9;
      this.class_(var10);
      Float var15 = var8 * (180.0F / (float)Math.PI);
      this.throws_[15] = var15;
      this.new_(var2, var4, var6);
   }

   public rhC_2(aI_2<? extends rhC_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (((rYB)this.throws_[7]).continue_) {
         if (this.catch_) {
            this.protected_--;
            if (this.protected_ == 14) {
               for (int var1 = 0; var1 < 12; var1++) {
                  double var2 = this.rx() + (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * (double)this.PN() * 0.5;
                  double var4 = this.re() + 0.05 + ((Random)this.throws_[40]).nextDouble();
                  double var6 = this.BO() + (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * (double)this.PN() * 0.5;
                  double var8 = (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * 0.3;
                  double var10 = 0.3 + ((Random)this.throws_[40]).nextDouble() * 0.3;
                  double var12 = (((Random)this.throws_[40]).nextDouble() * 2.0 - 1.0) * 0.3;
                  ((rYB)this.throws_[7]).class_(rLQ.catch_, var2, var4 + 1.0, var6, var8, var10, var12);
               }
            }
         }
      } else if (--this.class_ < 0) {
         if (this.class_ == -8) {
            for (iB_2 var15 : ((rYB)this.throws_[7]).class_(iB_2.class, this.rN().byte_(0.2, 0.0, 0.2))) {
               this.byte_(var15);
            }
         }

         if (!this.break_) {
            ((rYB)this.throws_[7]).class_(this, (byte)4);
            this.break_ = true;
         }

         if (--this.protected_ < 0) {
            this.PD();
         }
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.break_("Warmup", this.class_);
      if (this.implements_ != null) {
         var1.class_("Owner", this.implements_);
      }
   }

   @Override
   public void class_(byte var1) {
      super.class_(var1);
      if (var1 == 4) {
         this.catch_ = true;
         if (!this.BF()) {
            ((rYB)this.throws_[7])
               .class_(this.rx(), this.re(), this.BO(), rqn_3.BU, this.Pr(), 1.0F, ((Random)this.throws_[40]).nextFloat() * 0.2F + 0.85F, false);
         }
      }
   }

   public void class_(iB_2 var1) {
      this.private_ = var1;
      this.implements_ = var1 == null ? null : var1.ro();
   }

   @Override
   protected void break_(rcd_3 var1) {
      this.class_ = var1.private_("Warmup");
      if (var1.break_("Owner")) {
         this.implements_ = var1.class_("Owner");
      }
   }

   public iB_2 protected_() {
      if (this.private_ == null && this.implements_ != null && (rYB)this.throws_[7] instanceof rrEm_1) {
         an_3 var1 = ((rrEm_1)((rYB)this.throws_[7])).break_(this.implements_);
         if (var1 instanceof iB_2) {
            this.private_ = (iB_2)var1;
         }
      }

      return this.private_;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
