package celestial;

import java.util.Random;

public abstract class rOK extends rOD {
   private static final rut_3<Boolean> try_ = rmE_2.class_(rOK.class, ruw_3.implements_);

   protected rOK(aI_2<? extends rOK> var1, rYB var2) {
      super(var1, var2);
      this.goto_ = false;
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(try_, var1);
   }

   public static iz_3 n() {
      return sq().class_(iQ_2.protected_, 0.175F).class_(iQ_2.volatile_, 0.5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("ChestedHorse", this.sJ());
      if (this.sJ()) {
         rcy_3 var2 = new rcy_3();

         for (int var3 = 2; var3 < this.synchronized_.else_(); var3++) {
            rdn_3 var4 = this.synchronized_.extends_(var3);
            if (!var4.class_()) {
               rcd_3 var5 = new rcd_3();
               var5.class_("Slot", (byte)var3);
               var4.break_(var5);
               var2.add(var5);
            }
         }

         var1.class_("Items", var2);
      }
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      if (var1 == 499) {
         if (this.sJ() && var2.class_()) {
            this.this_(false);
            this.sC();
            return true;
         }

         if (!this.sJ() && var2.break_() == xu_3.re.case_()) {
            this.this_(true);
            this.sC();
            return true;
         }
      }

      return super.class_(var1, var2);
   }

   public int sc() {
      return 5;
   }

   @Override
   protected void sd() {
      this.class_(rqn_3.PD, 1.0F, (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (!this.n_()) {
         if (this.sm() && var1.sN()) {
            this.case_(var1);
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }

         if (this.BP()) {
            return super.break_(var1, var2);
         }
      }

      if (!var3.class_()) {
         if (this.extends_(var3)) {
            return this.break_(var1, var3);
         }

         if (!this.sm()) {
            this.sI();
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }

         if (!this.sJ() && var3.break_() == xu_3.re.case_()) {
            this.this_(true);
            this.sd();
            if (!((rhx_3)var1.implements_[18]).protected_) {
               var3.catch_(1);
            }

            this.sC();
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }

         if (!this.n_() && !this.byte_() && var3.break_() == rdy_3.hK) {
            this.case_(var1);
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }
      }

      if (this.n_()) {
         return super.break_(var1, var2);
      } else {
         this.catch_(var1);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("ChestedHorse"));
      if (this.sJ()) {
         rcy_3 var2 = var1.protected_("Items", 10);
         this.sC();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.class_(var3);
            int var5 = var4.case_("Slot") & 255;
            if (var5 >= 2 && var5 < this.synchronized_.else_()) {
               this.synchronized_.break_(var5, rdn_3.class_(var4));
            }
         }
      }

      this.sl();
   }

   @Override
   protected void L() {
      this.byte_(iQ_2.class_).class_((double)this.sV());
   }

   @Override
   protected int sx() {
      return this.sJ() ? 17 : super.sx();
   }

   @Override
   public double PS() {
      return super.PS() - 0.25;
   }

   public boolean sJ() {
      return ((rmE_2)this.throws_[49]).class_(try_);
   }

   @Override
   protected void Sx() {
      super.Sx();
      if (this.sJ()) {
         if (!((rYB)this.throws_[7]).continue_) {
            this.class_(xu_3.re);
         }

         this.this_(false);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(try_, false);
   }
}
