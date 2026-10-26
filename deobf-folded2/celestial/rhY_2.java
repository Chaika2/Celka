package celestial;

public class rhY_2 extends rhV_2 {
   public rhY_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.y, var2, var4, var6, var1);
   }

   public rhY_2(rYB var1, iB_2 var2) {
      super(aI_2.y, var2, var1);
   }

   public rhY_2(aI_2<? extends rhY_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      an_3 var2 = var1.id_class();
      int var3 = var2 instanceof rEO ? 3 : 0;
      var2.id_break(rye_3.id_break(this, this.id_else()), (float)var3);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 3) {
         rLx_1 var2 = this.id_catch();

         for (int var3 = 0; var3 < 8; var3++) {
            ((rYB)this.id_throws[7]).id_class(var2, this.rx(), this.re(), this.BO(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         ((rYB)this.id_throws[7]).id_class(this, (byte)3);
         this.PD();
      }
   }

   private rLx_1 id_catch() {
      rdn_3 var1 = this.id_case();
      return (rLx_1)(var1.id_class() ? rLQ.id_import : new rLk_1(rLQ.id_void, var1));
   }

   @Override
   protected rdb_3 id_protected() {
      return rdy_3.hU;
   }
}
