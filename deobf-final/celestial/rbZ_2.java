package celestial;

import java.util.Random;
import java.util.UUID;

public abstract class rbZ_2 extends au_3 {
   private int super_;
   private UUID this_;

   @Override
   public int char_() {
      return 120;
   }

   @Override
   protected int byte_(rhd_3 var1) {
      return 1 + ((rYB)this.throws_[7]).int_.nextInt(3);
   }

   public static boolean byte_(aI_2<? extends rbZ_2> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.byte_(var3.break_()).class_(xu_3.implements_) && var1.class_(var3, 0) > 8;
   }

   @Override
   protected void double_() {
      if (this.O_() != 0) {
         this.super_ = 0;
      }

      super.double_();
   }

   protected rbZ_2(aI_2<? extends rbZ_2> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.DANGER_FIRE, 16.0F);
      this.class_(rLp_1.DAMAGE_FIRE, -1.0F);
      this.private_(3);
   }

   public void this_(int var1) {
      this.super_ = var1;
   }

   protected void class_(rhd_3 var1, rdn_3 var2) {
      if (!((rhx_3)var1.implements_[18]).protected_) {
         var2.catch_(1);
      }
   }

   public void class_(rrEm_1 var1, rbZ_2 var2) {
      au_3 var3 = this.class_(var1, (au_3)var2);
      if (var3 != null) {
         rhN_2 var4 = this.sz();
         if (var4 == null && var2.sz() != null) {
            var4 = var2.sz();
         }

         if (var4 != null) {
            var4.break_(rlB_2.strictfp_);
            Oo_1.package_.class_(var4, this, var2, var3);
         }

         this.e_(6000);
         var2.e_(6000);
         this.sN();
         var2.sN();
         var3.class_(true);
         var3.class_(this.rx(), this.re(), this.BO(), 0.0F, 0.0F);
         var1.class_(var3);
         var1.class_(this, (byte)18);
         if (var1.B().break_(rRu_1.throws_)) {
            var1.a_(new rsP_2(var1, this.rx(), this.re(), this.BO(), this.Sa().nextInt(7) + 1));
         }
      }
   }

   public boolean class_(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else {
         return var1.getClass() != this.getClass() ? false : this.sQ() && var1.sQ();
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 18) {
         for (int var2 = 0; var2 < 7; var2++) {
            double var3 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var5 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var7 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            ((rYB)this.throws_[7]).class_(rLQ.long_, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), var3, var5, var7);
         }
      } else {
         super.class_(var1);
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("InLove", this.super_);
      if (this.this_ != null) {
         var1.class_("LoveCause", this.this_);
      }
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      return var2.byte_(var1.break_()).class_(xu_3.implements_) ? 10.0F : var2.native_(var1) - 0.5F;
   }

   @Override
   public void default_() {
      super.default_();
      if (this.O_() != 0) {
         this.super_ = 0;
      }

      if (this.super_ > 0) {
         this.super_--;
         if (this.super_ % 10 == 0) {
            double var1 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var3 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            double var5 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
            ((rYB)this.throws_[7]).class_(rLQ.long_, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), var1, var3, var5);
         }
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.super_ = var1.private_("InLove");
      this.this_ = var1.break_("LoveCause") ? var1.class_("LoveCause") : null;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         this.super_ = 0;
         return super.break_(var1, var2);
      }
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (this.extends_(var3)) {
         int var4 = this.O_();
         if (!((rYB)this.throws_[7]).continue_ && var4 == 0 && this.sk()) {
            this.class_(var1, var3);
            this.throws_(var1);
            return ryZ_2.SUCCESS;
         }

         if (this.n_()) {
            this.class_(var1, var3);
            this.class_((int)((float)(-var4 / 20) * 0.1F), true);
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }

         if (((rYB)this.throws_[7]).continue_) {
            return ryZ_2.CONSUME;
         }
      }

      return super.break_(var1, var2);
   }

   public void throws_(rhd_3 var1) {
      this.super_ = 600;
      if (var1 != null) {
         this.this_ = var1.ro();
      }

      ((rYB)this.throws_[7]).class_(this, (byte)18);
   }

   public boolean sk() {
      return this.super_ <= 0;
   }

   public boolean extends_(rdn_3 var1) {
      return var1.break_() == rdy_3.hB;
   }

   @Override
   public boolean private_(double var1) {
      return false;
   }

   public rhN_2 sz() {
      if (this.this_ == null) {
         return null;
      } else {
         rhd_3 var1 = ((rYB)this.throws_[7]).class_(this.this_);
         return var1 instanceof rhN_2 ? (rhN_2)var1 : null;
      }
   }

   @Override
   public double Pv() {
      return 0.14;
   }

   public void sN() {
      this.super_ = 0;
   }

   public int sW() {
      return this.super_;
   }

   public boolean sQ() {
      return this.super_ > 0;
   }
}
