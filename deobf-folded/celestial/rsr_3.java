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
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         ((rYB)this.id_throws[7]).id_byte(2002, this.Bs(), rAB.id_class(rAS.id_break));
         int var2 = 3 + ((rYB)this.id_throws[7]).id_int.nextInt(5) + ((rYB)this.id_throws[7]).id_int.nextInt(5);

         while (var2 > 0) {
            int var3 = rsP_2.id_class(var2);
            var2 -= var3;
            ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), var3));
         }

         this.PD();
      }
   }

   @Override
   public float id_throws() {
      return 0.07F;
   }

   @Override
   protected rdb_3 id_protected() {
      return rdy_3.xe;
   }
}
