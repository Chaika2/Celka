package celestial;

class xi_3 extends rXA implements rXF {
   private final xc_3 class_;
   private final rRg_1 break_;
   private final rfH_2 byte_;
   private boolean protected_;

   public xi_3(xc_3 var1, rRg_1 var2, rfH_2 var3) {
      super(1);
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean class_(int var1, rdn_3 var2, rpr_3 var3) {
      return !this.protected_ && var3 == rpr_3.UP && xU_2.final_.containsKey(var2.break_());
   }

   @Override
   public int[] class_(rpr_3 var1) {
      return var1 == rpr_3.UP ? new int[]{0} : new int[0];
   }

   @Override
   public boolean break_(int var1, rdn_3 var2, rpr_3 var3) {
      return false;
   }

   @Override
   public void break_() {
      rdn_3 var1 = this.extends_(0);
      if (!var1.class_()) {
         this.protected_ = true;
         xc_3 var2 = xU_2.class_(this.class_, this.break_, this.byte_, var1);
         this.break_.byte_(1500, this.byte_, var2 != this.class_ ? 1 : 0);
         this.native_(0);
      }
   }

   @Override
   public int ab_() {
      return 1;
   }
}
