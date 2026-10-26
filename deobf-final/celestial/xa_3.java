package celestial;

class xa_3 extends rXA implements rXF {
   private final xc_3 class_;
   private final rRg_1 break_;
   private final rfH_2 byte_;
   private boolean protected_;

   public xa_3(xc_3 var1, rRg_1 var2, rfH_2 var3, rdn_3 var4) {
      super(var4);
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean class_(int var1, rdn_3 var2, rpr_3 var3) {
      return false;
   }

   @Override
   public int[] class_(rpr_3 var1) {
      return var1 == rpr_3.DOWN ? new int[]{0} : new int[0];
   }

   @Override
   public boolean break_(int var1, rdn_3 var2, rpr_3 var3) {
      return !this.protected_ && var3 == rpr_3.DOWN && var2.break_() == rdy_3.Xg;
   }

   @Override
   public void break_() {
      xU_2.byte_(this.class_, this.break_, this.byte_);
      this.protected_ = true;
   }

   @Override
   public int ab_() {
      return 1;
   }
}
