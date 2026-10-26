package celestial;

import java.util.Random;

public abstract class JR extends xd_3 {
   protected final rpr_3 id_volatile;
   protected final boolean id_final;
   protected final rjC_2 id_package;

   protected JR(Jq_1 var1, rpr_3 var2, rjC_2 var3, boolean var4) {
      super(var1);
      this.id_volatile = var2;
      this.id_package = var3;
      this.id_final = var4;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break(this.id_volatile.id_case());
      xc_3 var5 = var2.id_byte(var4);
      xd_3 var6 = var5.id_break();
      return !this.id_class(var6) ? false : var6 == this.id_implements() || var6 == this.id_break() || var5.id_protected(var2, var4, this.id_volatile);
   }

   protected boolean id_class(xd_3 var1) {
      return true;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_package;
   }

   public xc_3 id_class(rRg_1 var1) {
      return this.id_continue();
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = var1.id_int().id_byte(var1.id_class().id_break(this.id_volatile));
      return !var2.id_class(this.id_implements()) && !var2.id_class(this.id_break()) ? this.id_class(var1.id_int()) : this.id_break().id_continue();
   }

   protected abstract xd_3 id_break();

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_class(var2, var3)) {
         var2.id_break(var3, true);
      }
   }

   protected abstract Je_1 id_implements();
}
