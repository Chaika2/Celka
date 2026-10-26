package celestial;

class rLU extends rLR {
   rLU(rLo_1 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return true;
   }

   @Override
   public void class_(iB_2 var1, int var2) {
      if (var1 instanceof rhN_2 && !var1.native_()) {
         rhN_2 var3 = (rhN_2)var1;
         rrEm_1 var4 = var3.continue_();
         if (var4.abstract_() == rRO.PEACEFUL) {
            return;
         }

         if (var4.throw_(var1.Bs())) {
            var4.k().class_(var3);
         }
      }
   }
}
