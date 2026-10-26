package celestial;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Random;

public abstract class rsy_3 extends au_3 implements ae_3, rsA_2 {
   private static final rut_3<Integer> this_ = rmE_2.class_(rsy_3.class, ruw_3.break_);
   private rhd_3 else_;
   protected rdf_3 super_;
   private final rXA synchronized_ = new rXA(8);

   @Override
   public rYB byte_() {
      return (rYB)this.throws_[7];
   }

   public rsy_3(aI_2<? extends rsy_3> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.DANGER_FIRE, 16.0F);
      this.class_(rLp_1.DAMAGE_FIRE, -1.0F);
   }

   protected rqA_2 this_(boolean var1) {
      return var1 ? rqn_3.ks : rqn_3.kB;
   }

   public void this_(int var1) {
      ((rmE_2)this.throws_[49]).break_(this_, var1);
   }

   @Override
   public boolean n() {
      return this.else_ != null;
   }

   @Override
   public void class_(rdI_2 var1) {
      var1.finally_();
      this.implements_ = -this.char_();
      this.break_(var1);
      if (this.else_ instanceof rhN_2) {
         Oo_1.super_.class_((rhN_2)this.else_, this, var1.protected_());
      }
   }

   @Override
   public void class_(rdn_3 var1) {
      if (!((rYB)this.throws_[7]).continue_ && this.implements_ > -this.char_() + 20) {
         this.implements_ = -this.char_();
         this.class_(this.this_(!var1.class_()), this.Si(), this.SN());
      }
   }

   protected void class_(rLx_1 var1) {
      for (int var2 = 0; var2 < 5; var2++) {
         double var3 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var5 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var7 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         ((rYB)this.throws_[7]).class_(var1, this.break_(1.0), this.Ph() + 1.0, this.protected_(1.0), var3, var5, var7);
      }
   }

   @Override
   public an_3 class_(rrEm_1 var1) {
      this.sx();
      return super.class_(var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rdf_3 var2 = this.break_();
      if (!var2.isEmpty()) {
         var1.class_("Offers", var2.class_());
      }

      var1.class_("Inventory", this.synchronized_.byte_());
   }

   protected void class_(rdf_3 var1, rsR_2[] var2, int var3) {
      HashSet var4 = Sets.newHashSet();
      if (var2.length > var3) {
         while (var4.size() < var3) {
            var4.add(((Random)this.throws_[40]).nextInt(var2.length));
         }
      } else {
         for (int var5 = 0; var5 < var2.length; var5++) {
            var4.add(var5);
         }
      }

      for (Integer var6 : var4) {
         rsR_2 var7 = var2[var6];
         rdI_2 var8 = var7.class_(this, (Random)this.throws_[40]);
         if (var8 != null) {
            var1.add(var8);
         }
      }
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      if (super.class_(var1, var2)) {
         return true;
      } else {
         int var3 = var1 - 300;
         if (var3 >= 0 && var3 < this.synchronized_.else_()) {
            this.synchronized_.break_(var3, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public rhd_3 class_() {
      return this.else_;
   }

   @Override
   public void class_(rhd_3 var1) {
      this.else_ = var1;
   }

   @Override
   public rjU_2 class_(float var1) {
      float var2 = rfU_2.catch_(var1, (Float)this.private_[24], (Float)this.private_[23]) * (float) (Math.PI / 180.0);
      rjU_2 var3 = new rjU_2(0.0, this.rN().byte_() - 1.0, 0.2);
      return this.finally_(var1).throws_(var3.break_(-var2));
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(false);
      }

      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void class_(int var1) {
   }

   @Override
   public void class_(rdf_3 var1) {
   }

   public rXA sd() {
      return this.synchronized_;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("Offers", 10)) {
         this.super_ = new rdf_3(var1.int_("Offers"));
      }

      this.synchronized_.class_(var1.protected_("Inventory", 10));
   }

   @Override
   public void break_(rye_3 var1) {
      super.break_(var1);
      this.sx();
   }

   @Override
   public rdf_3 break_() {
      if (this.super_ == null) {
         this.super_ = new rdf_3();
         this.sk();
      }

      return this.super_;
   }

   protected abstract void break_(rdI_2 var1);

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? 0.81F : 1.62F;
   }

   @Override
   public boolean throws_() {
      return true;
   }

   public int L() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   protected void sx() {
      this.class_((rhd_3)null);
   }

   protected abstract void sk();

   @Override
   public rqA_2 case_() {
      return rqn_3.ks;
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return false;
   }

   @Override
   public int protected_() {
      return 0;
   }

   @Override
   public void sJ() {
      this.class_(rqn_3.di, this.Si(), this.SN());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(this_, 0);
   }
}
