package celestial;

import java.util.Random;

public class WW extends xd_3 {
   public static final rCN id_volatile = WQ.id_volatile;

   public WW(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_continue().id_class(id_volatile, Boolean.valueOf(false)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, Boolean.valueOf(var1.id_int().id_public(var1.id_class())));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue) {
         boolean var7 = var1.id_byte(id_volatile);
         if (var7 != var2.id_public(var3)) {
            if (var7) {
               var2.id_finally().id_class(var3, this, 4);
            } else {
               var2.id_class(var3, var1.id_class(id_volatile), 2);
            }
         }
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile) && !var2.id_public(var3)) {
         var2.id_class(var3, var1.id_class(id_volatile), 2);
      }
   }
}
