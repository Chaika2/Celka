package celestial;

class rMC extends rSO {
   private final rMA byte_;

   public rMC(rMA var1, double var2, rkg_3 var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.byte_ = var1;
   }

   @Override
   protected boolean catch_() {
      return super.catch_() && !this.byte_.sJ();
   }
}
