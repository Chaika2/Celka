package celestial;

import java.util.Random;

public class rEL extends rEi_1 {
   private int class_;
   private boolean break_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.BI;
   }

   public rEL(aI_2<? extends rEL> var1, rYB var2) {
      super(var1, var2);
      this.finally_ = 3;
   }

   public void this_(boolean var1) {
      this.break_ = var1;
   }

   @Override
   public void this_() {
      Float var5 = (Float)this.throws_[15];
      this.private_[23] = var5;
      super.this_();
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Lifetime", this.class_);
      var1.class_("PlayerSpawned", this.break_);
   }

   @Override
   public void default_() {
      super.default_();
      if (((rYB)this.throws_[7]).continue_) {
         for (int var1 = 0; var1 < 2; var1++) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.transient_,
                  this.break_(0.5),
                  this.Ph(),
                  this.protected_(0.5),
                  (((Random)this.throws_[40]).nextDouble() - 0.5) * 2.0,
                  -((Random)this.throws_[40]).nextDouble(),
                  (((Random)this.throws_[40]).nextDouble() - 0.5) * 2.0
               );
         }
      } else {
         if (!this.O()) {
            this.class_++;
         }

         if (this.class_ >= 2400) {
            this.PD();
         }
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_ = var1.private_("Lifetime");
      this.break_ = var1.new_("PlayerSpawned");
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.Bf, 0.15F, 1.0F);
   }

   public static boolean break_(aI_2<rEL> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (byte_(var0, var1, var2, var3, var4)) {
         rhd_3 var5 = var1.class_((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 5.0, true);
         return var5 == null;
      } else {
         return false;
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.13F;
   }

   public static iz_3 throws_() {
      return rEi_1.sm().class_(iQ_2.class_, 8.0).class_(iQ_2.protected_, 0.25).class_(iQ_2.case_, 2.0);
   }

   public boolean L() {
      return this.break_;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Bt;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(2, new rBl_1(this, 1.0, false));
      this.package_.class_(3, new rSk_1(this, 1.0));
      this.package_.class_(7, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(8, new rBC(this));
      this.int_.class_(1, new rBc_1(this).class_());
      this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public void native_(float var1) {
      Float var6 = var1;
      this.throws_[15] = var6;
      super.native_(var1);
   }

   @Override
   public double Pv() {
      return 0.1;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Bw;
   }

   @Override
   public aL_2 sG() {
      return aL_2.byte_;
   }
}
