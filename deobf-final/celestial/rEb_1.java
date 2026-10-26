package celestial;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public abstract class rEb_1 extends rEi_1 implements aa_3 {
   private final rBa_1<rEb_1> class_ = new rBa_1<>(this, 1.0, 20, 15.0F);
   private final rBl_1 break_ = new rEM(this, this, 1.2, false);

   protected rEb_1(aI_2<? extends rEb_1> var1, rYB var2) {
      super(var1, var2);
      this.sJ();
   }

   @Override
   protected void class_(rRh_1 var1) {
      super.class_(var1);
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.OM));
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.class_(var1, var2, var3, var4, var5);
      this.class_(var2);
      this.break_(var2);
      this.sJ();
      this.byte_(((Random)this.throws_[40]).nextFloat() < 0.55F * var2.byte_());
      if (this.class_(rXQ.HEAD).class_()) {
         LocalDate var6 = LocalDate.now();
         int var7 = var6.get(ChronoField.DAY_OF_MONTH);
         int var8 = var6.get(ChronoField.MONTH_OF_YEAR);
         if (var8 == 10 && var7 == 31 && ((Random)this.throws_[40]).nextFloat() < 0.25F) {
            this.class_(rXQ.HEAD, new rdn_3(((Random)this.throws_[40]).nextFloat() < 0.1F ? xu_3.BP : xu_3.Br));
            this.continue_[rXQ.HEAD.break_()] = 0.0F;
         }
      }

      return var4;
   }

   @Override
   public boolean class_(rkB_2 var1) {
      return var1 == rdy_3.OM;
   }

   @Override
   public void class_(rXQ var1, rdn_3 var2) {
      super.class_(var1, var2);
      if (!((rYB)this.throws_[7]).continue_) {
         this.sJ();
      }
   }

   @Override
   public void default_() {
      boolean var1 = this.F();
      if (var1) {
         rdn_3 var2 = this.class_(rXQ.HEAD);
         if (!var2.class_()) {
            if (var2.throws_()) {
               var2.break_(var2.catch_() + ((Random)this.throws_[40]).nextInt(2));
               if (var2.catch_() >= var2.private_()) {
                  this.break_(rXQ.HEAD);
                  this.class_(rXQ.HEAD, rdn_3.break_);
               }
            }

            var1 = false;
         }

         if (var1) {
            this.case_(8);
         }
      }

      super.default_();
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(this.L(), 0.15F, 1.0F);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 1.74F;
   }

   protected rhm_3 break_(rdn_3 var1, float var2) {
      return rhj_3.class_(this, var1, var2);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.sJ();
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      rdn_3 var3 = this.case_(this.protected_(rhj_3.class_(this, rdy_3.OM)));
      rhm_3 var4 = this.break_(var3, var2);
      double var5 = var1.rx() - this.rx();
      double var7 = var1.byte_(0.3333333333333333) - var4.re();
      double var9 = var1.BO() - this.BO();
      double var11 = (double)rfU_2.class_(var5 * var5 + var9 * var9);
      var4.byte_(var5, var7 + var11 * 0.2F, var9, 1.6F, (float)(14 - ((rYB)this.throws_[7]).abstract_().class_() * 4));
      this.class_(rqn_3.JT, 1.0F, 1.0F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.throws_[7]).a_(var4);
   }

   public static iz_3 throws_() {
      return rEi_1.sm().class_(iQ_2.protected_, 0.25);
   }

   abstract rqA_2 L();

   @Override
   protected void final_() {
      this.package_.class_(2, new rSB(this));
      this.package_.class_(3, new rBO(this, 1.0));
      this.package_.class_(3, new rPD<>(this, rOH.class, 6.0F, 1.0, 1.2));
      this.package_.class_(5, new rSk_1(this, 1.0));
      this.package_.class_(6, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(6, new rBC(this));
      this.int_.class_(1, new rBc_1(this));
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
      this.int_.class_(3, new rBI<>(this, rMZ.class, true));
      this.int_.class_(3, new rBI<>(this, rON.class, 10, true, false, rON.super_));
   }

   @Override
   public void A() {
      super.A();
      if (this.ra() instanceof aA_2) {
         aA_2 var1 = (aA_2)this.ra();
         Float var6 = (Float)var1.private_[23];
         this.private_[23] = var6;
      }
   }

   @Override
   public double Pv() {
      return -0.6;
   }

   @Override
   public void sJ() {
      if ((rYB)this.throws_[7] != null && !((rYB)this.throws_[7]).continue_) {
         this.package_.class_(this.break_);
         this.package_.class_(this.class_);
         rdn_3 var1 = this.protected_(rhj_3.class_(this, rdy_3.OM));
         if (var1.break_() == rdy_3.OM) {
            byte var2 = 20;
            if (((rYB)this.throws_[7]).abstract_() != rRO.HARD) {
               var2 = 40;
            }

            this.class_.class_(var2);
            this.package_.class_(4, this.class_);
         } else {
            this.package_.class_(4, this.break_);
         }
      }
   }

   @Override
   public aL_2 sG() {
      return aL_2.break_;
   }
}
