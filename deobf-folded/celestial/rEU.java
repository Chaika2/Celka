package celestial;

class rEU extends rGt_1 {
   private int id_throws;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_throws = this.id_class.I_().V();
   }

   rEU(rED var1) {
      super(var1);
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      if (!super.id_class()) {
         return false;
      } else if (this.id_class.I_() == null) {
         return false;
      } else {
         return this.id_class.I_().V() == this.id_throws
            ? false
            : ((rYB)this.id_class.id_throws[7]).id_throws(this.id_class.Bs()).id_class((float)rRO.NORMAL.ordinal());
      }
   }

   @Override
   protected void id_finally() {
      this.id_class.I_().id_break(new rLY(rLD.id_package, 400));
   }

   @Override
   protected int id_catch() {
      return 20;
   }

   @Override
   protected rqA_2 id_extends() {
      return rqn_3.EF;
   }

   @Override
   protected int id_private() {
      return 180;
   }

   @Override
   protected rGT id_native() {
      return rGT.BLINDNESS;
   }
}
