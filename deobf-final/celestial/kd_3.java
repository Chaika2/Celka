package celestial;

public interface kd_3 extends kJ_2, kh_3 {
   @Override
   default boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return !var3.byte_(rCT.throw_) && var4 == rXG.byte_;
   }

   @Override
   default boolean class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      if (!var3.byte_(rCT.throw_) && var4.class_() == rXG.byte_) {
         if (!var1.import_()) {
            var1.class_(var2, var3.class_(rCT.throw_, Boolean.valueOf(true)), 3);
            var1.extends_().class_(var2, var4.class_(), var4.class_().class_(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default rXs_1 break_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      if (var3.byte_(rCT.throw_)) {
         var1.class_(var2, var3.class_(rCT.throw_, Boolean.valueOf(false)), 3);
         return rXG.byte_;
      } else {
         return rXG.class_;
      }
   }
}
