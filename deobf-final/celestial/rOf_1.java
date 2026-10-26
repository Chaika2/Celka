package celestial;

import java.util.function.Predicate;

public class rOf_1 extends rOp_1 {
   private static final rut_3<Integer> class_ = rmE_2.class_(rOf_1.class, ruw_3.break_);
   int break_;
   int protected_;
   static final Predicate<iB_2> super_ = var0 -> {
      if (var0 == null) {
         return false;
      } else {
         return !(var0 instanceof rhd_3) || !var0.native_() && !((rhd_3)var0).implements_() ? var0.sG() != aL_2.throws_ : false;
      }
   };

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.XP;
   }

   public rOf_1(aI_2<? extends rOf_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      if (!((rYB)this.throws_[7]).continue_ && this.BM() && this.try_()) {
         if (this.break_ > 0) {
            if (this.sx() == 0) {
               this.class_(rqn_3.ha, this.Si(), this.SN());
               this.break_(1);
            } else if (this.break_ > 40 && this.sx() == 1) {
               this.class_(rqn_3.ha, this.Si(), this.SN());
               this.break_(2);
            }

            this.break_++;
         } else if (this.sx() != 0) {
            if (this.protected_ > 60 && this.sx() == 2) {
               this.class_(rqn_3.he, this.Si(), this.SN());
               this.break_(1);
            } else if (this.protected_ > 100 && this.sx() == 1) {
               this.class_(rqn_3.he, this.Si(), this.SN());
               this.break_(0);
            }

            this.protected_++;
         }
      }

      super.this_();
   }

   private static float this_(int var0) {
      switch (var0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   private void class_(is_3 var1) {
      int var2 = this.sx();
      if (var1.break_(rye_3.byte_(this), (float)(1 + var2))) {
         var1.break_(new rLY(rLD.super_, 60 * var2, 0));
         this.class_(rqn_3.XB, 1.0F, 1.0F);
      }
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (class_.equals(var1)) {
         this.q_();
      }

      super.class_(var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("PuffState", this.sx());
   }

   @Override
   public void default_() {
      super.default_();
      if (this.BM() && this.sx() > 0) {
         for (is_3 var2 : ((rYB)this.throws_[7]).class_(is_3.class, this.rN().class_(0.3), super_)) {
            if (var2.BM()) {
               this.class_(var2);
            }
         }
      }
   }

   public void break_(int var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.break_(var1.private_("PuffState"));
   }

   @Override
   protected rdn_3 L() {
      return new rdn_3(rdy_3.Xr);
   }

   public int sx() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.hU;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(1, new rOj_1(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hi;
   }

   @Override
   protected rqA_2 sJ() {
      return rqn_3.Xr;
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return super.a_(var1).class_(this_(this.sx()));
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, 0);
   }

   @Override
   public void c_(rhd_3 var1) {
      int var2 = this.sx();
      if (var1 instanceof rhN_2 && var2 > 0 && var1.break_(rye_3.byte_(this), (float)(1 + var2))) {
         if (!this.BF()) {
            ((rhN_2)var1).class_.class_(new rZY(rZY.finally_, 0.0F));
         }

         var1.break_(new rLY(rLD.super_, 60 * var2, 0));
      }
   }
}
