package celestial;

import java.util.Collection;
import java.util.Random;

public class rEJ extends rEi_1 implements aR_2 {
   private static final rut_3<Integer> class_ = rmE_2.class_(rEJ.class, ruw_3.break_);
   private static final rut_3<Boolean> break_ = rmE_2.class_(rEJ.class, ruw_3.implements_);
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rEJ.class, ruw_3.implements_);
   private int super_;
   private int this_;
   private int else_ = 30;
   private int synchronized_ = 3;
   private int return_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Pc;
   }

   public rEJ(aI_2<? extends rEJ> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      if (this.BM()) {
         this.super_ = this.this_;
         if (this.sJ()) {
            this.class_(1);
         }

         int var1 = this.L();
         if (var1 > 0 && this.this_ == 0) {
            this.class_(rqn_3.Pu, 1.0F, 0.5F);
         }

         this.this_ += var1;
         if (this.this_ < 0) {
            this.this_ = 0;
         }

         if (this.this_ >= this.else_) {
            this.this_ = this.else_;
            this.sz();
         }
      }

      super.this_();
   }

   @Override
   public boolean class_() {
      return ((rmE_2)this.throws_[49]).class_(break_);
   }

   @Override
   protected void class_(rye_3 var1, int var2, boolean var3) {
      super.class_(var1, var2, var3);
      an_3 var4 = var1.extends_();
      if (var4 != this && var4 instanceof rEJ var5 && var5.sd()) {
         var5.sk();
         this.class_(rdy_3.dd);
      }
   }

   public void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   @Override
   public boolean class_(float var1, float var2) {
      boolean var3 = super.class_(var1, var2);
      this.this_ = (int)((float)this.this_ + var1 * 1.5F);
      if (this.this_ > this.else_ - 5) {
         this.this_ = this.else_ - 5;
      }

      return var3;
   }

   @Override
   public void class_(rrEm_1 var1, rSg_1 var2) {
      super.class_(var1, var2);
      ((rmE_2)this.throws_[49]).break_(break_, true);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (((rmE_2)this.throws_[49]).class_(break_)) {
         var1.class_("powered", true);
      }

      var1.class_("Fuse", (short)this.else_);
      var1.class_("ExplosionRadius", (byte)this.synchronized_);
      var1.class_("ignited", this.sJ());
   }

   public boolean sd() {
      return this.class_() && this.return_ < 1;
   }

   @Override
   protected ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.OG) {
         ((rYB)this.throws_[7]).class_(var1, this.rx(), this.re(), this.BO(), rqn_3.Sc, this.Pr(), 1.0F, ((Random)this.throws_[40]).nextFloat() * 0.4F + 0.8F);
         if (!((rYB)this.throws_[7]).continue_) {
            this.sx();
            var3.class_(1, var1, var1x -> var1x.byte_(var2));
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      ((rmE_2)this.throws_[49]).break_(break_, var1.new_("powered"));
      if (var1.byte_("Fuse", 99)) {
         this.else_ = var1.catch_("Fuse");
      }

      if (var1.byte_("ExplosionRadius", 99)) {
         this.synchronized_ = var1.case_("ExplosionRadius");
      }

      if (var1.new_("ignited")) {
         this.sx();
      }
   }

   public static iz_3 throws_() {
      return rEi_1.sm().class_(iQ_2.protected_, 0.25);
   }

   public int L() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   public void sx() {
      ((rmE_2)this.throws_[49]).break_(protected_, true);
   }

   public void sk() {
      this.return_++;
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, (float)this.super_, (float)this.this_) / (float)(this.else_ - 2);
   }

   @Override
   public boolean public_(an_3 var1) {
      return true;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(2, new rBs_1(this));
      this.package_.class_(3, new rPD<>(this, rMA.class, 6.0F, 1.0, 1.2));
      this.package_.class_(3, new rPD<>(this, rbf_3.class, 6.0F, 1.0, 1.2));
      this.package_.class_(4, new rBl_1(this, 1.0, false));
      this.package_.class_(5, new rSk_1(this, 0.8));
      this.package_.class_(6, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(6, new rBC(this));
      this.int_.class_(1, new rBI<>(this, rhd_3.class, true));
      this.int_.class_(2, new rBc_1(this));
   }

   private void sz() {
      if (!((rYB)this.throws_[7]).continue_) {
         rRz_1 var1 = ((rYB)this.throws_[7]).B().break_(rRu_1.break_) ? rRz_1.DESTROY : rRz_1.NONE;
         float var2 = this.class_() ? 2.0F : 1.0F;
         Boolean var7 = true;
         this.private_[32] = var7;
         ((rYB)this.throws_[7]).class_(this, this.rx(), this.re(), this.BO(), (float)this.synchronized_ * var2, var1);
         this.PD();
         this.sQ();
      }
   }

   @Override
   public int rp() {
      return this.I_() == null ? 3 : 3 + (int)(this.Ss() - 1.0F);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.PN;
   }

   public boolean sJ() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   public int sW() {
      return this.synchronized_;
   }

   private void sQ() {
      Collection var1 = this.So();
      if (!var1.isEmpty()) {
         aZ_2 var2 = new aZ_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO());
         var2.byte_(2.5F);
         var2.protected_(-0.5F);
         var2.byte_(10);
         var2.break_(var2.private_() / 2);
         var2.catch_(-var2.protected_() / (float)var2.private_());

         for (rLY var4 : var1) {
            var2.class_(new rLY(var4));
         }

         ((rYB)this.throws_[7]).a_(var2);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, -1);
      ((rmE_2)this.throws_[49]).class_(break_, false);
      ((rmE_2)this.throws_[49]).class_(protected_, false);
   }
}
