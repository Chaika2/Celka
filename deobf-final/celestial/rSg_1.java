package celestial;

import java.util.List;
import java.util.Random;

public class rSg_1 extends an_3 {
   private int break_;
   public long class_;
   private int protected_;
   private boolean catch_;
   private rhN_2 private_;

   public rSg_1(aI_2<? extends rSg_1> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[56] = var7;
      this.break_ = 2;
      this.class_ = ((Random)this.throws_[40]).nextLong();
      this.protected_ = ((Random)this.throws_[40]).nextInt(3) + 1;
   }

   @Override
   public void this_() {
      super.this_();
      if (this.break_ == 2) {
         rRO var1 = ((rYB)this.throws_[7]).abstract_();
         if (var1 == rRO.NORMAL || var1 == rRO.HARD) {
            this.class_(4);
         }

         ((rYB)this.throws_[7])
            .class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.GO, rqL_2.WEATHER, 10000.0F, 0.8F + ((Random)this.throws_[40]).nextFloat() * 0.2F);
         ((rYB)this.throws_[7])
            .class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.GM, rqL_2.WEATHER, 2.0F, 0.5F + ((Random)this.throws_[40]).nextFloat() * 0.2F);
      }

      this.break_--;
      if (this.break_ < 0) {
         if (this.protected_ == 0) {
            this.PD();
         } else if (this.break_ < -((Random)this.throws_[40]).nextInt(10)) {
            this.protected_--;
            this.break_ = 1;
            this.class_ = ((Random)this.throws_[40]).nextLong();
            this.class_(0);
         }
      }

      if (this.break_ >= 0) {
         if (!((rYB)this.throws_[7] instanceof rrEm_1)) {
            ((rYB)this.throws_[7]).byte_(2);
         } else if (!this.catch_) {
            double var6 = 3.0;
            List var3 = ((rYB)this.throws_[7])
               .break_(this, new rfl_3(this.rx() - 3.0, this.re() - 3.0, this.BO() - 3.0, this.rx() + 3.0, this.re() + 6.0 + 3.0, this.BO() + 3.0), an_3::BM);

            for (an_3 var5 : var3) {
               var5.class_((rrEm_1)((rYB)this.throws_[7]), this);
            }

            if (this.private_ != null) {
               Oo_1.char_.class_(this.private_, var3);
            }
         }
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
   }

   private void class_(int var1) {
      if (!this.catch_ && !((rYB)this.throws_[7]).continue_ && ((rYB)this.throws_[7]).B().break_(rRu_1.class_)) {
         rfH_2 var2 = this.Bs();
         xc_3 var3 = Jj_1.class_((rYB)this.throws_[7], var2);
         if (((rYB)this.throws_[7]).byte_(var2).catch_() && var3.class_((rRR)((rYB)this.throws_[7]), var2)) {
            ((rYB)this.throws_[7]).break_(var2, var3);
         }

         for (int var4 = 0; var4 < var1; var4++) {
            rfH_2 var5 = var2.break_(
               ((Random)this.throws_[40]).nextInt(3) - 1, ((Random)this.throws_[40]).nextInt(3) - 1, ((Random)this.throws_[40]).nextInt(3) - 1
            );
            var3 = Jj_1.class_((rYB)this.throws_[7], var5);
            if (((rYB)this.throws_[7]).byte_(var5).catch_() && var3.class_((rRR)((rYB)this.throws_[7]), var5)) {
               ((rYB)this.throws_[7]).break_(var5, var3);
            }
         }
      }
   }

   @Override
   public boolean class_(double var1) {
      double var3 = 64.0 * Br();
      return var1 < var3 * var3;
   }

   public void class_(boolean var1) {
      this.catch_ = var1;
   }

   @Override
   protected void break_(rcd_3 var1) {
   }

   public void protected_(rhN_2 var1) {
      this.private_ = var1;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.WEATHER;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
