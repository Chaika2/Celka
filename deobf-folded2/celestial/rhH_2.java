package celestial;

public class rhH_2 extends rhv_3 {
   public int id_catch = 1;

   public rhH_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.id_const, var2, var3, var5, var7, var1);
   }

   public rhH_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.id_const, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhH_2(aI_2<? extends rhH_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("ExplosionPower", this.id_catch);
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         an_3 var2 = var1.id_class();
         an_3 var3 = this.id_else();
         var2.id_break(rye_3.id_class((rhv_3)this, var3), 6.0F);
         if (var3 instanceof iB_2) {
            this.id_class((iB_2)var3, var2);
         }
      }
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         boolean var2 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break);
         ((rYB)this.id_throws[7]).id_class((an_3)null, this.rx(), this.re(), this.BO(), (float)this.id_catch, var2, var2 ? rRz_1.DESTROY : rRz_1.NONE);
         this.PD();
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("ExplosionPower", 99)) {
         this.id_catch = var1.id_private("ExplosionPower");
      }
   }
}
