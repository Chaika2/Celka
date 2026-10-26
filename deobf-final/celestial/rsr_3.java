package celestial;

public class rsr_3 extends rhV_2 {
   public rsr_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.j, var2, var4, var6, var1);
   }

   public rsr_3(rYB var1, iB_2 var2) {
      super(aI_2.j, var2, var1);
   }

   public rsr_3(aI_2<? extends rsr_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         ((rYB)this.throws_[7]).byte_(2002, this.Bs(), rAB.class_(rAS.break_));
         int var2 = 3 + ((rYB)this.throws_[7]).int_.nextInt(5) + ((rYB)this.throws_[7]).int_.nextInt(5);

         while (var2 > 0) {
            int var3 = rsP_2.class_(var2);
            var2 -= var3;
            ((rYB)this.throws_[7]).a_(new rsP_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO(), var3));
         }

         this.PD();
      }
   }

   @Override
   public float throws_() {
      return 0.07F;
   }

   @Override
   protected rdb_3 protected_() {
      return rdy_3.xe;
   }
}
