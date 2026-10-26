package celestial;

public abstract class rOl_1 extends aA_2 {
   @Override
   public int id_char() {
      return 120;
   }

   @Override
   protected int id_byte(rhd_3 var1) {
      return 1 + ((rYB)this.id_throws[7]).id_int.nextInt(3);
   }

   protected rOl_1(aI_2<? extends rOl_1> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.WATER, 0.0F);
   }

   protected void id_class(int var1) {
      if (this.BM() && !this.Pa()) {
         this.id_throws(var1 - 1);
         if (this.PA() == -20) {
            this.id_throws(0);
            this.id_break(rye_3.id_private, 2.0F);
         }
      } else {
         this.id_throws(300);
      }
   }

   @Override
   public boolean id_class(rRR var1) {
      return var1.id_protected(this);
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return false;
   }

   @Override
   public void Pn() {
      int var1 = this.PA();
      super.Pn();
      this.id_class(var1);
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_throws;
   }

   @Override
   public boolean SO() {
      return true;
   }
}
