package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class rGA extends is_3 implements rEK {
   private static final rut_3<Integer> super_ = rmE_2.class_(rGA.class, ruw_3.break_);
   public float class_;
   public float break_;
   public float protected_;
   private boolean this_;

   @Override
   protected boolean boolean_() {
      return this.sk() > 0;
   }

   @Override
   public void byte_(an_3 var1) {
      super.byte_(var1);
      if (var1 instanceof rMZ && this.n()) {
         this.private_((iB_2)var1);
      }
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return this.sW() ? rqn_3.xW : rqn_3.Jf;
   }

   public static boolean byte_(aI_2<rGA> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (var1.abstract_() != rRO.PEACEFUL) {
         if (Objects.equals(var1.protected_(var3), Optional.of(rYl_1.catch_))
            && var3.c_() > 50
            && var3.c_() < 70
            && var4.nextFloat() < 0.5F
            && var4.nextFloat() < var1.interface_()
            && var1.package_(var3) <= var4.nextInt(8)) {
            return class_(var0, var1, var2, var3, var4);
         }

         if (!(var1 instanceof rRI)) {
            return false;
         }

         rfj_3 var5 = new rfj_3(var3);
         boolean var6 = rqm_3.class_(var5.break_, var5.byte_, ((rRI)var1).break_(), 987234911L).nextInt(10) == 0;
         if (var4.nextInt(10) == 0 && var6 && var3.c_() < 40) {
            return class_(var0, var1, var2, var3, var4);
         }
      }

      return false;
   }

   public rGA(aI_2<? extends rGA> var1, rYB var2) {
      super(var1, var2);
      this.native_ = new rGy_1(this);
   }

   @Override
   public void this_() {
      this.break_ = this.break_ + (this.class_ - this.break_) * 0.5F;
      this.protected_ = this.break_;
      super.this_();
      if ((Boolean)this.throws_[20] && !this.this_) {
         int var1 = this.sk();

         for (int var2 = 0; var2 < var1 * 8; var2++) {
            float var3 = ((Random)this.throws_[40]).nextFloat() * (float) (Math.PI * 2);
            float var4 = ((Random)this.throws_[40]).nextFloat() * 0.5F + 0.5F;
            float var5 = rfU_2.class_(var3) * (float)var1 * 0.5F * var4;
            float var6 = rfU_2.break_(var3) * (float)var1 * 0.5F * var4;
            ((rYB)this.throws_[7]).class_(this.catch_(), this.rx() + (double)var5, this.re(), this.BO() + (double)var6, 0.0, 0.0, 0.0);
         }

         this.class_(this.sx(), this.Si(), ((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F) / 0.8F);
         this.class_ = -0.5F;
      } else if (!(Boolean)this.throws_[20] && this.this_) {
         this.class_ = 1.0F;
      }

      this.this_ = (Boolean)this.throws_[20];
      this.L();
   }

   @Override
   protected boolean n() {
      return !this.sW() && this.try_();
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (super_.equals(var1)) {
         this.q_();
         Float var6 = (Float)this.private_[25];
         this.throws_[15] = var6;
         Float var7 = (Float)this.private_[25];
         this.private_[23] = var7;
         if (this.rT() && ((Random)this.throws_[40]).nextInt(20) == 0) {
            this.U();
         }
      }

      super.class_(var1);
   }

   protected void class_(int var1, boolean var2) {
      ((rmE_2)this.throws_[49]).break_(super_, var1);
      this.PX();
      this.q_();
      this.byte_(iQ_2.class_).class_((double)(var1 * var1));
      this.byte_(iQ_2.protected_).class_((double)(0.2F + 0.1F * (float)var1));
      this.byte_(iQ_2.case_).class_((double)var1);
      if (var2) {
         this.public_(this.SK());
      }

      this.finally_ = var1;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      int var6 = ((Random)this.throws_[40]).nextInt(3);
      if (var6 < 2 && ((Random)this.throws_[40]).nextFloat() < 0.5F * var2.byte_()) {
         var6++;
      }

      int var7 = 1 << var6;
      this.class_(var7, true);
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Size", this.sk() - 1);
      var1.class_("wasOnGround", this.this_);
   }

   protected rqA_2 sd() {
      return this.sW() ? rqn_3.xz : rqn_3.Jj;
   }

   @Override
   protected rqO_2 short_() {
      return this.sk() == 1 ? this.BC().finally_() : rzl_3.class_;
   }

   @Override
   public int r() {
      return 0;
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.625F * var2.break_;
   }

   @Override
   public void break_(rcd_3 var1) {
      int var2 = var1.private_("Size");
      if (var2 < 0) {
         var2 = 0;
      }

      this.class_(var2 + 1, false);
      super.break_(var1);
      this.this_ = var1.new_("wasOnGround");
   }

   float throws_() {
      float var1 = this.sW() ? 1.4F : 0.8F;
      return ((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F) * var1;
   }

   @Override
   protected void L() {
      this.class_ *= 0.6F;
   }

   protected rqA_2 sx() {
      return this.sW() ? rqn_3.xQ : rqn_3.JV;
   }

   public int sk() {
      return ((rmE_2)this.throws_[49]).class_(super_);
   }

   @Override
   public void PD() {
      int var1 = this.sk();
      if (!((rYB)this.throws_[7]).continue_ && var1 > 1 && this.Sl()) {
         rgP_2 var2 = this.rD();
         boolean var3 = this.c();
         float var4 = (float)var1 / 4.0F;
         int var5 = var1 / 2;
         int var6 = 2 + ((Random)this.throws_[40]).nextInt(3);

         for (int var7 = 0; var7 < var6; var7++) {
            float var8 = ((float)(var7 % 2) - 0.5F) * var4;
            float var9 = ((float)(var7 / 2) - 0.5F) * var4;
            rGA var10 = this.BC().class_((rYB)this.throws_[7]);
            if (this.O()) {
               var10.b();
            }

            var10.break_(var2);
            var10.protected_(var3);
            var10.catch_(this.rg());
            var10.class_(var5, true);
            var10.class_(this.rx() + (double)var8, this.re() + 0.5, this.BO() + (double)var9, ((Random)this.throws_[40]).nextFloat() * 360.0F, 0.0F);
            ((rYB)this.throws_[7]).a_(var10);
         }
      }

      super.PD();
   }

   protected rLx_1 catch_() {
      return rLQ.static_;
   }

   @Override
   protected void continue_(boolean var1) {
      rjU_2 var2 = this.rv();
      this.catch_(var2.break_, (double)this.ST(), var2.protected_);
      Boolean var7 = true;
      this.throws_[57] = var7;
   }

   protected int implements_() {
      return ((Random)this.throws_[40]).nextInt(20) + 10;
   }

   protected void private_(iB_2 var1) {
      if (this.BM()) {
         int var2 = this.sk();
         if (this.int_(var1) < 0.6 * (double)var2 * 0.6 * (double)var2 && this.while_(var1) && var1.break_(rye_3.byte_(this), this.sJ())) {
            this.class_(rqn_3.Jw, 1.0F, (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
            this.class_(this, var1);
         }
      }
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rGl_1(this));
      this.package_.class_(2, new rGn_1(this));
      this.package_.class_(3, new rGC(this));
      this.package_.class_(5, new rGH(this));
      this.int_.class_(1, new rBI<>(this, rhd_3.class, 10, true, false, var1 -> Math.abs(var1.re() - this.re()) <= 4.0));
      this.int_.class_(3, new rBI<>(this, rMZ.class, true));
   }

   protected boolean sz() {
      return this.sk() > 0;
   }

   @Override
   public aI_2<? extends rGA> BC() {
      return (aI_2<? extends rGA>)super.BC();
   }

   @Override
   protected rqA_2 Bt() {
      return this.sW() ? rqn_3.xk : rqn_3.JI;
   }

   protected float sJ() {
      return (float)this.class_(iQ_2.case_);
   }

   public boolean sW() {
      return this.sk() <= 1;
   }

   @Override
   protected float Si() {
      return 0.4F * (float)this.sk();
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return super.a_(var1).class_(0.255F * (float)this.sk());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, 1);
   }

   @Override
   public void q_() {
      double var1 = this.rx();
      double var3 = this.re();
      double var5 = this.BO();
      super.q_();
      this.new_(var1, var3, var5);
   }

   @Override
   public void c_(rhd_3 var1) {
      if (this.n()) {
         this.private_(var1);
      }
   }
}
