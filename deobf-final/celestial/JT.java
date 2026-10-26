package celestial;

import java.util.Optional;
import java.util.Random;

public abstract class JT extends JR implements kX_2 {
   protected JT(Jq_1 var1, rpr_3 var2, rjC_2 var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      Optional var5 = this.break_(var1, var3, var4);
      if (var5.isPresent()) {
         xc_3 var6 = var1.byte_((rfH_2)var5.get());
         ((Je_1)var6.break_()).class_(var1, var2, (rfH_2)var5.get(), var6);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rxx_3 var2) {
      boolean var3 = super.class_(var1, var2);
      return var3 && var2.volatile_().break_() == this.implements_().case_() ? false : var3;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == this.volatile_.case_() && !var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      Je_1 var7 = this.implements_();
      if (var2 == this.volatile_) {
         xd_3 var8 = var3.break_();
         if (var8 != this && var8 != var7) {
            return var7.class_(var4);
         }
      }

      if (this.final_) {
         var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this.implements_());
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      Optional var5 = this.break_(var1, var2, var3);
      return var5.isPresent() && this.implements_().private_(var1.byte_(((rfH_2)var5.get()).break_(this.volatile_)));
   }

   @Override
   protected xd_3 break_() {
      return this;
   }

   private Optional<rfH_2> break_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rfH_2 var4 = var2;

      xd_3 var5;
      do {
         var4 = var4.break_(this.volatile_);
         var5 = var1.byte_(var4).break_();
      } while (var5 == var3.break_());

      return var5 == this.implements_() ? Optional.of(var4) : Optional.empty();
   }
}
