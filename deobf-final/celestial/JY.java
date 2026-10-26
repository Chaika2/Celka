package celestial;

import java.util.Random;

public abstract class JY extends xd_3 {
   protected static final rjC_2 volatile_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final rjC_2 final_ = xd_3.class_(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final rfl_3 package_ = new rfl_3(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

   @Override
   public boolean byte_(xc_3 var1) {
      return true;
   }

   protected JY(Jq_1 var1) {
      super(var1);
   }

   protected void class_(rYB var1, rfH_2 var2, xc_3 var3, int var4) {
      int var5 = this.break_(var1, var2);
      boolean var6 = var4 > 0;
      boolean var7 = var5 > 0;
      if (var4 != var5) {
         xc_3 var8 = this.class_(var3, var5);
         var1.class_(var2, var8, 2);
         this.class_(var1, var2);
         var1.class_(var2, var3, var8);
      }

      if (!var7 && var6) {
         this.break_((rRg_1)var1, var2);
      } else if (var7 && !var6) {
         this.class_((rRg_1)var1, var2);
      }

      if (var7) {
         var1.finally_().class_(new rfH_2(var2), this, this.break_());
      }
   }

   protected abstract void class_(rRg_1 var1, rfH_2 var2);

   protected void class_(rYB var1, rfH_2 var2) {
      var1.break_(var2, this);
      var1.break_(var2.break_(), this);
   }

   @Override
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return this.catch_(var1);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.catch_(var1) > 0 ? volatile_ : final_;
   }

   protected abstract xc_3 class_(xc_3 var1, int var2);

   @Override
   public boolean class_() {
      return true;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.break_();
      return byte_(var2, var4) || class_(var2, var4, rpr_3.UP);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.continue_) {
         int var5 = this.catch_(var1);
         if (var5 == 0) {
            this.class_(var2, var3, var1, var5);
         }
      }
   }

   protected int break_() {
      return 20;
   }

   protected abstract void break_(rRg_1 var1, rfH_2 var2);

   protected abstract int break_(rYB var1, rfH_2 var2);

   @Override
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var4 == rpr_3.UP ? this.catch_(var1) : 0;
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.class_(var4.break_())) {
         if (this.catch_(var1) > 0) {
            this.class_(var2, var3);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = this.catch_(var1);
      if (var5 > 0) {
         this.class_(var2, var3, var1, var5);
      }
   }

   protected abstract int catch_(xc_3 var1);

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.DESTROY;
   }
}
