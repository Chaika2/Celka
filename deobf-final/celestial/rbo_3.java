package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

public class rbo_3 extends rOl_1 {
   private static final rut_3<rfH_2> break_ = rmE_2.class_(rbo_3.class, ruw_3.native_);
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rbo_3.class, ruw_3.implements_);
   private static final rut_3<Integer> super_ = rmE_2.class_(rbo_3.class, ruw_3.break_);
   static final ay_3 this_ = new ay_3().class_(10.0).break_().class_().byte_();
   public static final Predicate<rsE_2> class_ = var0 -> !var0.package_() && var0.BM() && var0.rT();

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Pj;
   }

   public rbo_3(aI_2<? extends rbo_3> var1, rYB var2) {
      super(var1, var2);
      this.native_ = new rbK_2(this);
      this.extends_ = new rPj_1(this, 10);
      this.byte_(true);
   }

   @Override
   public int S() {
      return 1;
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.c()) {
         this.throws_(this.ri());
      } else {
         if (this.Pk()) {
            this.break_(2400);
         } else {
            this.break_(this.n() - 1);
            if (this.n() <= 0) {
               this.break_(rye_3.this_, 1.0F);
            }

            if ((Boolean)this.throws_[20]) {
               this.byte_(
                  this.rv()
                     .break_(
                        (double)((((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * 0.2F),
                        0.5,
                        (double)((((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * 0.2F)
                     )
               );
               Float var10 = ((Random)this.throws_[40]).nextFloat() * 360.0F;
               this.throws_[15] = var10;
               Boolean var11 = false;
               this.throws_[20] = var11;
               Boolean var12 = true;
               this.throws_[57] = var12;
            }
         }

         if (((rYB)this.throws_[7]).continue_ && this.rT() && this.rv().catch_() > 0.03) {
            rjU_2 var1 = this.break_(0.0F);
            float var2 = rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * 0.3F;
            float var3 = rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * 0.3F;
            float var4 = 1.2F - ((Random)this.throws_[40]).nextFloat() * 0.7F;

            for (int var5 = 0; var5 < 2; var5++) {
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.X,
                     this.rx() - var1.break_ * (double)var4 + (double)var2,
                     this.re() - var1.byte_,
                     this.BO() - var1.protected_ * (double)var4 + (double)var3,
                     0.0,
                     0.0,
                     0.0
                  );
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.X,
                     this.rx() - var1.break_ * (double)var4 - (double)var2,
                     this.re() - var1.byte_,
                     this.BO() - var1.protected_ * (double)var4 - (double)var3,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      }
   }

   public int n() {
      return ((rmE_2)this.throws_[49]).class_(super_);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 38) {
         this.class_(rLQ.char_);
      } else {
         super.class_(var1);
      }
   }

   private void class_(rLx_1 var1) {
      for (int var2 = 0; var2 < 7; var2++) {
         double var3 = ((Random)this.throws_[40]).nextGaussian() * 0.01;
         double var5 = ((Random)this.throws_[40]).nextGaussian() * 0.01;
         double var7 = ((Random)this.throws_[40]).nextGaussian() * 0.01;
         ((rYB)this.throws_[7]).class_(var1, this.break_(1.0), this.Ph() + 0.2, this.protected_(1.0), var3, var5, var7);
      }
   }

   @Override
   protected void class_(int var1) {
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.throws_(this.ri());
      Float var10 = 0.0F;
      this.throws_[16] = var10;
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("TreasurePosX", this.throws_().b_());
      var1.break_("TreasurePosY", this.throws_().c_());
      var1.break_("TreasurePosZ", this.throws_().d_());
      var1.class_("GotFish", this.L());
      var1.break_("Moistness", this.n());
   }

   @Override
   public int r() {
      return 1;
   }

   @Override
   protected void break_(rsE_2 var1) {
      if (this.class_(rXQ.MAINHAND).class_()) {
         rdn_3 var2 = var1.protected_();
         if (this.private_(var2)) {
            this.class_(var1);
            this.class_(rXQ.MAINHAND, var2);
            this.new_[rXQ.MAINHAND.break_()] = 2.0F;
            this.class_(var1, var2.char_());
            var1.PD();
         }
      }
   }

   public static boolean break_(aI_2<rbo_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (var3.c_() > 45 && var3.c_() < var1.short_()) {
         Optional var5 = var1.protected_(var3);
         return (!Objects.equals(var5, Optional.of(rYl_1.class_)) || !Objects.equals(var5, Optional.of(rYl_1.goto_))) && var1.break_(var3).class_(rlG_2.break_);
      } else {
         return false;
      }
   }

   @Override
   protected ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (!var3.class_() && var3.break_().class_(rlc_3.switch_)) {
         if (!((rYB)this.throws_[7]).continue_) {
            this.class_(rqn_3.Pf, 1.0F, 1.0F);
         }

         this.this_(true);
         if (!((rhx_3)var1.implements_[18]).protected_) {
            var3.catch_(1);
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      int var2 = var1.private_("TreasurePosX");
      int var3 = var1.private_("TreasurePosY");
      int var4 = var1.private_("TreasurePosZ");
      this.implements_(new rfH_2(var2, var3, var4));
      super.break_(var1);
      this.this_(var1.new_("GotFish"));
      this.break_(var1.private_("Moistness"));
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rLw_1(this, var1);
   }

   public void break_(int var1) {
      ((rmE_2)this.throws_[49]).break_(super_, var1);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.3F;
   }

   public rfH_2 throws_() {
      return ((rmE_2)this.throws_[49]).class_(break_);
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      rXQ var2 = is_3.finally_(var1);
      return !this.class_(var2).class_() ? false : var2 == rXQ.MAINHAND && super.throws_(var1);
   }

   public boolean L() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   protected boolean sx() {
      rfH_2 var1 = this.public_().catch_();
      return var1 != null ? var1.class_(this.Ps(), 12.0) : false;
   }

   public void implements_(rfH_2 var1) {
      ((rmE_2)this.throws_[49]).break_(break_, var1);
   }

   @Override
   protected boolean new_(an_3 var1) {
      return true;
   }

   @Override
   protected int new_(int var1) {
      return this.ri();
   }

   @Override
   protected rqA_2 static_() {
      return this.rT() ? rqn_3.Pt : rqn_3.PT;
   }

   @Override
   public boolean public_(an_3 var1) {
      boolean var2 = var1.break_(rye_3.byte_(this), (float)((int)this.class_(iQ_2.case_)));
      if (var2) {
         this.class_(this, var1);
         this.class_(rqn_3.Pw, 1.0F, 1.0F);
      }

      return var2;
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return true;
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.try_() && this.rT()) {
         this.class_(this.sB(), var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.9));
         if (this.I_() == null) {
            this.byte_(this.rv().break_(0.0, -0.005, 0.0));
         }
      } else {
         super.private_(var1);
      }
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rBr_1(this));
      this.package_.class_(0, new rBM(this));
      this.package_.class_(1, new rbU_2(this));
      this.package_.class_(2, new rbe_3(this, 4.0));
      this.package_.class_(4, new rBD(this, 1.0, 10));
      this.package_.class_(4, new rBC(this));
      this.package_.class_(5, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(5, new rBG(this, 10));
      this.package_.class_(6, new rBl_1(this, 1.2F, true));
      this.package_.class_(8, new rbD_2(this));
      this.package_.class_(8, new rBh_1(this));
      this.package_.class_(9, new rPD<>(this, rEI.class, 8.0F, 1.0, 1.0));
      this.int_.class_(1, new rBc_1(this, rEI.class).class_());
   }

   @Override
   public int ri() {
      return 4800;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.PY;
   }

   @Override
   protected rqA_2 BJ() {
      return rqn_3.PR;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.PI;
   }

   public static iz_3 sJ() {
      return is_3.package_().class_(iQ_2.class_, 10.0).class_(iQ_2.protected_, 1.2F).class_(iQ_2.case_, 3.0);
   }

   @Override
   public boolean SO() {
      return false;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(break_, rfH_2.protected_);
      ((rmE_2)this.throws_[49]).class_(protected_, false);
      ((rmE_2)this.throws_[49]).class_(super_, 2400);
   }
}
