package celestial;

import java.util.Random;

public class rEO extends rEi_1 {
   private float class_ = 0.5F;
   private int break_;
   private static final rut_3<Byte> protected_ = rmE_2.class_(rEO.class, ruw_3.class_);

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.K;
   }

   @Override
   protected void double_() {
      this.break_--;
      if (this.break_ <= 0) {
         this.break_ = 100;
         this.class_ = 0.5F + (float)((Random)this.throws_[40]).nextGaussian() * 3.0F;
      }

      iB_2 var1 = this.I_();
      if (var1 != null && var1.rH() > this.rH() + (double)this.class_ && this.catch_(var1)) {
         rjU_2 var2 = this.rv();
         this.byte_(this.rv().break_(0.0, (0.3F - var2.byte_) * 0.3F, 0.0));
         Boolean var7 = true;
         this.throws_[57] = var7;
      }

      super.double_();
   }

   public rEO(aI_2<? extends rEO> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.WATER, -1.0F);
      this.class_(rLp_1.LAVA, 8.0F);
      this.class_(rLp_1.DANGER_FIRE, 0.0F);
      this.class_(rLp_1.DAMAGE_FIRE, 0.0F);
      this.finally_ = 10;
   }

   void this_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(protected_);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      ((rmE_2)this.throws_[49]).break_(protected_, var2);
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   public void default_() {
      if (!(Boolean)this.throws_[20] && this.rv().byte_ < 0.0) {
         this.byte_(this.rv().throws_(1.0, 0.6, 1.0));
      }

      if (((rYB)this.throws_[7]).continue_) {
         if (((Random)this.throws_[40]).nextInt(24) == 0 && !this.BF()) {
            ((rYB)this.throws_[7])
               .class_(
                  this.rx() + 0.5,
                  this.re() + 0.5,
                  this.BO() + 0.5,
                  rqn_3.Y,
                  this.Pr(),
                  1.0F + ((Random)this.throws_[40]).nextFloat(),
                  ((Random)this.throws_[40]).nextFloat() * 0.7F + 0.3F,
                  false
               );
         }

         for (int var1 = 0; var1 < 2; var1++) {
            ((rYB)this.throws_[7]).class_(rLQ.short_, this.break_(0.5), this.Ph(), this.protected_(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.default_();
   }

   public static iz_3 throws_() {
      return rEi_1.sm().class_(iQ_2.case_, 6.0).class_(iQ_2.protected_, 0.23F).class_(iQ_2.break_, 48.0);
   }

   private boolean L() {
      return (((rmE_2)this.throws_[49]).class_(protected_) & 1) != 0;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.R;
   }

   @Override
   protected void final_() {
      this.package_.class_(4, new rEh_1(this));
      this.package_.class_(5, new rBT(this, 1.0));
      this.package_.class_(7, new rSk_1(this, 1.0, 0.0F));
      this.package_.class_(8, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(8, new rBC(this));
      this.int_.class_(1, new rBc_1(this).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public boolean Pz() {
      return this.L();
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.o;
   }

   @Override
   public boolean BU() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(protected_, (byte)0);
   }
}
