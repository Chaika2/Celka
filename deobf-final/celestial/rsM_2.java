package celestial;

import java.util.List;

public class rsM_2 extends rsS_2 {
   public rsM_2(aI_2<? extends rsM_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsM_2(rYB var1, rfH_2 var2) {
      super(aI_2.strictfp_, var1, var2);
      this.new_((double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5);
      float var3 = 0.125F;
      float var4 = 0.1875F;
      float var5 = 0.25F;
      this.class_(new rfl_3(this.rx() - 0.1875, this.re() - 0.25 + 0.125, this.BO() - 0.1875, this.rx() + 0.1875, this.re() + 0.25 + 0.125, this.BO() + 0.1875));
      Boolean var10 = true;
      this.throws_[6] = var10;
   }

   @Override
   public void class_(an_3 var1) {
      this.class_(rqn_3.GE, 1.0F, 1.0F);
   }

   @Override
   public void class_(rcd_3 var1) {
   }

   @Override
   public boolean class_(double var1) {
      return var1 < 1024.0;
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      if (((rYB)this.throws_[7]).continue_) {
         return ryZ_2.SUCCESS;
      } else {
         boolean var3 = false;
         double var4 = 7.0;
         List var6 = ((rYB)this.throws_[7])
            .class_(is_3.class, new rfl_3(this.rx() - 7.0, this.re() - 7.0, this.BO() - 7.0, this.rx() + 7.0, this.re() + 7.0, this.BO() + 7.0));

         for (is_3 var8 : var6) {
            if (var8.N() == var1) {
               var8.break_(this, true);
               var3 = true;
            }
         }

         if (!var3) {
            this.PD();
            if (((rhx_3)var1.implements_[18]).protected_) {
               for (is_3 var10 : var6) {
                  if (var10.z() && var10.N() == this) {
                     var10.class_(true, false);
                  }
               }
            }
         }

         return ryZ_2.CONSUME;
      }
   }

   public static rsM_2 class_(rYB var0, rfH_2 var1) {
      int var2 = var1.b_();
      int var3 = var1.c_();
      int var4 = var1.d_();

      for (rsM_2 var6 : var0.class_(
         rsM_2.class, new rfl_3((double)var2 - 1.0, (double)var3 - 1.0, (double)var4 - 1.0, (double)var2 + 1.0, (double)var3 + 1.0, (double)var4 + 1.0)
      )) {
         if (var6.implements_().equals(var1)) {
            return var6;
         }
      }

      rsM_2 var7 = new rsM_2(var0, var1);
      var0.a_(var7);
      var7.private_();
      return var7;
   }

   @Override
   public rjU_2 class_(float var1) {
      return this.finally_(var1).break_(0.0, 0.2, 0.0);
   }

   @Override
   public void class_(rpr_3 var1) {
   }

   @Override
   protected float class_(iM_2 var1, ap_3 var2) {
      return -0.0625F;
   }

   @Override
   public void break_(rcd_3 var1) {
   }

   @Override
   public boolean throws_() {
      return ((rYB)this.throws_[7]).byte_(this.break_).break_().class_(rls_3.default_);
   }

   @Override
   public int catch_() {
      return 9;
   }

   @Override
   public int case_() {
      return 9;
   }

   @Override
   public void new_(double var1, double var3, double var5) {
      super.new_((double)rfU_2.byte_(var1) + 0.5, (double)rfU_2.byte_(var3) + 0.5, (double)rfU_2.byte_(var5) + 0.5);
   }

   @Override
   protected void protected_() {
      this.volatile_((double)this.break_.b_() + 0.5, (double)this.break_.c_() + 0.5, (double)this.break_.d_() + 0.5);
   }

   @Override
   public void private_() {
      this.class_(rqn_3.GG, 1.0F, 1.0F);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this, this.BC(), 0, this.implements_());
   }
}
