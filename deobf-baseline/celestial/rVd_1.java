package celestial;

enum rVd_1 {
   rVd_1(xd_3... var3) {
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var3.id_class(var1.id_break())
         && var2.id_final().id_protected()
         && var1.id_byte(xt_3.id_package) == rCt_1.SINGLE
         && var3.id_byte(xt_3.id_package) == rCt_1.SINGLE) {
         rpr_3 var7 = var1.id_byte(xt_3.id_final);
         if (var2.id_final() != var7.id_final() && var7 == var3.id_byte(xt_3.id_final)) {
            rCt_1 var8 = var2 == var7.id_catch() ? rCt_1.LEFT : rCt_1.RIGHT;
            var4.id_class(var6, var3.id_class(xt_3.id_package, var8.id_break()), 18);
            if (var7 == rpr_3.NORTH || var7 == rpr_3.EAST) {
               ryO_2 var9 = var4.id_class(var5);
               ryO_2 var10 = var4.id_class(var6);
               if (var9 instanceof rHu_1 && var10 instanceof rHu_1) {
                  rHu_1.id_class((rHu_1)var9, (rHu_1)var10);
               }
            }

            return var1.id_class(xt_3.id_package, var8);
         }
      }

      return var1;
   }
}
