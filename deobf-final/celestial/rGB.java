package celestial;

import java.util.Random;

public class rGB extends aV_2 implements rEK {
   private static final rut_3<Integer> class_ = rmE_2.class_(rGB.class, ruw_3.break_);
   rjU_2 break_ = rjU_2.class_;
   rfH_2 protected_;
   rGS super_;

   @Override
   protected boolean boolean_() {
      return true;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.OR;
   }

   @Override
   protected void double_() {
      super.double_();
   }

   public rGB(aI_2<? extends rGB> var1, rYB var2) {
      super(var1, var2);
      this.protected_ = rfH_2.protected_;
      this.super_ = rGS.CIRCLE;
      this.finally_ = 5;
      this.native_ = new rGM(this, this);
      this.extends_ = new rGG(this, this);
   }

   @Override
   public void this_() {
      super.this_();
      if (((rYB)this.throws_[7]).continue_) {
         float var1 = rfU_2.break_((float)(this.V() * 3 + (Integer)this.throws_[41]) * 0.13F + (float) Math.PI);
         float var2 = rfU_2.break_((float)(this.V() * 3 + (Integer)this.throws_[41] + 1) * 0.13F + (float) Math.PI);
         if (var1 > 0.0F && var2 <= 0.0F) {
            ((rYB)this.throws_[7])
               .class_(
                  this.rx(),
                  this.re(),
                  this.BO(),
                  rqn_3.Og,
                  this.Pr(),
                  0.95F + ((Random)this.throws_[40]).nextFloat() * 0.05F,
                  0.95F + ((Random)this.throws_[40]).nextFloat() * 0.05F,
                  false
               );
         }

         int var3 = this.throws_();
         float var4 = rfU_2.break_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var3);
         float var5 = rfU_2.class_((Float)this.throws_[15] * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var3);
         float var6 = (0.3F + var1 * 0.45F) * ((float)var3 * 0.2F + 1.0F);
         ((rYB)this.throws_[7]).class_(rLQ.const_, this.rx() + (double)var4, this.re() + (double)var6, this.BO() + (double)var5, 0.0, 0.0, 0.0);
         ((rYB)this.throws_[7]).class_(rLQ.const_, this.rx() - (double)var4, this.re() + (double)var6, this.BO() - (double)var5, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.protected_ = this.Bs().break_(5);
      this.class_(0);
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("AX", this.protected_.b_());
      var1.break_("AY", this.protected_.c_());
      var1.break_("AZ", this.protected_.d_());
      var1.break_("Size", this.throws_());
   }

   @Override
   public boolean class_(double var1) {
      return true;
   }

   @Override
   public boolean class_(aI_2<?> var1) {
      return true;
   }

   public void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(class_, rfU_2.class_(var1, 0, 64));
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (class_.equals(var1)) {
         this.catch_();
      }

      super.class_(var1);
   }

   @Override
   public void default_() {
      if (this.BM() && this.F()) {
         this.case_(8);
      }

      super.default_();
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.35F;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.throws_("AX")) {
         this.protected_ = new rfH_2(var1.private_("AX"), var1.private_("AY"), var1.private_("AZ"));
      }

      this.class_(var1.private_("Size"));
   }

   public int throws_() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   private void catch_() {
      this.q_();
      this.byte_(iQ_2.case_).class_((double)(6 + this.throws_()));
   }

   @Override
   protected rPf_1 new_() {
      return new rGE(this, this);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Of;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rGh_1(this));
      this.package_.class_(2, new rGX(this));
      this.package_.class_(3, new rGO(this));
      this.int_.class_(1, new rGs_1(this));
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.OV;
   }

   @Override
   public aL_2 sG() {
      return aL_2.break_;
   }

   @Override
   protected float Si() {
      return 1.0F;
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      int var2 = this.throws_();
      ap_3 var3 = super.a_(var1);
      float var4 = (var3.class_ + 0.2F * (float)var2) / var3.class_;
      return var3.class_(var4);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, 0);
   }
}
