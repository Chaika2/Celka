package celestial;

public abstract class rOl_1 extends aA_2 {
   @Override
   public int char_() {
      return 120;
   }

   @Override
   protected int byte_(rhd_3 var1) {
      return 1 + ((rYB)this.throws_[7]).int_.nextInt(3);
   }

   protected rOl_1(aI_2<? extends rOl_1> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.WATER, 0.0F);
   }

   protected void class_(int var1) {
      if (this.BM() && !this.Pa()) {
         this.throws_(var1 - 1);
         if (this.PA() == -20) {
            this.throws_(0);
            this.break_(rye_3.private_, 2.0F);
         }
      } else {
         this.throws_(300);
      }
   }

   @Override
   public boolean class_(rRR var1) {
      return var1.protected_(this);
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return false;
   }

   @Override
   public void Pn() {
      int var1 = this.PA();
      super.Pn();
      this.class_(var1);
   }

   @Override
   public aL_2 sG() {
      return aL_2.throws_;
   }

   @Override
   public boolean SO() {
      return true;
   }
}
