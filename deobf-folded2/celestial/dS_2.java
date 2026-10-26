package celestial;

import java.util.Random;

public class dS_2 extends xd_3 {
   private final xd_3 id_volatile;

   public dS_2(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.id_volatile = var1;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      if (!this.id_class(var1.id_int(), var1.id_class())) {
         var1.id_int().id_finally().id_class(var1.id_class(), this, 60 + var1.id_int().id_long().nextInt(40));
      }

      return this.id_continue();
   }

   protected boolean id_class(rRq_1 var1, rfH_2 var2) {
      for (rpr_3 var6 : rpr_3.values()) {
         rXE var7 = var1.id_break(var2.id_break(var6));
         if (var7.id_class(rlG_2.id_break)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!this.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 60 + var4.id_long().nextInt(40));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!this.id_class(var2, var3)) {
         var2.id_class(var3, this.id_volatile.id_continue(), 2);
      }
   }
}
