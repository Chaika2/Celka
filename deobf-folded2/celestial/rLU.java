package celestial;

class rLU extends rLR {
   rLU(rLo_1 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return true;
   }

   @Override
   public void id_class(iB_2 var1, int var2) {
      if (var1 instanceof rhN_2 && !var1.id_native()) {
         rhN_2 var3 = (rhN_2)var1;
         rrEm_1 var4 = var3.id_continue();
         if (var4.id_abstract() == rRO.PEACEFUL) {
            return;
         }

         if (var4.id_throw(var1.Bs())) {
            var4.k().id_class(var3);
         }
      }
   }
}
