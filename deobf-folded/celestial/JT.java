package celestial;

import java.util.Optional;
import java.util.Random;

public abstract class JT extends JR implements kX_2 {
   protected JT(Jq_1 var1, rpr_3 var2, rjC_2 var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      Optional var5 = this.id_break(var1, var3, var4);
      if (var5.isPresent()) {
         xc_3 var6 = var1.id_byte((rfH_2)var5.get());
         ((Je_1)var6.id_break()).id_class(var1, var2, (rfH_2)var5.get(), var6);
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      boolean var3 = super.id_class(var1, var2);
      return var3 && var2.id_volatile().id_break() == this.id_implements().id_case() ? false : var3;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == this.id_volatile.id_case() && !var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      Je_1 var7 = this.id_implements();
      if (var2 == this.id_volatile) {
         xd_3 var8 = var3.id_break();
         if (var8 != this && var8 != var7) {
            return var7.id_class(var4);
         }
      }

      if (this.id_final) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this.id_implements());
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      Optional var5 = this.id_break(var1, var2, var3);
      return var5.isPresent() && this.id_implements().id_private(var1.id_byte(((rfH_2)var5.get()).id_break(this.id_volatile)));
   }

   @Override
   protected xd_3 id_break() {
      return this;
   }

   private Optional<rfH_2> id_break(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rfH_2 var4 = var2;

      xd_3 var5;
      do {
         var4 = var4.id_break(this.id_volatile);
         var5 = var1.id_byte(var4).id_break();
      } while (var5 == var3.id_break());

      return var5 == this.id_implements() ? Optional.of(var4) : Optional.empty();
   }
}
