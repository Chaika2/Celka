package celestial;

public class UH extends eJ_2 {
   private static boolean id_class(rrEm_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      if (var2.id_class(rls_3.k)) {
         int var3 = var2.id_byte(xO_2.id_final);
         if (var3 >= 5) {
            var0.id_class((rhd_3)null, var1, rqn_3.f, rqL_2.BLOCKS, 1.0F, 1.0F);
            xO_2.id_class(var0, var1);
            ((xO_2)var2.id_break()).id_class(var0, var2, var1, (rhd_3)null, rHk_1.BEE_RELEASED);
            return true;
         }
      }

      return false;
   }

   @Override
   protected rdn_3 id_class(Uq_1 var1, rdn_3 var2) {
      rrEm_1 var3 = var1.id_catch();
      if (!var3.id_import()) {
         rfH_2 var4 = var1.id_protected().id_break(var1.id_throws().id_byte(dQ_2.id_volatile));
         this.id_class(id_class(var3, var4) || id_break(var3, var4));
         if (this.id_break() && var2.id_class(1, var3.id_long(), (rhN_2)null)) {
            var2.id_throws(0);
         }
      }

      return var2;
   }

   private static boolean id_break(rrEm_1 var0, rfH_2 var1) {
      for (iB_2 var3 : var0.id_class(iB_2.class, new rfl_3(var1), rpJ_2.id_catch)) {
         if (var3 instanceof iP_2 var4 && var4.id_class()) {
            var4.id_class(rqL_2.BLOCKS);
            return true;
         }
      }

      return false;
   }
}
