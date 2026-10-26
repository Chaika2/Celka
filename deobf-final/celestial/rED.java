package celestial;

import java.util.Random;

public class rED extends rGp_1 implements aa_3 {
   private int super_;
   private final rjU_2[][] this_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.EZ;
   }

   public rED(aI_2<? extends rED> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 5;
      this.this_ = new rjU_2[2][4];

      for (int var3 = 0; var3 < 4; var3++) {
         this.this_[0][var3] = rjU_2.class_;
         this.this_[1][var3] = rjU_2.class_;
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.OM));
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(int var1, boolean var2) {
   }

   @Override
   protected rqA_2 sc() {
      return rqn_3.Eu;
   }

   @Override
   public void default_() {
      super.default_();
      if (((rYB)this.throws_[7]).continue_ && this.Pp()) {
         this.super_--;
         if (this.super_ < 0) {
            this.super_ = 0;
         }

         if ((Integer)this.private_[10] != 1 && (Integer)this.throws_[41] % 1200 != 0) {
            if ((Integer)this.private_[10] == (Integer)this.private_[11] - 1) {
               this.super_ = 3;

               for (int var4 = 0; var4 < 4; var4++) {
                  this.this_[0][var4] = this.this_[1][var4];
                  this.this_[1][var4] = new rjU_2(0.0, 0.0, 0.0);
               }
            }
         } else {
            this.super_ = 3;
            float var1 = -6.0F;
            byte var2 = 13;

            for (int var3 = 0; var3 < 4; var3++) {
               this.this_[0][var3] = this.this_[1][var3];
               this.this_[1][var3] = new rjU_2(
                  (double)(-6.0F + (float)((Random)this.throws_[40]).nextInt(13)) * 0.5,
                  (double)Math.max(0, ((Random)this.throws_[40]).nextInt(6) - 4),
                  (double)(-6.0F + (float)((Random)this.throws_[40]).nextInt(13)) * 0.5
               );
            }

            for (int var5 = 0; var5 < 16; var5++) {
               ((rYB)this.throws_[7]).class_(rLQ.case_, this.break_(0.5), this.Ph(), this.throws_(0.5), 0.0, 0.0, 0.0);
            }

            ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), rqn_3.Ev, this.Pr(), 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      rdn_3 var3 = this.case_(this.protected_(rhj_3.class_(this, rdy_3.OM)));
      rhm_3 var4 = rhj_3.class_(this, var3, var2);
      double var5 = var1.rx() - this.rx();
      double var7 = var1.byte_(0.3333333333333333) - var4.re();
      double var9 = var1.BO() - this.BO();
      double var11 = (double)rfU_2.class_(var5 * var5 + var9 * var9);
      var4.byte_(var5, var7 + var11 * 0.2F, var9, 1.6F, (float)(14 - ((rYB)this.throws_[7]).abstract_().class_() * 4));
      this.class_(rqn_3.JT, 1.0F, 1.0F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.throws_[7]).a_(var4);
   }

   @Override
   public rEr_1 throws_() {
      if (this.sn()) {
         return rEr_1.SPELLCASTING;
      } else {
         return this.v() ? rEr_1.BOW_AND_ARROW : rEr_1.CROSSED;
      }
   }

   public rjU_2[] throw_(float var1) {
      if (this.super_ <= 0) {
         return this.this_[1];
      } else {
         double var2 = (double)(((float)this.super_ - var1) / 3.0F);
         var2 = Math.pow(var2, 0.25);
         rjU_2[] var4 = new rjU_2[4];

         for (int var5 = 0; var5 < 4; var5++) {
            var4[var5] = this.this_[1][var5].class_(1.0 - var2).throws_(this.this_[0][var5].class_(var2));
         }

         return var4;
      }
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Ec;
   }

   @Override
   public boolean final_(an_3 var1) {
      if (super.final_(var1)) {
         return true;
      } else {
         return var1 instanceof iB_2 && ((iB_2)var1).sG() == aL_2.protected_ ? this.BG() == null && var1.BG() == null : false;
      }
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rGq_1(this));
      this.package_.class_(4, new rEe_1(this));
      this.package_.class_(5, new rEU(this));
      this.package_.class_(6, new rBa_1<>(this, 0.5, 20, 15.0F));
      this.package_.class_(8, new rBU(this, 0.6));
      this.package_.class_(9, new rBA(this, rhd_3.class, 3.0F, 1.0F));
      this.package_.class_(10, new rBA(this, is_3.class, 8.0F));
      this.int_.class_(1, new rBc_1(this, rEB.class).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true).class_(300));
      this.int_.class_(3, new rBI<>(this, rsy_3.class, false).class_(300));
      this.int_.class_(3, new rBI<>(this, rMZ.class, false).class_(300));
   }

   @Override
   public rfl_3 PE() {
      return this.rN().byte_(3.0, 0.0, 3.0);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Em;
   }

   public static iz_3 sN() {
      return rEi_1.sm().class_(iQ_2.protected_, 0.5).class_(iQ_2.break_, 18.0).class_(iQ_2.class_, 32.0);
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.Ec;
   }

   @Override
   protected void m_() {
      super.m_();
   }
}
