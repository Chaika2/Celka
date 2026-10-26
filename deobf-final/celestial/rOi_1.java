package celestial;

import java.util.Random;
import java.util.UUID;

public class rOi_1 extends rOD {
   private static final UUID try_ = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final rut_3<Integer> instanceof_ = rmE_2.class_(rOi_1.class, ruw_3.break_);

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      super.byte_(var1);
      return rqn_3.ES;
   }

   public rOi_1(aI_2<? extends rOi_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected rqA_2 sp() {
      super.sp();
      return rqn_3.se;
   }

   @Override
   protected void sl() {
      if (!((rYB)this.throws_[7]).continue_) {
         super.sl();
         this.final_(this.synchronized_.extends_(1));
         this.class_(rXQ.CHEST, 0.0F);
      }
   }

   public rdn_3 n() {
      return this.class_(rXQ.CHEST);
   }

   @Override
   protected void class_(zr_3 var1) {
      super.class_(var1);
      if (((Random)this.throws_[40]).nextInt(10) == 0) {
         this.class_(rqn_3.si, var1.class_() * 0.6F, var1.break_());
      }
   }

   @Override
   public void class_(rXu_1 var1) {
      rdn_3 var2 = this.n();
      super.class_(var1);
      rdn_3 var3 = this.n();
      if ((Integer)this.throws_[41] > 20 && this.native_(var3) && var2 != var3) {
         this.class_(rqn_3.sa, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean class_(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else {
         return !(var1 instanceof rOa_1) && !(var1 instanceof rOi_1) ? false : this.sj() && ((rOD)var1).sj();
      }
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      rOD var3;
      if (var2 instanceof rOa_1) {
         var3 = aI_2.G.class_(var1);
      } else {
         rOi_1 var4 = (rOi_1)var2;
         var3 = aI_2.float_.class_(var1);
         int var5 = ((Random)this.throws_[40]).nextInt(9);
         rOU var6;
         if (var5 < 4) {
            var6 = this.sJ();
         } else if (var5 < 8) {
            var6 = var4.sJ();
         } else {
            var6 = rqR_2.class_(rOU.values(), (Random)this.throws_[40]);
         }

         int var7 = ((Random)this.throws_[40]).nextInt(5);
         rOe_1 var8;
         if (var7 < 2) {
            var8 = this.sd();
         } else if (var7 < 4) {
            var8 = var4.sd();
         } else {
            var8 = rqR_2.class_(rOe_1.values(), (Random)this.throws_[40]);
         }

         ((rOi_1)var3).class_(var6, var8);
      }

      this.class_(var2, var3);
      return var3;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      rOU var6;
      if (var4 instanceof rhr_3) {
         var6 = ((rhr_3)var4).class_;
      } else {
         var6 = rqR_2.class_(rOU.values(), (Random)this.throws_[40]);
         var4 = new rhr_3(var6);
      }

      this.class_(var6, rqR_2.class_(rOe_1.values(), (Random)this.throws_[40]));
      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   private void class_(rOU var1, rOe_1 var2) {
      this.public_(var1.class_() & 0xFF | var2.class_() << 8 & 0xFF00);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Variant", this.sc());
      if (!this.synchronized_.extends_(1).class_()) {
         var1.class_("ArmorItem", this.synchronized_.extends_(1).break_(new rcd_3()));
      }
   }

   private int sc() {
      return ((rmE_2)this.throws_[49]).class_(instanceof_);
   }

   public rOe_1 sd() {
      return rOe_1.class_((this.sc() & 0xFF00) >> 8);
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

         ryZ_2 var4 = var3.class_(var1, this, var2);
         if (var4.class_()) {
            return var4;
         }

         if (!this.sm()) {
            this.sI();
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }

         boolean var5 = !this.n_() && !this.byte_() && var3.break_() == rdy_3.hK;
         if (this.native_(var3) || var5) {
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
      this.public_(var1.private_("Variant"));
      if (var1.byte_("ArmorItem", 10)) {
         rdn_3 var2 = rdn_3.class_(var1.int_("ArmorItem"));
         if (!var2.class_() && this.native_(var2)) {
            this.synchronized_.break_(1, var2);
         }
      }

      this.sl();
   }

   @Override
   protected void L() {
      this.byte_(iQ_2.class_).class_((double)this.sV());
      this.byte_(iQ_2.protected_).class_(this.sR());
      this.byte_(iQ_2.volatile_).class_(this.sg());
   }

   @Override
   protected rqA_2 static_() {
      super.static_();
      return rqn_3.sU;
   }

   private void public_(int var1) {
      ((rmE_2)this.throws_[49]).break_(instanceof_, var1);
   }

   private void final_(rdn_3 var1) {
      this.volatile_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         this.byte_(iQ_2.implements_).break_(try_);
         if (this.native_(var1)) {
            int var2 = ((rdP_2)var1.break_()).private_();
            if (var2 != 0) {
               this.byte_(iQ_2.implements_).break_(new ix_3(try_, "Horse armor bonus", (double)var2, id_3.ADDITION));
            }
         }
      }
   }

   private void volatile_(rdn_3 var1) {
      this.class_(rXQ.CHEST, var1);
      this.class_(rXQ.CHEST, 0.0F);
   }

   @Override
   public boolean native_(rdn_3 var1) {
      return var1.break_() instanceof rdP_2;
   }

   @Override
   protected rqA_2 Bt() {
      super.Bt();
      return rqn_3.Er;
   }

   public rOU sJ() {
      return rOU.class_(this.sc() & 0xFF);
   }

   @Override
   protected rqA_2 sy() {
      return rqn_3.EP;
   }

   @Override
   public boolean sY() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(instanceof_, 0);
   }
}
