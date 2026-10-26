package celestial;

public interface kd_3 extends kJ_2, kh_3 {
   @Override
   default boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return !var3.id_byte(rCT.id_throw) && var4 == rXG.id_byte;
   }

   @Override
   default boolean id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      if (!var3.id_byte(rCT.id_throw) && var4.id_class() == rXG.id_byte) {
         if (!var1.id_import()) {
            var1.id_class(var2, var3.id_class(rCT.id_throw, Boolean.valueOf(true)), 3);
            var1.id_extends().id_class(var2, var4.id_class(), var4.id_class().id_class(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default rXs_1 id_break(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      if (var3.id_byte(rCT.id_throw)) {
         var1.id_class(var2, var3.id_class(rCT.id_throw, Boolean.valueOf(false)), 3);
         return rXG.id_byte;
      } else {
         return rXG.id_class;
      }
   }
}
