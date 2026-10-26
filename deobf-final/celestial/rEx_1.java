package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class rEx_1 extends rbB_2 implements aa_3 {
   boolean protected_;
   protected final rLw_1 class_;
   protected final rLA break_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return this.rT() ? rqn_3.Bs : rqn_3.BS;
   }

   public rEx_1(aI_2<? extends rEx_1> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.throws_[37] = var7;
      this.native_ = new rEz_1(this);
      this.class_(rLp_1.WATER, 0.0F);
      this.class_ = new rLw_1(this, var2);
      this.break_ = new rLA(this, var2);
   }

   public void this_(boolean var1) {
      this.protected_ = var1;
   }

   @Override
   protected boolean class_(rdn_3 var1, rdn_3 var2) {
      if (var2.break_() == rdy_3.kK) {
         return false;
      } else if (var2.break_() == rdy_3.kY) {
         return var1.break_() == rdy_3.kY ? var1.catch_() < var2.catch_() : false;
      } else {
         return var1.break_() == rdy_3.kY ? true : super.class_(var1, var2);
      }
   }

   @Override
   protected void class_(rRh_1 var1) {
      if ((double)((Random)this.throws_[40]).nextFloat() > 0.9) {
         int var2 = ((Random)this.throws_[40]).nextInt(16);
         if (var2 < 10) {
            this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.kY));
         } else {
            this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Xd));
         }
      }
   }

   @Override
   public boolean class_(rRR var1) {
      return var1.protected_(this);
   }

   public static boolean class_(aI_2<rEx_1> var0, rRf_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      Optional var5 = var1.protected_(var3);
      boolean var6 = var1.abstract_() != rRO.PEACEFUL && class_(var1, var3, var4) && (var2 == iO_2.SPAWNER || var1.break_(var3).class_(rlG_2.break_));
      return !Objects.equals(var5, Optional.of(rYl_1.private_)) && !Objects.equals(var5, Optional.of(rYl_1.native_))
         ? var4.nextInt(40) == 0 && class_(var1, var3) && var6
         : var4.nextInt(15) == 0 && var6;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.class_(var1, var2, var3, var4, var5);
      if (this.class_(rXQ.OFFHAND).class_() && ((Random)this.throws_[40]).nextFloat() < 0.03F) {
         this.class_(rXQ.OFFHAND, new rdn_3(rdy_3.kK));
         this.new_[rXQ.OFFHAND.break_()] = 2.0F;
      }

      return var4;
   }

   private static boolean class_(rRg_1 var0, rfH_2 var1) {
      return var1.c_() < var0.short_() - 5;
   }

   @Override
   public void p() {
      if (!((rYB)this.throws_[7]).continue_) {
         if (this.try_() && this.rT() && this.su()) {
            this.final_ = this.class_;
            this.native_(true);
         } else {
            this.final_ = this.break_;
            this.native_(false);
         }
      }
   }

   @Override
   protected boolean sd() {
      return false;
   }

   @Override
   public boolean u() {
      return !this.Py();
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      rhD_2 var3 = new rhD_2((rYB)this.throws_[7], this, new rdn_3(rdy_3.kY));
      double var4 = var1.rx() - this.rx();
      double var6 = var1.byte_(0.3333333333333333) - var3.re();
      double var8 = var1.BO() - this.BO();
      double var10 = (double)rfU_2.class_(var4 * var4 + var8 * var8);
      var3.byte_(var4, var6 + var10 * 0.2F, var8, 1.6F, (float)(14 - ((rYB)this.throws_[7]).abstract_().class_() * 4));
      this.class_(rqn_3.BE, 1.0F, 1.0F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.throws_[7]).a_(var3);
   }

   @Override
   protected void throws_() {
      this.package_.class_(1, new rEW(this, 1.0));
      this.package_.class_(2, new rEN(this, 1.0, 40, 10.0F));
      this.package_.class_(2, new rEd_1(this, 1.0, false));
      this.package_.class_(5, new rEk_1(this, 1.0));
      this.package_.class_(6, new rEQ(this, 1.0, ((rYB)this.throws_[7]).short_()));
      this.package_.class_(7, new rBU(this, 1.0));
      this.int_.class_(1, new rBc_1(this, rEx_1.class).class_(rbG_2.class));
      this.int_.class_(2, new rBI<>(this, rhd_3.class, 10, true, false, this::private_));
      this.int_.class_(3, new rBI<>(this, rsy_3.class, false));
      this.int_.class_(3, new rBI<>(this, rMZ.class, true));
      this.int_.class_(5, new rBI<>(this, rON.class, 10, true, false, rON.super_));
   }

   @Override
   protected boolean L() {
      return false;
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.break_;
   }

   protected boolean sk() {
      rLC var1 = this.public_().finally_();
      if (var1 != null) {
         rfH_2 var2 = var1.volatile_();
         if (var2 != null) {
            double var3 = this.class_((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
            if (var3 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected rqA_2 static_() {
      return this.rT() ? rqn_3.Br : rqn_3.Pi;
   }

   public boolean private_(iB_2 var1) {
      return var1 == null ? false : !((rYB)this.throws_[7]).strictfp_() || var1.rT();
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.try_() && this.rT() && this.su()) {
         this.class_(0.01F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.9));
      } else {
         super.private_(var1);
      }
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.Bb;
   }

   @Override
   protected rqA_2 Bt() {
      return this.rT() ? rqn_3.BB : rqn_3.BP;
   }

   @Override
   protected rqA_2 sJ() {
      return rqn_3.BG;
   }

   boolean su() {
      if (this.protected_) {
         return true;
      } else {
         iB_2 var1 = this.I_();
         return var1 != null && var1.rT();
      }
   }
}
